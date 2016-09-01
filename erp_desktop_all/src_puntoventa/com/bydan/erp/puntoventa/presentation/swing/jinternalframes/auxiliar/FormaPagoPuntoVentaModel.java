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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.puntoventa.util.FormaPagoPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.FormaPagoPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.FormaPagoPuntoVentaParameterGeneral;

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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.FormaPagoPuntoVentaBeanSwingJInternalFrame;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.FormaPagoPuntoVentaJInternalFrame;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.FormaPagoPuntoVentaDetalleFormJInternalFrame;

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
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class FormaPagoPuntoVentaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_ID
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDEJERCICIO
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDPERIODO
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTIPOFORMAPAGO
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_PORCENTAJE
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_VALOR
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_FECHA
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_DESCRIPCION
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_FECHAINICIO
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMERODIASPLAZO
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_FECHAFIN
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDBANCO
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDCUENTABANCOPUNVEN
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTIPORIESGOCHEQUE
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMEROCUENTA
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_GIRADOR
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDBANCOTARJETA
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTARJETACREDITO
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTIPOINTERESTARJETA
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTIPOPAGOTARJETA
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDCONEXION
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDMES
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMERO
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_TARJETAHABIENTE
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_AUTORIZACION
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_VOUCHER
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_LOTE
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_CUOTA
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORRETENCION
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORCOMISION
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORCALCULADO
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORCANCELADO
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORDIFIERE
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMERORETENCION
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMEROLIQUIDACION
										,FormaPagoPuntoVentaConstantesFunciones.LABEL_IDANIO
										};
	   
	    public List<FormaPagoPuntoVenta> formapagopuntoventas;
	  	 
	    //NO SE UTILIZA
	    public FormaPagoPuntoVentaModel(List<FormaPagoPuntoVenta> formapagopuntoventas,JInternalFrameBase jInternalFrameBase) {
	    	this.formapagopuntoventas=formapagopuntoventas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public FormaPagoPuntoVentaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.formapagopuntoventas=new ArrayList<FormaPagoPuntoVenta>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.formapagopuntoventas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.formapagopuntoventas.get(rowIndex).getIsSelected();
	            
				case 1: return this.formapagopuntoventas.get(rowIndex).getId();
				case 2: return this.formapagopuntoventas.get(rowIndex).getid_empresa();
				case 3: return this.formapagopuntoventas.get(rowIndex).getid_sucursal();
				case 4: return this.formapagopuntoventas.get(rowIndex).getid_ejercicio();
				case 5: return this.formapagopuntoventas.get(rowIndex).getid_periodo();
				case 6: return this.formapagopuntoventas.get(rowIndex).getid_factura_punto_venta();
				case 7: return this.formapagopuntoventas.get(rowIndex).getid_tipo_forma_pago();
				case 8: return this.formapagopuntoventas.get(rowIndex).getporcentaje();
				case 9: return this.formapagopuntoventas.get(rowIndex).getvalor();
				case 10: return this.formapagopuntoventas.get(rowIndex).getfecha();
				case 11: return this.formapagopuntoventas.get(rowIndex).getdescripcion();
				case 12: return this.formapagopuntoventas.get(rowIndex).getfecha_inicio();
				case 13: return this.formapagopuntoventas.get(rowIndex).getnumero_dias_plazo();
				case 14: return this.formapagopuntoventas.get(rowIndex).getfecha_fin();
				case 15: return this.formapagopuntoventas.get(rowIndex).getid_banco();
				case 16: return this.formapagopuntoventas.get(rowIndex).getid_cuenta_banco_pun_ven();
				case 17: return this.formapagopuntoventas.get(rowIndex).getid_tipo_riesgo_cheque();
				case 18: return this.formapagopuntoventas.get(rowIndex).getnumero_cuenta();
				case 19: return this.formapagopuntoventas.get(rowIndex).getnumero_cheque();
				case 20: return this.formapagopuntoventas.get(rowIndex).getgirador();
				case 21: return this.formapagopuntoventas.get(rowIndex).getid_banco_tarjeta();
				case 22: return this.formapagopuntoventas.get(rowIndex).getid_tarjeta_credito();
				case 23: return this.formapagopuntoventas.get(rowIndex).getid_tipo_interes_tarjeta();
				case 24: return this.formapagopuntoventas.get(rowIndex).getid_tipo_pago_tarjeta();
				case 25: return this.formapagopuntoventas.get(rowIndex).getid_conexion();
				case 26: return this.formapagopuntoventas.get(rowIndex).getid_mes();
				case 27: return this.formapagopuntoventas.get(rowIndex).getnumero();
				case 28: return this.formapagopuntoventas.get(rowIndex).gettarjeta_habiente();
				case 29: return this.formapagopuntoventas.get(rowIndex).getautorizacion();
				case 30: return this.formapagopuntoventas.get(rowIndex).getvoucher();
				case 31: return this.formapagopuntoventas.get(rowIndex).getlote();
				case 32: return this.formapagopuntoventas.get(rowIndex).getcuota();
				case 33: return this.formapagopuntoventas.get(rowIndex).getvalor_retencion();
				case 34: return this.formapagopuntoventas.get(rowIndex).getvalor_comision();
				case 35: return this.formapagopuntoventas.get(rowIndex).getvalor_calculado();
				case 36: return this.formapagopuntoventas.get(rowIndex).getvalor_cancelado();
				case 37: return this.formapagopuntoventas.get(rowIndex).getvalor_difiere();
				case 38: return this.formapagopuntoventas.get(rowIndex).getnumero_retencion();
				case 39: return this.formapagopuntoventas.get(rowIndex).getnumero_liquidacion();
				case 40: return this.formapagopuntoventas.get(rowIndex).getid_anio();	            
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
				case 8: return Double.class;
				case 9: return Double.class;
				case 10: return Date.class;
				case 11: return String.class;
				case 12: return Date.class;
				case 13: return Integer.class;
				case 14: return Date.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return String.class;
				case 19: return String.class;
				case 20: return String.class;
				case 21: return Long.class;
				case 22: return Long.class;
				case 23: return Long.class;
				case 24: return Long.class;
				case 25: return Long.class;
				case 26: return Long.class;
				case 27: return String.class;
				case 28: return String.class;
				case 29: return String.class;
				case 30: return String.class;
				case 31: return String.class;
				case 32: return Integer.class;
				case 33: return Double.class;
				case 34: return Double.class;
				case 35: return Double.class;
				case 36: return Double.class;
				case 37: return Double.class;
				case 38: return String.class;
				case 39: return String.class;
				case 40: return Long.class;	            
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
				case 31: return true;
				case 32: return true;
				case 33: return true;
				case 34: return true;
				case 35: return true;
				case 36: return true;
				case 37: return true;
				case 38: return true;
				case 39: return true;
				case 40: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	FormaPagoPuntoVenta formapagopuntoventa = this.formapagopuntoventas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=(FormaPagoPuntoVentaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {formapagopuntoventa.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {formapagopuntoventa.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {formapagopuntoventa.setid_empresa((Long) value);formapagopuntoventa.setempresa_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {formapagopuntoventa.setid_sucursal((Long) value);formapagopuntoventa.setsucursal_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {formapagopuntoventa.setid_ejercicio((Long) value);formapagopuntoventa.setejercicio_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {formapagopuntoventa.setid_periodo((Long) value);formapagopuntoventa.setperiodo_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {formapagopuntoventa.setid_factura_punto_venta((Long) value);formapagopuntoventa.setfacturapuntoventa_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualFacturaPuntoVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {formapagopuntoventa.setid_tipo_forma_pago((Long) value);formapagopuntoventa.settipoformapago_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualTipoFormaPagoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {formapagopuntoventa.setporcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {formapagopuntoventa.setvalor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {formapagopuntoventa.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {formapagopuntoventa.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {formapagopuntoventa.setfecha_inicio((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {formapagopuntoventa.setnumero_dias_plazo((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {formapagopuntoventa.setfecha_fin((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {formapagopuntoventa.setid_banco((Long) value);formapagopuntoventa.setbanco_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualBancoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {formapagopuntoventa.setid_cuenta_banco_pun_ven((Long) value);formapagopuntoventa.setcuentabancopunven_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualCuentaBancoPunVenForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {formapagopuntoventa.setid_tipo_riesgo_cheque((Long) value);formapagopuntoventa.settiporiesgocheque_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualTipoRiesgoChequeForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {formapagopuntoventa.setnumero_cuenta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {formapagopuntoventa.setnumero_cheque((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {formapagopuntoventa.setgirador((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {formapagopuntoventa.setid_banco_tarjeta((Long) value);formapagopuntoventa.setbancotarjeta_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualBancoTarjetaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {formapagopuntoventa.setid_tarjeta_credito((Long) value);formapagopuntoventa.settarjetacredito_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualTarjetaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {formapagopuntoventa.setid_tipo_interes_tarjeta((Long) value);formapagopuntoventa.settipointerestarjeta_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualTipoInteresTarjetaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {formapagopuntoventa.setid_tipo_pago_tarjeta((Long) value);formapagopuntoventa.settipopagotarjeta_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualTipoPagoTarjetaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {formapagopuntoventa.setid_conexion((Long) value);formapagopuntoventa.setconexion_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualConexionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {formapagopuntoventa.setid_mes((Long) value);formapagopuntoventa.setmes_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {formapagopuntoventa.setnumero((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {formapagopuntoventa.settarjeta_habiente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {formapagopuntoventa.setautorizacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {formapagopuntoventa.setvoucher((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {formapagopuntoventa.setlote((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {formapagopuntoventa.setcuota((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {formapagopuntoventa.setvalor_retencion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {formapagopuntoventa.setvalor_comision((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {formapagopuntoventa.setvalor_calculado((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {formapagopuntoventa.setvalor_cancelado((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {formapagopuntoventa.setvalor_difiere((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {formapagopuntoventa.setnumero_retencion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {formapagopuntoventa.setnumero_liquidacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {formapagopuntoventa.setid_anio((Long) value);formapagopuntoventa.setanio_descripcion(formapagopuntoventaBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public FormaPagoPuntoVentaModel(JInternalFrameBase jInternalFrameBase) {
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
		private FormaPagoPuntoVentaDetalleFormJInternalFrame formapagopuntoventaJInternalFrame=null;
		
		public FormaPagoPuntoVentaModel(FormaPagoPuntoVentaDetalleFormJInternalFrame formapagopuntoventaJInternalFrame) {
			this.formapagopuntoventaJInternalFrame=formapagopuntoventaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.formapagopuntoventaJInternalFrame.getjButtonActualizarToolBarFormaPagoPuntoVenta();
			
			if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.getjButtonActualizarToolBarFormaPagoPuntoVenta())) {
				componentTab=this.formapagopuntoventaJInternalFrame.getjButtonEliminarToolBarFormaPagoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.getjButtonEliminarToolBarFormaPagoPuntoVenta())) {
				componentTab=this.formapagopuntoventaJInternalFrame.getjButtonCancelarToolBarFormaPagoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.getjButtonCancelarToolBarFormaPagoPuntoVenta())) {
				componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_empresaFormaPagoPuntoVenta;
				return componentTab;
			}				
			
			*/
			
			if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_asiento_contableFormaPagoPuntoVenta)) {
				componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta)) {
				componentTab=this.formapagopuntoventaJInternalFrame.jButtonEliminarFormaPagoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jButtonEliminarFormaPagoPuntoVenta)) {
				componentTab=this.formapagopuntoventaJInternalFrame.jButtonActualizarFormaPagoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jButtonActualizarFormaPagoPuntoVenta)) {
				componentTab=this.formapagopuntoventaJInternalFrame.jButtonCancelarFormaPagoPuntoVenta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_empresaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_sucursalFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_sucursalFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_ejercicioFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_ejercicioFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_periodoFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_periodoFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldporcentajeFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldporcentajeFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldvalorFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldvalorFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jDateChooserfechaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jDateChooserfechaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextAreadescripcionFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextAreadescripcionFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jDateChooserfecha_inicioFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jDateChooserfecha_inicioFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldnumero_dias_plazoFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldnumero_dias_plazoFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jDateChooserfecha_finFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jDateChooserfecha_finFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_bancoFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_bancoFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldnumero_cuentaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldnumero_cuentaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldnumero_chequeFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldnumero_chequeFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextAreagiradorFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextAreagiradorFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_banco_tarjetaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_banco_tarjetaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_conexionFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_conexionFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_mesFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_mesFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldnumeroFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldnumeroFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextAreatarjeta_habienteFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextAreatarjeta_habienteFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextAreaautorizacionFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextAreaautorizacionFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldvoucherFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldvoucherFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldloteFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldloteFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldcuotaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldcuotaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldvalor_retencionFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldvalor_retencionFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldvalor_comisionFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldvalor_comisionFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldvalor_calculadoFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldvalor_calculadoFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldvalor_canceladoFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldvalor_canceladoFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldvalor_difiereFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldvalor_difiereFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldnumero_retencionFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldnumero_retencionFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldnumero_liquidacionFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldnumero_liquidacionFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_anioFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_anioFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_cuenta_contableFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_cuenta_contableFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_asiento_contableFormaPagoPuntoVenta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.formapagopuntoventaJInternalFrame.getjButtonActualizarToolBarFormaPagoPuntoVenta();
			
			if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.getjButtonEliminarToolBarFormaPagoPuntoVenta())) {
				componentTab=this.formapagopuntoventaJInternalFrame.getjButtonActualizarToolBarFormaPagoPuntoVenta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.getjButtonCancelarToolBarFormaPagoPuntoVenta())) {
				componentTab=this.formapagopuntoventaJInternalFrame.getjButtonEliminarToolBarFormaPagoPuntoVenta();
				
				return componentTab;
			}
			*/
			
			if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_empresaFormaPagoPuntoVenta)) {
				/*
				componentTab=this.formapagopuntoventaJInternalFrame.getjButtonCancelarToolBarFormaPagoPuntoVenta();
				*/
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta)) {
				componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_asiento_contableFormaPagoPuntoVenta;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jButtonEliminarFormaPagoPuntoVenta)) {
				componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jButtonActualizarFormaPagoPuntoVenta)) {
				componentTab=this.formapagopuntoventaJInternalFrame.jButtonEliminarFormaPagoPuntoVenta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jButtonCancelarFormaPagoPuntoVenta)) {
				componentTab=this.formapagopuntoventaJInternalFrame.jButtonActualizarFormaPagoPuntoVenta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_sucursalFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_empresaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_ejercicioFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_sucursalFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_periodoFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_ejercicioFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_periodoFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldporcentajeFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldvalorFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldporcentajeFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jDateChooserfechaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldvalorFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextAreadescripcionFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jDateChooserfechaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jDateChooserfecha_inicioFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextAreadescripcionFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldnumero_dias_plazoFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jDateChooserfecha_inicioFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jDateChooserfecha_finFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldnumero_dias_plazoFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_bancoFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jDateChooserfecha_finFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_bancoFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldnumero_cuentaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldnumero_chequeFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldnumero_cuentaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextAreagiradorFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldnumero_chequeFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_banco_tarjetaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextAreagiradorFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_banco_tarjetaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_conexionFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_mesFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_conexionFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldnumeroFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_mesFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextAreatarjeta_habienteFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldnumeroFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextAreaautorizacionFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextAreatarjeta_habienteFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldvoucherFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextAreaautorizacionFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldloteFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldvoucherFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldcuotaFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldloteFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldvalor_retencionFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldcuotaFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldvalor_comisionFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldvalor_retencionFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldvalor_calculadoFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldvalor_comisionFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldvalor_canceladoFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldvalor_calculadoFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldvalor_difiereFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldvalor_canceladoFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldnumero_retencionFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldvalor_difiereFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jTextFieldnumero_liquidacionFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldnumero_retencionFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_anioFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jTextFieldnumero_liquidacionFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_cuenta_contableFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_anioFormaPagoPuntoVenta;
			return componentTab;
		}

		if(component!=null && component.equals(this.formapagopuntoventaJInternalFrame.jComboBoxid_asiento_contableFormaPagoPuntoVenta)) {
			componentTab=this.formapagopuntoventaJInternalFrame.jComboBoxid_cuenta_contableFormaPagoPuntoVenta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			/*
			componentTab=this.formapagopuntoventaJInternalFrame.getjButtonActualizarToolBarFormaPagoPuntoVenta();
			*/
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			/*
			componentTab=this.formapagopuntoventaJInternalFrame.getjButtonActualizarToolBarFormaPagoPuntoVenta();
			*/
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			/*
			componentTab=this.formapagopuntoventaJInternalFrame.getjButtonCancelarToolBarFormaPagoPuntoVenta();
			*/
			
			return componentTab;		
		}
		
		public FormaPagoPuntoVentaDetalleFormJInternalFrame getformapagopuntoventaJInternalFrame() {
			return this.formapagopuntoventaJInternalFrame;
		}
		
		public void setformapagopuntoventaJInternalFrame(FormaPagoPuntoVentaDetalleFormJInternalFrame formapagopuntoventaJInternalFrame) {
			this.formapagopuntoventaJInternalFrame=formapagopuntoventaJInternalFrame;
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
