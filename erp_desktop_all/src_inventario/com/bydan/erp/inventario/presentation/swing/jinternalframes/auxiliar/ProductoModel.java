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

import com.bydan.erp.inventario.util.ProductoConstantesFunciones;
import com.bydan.erp.inventario.util.ProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ProductoParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.ProductoBeanSwingJInternalFrame;
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
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.ProductoJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.ProductoDetalleFormJInternalFrame;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ProductoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ProductoConstantesFunciones.LABEL_ID
										,ProductoConstantesFunciones.LABEL_IDEMPRESA
										,ProductoConstantesFunciones.LABEL_IDSUCURSAL
										,ProductoConstantesFunciones.LABEL_CODIGO
										,ProductoConstantesFunciones.LABEL_NOMBRE
										,ProductoConstantesFunciones.LABEL_NOMBREEXTRANJERO
										,ProductoConstantesFunciones.LABEL_RESUMENDETALLE
										,ProductoConstantesFunciones.LABEL_CODIGOBARRA
										,ProductoConstantesFunciones.LABEL_IDLINEA
										,ProductoConstantesFunciones.LABEL_IDLINEAGRUPO
										,ProductoConstantesFunciones.LABEL_IDLINEACATEGORIA
										,ProductoConstantesFunciones.LABEL_IDLINEAMARCA
										,ProductoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO
										,ProductoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIOINVEN
										,ProductoConstantesFunciones.LABEL_IDTIPOCOSTEO
										,ProductoConstantesFunciones.LABEL_IDUNIDAD
										,ProductoConstantesFunciones.LABEL_IDUNIDADPESO
										,ProductoConstantesFunciones.LABEL_IDARANCEL
										,ProductoConstantesFunciones.LABEL_IDCLIENTE
										,ProductoConstantesFunciones.LABEL_IDCLIENTEPROVEEDORDEFECTO
										,ProductoConstantesFunciones.LABEL_ESTAACTIVO
										,ProductoConstantesFunciones.LABEL_DESCRIPCION
										,ProductoConstantesFunciones.LABEL_PRECIO
										,ProductoConstantesFunciones.LABEL_IVA
										,ProductoConstantesFunciones.LABEL_IVAVALOR
										,ProductoConstantesFunciones.LABEL_ICE
										,ProductoConstantesFunciones.LABEL_ICEVALOR
										,ProductoConstantesFunciones.LABEL_DESCUENTO
										,ProductoConstantesFunciones.LABEL_DESCUENTOVALOR
										,ProductoConstantesFunciones.LABEL_ARANCELPORCENTAJE
										,ProductoConstantesFunciones.LABEL_ARANCELVALOR
										,ProductoConstantesFunciones.LABEL_COMISION
										,ProductoConstantesFunciones.LABEL_COMISIONVALOR
										,ProductoConstantesFunciones.LABEL_DIASPRODUCCION
										,ProductoConstantesFunciones.LABEL_CONSTOCKNEGATIVO
										,ProductoConstantesFunciones.LABEL_CONPRECIOMINIMO
										,ProductoConstantesFunciones.LABEL_CONLOTE
										,ProductoConstantesFunciones.LABEL_CONCONFIRMACION
										,ProductoConstantesFunciones.LABEL_CONPRESUPUESTO
										,ProductoConstantesFunciones.LABEL_CONIMPORTACION
										,ProductoConstantesFunciones.LABEL_CONFINAL
										,ProductoConstantesFunciones.LABEL_CONCONSEP
										,ProductoConstantesFunciones.LABEL_CONSERIE
										,ProductoConstantesFunciones.LABEL_CONBALANZA
										,ProductoConstantesFunciones.LABEL_ALTO
										,ProductoConstantesFunciones.LABEL_ANCHO
										,ProductoConstantesFunciones.LABEL_LARGO
										,ProductoConstantesFunciones.LABEL_VOLUMEN
										,ProductoConstantesFunciones.LABEL_PESO
										,ProductoConstantesFunciones.LABEL_GRAMOS
										,ProductoConstantesFunciones.LABEL_UNIDADESCAJA
										,ProductoConstantesFunciones.LABEL_MARGEN
										,ProductoConstantesFunciones.LABEL_FACTOR
										,ProductoConstantesFunciones.LABEL_FOB
										,ProductoConstantesFunciones.LABEL_FOB2
										,ProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO
										,ProductoConstantesFunciones.LABEL_IDCOLORPRODUCTO
										,ProductoConstantesFunciones.LABEL_IDCLASEPRODUCTO
										,ProductoConstantesFunciones.LABEL_IDEFECTOPRODUCTO
										,ProductoConstantesFunciones.LABEL_IDMARCAPRODUCTO
										,ProductoConstantesFunciones.LABEL_IDMODELOPRODUCTO
										,ProductoConstantesFunciones.LABEL_IDMATERIALPRODUCTO
										,ProductoConstantesFunciones.LABEL_IDSEGMENTOPRODUCTO
										,ProductoConstantesFunciones.LABEL_IDTALLAPRODUCTO
										,ProductoConstantesFunciones.LABEL_GRUPO
										,ProductoConstantesFunciones.LABEL_REFERENCIA
										,ProductoConstantesFunciones.LABEL_APLICACION
										,ProductoConstantesFunciones.LABEL_PROCEDENCIA
										};
	   
	    public List<Producto> productos;
	  	 
	    //NO SE UTILIZA
	    public ProductoModel(List<Producto> productos,JInternalFrameBase jInternalFrameBase) {
	    	this.productos=productos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ProductoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.productos=new ArrayList<Producto>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.productos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.productos.get(rowIndex).getIsSelected();
	            
				case 1: return this.productos.get(rowIndex).getId();
				case 2: return this.productos.get(rowIndex).getid_empresa();
				case 3: return this.productos.get(rowIndex).getid_sucursal();
				case 4: return this.productos.get(rowIndex).getcodigo();
				case 5: return this.productos.get(rowIndex).getnombre();
				case 6: return this.productos.get(rowIndex).getnombre_extranjero();
				case 7: return this.productos.get(rowIndex).getresumen_detalle();
				case 8: return this.productos.get(rowIndex).getcodigo_barra();
				case 9: return this.productos.get(rowIndex).getid_linea();
				case 10: return this.productos.get(rowIndex).getid_linea_grupo();
				case 11: return this.productos.get(rowIndex).getid_linea_categoria();
				case 12: return this.productos.get(rowIndex).getid_linea_marca();
				case 13: return this.productos.get(rowIndex).getid_tipo_producto_servicio();
				case 14: return this.productos.get(rowIndex).getid_tipo_producto_servicio_inven();
				case 15: return this.productos.get(rowIndex).getid_tipo_costeo();
				case 16: return this.productos.get(rowIndex).getid_unidad();
				case 17: return this.productos.get(rowIndex).getid_unidad_peso();
				case 18: return this.productos.get(rowIndex).getid_arancel();
				case 19: return this.productos.get(rowIndex).getid_cliente();
				case 20: return this.productos.get(rowIndex).getid_cliente_proveedor_defecto();
				case 21: return this.productos.get(rowIndex).getesta_activo();
				case 22: return this.productos.get(rowIndex).getdescripcion();
				case 23: return this.productos.get(rowIndex).getprecio();
				case 24: return this.productos.get(rowIndex).getiva();
				case 25: return this.productos.get(rowIndex).getiva_valor();
				case 26: return this.productos.get(rowIndex).getice();
				case 27: return this.productos.get(rowIndex).getice_valor();
				case 28: return this.productos.get(rowIndex).getdescuento();
				case 29: return this.productos.get(rowIndex).getdescuento_valor();
				case 30: return this.productos.get(rowIndex).getarancel_porcentaje();
				case 31: return this.productos.get(rowIndex).getarancel_valor();
				case 32: return this.productos.get(rowIndex).getcomision();
				case 33: return this.productos.get(rowIndex).getcomision_valor();
				case 34: return this.productos.get(rowIndex).getdias_produccion();
				case 35: return this.productos.get(rowIndex).getcon_stock_negativo();
				case 36: return this.productos.get(rowIndex).getcon_precio_minimo();
				case 37: return this.productos.get(rowIndex).getcon_lote();
				case 38: return this.productos.get(rowIndex).getcon_confirmacion();
				case 39: return this.productos.get(rowIndex).getcon_presupuesto();
				case 40: return this.productos.get(rowIndex).getcon_importacion();
				case 41: return this.productos.get(rowIndex).getcon_final();
				case 42: return this.productos.get(rowIndex).getcon_consep();
				case 43: return this.productos.get(rowIndex).getcon_serie();
				case 44: return this.productos.get(rowIndex).getcon_balanza();
				case 45: return this.productos.get(rowIndex).getalto();
				case 46: return this.productos.get(rowIndex).getancho();
				case 47: return this.productos.get(rowIndex).getlargo();
				case 48: return this.productos.get(rowIndex).getvolumen();
				case 49: return this.productos.get(rowIndex).getpeso();
				case 50: return this.productos.get(rowIndex).getgramos();
				case 51: return this.productos.get(rowIndex).getunidades_caja();
				case 52: return this.productos.get(rowIndex).getmargen();
				case 53: return this.productos.get(rowIndex).getfactor();
				case 54: return this.productos.get(rowIndex).getfob();
				case 55: return this.productos.get(rowIndex).getfob2();
				case 56: return this.productos.get(rowIndex).getid_tipo_producto();
				case 57: return this.productos.get(rowIndex).getid_color_producto();
				case 58: return this.productos.get(rowIndex).getid_clase_producto();
				case 59: return this.productos.get(rowIndex).getid_efecto_producto();
				case 60: return this.productos.get(rowIndex).getid_marca_producto();
				case 61: return this.productos.get(rowIndex).getid_modelo_producto();
				case 62: return this.productos.get(rowIndex).getid_material_producto();
				case 63: return this.productos.get(rowIndex).getid_segmento_producto();
				case 64: return this.productos.get(rowIndex).getid_talla_producto();
				case 65: return this.productos.get(rowIndex).getgrupo();
				case 66: return this.productos.get(rowIndex).getreferencia();
				case 67: return this.productos.get(rowIndex).getaplicacion();
				case 68: return this.productos.get(rowIndex).getprocedencia();	            
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
				case 4: return String.class;
				case 5: return String.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return Long.class;
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return Long.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Long.class;
				case 19: return Long.class;
				case 20: return Long.class;
				case 21: return Boolean.class;
				case 22: return String.class;
				case 23: return Double.class;
				case 24: return Double.class;
				case 25: return Double.class;
				case 26: return Double.class;
				case 27: return Double.class;
				case 28: return Double.class;
				case 29: return Double.class;
				case 30: return Double.class;
				case 31: return Double.class;
				case 32: return Double.class;
				case 33: return Double.class;
				case 34: return Double.class;
				case 35: return Boolean.class;
				case 36: return Boolean.class;
				case 37: return Boolean.class;
				case 38: return Boolean.class;
				case 39: return Boolean.class;
				case 40: return Boolean.class;
				case 41: return Boolean.class;
				case 42: return Boolean.class;
				case 43: return Boolean.class;
				case 44: return Boolean.class;
				case 45: return Double.class;
				case 46: return Double.class;
				case 47: return Double.class;
				case 48: return Double.class;
				case 49: return Double.class;
				case 50: return Double.class;
				case 51: return Double.class;
				case 52: return Double.class;
				case 53: return Double.class;
				case 54: return Double.class;
				case 55: return Double.class;
				case 56: return Long.class;
				case 57: return Long.class;
				case 58: return Long.class;
				case 59: return Long.class;
				case 60: return Long.class;
				case 61: return Long.class;
				case 62: return Long.class;
				case 63: return Long.class;
				case 64: return Long.class;
				case 65: return String.class;
				case 66: return String.class;
				case 67: return String.class;
				case 68: return String.class;	            
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
				case 47: return true;
				case 48: return true;
				case 49: return true;
				case 50: return true;
				case 51: return true;
				case 52: return true;
				case 53: return true;
				case 54: return true;
				case 55: return true;
				case 56: return true;
				case 57: return true;
				case 58: return true;
				case 59: return true;
				case 60: return true;
				case 61: return true;
				case 62: return true;
				case 63: return true;
				case 64: return true;
				case 65: return true;
				case 66: return true;
				case 67: return true;
				case 68: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Producto producto = this.productos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=(ProductoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {producto.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {producto.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {producto.setid_empresa((Long) value);producto.setempresa_descripcion(productoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {producto.setid_sucursal((Long) value);producto.setsucursal_descripcion(productoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {producto.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {producto.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {producto.setnombre_extranjero((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {producto.setresumen_detalle((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {producto.setcodigo_barra((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {producto.setid_linea((Long) value);producto.setlinea_descripcion(productoBeanSwingJInternalFrame.getActualLineaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {producto.setid_linea_grupo((Long) value);producto.setlineagrupo_descripcion(productoBeanSwingJInternalFrame.getActualLineaGrupoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {producto.setid_linea_categoria((Long) value);producto.setlineacategoria_descripcion(productoBeanSwingJInternalFrame.getActualLineaCategoriaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {producto.setid_linea_marca((Long) value);producto.setlineamarca_descripcion(productoBeanSwingJInternalFrame.getActualLineaMarcaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {producto.setid_tipo_producto_servicio((Long) value);producto.settipoproductoservicio_descripcion(productoBeanSwingJInternalFrame.getActualTipoProductoServicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {producto.setid_tipo_producto_servicio_inven((Long) value);producto.settipoproductoservicioinven_descripcion(productoBeanSwingJInternalFrame.getActualTipoProductoServicioInvenForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {producto.setid_tipo_costeo((Long) value);producto.settipocosteo_descripcion(productoBeanSwingJInternalFrame.getActualTipoCosteoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {producto.setid_unidad((Long) value);producto.setunidad_descripcion(productoBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {producto.setid_unidad_peso((Long) value);producto.setunidadpeso_descripcion(productoBeanSwingJInternalFrame.getActualUnidadPesoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {producto.setid_arancel((Long) value);producto.setarancel_descripcion(productoBeanSwingJInternalFrame.getActualArancelForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {producto.setid_cliente((Long) value);producto.setcliente_descripcion(productoBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {producto.setid_cliente_proveedor_defecto((Long) value);producto.setclienteproveedordefecto_descripcion(productoBeanSwingJInternalFrame.getActualClienteProveedorDefectoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {producto.setesta_activo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {producto.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {producto.setprecio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {producto.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {producto.setiva_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {producto.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {producto.setice_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {producto.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {producto.setdescuento_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {producto.setarancel_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {producto.setarancel_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {producto.setcomision((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {producto.setcomision_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {producto.setdias_produccion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {producto.setcon_stock_negativo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {producto.setcon_precio_minimo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {producto.setcon_lote((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {producto.setcon_confirmacion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {producto.setcon_presupuesto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {producto.setcon_importacion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {producto.setcon_final((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 42: try {producto.setcon_consep((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 43: try {producto.setcon_serie((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 44: try {producto.setcon_balanza((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 45: try {producto.setalto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 46: try {producto.setancho((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 47: try {producto.setlargo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 48: try {producto.setvolumen((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 49: try {producto.setpeso((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 50: try {producto.setgramos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 51: try {producto.setunidades_caja((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 52: try {producto.setmargen((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 53: try {producto.setfactor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 54: try {producto.setfob((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 55: try {producto.setfob2((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 56: try {producto.setid_tipo_producto((Long) value);producto.settipoproducto_descripcion(productoBeanSwingJInternalFrame.getActualTipoProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 57: try {producto.setid_color_producto((Long) value);producto.setcolorproducto_descripcion(productoBeanSwingJInternalFrame.getActualColorProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 58: try {producto.setid_clase_producto((Long) value);producto.setclaseproducto_descripcion(productoBeanSwingJInternalFrame.getActualClaseProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 59: try {producto.setid_efecto_producto((Long) value);producto.setefectoproducto_descripcion(productoBeanSwingJInternalFrame.getActualEfectoProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 60: try {producto.setid_marca_producto((Long) value);producto.setmarcaproducto_descripcion(productoBeanSwingJInternalFrame.getActualMarcaProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 61: try {producto.setid_modelo_producto((Long) value);producto.setmodeloproducto_descripcion(productoBeanSwingJInternalFrame.getActualModeloProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 62: try {producto.setid_material_producto((Long) value);producto.setmaterialproducto_descripcion(productoBeanSwingJInternalFrame.getActualMaterialProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 63: try {producto.setid_segmento_producto((Long) value);producto.setsegmentoproducto_descripcion(productoBeanSwingJInternalFrame.getActualSegmentoProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 64: try {producto.setid_talla_producto((Long) value);producto.settallaproducto_descripcion(productoBeanSwingJInternalFrame.getActualTallaProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 65: try {producto.setgrupo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 66: try {producto.setreferencia((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 67: try {producto.setaplicacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 68: try {producto.setprocedencia((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ProductoModel(JInternalFrameBase jInternalFrameBase) {
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
		private ProductoDetalleFormJInternalFrame productoJInternalFrame=null;
		
		public ProductoModel(ProductoDetalleFormJInternalFrame productoJInternalFrame) {
			this.productoJInternalFrame=productoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.productoJInternalFrame.getjButtonActualizarToolBarProducto();
			
			if(component!=null && component.equals(this.productoJInternalFrame.getjButtonActualizarToolBarProducto())) {
				componentTab=this.productoJInternalFrame.getjButtonEliminarToolBarProducto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoJInternalFrame.getjButtonEliminarToolBarProducto())) {
				componentTab=this.productoJInternalFrame.getjButtonCancelarToolBarProducto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoJInternalFrame.getjButtonCancelarToolBarProducto())) {
				componentTab=this.productoJInternalFrame.jComboBoxid_empresaProducto;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.productoJInternalFrame.jTextAreaprocedenciaProducto)) {
				componentTab=this.productoJInternalFrame.jComboBoxTiposAccionesFormularioProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxTiposAccionesFormularioProducto)) {
				componentTab=this.productoJInternalFrame.jButtonEliminarProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoJInternalFrame.jButtonEliminarProducto)) {
				componentTab=this.productoJInternalFrame.jButtonActualizarProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoJInternalFrame.jButtonActualizarProducto)) {
				componentTab=this.productoJInternalFrame.jButtonCancelarProducto;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_empresaProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_sucursalProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_sucursalProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldcodigoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldcodigoProducto)) {
			componentTab=this.productoJInternalFrame.jTextAreanombreProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextAreanombreProducto)) {
			componentTab=this.productoJInternalFrame.jTextAreanombre_extranjeroProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextAreanombre_extranjeroProducto)) {
			componentTab=this.productoJInternalFrame.jTextArearesumen_detalleProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextArearesumen_detalleProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldcodigo_barraProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldcodigo_barraProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_lineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_lineaProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_linea_grupoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_linea_grupoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_linea_categoriaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_linea_categoriaProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_linea_marcaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_linea_marcaProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_tipo_producto_servicioProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_tipo_producto_servicioProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_tipo_producto_servicio_invenProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_tipo_producto_servicio_invenProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_tipo_costeoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_tipo_costeoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_unidadProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_unidadProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_unidad_pesoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_unidad_pesoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_arancelProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_arancelProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_clienteProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_clienteProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_cliente_proveedor_defectoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_cliente_proveedor_defectoProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxesta_activoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxesta_activoProducto)) {
			componentTab=this.productoJInternalFrame.jTextAreadescripcionProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextAreadescripcionProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldprecioProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldprecioProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldivaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldivaProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldiva_valorProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldiva_valorProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldiceProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldiceProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldice_valorProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldice_valorProducto)) {
			componentTab=this.productoJInternalFrame.jTextFielddescuentoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFielddescuentoProducto)) {
			componentTab=this.productoJInternalFrame.jTextFielddescuento_valorProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFielddescuento_valorProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldarancel_porcentajeProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldarancel_porcentajeProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldarancel_valorProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldarancel_valorProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldcomisionProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldcomisionProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldcomision_valorProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldcomision_valorProducto)) {
			componentTab=this.productoJInternalFrame.jTextFielddias_produccionProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFielddias_produccionProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_stock_negativoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_stock_negativoProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_precio_minimoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_precio_minimoProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_loteProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_loteProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_confirmacionProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_confirmacionProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_presupuestoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_presupuestoProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_importacionProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_importacionProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_finalProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_finalProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_consepProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_consepProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_serieProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_serieProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_balanzaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_balanzaProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldaltoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldaltoProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldanchoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldanchoProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldlargoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldlargoProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldvolumenProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldvolumenProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldpesoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldpesoProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldgramosProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldgramosProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldunidades_cajaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldunidades_cajaProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldmargenProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldmargenProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldfactorProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldfactorProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldfobProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldfobProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldfob2Producto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldfob2Producto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_tipo_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_tipo_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_color_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_color_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_clase_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_clase_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_efecto_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_efecto_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_marca_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_marca_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_modelo_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_modelo_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_material_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_material_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_segmento_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_segmento_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_talla_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_talla_productoProducto)) {
			componentTab=this.productoJInternalFrame.jTextAreagrupoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextAreagrupoProducto)) {
			componentTab=this.productoJInternalFrame.jTextAreareferenciaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextAreareferenciaProducto)) {
			componentTab=this.productoJInternalFrame.jTextAreaaplicacionProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextAreaaplicacionProducto)) {
			componentTab=this.productoJInternalFrame.jTextAreaprocedenciaProducto;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.productoJInternalFrame.getjButtonActualizarToolBarProducto();
			
			if(component!=null && component.equals(this.productoJInternalFrame.getjButtonEliminarToolBarProducto())) {
				componentTab=this.productoJInternalFrame.getjButtonActualizarToolBarProducto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoJInternalFrame.getjButtonCancelarToolBarProducto())) {
				componentTab=this.productoJInternalFrame.getjButtonEliminarToolBarProducto();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_empresaProducto)) {
				
				componentTab=this.productoJInternalFrame.getjButtonCancelarToolBarProducto();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxTiposAccionesFormularioProducto)) {
				componentTab=this.productoJInternalFrame.jTextAreaprocedenciaProducto;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.productoJInternalFrame.jButtonEliminarProducto)) {
				componentTab=this.productoJInternalFrame.jComboBoxTiposAccionesFormularioProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoJInternalFrame.jButtonActualizarProducto)) {
				componentTab=this.productoJInternalFrame.jButtonEliminarProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoJInternalFrame.jButtonCancelarProducto)) {
				componentTab=this.productoJInternalFrame.jButtonActualizarProducto;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_sucursalProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_empresaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldcodigoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_sucursalProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextAreanombreProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldcodigoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextAreanombre_extranjeroProducto)) {
			componentTab=this.productoJInternalFrame.jTextAreanombreProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextArearesumen_detalleProducto)) {
			componentTab=this.productoJInternalFrame.jTextAreanombre_extranjeroProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldcodigo_barraProducto)) {
			componentTab=this.productoJInternalFrame.jTextArearesumen_detalleProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_lineaProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldcodigo_barraProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_linea_grupoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_lineaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_linea_categoriaProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_linea_grupoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_linea_marcaProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_linea_categoriaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_tipo_producto_servicioProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_linea_marcaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_tipo_producto_servicio_invenProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_tipo_producto_servicioProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_tipo_costeoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_tipo_producto_servicio_invenProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_unidadProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_tipo_costeoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_unidad_pesoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_unidadProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_arancelProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_unidad_pesoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_clienteProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_arancelProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_cliente_proveedor_defectoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_clienteProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxesta_activoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_cliente_proveedor_defectoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextAreadescripcionProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxesta_activoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldprecioProducto)) {
			componentTab=this.productoJInternalFrame.jTextAreadescripcionProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldivaProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldprecioProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldiva_valorProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldivaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldiceProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldiva_valorProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldice_valorProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldiceProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFielddescuentoProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldice_valorProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFielddescuento_valorProducto)) {
			componentTab=this.productoJInternalFrame.jTextFielddescuentoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldarancel_porcentajeProducto)) {
			componentTab=this.productoJInternalFrame.jTextFielddescuento_valorProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldarancel_valorProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldarancel_porcentajeProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldcomisionProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldarancel_valorProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldcomision_valorProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldcomisionProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFielddias_produccionProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldcomision_valorProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_stock_negativoProducto)) {
			componentTab=this.productoJInternalFrame.jTextFielddias_produccionProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_precio_minimoProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_stock_negativoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_loteProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_precio_minimoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_confirmacionProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_loteProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_presupuestoProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_confirmacionProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_importacionProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_presupuestoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_finalProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_importacionProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_consepProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_finalProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_serieProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_consepProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jCheckBoxcon_balanzaProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_serieProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldaltoProducto)) {
			componentTab=this.productoJInternalFrame.jCheckBoxcon_balanzaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldanchoProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldaltoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldlargoProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldanchoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldvolumenProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldlargoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldpesoProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldvolumenProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldgramosProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldpesoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldunidades_cajaProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldgramosProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldmargenProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldunidades_cajaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldfactorProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldmargenProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldfobProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldfactorProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextFieldfob2Producto)) {
			componentTab=this.productoJInternalFrame.jTextFieldfobProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_tipo_productoProducto)) {
			componentTab=this.productoJInternalFrame.jTextFieldfob2Producto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_color_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_tipo_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_clase_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_color_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_efecto_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_clase_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_marca_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_efecto_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_modelo_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_marca_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_material_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_modelo_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_segmento_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_material_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jComboBoxid_talla_productoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_segmento_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextAreagrupoProducto)) {
			componentTab=this.productoJInternalFrame.jComboBoxid_talla_productoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextAreareferenciaProducto)) {
			componentTab=this.productoJInternalFrame.jTextAreagrupoProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextAreaaplicacionProducto)) {
			componentTab=this.productoJInternalFrame.jTextAreareferenciaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoJInternalFrame.jTextAreaprocedenciaProducto)) {
			componentTab=this.productoJInternalFrame.jTextAreaaplicacionProducto;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.productoJInternalFrame.getjButtonActualizarToolBarProducto();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.productoJInternalFrame.getjButtonActualizarToolBarProducto();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.productoJInternalFrame.getjButtonCancelarToolBarProducto();
			
			
			return componentTab;		
		}
		
		public ProductoDetalleFormJInternalFrame getproductoJInternalFrame() {
			return this.productoJInternalFrame;
		}
		
		public void setproductoJInternalFrame(ProductoDetalleFormJInternalFrame productoJInternalFrame) {
			this.productoJInternalFrame=productoJInternalFrame;
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
