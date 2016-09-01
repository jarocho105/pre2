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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.contabilidad.util.FacturaProveedorServicioConstantesFunciones;
import com.bydan.erp.contabilidad.util.FacturaProveedorServicioParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.FacturaProveedorServicioParameterGeneral;

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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.FacturaProveedorServicioBeanSwingJInternalFrame;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.FacturaProveedorServicioJInternalFrame;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.FacturaProveedorServicioDetalleFormJInternalFrame;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class FacturaProveedorServicioModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,FacturaProveedorServicioConstantesFunciones.LABEL_ID
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDEMPRESA
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDSUCURSAL
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDEJERCICIO
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDPERIODO
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDANIO
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDMES
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDMODULO
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDTRANSACCION
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDFACTURA
										,FacturaProveedorServicioConstantesFunciones.LABEL_NUMEROFACTURA
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDCLIENTE
										,FacturaProveedorServicioConstantesFunciones.LABEL_RUC
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPODOCUMENTO
										,FacturaProveedorServicioConstantesFunciones.LABEL_PLAZO
										,FacturaProveedorServicioConstantesFunciones.LABEL_CONRISE
										,FacturaProveedorServicioConstantesFunciones.LABEL_FECHAEMISION
										,FacturaProveedorServicioConstantesFunciones.LABEL_FECHAVENCE
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDEMPLEADOSOLICITA
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDEMPLEADO
										,FacturaProveedorServicioConstantesFunciones.LABEL_DETALLE
										,FacturaProveedorServicioConstantesFunciones.LABEL_NUMERORETENCION
										,FacturaProveedorServicioConstantesFunciones.LABEL_NUMEROAUTORIZACION
										,FacturaProveedorServicioConstantesFunciones.LABEL_NUMEROSERIE
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPOTRIBUTARIO
										,FacturaProveedorServicioConstantesFunciones.LABEL_FECHAVALIDEZ
										,FacturaProveedorServicioConstantesFunciones.LABEL_ANEXOFACTURAINICIO
										,FacturaProveedorServicioConstantesFunciones.LABEL_ANEXOFACTURAFIN
										,FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPOMOVIMIENTO
										};
	   
	    public List<FacturaProveedorServicio> facturaproveedorservicios;
	  	 
	    //NO SE UTILIZA
	    public FacturaProveedorServicioModel(List<FacturaProveedorServicio> facturaproveedorservicios,JInternalFrameBase jInternalFrameBase) {
	    	this.facturaproveedorservicios=facturaproveedorservicios;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public FacturaProveedorServicioModel(JInternalFrameBase jInternalFrameBase) {
	    	this.facturaproveedorservicios=new ArrayList<FacturaProveedorServicio>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.facturaproveedorservicios.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.facturaproveedorservicios.get(rowIndex).getIsSelected();
	            
				case 1: return this.facturaproveedorservicios.get(rowIndex).getId();
				case 2: return this.facturaproveedorservicios.get(rowIndex).getid_empresa();
				case 3: return this.facturaproveedorservicios.get(rowIndex).getid_sucursal();
				case 4: return this.facturaproveedorservicios.get(rowIndex).getid_ejercicio();
				case 5: return this.facturaproveedorservicios.get(rowIndex).getid_periodo();
				case 6: return this.facturaproveedorservicios.get(rowIndex).getid_anio();
				case 7: return this.facturaproveedorservicios.get(rowIndex).getid_mes();
				case 8: return this.facturaproveedorservicios.get(rowIndex).getid_modulo();
				case 9: return this.facturaproveedorservicios.get(rowIndex).getid_transaccion();
				case 10: return this.facturaproveedorservicios.get(rowIndex).getid_factura();
				case 11: return this.facturaproveedorservicios.get(rowIndex).getnumero_factura();
				case 12: return this.facturaproveedorservicios.get(rowIndex).getid_cliente();
				case 13: return this.facturaproveedorservicios.get(rowIndex).getruc();
				case 14: return this.facturaproveedorservicios.get(rowIndex).getid_tipo_documento();
				case 15: return this.facturaproveedorservicios.get(rowIndex).getplazo();
				case 16: return this.facturaproveedorservicios.get(rowIndex).getcon_rise();
				case 17: return this.facturaproveedorservicios.get(rowIndex).getfecha_emision();
				case 18: return this.facturaproveedorservicios.get(rowIndex).getfecha_vence();
				case 19: return this.facturaproveedorservicios.get(rowIndex).getid_empleado_solicita();
				case 20: return this.facturaproveedorservicios.get(rowIndex).getid_empleado();
				case 21: return this.facturaproveedorservicios.get(rowIndex).getdetalle();
				case 22: return this.facturaproveedorservicios.get(rowIndex).getnumero_retencion();
				case 23: return this.facturaproveedorservicios.get(rowIndex).getnumero_autorizacion();
				case 24: return this.facturaproveedorservicios.get(rowIndex).getnumero_serie();
				case 25: return this.facturaproveedorservicios.get(rowIndex).getid_tipo_tributario();
				case 26: return this.facturaproveedorservicios.get(rowIndex).getfecha_validez();
				case 27: return this.facturaproveedorservicios.get(rowIndex).getanexo_factura_inicio();
				case 28: return this.facturaproveedorservicios.get(rowIndex).getanexo_factura_fin();
				case 29: return this.facturaproveedorservicios.get(rowIndex).getid_tipo_movimiento();	            
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
				case 10: return Long.class;
				case 11: return String.class;
				case 12: return Long.class;
				case 13: return String.class;
				case 14: return Long.class;
				case 15: return Integer.class;
				case 16: return Boolean.class;
				case 17: return Date.class;
				case 18: return Date.class;
				case 19: return Long.class;
				case 20: return Long.class;
				case 21: return String.class;
				case 22: return String.class;
				case 23: return String.class;
				case 24: return String.class;
				case 25: return Long.class;
				case 26: return Date.class;
				case 27: return String.class;
				case 28: return String.class;
				case 29: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	FacturaProveedorServicio facturaproveedorservicio = this.facturaproveedorservicios.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			FacturaProveedorServicioBeanSwingJInternalFrame facturaproveedorservicioBeanSwingJInternalFrame=(FacturaProveedorServicioBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {facturaproveedorservicio.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {facturaproveedorservicio.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {facturaproveedorservicio.setid_empresa((Long) value);facturaproveedorservicio.setempresa_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {facturaproveedorservicio.setid_sucursal((Long) value);facturaproveedorservicio.setsucursal_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {facturaproveedorservicio.setid_ejercicio((Long) value);facturaproveedorservicio.setejercicio_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {facturaproveedorservicio.setid_periodo((Long) value);facturaproveedorservicio.setperiodo_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {facturaproveedorservicio.setid_anio((Long) value);facturaproveedorservicio.setanio_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {facturaproveedorservicio.setid_mes((Long) value);facturaproveedorservicio.setmes_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {facturaproveedorservicio.setid_modulo((Long) value);facturaproveedorservicio.setmodulo_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {facturaproveedorservicio.setid_transaccion((Long) value);facturaproveedorservicio.settransaccion_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualTransaccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {facturaproveedorservicio.setid_factura((Long) value);facturaproveedorservicio.setfactura_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {facturaproveedorservicio.setnumero_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {facturaproveedorservicio.setid_cliente((Long) value);facturaproveedorservicio.setcliente_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {facturaproveedorservicio.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {facturaproveedorservicio.setid_tipo_documento((Long) value);facturaproveedorservicio.settipodocumento_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualTipoDocumentoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {facturaproveedorservicio.setplazo((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {facturaproveedorservicio.setcon_rise((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {facturaproveedorservicio.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {facturaproveedorservicio.setfecha_vence((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {facturaproveedorservicio.setid_empleado_solicita((Long) value);facturaproveedorservicio.setempleadosolicita_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualEmpleadoSolicitaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {facturaproveedorservicio.setid_empleado((Long) value);facturaproveedorservicio.setempleado_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {facturaproveedorservicio.setdetalle((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {facturaproveedorservicio.setnumero_retencion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {facturaproveedorservicio.setnumero_autorizacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {facturaproveedorservicio.setnumero_serie((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {facturaproveedorservicio.setid_tipo_tributario((Long) value);facturaproveedorservicio.settipotributario_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualTipoTributarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {facturaproveedorservicio.setfecha_validez((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {facturaproveedorservicio.setanexo_factura_inicio((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {facturaproveedorservicio.setanexo_factura_fin((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {facturaproveedorservicio.setid_tipo_movimiento((Long) value);facturaproveedorservicio.settipomovimiento_descripcion(facturaproveedorservicioBeanSwingJInternalFrame.getActualTipoMovimientoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public FacturaProveedorServicioModel(JInternalFrameBase jInternalFrameBase) {
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
		private FacturaProveedorServicioDetalleFormJInternalFrame facturaproveedorservicioJInternalFrame=null;
		
		public FacturaProveedorServicioModel(FacturaProveedorServicioDetalleFormJInternalFrame facturaproveedorservicioJInternalFrame) {
			this.facturaproveedorservicioJInternalFrame=facturaproveedorservicioJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.facturaproveedorservicioJInternalFrame.getjButtonActualizarToolBarFacturaProveedorServicio();
			
			if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.getjButtonActualizarToolBarFacturaProveedorServicio())) {
				componentTab=this.facturaproveedorservicioJInternalFrame.getjButtonEliminarToolBarFacturaProveedorServicio();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.getjButtonEliminarToolBarFacturaProveedorServicio())) {
				componentTab=this.facturaproveedorservicioJInternalFrame.getjButtonCancelarToolBarFacturaProveedorServicio();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.getjButtonCancelarToolBarFacturaProveedorServicio())) {
				componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_empresaFacturaProveedorServicio;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio)) {
				componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxTiposAccionesFormularioFacturaProveedorServicio;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxTiposAccionesFormularioFacturaProveedorServicio)) {
				componentTab=this.facturaproveedorservicioJInternalFrame.jButtonEliminarFacturaProveedorServicio;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jButtonEliminarFacturaProveedorServicio)) {
				componentTab=this.facturaproveedorservicioJInternalFrame.jButtonActualizarFacturaProveedorServicio;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jButtonActualizarFacturaProveedorServicio)) {
				componentTab=this.facturaproveedorservicioJInternalFrame.jButtonCancelarFacturaProveedorServicio;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_empresaFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_sucursalFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_sucursalFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_ejercicioFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_ejercicioFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_periodoFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_periodoFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_anioFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_anioFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_mesFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_mesFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_moduloFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_moduloFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_transaccionFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_transaccionFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_facturaFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_facturaFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_facturaFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_facturaFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_clienteFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_clienteFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldrucFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldrucFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_documentoFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_documentoFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldplazoFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldplazoFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jCheckBoxcon_riseFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jCheckBoxcon_riseFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jDateChooserfecha_emisionFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jDateChooserfecha_emisionFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jDateChooserfecha_venceFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jDateChooserfecha_venceFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_empleado_solicitaFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_empleado_solicitaFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_empleadoFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_empleadoFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextAreadetalleFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextAreadetalleFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_retencionFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_retencionFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_autorizacionFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_autorizacionFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_serieFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_serieFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_tributarioFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_tributarioFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jDateChooserfecha_validezFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jDateChooserfecha_validezFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_factura_inicioFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_factura_inicioFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_factura_finFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_factura_finFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_monedaFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_monedaFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldvalor_servicios0FacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldvalor_servicios0FacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldtotal_ivaFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldtotal_ivaFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldiva_porcentajeFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldiva_porcentajeFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldtotalFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldtotalFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_mayorFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_mayorFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldcodigo_asientoFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldcodigo_asientoFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_numero_autorizacionFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_numero_autorizacionFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_numeso_serieFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_numeso_serieFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jDateChooseranexo_fecha_validezFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jDateChooseranexo_fecha_validezFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextAreadescripcionFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextAreadescripcionFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_movimientoFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_movimientoFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.facturaproveedorservicioJInternalFrame.getjButtonActualizarToolBarFacturaProveedorServicio();
			
			if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.getjButtonEliminarToolBarFacturaProveedorServicio())) {
				componentTab=this.facturaproveedorservicioJInternalFrame.getjButtonActualizarToolBarFacturaProveedorServicio();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.getjButtonCancelarToolBarFacturaProveedorServicio())) {
				componentTab=this.facturaproveedorservicioJInternalFrame.getjButtonEliminarToolBarFacturaProveedorServicio();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_empresaFacturaProveedorServicio)) {
				
				componentTab=this.facturaproveedorservicioJInternalFrame.getjButtonCancelarToolBarFacturaProveedorServicio();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxTiposAccionesFormularioFacturaProveedorServicio)) {
				componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jButtonEliminarFacturaProveedorServicio)) {
				componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxTiposAccionesFormularioFacturaProveedorServicio;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jButtonActualizarFacturaProveedorServicio)) {
				componentTab=this.facturaproveedorservicioJInternalFrame.jButtonEliminarFacturaProveedorServicio;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jButtonCancelarFacturaProveedorServicio)) {
				componentTab=this.facturaproveedorservicioJInternalFrame.jButtonActualizarFacturaProveedorServicio;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_sucursalFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_empresaFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_ejercicioFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_sucursalFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_periodoFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_ejercicioFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_anioFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_periodoFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_mesFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_anioFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_moduloFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_mesFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_transaccionFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_moduloFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_facturaFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_transaccionFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_facturaFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_facturaFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_clienteFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_facturaFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldrucFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_clienteFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_documentoFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldrucFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldplazoFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_documentoFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jCheckBoxcon_riseFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldplazoFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jDateChooserfecha_emisionFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jCheckBoxcon_riseFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jDateChooserfecha_venceFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jDateChooserfecha_emisionFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_empleado_solicitaFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jDateChooserfecha_venceFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_empleadoFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_empleado_solicitaFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextAreadetalleFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_empleadoFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_retencionFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextAreadetalleFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_autorizacionFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_retencionFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_serieFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_autorizacionFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_tributarioFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_serieFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jDateChooserfecha_validezFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_tributarioFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_factura_inicioFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jDateChooserfecha_validezFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_factura_finFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_factura_inicioFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_monedaFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_factura_finFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldvalor_servicios0FacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_monedaFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldtotal_ivaFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldvalor_servicios0FacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldiva_porcentajeFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldtotal_ivaFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldtotalFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldiva_porcentajeFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_mayorFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldtotalFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldcodigo_asientoFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldnumero_mayorFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldcodigo_asientoFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_numero_autorizacionFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_numeso_serieFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_numero_autorizacionFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jDateChooseranexo_fecha_validezFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextFieldanexo_numeso_serieFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jDateChooseranexo_fecha_validezFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jTextAreadescripcionFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_movimientoFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jTextAreadescripcionFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_movimientoFacturaProveedorServicio;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio)) {
			componentTab=this.facturaproveedorservicioJInternalFrame.jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.facturaproveedorservicioJInternalFrame.getjButtonActualizarToolBarFacturaProveedorServicio();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.facturaproveedorservicioJInternalFrame.getjButtonActualizarToolBarFacturaProveedorServicio();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.facturaproveedorservicioJInternalFrame.getjButtonCancelarToolBarFacturaProveedorServicio();
			
			
			return componentTab;		
		}
		
		public FacturaProveedorServicioDetalleFormJInternalFrame getfacturaproveedorservicioJInternalFrame() {
			return this.facturaproveedorservicioJInternalFrame;
		}
		
		public void setfacturaproveedorservicioJInternalFrame(FacturaProveedorServicioDetalleFormJInternalFrame facturaproveedorservicioJInternalFrame) {
			this.facturaproveedorservicioJInternalFrame=facturaproveedorservicioJInternalFrame;
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
