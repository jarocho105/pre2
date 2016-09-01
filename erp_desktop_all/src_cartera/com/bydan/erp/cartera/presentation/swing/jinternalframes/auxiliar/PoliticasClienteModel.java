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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.cartera.util.PoliticasClienteConstantesFunciones;
import com.bydan.erp.cartera.util.PoliticasClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.PoliticasClienteParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.PoliticasClienteBeanSwingJInternalFrame;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.PoliticasClienteJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.PoliticasClienteDetalleFormJInternalFrame;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class PoliticasClienteModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,PoliticasClienteConstantesFunciones.LABEL_ID
										,PoliticasClienteConstantesFunciones.LABEL_IDEMPRESA
										,PoliticasClienteConstantesFunciones.LABEL_LIMITECREDITO
										,PoliticasClienteConstantesFunciones.LABEL_FECHAINICIO
										,PoliticasClienteConstantesFunciones.LABEL_FECHARENOVACION
										,PoliticasClienteConstantesFunciones.LABEL_FECHAFIN
										,PoliticasClienteConstantesFunciones.LABEL_DIASNETOPAGO
										,PoliticasClienteConstantesFunciones.LABEL_DIASGRACIA
										,PoliticasClienteConstantesFunciones.LABEL_CUPO
										,PoliticasClienteConstantesFunciones.LABEL_DESCUENTOGENERAL
										,PoliticasClienteConstantesFunciones.LABEL_DESCUENTOPRONTOPAGO
										,PoliticasClienteConstantesFunciones.LABEL_IDTIPOPRECIO
										,PoliticasClienteConstantesFunciones.LABEL_CONLISTAPRECIO
										,PoliticasClienteConstantesFunciones.LABEL_CONIMPUESTOS
										,PoliticasClienteConstantesFunciones.LABEL_ACTIVARMONTOFACTURACION
										,PoliticasClienteConstantesFunciones.LABEL_VALORSOBREGIRO
										,PoliticasClienteConstantesFunciones.LABEL_FECHAVENCISOBREGIRO
										,PoliticasClienteConstantesFunciones.LABEL_IDTRANSPORTE
										,PoliticasClienteConstantesFunciones.LABEL_VALORSOLICITADO
										,PoliticasClienteConstantesFunciones.LABEL_VALORAPROBADO
										,PoliticasClienteConstantesFunciones.LABEL_IDLINEANEGOCIO
										,PoliticasClienteConstantesFunciones.LABEL_FECHASOLICITUD
										,PoliticasClienteConstantesFunciones.LABEL_OBSEVACION
										,PoliticasClienteConstantesFunciones.LABEL_WEB
										,PoliticasClienteConstantesFunciones.LABEL_CASILLAPOSTAL
										,PoliticasClienteConstantesFunciones.LABEL_FORMAENVIO
										,PoliticasClienteConstantesFunciones.LABEL_IDBANCO
										,PoliticasClienteConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL
										,PoliticasClienteConstantesFunciones.LABEL_NUMEROCUENTA
										,PoliticasClienteConstantesFunciones.LABEL_IDESTADOPOLITICASCLIENTE
										};
	   
	    public List<PoliticasCliente> politicasclientes;
	  	 
	    //NO SE UTILIZA
	    public PoliticasClienteModel(List<PoliticasCliente> politicasclientes,JInternalFrameBase jInternalFrameBase) {
	    	this.politicasclientes=politicasclientes;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public PoliticasClienteModel(JInternalFrameBase jInternalFrameBase) {
	    	this.politicasclientes=new ArrayList<PoliticasCliente>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.politicasclientes.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.politicasclientes.get(rowIndex).getIsSelected();
	            
				case 1: return this.politicasclientes.get(rowIndex).getId();
				case 2: return this.politicasclientes.get(rowIndex).getid_empresa();
				case 3: return this.politicasclientes.get(rowIndex).getlimite_credito();
				case 4: return this.politicasclientes.get(rowIndex).getfecha_inicio();
				case 5: return this.politicasclientes.get(rowIndex).getfecha_renovacion();
				case 6: return this.politicasclientes.get(rowIndex).getfecha_fin();
				case 7: return this.politicasclientes.get(rowIndex).getdias_neto_pago();
				case 8: return this.politicasclientes.get(rowIndex).getdias_gracia();
				case 9: return this.politicasclientes.get(rowIndex).getcupo();
				case 10: return this.politicasclientes.get(rowIndex).getdescuento_general();
				case 11: return this.politicasclientes.get(rowIndex).getdescuento_pronto_pago();
				case 12: return this.politicasclientes.get(rowIndex).getid_tipo_precio();
				case 13: return this.politicasclientes.get(rowIndex).getcon_lista_precio();
				case 14: return this.politicasclientes.get(rowIndex).getcon_impuestos();
				case 15: return this.politicasclientes.get(rowIndex).getactivar_monto_facturacion();
				case 16: return this.politicasclientes.get(rowIndex).getvalor_sobregiro();
				case 17: return this.politicasclientes.get(rowIndex).getfecha_venci_sobregiro();
				case 18: return this.politicasclientes.get(rowIndex).getid_transporte();
				case 19: return this.politicasclientes.get(rowIndex).getvalor_solicitado();
				case 20: return this.politicasclientes.get(rowIndex).getvalor_aprobado();
				case 21: return this.politicasclientes.get(rowIndex).getid_linea_negocio();
				case 22: return this.politicasclientes.get(rowIndex).getfecha_solicitud();
				case 23: return this.politicasclientes.get(rowIndex).getobsevacion();
				case 24: return this.politicasclientes.get(rowIndex).getweb();
				case 25: return this.politicasclientes.get(rowIndex).getcasilla_postal();
				case 26: return this.politicasclientes.get(rowIndex).getforma_envio();
				case 27: return this.politicasclientes.get(rowIndex).getid_banco();
				case 28: return this.politicasclientes.get(rowIndex).getid_tipo_cuenta_banco_global();
				case 29: return this.politicasclientes.get(rowIndex).getnumero_cuenta();
				case 30: return this.politicasclientes.get(rowIndex).getid_estado_politicas_cliente();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return Double.class;
				case 4: return Date.class;
				case 5: return Date.class;
				case 6: return Date.class;
				case 7: return Integer.class;
				case 8: return Integer.class;
				case 9: return Double.class;
				case 10: return Double.class;
				case 11: return Double.class;
				case 12: return Long.class;
				case 13: return Boolean.class;
				case 14: return Boolean.class;
				case 15: return Boolean.class;
				case 16: return Double.class;
				case 17: return Date.class;
				case 18: return Long.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return Long.class;
				case 22: return Date.class;
				case 23: return String.class;
				case 24: return String.class;
				case 25: return String.class;
				case 26: return String.class;
				case 27: return Long.class;
				case 28: return Long.class;
				case 29: return String.class;
				case 30: return Long.class;	            
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
				case 21: return true;
				case 22: return true;
				case 23: return true;
				case 24: return true;
				case 25: return true;
				case 26: return true;
				case 27: return true;
				case 28: return true;
				case 29: return true;
				case 30: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	PoliticasCliente politicascliente = this.politicasclientes.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame=(PoliticasClienteBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {politicascliente.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {politicascliente.setId((Long) value);politicascliente.setcliente_descripcion(politicasclienteBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {politicascliente.setid_empresa((Long) value);politicascliente.setempresa_descripcion(politicasclienteBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {politicascliente.setlimite_credito((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {politicascliente.setfecha_inicio((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {politicascliente.setfecha_renovacion((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {politicascliente.setfecha_fin((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {politicascliente.setdias_neto_pago((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {politicascliente.setdias_gracia((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {politicascliente.setcupo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {politicascliente.setdescuento_general((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {politicascliente.setdescuento_pronto_pago((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {politicascliente.setid_tipo_precio((Long) value);politicascliente.settipoprecio_descripcion(politicasclienteBeanSwingJInternalFrame.getActualTipoPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {politicascliente.setcon_lista_precio((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {politicascliente.setcon_impuestos((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {politicascliente.setactivar_monto_facturacion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {politicascliente.setvalor_sobregiro((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {politicascliente.setfecha_venci_sobregiro((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {politicascliente.setid_transporte((Long) value);politicascliente.settransporte_descripcion(politicasclienteBeanSwingJInternalFrame.getActualTransporteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {politicascliente.setvalor_solicitado((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {politicascliente.setvalor_aprobado((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {politicascliente.setid_linea_negocio((Long) value);politicascliente.setlineanegocio_descripcion(politicasclienteBeanSwingJInternalFrame.getActualLineaNegocioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {politicascliente.setfecha_solicitud((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {politicascliente.setobsevacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {politicascliente.setweb((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {politicascliente.setcasilla_postal((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {politicascliente.setforma_envio((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {politicascliente.setid_banco((Long) value);politicascliente.setbanco_descripcion(politicasclienteBeanSwingJInternalFrame.getActualBancoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {politicascliente.setid_tipo_cuenta_banco_global((Long) value);politicascliente.settipocuentabancoglobal_descripcion(politicasclienteBeanSwingJInternalFrame.getActualTipoCuentaBancoGlobalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {politicascliente.setnumero_cuenta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {politicascliente.setid_estado_politicas_cliente((Long) value);politicascliente.setestadopoliticascliente_descripcion(politicasclienteBeanSwingJInternalFrame.getActualEstadoPoliticasClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public PoliticasClienteModel(JInternalFrameBase jInternalFrameBase) {
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
		private PoliticasClienteDetalleFormJInternalFrame politicasclienteJInternalFrame=null;
		
		public PoliticasClienteModel(PoliticasClienteDetalleFormJInternalFrame politicasclienteJInternalFrame) {
			this.politicasclienteJInternalFrame=politicasclienteJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.politicasclienteJInternalFrame.getjButtonActualizarToolBarPoliticasCliente();
			
			if(component!=null && component.equals(this.politicasclienteJInternalFrame.getjButtonActualizarToolBarPoliticasCliente())) {
				componentTab=this.politicasclienteJInternalFrame.getjButtonEliminarToolBarPoliticasCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.politicasclienteJInternalFrame.getjButtonEliminarToolBarPoliticasCliente())) {
				componentTab=this.politicasclienteJInternalFrame.getjButtonCancelarToolBarPoliticasCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.politicasclienteJInternalFrame.getjButtonCancelarToolBarPoliticasCliente())) {
				componentTab=this.politicasclienteJInternalFrame.jComboBoxid_empresaPoliticasCliente;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxid_estado_politicas_clientePoliticasCliente)) {
				componentTab=this.politicasclienteJInternalFrame.jComboBoxTiposAccionesFormularioPoliticasCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxTiposAccionesFormularioPoliticasCliente)) {
				componentTab=this.politicasclienteJInternalFrame.jButtonEliminarPoliticasCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.politicasclienteJInternalFrame.jButtonEliminarPoliticasCliente)) {
				componentTab=this.politicasclienteJInternalFrame.jButtonActualizarPoliticasCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.politicasclienteJInternalFrame.jButtonActualizarPoliticasCliente)) {
				componentTab=this.politicasclienteJInternalFrame.jButtonCancelarPoliticasCliente;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxid_empresaPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFieldlimite_creditoPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFieldlimite_creditoPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jDateChooserfecha_inicioPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jDateChooserfecha_inicioPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jDateChooserfecha_renovacionPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jDateChooserfecha_renovacionPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jDateChooserfecha_finPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jDateChooserfecha_finPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFielddias_neto_pagoPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFielddias_neto_pagoPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFielddias_graciaPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFielddias_graciaPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFieldcupoPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFieldcupoPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFielddescuento_generalPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFielddescuento_generalPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFielddescuento_pronto_pagoPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFielddescuento_pronto_pagoPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jComboBoxid_tipo_precioPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxid_tipo_precioPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jCheckBoxcon_lista_precioPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jCheckBoxcon_lista_precioPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jCheckBoxcon_impuestosPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jCheckBoxcon_impuestosPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jCheckBoxactivar_monto_facturacionPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jCheckBoxactivar_monto_facturacionPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFieldvalor_sobregiroPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFieldvalor_sobregiroPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jDateChooserfecha_venci_sobregiroPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jDateChooserfecha_venci_sobregiroPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jComboBoxid_transportePoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxid_transportePoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFieldvalor_solicitadoPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFieldvalor_solicitadoPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFieldvalor_aprobadoPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFieldvalor_aprobadoPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jComboBoxid_linea_negocioPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxid_linea_negocioPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jDateChooserfecha_solicitudPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jDateChooserfecha_solicitudPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextAreaobsevacionPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextAreaobsevacionPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextAreawebPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextAreawebPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFieldcasilla_postalPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFieldcasilla_postalPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextAreaforma_envioPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextAreaforma_envioPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jComboBoxid_bancoPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxid_bancoPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFieldnumero_cuentaPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFieldnumero_cuentaPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jComboBoxid_estado_politicas_clientePoliticasCliente;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.politicasclienteJInternalFrame.getjButtonActualizarToolBarPoliticasCliente();
			
			if(component!=null && component.equals(this.politicasclienteJInternalFrame.getjButtonEliminarToolBarPoliticasCliente())) {
				componentTab=this.politicasclienteJInternalFrame.getjButtonActualizarToolBarPoliticasCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.politicasclienteJInternalFrame.getjButtonCancelarToolBarPoliticasCliente())) {
				componentTab=this.politicasclienteJInternalFrame.getjButtonEliminarToolBarPoliticasCliente();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxid_empresaPoliticasCliente)) {
				
				componentTab=this.politicasclienteJInternalFrame.getjButtonCancelarToolBarPoliticasCliente();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxTiposAccionesFormularioPoliticasCliente)) {
				componentTab=this.politicasclienteJInternalFrame.jComboBoxid_estado_politicas_clientePoliticasCliente;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.politicasclienteJInternalFrame.jButtonEliminarPoliticasCliente)) {
				componentTab=this.politicasclienteJInternalFrame.jComboBoxTiposAccionesFormularioPoliticasCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.politicasclienteJInternalFrame.jButtonActualizarPoliticasCliente)) {
				componentTab=this.politicasclienteJInternalFrame.jButtonEliminarPoliticasCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.politicasclienteJInternalFrame.jButtonCancelarPoliticasCliente)) {
				componentTab=this.politicasclienteJInternalFrame.jButtonActualizarPoliticasCliente;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFieldlimite_creditoPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jComboBoxid_empresaPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jDateChooserfecha_inicioPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFieldlimite_creditoPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jDateChooserfecha_renovacionPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jDateChooserfecha_inicioPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jDateChooserfecha_finPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jDateChooserfecha_renovacionPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFielddias_neto_pagoPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jDateChooserfecha_finPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFielddias_graciaPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFielddias_neto_pagoPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFieldcupoPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFielddias_graciaPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFielddescuento_generalPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFieldcupoPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFielddescuento_pronto_pagoPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFielddescuento_generalPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxid_tipo_precioPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFielddescuento_pronto_pagoPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jCheckBoxcon_lista_precioPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jComboBoxid_tipo_precioPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jCheckBoxcon_impuestosPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jCheckBoxcon_lista_precioPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jCheckBoxactivar_monto_facturacionPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jCheckBoxcon_impuestosPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFieldvalor_sobregiroPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jCheckBoxactivar_monto_facturacionPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jDateChooserfecha_venci_sobregiroPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFieldvalor_sobregiroPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxid_transportePoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jDateChooserfecha_venci_sobregiroPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFieldvalor_solicitadoPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jComboBoxid_transportePoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFieldvalor_aprobadoPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFieldvalor_solicitadoPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxid_linea_negocioPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFieldvalor_aprobadoPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jDateChooserfecha_solicitudPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jComboBoxid_linea_negocioPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextAreaobsevacionPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jDateChooserfecha_solicitudPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextAreawebPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextAreaobsevacionPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFieldcasilla_postalPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextAreawebPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextAreaforma_envioPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFieldcasilla_postalPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxid_bancoPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextAreaforma_envioPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jComboBoxid_bancoPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jTextFieldnumero_cuentaPoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.politicasclienteJInternalFrame.jComboBoxid_estado_politicas_clientePoliticasCliente)) {
			componentTab=this.politicasclienteJInternalFrame.jTextFieldnumero_cuentaPoliticasCliente;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.politicasclienteJInternalFrame.getjButtonActualizarToolBarPoliticasCliente();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.politicasclienteJInternalFrame.getjButtonActualizarToolBarPoliticasCliente();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.politicasclienteJInternalFrame.getjButtonCancelarToolBarPoliticasCliente();
			
			
			return componentTab;		
		}
		
		public PoliticasClienteDetalleFormJInternalFrame getpoliticasclienteJInternalFrame() {
			return this.politicasclienteJInternalFrame;
		}
		
		public void setpoliticasclienteJInternalFrame(PoliticasClienteDetalleFormJInternalFrame politicasclienteJInternalFrame) {
			this.politicasclienteJInternalFrame=politicasclienteJInternalFrame;
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
