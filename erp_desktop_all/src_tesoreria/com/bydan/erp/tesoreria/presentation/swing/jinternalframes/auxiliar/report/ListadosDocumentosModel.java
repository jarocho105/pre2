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

//import com.bydan.erp.tesoreria.util.ListadosDocumentosConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.ListadosDocumentosParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.ListadosDocumentosParameterGeneral;

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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.ListadosDocumentosBeanSwingJInternalFrame;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.ListadosDocumentosJInternalFrame;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.ListadosDocumentosDetalleFormJInternalFrame;

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

public class ListadosDocumentosModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ListadosDocumentosConstantesFunciones.LABEL_ID
										,ListadosDocumentosConstantesFunciones.LABEL_FECHA
										,ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO
										,ListadosDocumentosConstantesFunciones.LABEL_CODIGO
										,ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO
										,ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE
										,ListadosDocumentosConstantesFunciones.LABEL_DETALLE
										,ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE
										,ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA
										,ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA
										,ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA
										,ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL
										,ListadosDocumentosConstantesFunciones.LABEL_VALOR
										,ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR
										,ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION
										,ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION
										,ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO
										,ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE
										};
	   
	    public List<ListadosDocumentos> listadosdocumentoss;
	  	 
	    //NO SE UTILIZA
	    public ListadosDocumentosModel(List<ListadosDocumentos> listadosdocumentoss,JInternalFrameBase jInternalFrameBase) {
	    	this.listadosdocumentoss=listadosdocumentoss;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ListadosDocumentosModel(JInternalFrameBase jInternalFrameBase) {
	    	this.listadosdocumentoss=new ArrayList<ListadosDocumentos>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.listadosdocumentoss.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.listadosdocumentoss.get(rowIndex).getIsSelected();
	            
				case 1: return this.listadosdocumentoss.get(rowIndex).getId();
				case 2: return this.listadosdocumentoss.get(rowIndex).getfecha();
				case 3: return this.listadosdocumentoss.get(rowIndex).gettipo_movimiento();
				case 4: return this.listadosdocumentoss.get(rowIndex).getcodigo();
				case 5: return this.listadosdocumentoss.get(rowIndex).getbeneficiario();
				case 6: return this.listadosdocumentoss.get(rowIndex).getbeneficiario_cheque();
				case 7: return this.listadosdocumentoss.get(rowIndex).getdetalle();
				case 8: return this.listadosdocumentoss.get(rowIndex).getvalor_cheque();
				case 9: return this.listadosdocumentoss.get(rowIndex).getnombre_empresa();
				case 10: return this.listadosdocumentoss.get(rowIndex).getruc_empresa();
				case 11: return this.listadosdocumentoss.get(rowIndex).getdireccion_empresa();
				case 12: return this.listadosdocumentoss.get(rowIndex).getnombre_sucursal();
				case 13: return this.listadosdocumentoss.get(rowIndex).getvalor();
				case 14: return this.listadosdocumentoss.get(rowIndex).getnumero_mayor();
				case 15: return this.listadosdocumentoss.get(rowIndex).getfecha_emision();
				case 16: return this.listadosdocumentoss.get(rowIndex).getfecha_finalizacion();
				case 17: return this.listadosdocumentoss.get(rowIndex).getnombre_usuario();
				case 18: return this.listadosdocumentoss.get(rowIndex).getnumero_cheque();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Date.class;
				case 3: return String.class;
				case 4: return String.class;
				case 5: return String.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return Double.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return String.class;
				case 13: return Double.class;
				case 14: return String.class;
				case 15: return Date.class;
				case 16: return Date.class;
				case 17: return String.class;
				case 18: return String.class;	            
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
				case 18: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ListadosDocumentos listadosdocumentos = this.listadosdocumentoss.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ListadosDocumentosBeanSwingJInternalFrame listadosdocumentosBeanSwingJInternalFrame=(ListadosDocumentosBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {listadosdocumentos.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {listadosdocumentos.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {listadosdocumentos.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {listadosdocumentos.settipo_movimiento((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {listadosdocumentos.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {listadosdocumentos.setbeneficiario((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {listadosdocumentos.setbeneficiario_cheque((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {listadosdocumentos.setdetalle((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {listadosdocumentos.setvalor_cheque((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {listadosdocumentos.setnombre_empresa((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {listadosdocumentos.setruc_empresa((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {listadosdocumentos.setdireccion_empresa((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {listadosdocumentos.setnombre_sucursal((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {listadosdocumentos.setvalor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {listadosdocumentos.setnumero_mayor((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {listadosdocumentos.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {listadosdocumentos.setfecha_finalizacion((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {listadosdocumentos.setnombre_usuario((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {listadosdocumentos.setnumero_cheque((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ListadosDocumentosModel(JInternalFrameBase jInternalFrameBase) {
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
		private ListadosDocumentosDetalleFormJInternalFrame listadosdocumentosJInternalFrame=null;
		
		public ListadosDocumentosModel(ListadosDocumentosDetalleFormJInternalFrame listadosdocumentosJInternalFrame) {
			this.listadosdocumentosJInternalFrame=listadosdocumentosJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.listadosdocumentosJInternalFrame.getjButtonActualizarToolBarListadosDocumentos();
			
			if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.getjButtonActualizarToolBarListadosDocumentos())) {
				componentTab=this.listadosdocumentosJInternalFrame.getjButtonEliminarToolBarListadosDocumentos();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.getjButtonEliminarToolBarListadosDocumentos())) {
				componentTab=this.listadosdocumentosJInternalFrame.getjButtonCancelarToolBarListadosDocumentos();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.getjButtonCancelarToolBarListadosDocumentos())) {
				componentTab=this.listadosdocumentosJInternalFrame.jComboBoxid_empresaListadosDocumentos;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextFieldnumero_chequeListadosDocumentos)) {
				componentTab=this.listadosdocumentosJInternalFrame.jComboBoxTiposAccionesFormularioListadosDocumentos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jComboBoxTiposAccionesFormularioListadosDocumentos)) {
				componentTab=this.listadosdocumentosJInternalFrame.jButtonEliminarListadosDocumentos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jButtonEliminarListadosDocumentos)) {
				componentTab=this.listadosdocumentosJInternalFrame.jButtonActualizarListadosDocumentos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jButtonActualizarListadosDocumentos)) {
				componentTab=this.listadosdocumentosJInternalFrame.jButtonCancelarListadosDocumentos;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jComboBoxid_empresaListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jComboBoxid_sucursalListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jComboBoxid_sucursalListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jComboBoxid_ejercicioListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jComboBoxid_ejercicioListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jComboBoxid_tipo_movimientoListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jComboBoxid_tipo_movimientoListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jDateChooserfecha_desdeListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jDateChooserfecha_desdeListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jDateChooserfecha_hastaListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jDateChooserfecha_hastaListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jDateChooserfechaListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jDateChooserfechaListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreatipo_movimientoListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreatipo_movimientoListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextFieldcodigoListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextFieldcodigoListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreabeneficiarioListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreabeneficiarioListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreabeneficiario_chequeListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreabeneficiario_chequeListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreadetalleListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreadetalleListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextFieldvalor_chequeListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextFieldvalor_chequeListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreanombre_empresaListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreanombre_empresaListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextFieldruc_empresaListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextFieldruc_empresaListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreadireccion_empresaListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreadireccion_empresaListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreanombre_sucursalListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreanombre_sucursalListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextFieldvalorListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextFieldvalorListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreanumero_mayorListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreanumero_mayorListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jDateChooserfecha_emisionListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jDateChooserfecha_emisionListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jDateChooserfecha_finalizacionListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jDateChooserfecha_finalizacionListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextFieldnombre_usuarioListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextFieldnombre_usuarioListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextFieldnumero_chequeListadosDocumentos;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.listadosdocumentosJInternalFrame.getjButtonActualizarToolBarListadosDocumentos();
			
			if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.getjButtonEliminarToolBarListadosDocumentos())) {
				componentTab=this.listadosdocumentosJInternalFrame.getjButtonActualizarToolBarListadosDocumentos();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.getjButtonCancelarToolBarListadosDocumentos())) {
				componentTab=this.listadosdocumentosJInternalFrame.getjButtonEliminarToolBarListadosDocumentos();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jComboBoxid_empresaListadosDocumentos)) {
				
				componentTab=this.listadosdocumentosJInternalFrame.getjButtonCancelarToolBarListadosDocumentos();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jComboBoxTiposAccionesFormularioListadosDocumentos)) {
				componentTab=this.listadosdocumentosJInternalFrame.jTextFieldnumero_chequeListadosDocumentos;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jButtonEliminarListadosDocumentos)) {
				componentTab=this.listadosdocumentosJInternalFrame.jComboBoxTiposAccionesFormularioListadosDocumentos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jButtonActualizarListadosDocumentos)) {
				componentTab=this.listadosdocumentosJInternalFrame.jButtonEliminarListadosDocumentos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jButtonCancelarListadosDocumentos)) {
				componentTab=this.listadosdocumentosJInternalFrame.jButtonActualizarListadosDocumentos;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jComboBoxid_sucursalListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jComboBoxid_empresaListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jComboBoxid_ejercicioListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jComboBoxid_sucursalListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jComboBoxid_tipo_movimientoListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jComboBoxid_ejercicioListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jDateChooserfecha_desdeListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jComboBoxid_tipo_movimientoListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jDateChooserfecha_hastaListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jDateChooserfecha_desdeListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jDateChooserfechaListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jDateChooserfecha_hastaListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreatipo_movimientoListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jDateChooserfechaListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextFieldcodigoListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreatipo_movimientoListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreabeneficiarioListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextFieldcodigoListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreabeneficiario_chequeListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreabeneficiarioListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreadetalleListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreabeneficiario_chequeListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextFieldvalor_chequeListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreadetalleListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreanombre_empresaListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextFieldvalor_chequeListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextFieldruc_empresaListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreanombre_empresaListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreadireccion_empresaListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextFieldruc_empresaListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreanombre_sucursalListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreadireccion_empresaListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextFieldvalorListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreanombre_sucursalListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextAreanumero_mayorListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextFieldvalorListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jDateChooserfecha_emisionListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextAreanumero_mayorListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jDateChooserfecha_finalizacionListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jDateChooserfecha_emisionListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextFieldnombre_usuarioListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jDateChooserfecha_finalizacionListadosDocumentos;
			return componentTab;
		}

		if(component!=null && component.equals(this.listadosdocumentosJInternalFrame.jTextFieldnumero_chequeListadosDocumentos)) {
			componentTab=this.listadosdocumentosJInternalFrame.jTextFieldnombre_usuarioListadosDocumentos;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.listadosdocumentosJInternalFrame.getjButtonActualizarToolBarListadosDocumentos();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.listadosdocumentosJInternalFrame.getjButtonActualizarToolBarListadosDocumentos();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.listadosdocumentosJInternalFrame.getjButtonCancelarToolBarListadosDocumentos();
			
			
			return componentTab;		
		}
		
		public ListadosDocumentosDetalleFormJInternalFrame getlistadosdocumentosJInternalFrame() {
			return this.listadosdocumentosJInternalFrame;
		}
		
		public void setlistadosdocumentosJInternalFrame(ListadosDocumentosDetalleFormJInternalFrame listadosdocumentosJInternalFrame) {
			this.listadosdocumentosJInternalFrame=listadosdocumentosJInternalFrame;
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
