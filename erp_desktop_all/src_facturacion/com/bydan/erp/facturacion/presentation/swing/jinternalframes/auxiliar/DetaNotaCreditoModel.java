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

import com.bydan.erp.facturacion.util.DetaNotaCreditoConstantesFunciones;
import com.bydan.erp.facturacion.util.DetaNotaCreditoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.DetaNotaCreditoParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetaNotaCreditoBeanSwingJInternalFrame;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetaNotaCreditoJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetaNotaCreditoDetalleFormJInternalFrame;

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


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetaNotaCreditoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetaNotaCreditoConstantesFunciones.LABEL_ID
										,DetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA
										,DetaNotaCreditoConstantesFunciones.LABEL_IDSUCURSAL
										,DetaNotaCreditoConstantesFunciones.LABEL_IDEJERCICIO
										,DetaNotaCreditoConstantesFunciones.LABEL_IDPERIODO
										,DetaNotaCreditoConstantesFunciones.LABEL_IDANIO
										,DetaNotaCreditoConstantesFunciones.LABEL_IDMES
										,DetaNotaCreditoConstantesFunciones.LABEL_IDNOTACREDITO
										,DetaNotaCreditoConstantesFunciones.LABEL_IDBODEGA
										,DetaNotaCreditoConstantesFunciones.LABEL_IDPRODUCTO
										,DetaNotaCreditoConstantesFunciones.LABEL_IDUNIDAD
										,DetaNotaCreditoConstantesFunciones.LABEL_IDTIPODETANOTACREDITO
										,DetaNotaCreditoConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA
										,DetaNotaCreditoConstantesFunciones.LABEL_DESCRIPCION
										,DetaNotaCreditoConstantesFunciones.LABEL_CANTIDAD
										,DetaNotaCreditoConstantesFunciones.LABEL_PRECIO
										,DetaNotaCreditoConstantesFunciones.LABEL_MONTO
										,DetaNotaCreditoConstantesFunciones.LABEL_COSTO
										,DetaNotaCreditoConstantesFunciones.LABEL_DESCUENTO
										,DetaNotaCreditoConstantesFunciones.LABEL_DESCUENTO2
										,DetaNotaCreditoConstantesFunciones.LABEL_IMPUESTO
										,DetaNotaCreditoConstantesFunciones.LABEL_PORCENIVA
										,DetaNotaCreditoConstantesFunciones.LABEL_PORCENDESCUEN
										,DetaNotaCreditoConstantesFunciones.LABEL_PORCENICE
										,DetaNotaCreditoConstantesFunciones.LABEL_SUBTOTAL
										,DetaNotaCreditoConstantesFunciones.LABEL_TOTAL
										,DetaNotaCreditoConstantesFunciones.LABEL_IDCENTROCOSTO
										,DetaNotaCreditoConstantesFunciones.LABEL_IDEMPAQUE
										,DetaNotaCreditoConstantesFunciones.LABEL_INCLUYEIMPUESTO
										,DetaNotaCreditoConstantesFunciones.LABEL_FECHAEMISION
										,DetaNotaCreditoConstantesFunciones.LABEL_CODIGOLOTE
										,DetaNotaCreditoConstantesFunciones.LABEL_NUMEROCAJA
										};
	   
	    public List<DetaNotaCredito> detanotacreditos;
	  	 
	    //NO SE UTILIZA
	    public DetaNotaCreditoModel(List<DetaNotaCredito> detanotacreditos,JInternalFrameBase jInternalFrameBase) {
	    	this.detanotacreditos=detanotacreditos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetaNotaCreditoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detanotacreditos=new ArrayList<DetaNotaCredito>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detanotacreditos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detanotacreditos.get(rowIndex).getIsSelected();
	            
				case 1: return this.detanotacreditos.get(rowIndex).getId();
				case 2: return this.detanotacreditos.get(rowIndex).getid_empresa();
				case 3: return this.detanotacreditos.get(rowIndex).getid_sucursal();
				case 4: return this.detanotacreditos.get(rowIndex).getid_ejercicio();
				case 5: return this.detanotacreditos.get(rowIndex).getid_periodo();
				case 6: return this.detanotacreditos.get(rowIndex).getid_anio();
				case 7: return this.detanotacreditos.get(rowIndex).getid_mes();
				case 8: return this.detanotacreditos.get(rowIndex).getid_nota_credito();
				case 9: return this.detanotacreditos.get(rowIndex).getid_bodega();
				case 10: return this.detanotacreditos.get(rowIndex).getid_producto();
				case 11: return this.detanotacreditos.get(rowIndex).getid_unidad();
				case 12: return this.detanotacreditos.get(rowIndex).getid_tipo_deta_nota_credito();
				case 13: return this.detanotacreditos.get(rowIndex).getid_tipo_devolucion_empresa();
				case 14: return this.detanotacreditos.get(rowIndex).getdescripcion();
				case 15: return this.detanotacreditos.get(rowIndex).getcantidad();
				case 16: return this.detanotacreditos.get(rowIndex).getprecio();
				case 17: return this.detanotacreditos.get(rowIndex).getmonto();
				case 18: return this.detanotacreditos.get(rowIndex).getcosto();
				case 19: return this.detanotacreditos.get(rowIndex).getdescuento();
				case 20: return this.detanotacreditos.get(rowIndex).getdescuento2();
				case 21: return this.detanotacreditos.get(rowIndex).getimpuesto();
				case 22: return this.detanotacreditos.get(rowIndex).getporcen_iva();
				case 23: return this.detanotacreditos.get(rowIndex).getporcen_descuen();
				case 24: return this.detanotacreditos.get(rowIndex).getporcen_ice();
				case 25: return this.detanotacreditos.get(rowIndex).getsub_total();
				case 26: return this.detanotacreditos.get(rowIndex).gettotal();
				case 27: return this.detanotacreditos.get(rowIndex).getid_centro_costo();
				case 28: return this.detanotacreditos.get(rowIndex).getid_empaque();
				case 29: return this.detanotacreditos.get(rowIndex).getincluye_impuesto();
				case 30: return this.detanotacreditos.get(rowIndex).getfecha_emision();
				case 31: return this.detanotacreditos.get(rowIndex).getcodigo_lote();
				case 32: return this.detanotacreditos.get(rowIndex).getnumero_caja();	            
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
				case 11: return Long.class;
				case 12: return Long.class;
				case 13: return Long.class;
				case 14: return String.class;
				case 15: return Integer.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return Double.class;
				case 25: return Double.class;
				case 26: return Double.class;
				case 27: return Long.class;
				case 28: return Long.class;
				case 29: return Boolean.class;
				case 30: return Date.class;
				case 31: return String.class;
				case 32: return String.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetaNotaCredito detanotacredito = this.detanotacreditos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetaNotaCreditoBeanSwingJInternalFrame detanotacreditoBeanSwingJInternalFrame=(DetaNotaCreditoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detanotacredito.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detanotacredito.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detanotacredito.setid_empresa((Long) value);detanotacredito.setempresa_descripcion(detanotacreditoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detanotacredito.setid_sucursal((Long) value);detanotacredito.setsucursal_descripcion(detanotacreditoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detanotacredito.setid_ejercicio((Long) value);detanotacredito.setejercicio_descripcion(detanotacreditoBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detanotacredito.setid_periodo((Long) value);detanotacredito.setperiodo_descripcion(detanotacreditoBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detanotacredito.setid_anio((Long) value);detanotacredito.setanio_descripcion(detanotacreditoBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detanotacredito.setid_mes((Long) value);detanotacredito.setmes_descripcion(detanotacreditoBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detanotacredito.setid_nota_credito((Long) value);detanotacredito.setnotacredito_descripcion(detanotacreditoBeanSwingJInternalFrame.getActualNotaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detanotacredito.setid_bodega((Long) value);detanotacredito.setbodega_descripcion(detanotacreditoBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detanotacredito.setid_producto((Long) value);detanotacredito.setproducto_descripcion(detanotacreditoBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detanotacredito.setid_unidad((Long) value);detanotacredito.setunidad_descripcion(detanotacreditoBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detanotacredito.setid_tipo_deta_nota_credito((Long) value);detanotacredito.settipodetanotacredito_descripcion(detanotacreditoBeanSwingJInternalFrame.getActualTipoDetaNotaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detanotacredito.setid_tipo_devolucion_empresa((Long) value);detanotacredito.settipodevolucionempresa_descripcion(detanotacreditoBeanSwingJInternalFrame.getActualTipoDevolucionEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detanotacredito.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detanotacredito.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detanotacredito.setprecio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detanotacredito.setmonto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detanotacredito.setcosto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detanotacredito.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detanotacredito.setdescuento2((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {detanotacredito.setimpuesto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {detanotacredito.setporcen_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {detanotacredito.setporcen_descuen((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {detanotacredito.setporcen_ice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {detanotacredito.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {detanotacredito.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {detanotacredito.setid_centro_costo((Long) value);detanotacredito.setcentrocosto_descripcion(detanotacreditoBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {detanotacredito.setid_empaque((Long) value);detanotacredito.setempaque_descripcion(detanotacreditoBeanSwingJInternalFrame.getActualEmpaqueForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {detanotacredito.setincluye_impuesto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {detanotacredito.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {detanotacredito.setcodigo_lote((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {detanotacredito.setnumero_caja((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetaNotaCreditoModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetaNotaCreditoDetalleFormJInternalFrame detanotacreditoJInternalFrame=null;
		
		public DetaNotaCreditoModel(DetaNotaCreditoDetalleFormJInternalFrame detanotacreditoJInternalFrame) {
			this.detanotacreditoJInternalFrame=detanotacreditoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detanotacreditoJInternalFrame.getjButtonActualizarToolBarDetaNotaCredito();
			
			if(component!=null && component.equals(this.detanotacreditoJInternalFrame.getjButtonActualizarToolBarDetaNotaCredito())) {
				componentTab=this.detanotacreditoJInternalFrame.getjButtonEliminarToolBarDetaNotaCredito();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detanotacreditoJInternalFrame.getjButtonEliminarToolBarDetaNotaCredito())) {
				componentTab=this.detanotacreditoJInternalFrame.getjButtonCancelarToolBarDetaNotaCredito();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detanotacreditoJInternalFrame.getjButtonCancelarToolBarDetaNotaCredito())) {
				componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_empresaDetaNotaCredito;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldnumero_cajaDetaNotaCredito)) {
				componentTab=this.detanotacreditoJInternalFrame.jComboBoxTiposAccionesFormularioDetaNotaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxTiposAccionesFormularioDetaNotaCredito)) {
				componentTab=this.detanotacreditoJInternalFrame.jButtonEliminarDetaNotaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jButtonEliminarDetaNotaCredito)) {
				componentTab=this.detanotacreditoJInternalFrame.jButtonActualizarDetaNotaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jButtonActualizarDetaNotaCredito)) {
				componentTab=this.detanotacreditoJInternalFrame.jButtonCancelarDetaNotaCredito;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_empresaDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_sucursalDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_sucursalDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_ejercicioDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_ejercicioDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_periodoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_periodoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_anioDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_anioDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_mesDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_mesDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_nota_creditoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_nota_creditoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_bodegaDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_bodegaDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_productoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_productoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_unidadDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_unidadDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_tipo_devolucion_empresaDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_tipo_devolucion_empresaDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextAreadescripcionDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextAreadescripcionDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldcantidadDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldcantidadDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldprecioDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldprecioDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldmontoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldmontoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldcostoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldcostoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFielddescuentoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFielddescuentoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFielddescuento2DetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFielddescuento2DetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldimpuestoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldimpuestoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldporcen_ivaDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldporcen_ivaDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldporcen_descuenDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldporcen_descuenDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldporcen_iceDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldporcen_iceDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldsub_totalDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldsub_totalDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldtotalDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldtotalDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_centro_costoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_centro_costoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_empaqueDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_empaqueDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jCheckBoxincluye_impuestoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jCheckBoxincluye_impuestoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jDateChooserfecha_emisionDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jDateChooserfecha_emisionDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldcodigo_loteDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldcodigo_loteDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldnumero_cajaDetaNotaCredito;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detanotacreditoJInternalFrame.getjButtonActualizarToolBarDetaNotaCredito();
			
			if(component!=null && component.equals(this.detanotacreditoJInternalFrame.getjButtonEliminarToolBarDetaNotaCredito())) {
				componentTab=this.detanotacreditoJInternalFrame.getjButtonActualizarToolBarDetaNotaCredito();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detanotacreditoJInternalFrame.getjButtonCancelarToolBarDetaNotaCredito())) {
				componentTab=this.detanotacreditoJInternalFrame.getjButtonEliminarToolBarDetaNotaCredito();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_empresaDetaNotaCredito)) {
				
				componentTab=this.detanotacreditoJInternalFrame.getjButtonCancelarToolBarDetaNotaCredito();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxTiposAccionesFormularioDetaNotaCredito)) {
				componentTab=this.detanotacreditoJInternalFrame.jTextFieldnumero_cajaDetaNotaCredito;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jButtonEliminarDetaNotaCredito)) {
				componentTab=this.detanotacreditoJInternalFrame.jComboBoxTiposAccionesFormularioDetaNotaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jButtonActualizarDetaNotaCredito)) {
				componentTab=this.detanotacreditoJInternalFrame.jButtonEliminarDetaNotaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jButtonCancelarDetaNotaCredito)) {
				componentTab=this.detanotacreditoJInternalFrame.jButtonActualizarDetaNotaCredito;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_sucursalDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_empresaDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_ejercicioDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_sucursalDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_periodoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_ejercicioDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_anioDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_periodoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_mesDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_anioDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_nota_creditoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_mesDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_bodegaDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_nota_creditoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_productoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_bodegaDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_unidadDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_productoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_unidadDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_tipo_devolucion_empresaDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextAreadescripcionDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_tipo_devolucion_empresaDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldcantidadDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextAreadescripcionDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldprecioDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldcantidadDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldmontoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldprecioDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldcostoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldmontoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFielddescuentoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldcostoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFielddescuento2DetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFielddescuentoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldimpuestoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFielddescuento2DetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldporcen_ivaDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldimpuestoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldporcen_descuenDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldporcen_ivaDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldporcen_iceDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldporcen_descuenDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldsub_totalDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldporcen_iceDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldtotalDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldsub_totalDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_centro_costoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldtotalDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jComboBoxid_empaqueDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_centro_costoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jCheckBoxincluye_impuestoDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jComboBoxid_empaqueDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jDateChooserfecha_emisionDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jCheckBoxincluye_impuestoDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldcodigo_loteDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jDateChooserfecha_emisionDetaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.detanotacreditoJInternalFrame.jTextFieldnumero_cajaDetaNotaCredito)) {
			componentTab=this.detanotacreditoJInternalFrame.jTextFieldcodigo_loteDetaNotaCredito;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detanotacreditoJInternalFrame.getjButtonActualizarToolBarDetaNotaCredito();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detanotacreditoJInternalFrame.getjButtonActualizarToolBarDetaNotaCredito();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detanotacreditoJInternalFrame.getjButtonCancelarToolBarDetaNotaCredito();
			
			
			return componentTab;		
		}
		
		public DetaNotaCreditoDetalleFormJInternalFrame getdetanotacreditoJInternalFrame() {
			return this.detanotacreditoJInternalFrame;
		}
		
		public void setdetanotacreditoJInternalFrame(DetaNotaCreditoDetalleFormJInternalFrame detanotacreditoJInternalFrame) {
			this.detanotacreditoJInternalFrame=detanotacreditoJInternalFrame;
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
