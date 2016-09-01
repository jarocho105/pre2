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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report;




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

//import com.bydan.erp.tesoreria.util.ConciliacionesBancariasConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.ConciliacionesBancariasParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.ConciliacionesBancariasParameterGeneral;

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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.ConciliacionesBancariasBeanSwingJInternalFrame;
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
import com.bydan.erp.tesoreria.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.tesoreria.util.*;

import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;






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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.ConciliacionesBancariasJInternalFrame;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.ConciliacionesBancariasDetalleFormJInternalFrame;

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
import com.bydan.erp.contabilidad.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ConciliacionesBancariasModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ConciliacionesBancariasConstantesFunciones.LABEL_ID
										,ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR
										,ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA
										,ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA
										,ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL
										,ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL
										,ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO
										,ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN
										,ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN
										,ConciliacionesBancariasConstantesFunciones.LABEL_FECHA
										,ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE
										,ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO
										};
	   
	    public List<ConciliacionesBancarias> conciliacionesbancariass;
	  	 
	    //NO SE UTILIZA
	    public ConciliacionesBancariasModel(List<ConciliacionesBancarias> conciliacionesbancariass,JInternalFrameBase jInternalFrameBase) {
	    	this.conciliacionesbancariass=conciliacionesbancariass;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ConciliacionesBancariasModel(JInternalFrameBase jInternalFrameBase) {
	    	this.conciliacionesbancariass=new ArrayList<ConciliacionesBancarias>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.conciliacionesbancariass.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.conciliacionesbancariass.get(rowIndex).getIsSelected();
	            
				case 1: return this.conciliacionesbancariass.get(rowIndex).getId();
				case 2: return this.conciliacionesbancariass.get(rowIndex).getnumero_mayor();
				case 3: return this.conciliacionesbancariass.get(rowIndex).getcodigo_cuenta();
				case 4: return this.conciliacionesbancariass.get(rowIndex).getnombre_cuenta();
				case 5: return this.conciliacionesbancariass.get(rowIndex).getdebito_local();
				case 6: return this.conciliacionesbancariass.get(rowIndex).getcredito_local();
				case 7: return this.conciliacionesbancariass.get(rowIndex).getnumero_deposito();
				case 8: return this.conciliacionesbancariass.get(rowIndex).getdebito_extran();
				case 9: return this.conciliacionesbancariass.get(rowIndex).getcredito_extran();
				case 10: return this.conciliacionesbancariass.get(rowIndex).getfecha();
				case 11: return this.conciliacionesbancariass.get(rowIndex).getdetalle();
				case 12: return this.conciliacionesbancariass.get(rowIndex).getbeneficiario();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return String.class;
				case 3: return String.class;
				case 4: return String.class;
				case 5: return Double.class;
				case 6: return Double.class;
				case 7: return String.class;
				case 8: return Double.class;
				case 9: return Double.class;
				case 10: return Date.class;
				case 11: return String.class;
				case 12: return String.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ConciliacionesBancarias conciliacionesbancarias = this.conciliacionesbancariass.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ConciliacionesBancariasBeanSwingJInternalFrame conciliacionesbancariasBeanSwingJInternalFrame=(ConciliacionesBancariasBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {conciliacionesbancarias.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {conciliacionesbancarias.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {conciliacionesbancarias.setnumero_mayor((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {conciliacionesbancarias.setcodigo_cuenta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {conciliacionesbancarias.setnombre_cuenta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {conciliacionesbancarias.setdebito_local((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {conciliacionesbancarias.setcredito_local((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {conciliacionesbancarias.setnumero_deposito((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {conciliacionesbancarias.setdebito_extran((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {conciliacionesbancarias.setcredito_extran((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {conciliacionesbancarias.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {conciliacionesbancarias.setdetalle((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {conciliacionesbancarias.setbeneficiario((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ConciliacionesBancariasModel(JInternalFrameBase jInternalFrameBase) {
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
		private ConciliacionesBancariasDetalleFormJInternalFrame conciliacionesbancariasJInternalFrame=null;
		
		public ConciliacionesBancariasModel(ConciliacionesBancariasDetalleFormJInternalFrame conciliacionesbancariasJInternalFrame) {
			this.conciliacionesbancariasJInternalFrame=conciliacionesbancariasJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.conciliacionesbancariasJInternalFrame.getjButtonActualizarToolBarConciliacionesBancarias();
			
			if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.getjButtonActualizarToolBarConciliacionesBancarias())) {
				componentTab=this.conciliacionesbancariasJInternalFrame.getjButtonEliminarToolBarConciliacionesBancarias();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.getjButtonEliminarToolBarConciliacionesBancarias())) {
				componentTab=this.conciliacionesbancariasJInternalFrame.getjButtonCancelarToolBarConciliacionesBancarias();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.getjButtonCancelarToolBarConciliacionesBancarias())) {
				componentTab=this.conciliacionesbancariasJInternalFrame.jComboBoxid_empresaConciliacionesBancarias;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextAreabeneficiarioConciliacionesBancarias)) {
				componentTab=this.conciliacionesbancariasJInternalFrame.jComboBoxTiposAccionesFormularioConciliacionesBancarias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jComboBoxTiposAccionesFormularioConciliacionesBancarias)) {
				componentTab=this.conciliacionesbancariasJInternalFrame.jButtonEliminarConciliacionesBancarias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jButtonEliminarConciliacionesBancarias)) {
				componentTab=this.conciliacionesbancariasJInternalFrame.jButtonActualizarConciliacionesBancarias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jButtonActualizarConciliacionesBancarias)) {
				componentTab=this.conciliacionesbancariasJInternalFrame.jButtonCancelarConciliacionesBancarias;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jComboBoxid_empresaConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jComboBoxid_cuenta_contableConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jComboBoxid_cuenta_contableConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jDateChooserfecha_desdeConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jDateChooserfecha_desdeConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jDateChooserfecha_hastaConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jDateChooserfecha_hastaConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextAreanumero_mayorConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextAreanumero_mayorConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextFieldcodigo_cuentaConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextFieldcodigo_cuentaConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextAreanombre_cuentaConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextAreanombre_cuentaConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextFielddebito_localConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextFielddebito_localConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextFieldcredito_localConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextFieldcredito_localConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextFieldnumero_depositoConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextFieldnumero_depositoConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextFielddebito_extranConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextFielddebito_extranConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextFieldcredito_extranConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextFieldcredito_extranConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jDateChooserfechaConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jDateChooserfechaConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextAreadetalleConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextAreadetalleConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextAreabeneficiarioConciliacionesBancarias;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.conciliacionesbancariasJInternalFrame.getjButtonActualizarToolBarConciliacionesBancarias();
			
			if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.getjButtonEliminarToolBarConciliacionesBancarias())) {
				componentTab=this.conciliacionesbancariasJInternalFrame.getjButtonActualizarToolBarConciliacionesBancarias();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.getjButtonCancelarToolBarConciliacionesBancarias())) {
				componentTab=this.conciliacionesbancariasJInternalFrame.getjButtonEliminarToolBarConciliacionesBancarias();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jComboBoxid_empresaConciliacionesBancarias)) {
				
				componentTab=this.conciliacionesbancariasJInternalFrame.getjButtonCancelarToolBarConciliacionesBancarias();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jComboBoxTiposAccionesFormularioConciliacionesBancarias)) {
				componentTab=this.conciliacionesbancariasJInternalFrame.jTextAreabeneficiarioConciliacionesBancarias;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jButtonEliminarConciliacionesBancarias)) {
				componentTab=this.conciliacionesbancariasJInternalFrame.jComboBoxTiposAccionesFormularioConciliacionesBancarias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jButtonActualizarConciliacionesBancarias)) {
				componentTab=this.conciliacionesbancariasJInternalFrame.jButtonEliminarConciliacionesBancarias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jButtonCancelarConciliacionesBancarias)) {
				componentTab=this.conciliacionesbancariasJInternalFrame.jButtonActualizarConciliacionesBancarias;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jComboBoxid_cuenta_contableConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jComboBoxid_empresaConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jDateChooserfecha_desdeConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jComboBoxid_cuenta_contableConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jDateChooserfecha_hastaConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jDateChooserfecha_desdeConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextAreanumero_mayorConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jDateChooserfecha_hastaConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextFieldcodigo_cuentaConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextAreanumero_mayorConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextAreanombre_cuentaConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextFieldcodigo_cuentaConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextFielddebito_localConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextAreanombre_cuentaConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextFieldcredito_localConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextFielddebito_localConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextFieldnumero_depositoConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextFieldcredito_localConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextFielddebito_extranConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextFieldnumero_depositoConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextFieldcredito_extranConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextFielddebito_extranConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jDateChooserfechaConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextFieldcredito_extranConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextAreadetalleConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jDateChooserfechaConciliacionesBancarias;
			return componentTab;
		}

		if(component!=null && component.equals(this.conciliacionesbancariasJInternalFrame.jTextAreabeneficiarioConciliacionesBancarias)) {
			componentTab=this.conciliacionesbancariasJInternalFrame.jTextAreadetalleConciliacionesBancarias;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.conciliacionesbancariasJInternalFrame.getjButtonActualizarToolBarConciliacionesBancarias();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.conciliacionesbancariasJInternalFrame.getjButtonActualizarToolBarConciliacionesBancarias();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.conciliacionesbancariasJInternalFrame.getjButtonCancelarToolBarConciliacionesBancarias();
			
			
			return componentTab;		
		}
		
		public ConciliacionesBancariasDetalleFormJInternalFrame getconciliacionesbancariasJInternalFrame() {
			return this.conciliacionesbancariasJInternalFrame;
		}
		
		public void setconciliacionesbancariasJInternalFrame(ConciliacionesBancariasDetalleFormJInternalFrame conciliacionesbancariasJInternalFrame) {
			this.conciliacionesbancariasJInternalFrame=conciliacionesbancariasJInternalFrame;
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
