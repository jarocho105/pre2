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


import java.sql.Time;


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

import com.bydan.erp.facturacion.util.GuiaRemisionConstantesFunciones;
import com.bydan.erp.facturacion.util.GuiaRemisionParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.GuiaRemisionParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.GuiaRemisionBeanSwingJInternalFrame;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.GuiaRemisionJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.GuiaRemisionDetalleFormJInternalFrame;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class GuiaRemisionModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,GuiaRemisionConstantesFunciones.LABEL_ID
										,GuiaRemisionConstantesFunciones.LABEL_IDEMPRESA
										,GuiaRemisionConstantesFunciones.LABEL_IDSUCURSAL
										,GuiaRemisionConstantesFunciones.LABEL_IDEJERCICIO
										,GuiaRemisionConstantesFunciones.LABEL_IDPERIODO
										,GuiaRemisionConstantesFunciones.LABEL_IDUSUARIO
										,GuiaRemisionConstantesFunciones.LABEL_SECUENCIAL
										,GuiaRemisionConstantesFunciones.LABEL_FECHAEMISION
										,GuiaRemisionConstantesFunciones.LABEL_IDFORMATO
										,GuiaRemisionConstantesFunciones.LABEL_IDTIPOPRECIO
										,GuiaRemisionConstantesFunciones.LABEL_IDMONEDA
										,GuiaRemisionConstantesFunciones.LABEL_NUMEROCAMION
										,GuiaRemisionConstantesFunciones.LABEL_IDCLIENTE
										,GuiaRemisionConstantesFunciones.LABEL_IDVENDEDOR
										,GuiaRemisionConstantesFunciones.LABEL_IDFACTURA
										,GuiaRemisionConstantesFunciones.LABEL_IDTRANSPORTISTA
										,GuiaRemisionConstantesFunciones.LABEL_IDENTIFICACION
										,GuiaRemisionConstantesFunciones.LABEL_FECHAORIGEN
										,GuiaRemisionConstantesFunciones.LABEL_FECHADESTINO
										,GuiaRemisionConstantesFunciones.LABEL_TRANSPORTECODIGO
										,GuiaRemisionConstantesFunciones.LABEL_CANTIDADBULTOS
										,GuiaRemisionConstantesFunciones.LABEL_IDCONSULTOR
										,GuiaRemisionConstantesFunciones.LABEL_IDTRANSPORTE
										,GuiaRemisionConstantesFunciones.LABEL_IDSUBCLIENTE
										,GuiaRemisionConstantesFunciones.LABEL_IDEMPLEADO
										,GuiaRemisionConstantesFunciones.LABEL_IDCIUDADORIGEN
										,GuiaRemisionConstantesFunciones.LABEL_IDCIUDADDESTINO
										,GuiaRemisionConstantesFunciones.LABEL_IDTIPOLLAMADA
										,GuiaRemisionConstantesFunciones.LABEL_HORAINICIO
										,GuiaRemisionConstantesFunciones.LABEL_HORAFIN
										,GuiaRemisionConstantesFunciones.LABEL_CUPO
										,GuiaRemisionConstantesFunciones.LABEL_SALDO
										,GuiaRemisionConstantesFunciones.LABEL_DOCUMENTO
										,GuiaRemisionConstantesFunciones.LABEL_DISPONIBLE
										,GuiaRemisionConstantesFunciones.LABEL_DESCRIPCION
										,GuiaRemisionConstantesFunciones.LABEL_TOTALIVA
										,GuiaRemisionConstantesFunciones.LABEL_TOTALSINIVA
										,GuiaRemisionConstantesFunciones.LABEL_DESCUENTO
										,GuiaRemisionConstantesFunciones.LABEL_FLETE
										,GuiaRemisionConstantesFunciones.LABEL_OTRO
										,GuiaRemisionConstantesFunciones.LABEL_FINANCIAMIENTO
										,GuiaRemisionConstantesFunciones.LABEL_IVA
										,GuiaRemisionConstantesFunciones.LABEL_TOTAL
										};
	   
	    public List<GuiaRemision> guiaremisions;
	  	 
	    //NO SE UTILIZA
	    public GuiaRemisionModel(List<GuiaRemision> guiaremisions,JInternalFrameBase jInternalFrameBase) {
	    	this.guiaremisions=guiaremisions;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public GuiaRemisionModel(JInternalFrameBase jInternalFrameBase) {
	    	this.guiaremisions=new ArrayList<GuiaRemision>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.guiaremisions.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.guiaremisions.get(rowIndex).getIsSelected();
	            
				case 1: return this.guiaremisions.get(rowIndex).getId();
				case 2: return this.guiaremisions.get(rowIndex).getid_empresa();
				case 3: return this.guiaremisions.get(rowIndex).getid_sucursal();
				case 4: return this.guiaremisions.get(rowIndex).getid_ejercicio();
				case 5: return this.guiaremisions.get(rowIndex).getid_periodo();
				case 6: return this.guiaremisions.get(rowIndex).getid_usuario();
				case 7: return this.guiaremisions.get(rowIndex).getsecuencial();
				case 8: return this.guiaremisions.get(rowIndex).getfecha_emision();
				case 9: return this.guiaremisions.get(rowIndex).getid_formato();
				case 10: return this.guiaremisions.get(rowIndex).getid_tipo_precio();
				case 11: return this.guiaremisions.get(rowIndex).getid_moneda();
				case 12: return this.guiaremisions.get(rowIndex).getnumero_camion();
				case 13: return this.guiaremisions.get(rowIndex).getid_cliente();
				case 14: return this.guiaremisions.get(rowIndex).getid_vendedor();
				case 15: return this.guiaremisions.get(rowIndex).getid_factura();
				case 16: return this.guiaremisions.get(rowIndex).getid_transportista();
				case 17: return this.guiaremisions.get(rowIndex).getidentificacion();
				case 18: return this.guiaremisions.get(rowIndex).getfecha_origen();
				case 19: return this.guiaremisions.get(rowIndex).getfecha_destino();
				case 20: return this.guiaremisions.get(rowIndex).gettransporte_codigo();
				case 21: return this.guiaremisions.get(rowIndex).getcantidad_bultos();
				case 22: return this.guiaremisions.get(rowIndex).getid_consultor();
				case 23: return this.guiaremisions.get(rowIndex).getid_transporte();
				case 24: return this.guiaremisions.get(rowIndex).getid_sub_cliente();
				case 25: return this.guiaremisions.get(rowIndex).getid_empleado();
				case 26: return this.guiaremisions.get(rowIndex).getid_ciudad_origen();
				case 27: return this.guiaremisions.get(rowIndex).getid_ciudad_destino();
				case 28: return this.guiaremisions.get(rowIndex).getid_tipo_llamada();
				case 29: return this.guiaremisions.get(rowIndex).gethora_inicio();
				case 30: return this.guiaremisions.get(rowIndex).gethora_fin();
				case 31: return this.guiaremisions.get(rowIndex).getcupo();
				case 32: return this.guiaremisions.get(rowIndex).getsaldo();
				case 33: return this.guiaremisions.get(rowIndex).getdocumento();
				case 34: return this.guiaremisions.get(rowIndex).getdisponible();
				case 35: return this.guiaremisions.get(rowIndex).getdescripcion();
				case 36: return this.guiaremisions.get(rowIndex).gettotal_iva();
				case 37: return this.guiaremisions.get(rowIndex).gettotal_sin_iva();
				case 38: return this.guiaremisions.get(rowIndex).getdescuento();
				case 39: return this.guiaremisions.get(rowIndex).getflete();
				case 40: return this.guiaremisions.get(rowIndex).getotro();
				case 41: return this.guiaremisions.get(rowIndex).getfinanciamiento();
				case 42: return this.guiaremisions.get(rowIndex).getiva();
				case 43: return this.guiaremisions.get(rowIndex).gettotal();	            
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
				case 7: return String.class;
				case 8: return Date.class;
				case 9: return Long.class;
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return String.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return String.class;
				case 18: return Date.class;
				case 19: return Date.class;
				case 20: return String.class;
				case 21: return Integer.class;
				case 22: return Long.class;
				case 23: return Long.class;
				case 24: return Long.class;
				case 25: return Long.class;
				case 26: return Long.class;
				case 27: return Long.class;
				case 28: return Long.class;
				case 29: return Time.class;
				case 30: return Time.class;
				case 31: return Double.class;
				case 32: return Double.class;
				case 33: return Double.class;
				case 34: return Double.class;
				case 35: return String.class;
				case 36: return Double.class;
				case 37: return Double.class;
				case 38: return Double.class;
				case 39: return Double.class;
				case 40: return Double.class;
				case 41: return Double.class;
				case 42: return Double.class;
				case 43: return Double.class;	            
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
				case 41: return true;
				case 42: return true;
				case 43: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	GuiaRemision guiaremision = this.guiaremisions.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame=(GuiaRemisionBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {guiaremision.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {guiaremision.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {guiaremision.setid_empresa((Long) value);guiaremision.setempresa_descripcion(guiaremisionBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {guiaremision.setid_sucursal((Long) value);guiaremision.setsucursal_descripcion(guiaremisionBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {guiaremision.setid_ejercicio((Long) value);guiaremision.setejercicio_descripcion(guiaremisionBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {guiaremision.setid_periodo((Long) value);guiaremision.setperiodo_descripcion(guiaremisionBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {guiaremision.setid_usuario((Long) value);guiaremision.setusuario_descripcion(guiaremisionBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {guiaremision.setsecuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {guiaremision.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {guiaremision.setid_formato((Long) value);guiaremision.setformato_descripcion(guiaremisionBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {guiaremision.setid_tipo_precio((Long) value);guiaremision.settipoprecio_descripcion(guiaremisionBeanSwingJInternalFrame.getActualTipoPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {guiaremision.setid_moneda((Long) value);guiaremision.setmoneda_descripcion(guiaremisionBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {guiaremision.setnumero_camion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {guiaremision.setid_cliente((Long) value);guiaremision.setcliente_descripcion(guiaremisionBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {guiaremision.setid_vendedor((Long) value);guiaremision.setvendedor_descripcion(guiaremisionBeanSwingJInternalFrame.getActualVendedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {guiaremision.setid_factura((Long) value);guiaremision.setfactura_descripcion(guiaremisionBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {guiaremision.setid_transportista((Long) value);guiaremision.settransportista_descripcion(guiaremisionBeanSwingJInternalFrame.getActualTransportistaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {guiaremision.setidentificacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {guiaremision.setfecha_origen((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {guiaremision.setfecha_destino((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {guiaremision.settransporte_codigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {guiaremision.setcantidad_bultos((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {guiaremision.setid_consultor((Long) value);guiaremision.setconsultor_descripcion(guiaremisionBeanSwingJInternalFrame.getActualConsultorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {guiaremision.setid_transporte((Long) value);guiaremision.settransporte_descripcion(guiaremisionBeanSwingJInternalFrame.getActualTransporteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {guiaremision.setid_sub_cliente((Long) value);guiaremision.setsubcliente_descripcion(guiaremisionBeanSwingJInternalFrame.getActualSubClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {guiaremision.setid_empleado((Long) value);guiaremision.setempleado_descripcion(guiaremisionBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {guiaremision.setid_ciudad_origen((Long) value);guiaremision.setciudadorigen_descripcion(guiaremisionBeanSwingJInternalFrame.getActualCiudadOrigenForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {guiaremision.setid_ciudad_destino((Long) value);guiaremision.setciudaddestino_descripcion(guiaremisionBeanSwingJInternalFrame.getActualCiudadDestinoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {guiaremision.setid_tipo_llamada((Long) value);guiaremision.settipollamada_descripcion(guiaremisionBeanSwingJInternalFrame.getActualTipoLlamadaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {guiaremision.sethora_inicio((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {guiaremision.sethora_fin((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {guiaremision.setcupo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {guiaremision.setsaldo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {guiaremision.setdocumento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {guiaremision.setdisponible((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {guiaremision.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {guiaremision.settotal_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {guiaremision.settotal_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {guiaremision.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {guiaremision.setflete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {guiaremision.setotro((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {guiaremision.setfinanciamiento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 42: try {guiaremision.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 43: try {guiaremision.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public GuiaRemisionModel(JInternalFrameBase jInternalFrameBase) {
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
		private GuiaRemisionDetalleFormJInternalFrame guiaremisionJInternalFrame=null;
		
		public GuiaRemisionModel(GuiaRemisionDetalleFormJInternalFrame guiaremisionJInternalFrame) {
			this.guiaremisionJInternalFrame=guiaremisionJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.guiaremisionJInternalFrame.getjButtonActualizarToolBarGuiaRemision();
			
			if(component!=null && component.equals(this.guiaremisionJInternalFrame.getjButtonActualizarToolBarGuiaRemision())) {
				componentTab=this.guiaremisionJInternalFrame.getjButtonEliminarToolBarGuiaRemision();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.guiaremisionJInternalFrame.getjButtonEliminarToolBarGuiaRemision())) {
				componentTab=this.guiaremisionJInternalFrame.getjButtonCancelarToolBarGuiaRemision();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.guiaremisionJInternalFrame.getjButtonCancelarToolBarGuiaRemision())) {
				componentTab=this.guiaremisionJInternalFrame.jComboBoxid_empresaGuiaRemision;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.guiaremisionJInternalFrame.jDateChooserfecha_vencimientoGuiaRemision)) {
				componentTab=this.guiaremisionJInternalFrame.jComboBoxTiposAccionesFormularioGuiaRemision;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxTiposAccionesFormularioGuiaRemision)) {
				componentTab=this.guiaremisionJInternalFrame.jButtonEliminarGuiaRemision;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.guiaremisionJInternalFrame.jButtonEliminarGuiaRemision)) {
				componentTab=this.guiaremisionJInternalFrame.jButtonActualizarGuiaRemision;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.guiaremisionJInternalFrame.jButtonActualizarGuiaRemision)) {
				componentTab=this.guiaremisionJInternalFrame.jButtonCancelarGuiaRemision;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_empresaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_sucursalGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_sucursalGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_ejercicioGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_ejercicioGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_periodoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_periodoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_usuarioGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_usuarioGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldsecuencialGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldsecuencialGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jDateChooserfecha_emisionGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jDateChooserfecha_emisionGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_formatoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_formatoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_tipo_precioGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_tipo_precioGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_monedaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_monedaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldnumero_camionGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldnumero_camionGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_clienteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_clienteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_vendedorGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_vendedorGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_facturaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_facturaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_transportistaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_transportistaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldidentificacionGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldidentificacionGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jDateChooserfecha_origenGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jDateChooserfecha_origenGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jDateChooserfecha_destinoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jDateChooserfecha_destinoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextAreatransporte_codigoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextAreatransporte_codigoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldcantidad_bultosGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldcantidad_bultosGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_consultorGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_consultorGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_transporteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_transporteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_sub_clienteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_sub_clienteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_empleadoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_empleadoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_ciudad_origenGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_ciudad_origenGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_ciudad_destinoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_ciudad_destinoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_tipo_llamadaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_tipo_llamadaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jSpinnerhora_inicioGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jSpinnerhora_inicioGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jSpinnerhora_finGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jSpinnerhora_finGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldcupoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldcupoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldsaldoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldsaldoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFielddocumentoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFielddocumentoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFielddisponibleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFielddisponibleGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextAreadescripcionGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextAreadescripcionGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldtotal_ivaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldtotal_ivaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldtotal_sin_ivaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldtotal_sin_ivaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFielddescuentoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFielddescuentoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldfleteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldfleteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldotroGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldotroGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldfinanciamientoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldfinanciamientoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldivaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldivaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldtotalGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldtotalGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldmonto_retencionGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldmonto_retencionGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_tipo_cambioGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_tipo_cambioGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jDateChooserfechaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jDateChooserfechaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldruc_clienteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldruc_clienteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextAreanombre_clienteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextAreanombre_clienteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextAreatelefono_clienteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextAreatelefono_clienteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextAreadireccion_clienteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextAreadireccion_clienteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldnumero_pre_impresoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldnumero_pre_impresoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldpeso_brutoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldpeso_brutoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jDateChooserfecha_autorizacionGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jDateChooserfecha_autorizacionGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jDateChooserfecha_vencimientoGuiaRemision;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.guiaremisionJInternalFrame.getjButtonActualizarToolBarGuiaRemision();
			
			if(component!=null && component.equals(this.guiaremisionJInternalFrame.getjButtonEliminarToolBarGuiaRemision())) {
				componentTab=this.guiaremisionJInternalFrame.getjButtonActualizarToolBarGuiaRemision();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.guiaremisionJInternalFrame.getjButtonCancelarToolBarGuiaRemision())) {
				componentTab=this.guiaremisionJInternalFrame.getjButtonEliminarToolBarGuiaRemision();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_empresaGuiaRemision)) {
				
				componentTab=this.guiaremisionJInternalFrame.getjButtonCancelarToolBarGuiaRemision();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxTiposAccionesFormularioGuiaRemision)) {
				componentTab=this.guiaremisionJInternalFrame.jDateChooserfecha_vencimientoGuiaRemision;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.guiaremisionJInternalFrame.jButtonEliminarGuiaRemision)) {
				componentTab=this.guiaremisionJInternalFrame.jComboBoxTiposAccionesFormularioGuiaRemision;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.guiaremisionJInternalFrame.jButtonActualizarGuiaRemision)) {
				componentTab=this.guiaremisionJInternalFrame.jButtonEliminarGuiaRemision;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.guiaremisionJInternalFrame.jButtonCancelarGuiaRemision)) {
				componentTab=this.guiaremisionJInternalFrame.jButtonActualizarGuiaRemision;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_sucursalGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_empresaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_ejercicioGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_sucursalGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_periodoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_ejercicioGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_usuarioGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_periodoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldsecuencialGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_usuarioGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jDateChooserfecha_emisionGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldsecuencialGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_formatoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jDateChooserfecha_emisionGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_tipo_precioGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_formatoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_monedaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_tipo_precioGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldnumero_camionGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_monedaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_clienteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldnumero_camionGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_vendedorGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_clienteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_facturaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_vendedorGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_transportistaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_facturaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldidentificacionGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_transportistaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jDateChooserfecha_origenGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldidentificacionGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jDateChooserfecha_destinoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jDateChooserfecha_origenGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextAreatransporte_codigoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jDateChooserfecha_destinoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldcantidad_bultosGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextAreatransporte_codigoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_consultorGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldcantidad_bultosGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_transporteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_consultorGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_sub_clienteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_transporteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_empleadoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_sub_clienteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_ciudad_origenGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_empleadoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_ciudad_destinoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_ciudad_origenGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_tipo_llamadaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_ciudad_destinoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jSpinnerhora_inicioGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_tipo_llamadaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jSpinnerhora_finGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jSpinnerhora_inicioGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldcupoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jSpinnerhora_finGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldsaldoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldcupoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFielddocumentoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldsaldoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFielddisponibleGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFielddocumentoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextAreadescripcionGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFielddisponibleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldtotal_ivaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextAreadescripcionGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldtotal_sin_ivaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldtotal_ivaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFielddescuentoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldtotal_sin_ivaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldfleteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFielddescuentoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldotroGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldfleteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldfinanciamientoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldotroGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldivaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldfinanciamientoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldtotalGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldivaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldmonto_retencionGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldtotalGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jComboBoxid_tipo_cambioGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldmonto_retencionGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jDateChooserfechaGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jComboBoxid_tipo_cambioGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldruc_clienteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jDateChooserfechaGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextAreanombre_clienteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldruc_clienteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextAreatelefono_clienteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextAreanombre_clienteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextAreadireccion_clienteGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextAreatelefono_clienteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldnumero_pre_impresoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextAreadireccion_clienteGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jTextFieldpeso_brutoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldnumero_pre_impresoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jDateChooserfecha_autorizacionGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jTextFieldpeso_brutoGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.guiaremisionJInternalFrame.jDateChooserfecha_vencimientoGuiaRemision)) {
			componentTab=this.guiaremisionJInternalFrame.jDateChooserfecha_autorizacionGuiaRemision;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.guiaremisionJInternalFrame.getjButtonActualizarToolBarGuiaRemision();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.guiaremisionJInternalFrame.getjButtonActualizarToolBarGuiaRemision();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.guiaremisionJInternalFrame.getjButtonCancelarToolBarGuiaRemision();
			
			
			return componentTab;		
		}
		
		public GuiaRemisionDetalleFormJInternalFrame getguiaremisionJInternalFrame() {
			return this.guiaremisionJInternalFrame;
		}
		
		public void setguiaremisionJInternalFrame(GuiaRemisionDetalleFormJInternalFrame guiaremisionJInternalFrame) {
			this.guiaremisionJInternalFrame=guiaremisionJInternalFrame;
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
