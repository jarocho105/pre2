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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.inventario.util.MovimientoInventarioConstantesFunciones;
import com.bydan.erp.inventario.util.MovimientoInventarioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.MovimientoInventarioParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.MovimientoInventarioBeanSwingJInternalFrame;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.MovimientoInventarioJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.MovimientoInventarioDetalleFormJInternalFrame;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class MovimientoInventarioModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,MovimientoInventarioConstantesFunciones.LABEL_ID
										,MovimientoInventarioConstantesFunciones.LABEL_IDEMPRESA
										,MovimientoInventarioConstantesFunciones.LABEL_IDSUCURSAL
										,MovimientoInventarioConstantesFunciones.LABEL_IDMODULO
										,MovimientoInventarioConstantesFunciones.LABEL_IDEJERCICIO
										,MovimientoInventarioConstantesFunciones.LABEL_IDPERIODO
										,MovimientoInventarioConstantesFunciones.LABEL_IDANIO
										,MovimientoInventarioConstantesFunciones.LABEL_IDMES
										,MovimientoInventarioConstantesFunciones.LABEL_IDUSUARIO
										,MovimientoInventarioConstantesFunciones.LABEL_IDTRANSACCION
										,MovimientoInventarioConstantesFunciones.LABEL_FECHAEMISION
										,MovimientoInventarioConstantesFunciones.LABEL_FECHAENTREGA
										,MovimientoInventarioConstantesFunciones.LABEL_NUMEROSECUENCIAL
										,MovimientoInventarioConstantesFunciones.LABEL_IDMONEDA
										,MovimientoInventarioConstantesFunciones.LABEL_IDTIPOCAMBIO
										,MovimientoInventarioConstantesFunciones.LABEL_IDESTADOMOVIMIENTOINVENTARIO
										,MovimientoInventarioConstantesFunciones.LABEL_IDEMPLEADO
										,MovimientoInventarioConstantesFunciones.LABEL_IDFORMATO
										,MovimientoInventarioConstantesFunciones.LABEL_IDTRANSPORTISTA
										,MovimientoInventarioConstantesFunciones.LABEL_DESCRIPCION
										,MovimientoInventarioConstantesFunciones.LABEL_PORCENTAJEDESCUENTO
										,MovimientoInventarioConstantesFunciones.LABEL_SUMAN
										,MovimientoInventarioConstantesFunciones.LABEL_ICE
										,MovimientoInventarioConstantesFunciones.LABEL_VALORDESCUENTO
										,MovimientoInventarioConstantesFunciones.LABEL_TOTALDESCUENTO
										,MovimientoInventarioConstantesFunciones.LABEL_IVA
										,MovimientoInventarioConstantesFunciones.LABEL_STOCK
										,MovimientoInventarioConstantesFunciones.LABEL_SUBTOTAL
										,MovimientoInventarioConstantesFunciones.LABEL_TOTALOTRO
										,MovimientoInventarioConstantesFunciones.LABEL_ULTIMOCOSTO
										,MovimientoInventarioConstantesFunciones.LABEL_NUMEROITEMS
										,MovimientoInventarioConstantesFunciones.LABEL_RETENCION
										,MovimientoInventarioConstantesFunciones.LABEL_TOTAL
										};
	   
	    public List<MovimientoInventario> movimientoinventarios;
	  	 
	    //NO SE UTILIZA
	    public MovimientoInventarioModel(List<MovimientoInventario> movimientoinventarios,JInternalFrameBase jInternalFrameBase) {
	    	this.movimientoinventarios=movimientoinventarios;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public MovimientoInventarioModel(JInternalFrameBase jInternalFrameBase) {
	    	this.movimientoinventarios=new ArrayList<MovimientoInventario>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.movimientoinventarios.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.movimientoinventarios.get(rowIndex).getIsSelected();
	            
				case 1: return this.movimientoinventarios.get(rowIndex).getId();
				case 2: return this.movimientoinventarios.get(rowIndex).getid_empresa();
				case 3: return this.movimientoinventarios.get(rowIndex).getid_sucursal();
				case 4: return this.movimientoinventarios.get(rowIndex).getid_modulo();
				case 5: return this.movimientoinventarios.get(rowIndex).getid_ejercicio();
				case 6: return this.movimientoinventarios.get(rowIndex).getid_periodo();
				case 7: return this.movimientoinventarios.get(rowIndex).getid_anio();
				case 8: return this.movimientoinventarios.get(rowIndex).getid_mes();
				case 9: return this.movimientoinventarios.get(rowIndex).getid_usuario();
				case 10: return this.movimientoinventarios.get(rowIndex).getid_transaccion();
				case 11: return this.movimientoinventarios.get(rowIndex).getfecha_emision();
				case 12: return this.movimientoinventarios.get(rowIndex).getfecha_entrega();
				case 13: return this.movimientoinventarios.get(rowIndex).getnumero_secuencial();
				case 14: return this.movimientoinventarios.get(rowIndex).getid_moneda();
				case 15: return this.movimientoinventarios.get(rowIndex).getid_tipo_cambio();
				case 16: return this.movimientoinventarios.get(rowIndex).getid_estado_movimiento_inventario();
				case 17: return this.movimientoinventarios.get(rowIndex).getid_empleado();
				case 18: return this.movimientoinventarios.get(rowIndex).getid_formato();
				case 19: return this.movimientoinventarios.get(rowIndex).getid_transportista();
				case 20: return this.movimientoinventarios.get(rowIndex).getdescripcion();
				case 21: return this.movimientoinventarios.get(rowIndex).getporcentaje_descuento();
				case 22: return this.movimientoinventarios.get(rowIndex).getsuman();
				case 23: return this.movimientoinventarios.get(rowIndex).getice();
				case 24: return this.movimientoinventarios.get(rowIndex).getvalor_descuento();
				case 25: return this.movimientoinventarios.get(rowIndex).gettotal_descuento();
				case 26: return this.movimientoinventarios.get(rowIndex).getiva();
				case 27: return this.movimientoinventarios.get(rowIndex).getstock();
				case 28: return this.movimientoinventarios.get(rowIndex).getsub_total();
				case 29: return this.movimientoinventarios.get(rowIndex).gettotal_otro();
				case 30: return this.movimientoinventarios.get(rowIndex).getultimo_costo();
				case 31: return this.movimientoinventarios.get(rowIndex).getnumero_items();
				case 32: return this.movimientoinventarios.get(rowIndex).getretencion();
				case 33: return this.movimientoinventarios.get(rowIndex).gettotal();	            
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
				case 11: return Date.class;
				case 12: return Date.class;
				case 13: return String.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Long.class;
				case 19: return Long.class;
				case 20: return String.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return Double.class;
				case 25: return Double.class;
				case 26: return Double.class;
				case 27: return Double.class;
				case 28: return Double.class;
				case 29: return Double.class;
				case 30: return Double.class;
				case 31: return Integer.class;
				case 32: return Double.class;
				case 33: return Double.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	MovimientoInventario movimientoinventario = this.movimientoinventarios.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			MovimientoInventarioBeanSwingJInternalFrame movimientoinventarioBeanSwingJInternalFrame=(MovimientoInventarioBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {movimientoinventario.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {movimientoinventario.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {movimientoinventario.setid_empresa((Long) value);movimientoinventario.setempresa_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {movimientoinventario.setid_sucursal((Long) value);movimientoinventario.setsucursal_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {movimientoinventario.setid_modulo((Long) value);movimientoinventario.setmodulo_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {movimientoinventario.setid_ejercicio((Long) value);movimientoinventario.setejercicio_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {movimientoinventario.setid_periodo((Long) value);movimientoinventario.setperiodo_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {movimientoinventario.setid_anio((Long) value);movimientoinventario.setanio_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {movimientoinventario.setid_mes((Long) value);movimientoinventario.setmes_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {movimientoinventario.setid_usuario((Long) value);movimientoinventario.setusuario_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {movimientoinventario.setid_transaccion((Long) value);movimientoinventario.settransaccion_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualTransaccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {movimientoinventario.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {movimientoinventario.setfecha_entrega((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {movimientoinventario.setnumero_secuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {movimientoinventario.setid_moneda((Long) value);movimientoinventario.setmoneda_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {movimientoinventario.setid_tipo_cambio((Long) value);movimientoinventario.settipocambio_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualTipoCambioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {movimientoinventario.setid_estado_movimiento_inventario((Long) value);movimientoinventario.setestadomovimientoinventario_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualEstadoMovimientoInventarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {movimientoinventario.setid_empleado((Long) value);movimientoinventario.setempleado_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {movimientoinventario.setid_formato((Long) value);movimientoinventario.setformato_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {movimientoinventario.setid_transportista((Long) value);movimientoinventario.settransportista_descripcion(movimientoinventarioBeanSwingJInternalFrame.getActualTransportistaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {movimientoinventario.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {movimientoinventario.setporcentaje_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {movimientoinventario.setsuman((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {movimientoinventario.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {movimientoinventario.setvalor_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {movimientoinventario.settotal_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {movimientoinventario.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {movimientoinventario.setstock((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {movimientoinventario.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {movimientoinventario.settotal_otro((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {movimientoinventario.setultimo_costo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {movimientoinventario.setnumero_items((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {movimientoinventario.setretencion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {movimientoinventario.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public MovimientoInventarioModel(JInternalFrameBase jInternalFrameBase) {
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
		private MovimientoInventarioDetalleFormJInternalFrame movimientoinventarioJInternalFrame=null;
		
		public MovimientoInventarioModel(MovimientoInventarioDetalleFormJInternalFrame movimientoinventarioJInternalFrame) {
			this.movimientoinventarioJInternalFrame=movimientoinventarioJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.movimientoinventarioJInternalFrame.getjButtonActualizarToolBarMovimientoInventario();
			
			if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.getjButtonActualizarToolBarMovimientoInventario())) {
				componentTab=this.movimientoinventarioJInternalFrame.getjButtonEliminarToolBarMovimientoInventario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.getjButtonEliminarToolBarMovimientoInventario())) {
				componentTab=this.movimientoinventarioJInternalFrame.getjButtonCancelarToolBarMovimientoInventario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.getjButtonCancelarToolBarMovimientoInventario())) {
				componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_empresaMovimientoInventario;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jDateChooserfechaMovimientoInventario)) {
				componentTab=this.movimientoinventarioJInternalFrame.jComboBoxTiposAccionesFormularioMovimientoInventario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxTiposAccionesFormularioMovimientoInventario)) {
				componentTab=this.movimientoinventarioJInternalFrame.jButtonEliminarMovimientoInventario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jButtonEliminarMovimientoInventario)) {
				componentTab=this.movimientoinventarioJInternalFrame.jButtonActualizarMovimientoInventario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jButtonActualizarMovimientoInventario)) {
				componentTab=this.movimientoinventarioJInternalFrame.jButtonCancelarMovimientoInventario;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_empresaMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_sucursalMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_sucursalMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_moduloMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_moduloMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_ejercicioMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_ejercicioMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_periodoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_periodoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_anioMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_anioMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_mesMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_mesMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_usuarioMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_usuarioMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_transaccionMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_transaccionMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jDateChooserfecha_emisionMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jDateChooserfecha_emisionMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jDateChooserfecha_entregaMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jDateChooserfecha_entregaMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_monedaMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_monedaMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_tipo_cambioMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_tipo_cambioMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_empleadoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_empleadoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_formatoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_formatoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_facturaMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_facturaMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldnumero_facturaMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldnumero_facturaMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_guia_remisionMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_guia_remisionMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_transportistaMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_transportistaMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextAreadescripcionMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextAreadescripcionMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldporcentaje_descuentoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldporcentaje_descuentoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldsumanMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldsumanMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldiceMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldiceMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldvalor_descuentoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldvalor_descuentoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldtotal_descuentoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldtotal_descuentoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldivaMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldivaMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldstockMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldstockMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldsub_totalMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldsub_totalMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldtotal_otroMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldtotal_otroMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldultimo_costoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldultimo_costoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldnumero_itemsMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldnumero_itemsMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldretencionMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldretencionMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldtotalMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldtotalMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldfleteMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldfleteMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldimpuestoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldimpuestoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_tipo_transaccion_moduloMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_tipo_transaccion_moduloMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_compraMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_compraMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_asiento_contableMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_asiento_contableMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldgenerico_idMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldgenerico_idMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldtipo_idMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldtipo_idMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldnumero_comprobanteMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldnumero_comprobanteMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jDateChooserfechaMovimientoInventario;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.movimientoinventarioJInternalFrame.getjButtonActualizarToolBarMovimientoInventario();
			
			if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.getjButtonEliminarToolBarMovimientoInventario())) {
				componentTab=this.movimientoinventarioJInternalFrame.getjButtonActualizarToolBarMovimientoInventario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.getjButtonCancelarToolBarMovimientoInventario())) {
				componentTab=this.movimientoinventarioJInternalFrame.getjButtonEliminarToolBarMovimientoInventario();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_empresaMovimientoInventario)) {
				
				componentTab=this.movimientoinventarioJInternalFrame.getjButtonCancelarToolBarMovimientoInventario();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxTiposAccionesFormularioMovimientoInventario)) {
				componentTab=this.movimientoinventarioJInternalFrame.jDateChooserfechaMovimientoInventario;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jButtonEliminarMovimientoInventario)) {
				componentTab=this.movimientoinventarioJInternalFrame.jComboBoxTiposAccionesFormularioMovimientoInventario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jButtonActualizarMovimientoInventario)) {
				componentTab=this.movimientoinventarioJInternalFrame.jButtonEliminarMovimientoInventario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jButtonCancelarMovimientoInventario)) {
				componentTab=this.movimientoinventarioJInternalFrame.jButtonActualizarMovimientoInventario;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_sucursalMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_empresaMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_moduloMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_sucursalMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_ejercicioMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_moduloMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_periodoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_ejercicioMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_anioMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_periodoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_mesMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_anioMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_usuarioMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_mesMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_transaccionMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_usuarioMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jDateChooserfecha_emisionMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_transaccionMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jDateChooserfecha_entregaMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jDateChooserfecha_emisionMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_monedaMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jDateChooserfecha_entregaMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_tipo_cambioMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_monedaMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_empleadoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_tipo_cambioMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_formatoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_empleadoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_facturaMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_formatoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldnumero_facturaMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_facturaMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_guia_remisionMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldnumero_facturaMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_transportistaMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_guia_remisionMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextAreadescripcionMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_transportistaMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldporcentaje_descuentoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextAreadescripcionMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldsumanMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldporcentaje_descuentoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldiceMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldsumanMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldvalor_descuentoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldiceMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldtotal_descuentoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldvalor_descuentoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldivaMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldtotal_descuentoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldstockMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldivaMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldsub_totalMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldstockMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldtotal_otroMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldsub_totalMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldultimo_costoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldtotal_otroMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldnumero_itemsMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldultimo_costoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldretencionMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldnumero_itemsMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldtotalMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldretencionMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldfleteMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldtotalMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldimpuestoMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldfleteMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_tipo_transaccion_moduloMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldimpuestoMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_compraMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_tipo_transaccion_moduloMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jComboBoxid_asiento_contableMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_compraMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldgenerico_idMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jComboBoxid_asiento_contableMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldtipo_idMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldgenerico_idMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jTextFieldnumero_comprobanteMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldtipo_idMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoinventarioJInternalFrame.jDateChooserfechaMovimientoInventario)) {
			componentTab=this.movimientoinventarioJInternalFrame.jTextFieldnumero_comprobanteMovimientoInventario;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.movimientoinventarioJInternalFrame.getjButtonActualizarToolBarMovimientoInventario();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.movimientoinventarioJInternalFrame.getjButtonActualizarToolBarMovimientoInventario();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.movimientoinventarioJInternalFrame.getjButtonCancelarToolBarMovimientoInventario();
			
			
			return componentTab;		
		}
		
		public MovimientoInventarioDetalleFormJInternalFrame getmovimientoinventarioJInternalFrame() {
			return this.movimientoinventarioJInternalFrame;
		}
		
		public void setmovimientoinventarioJInternalFrame(MovimientoInventarioDetalleFormJInternalFrame movimientoinventarioJInternalFrame) {
			this.movimientoinventarioJInternalFrame=movimientoinventarioJInternalFrame;
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
