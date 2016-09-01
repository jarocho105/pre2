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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.facturacion.util.TransportistaConstantesFunciones;
import com.bydan.erp.facturacion.util.TransportistaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TransportistaParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TransportistaBeanSwingJInternalFrame;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TransportistaJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TransportistaDetalleFormJInternalFrame;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class TransportistaModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,TransportistaConstantesFunciones.LABEL_ID
										,TransportistaConstantesFunciones.LABEL_IDEMPRESA
										,TransportistaConstantesFunciones.LABEL_IDSUCURSAL
										,TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE
										,TransportistaConstantesFunciones.LABEL_IDENTIFICACION
										,TransportistaConstantesFunciones.LABEL_RUC
										,TransportistaConstantesFunciones.LABEL_NOMBRE
										,TransportistaConstantesFunciones.LABEL_APELLIDO
										,TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO
										,TransportistaConstantesFunciones.LABEL_TELEFONO
										,TransportistaConstantesFunciones.LABEL_DIRECCION
										,TransportistaConstantesFunciones.LABEL_IDCLIENTE
										,TransportistaConstantesFunciones.LABEL_PLACA
										,TransportistaConstantesFunciones.LABEL_NUMERO
										,TransportistaConstantesFunciones.LABEL_OBSERVACION
										};
	   
	    public List<Transportista> transportistas;
	  	 
	    //NO SE UTILIZA
	    public TransportistaModel(List<Transportista> transportistas,JInternalFrameBase jInternalFrameBase) {
	    	this.transportistas=transportistas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public TransportistaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.transportistas=new ArrayList<Transportista>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.transportistas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.transportistas.get(rowIndex).getIsSelected();
	            
				case 1: return this.transportistas.get(rowIndex).getId();
				case 2: return this.transportistas.get(rowIndex).getid_empresa();
				case 3: return this.transportistas.get(rowIndex).getid_sucursal();
				case 4: return this.transportistas.get(rowIndex).getid_tipo_via_transporte();
				case 5: return this.transportistas.get(rowIndex).getidentificacion();
				case 6: return this.transportistas.get(rowIndex).getruc();
				case 7: return this.transportistas.get(rowIndex).getnombre();
				case 8: return this.transportistas.get(rowIndex).getapellido();
				case 9: return this.transportistas.get(rowIndex).getnombre_completo();
				case 10: return this.transportistas.get(rowIndex).gettelefono();
				case 11: return this.transportistas.get(rowIndex).getdireccion();
				case 12: return this.transportistas.get(rowIndex).getid_cliente();
				case 13: return this.transportistas.get(rowIndex).getplaca();
				case 14: return this.transportistas.get(rowIndex).getnumero();
				case 15: return this.transportistas.get(rowIndex).getobservacion();	            
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
				case 5: return String.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return Long.class;
				case 13: return String.class;
				case 14: return String.class;
				case 15: return String.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Transportista transportista = this.transportistas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame=(TransportistaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {transportista.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {transportista.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {transportista.setid_empresa((Long) value);transportista.setempresa_descripcion(transportistaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {transportista.setid_sucursal((Long) value);transportista.setsucursal_descripcion(transportistaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {transportista.setid_tipo_via_transporte((Long) value);transportista.settipoviatransporte_descripcion(transportistaBeanSwingJInternalFrame.getActualTipoViaTransporteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {transportista.setidentificacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {transportista.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {transportista.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {transportista.setapellido((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {transportista.setnombre_completo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {transportista.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {transportista.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {transportista.setid_cliente((Long) value);transportista.setcliente_descripcion(transportistaBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {transportista.setplaca((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {transportista.setnumero((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {transportista.setobservacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private TransportistaDetalleFormJInternalFrame transportistaJInternalFrame=null;
		
		public TransportistaModel(TransportistaDetalleFormJInternalFrame transportistaJInternalFrame) {
			this.transportistaJInternalFrame=transportistaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.transportistaJInternalFrame.getjButtonActualizarToolBarTransportista();
			
			if(component!=null && component.equals(this.transportistaJInternalFrame.getjButtonActualizarToolBarTransportista())) {
				componentTab=this.transportistaJInternalFrame.getjButtonEliminarToolBarTransportista();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transportistaJInternalFrame.getjButtonEliminarToolBarTransportista())) {
				componentTab=this.transportistaJInternalFrame.getjButtonCancelarToolBarTransportista();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transportistaJInternalFrame.getjButtonCancelarToolBarTransportista())) {
				componentTab=this.transportistaJInternalFrame.jComboBoxid_empresaTransportista;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.transportistaJInternalFrame.jTextAreaobservacionTransportista)) {
				componentTab=this.transportistaJInternalFrame.jComboBoxTiposAccionesFormularioTransportista;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transportistaJInternalFrame.jComboBoxTiposAccionesFormularioTransportista)) {
				componentTab=this.transportistaJInternalFrame.jButtonEliminarTransportista;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transportistaJInternalFrame.jButtonEliminarTransportista)) {
				componentTab=this.transportistaJInternalFrame.jButtonActualizarTransportista;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transportistaJInternalFrame.jButtonActualizarTransportista)) {
				componentTab=this.transportistaJInternalFrame.jButtonCancelarTransportista;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.transportistaJInternalFrame.jComboBoxid_empresaTransportista)) {
			componentTab=this.transportistaJInternalFrame.jComboBoxid_sucursalTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jComboBoxid_sucursalTransportista)) {
			componentTab=this.transportistaJInternalFrame.jComboBoxid_tipo_via_transporteTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jComboBoxid_tipo_via_transporteTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextFieldidentificacionTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextFieldidentificacionTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextFieldrucTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextFieldrucTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextAreanombreTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextAreanombreTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextAreaapellidoTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextAreaapellidoTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextFieldtelefonoTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextFieldtelefonoTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextAreadireccionTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextAreadireccionTransportista)) {
			componentTab=this.transportistaJInternalFrame.jComboBoxid_clienteTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jComboBoxid_clienteTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextFieldplacaTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextFieldplacaTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextFieldnumeroTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextFieldnumeroTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextAreaobservacionTransportista;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.transportistaJInternalFrame.getjButtonActualizarToolBarTransportista();
			
			if(component!=null && component.equals(this.transportistaJInternalFrame.getjButtonEliminarToolBarTransportista())) {
				componentTab=this.transportistaJInternalFrame.getjButtonActualizarToolBarTransportista();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transportistaJInternalFrame.getjButtonCancelarToolBarTransportista())) {
				componentTab=this.transportistaJInternalFrame.getjButtonEliminarToolBarTransportista();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.transportistaJInternalFrame.jComboBoxid_empresaTransportista)) {
				
				componentTab=this.transportistaJInternalFrame.getjButtonCancelarToolBarTransportista();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.transportistaJInternalFrame.jComboBoxTiposAccionesFormularioTransportista)) {
				componentTab=this.transportistaJInternalFrame.jTextAreaobservacionTransportista;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.transportistaJInternalFrame.jButtonEliminarTransportista)) {
				componentTab=this.transportistaJInternalFrame.jComboBoxTiposAccionesFormularioTransportista;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transportistaJInternalFrame.jButtonActualizarTransportista)) {
				componentTab=this.transportistaJInternalFrame.jButtonEliminarTransportista;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transportistaJInternalFrame.jButtonCancelarTransportista)) {
				componentTab=this.transportistaJInternalFrame.jButtonActualizarTransportista;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.transportistaJInternalFrame.jComboBoxid_sucursalTransportista)) {
			componentTab=this.transportistaJInternalFrame.jComboBoxid_empresaTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jComboBoxid_tipo_via_transporteTransportista)) {
			componentTab=this.transportistaJInternalFrame.jComboBoxid_sucursalTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextFieldidentificacionTransportista)) {
			componentTab=this.transportistaJInternalFrame.jComboBoxid_tipo_via_transporteTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextFieldrucTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextFieldidentificacionTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextAreanombreTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextFieldrucTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextAreaapellidoTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextAreanombreTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextFieldtelefonoTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextAreaapellidoTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextAreadireccionTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextFieldtelefonoTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jComboBoxid_clienteTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextAreadireccionTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextFieldplacaTransportista)) {
			componentTab=this.transportistaJInternalFrame.jComboBoxid_clienteTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextFieldnumeroTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextFieldplacaTransportista;
			return componentTab;
		}

		if(component!=null && component.equals(this.transportistaJInternalFrame.jTextAreaobservacionTransportista)) {
			componentTab=this.transportistaJInternalFrame.jTextFieldnumeroTransportista;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.transportistaJInternalFrame.getjButtonActualizarToolBarTransportista();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.transportistaJInternalFrame.getjButtonActualizarToolBarTransportista();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.transportistaJInternalFrame.getjButtonCancelarToolBarTransportista();
			
			
			return componentTab;		
		}
		
		public TransportistaDetalleFormJInternalFrame gettransportistaJInternalFrame() {
			return this.transportistaJInternalFrame;
		}
		
		public void settransportistaJInternalFrame(TransportistaDetalleFormJInternalFrame transportistaJInternalFrame) {
			this.transportistaJInternalFrame=transportistaJInternalFrame;
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
