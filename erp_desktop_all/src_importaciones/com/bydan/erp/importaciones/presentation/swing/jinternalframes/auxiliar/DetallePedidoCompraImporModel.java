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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.importaciones.util.DetallePedidoCompraImporConstantesFunciones;
import com.bydan.erp.importaciones.util.DetallePedidoCompraImporParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.DetallePedidoCompraImporParameterGeneral;

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

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.DetallePedidoCompraImporBeanSwingJInternalFrame;
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
import com.bydan.erp.importaciones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.importaciones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.DetallePedidoCompraImporJInternalFrame;

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.DetallePedidoCompraImporDetalleFormJInternalFrame;

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
import com.bydan.erp.contabilidad.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetallePedidoCompraImporModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetallePedidoCompraImporConstantesFunciones.LABEL_ID
										,DetallePedidoCompraImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR
										,DetallePedidoCompraImporConstantesFunciones.LABEL_IDEMPRESA
										,DetallePedidoCompraImporConstantesFunciones.LABEL_IDSUCURSAL
										,DetallePedidoCompraImporConstantesFunciones.LABEL_IDBODEGA
										,DetallePedidoCompraImporConstantesFunciones.LABEL_IDPRODUCTO
										,DetallePedidoCompraImporConstantesFunciones.LABEL_IDUNIDAD
										,DetallePedidoCompraImporConstantesFunciones.LABEL_IDEJERCICIO
										,DetallePedidoCompraImporConstantesFunciones.LABEL_IDPERIODO
										,DetallePedidoCompraImporConstantesFunciones.LABEL_IDARANCEL
										,DetallePedidoCompraImporConstantesFunciones.LABEL_CANTIDADPEDIDO
										,DetallePedidoCompraImporConstantesFunciones.LABEL_CANTIDADENTRA
										,DetallePedidoCompraImporConstantesFunciones.LABEL_CANTIDADPENDIENTE
										,DetallePedidoCompraImporConstantesFunciones.LABEL_PORCENTAJE
										,DetallePedidoCompraImporConstantesFunciones.LABEL_PESO
										,DetallePedidoCompraImporConstantesFunciones.LABEL_PRECIO
										,DetallePedidoCompraImporConstantesFunciones.LABEL_LOTE
										,DetallePedidoCompraImporConstantesFunciones.LABEL_PORCENTAJEARANCEL
										,DetallePedidoCompraImporConstantesFunciones.LABEL_CANTIDADUNIDADAUXILIAR
										,DetallePedidoCompraImporConstantesFunciones.LABEL_PRECIOUNIDADAUXILIAR
										,DetallePedidoCompraImporConstantesFunciones.LABEL_FOB
										,DetallePedidoCompraImporConstantesFunciones.LABEL_FOBEXW
										,DetallePedidoCompraImporConstantesFunciones.LABEL_TOTAL
										,DetallePedidoCompraImporConstantesFunciones.LABEL_DESCRIPCION
										,DetallePedidoCompraImporConstantesFunciones.LABEL_IDCENTROCOSTO
										,DetallePedidoCompraImporConstantesFunciones.LABEL_IDANIO
										,DetallePedidoCompraImporConstantesFunciones.LABEL_IDMES
										};
	   
	    public List<DetallePedidoCompraImpor> detallepedidocompraimpors;
	  	 
	    //NO SE UTILIZA
	    public DetallePedidoCompraImporModel(List<DetallePedidoCompraImpor> detallepedidocompraimpors,JInternalFrameBase jInternalFrameBase) {
	    	this.detallepedidocompraimpors=detallepedidocompraimpors;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetallePedidoCompraImporModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detallepedidocompraimpors=new ArrayList<DetallePedidoCompraImpor>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detallepedidocompraimpors.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detallepedidocompraimpors.get(rowIndex).getIsSelected();
	            
				case 1: return this.detallepedidocompraimpors.get(rowIndex).getId();
				case 2: return this.detallepedidocompraimpors.get(rowIndex).getid_pedido_compra_impor();
				case 3: return this.detallepedidocompraimpors.get(rowIndex).getid_empresa();
				case 4: return this.detallepedidocompraimpors.get(rowIndex).getid_sucursal();
				case 5: return this.detallepedidocompraimpors.get(rowIndex).getid_bodega();
				case 6: return this.detallepedidocompraimpors.get(rowIndex).getid_producto();
				case 7: return this.detallepedidocompraimpors.get(rowIndex).getid_unidad();
				case 8: return this.detallepedidocompraimpors.get(rowIndex).getid_ejercicio();
				case 9: return this.detallepedidocompraimpors.get(rowIndex).getid_periodo();
				case 10: return this.detallepedidocompraimpors.get(rowIndex).getid_arancel();
				case 11: return this.detallepedidocompraimpors.get(rowIndex).getcantidad_pedido();
				case 12: return this.detallepedidocompraimpors.get(rowIndex).getcantidad_entra();
				case 13: return this.detallepedidocompraimpors.get(rowIndex).getcantidad_pendiente();
				case 14: return this.detallepedidocompraimpors.get(rowIndex).getporcentaje();
				case 15: return this.detallepedidocompraimpors.get(rowIndex).getpeso();
				case 16: return this.detallepedidocompraimpors.get(rowIndex).getprecio();
				case 17: return this.detallepedidocompraimpors.get(rowIndex).getlote();
				case 18: return this.detallepedidocompraimpors.get(rowIndex).getporcentaje_arancel();
				case 19: return this.detallepedidocompraimpors.get(rowIndex).getcantidad_unidad_auxiliar();
				case 20: return this.detallepedidocompraimpors.get(rowIndex).getprecio_unidad_auxiliar();
				case 21: return this.detallepedidocompraimpors.get(rowIndex).getfob();
				case 22: return this.detallepedidocompraimpors.get(rowIndex).getfob_exw();
				case 23: return this.detallepedidocompraimpors.get(rowIndex).gettotal();
				case 24: return this.detallepedidocompraimpors.get(rowIndex).getdescripcion();
				case 25: return this.detallepedidocompraimpors.get(rowIndex).getid_centro_costo();
				case 26: return this.detallepedidocompraimpors.get(rowIndex).getid_anio();
				case 27: return this.detallepedidocompraimpors.get(rowIndex).getid_mes();	            
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
				case 11: return Integer.class;
				case 12: return Integer.class;
				case 13: return Integer.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return String.class;
				case 18: return Double.class;
				case 19: return Integer.class;
				case 20: return Double.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return String.class;
				case 25: return Long.class;
				case 26: return Long.class;
				case 27: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetallePedidoCompraImpor detallepedidocompraimpor = this.detallepedidocompraimpors.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetallePedidoCompraImporBeanSwingJInternalFrame detallepedidocompraimporBeanSwingJInternalFrame=(DetallePedidoCompraImporBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detallepedidocompraimpor.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detallepedidocompraimpor.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detallepedidocompraimpor.setid_pedido_compra_impor((Long) value);detallepedidocompraimpor.setpedidocompraimpor_descripcion(detallepedidocompraimporBeanSwingJInternalFrame.getActualPedidoCompraImporForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detallepedidocompraimpor.setid_empresa((Long) value);detallepedidocompraimpor.setempresa_descripcion(detallepedidocompraimporBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detallepedidocompraimpor.setid_sucursal((Long) value);detallepedidocompraimpor.setsucursal_descripcion(detallepedidocompraimporBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detallepedidocompraimpor.setid_bodega((Long) value);detallepedidocompraimpor.setbodega_descripcion(detallepedidocompraimporBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detallepedidocompraimpor.setid_producto((Long) value);detallepedidocompraimpor.setproducto_descripcion(detallepedidocompraimporBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detallepedidocompraimpor.setid_unidad((Long) value);detallepedidocompraimpor.setunidad_descripcion(detallepedidocompraimporBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detallepedidocompraimpor.setid_ejercicio((Long) value);detallepedidocompraimpor.setejercicio_descripcion(detallepedidocompraimporBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detallepedidocompraimpor.setid_periodo((Long) value);detallepedidocompraimpor.setperiodo_descripcion(detallepedidocompraimporBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detallepedidocompraimpor.setid_arancel((Long) value);detallepedidocompraimpor.setarancel_descripcion(detallepedidocompraimporBeanSwingJInternalFrame.getActualArancelForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detallepedidocompraimpor.setcantidad_pedido((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detallepedidocompraimpor.setcantidad_entra((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detallepedidocompraimpor.setcantidad_pendiente((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detallepedidocompraimpor.setporcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detallepedidocompraimpor.setpeso((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detallepedidocompraimpor.setprecio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detallepedidocompraimpor.setlote((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detallepedidocompraimpor.setporcentaje_arancel((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detallepedidocompraimpor.setcantidad_unidad_auxiliar((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detallepedidocompraimpor.setprecio_unidad_auxiliar((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {detallepedidocompraimpor.setfob((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {detallepedidocompraimpor.setfob_exw((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {detallepedidocompraimpor.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {detallepedidocompraimpor.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {detallepedidocompraimpor.setid_centro_costo((Long) value);detallepedidocompraimpor.setcentrocosto_descripcion(detallepedidocompraimporBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {detallepedidocompraimpor.setid_anio((Long) value);detallepedidocompraimpor.setanio_descripcion(detallepedidocompraimporBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {detallepedidocompraimpor.setid_mes((Long) value);detallepedidocompraimpor.setmes_descripcion(detallepedidocompraimporBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetallePedidoCompraImporModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetallePedidoCompraImporDetalleFormJInternalFrame detallepedidocompraimporJInternalFrame=null;
		
		public DetallePedidoCompraImporModel(DetallePedidoCompraImporDetalleFormJInternalFrame detallepedidocompraimporJInternalFrame) {
			this.detallepedidocompraimporJInternalFrame=detallepedidocompraimporJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detallepedidocompraimporJInternalFrame.getjButtonActualizarToolBarDetallePedidoCompraImpor();
			
			if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.getjButtonActualizarToolBarDetallePedidoCompraImpor())) {
				componentTab=this.detallepedidocompraimporJInternalFrame.getjButtonEliminarToolBarDetallePedidoCompraImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.getjButtonEliminarToolBarDetallePedidoCompraImpor())) {
				componentTab=this.detallepedidocompraimporJInternalFrame.getjButtonCancelarToolBarDetallePedidoCompraImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.getjButtonCancelarToolBarDetallePedidoCompraImpor())) {
				componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_mesDetallePedidoCompraImpor)) {
				componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor)) {
				componentTab=this.detallepedidocompraimporJInternalFrame.jButtonEliminarDetallePedidoCompraImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jButtonEliminarDetallePedidoCompraImpor)) {
				componentTab=this.detallepedidocompraimporJInternalFrame.jButtonActualizarDetallePedidoCompraImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jButtonActualizarDetallePedidoCompraImpor)) {
				componentTab=this.detallepedidocompraimporJInternalFrame.jButtonCancelarDetallePedidoCompraImpor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_empresaDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_empresaDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_sucursalDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_sucursalDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_bodegaDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_bodegaDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_productoDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_productoDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_unidadDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_unidadDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_ejercicioDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_ejercicioDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_periodoDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_periodoDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_arancelDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_arancelDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_pedidoDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_pedidoDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_entraDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_entraDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_pendienteDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_pendienteDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldporcentajeDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldporcentajeDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldpesoDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldpesoDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldprecioDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldprecioDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldloteDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldloteDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldporcentaje_arancelDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldporcentaje_arancelDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldfobDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldfobDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldfob_exwDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldfob_exwDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldtotalDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldtotalDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextAreadescripcionDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextAreadescripcionDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_centro_costoDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_centro_costoDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_anioDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_anioDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_mesDetallePedidoCompraImpor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detallepedidocompraimporJInternalFrame.getjButtonActualizarToolBarDetallePedidoCompraImpor();
			
			if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.getjButtonEliminarToolBarDetallePedidoCompraImpor())) {
				componentTab=this.detallepedidocompraimporJInternalFrame.getjButtonActualizarToolBarDetallePedidoCompraImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.getjButtonCancelarToolBarDetallePedidoCompraImpor())) {
				componentTab=this.detallepedidocompraimporJInternalFrame.getjButtonEliminarToolBarDetallePedidoCompraImpor();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor)) {
				
				componentTab=this.detallepedidocompraimporJInternalFrame.getjButtonCancelarToolBarDetallePedidoCompraImpor();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor)) {
				componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_mesDetallePedidoCompraImpor;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jButtonEliminarDetallePedidoCompraImpor)) {
				componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jButtonActualizarDetallePedidoCompraImpor)) {
				componentTab=this.detallepedidocompraimporJInternalFrame.jButtonEliminarDetallePedidoCompraImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jButtonCancelarDetallePedidoCompraImpor)) {
				componentTab=this.detallepedidocompraimporJInternalFrame.jButtonActualizarDetallePedidoCompraImpor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_empresaDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_sucursalDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_empresaDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_bodegaDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_sucursalDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_productoDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_bodegaDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_unidadDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_productoDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_ejercicioDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_unidadDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_periodoDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_ejercicioDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_arancelDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_periodoDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_pedidoDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_arancelDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_entraDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_pedidoDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_pendienteDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_entraDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldporcentajeDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_pendienteDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldpesoDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldporcentajeDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldprecioDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldpesoDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldloteDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldprecioDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldporcentaje_arancelDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldloteDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldporcentaje_arancelDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldfobDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldfob_exwDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldfobDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextFieldtotalDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldfob_exwDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jTextAreadescripcionDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextFieldtotalDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_centro_costoDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jTextAreadescripcionDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_anioDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_centro_costoDetallePedidoCompraImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallepedidocompraimporJInternalFrame.jComboBoxid_mesDetallePedidoCompraImpor)) {
			componentTab=this.detallepedidocompraimporJInternalFrame.jComboBoxid_anioDetallePedidoCompraImpor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detallepedidocompraimporJInternalFrame.getjButtonActualizarToolBarDetallePedidoCompraImpor();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detallepedidocompraimporJInternalFrame.getjButtonActualizarToolBarDetallePedidoCompraImpor();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detallepedidocompraimporJInternalFrame.getjButtonCancelarToolBarDetallePedidoCompraImpor();
			
			
			return componentTab;		
		}
		
		public DetallePedidoCompraImporDetalleFormJInternalFrame getdetallepedidocompraimporJInternalFrame() {
			return this.detallepedidocompraimporJInternalFrame;
		}
		
		public void setdetallepedidocompraimporJInternalFrame(DetallePedidoCompraImporDetalleFormJInternalFrame detallepedidocompraimporJInternalFrame) {
			this.detallepedidocompraimporJInternalFrame=detallepedidocompraimporJInternalFrame;
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
