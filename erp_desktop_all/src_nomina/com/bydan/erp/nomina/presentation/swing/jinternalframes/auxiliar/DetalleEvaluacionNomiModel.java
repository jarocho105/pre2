/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

//import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.nomina.util.DetalleEvaluacionNomiConstantesFunciones;
import com.bydan.erp.nomina.util.DetalleEvaluacionNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.DetalleEvaluacionNomiParameterGeneral;

import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.DetalleEvaluacionNomiBeanSwingJInternalFrame;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;






import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.DetalleEvaluacionNomiJInternalFrame;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.DetalleEvaluacionNomiDetalleFormJInternalFrame;

import java.util.EventObject;
import java.util.EventListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;



import com.bydan.erp.seguridad.business.entity.*;


import com.bydan.erp.seguridad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetalleEvaluacionNomiModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_ID
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9
										,DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10
										};
	   
	    public List<DetalleEvaluacionNomi> detalleevaluacionnomis;
	  	 
	    //NO SE UTILIZA
	    public DetalleEvaluacionNomiModel(List<DetalleEvaluacionNomi> detalleevaluacionnomis,JInternalFrameBase jInternalFrameBase) {
	    	this.detalleevaluacionnomis=detalleevaluacionnomis;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleEvaluacionNomiModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detalleevaluacionnomis=new ArrayList<DetalleEvaluacionNomi>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detalleevaluacionnomis.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detalleevaluacionnomis.get(rowIndex).getIsSelected();
	            
				case 1: return this.detalleevaluacionnomis.get(rowIndex).getId();
				case 2: return this.detalleevaluacionnomis.get(rowIndex).getid_empresa();
				case 3: return this.detalleevaluacionnomis.get(rowIndex).getid_evaluacion_nomi();
				case 4: return this.detalleevaluacionnomis.get(rowIndex).getid_formato_nomi();
				case 5: return this.detalleevaluacionnomis.get(rowIndex).getid_pregunta_nomi();
				case 6: return this.detalleevaluacionnomis.get(rowIndex).getrespuesta();
				case 7: return this.detalleevaluacionnomis.get(rowIndex).getrespuesta_valor();
				case 8: return this.detalleevaluacionnomis.get(rowIndex).getcalifica1();
				case 9: return this.detalleevaluacionnomis.get(rowIndex).getcalifica2();
				case 10: return this.detalleevaluacionnomis.get(rowIndex).getcalifica3();
				case 11: return this.detalleevaluacionnomis.get(rowIndex).getcalifica4();
				case 12: return this.detalleevaluacionnomis.get(rowIndex).getcalifica5();
				case 13: return this.detalleevaluacionnomis.get(rowIndex).getcalifica6();
				case 14: return this.detalleevaluacionnomis.get(rowIndex).getcalifica7();
				case 15: return this.detalleevaluacionnomis.get(rowIndex).getcalifica8();
				case 16: return this.detalleevaluacionnomis.get(rowIndex).getcalifica9();
				case 17: return this.detalleevaluacionnomis.get(rowIndex).getcalifica10();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return Long.class;
				case 4: return Long.class;
				case 5: return Long.class;
				case 6: return String.class;
				case 7: return Double.class;
				case 8: return Boolean.class;
				case 9: return Boolean.class;
				case 10: return Boolean.class;
				case 11: return Boolean.class;
				case 12: return Boolean.class;
				case 13: return Boolean.class;
				case 14: return Boolean.class;
				case 15: return Boolean.class;
				case 16: return Boolean.class;
				case 17: return Boolean.class;	            
	            default: return String.class;
	        }	    		        
	    }
	 
	    @Override
	    public boolean isCellEditable(int rowIndex, int columnIndex) {
	    	switch (columnIndex) {
				case 0: return true;
            	
				case 1: return true;
				case 2: return true;
				case 3: return true;
				case 4: return true;
				case 5: return true;
				case 6: return true;
				case 7: return true;
				case 8: return true;
				case 9: return true;
				case 10: return true;
				case 11: return true;
				case 12: return true;
				case 13: return true;
				case 14: return true;
				case 15: return true;
				case 16: return true;
				case 17: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetalleEvaluacionNomi detalleevaluacionnomi = this.detalleevaluacionnomis.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleEvaluacionNomiBeanSwingJInternalFrame detalleevaluacionnomiBeanSwingJInternalFrame=(DetalleEvaluacionNomiBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detalleevaluacionnomi.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detalleevaluacionnomi.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detalleevaluacionnomi.setid_empresa((Long) value);detalleevaluacionnomi.setempresa_descripcion(detalleevaluacionnomiBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detalleevaluacionnomi.setid_evaluacion_nomi((Long) value);detalleevaluacionnomi.setevaluacionnomi_descripcion(detalleevaluacionnomiBeanSwingJInternalFrame.getActualEvaluacionNomiForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detalleevaluacionnomi.setid_formato_nomi((Long) value);detalleevaluacionnomi.setformatonomi_descripcion(detalleevaluacionnomiBeanSwingJInternalFrame.getActualFormatoNomiForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detalleevaluacionnomi.setid_pregunta_nomi((Long) value);detalleevaluacionnomi.setpreguntanomi_descripcion(detalleevaluacionnomiBeanSwingJInternalFrame.getActualPreguntaNomiForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detalleevaluacionnomi.setrespuesta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detalleevaluacionnomi.setrespuesta_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detalleevaluacionnomi.setcalifica1((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detalleevaluacionnomi.setcalifica2((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detalleevaluacionnomi.setcalifica3((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detalleevaluacionnomi.setcalifica4((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detalleevaluacionnomi.setcalifica5((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detalleevaluacionnomi.setcalifica6((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detalleevaluacionnomi.setcalifica7((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detalleevaluacionnomi.setcalifica8((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detalleevaluacionnomi.setcalifica9((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detalleevaluacionnomi.setcalifica10((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleEvaluacionNomiModel(JInternalFrameBase jInternalFrameBase) {
			this.jInternalFrameBase=jInternalFrameBase;
		}
		*/
		
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			try {
				this.jInternalFrameBase.procesoActualizarFilaTotales();
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER FIN
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private DetalleEvaluacionNomiDetalleFormJInternalFrame detalleevaluacionnomiJInternalFrame=null;
		
		public DetalleEvaluacionNomiModel(DetalleEvaluacionNomiDetalleFormJInternalFrame detalleevaluacionnomiJInternalFrame) {
			this.detalleevaluacionnomiJInternalFrame=detalleevaluacionnomiJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleevaluacionnomiJInternalFrame.getjButtonActualizarToolBarDetalleEvaluacionNomi();
			
			if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.getjButtonActualizarToolBarDetalleEvaluacionNomi())) {
				componentTab=this.detalleevaluacionnomiJInternalFrame.getjButtonEliminarToolBarDetalleEvaluacionNomi();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.getjButtonEliminarToolBarDetalleEvaluacionNomi())) {
				componentTab=this.detalleevaluacionnomiJInternalFrame.getjButtonCancelarToolBarDetalleEvaluacionNomi();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.getjButtonCancelarToolBarDetalleEvaluacionNomi())) {
				componentTab=this.detalleevaluacionnomiJInternalFrame.jComboBoxid_empresaDetalleEvaluacionNomi;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica10DetalleEvaluacionNomi)) {
				componentTab=this.detalleevaluacionnomiJInternalFrame.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi)) {
				componentTab=this.detalleevaluacionnomiJInternalFrame.jButtonEliminarDetalleEvaluacionNomi;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jButtonEliminarDetalleEvaluacionNomi)) {
				componentTab=this.detalleevaluacionnomiJInternalFrame.jButtonActualizarDetalleEvaluacionNomi;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jButtonActualizarDetalleEvaluacionNomi)) {
				componentTab=this.detalleevaluacionnomiJInternalFrame.jButtonCancelarDetalleEvaluacionNomi;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jComboBoxid_empresaDetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jComboBoxid_formato_nomiDetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jComboBoxid_formato_nomiDetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jTextArearespuestaDetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jTextArearespuestaDetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jTextFieldrespuesta_valorDetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jTextFieldrespuesta_valorDetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica1DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica1DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica2DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica2DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica3DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica3DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica4DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica4DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica5DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica5DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica6DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica6DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica7DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica7DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica8DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica8DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica9DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica9DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica10DetalleEvaluacionNomi;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleevaluacionnomiJInternalFrame.getjButtonActualizarToolBarDetalleEvaluacionNomi();
			
			if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.getjButtonEliminarToolBarDetalleEvaluacionNomi())) {
				componentTab=this.detalleevaluacionnomiJInternalFrame.getjButtonActualizarToolBarDetalleEvaluacionNomi();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.getjButtonCancelarToolBarDetalleEvaluacionNomi())) {
				componentTab=this.detalleevaluacionnomiJInternalFrame.getjButtonEliminarToolBarDetalleEvaluacionNomi();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jComboBoxid_empresaDetalleEvaluacionNomi)) {
				
				componentTab=this.detalleevaluacionnomiJInternalFrame.getjButtonCancelarToolBarDetalleEvaluacionNomi();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi)) {
				componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica10DetalleEvaluacionNomi;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jButtonEliminarDetalleEvaluacionNomi)) {
				componentTab=this.detalleevaluacionnomiJInternalFrame.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jButtonActualizarDetalleEvaluacionNomi)) {
				componentTab=this.detalleevaluacionnomiJInternalFrame.jButtonEliminarDetalleEvaluacionNomi;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jButtonCancelarDetalleEvaluacionNomi)) {
				componentTab=this.detalleevaluacionnomiJInternalFrame.jButtonActualizarDetalleEvaluacionNomi;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jComboBoxid_empresaDetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jComboBoxid_formato_nomiDetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jComboBoxid_formato_nomiDetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jTextArearespuestaDetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jComboBoxid_pregunta_nomiDetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jTextFieldrespuesta_valorDetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jTextArearespuestaDetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica1DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jTextFieldrespuesta_valorDetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica2DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica1DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica3DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica2DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica4DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica3DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica5DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica4DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica6DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica5DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica7DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica6DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica8DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica7DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica9DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica8DetalleEvaluacionNomi;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica10DetalleEvaluacionNomi)) {
			componentTab=this.detalleevaluacionnomiJInternalFrame.jCheckBoxcalifica9DetalleEvaluacionNomi;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleevaluacionnomiJInternalFrame.getjButtonActualizarToolBarDetalleEvaluacionNomi();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleevaluacionnomiJInternalFrame.getjButtonActualizarToolBarDetalleEvaluacionNomi();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleevaluacionnomiJInternalFrame.getjButtonCancelarToolBarDetalleEvaluacionNomi();
			
			
			return componentTab;		
		}
		
		public DetalleEvaluacionNomiDetalleFormJInternalFrame getdetalleevaluacionnomiJInternalFrame() {
			return this.detalleevaluacionnomiJInternalFrame;
		}
		
		public void setdetalleevaluacionnomiJInternalFrame(DetalleEvaluacionNomiDetalleFormJInternalFrame detalleevaluacionnomiJInternalFrame) {
			this.detalleevaluacionnomiJInternalFrame=detalleevaluacionnomiJInternalFrame;
		}
		
		public Component getComponentTab() {
			return this.componentTab;
		}
		
		public void setComponentTab(Component componentTab) {
			this.componentTab=componentTab;
		}
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY FIN*/
		
		
		/*FUNCIONES PARA AbstractTableModel*/
		/*
		Notas:
		* Si Cambia version se copia variables y metodos que no son sobreescritos en esta clase.(Usa Jdk 8)
		* Se copia del Jdk javax.swing.table.AbstractTableModel
		* Los argumentos usados es de tipo Interface TableModel no de Clase AbstractTableModel
		* Si se cambia y/o actualiza jdj, toca actualizar el código nuevamente
		*/
		
		protected EventListenerList listenerList = new EventListenerList();

		public int findColumn(String columnName) {
			for (int i = 0; i < getColumnCount(); i++) {
				if (columnName.equals(getColumnName(i))) {
					return i;
				}
			}
			return -1;
		}
		
		public void addTableModelListener(TableModelListener l) {
        	listenerList.add(TableModelListener.class, l);
    	}
		
		public void removeTableModelListener(TableModelListener l) {
        	listenerList.remove(TableModelListener.class, l);
    	}
		
		public TableModelListener[] getTableModelListeners() {
			return listenerList.getListeners(TableModelListener.class);
		}
		
		public void fireTableDataChanged() {
			fireTableChanged(new TableModelEvent(this));
		}
		
		public void fireTableStructureChanged() {
        	fireTableChanged(new TableModelEvent(this, TableModelEvent.HEADER_ROW));
    	}
		
		public void fireTableRowsInserted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT));
		}
	
		public void fireTableRowsUpdated(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE));
		}
		
		public void fireTableRowsDeleted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE));
		}
	
		public void fireTableCellUpdated(int row, int column) {
			fireTableChanged(new TableModelEvent(this, row, row, column));
		}
		
		public void fireTableChanged(TableModelEvent e) {
			// Guaranteed to return a non-null array
			Object[] listeners = listenerList.getListenerList();
			// Process the listeners last to first, notifying
			// those that are interested in this event
			for (int i = listeners.length-2; i>=0; i-=2) {
				if (listeners[i]==TableModelListener.class) {
					((TableModelListener)listeners[i+1]).tableChanged(e);
				}
			}
		}
		
		public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
			return listenerList.getListeners(listenerType);
		}
		/*FUNCIONES PARA AbstractTableModel FIN*/
}
