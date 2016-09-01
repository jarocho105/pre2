





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

import com.bydan.erp.contabilidad.util.DetalleAsientoContableConstantesFunciones;
//import com.bydan.erp.seguridad.business.logic.*;
//import com.bydan.erp.seguridad.service.ejb.interfaces.PerfilAdditionable;
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
public class TotalesJInternalFrame extends JInternalFrameBase//PerfilBeanSwingJInternalFrame
{
private static final long serialVersionUID = 1L;
	
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
    protected JButton jButtonAbrirTotales;    
    protected JPanel jPanelTotales;
	public JScrollPane jScrollPanelTotales;
	protected JButton jButtonCerrarTotales;
	
    protected GridBagConstraints gridBagConstraints;
    public JScrollPane jScrollPanelDatosTotales;
    public JTable jTableDatosTotales;
    
    String sTamanioGeneral="";
    
	public  TotalesJInternalFrame() throws Exception
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
	
	public  TotalesJInternalFrame(JButton jButtonAbrirTotales,String sTamanioGeneral,JInternalFrameBase jInternalFrameParentParametro) throws Exception
	{
		super();
		try 
		{			
			this.jButtonAbrirTotales=jButtonAbrirTotales;
			this.sTamanioGeneral=sTamanioGeneral;
			
			this.cargarTotales(jInternalFrameParentParametro);
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	public void cargarTotales(JInternalFrameBase jInternalFrameParentParametro) throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jTableDatosTotales = new JTableMe();        
		this.jTableDatosTotales.setAutoCreateRowSorter(true);
		
		FuncionesSwing.setBoldTable(jTableDatosTotales,sTamanioGeneral,false,true,this);
		
		
		this.jScrollPanelDatosTotales = new JScrollPane();
		this.jScrollPanelDatosTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		this.jScrollPanelDatosTotales.setViewportView(this.jTableDatosTotales);
		
		this.jTableDatosTotales.setFillsViewportHeight(true);
		this.jTableDatosTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		//this.jButtonAbrirTotales = new JButtonMe();
		
		
		if(!this.jButtonAbrirTotales.getText().equals("Totales")) {
			this.jButtonAbrirTotales.setText("Totales");
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotales,"orden_button","Totales");
			FuncionesSwing.setBoldButton(this.jButtonAbrirTotales, sTamanioGeneral,false,true,this);;
		}
		
		
		GridBagLayout gridaBagLayoutTotalesDetalleAsientoContable = new GridBagLayout();
				
		//PANEL
		this.jPanelTotales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotales.setName("jPanelTotales"); 
		
		this.jPanelTotales.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotales.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotales.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotales, sTamanioGeneral,false,true,this);;
		
		this.jPanelTotales.setLayout(gridaBagLayoutTotalesDetalleAsientoContable);
		
		
		//this= new TotalesJInternalFrame();
		
		this.jScrollPanelTotales = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleAsientoContable= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.setjInternalFrameParent(jInternalFrameParentParametro);
		
		this.setTitle("Totales");
	    this.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.setResizable(true);
	    this.setClosable(true);
	    this.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotales.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotales.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotales.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotales, sTamanioGeneral,false,true,this);;
		
		this.jScrollPanelTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contables"));			
					
		//DATOS TOTALES
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy =iPosYTotales++;
		this.gridBagConstraints.gridx =iPosXTotales;
		this.gridBagConstraints.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraints.ipady =150;
		
		this.jPanelTotales.add(jScrollPanelDatosTotales/*this.jTableDatosDetalleAsientoContableTotales*/, this.gridBagConstraints);				
		
		//BOTON CERRAR
		this.jButtonCerrarTotales = new JButtonMe();
		this.jButtonCerrarTotales.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotales,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotales, sTamanioGeneral,false,true,this);;
		
		this.jButtonCerrarTotales.setToolTipText("Cancelar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYTotales++;
		this.gridBagConstraints.gridx = iPosXTotales;
							
		this.jPanelTotales.add(this.jButtonCerrarTotales, this.gridBagConstraints);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDetalleAsientoContable = new GridBagLayout();
		
		this.jScrollPanelTotales= new JScrollPane(jPanelTotales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy =iPosYTotales;
		this.gridBagConstraints.gridx =iPosXTotales;
		this.gridBagConstraints.fill = GridBagConstraints.BOTH;		
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDetalleAsientoContable);
		this.getContentPane().add(this.jScrollPanelTotales, this.gridBagConstraints);
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
		TotalesJInternalFrame.openFrameCount = openFrameCount;
	}

	public JButton getjButtonAbrirTotales() {
		return jButtonAbrirTotales;
	}

	public void setjButtonAbrirTotales(JButton jButtonAbrirTotales) {
		this.jButtonAbrirTotales = jButtonAbrirTotales;
	}

	public JPanel getjPanelTotales() {
		return jPanelTotales;
	}

	public void setjPanelTotales(JPanel jPanelTotales) {
		this.jPanelTotales = jPanelTotales;
	}

	public JScrollPane getjScrollPanelTotales() {
		return jScrollPanelTotales;
	}

	public void setjScrollPanelTotales(JScrollPane jScrollPanelTotales) {
		this.jScrollPanelTotales = jScrollPanelTotales;
	}

	public JButton getjButtonCerrarTotales() {
		return jButtonCerrarTotales;
	}

	public void setjButtonCerrarTotales(JButton jButtonCerrarTotales) {
		this.jButtonCerrarTotales = jButtonCerrarTotales;
	}

	public GridBagConstraints getGridBagConstraints() {
		return gridBagConstraints;
	}

	public void setGridBagConstraints(GridBagConstraints gridBagConstraints) {
		this.gridBagConstraints = gridBagConstraints;
	}

	public JScrollPane getjScrollPanelDatosTotales() {
		return jScrollPanelDatosTotales;
	}

	public void setjScrollPanelDatosTotales(JScrollPane jScrollPanelDatosTotales) {
		this.jScrollPanelDatosTotales = jScrollPanelDatosTotales;
	}

	public JTable getjTableDatosTotales() {
		return jTableDatosTotales;
	}

	public void setjTableDatosTotales(JTable jTableDatosTotales) {
		this.jTableDatosTotales = jTableDatosTotales;
	}

	public String getsTamanioGeneral() {
		return sTamanioGeneral;
	}

	public void setsTamanioGeneral(String sTamanioGeneral) {
		this.sTamanioGeneral = sTamanioGeneral;
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