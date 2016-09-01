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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.tesoreria.util.RegistroFormaPagoBancoConstantesFunciones;
import com.bydan.erp.tesoreria.util.RegistroFormaPagoBancoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.RegistroFormaPagoBancoParameterGeneral;

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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.RegistroFormaPagoBancoBeanSwingJInternalFrame;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.RegistroFormaPagoBancoJInternalFrame;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.RegistroFormaPagoBancoDetalleFormJInternalFrame;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class RegistroFormaPagoBancoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_ID
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_IDEMPRESA
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_IDSUCURSAL
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_IDEJERCICIO
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_IDPERIODO
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_IDTIPOFORMAPAGO
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_IDESTADOREGISTROFORMAPAGOBANCO
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_IDCLIENTE
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBREBANCO
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBREGIRADOR
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_FECHAVENCIMIENTO
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_NUMEROCUENTA
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_NUMEROCHEQUE
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_VALORMONTO
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_FECHA
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_NUMEROCAMBIO
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_IDANIO
										,RegistroFormaPagoBancoConstantesFunciones.LABEL_IDMES
										};
	   
	    public List<RegistroFormaPagoBanco> registroformapagobancos;
	  	 
	    //NO SE UTILIZA
	    public RegistroFormaPagoBancoModel(List<RegistroFormaPagoBanco> registroformapagobancos,JInternalFrameBase jInternalFrameBase) {
	    	this.registroformapagobancos=registroformapagobancos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public RegistroFormaPagoBancoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.registroformapagobancos=new ArrayList<RegistroFormaPagoBanco>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.registroformapagobancos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.registroformapagobancos.get(rowIndex).getIsSelected();
	            
				case 1: return this.registroformapagobancos.get(rowIndex).getId();
				case 2: return this.registroformapagobancos.get(rowIndex).getid_empresa();
				case 3: return this.registroformapagobancos.get(rowIndex).getid_sucursal();
				case 4: return this.registroformapagobancos.get(rowIndex).getid_ejercicio();
				case 5: return this.registroformapagobancos.get(rowIndex).getid_periodo();
				case 6: return this.registroformapagobancos.get(rowIndex).getid_asiento_contable();
				case 7: return this.registroformapagobancos.get(rowIndex).getid_tipo_forma_pago();
				case 8: return this.registroformapagobancos.get(rowIndex).getid_estado_registro_forma_pago_banco();
				case 9: return this.registroformapagobancos.get(rowIndex).getid_cliente();
				case 10: return this.registroformapagobancos.get(rowIndex).getnombre_banco();
				case 11: return this.registroformapagobancos.get(rowIndex).getnombre_girador();
				case 12: return this.registroformapagobancos.get(rowIndex).getfecha_vencimiento();
				case 13: return this.registroformapagobancos.get(rowIndex).getnumero_cuenta();
				case 14: return this.registroformapagobancos.get(rowIndex).getnumero_cheque();
				case 15: return this.registroformapagobancos.get(rowIndex).getvalor_monto();
				case 16: return this.registroformapagobancos.get(rowIndex).getfecha();
				case 17: return this.registroformapagobancos.get(rowIndex).getfecha_vencimiento_original();
				case 18: return this.registroformapagobancos.get(rowIndex).getnumero_cambio();
				case 19: return this.registroformapagobancos.get(rowIndex).getid_anio();
				case 20: return this.registroformapagobancos.get(rowIndex).getid_mes();	            
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
				case 6: return Long.class;
				case 7: return Long.class;
				case 8: return Long.class;
				case 9: return Long.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return Date.class;
				case 13: return String.class;
				case 14: return String.class;
				case 15: return Double.class;
				case 16: return Date.class;
				case 17: return Date.class;
				case 18: return Integer.class;
				case 19: return Long.class;
				case 20: return Long.class;	            
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
				case 19: return true;
				case 20: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	RegistroFormaPagoBanco registroformapagobanco = this.registroformapagobancos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			RegistroFormaPagoBancoBeanSwingJInternalFrame registroformapagobancoBeanSwingJInternalFrame=(RegistroFormaPagoBancoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {registroformapagobanco.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {registroformapagobanco.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {registroformapagobanco.setid_empresa((Long) value);registroformapagobanco.setempresa_descripcion(registroformapagobancoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {registroformapagobanco.setid_sucursal((Long) value);registroformapagobanco.setsucursal_descripcion(registroformapagobancoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {registroformapagobanco.setid_ejercicio((Long) value);registroformapagobanco.setejercicio_descripcion(registroformapagobancoBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {registroformapagobanco.setid_periodo((Long) value);registroformapagobanco.setperiodo_descripcion(registroformapagobancoBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {registroformapagobanco.setid_asiento_contable((Long) value);registroformapagobanco.setasientocontable_descripcion(registroformapagobancoBeanSwingJInternalFrame.getActualAsientoContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {registroformapagobanco.setid_tipo_forma_pago((Long) value);registroformapagobanco.settipoformapago_descripcion(registroformapagobancoBeanSwingJInternalFrame.getActualTipoFormaPagoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {registroformapagobanco.setid_estado_registro_forma_pago_banco((Long) value);registroformapagobanco.setestadoregistroformapagobanco_descripcion(registroformapagobancoBeanSwingJInternalFrame.getActualEstadoRegistroFormaPagoBancoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {registroformapagobanco.setid_cliente((Long) value);registroformapagobanco.setcliente_descripcion(registroformapagobancoBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {registroformapagobanco.setnombre_banco((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {registroformapagobanco.setnombre_girador((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {registroformapagobanco.setfecha_vencimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {registroformapagobanco.setnumero_cuenta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {registroformapagobanco.setnumero_cheque((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {registroformapagobanco.setvalor_monto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {registroformapagobanco.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {registroformapagobanco.setfecha_vencimiento_original((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {registroformapagobanco.setnumero_cambio((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {registroformapagobanco.setid_anio((Long) value);registroformapagobanco.setanio_descripcion(registroformapagobancoBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {registroformapagobanco.setid_mes((Long) value);registroformapagobanco.setmes_descripcion(registroformapagobancoBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public RegistroFormaPagoBancoModel(JInternalFrameBase jInternalFrameBase) {
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
		private RegistroFormaPagoBancoDetalleFormJInternalFrame registroformapagobancoJInternalFrame=null;
		
		public RegistroFormaPagoBancoModel(RegistroFormaPagoBancoDetalleFormJInternalFrame registroformapagobancoJInternalFrame) {
			this.registroformapagobancoJInternalFrame=registroformapagobancoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.registroformapagobancoJInternalFrame.getjButtonActualizarToolBarRegistroFormaPagoBanco();
			
			if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.getjButtonActualizarToolBarRegistroFormaPagoBanco())) {
				componentTab=this.registroformapagobancoJInternalFrame.getjButtonEliminarToolBarRegistroFormaPagoBanco();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.getjButtonEliminarToolBarRegistroFormaPagoBanco())) {
				componentTab=this.registroformapagobancoJInternalFrame.getjButtonCancelarToolBarRegistroFormaPagoBanco();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.getjButtonCancelarToolBarRegistroFormaPagoBanco())) {
				componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_empresaRegistroFormaPagoBanco;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_mesRegistroFormaPagoBanco)) {
				componentTab=this.registroformapagobancoJInternalFrame.jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco)) {
				componentTab=this.registroformapagobancoJInternalFrame.jButtonEliminarRegistroFormaPagoBanco;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jButtonEliminarRegistroFormaPagoBanco)) {
				componentTab=this.registroformapagobancoJInternalFrame.jButtonActualizarRegistroFormaPagoBanco;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jButtonActualizarRegistroFormaPagoBanco)) {
				componentTab=this.registroformapagobancoJInternalFrame.jButtonCancelarRegistroFormaPagoBanco;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_empresaRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_sucursalRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_sucursalRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_ejercicioRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_ejercicioRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_periodoRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_periodoRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_asiento_contableRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_asiento_contableRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_clienteRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_clienteRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jTextAreanombre_bancoRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jTextAreanombre_bancoRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jTextAreanombre_giradorRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jTextAreanombre_giradorRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jDateChooserfecha_vencimientoRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jDateChooserfecha_vencimientoRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jTextFieldnumero_cuentaRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jTextFieldnumero_cuentaRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jTextFieldnumero_chequeRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jTextFieldnumero_chequeRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jTextFieldvalor_montoRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jTextFieldvalor_montoRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jDateChooserfechaRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jDateChooserfechaRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jTextFieldnumero_cambioRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jTextFieldnumero_cambioRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_anioRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_anioRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_mesRegistroFormaPagoBanco;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.registroformapagobancoJInternalFrame.getjButtonActualizarToolBarRegistroFormaPagoBanco();
			
			if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.getjButtonEliminarToolBarRegistroFormaPagoBanco())) {
				componentTab=this.registroformapagobancoJInternalFrame.getjButtonActualizarToolBarRegistroFormaPagoBanco();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.getjButtonCancelarToolBarRegistroFormaPagoBanco())) {
				componentTab=this.registroformapagobancoJInternalFrame.getjButtonEliminarToolBarRegistroFormaPagoBanco();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_empresaRegistroFormaPagoBanco)) {
				
				componentTab=this.registroformapagobancoJInternalFrame.getjButtonCancelarToolBarRegistroFormaPagoBanco();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco)) {
				componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_mesRegistroFormaPagoBanco;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jButtonEliminarRegistroFormaPagoBanco)) {
				componentTab=this.registroformapagobancoJInternalFrame.jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jButtonActualizarRegistroFormaPagoBanco)) {
				componentTab=this.registroformapagobancoJInternalFrame.jButtonEliminarRegistroFormaPagoBanco;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jButtonCancelarRegistroFormaPagoBanco)) {
				componentTab=this.registroformapagobancoJInternalFrame.jButtonActualizarRegistroFormaPagoBanco;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_sucursalRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_empresaRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_ejercicioRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_sucursalRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_periodoRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_ejercicioRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_asiento_contableRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_periodoRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_asiento_contableRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_clienteRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jTextAreanombre_bancoRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_clienteRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jTextAreanombre_giradorRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jTextAreanombre_bancoRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jDateChooserfecha_vencimientoRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jTextAreanombre_giradorRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jTextFieldnumero_cuentaRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jDateChooserfecha_vencimientoRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jTextFieldnumero_chequeRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jTextFieldnumero_cuentaRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jTextFieldvalor_montoRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jTextFieldnumero_chequeRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jDateChooserfechaRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jTextFieldvalor_montoRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jDateChooserfechaRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jTextFieldnumero_cambioRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_anioRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jTextFieldnumero_cambioRegistroFormaPagoBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.registroformapagobancoJInternalFrame.jComboBoxid_mesRegistroFormaPagoBanco)) {
			componentTab=this.registroformapagobancoJInternalFrame.jComboBoxid_anioRegistroFormaPagoBanco;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.registroformapagobancoJInternalFrame.getjButtonActualizarToolBarRegistroFormaPagoBanco();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.registroformapagobancoJInternalFrame.getjButtonActualizarToolBarRegistroFormaPagoBanco();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.registroformapagobancoJInternalFrame.getjButtonCancelarToolBarRegistroFormaPagoBanco();
			
			
			return componentTab;		
		}
		
		public RegistroFormaPagoBancoDetalleFormJInternalFrame getregistroformapagobancoJInternalFrame() {
			return this.registroformapagobancoJInternalFrame;
		}
		
		public void setregistroformapagobancoJInternalFrame(RegistroFormaPagoBancoDetalleFormJInternalFrame registroformapagobancoJInternalFrame) {
			this.registroformapagobancoJInternalFrame=registroformapagobancoJInternalFrame;
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
