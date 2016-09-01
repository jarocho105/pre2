





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
//import com.bydan.erp.seguridad.service.ejb.interfaces.PerfilAdditionableHome;
//import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.logic.QueryWhereSelectParameters;
//import com.bydan.framework.erp.business.logic.*;

//import java.util.ArrayList;

import java.io.File;
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
public class ImportacionJInternalFrame extends JInternalFrameBase//PerfilBeanSwingJInternalFrame
{
private static final long serialVersionUID = 1L;
	//CONTROL_INICIO
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
    protected JPanel jPanelImportacion;
    public JScrollPane jScrollPanelImportacion;
    protected GridBagConstraints gridBagConstraints;	
    
    public JLabel jLabelArchivoImportacion;	
	public JLabel jLabelPathArchivoImportacion;
	protected JTextField jTextFieldPathArchivoImportacion;
	
	protected JButton jButtonAbrirImportacion;
	protected JButton jButtonGenerarImportacion;
	protected JButton jButtonCerrarImportacion;
	protected JFileChooser jFileChooserImportacion;
	protected File fileImportacion;
	
	private String sClassWebTitulo="";
	
	public  ImportacionJInternalFrame(String sClassWebTitulo,JInternalFrameBase jInternalFrameParentParametro) throws Exception
	{
		super();
		try 
		{			
			this.sClassWebTitulo=sClassWebTitulo;
			//this.setjInternalFrameParent(jInternalFrameParent);
			
			this.cargarImportacion(jInternalFrameParentParametro);		
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	public  ImportacionJInternalFrame() throws Exception
	{
		super();
		try 
		{			
			
			this.cargarImportacion(null);		
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	public void cargarImportacion(JInternalFrameBase jInternalFrameParentParametro) throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacion.setName("jPanelImportacion"); 
		
		this.jPanelImportacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacion.setLayout(gridaBagLayoutImportacion);
		
		
		//this= new ImportacionJInternalFrame();
		//this= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporte= new JScrollPane();
		
		//JINTERNAL FRAME
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.setjInternalFrameParent(jInternalFrameParentParametro);
		
		this.setTitle("IMPORTACION");
	    this.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.setResizable(true);
	    this.setClosable(true);
	    this.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    //this.setjInternalFrameParent(this);
		
		this.setTitle("IMPORTACION");
	    this.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.setResizable(true);
	    this.setClosable(true);
	    this.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacion = new JLabelMe();

		this.jLabelArchivoImportacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraints.gridy = iPosYImportacion;		
		this.gridBagConstraints.gridx = iPosXImportacion++;
			
		this.jPanelImportacion.add(this.jLabelArchivoImportacion, this.gridBagConstraints);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacion = new JFileChooser();		
		this.jFileChooserImportacion.setToolTipText("ESCOGER ARCHIVO"+" "+sClassWebTitulo);
		
		this.jButtonAbrirImportacion = new JButtonMe();
		this.jButtonAbrirImportacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacion.setToolTipText("Generar"+" "+sClassWebTitulo);
	
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYImportacion;
		this.gridBagConstraints.gridx = iPosXImportacion++;
							
		this.jPanelImportacion.add(this.jButtonAbrirImportacion, this.gridBagConstraints);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacion = new JLabelMe();

		this.jLabelPathArchivoImportacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraints.gridy = iPosYImportacion;		
		this.gridBagConstraints.gridx = iPosXImportacion++;
			
		this.jPanelImportacion.add(this.jLabelPathArchivoImportacion, this.gridBagConstraints);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYImportacion;
		this.gridBagConstraints.gridx = iPosXImportacion++;
							
		this.jPanelImportacion.add(this.jTextFieldPathArchivoImportacion, this.gridBagConstraints);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacion = new JButtonMe();
		this.jButtonGenerarImportacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacion.setToolTipText("Generar"+" "+sClassWebTitulo);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYImportacion;
		this.gridBagConstraints.gridx = iPosXImportacion++;
							
		this.jPanelImportacion.add(this.jButtonGenerarImportacion, this.gridBagConstraints);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacion = new JButtonMe();
		this.jButtonCerrarImportacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacion.setToolTipText("Cancelar"+" "+sClassWebTitulo);
		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYImportacion;
		this.gridBagConstraints.gridx = iPosXImportacion++;
							
		this.jPanelImportacion.add(this.jButtonCerrarImportacion, this.gridBagConstraints);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipal = new GridBagLayout();
		
		this.jScrollPanelImportacion= new JScrollPane(jPanelImportacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy =iPosYImportacion;
		this.gridBagConstraints.gridx =iPosXImportacion;
		this.gridBagConstraints.fill = GridBagConstraints.BOTH;		
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.getContentPane().setLayout(gridaBagLayoutImportacionPrincipal);
		this.getContentPane().add(this.jScrollPanelImportacion, this.gridBagConstraints);				
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
		ReporteDinamicoJInternalFrame.openFrameCount = openFrameCount;
	}

	public JPanel getjPanelImportacion() {
		return jPanelImportacion;
	}

	public void setjPanelImportacion(JPanel jPanelImportacion) {
		this.jPanelImportacion = jPanelImportacion;
	}

	public JScrollPane getjScrollPanelImportacion() {
		return jScrollPanelImportacion;
	}

	public void setjScrollPanelImportacion(JScrollPane jScrollPanelImportacion) {
		this.jScrollPanelImportacion = jScrollPanelImportacion;
	}

	public GridBagConstraints getGridBagConstraints() {
		return gridBagConstraints;
	}

	public void setGridBagConstraints(GridBagConstraints gridBagConstraints) {
		this.gridBagConstraints = gridBagConstraints;
	}

	public JLabel getjLabelArchivoImportacion() {
		return jLabelArchivoImportacion;
	}

	public void setjLabelArchivoImportacion(JLabel jLabelArchivoImportacion) {
		this.jLabelArchivoImportacion = jLabelArchivoImportacion;
	}

	public JLabel getjLabelPathArchivoImportacion() {
		return jLabelPathArchivoImportacion;
	}

	public void setjLabelPathArchivoImportacion(JLabel jLabelPathArchivoImportacion) {
		this.jLabelPathArchivoImportacion = jLabelPathArchivoImportacion;
	}

	public JTextField getjTextFieldPathArchivoImportacion() {
		return jTextFieldPathArchivoImportacion;
	}

	public void setjTextFieldPathArchivoImportacion(
			JTextField jTextFieldPathArchivoImportacion) {
		this.jTextFieldPathArchivoImportacion = jTextFieldPathArchivoImportacion;
	}

	public JButton getjButtonAbrirImportacion() {
		return jButtonAbrirImportacion;
	}

	public void setjButtonAbrirImportacion(JButton jButtonAbrirImportacion) {
		this.jButtonAbrirImportacion = jButtonAbrirImportacion;
	}

	public JButton getjButtonGenerarImportacion() {
		return jButtonGenerarImportacion;
	}

	public void setjButtonGenerarImportacion(JButton jButtonGenerarImportacion) {
		this.jButtonGenerarImportacion = jButtonGenerarImportacion;
	}

	public JButton getjButtonCerrarImportacion() {
		return jButtonCerrarImportacion;
	}

	public void setjButtonCerrarImportacion(JButton jButtonCerrarImportacion) {
		this.jButtonCerrarImportacion = jButtonCerrarImportacion;
	}

	public JFileChooser getjFileChooserImportacion() {
		return jFileChooserImportacion;
	}

	public void setjFileChooserImportacion(JFileChooser jFileChooserImportacion) {
		this.jFileChooserImportacion = jFileChooserImportacion;
	}

	public File getFileImportacion() {
		return fileImportacion;
	}

	public void setFileImportacion(File fileImportacion) {
		this.fileImportacion = fileImportacion;
	}

	public String getsClassWebTitulo() {
		return sClassWebTitulo;
	}

	public void setsClassWebTitulo(String sClassWebTitulo) {
		this.sClassWebTitulo = sClassWebTitulo;
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