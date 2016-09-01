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

import com.bydan.erp.facturacion.util.ParametroFactuPrincipalConstantesFunciones;
import com.bydan.erp.facturacion.util.ParametroFactuPrincipalParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.ParametroFactuPrincipalParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ParametroFactuPrincipalBeanSwingJInternalFrame;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ParametroFactuPrincipalJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ParametroFactuPrincipalDetalleFormJInternalFrame;

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

public class ParametroFactuPrincipalModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ParametroFactuPrincipalConstantesFunciones.LABEL_ID
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDEMPRESA
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDSUCURSAL
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPOPARAMFACTUDESCUENTO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPOPARAMFACTULISTADOCLIENTE
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPOPARAMFACTUSECUENCIATRABAJO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPODOCUMENTOFACTURA
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPODOCUMENTONOTACREDITO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPODOCUMENTONOTADEBITO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_ENLINEA
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONCUENTATIPOCLIENTE
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONCLIENTEIMPUESTO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDLIBROCONTABLE
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDMONEDA
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONIMPRESION
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDFORMATO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONSECUENCIALUSUARIO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONSECUENCIALEDITABLE
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONPRECIOPORCLIENTE
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONMODIFICARPRECIO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONMODIFICARSERVICIO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONCAMBIARUNIDAD
										,ParametroFactuPrincipalConstantesFunciones.LABEL_NUMERODECIMALESUNIDAD
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONACTIVARSERIE
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONACTIVARLOTE
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONACTIVARMULTIEMPRESA
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONCENTROCOSTOS
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONUNIDADES
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONCUPODISPONIBLE
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONFORMAPAGO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONENVIOMAIL
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONAUTORIZARPROFORMA
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONBLOQUEOPEDIDO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONCONTROLANTICIPO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONFACTURAAUTO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONGRABARVALORCERO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONAGREGARITEM
										,ParametroFactuPrincipalConstantesFunciones.LABEL_NUMEROCOPIAS
										,ParametroFactuPrincipalConstantesFunciones.LABEL_LEYENDA
										,ParametroFactuPrincipalConstantesFunciones.LABEL_CONSINFACTURA
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEFLETEVENTA
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEOTROCARGO
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEFINAN
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEBONI
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEBONIDEVOL
										,ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEICE
										};
	   
	    public List<ParametroFactuPrincipal> parametrofactuprincipals;
	  	 
	    //NO SE UTILIZA
	    public ParametroFactuPrincipalModel(List<ParametroFactuPrincipal> parametrofactuprincipals,JInternalFrameBase jInternalFrameBase) {
	    	this.parametrofactuprincipals=parametrofactuprincipals;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ParametroFactuPrincipalModel(JInternalFrameBase jInternalFrameBase) {
	    	this.parametrofactuprincipals=new ArrayList<ParametroFactuPrincipal>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.parametrofactuprincipals.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.parametrofactuprincipals.get(rowIndex).getIsSelected();
	            
				case 1: return this.parametrofactuprincipals.get(rowIndex).getId();
				case 2: return this.parametrofactuprincipals.get(rowIndex).getid_empresa();
				case 3: return this.parametrofactuprincipals.get(rowIndex).getid_sucursal();
				case 4: return this.parametrofactuprincipals.get(rowIndex).getid_tipo_param_factu_descuento();
				case 5: return this.parametrofactuprincipals.get(rowIndex).getid_tipo_param_factu_listado_cliente();
				case 6: return this.parametrofactuprincipals.get(rowIndex).getid_tipo_param_factu_secuencia_trabajo();
				case 7: return this.parametrofactuprincipals.get(rowIndex).getid_tipo_documento_factura();
				case 8: return this.parametrofactuprincipals.get(rowIndex).getid_tipo_documento_nota_credito();
				case 9: return this.parametrofactuprincipals.get(rowIndex).getid_tipo_documento_nota_debito();
				case 10: return this.parametrofactuprincipals.get(rowIndex).geten_linea();
				case 11: return this.parametrofactuprincipals.get(rowIndex).getcon_cuenta_tipo_cliente();
				case 12: return this.parametrofactuprincipals.get(rowIndex).getcon_cliente_impuesto();
				case 13: return this.parametrofactuprincipals.get(rowIndex).getid_libro_contable();
				case 14: return this.parametrofactuprincipals.get(rowIndex).getid_moneda();
				case 15: return this.parametrofactuprincipals.get(rowIndex).getcon_impresion();
				case 16: return this.parametrofactuprincipals.get(rowIndex).getid_formato();
				case 17: return this.parametrofactuprincipals.get(rowIndex).getcon_secuencial_usuario();
				case 18: return this.parametrofactuprincipals.get(rowIndex).getcon_secuencial_editable();
				case 19: return this.parametrofactuprincipals.get(rowIndex).getcon_precio_por_cliente();
				case 20: return this.parametrofactuprincipals.get(rowIndex).getcon_modificar_precio();
				case 21: return this.parametrofactuprincipals.get(rowIndex).getcon_modificar_servicio();
				case 22: return this.parametrofactuprincipals.get(rowIndex).getcon_cambiar_unidad();
				case 23: return this.parametrofactuprincipals.get(rowIndex).getnumero_decimales_unidad();
				case 24: return this.parametrofactuprincipals.get(rowIndex).getcon_activar_serie();
				case 25: return this.parametrofactuprincipals.get(rowIndex).getcon_activar_lote();
				case 26: return this.parametrofactuprincipals.get(rowIndex).getcon_activar_multi_empresa();
				case 27: return this.parametrofactuprincipals.get(rowIndex).getcon_centro_costos();
				case 28: return this.parametrofactuprincipals.get(rowIndex).getcon_unidades();
				case 29: return this.parametrofactuprincipals.get(rowIndex).getcon_cupo_disponible();
				case 30: return this.parametrofactuprincipals.get(rowIndex).getcon_forma_pago();
				case 31: return this.parametrofactuprincipals.get(rowIndex).getcon_envio_mail();
				case 32: return this.parametrofactuprincipals.get(rowIndex).getcon_autorizar_proforma();
				case 33: return this.parametrofactuprincipals.get(rowIndex).getcon_bloqueo_pedido();
				case 34: return this.parametrofactuprincipals.get(rowIndex).getcon_control_anticipo();
				case 35: return this.parametrofactuprincipals.get(rowIndex).getcon_factura_auto();
				case 36: return this.parametrofactuprincipals.get(rowIndex).getcon_grabar_valor_cero();
				case 37: return this.parametrofactuprincipals.get(rowIndex).getcon_agregar_item();
				case 38: return this.parametrofactuprincipals.get(rowIndex).getnumero_copias();
				case 39: return this.parametrofactuprincipals.get(rowIndex).getleyenda();
				case 40: return this.parametrofactuprincipals.get(rowIndex).getcon_sin_factura();
				case 41: return this.parametrofactuprincipals.get(rowIndex).getid_cuenta_contable_flete_venta();
				case 42: return this.parametrofactuprincipals.get(rowIndex).getid_cuenta_contable_otro_cargo();
				case 43: return this.parametrofactuprincipals.get(rowIndex).getid_cuenta_contable_finan();
				case 44: return this.parametrofactuprincipals.get(rowIndex).getid_cuenta_contable_boni();
				case 45: return this.parametrofactuprincipals.get(rowIndex).getid_cuenta_contable_boni_devol();
				case 46: return this.parametrofactuprincipals.get(rowIndex).getid_cuenta_contable_ice();	            
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
				case 10: return Boolean.class;
				case 11: return Boolean.class;
				case 12: return Boolean.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Boolean.class;
				case 16: return Long.class;
				case 17: return Boolean.class;
				case 18: return Boolean.class;
				case 19: return Boolean.class;
				case 20: return Boolean.class;
				case 21: return Boolean.class;
				case 22: return Boolean.class;
				case 23: return Integer.class;
				case 24: return Boolean.class;
				case 25: return Boolean.class;
				case 26: return Boolean.class;
				case 27: return Boolean.class;
				case 28: return Boolean.class;
				case 29: return Boolean.class;
				case 30: return Boolean.class;
				case 31: return Boolean.class;
				case 32: return Boolean.class;
				case 33: return Boolean.class;
				case 34: return Boolean.class;
				case 35: return Boolean.class;
				case 36: return Boolean.class;
				case 37: return Boolean.class;
				case 38: return Integer.class;
				case 39: return String.class;
				case 40: return Boolean.class;
				case 41: return Long.class;
				case 42: return Long.class;
				case 43: return Long.class;
				case 44: return Long.class;
				case 45: return Long.class;
				case 46: return Long.class;	            
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
				case 44: return true;
				case 45: return true;
				case 46: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ParametroFactuPrincipal parametrofactuprincipal = this.parametrofactuprincipals.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ParametroFactuPrincipalBeanSwingJInternalFrame parametrofactuprincipalBeanSwingJInternalFrame=(ParametroFactuPrincipalBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {parametrofactuprincipal.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {parametrofactuprincipal.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {parametrofactuprincipal.setid_empresa((Long) value);parametrofactuprincipal.setempresa_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {parametrofactuprincipal.setid_sucursal((Long) value);parametrofactuprincipal.setsucursal_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {parametrofactuprincipal.setid_tipo_param_factu_descuento((Long) value);parametrofactuprincipal.settipoparamfactudescuento_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualTipoParamFactuDescuentoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {parametrofactuprincipal.setid_tipo_param_factu_listado_cliente((Long) value);parametrofactuprincipal.settipoparamfactulistadocliente_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualTipoParamFactuListadoClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {parametrofactuprincipal.setid_tipo_param_factu_secuencia_trabajo((Long) value);parametrofactuprincipal.settipoparamfactusecuenciatrabajo_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualTipoParamFactuSecuenciaTrabajoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {parametrofactuprincipal.setid_tipo_documento_factura((Long) value);parametrofactuprincipal.settipodocumentofactura_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualTipoDocumentoFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {parametrofactuprincipal.setid_tipo_documento_nota_credito((Long) value);parametrofactuprincipal.settipodocumentonotacredito_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualTipoDocumentoNotaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {parametrofactuprincipal.setid_tipo_documento_nota_debito((Long) value);parametrofactuprincipal.settipodocumentonotadebito_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualTipoDocumentoNotaDebitoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {parametrofactuprincipal.seten_linea((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {parametrofactuprincipal.setcon_cuenta_tipo_cliente((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {parametrofactuprincipal.setcon_cliente_impuesto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {parametrofactuprincipal.setid_libro_contable((Long) value);parametrofactuprincipal.setlibrocontable_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualLibroContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {parametrofactuprincipal.setid_moneda((Long) value);parametrofactuprincipal.setmoneda_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {parametrofactuprincipal.setcon_impresion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {parametrofactuprincipal.setid_formato((Long) value);parametrofactuprincipal.setformato_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {parametrofactuprincipal.setcon_secuencial_usuario((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {parametrofactuprincipal.setcon_secuencial_editable((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {parametrofactuprincipal.setcon_precio_por_cliente((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {parametrofactuprincipal.setcon_modificar_precio((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {parametrofactuprincipal.setcon_modificar_servicio((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {parametrofactuprincipal.setcon_cambiar_unidad((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {parametrofactuprincipal.setnumero_decimales_unidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {parametrofactuprincipal.setcon_activar_serie((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {parametrofactuprincipal.setcon_activar_lote((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {parametrofactuprincipal.setcon_activar_multi_empresa((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {parametrofactuprincipal.setcon_centro_costos((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {parametrofactuprincipal.setcon_unidades((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {parametrofactuprincipal.setcon_cupo_disponible((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {parametrofactuprincipal.setcon_forma_pago((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {parametrofactuprincipal.setcon_envio_mail((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {parametrofactuprincipal.setcon_autorizar_proforma((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {parametrofactuprincipal.setcon_bloqueo_pedido((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {parametrofactuprincipal.setcon_control_anticipo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {parametrofactuprincipal.setcon_factura_auto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {parametrofactuprincipal.setcon_grabar_valor_cero((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {parametrofactuprincipal.setcon_agregar_item((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {parametrofactuprincipal.setnumero_copias((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {parametrofactuprincipal.setleyenda((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {parametrofactuprincipal.setcon_sin_factura((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {parametrofactuprincipal.setid_cuenta_contable_flete_venta((Long) value);parametrofactuprincipal.setcuentacontablefleteventa_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualCuentaContableFleteVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 42: try {parametrofactuprincipal.setid_cuenta_contable_otro_cargo((Long) value);parametrofactuprincipal.setcuentacontableotrocargo_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualCuentaContableOtroCargoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 43: try {parametrofactuprincipal.setid_cuenta_contable_finan((Long) value);parametrofactuprincipal.setcuentacontablefinan_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualCuentaContableFinanForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 44: try {parametrofactuprincipal.setid_cuenta_contable_boni((Long) value);parametrofactuprincipal.setcuentacontableboni_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualCuentaContableBoniForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 45: try {parametrofactuprincipal.setid_cuenta_contable_boni_devol((Long) value);parametrofactuprincipal.setcuentacontablebonidevol_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualCuentaContableBoniDevolForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 46: try {parametrofactuprincipal.setid_cuenta_contable_ice((Long) value);parametrofactuprincipal.setcuentacontableice_descripcion(parametrofactuprincipalBeanSwingJInternalFrame.getActualCuentaContableIceForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private ParametroFactuPrincipalDetalleFormJInternalFrame parametrofactuprincipalJInternalFrame=null;
		
		public ParametroFactuPrincipalModel(ParametroFactuPrincipalDetalleFormJInternalFrame parametrofactuprincipalJInternalFrame) {
			this.parametrofactuprincipalJInternalFrame=parametrofactuprincipalJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrofactuprincipalJInternalFrame.getjButtonActualizarToolBarParametroFactuPrincipal();
			
			if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.getjButtonActualizarToolBarParametroFactuPrincipal())) {
				componentTab=this.parametrofactuprincipalJInternalFrame.getjButtonEliminarToolBarParametroFactuPrincipal();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.getjButtonEliminarToolBarParametroFactuPrincipal())) {
				componentTab=this.parametrofactuprincipalJInternalFrame.getjButtonCancelarToolBarParametroFactuPrincipal();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.getjButtonCancelarToolBarParametroFactuPrincipal())) {
				componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_empresaParametroFactuPrincipal;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_iceParametroFactuPrincipal)) {
				componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactuPrincipal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactuPrincipal)) {
				componentTab=this.parametrofactuprincipalJInternalFrame.jButtonEliminarParametroFactuPrincipal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jButtonEliminarParametroFactuPrincipal)) {
				componentTab=this.parametrofactuprincipalJInternalFrame.jButtonActualizarParametroFactuPrincipal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jButtonActualizarParametroFactuPrincipal)) {
				componentTab=this.parametrofactuprincipalJInternalFrame.jButtonCancelarParametroFactuPrincipal;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_empresaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_sucursalParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_sucursalParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_documento_facturaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_documento_facturaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxen_lineaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxen_lineaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cuenta_tipo_clienteParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cuenta_tipo_clienteParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cliente_impuestoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cliente_impuestoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_libro_contableParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_libro_contableParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_monedaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_monedaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_impresionParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_impresionParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_formatoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_formatoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_secuencial_usuarioParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_secuencial_usuarioParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_secuencial_editableParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_secuencial_editableParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_precio_por_clienteParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_precio_por_clienteParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_modificar_precioParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_modificar_precioParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_modificar_servicioParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_modificar_servicioParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cambiar_unidadParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cambiar_unidadParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jTextFieldnumero_decimales_unidadParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jTextFieldnumero_decimales_unidadParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_activar_serieParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_activar_serieParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_activar_loteParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_activar_loteParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_activar_multi_empresaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_activar_multi_empresaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_centro_costosParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_centro_costosParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_unidadesParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_unidadesParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cupo_disponibleParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cupo_disponibleParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_forma_pagoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_forma_pagoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_envio_mailParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_envio_mailParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_autorizar_proformaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_autorizar_proformaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_bloqueo_pedidoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_bloqueo_pedidoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_control_anticipoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_control_anticipoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_factura_autoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_factura_autoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_grabar_valor_ceroParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_grabar_valor_ceroParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_agregar_itemParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_agregar_itemParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jTextFieldnumero_copiasParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jTextFieldnumero_copiasParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jTextArealeyendaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jTextArealeyendaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_sin_facturaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_sin_facturaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_finanParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_finanParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_boniParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_boniParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_iceParametroFactuPrincipal;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrofactuprincipalJInternalFrame.getjButtonActualizarToolBarParametroFactuPrincipal();
			
			if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.getjButtonEliminarToolBarParametroFactuPrincipal())) {
				componentTab=this.parametrofactuprincipalJInternalFrame.getjButtonActualizarToolBarParametroFactuPrincipal();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.getjButtonCancelarToolBarParametroFactuPrincipal())) {
				componentTab=this.parametrofactuprincipalJInternalFrame.getjButtonEliminarToolBarParametroFactuPrincipal();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_empresaParametroFactuPrincipal)) {
				
				componentTab=this.parametrofactuprincipalJInternalFrame.getjButtonCancelarToolBarParametroFactuPrincipal();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactuPrincipal)) {
				componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_iceParametroFactuPrincipal;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jButtonEliminarParametroFactuPrincipal)) {
				componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactuPrincipal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jButtonActualizarParametroFactuPrincipal)) {
				componentTab=this.parametrofactuprincipalJInternalFrame.jButtonEliminarParametroFactuPrincipal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jButtonCancelarParametroFactuPrincipal)) {
				componentTab=this.parametrofactuprincipalJInternalFrame.jButtonActualizarParametroFactuPrincipal;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_sucursalParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_empresaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_sucursalParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_documento_facturaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_documento_facturaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxen_lineaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cuenta_tipo_clienteParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxen_lineaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cliente_impuestoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cuenta_tipo_clienteParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_libro_contableParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cliente_impuestoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_monedaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_libro_contableParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_impresionParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_monedaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_formatoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_impresionParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_secuencial_usuarioParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_formatoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_secuencial_editableParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_secuencial_usuarioParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_precio_por_clienteParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_secuencial_editableParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_modificar_precioParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_precio_por_clienteParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_modificar_servicioParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_modificar_precioParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cambiar_unidadParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_modificar_servicioParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jTextFieldnumero_decimales_unidadParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cambiar_unidadParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_activar_serieParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jTextFieldnumero_decimales_unidadParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_activar_loteParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_activar_serieParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_activar_multi_empresaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_activar_loteParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_centro_costosParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_activar_multi_empresaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_unidadesParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_centro_costosParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cupo_disponibleParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_unidadesParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_forma_pagoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_cupo_disponibleParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_envio_mailParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_forma_pagoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_autorizar_proformaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_envio_mailParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_bloqueo_pedidoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_autorizar_proformaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_control_anticipoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_bloqueo_pedidoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_factura_autoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_control_anticipoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_grabar_valor_ceroParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_factura_autoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_agregar_itemParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_grabar_valor_ceroParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jTextFieldnumero_copiasParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_agregar_itemParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jTextArealeyendaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jTextFieldnumero_copiasParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_sin_facturaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jTextArealeyendaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jCheckBoxcon_sin_facturaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_finanParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_boniParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_finanParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_boniParametroFactuPrincipal;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_iceParametroFactuPrincipal)) {
			componentTab=this.parametrofactuprincipalJInternalFrame.jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrofactuprincipalJInternalFrame.getjButtonActualizarToolBarParametroFactuPrincipal();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrofactuprincipalJInternalFrame.getjButtonActualizarToolBarParametroFactuPrincipal();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrofactuprincipalJInternalFrame.getjButtonCancelarToolBarParametroFactuPrincipal();
			
			
			return componentTab;		
		}
		
		public ParametroFactuPrincipalDetalleFormJInternalFrame getparametrofactuprincipalJInternalFrame() {
			return this.parametrofactuprincipalJInternalFrame;
		}
		
		public void setparametrofactuprincipalJInternalFrame(ParametroFactuPrincipalDetalleFormJInternalFrame parametrofactuprincipalJInternalFrame) {
			this.parametrofactuprincipalJInternalFrame=parametrofactuprincipalJInternalFrame;
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
