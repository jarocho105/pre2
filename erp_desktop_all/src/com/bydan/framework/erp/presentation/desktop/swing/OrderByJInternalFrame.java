





/*
*ADVERTENCIA : Este programa esta protegido por la ley de derechos de autor.
*La reproducci?n o distribuci?n il?cita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y ser?n objeto de todas las sanciones legales que correspondan.
*/
package com.bydan.framework.erp.presentation.desktop.swing;

/*
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;

import com.bydan.erp.seguridad.util.PerfilConstantesFunciones;
import com.bydan.erp.seguridad.business.entity.Perfil;
*/

import com.bydan.framework.erp.util.*;

//import com.bydan.erp.seguridad.business.logic.*;
//import com.bydan.erp.seguridad.service.ejb.interfaces.PerfilAdditionable;
import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
//import com.bydan.erp.seguridad.service.ejb.interfaces.PerfilAdditionableHome;
//import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.logic.QueryWhereSelectParameters;
//import com.bydan.framework.erp.business.logic.*;

//import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;

//import org.hibernate.collection.PersistentBag;

import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.MutableTreeNode;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;


import com.bydan.framework.erp.business.entity.DatoGeneral;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class OrderByJInternalFrame extends JInternalFrameBase//PerfilBeanSwingJInternalFrame
{
private static final long serialVersionUID = 1L;
	//CONTROL_INICIO
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
    GridBagLayout gridaBagLayoutOrderBy = new GridBagLayout();
    GridBagLayout gridaBagLayoutOrderByPrincipal = new GridBagLayout();
    protected JPanel jPanelOrderBy;
    public JTable jTableDatosOrderBy;
    public JScrollPane jScrollPanelDatosOrderBy;		
    protected GridBagConstraints gridBagConstraints;
    protected JButton jButtonCerrarOrderBy;
    protected JButton jButtonAbrirOrderBy;
    
    String sTamanioGeneral="";
    Boolean cargaMinima=false;
    
	public  OrderByJInternalFrame() throws Exception
	{
		super();
		try 
		{			
			
					
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	public  OrderByJInternalFrame(String sTamanioGeneral,JButton jButtonAbrirOrderBy,Boolean cargaMinima,JInternalFrameBase jInternalFrameParentParametro) throws Exception
	{
		super();
		try 
		{			
			this.sTamanioGeneral=sTamanioGeneral;
			this.jButtonAbrirOrderBy=jButtonAbrirOrderBy;
			this.cargaMinima=cargaMinima;
			
			this.cargarOrderBySistema(cargaMinima,jInternalFrameParentParametro);
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 
	
	public void cargarOrderBySistema(Boolean cargaMinima,JInternalFrameBase jInternalFrameParentParametro) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//300;350;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			//this.jButtonAbrirOrderBy = new JButtonMe();
			if(!this.jButtonAbrirOrderBy.getText().equals("Orden")) {
				this.jButtonAbrirOrderBy.setText("Orden");
				this.jButtonAbrirOrderBy.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
				
				FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBy,"orden_button","Orden");
				
				FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBy, sTamanioGeneral,false,true,this);;
				
				sMapKey = "AbrirOrderBySistema";
				inputMap = this.jButtonAbrirOrderBy.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
				inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
					
				this.jButtonAbrirOrderBy.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
			}
		
			
					
			//PANEL
			this.jPanelOrderBy = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBy.setName("jPanelOrderBy"); 
			
			this.jPanelOrderBy.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBy.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBy.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBy, sTamanioGeneral,false,true,this);;
			
			gridaBagLayoutOrderBy = new GridBagLayout();
			this.jPanelOrderBy.setLayout(gridaBagLayoutOrderBy);
			
			
			this.jTableDatosOrderBy = new JTableMe();        
			this.jTableDatosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosOrderBy,sTamanioGeneral,false,true,this);
		
			
			this.jScrollPanelDatosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosOrderBy.setViewportView(this.jTableDatosOrderBy);
			this.jTableDatosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			//this.jInternalFrameOrderBySistema= new OrderByJInternalFrame();
			//this.jInternalFrameOrderBySistema= new OrderByJInternalFrame();
			//this.jScrollPanelDatosOrderBy = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSistema= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.setjInternalFrameParent(jInternalFrameParentParametro);
			
			this.setTitle("Orden");
			this.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySistema, sTamanioGeneral,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelDatosOrderBy.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy - 50));//+0;-50;
			this.jScrollPanelDatosOrderBy.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy - 50));//+0;-50;
			this.jScrollPanelDatosOrderBy.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy - 50));//+0;-50;
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosOrderBy, sTamanioGeneral,false,true,this);;
			
			this.jScrollPanelDatosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sistemas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraints = new GridBagConstraints();
			this.gridBagConstraints.gridy =iPosYOrderBy++;
			this.gridBagConstraints.gridx =iPosXOrderBy;
			this.gridBagConstraints.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraints.ipady =150;
				
			this.jPanelOrderBy.add(jScrollPanelDatosOrderBy, this.gridBagConstraints);//this.jTableDatosSistemaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBy = new JButtonMe();
			this.jButtonCerrarOrderBy.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBy,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBy.setToolTipText("Cancelar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBy, sTamanioGeneral,false,true,this);;
			
			this.gridBagConstraints = new GridBagConstraints();
			this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraints.gridy = iPosYOrderBy++;
			this.gridBagConstraints.gridx = iPosXOrderBy;
									
			this.jPanelOrderBy.add(this.jButtonCerrarOrderBy, this.gridBagConstraints);
						
						
			//GLOBAL AGREGAR PANELES			
			gridaBagLayoutOrderByPrincipal = new GridBagLayout();
			
			this.jScrollPanelDatosOrderBy= new JScrollPane(jPanelOrderBy,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraints = new GridBagConstraints();
			this.gridBagConstraints.gridy =iPosYOrderBy;
			this.gridBagConstraints.gridx =iPosXOrderBy;
			this.gridBagConstraints.fill = GridBagConstraints.BOTH;		
			
			this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.getContentPane().setLayout(gridaBagLayoutOrderByPrincipal);
			
			this.getContentPane().add(this.jScrollPanelDatosOrderBy, this.gridBagConstraints);			
		
		} else {
			this.jButtonAbrirOrderBy = new JButtonMe();
		}				
	}

	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}

	public static int getOpenFrameCount() {
		return openFrameCount;
	}

	public static void setOpenFrameCount(int openFrameCount) {
		OrderByJInternalFrame.openFrameCount = openFrameCount;
	}

	public GridBagLayout getGridaBagLayoutOrderBy() {
		return gridaBagLayoutOrderBy;
	}

	public void setGridaBagLayoutOrderBy(GridBagLayout gridaBagLayoutOrderBy) {
		this.gridaBagLayoutOrderBy = gridaBagLayoutOrderBy;
	}

	public GridBagLayout getGridaBagLayoutOrderByPrincipal() {
		return gridaBagLayoutOrderByPrincipal;
	}

	public void setGridaBagLayoutOrderByPrincipal(
			GridBagLayout gridaBagLayoutOrderByPrincipal) {
		this.gridaBagLayoutOrderByPrincipal = gridaBagLayoutOrderByPrincipal;
	}

	public JPanel getjPanelOrderBy() {
		return jPanelOrderBy;
	}

	public void setjPanelOrderBy(JPanel jPanelOrderBy) {
		this.jPanelOrderBy = jPanelOrderBy;
	}

	public JTable getjTableDatosOrderBy() {
		return jTableDatosOrderBy;
	}

	public void setjTableDatosOrderBy(JTable jTableDatosOrderBy) {
		this.jTableDatosOrderBy = jTableDatosOrderBy;
	}

	public JScrollPane getjScrollPanelDatosOrderBy() {
		return jScrollPanelDatosOrderBy;
	}

	public void setjScrollPanelDatosOrderBy(JScrollPane jScrollPanelDatosOrderBy) {
		this.jScrollPanelDatosOrderBy = jScrollPanelDatosOrderBy;
	}

	public GridBagConstraints getGridBagConstraints() {
		return gridBagConstraints;
	}

	public void setGridBagConstraints(GridBagConstraints gridBagConstraints) {
		this.gridBagConstraints = gridBagConstraints;
	}

	public JButton getjButtonCerrarOrderBy() {
		return jButtonCerrarOrderBy;
	}

	public void setjButtonCerrarOrderBy(JButton jButtonCerrarOrderBy) {
		this.jButtonCerrarOrderBy = jButtonCerrarOrderBy;
	}

	public JButton getjButtonAbrirOrderBy() {
		return jButtonAbrirOrderBy;
	}

	public void setjButtonAbrirOrderBy(JButton jButtonAbrirOrderBy) {
		this.jButtonAbrirOrderBy = jButtonAbrirOrderBy;
	}

	public String getsTamanioGeneral() {
		return sTamanioGeneral;
	}

	public void setsTamanioGeneral(String sTamanioGeneral) {
		this.sTamanioGeneral = sTamanioGeneral;
	}

	public Boolean getCargaMinima() {
		return cargaMinima;
	}

	public void setCargaMinima(Boolean cargaMinima) {
		this.cargaMinima = cargaMinima;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static int getXoffset() {
		return xOffset;
	}

	public static int getYoffset() {
		return yOffset;
	}
	
	
}