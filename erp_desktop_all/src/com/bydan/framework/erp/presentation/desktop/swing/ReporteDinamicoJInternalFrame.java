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
import com.bydan.erp.seguridad.util.TipoVisualConstantesFunciones;
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
import java.io.File;

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
import com.bydan.framework.erp.business.entity.Reporte;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

@SuppressWarnings("unused")
public class ReporteDinamicoJInternalFrame extends JInternalFrameBase {
	private static final long serialVersionUID = 1L;
	
	private Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
   
    protected JPanel jPanelReporteDinamico;
    public JScrollPane jScrollPanelReporteDinamico;
    
    protected GridBagConstraints gridBagConstraints;
    
    public JLabel jLabelColumnasSelectReporte;
	public JList<Reporte> jListColumnasSelectReporte;
	public JScrollPane jScrollColumnasSelectReporte;
	
	public JLabel jLabelRelacionesSelectReporte;
	public JList<Reporte> jListRelacionesSelectReporte;
	public JScrollPane jScrollRelacionesSelectReporte;
	
	public JLabel jLabelConGraficoDinamico;
	protected JCheckBox jCheckBoxConGraficoDinamico;
	
	public JLabel jLabelGenerarExcelReporteDinamico;
	public JLabel jLabelTiposArchivoReporteDinamico;
	
	protected JButton jButtonGenerarReporteDinamico;
	protected JButton jButtonCerrarReporteDinamico;
	protected JButton jButtonGenerarExcelReporteDinamico;	
	
	
	public JLabel jLabelColumnaCategoriaGrafico;	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxColumnaCategoriaGrafico;
	
	public JLabel jLabelColumnaCategoriaValor;	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxColumnaCategoriaValor;
	
	public JLabel jLabelColumnasValoresGrafico;
	public JList<Reporte> jListColumnasValoresGrafico;
	public JScrollPane jScrollColumnasValoresGrafico;
	
	public JLabel jLabelTiposGraficosReportesDinamico;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposGraficosReportesDinamico;
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposReportesDinamico;
	
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDinamico;
	
	String sTamanioGeneral="";
	
	public  ReporteDinamicoJInternalFrame() throws Exception {
		super();
		try {			
			
					
		} catch(Exception e) {
			throw e;
		}
    }
	
    public  ReporteDinamicoJInternalFrame(String sTamanioGeneral,JInternalFrameBase jInternalFrameParentParametro) throws Exception {
		super();
		try {			
			this.sTamanioGeneral=sTamanioGeneral;
			this.cargarReporteDinamico(jInternalFrameParentParametro);
					
		} catch(Exception e) {
			throw e;
		}
    }
    
    public void cargarReporteDinamico(JInternalFrameBase jInternalFrameParentParametro) throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoVisual = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamico.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamico.setName("jPanelReporteDinamico"); 
		
		this.jPanelReporteDinamico.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamico.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamico.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamico.setLayout(gridaBagLayoutReporteDinamicoTipoVisual);
		
		
		//this.jInternalFrameReporteDinamicoTipoVisual= new ReporteDinamicoJInternalFrame();
		
		this.jScrollPanelReporteDinamico = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporte= new JScrollPane();
		
		//JINTERNAL FRAME
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.setjInternalFrameParent(jInternalFrameParentParametro);
		
		this.setTitle("REPORTE DINAMICO");
	    this.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.setResizable(true);
	    this.setClosable(true);
	    this.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamico.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamico.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamico.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Visuals"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporte = new JLabelMe();

		this.jLabelColumnasSelectReporte.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;		
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamico.add(this.jLabelColumnasSelectReporte, this.gridBagConstraints);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporte = new JList<Reporte>();
		this.jListColumnasSelectReporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporte.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporte.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporte.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporte=new JScrollPane(this.jListColumnasSelectReporte);
			
			this.jScrollColumnasSelectReporte.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporte.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporte.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporte.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;		
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamico.add(this.jListColumnasSelectReporte, this.gridBagConstraints);
		this.jPanelReporteDinamico.add(this.jScrollColumnasSelectReporte, this.gridBagConstraints);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporte = new JLabelMe();

		this.jLabelRelacionesSelectReporte.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporte = new JList<Reporte>();
		this.jListRelacionesSelectReporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporte.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporte.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporte.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporte=new JScrollPane(this.jListRelacionesSelectReporte);
			
			this.jScrollRelacionesSelectReporte.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporte.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporte.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporte.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamico = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGrafico = new JComboBoxMe();
		this.jListColumnasValoresGrafico = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamico = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamico.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamico.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamico.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamico.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamico, sTamanioGeneral,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamico = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamico.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamico.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamico.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamico.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamico, sTamanioGeneral,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamico = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamico.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;		
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamico.add(this.jLabelGenerarExcelReporteDinamico, this.gridBagConstraints);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamico = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamico.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamico,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamico.setToolTipText("Generar EXCEL"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraints = new GridBagConstraints();
		//this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraints.gridy = iPosYReporteDinamico;
		//this.gridBagConstraints.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamico.add(this.jButtonGenerarExcelReporteDinamico, this.gridBagConstraints);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamico.add(this.jComboBoxTiposReportesDinamico, this.gridBagConstraints);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamico = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamico.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;		
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamico.add(this.jLabelTiposArchivoReporteDinamico, this.gridBagConstraints);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamico.add(this.jComboBoxTiposArchivosReportesDinamico, this.gridBagConstraints);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamico = new JButtonMe();
		this.jButtonGenerarReporteDinamico.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamico,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamico.setToolTipText("Generar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamico.add(this.jButtonGenerarReporteDinamico, this.gridBagConstraints);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamico = new JButtonMe();
		this.jButtonCerrarReporteDinamico.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamico,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamico.setToolTipText("Cancelar"+" "+TipoVisualConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraints.gridy = iPosYReporteDinamico;
		this.gridBagConstraints.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamico.add(this.jButtonCerrarReporteDinamico, this.gridBagConstraints);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoVisual = new GridBagLayout();
		
		this.jScrollPanelReporteDinamico= new JScrollPane(jPanelReporteDinamico,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamico.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamico.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamico.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Visuals"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraints = new GridBagConstraints();
		this.gridBagConstraints.gridy =iPosYReporteDinamico;
		this.gridBagConstraints.gridx =iPosXReporteDinamico;
		this.gridBagConstraints.fill = GridBagConstraints.BOTH;		
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoVisual);
		this.getContentPane().add(this.jScrollPanelReporteDinamico, this.gridBagConstraints);				
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

	public JPanel getjPanelReporteDinamico() {
		return jPanelReporteDinamico;
	}

	public void setjPanelReporteDinamico(JPanel jPanelReporteDinamico) {
		this.jPanelReporteDinamico = jPanelReporteDinamico;
	}

	public JScrollPane getjScrollPanelReporteDinamico() {
		return jScrollPanelReporteDinamico;
	}

	public void setjScrollPanelReporteDinamico(
			JScrollPane jScrollPanelReporteDinamico) {
		this.jScrollPanelReporteDinamico = jScrollPanelReporteDinamico;
	}

	public GridBagConstraints getGridBagConstraints() {
		return gridBagConstraints;
	}

	public void setGridBagConstraints(GridBagConstraints gridBagConstraints) {
		this.gridBagConstraints = gridBagConstraints;
	}

	public JLabel getjLabelColumnasSelectReporte() {
		return jLabelColumnasSelectReporte;
	}

	public void setjLabelColumnasSelectReporte(JLabel jLabelColumnasSelectReporte) {
		this.jLabelColumnasSelectReporte = jLabelColumnasSelectReporte;
	}

	public JList<Reporte> getjListColumnasSelectReporte() {
		return jListColumnasSelectReporte;
	}

	public void setjListColumnasSelectReporte(
			JList<Reporte> jListColumnasSelectReporte) {
		this.jListColumnasSelectReporte = jListColumnasSelectReporte;
	}

	public JScrollPane getjScrollColumnasSelectReporte() {
		return jScrollColumnasSelectReporte;
	}

	public void setjScrollColumnasSelectReporte(
			JScrollPane jScrollColumnasSelectReporte) {
		this.jScrollColumnasSelectReporte = jScrollColumnasSelectReporte;
	}

	public JLabel getjLabelRelacionesSelectReporte() {
		return jLabelRelacionesSelectReporte;
	}

	public void setjLabelRelacionesSelectReporte(
			JLabel jLabelRelacionesSelectReporte) {
		this.jLabelRelacionesSelectReporte = jLabelRelacionesSelectReporte;
	}

	public JList<Reporte> getjListRelacionesSelectReporte() {
		return jListRelacionesSelectReporte;
	}

	public void setjListRelacionesSelectReporte(
			JList<Reporte> jListRelacionesSelectReporte) {
		this.jListRelacionesSelectReporte = jListRelacionesSelectReporte;
	}

	public JScrollPane getjScrollRelacionesSelectReporte() {
		return jScrollRelacionesSelectReporte;
	}

	public void setjScrollRelacionesSelectReporte(
			JScrollPane jScrollRelacionesSelectReporte) {
		this.jScrollRelacionesSelectReporte = jScrollRelacionesSelectReporte;
	}

	public JLabel getjLabelConGraficoDinamico() {
		return jLabelConGraficoDinamico;
	}

	public void setjLabelConGraficoDinamico(JLabel jLabelConGraficoDinamico) {
		this.jLabelConGraficoDinamico = jLabelConGraficoDinamico;
	}

	public JCheckBox getjCheckBoxConGraficoDinamico() {
		return jCheckBoxConGraficoDinamico;
	}

	public void setjCheckBoxConGraficoDinamico(JCheckBox jCheckBoxConGraficoDinamico) {
		this.jCheckBoxConGraficoDinamico = jCheckBoxConGraficoDinamico;
	}

	public JLabel getjLabelGenerarExcelReporteDinamico() {
		return jLabelGenerarExcelReporteDinamico;
	}

	public void setjLabelGenerarExcelReporteDinamico(
			JLabel jLabelGenerarExcelReporteDinamico) {
		this.jLabelGenerarExcelReporteDinamico = jLabelGenerarExcelReporteDinamico;
	}

	public JLabel getjLabelTiposArchivoReporteDinamico() {
		return jLabelTiposArchivoReporteDinamico;
	}

	public void setjLabelTiposArchivoReporteDinamico(
			JLabel jLabelTiposArchivoReporteDinamico) {
		this.jLabelTiposArchivoReporteDinamico = jLabelTiposArchivoReporteDinamico;
	}

	public JButton getjButtonGenerarReporteDinamico() {
		return jButtonGenerarReporteDinamico;
	}

	public void setjButtonGenerarReporteDinamico(
			JButton jButtonGenerarReporteDinamico) {
		this.jButtonGenerarReporteDinamico = jButtonGenerarReporteDinamico;
	}

	public JButton getjButtonCerrarReporteDinamico() {
		return jButtonCerrarReporteDinamico;
	}

	public void setjButtonCerrarReporteDinamico(JButton jButtonCerrarReporteDinamico) {
		this.jButtonCerrarReporteDinamico = jButtonCerrarReporteDinamico;
	}

	public JButton getjButtonGenerarExcelReporteDinamico() {
		return jButtonGenerarExcelReporteDinamico;
	}

	public void setjButtonGenerarExcelReporteDinamico(
			JButton jButtonGenerarExcelReporteDinamico) {
		this.jButtonGenerarExcelReporteDinamico = jButtonGenerarExcelReporteDinamico;
	}

	public JLabel getjLabelColumnaCategoriaGrafico() {
		return jLabelColumnaCategoriaGrafico;
	}

	public void setjLabelColumnaCategoriaGrafico(
			JLabel jLabelColumnaCategoriaGrafico) {
		this.jLabelColumnaCategoriaGrafico = jLabelColumnaCategoriaGrafico;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxColumnaCategoriaGrafico() {
		return jComboBoxColumnaCategoriaGrafico;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxColumnaCategoriaGrafico(
			JComboBox jComboBoxColumnaCategoriaGrafico) {
		this.jComboBoxColumnaCategoriaGrafico = jComboBoxColumnaCategoriaGrafico;
	}

	public JLabel getjLabelColumnaCategoriaValor() {
		return jLabelColumnaCategoriaValor;
	}

	public void setjLabelColumnaCategoriaValor(JLabel jLabelColumnaCategoriaValor) {
		this.jLabelColumnaCategoriaValor = jLabelColumnaCategoriaValor;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxColumnaCategoriaValor() {
		return jComboBoxColumnaCategoriaValor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxColumnaCategoriaValor(
			JComboBox jComboBoxColumnaCategoriaValor) {
		this.jComboBoxColumnaCategoriaValor = jComboBoxColumnaCategoriaValor;
	}

	public JLabel getjLabelColumnasValoresGrafico() {
		return jLabelColumnasValoresGrafico;
	}

	public void setjLabelColumnasValoresGrafico(JLabel jLabelColumnasValoresGrafico) {
		this.jLabelColumnasValoresGrafico = jLabelColumnasValoresGrafico;
	}

	public JList<Reporte> getjListColumnasValoresGrafico() {
		return jListColumnasValoresGrafico;
	}

	public void setjListColumnasValoresGrafico(
			JList<Reporte> jListColumnasValoresGrafico) {
		this.jListColumnasValoresGrafico = jListColumnasValoresGrafico;
	}

	public JScrollPane getjScrollColumnasValoresGrafico() {
		return jScrollColumnasValoresGrafico;
	}

	public void setjScrollColumnasValoresGrafico(
			JScrollPane jScrollColumnasValoresGrafico) {
		this.jScrollColumnasValoresGrafico = jScrollColumnasValoresGrafico;
	}

	public JLabel getjLabelTiposGraficosReportesDinamico() {
		return jLabelTiposGraficosReportesDinamico;
	}

	public void setjLabelTiposGraficosReportesDinamico(
			JLabel jLabelTiposGraficosReportesDinamico) {
		this.jLabelTiposGraficosReportesDinamico = jLabelTiposGraficosReportesDinamico;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDinamico() {
		return jComboBoxTiposGraficosReportesDinamico;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDinamico(
			JComboBox jComboBoxTiposGraficosReportesDinamico) {
		this.jComboBoxTiposGraficosReportesDinamico = jComboBoxTiposGraficosReportesDinamico;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDinamico() {
		return jComboBoxTiposReportesDinamico;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDinamico(
			JComboBox jComboBoxTiposReportesDinamico) {
		this.jComboBoxTiposReportesDinamico = jComboBoxTiposReportesDinamico;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDinamico() {
		return jComboBoxTiposArchivosReportesDinamico;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDinamico(
			JComboBox jComboBoxTiposArchivosReportesDinamico) {
		this.jComboBoxTiposArchivosReportesDinamico = jComboBoxTiposArchivosReportesDinamico;
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