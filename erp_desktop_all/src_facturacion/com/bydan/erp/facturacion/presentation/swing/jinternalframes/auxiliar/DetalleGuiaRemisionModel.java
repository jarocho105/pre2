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

import com.bydan.erp.facturacion.util.DetalleGuiaRemisionConstantesFunciones;
import com.bydan.erp.facturacion.util.DetalleGuiaRemisionParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.DetalleGuiaRemisionParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetalleGuiaRemisionBeanSwingJInternalFrame;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetalleGuiaRemisionJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetalleGuiaRemisionDetalleFormJInternalFrame;

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

public class DetalleGuiaRemisionModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleGuiaRemisionConstantesFunciones.LABEL_ID
										,DetalleGuiaRemisionConstantesFunciones.LABEL_IDEMPRESA
										,DetalleGuiaRemisionConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleGuiaRemisionConstantesFunciones.LABEL_IDEJERCICIO
										,DetalleGuiaRemisionConstantesFunciones.LABEL_IDPERIODO
										,DetalleGuiaRemisionConstantesFunciones.LABEL_IDGUIAREMISION
										,DetalleGuiaRemisionConstantesFunciones.LABEL_IDBODEGA
										,DetalleGuiaRemisionConstantesFunciones.LABEL_IDPRODUCTO
										,DetalleGuiaRemisionConstantesFunciones.LABEL_IDUNIDAD
										,DetalleGuiaRemisionConstantesFunciones.LABEL_IDCENTROCOSTO
										,DetalleGuiaRemisionConstantesFunciones.LABEL_CANTIDADENVASES
										,DetalleGuiaRemisionConstantesFunciones.LABEL_CANTIDADAUXILIAR
										,DetalleGuiaRemisionConstantesFunciones.LABEL_DESCRIPCION
										,DetalleGuiaRemisionConstantesFunciones.LABEL_CANTIDAD
										,DetalleGuiaRemisionConstantesFunciones.LABEL_MONTO
										,DetalleGuiaRemisionConstantesFunciones.LABEL_PRECIO
										,DetalleGuiaRemisionConstantesFunciones.LABEL_PORCENTAJEDESCUENTO
										,DetalleGuiaRemisionConstantesFunciones.LABEL_DESCUENTO
										,DetalleGuiaRemisionConstantesFunciones.LABEL_DESCUENTO2
										,DetalleGuiaRemisionConstantesFunciones.LABEL_DESCUENTO3
										,DetalleGuiaRemisionConstantesFunciones.LABEL_PORCENTAJEIVA
										,DetalleGuiaRemisionConstantesFunciones.LABEL_IVA
										,DetalleGuiaRemisionConstantesFunciones.LABEL_TOTALDESCUENTO
										,DetalleGuiaRemisionConstantesFunciones.LABEL_TOTALIMPUESTO
										,DetalleGuiaRemisionConstantesFunciones.LABEL_SUBTOTAL
										,DetalleGuiaRemisionConstantesFunciones.LABEL_TOTAL
										,DetalleGuiaRemisionConstantesFunciones.LABEL_LOTE
										,DetalleGuiaRemisionConstantesFunciones.LABEL_LOTECLIENTE
										,DetalleGuiaRemisionConstantesFunciones.LABEL_ORDENCOMPRA
										,DetalleGuiaRemisionConstantesFunciones.LABEL_AREA
										,DetalleGuiaRemisionConstantesFunciones.LABEL_MEDIDAS
										,DetalleGuiaRemisionConstantesFunciones.LABEL_ACABADO
										,DetalleGuiaRemisionConstantesFunciones.LABEL_ACABADO2
										};
	   
	    public List<DetalleGuiaRemision> detalleguiaremisions;
	  	 
	    //NO SE UTILIZA
	    public DetalleGuiaRemisionModel(List<DetalleGuiaRemision> detalleguiaremisions,JInternalFrameBase jInternalFrameBase) {
	    	this.detalleguiaremisions=detalleguiaremisions;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleGuiaRemisionModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detalleguiaremisions=new ArrayList<DetalleGuiaRemision>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detalleguiaremisions.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detalleguiaremisions.get(rowIndex).getIsSelected();
	            
				case 1: return this.detalleguiaremisions.get(rowIndex).getId();
				case 2: return this.detalleguiaremisions.get(rowIndex).getid_empresa();
				case 3: return this.detalleguiaremisions.get(rowIndex).getid_sucursal();
				case 4: return this.detalleguiaremisions.get(rowIndex).getid_ejercicio();
				case 5: return this.detalleguiaremisions.get(rowIndex).getid_periodo();
				case 6: return this.detalleguiaremisions.get(rowIndex).getid_guia_remision();
				case 7: return this.detalleguiaremisions.get(rowIndex).getid_bodega();
				case 8: return this.detalleguiaremisions.get(rowIndex).getid_producto();
				case 9: return this.detalleguiaremisions.get(rowIndex).getid_unidad();
				case 10: return this.detalleguiaremisions.get(rowIndex).getid_centro_costo();
				case 11: return this.detalleguiaremisions.get(rowIndex).getcantidad_envases();
				case 12: return this.detalleguiaremisions.get(rowIndex).getcantidad_auxiliar();
				case 13: return this.detalleguiaremisions.get(rowIndex).getdescripcion();
				case 14: return this.detalleguiaremisions.get(rowIndex).getcantidad();
				case 15: return this.detalleguiaremisions.get(rowIndex).getmonto();
				case 16: return this.detalleguiaremisions.get(rowIndex).getprecio();
				case 17: return this.detalleguiaremisions.get(rowIndex).getporcentaje_descuento();
				case 18: return this.detalleguiaremisions.get(rowIndex).getdescuento();
				case 19: return this.detalleguiaremisions.get(rowIndex).getdescuento2();
				case 20: return this.detalleguiaremisions.get(rowIndex).getdescuento3();
				case 21: return this.detalleguiaremisions.get(rowIndex).getporcentaje_iva();
				case 22: return this.detalleguiaremisions.get(rowIndex).getiva();
				case 23: return this.detalleguiaremisions.get(rowIndex).gettotal_descuento();
				case 24: return this.detalleguiaremisions.get(rowIndex).gettotal_impuesto();
				case 25: return this.detalleguiaremisions.get(rowIndex).getsub_total();
				case 26: return this.detalleguiaremisions.get(rowIndex).gettotal();
				case 27: return this.detalleguiaremisions.get(rowIndex).getlote();
				case 28: return this.detalleguiaremisions.get(rowIndex).getlote_cliente();
				case 29: return this.detalleguiaremisions.get(rowIndex).getorden_compra();
				case 30: return this.detalleguiaremisions.get(rowIndex).getarea();
				case 31: return this.detalleguiaremisions.get(rowIndex).getmedidas();
				case 32: return this.detalleguiaremisions.get(rowIndex).getacabado();
				case 33: return this.detalleguiaremisions.get(rowIndex).getacabado2();	            
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
				case 13: return String.class;
				case 14: return Integer.class;
				case 15: return Double.class;
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
				case 27: return String.class;
				case 28: return String.class;
				case 29: return String.class;
				case 30: return String.class;
				case 31: return String.class;
				case 32: return String.class;
				case 33: return String.class;	            
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
	    	DetalleGuiaRemision detalleguiaremision = this.detalleguiaremisions.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleGuiaRemisionBeanSwingJInternalFrame detalleguiaremisionBeanSwingJInternalFrame=(DetalleGuiaRemisionBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detalleguiaremision.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detalleguiaremision.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detalleguiaremision.setid_empresa((Long) value);detalleguiaremision.setempresa_descripcion(detalleguiaremisionBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detalleguiaremision.setid_sucursal((Long) value);detalleguiaremision.setsucursal_descripcion(detalleguiaremisionBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detalleguiaremision.setid_ejercicio((Long) value);detalleguiaremision.setejercicio_descripcion(detalleguiaremisionBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detalleguiaremision.setid_periodo((Long) value);detalleguiaremision.setperiodo_descripcion(detalleguiaremisionBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detalleguiaremision.setid_guia_remision((Long) value);detalleguiaremision.setguiaremision_descripcion(detalleguiaremisionBeanSwingJInternalFrame.getActualGuiaRemisionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detalleguiaremision.setid_bodega((Long) value);detalleguiaremision.setbodega_descripcion(detalleguiaremisionBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detalleguiaremision.setid_producto((Long) value);detalleguiaremision.setproducto_descripcion(detalleguiaremisionBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detalleguiaremision.setid_unidad((Long) value);detalleguiaremision.setunidad_descripcion(detalleguiaremisionBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detalleguiaremision.setid_centro_costo((Long) value);detalleguiaremision.setcentrocosto_descripcion(detalleguiaremisionBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detalleguiaremision.setcantidad_envases((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detalleguiaremision.setcantidad_auxiliar((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detalleguiaremision.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detalleguiaremision.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detalleguiaremision.setmonto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detalleguiaremision.setprecio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detalleguiaremision.setporcentaje_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detalleguiaremision.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detalleguiaremision.setdescuento2((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detalleguiaremision.setdescuento3((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {detalleguiaremision.setporcentaje_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {detalleguiaremision.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {detalleguiaremision.settotal_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {detalleguiaremision.settotal_impuesto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {detalleguiaremision.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {detalleguiaremision.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {detalleguiaremision.setlote((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {detalleguiaremision.setlote_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {detalleguiaremision.setorden_compra((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {detalleguiaremision.setarea((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {detalleguiaremision.setmedidas((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {detalleguiaremision.setacabado((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {detalleguiaremision.setacabado2((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleGuiaRemisionModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetalleGuiaRemisionDetalleFormJInternalFrame detalleguiaremisionJInternalFrame=null;
		
		public DetalleGuiaRemisionModel(DetalleGuiaRemisionDetalleFormJInternalFrame detalleguiaremisionJInternalFrame) {
			this.detalleguiaremisionJInternalFrame=detalleguiaremisionJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleguiaremisionJInternalFrame.getjButtonActualizarToolBarDetalleGuiaRemision();
			
			if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.getjButtonActualizarToolBarDetalleGuiaRemision())) {
				componentTab=this.detalleguiaremisionJInternalFrame.getjButtonEliminarToolBarDetalleGuiaRemision();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.getjButtonEliminarToolBarDetalleGuiaRemision())) {
				componentTab=this.detalleguiaremisionJInternalFrame.getjButtonCancelarToolBarDetalleGuiaRemision();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.getjButtonCancelarToolBarDetalleGuiaRemision())) {
				componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_empresaDetalleGuiaRemision;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldacabado2DetalleGuiaRemision)) {
				componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxTiposAccionesFormularioDetalleGuiaRemision;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxTiposAccionesFormularioDetalleGuiaRemision)) {
				componentTab=this.detalleguiaremisionJInternalFrame.jButtonEliminarDetalleGuiaRemision;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jButtonEliminarDetalleGuiaRemision)) {
				componentTab=this.detalleguiaremisionJInternalFrame.jButtonActualizarDetalleGuiaRemision;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jButtonActualizarDetalleGuiaRemision)) {
				componentTab=this.detalleguiaremisionJInternalFrame.jButtonCancelarDetalleGuiaRemision;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_empresaDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_sucursalDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_sucursalDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_ejercicioDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_ejercicioDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_periodoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_periodoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_guia_remisionDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_guia_remisionDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_bodegaDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_bodegaDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_productoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_productoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_unidadDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_unidadDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_centro_costoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_centro_costoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldcantidad_envasesDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldcantidad_envasesDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldcantidad_auxiliarDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldcantidad_auxiliarDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextAreadescripcionDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextAreadescripcionDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldcantidadDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldcantidadDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldmontoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldmontoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldprecioDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldprecioDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldporcentaje_descuentoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldporcentaje_descuentoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFielddescuentoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFielddescuentoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFielddescuento2DetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFielddescuento2DetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFielddescuento3DetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFielddescuento3DetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldporcentaje_ivaDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldporcentaje_ivaDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldivaDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldivaDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldtotal_descuentoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldtotal_descuentoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldtotal_impuestoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldtotal_impuestoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldsub_totalDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldsub_totalDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldtotalDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldtotalDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldloteDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldloteDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldlote_clienteDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldlote_clienteDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldorden_compraDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldorden_compraDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldareaDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldareaDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldmedidasDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldmedidasDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldacabadoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldacabadoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldacabado2DetalleGuiaRemision;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleguiaremisionJInternalFrame.getjButtonActualizarToolBarDetalleGuiaRemision();
			
			if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.getjButtonEliminarToolBarDetalleGuiaRemision())) {
				componentTab=this.detalleguiaremisionJInternalFrame.getjButtonActualizarToolBarDetalleGuiaRemision();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.getjButtonCancelarToolBarDetalleGuiaRemision())) {
				componentTab=this.detalleguiaremisionJInternalFrame.getjButtonEliminarToolBarDetalleGuiaRemision();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_empresaDetalleGuiaRemision)) {
				
				componentTab=this.detalleguiaremisionJInternalFrame.getjButtonCancelarToolBarDetalleGuiaRemision();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxTiposAccionesFormularioDetalleGuiaRemision)) {
				componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldacabado2DetalleGuiaRemision;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jButtonEliminarDetalleGuiaRemision)) {
				componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxTiposAccionesFormularioDetalleGuiaRemision;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jButtonActualizarDetalleGuiaRemision)) {
				componentTab=this.detalleguiaremisionJInternalFrame.jButtonEliminarDetalleGuiaRemision;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jButtonCancelarDetalleGuiaRemision)) {
				componentTab=this.detalleguiaremisionJInternalFrame.jButtonActualizarDetalleGuiaRemision;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_sucursalDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_empresaDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_ejercicioDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_sucursalDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_periodoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_ejercicioDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_guia_remisionDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_periodoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_bodegaDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_guia_remisionDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_productoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_bodegaDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_unidadDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_productoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jComboBoxid_centro_costoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_unidadDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldcantidad_envasesDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jComboBoxid_centro_costoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldcantidad_auxiliarDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldcantidad_envasesDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextAreadescripcionDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldcantidad_auxiliarDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldcantidadDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextAreadescripcionDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldmontoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldcantidadDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldprecioDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldmontoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldporcentaje_descuentoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldprecioDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFielddescuentoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldporcentaje_descuentoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFielddescuento2DetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFielddescuentoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFielddescuento3DetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFielddescuento2DetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldporcentaje_ivaDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFielddescuento3DetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldivaDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldporcentaje_ivaDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldtotal_descuentoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldivaDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldtotal_impuestoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldtotal_descuentoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldsub_totalDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldtotal_impuestoDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldtotalDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldsub_totalDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldloteDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldtotalDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldlote_clienteDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldloteDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldorden_compraDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldlote_clienteDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldareaDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldorden_compraDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldmedidasDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldareaDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldacabadoDetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldmedidasDetalleGuiaRemision;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleguiaremisionJInternalFrame.jTextFieldacabado2DetalleGuiaRemision)) {
			componentTab=this.detalleguiaremisionJInternalFrame.jTextFieldacabadoDetalleGuiaRemision;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleguiaremisionJInternalFrame.getjButtonActualizarToolBarDetalleGuiaRemision();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleguiaremisionJInternalFrame.getjButtonActualizarToolBarDetalleGuiaRemision();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleguiaremisionJInternalFrame.getjButtonCancelarToolBarDetalleGuiaRemision();
			
			
			return componentTab;		
		}
		
		public DetalleGuiaRemisionDetalleFormJInternalFrame getdetalleguiaremisionJInternalFrame() {
			return this.detalleguiaremisionJInternalFrame;
		}
		
		public void setdetalleguiaremisionJInternalFrame(DetalleGuiaRemisionDetalleFormJInternalFrame detalleguiaremisionJInternalFrame) {
			this.detalleguiaremisionJInternalFrame=detalleguiaremisionJInternalFrame;
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
