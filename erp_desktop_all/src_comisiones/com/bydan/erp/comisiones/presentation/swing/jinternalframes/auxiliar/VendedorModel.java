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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.comisiones.util.VendedorConstantesFunciones;
import com.bydan.erp.comisiones.util.VendedorParameterReturnGeneral;
//import com.bydan.erp.comisiones.util.VendedorParameterGeneral;

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

import com.bydan.erp.comisiones.presentation.swing.jinternalframes.VendedorBeanSwingJInternalFrame;
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
import com.bydan.erp.comisiones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.comisiones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.comisiones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.comisiones.presentation.swing.jinternalframes.VendedorJInternalFrame;

import com.bydan.erp.comisiones.presentation.swing.jinternalframes.VendedorDetalleFormJInternalFrame;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class VendedorModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,VendedorConstantesFunciones.LABEL_ID
										,VendedorConstantesFunciones.LABEL_IDEMPRESA
										,VendedorConstantesFunciones.LABEL_IDSUCURSAL
										,VendedorConstantesFunciones.LABEL_CODIGO
										,VendedorConstantesFunciones.LABEL_NOMBRE
										,VendedorConstantesFunciones.LABEL_RUC
										,VendedorConstantesFunciones.LABEL_EMAIL
										,VendedorConstantesFunciones.LABEL_IDEMPLEADO
										,VendedorConstantesFunciones.LABEL_TELEFONO
										,VendedorConstantesFunciones.LABEL_IDEMPLEADOSOPORTE
										,VendedorConstantesFunciones.LABEL_IDVENDEDOR
										,VendedorConstantesFunciones.LABEL_IDPAIS
										,VendedorConstantesFunciones.LABEL_IDCIUDAD
										,VendedorConstantesFunciones.LABEL_IDZONA
										,VendedorConstantesFunciones.LABEL_REPRESENTANTE
										,VendedorConstantesFunciones.LABEL_ESSUPERVISOR
										,VendedorConstantesFunciones.LABEL_FECHACREACION
										,VendedorConstantesFunciones.LABEL_DIRECCIONDOMICILIO
										,VendedorConstantesFunciones.LABEL_DIRECCIONREFERENCIA
										,VendedorConstantesFunciones.LABEL_DESCRIPCION
										,VendedorConstantesFunciones.LABEL_PORCENTAJECOMISION
										,VendedorConstantesFunciones.LABEL_COMISION
										,VendedorConstantesFunciones.LABEL_MONTOVENDIDO
										,VendedorConstantesFunciones.LABEL_NUMEROFACTURAS
										,VendedorConstantesFunciones.LABEL_FECHAULTIMAVENTA
										,VendedorConstantesFunciones.LABEL_MONTOULTIMAVENTA
										,VendedorConstantesFunciones.LABEL_CONPRESUPUESTO
										,VendedorConstantesFunciones.LABEL_CONCOBERTURA
										};
	   
	    public List<Vendedor> vendedors;
	  	 
	    //NO SE UTILIZA
	    public VendedorModel(List<Vendedor> vendedors,JInternalFrameBase jInternalFrameBase) {
	    	this.vendedors=vendedors;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public VendedorModel(JInternalFrameBase jInternalFrameBase) {
	    	this.vendedors=new ArrayList<Vendedor>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.vendedors.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.vendedors.get(rowIndex).getIsSelected();
	            
				case 1: return this.vendedors.get(rowIndex).getId();
				case 2: return this.vendedors.get(rowIndex).getid_empresa();
				case 3: return this.vendedors.get(rowIndex).getid_sucursal();
				case 4: return this.vendedors.get(rowIndex).getcodigo();
				case 5: return this.vendedors.get(rowIndex).getnombre();
				case 6: return this.vendedors.get(rowIndex).getruc();
				case 7: return this.vendedors.get(rowIndex).getemail();
				case 8: return this.vendedors.get(rowIndex).getid_empleado();
				case 9: return this.vendedors.get(rowIndex).gettelefono();
				case 10: return this.vendedors.get(rowIndex).getid_empleado_soporte();
				case 11: return this.vendedors.get(rowIndex).getid_vendedor();
				case 12: return this.vendedors.get(rowIndex).getid_pais();
				case 13: return this.vendedors.get(rowIndex).getid_ciudad();
				case 14: return this.vendedors.get(rowIndex).getid_zona();
				case 15: return this.vendedors.get(rowIndex).getrepresentante();
				case 16: return this.vendedors.get(rowIndex).getes_supervisor();
				case 17: return this.vendedors.get(rowIndex).getfecha_creacion();
				case 18: return this.vendedors.get(rowIndex).getdireccion_domicilio();
				case 19: return this.vendedors.get(rowIndex).getdireccion_referencia();
				case 20: return this.vendedors.get(rowIndex).getdescripcion();
				case 21: return this.vendedors.get(rowIndex).getporcentaje_comision();
				case 22: return this.vendedors.get(rowIndex).getcomision();
				case 23: return this.vendedors.get(rowIndex).getmonto_vendido();
				case 24: return this.vendedors.get(rowIndex).getnumero_facturas();
				case 25: return this.vendedors.get(rowIndex).getfecha_ultima_venta();
				case 26: return this.vendedors.get(rowIndex).getmonto_ultima_venta();
				case 27: return this.vendedors.get(rowIndex).getcon_presupuesto();
				case 28: return this.vendedors.get(rowIndex).getcon_cobertura();	            
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
				case 8: return Long.class;
				case 9: return String.class;
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return Long.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return String.class;
				case 16: return Boolean.class;
				case 17: return Date.class;
				case 18: return String.class;
				case 19: return String.class;
				case 20: return String.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return Integer.class;
				case 25: return Date.class;
				case 26: return Double.class;
				case 27: return Boolean.class;
				case 28: return Boolean.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Vendedor vendedor = this.vendedors.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame=(VendedorBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {vendedor.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {vendedor.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {vendedor.setid_empresa((Long) value);vendedor.setempresa_descripcion(vendedorBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {vendedor.setid_sucursal((Long) value);vendedor.setsucursal_descripcion(vendedorBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {vendedor.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {vendedor.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {vendedor.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {vendedor.setemail((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {vendedor.setid_empleado((Long) value);vendedor.setempleado_descripcion(vendedorBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {vendedor.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {vendedor.setid_empleado_soporte((Long) value);vendedor.setempleadosoporte_descripcion(vendedorBeanSwingJInternalFrame.getActualEmpleadoSoporteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {vendedor.setid_vendedor((Long) value);vendedor.setvendedor_descripcion(vendedorBeanSwingJInternalFrame.getActualVendedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {vendedor.setid_pais((Long) value);vendedor.setpais_descripcion(vendedorBeanSwingJInternalFrame.getActualPaisForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {vendedor.setid_ciudad((Long) value);vendedor.setciudad_descripcion(vendedorBeanSwingJInternalFrame.getActualCiudadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {vendedor.setid_zona((Long) value);vendedor.setzona_descripcion(vendedorBeanSwingJInternalFrame.getActualZonaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {vendedor.setrepresentante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {vendedor.setes_supervisor((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {vendedor.setfecha_creacion((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {vendedor.setdireccion_domicilio((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {vendedor.setdireccion_referencia((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {vendedor.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {vendedor.setporcentaje_comision((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {vendedor.setcomision((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {vendedor.setmonto_vendido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {vendedor.setnumero_facturas((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {vendedor.setfecha_ultima_venta((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {vendedor.setmonto_ultima_venta((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {vendedor.setcon_presupuesto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {vendedor.setcon_cobertura((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public VendedorModel(JInternalFrameBase jInternalFrameBase) {
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
		private VendedorDetalleFormJInternalFrame vendedorJInternalFrame=null;
		
		public VendedorModel(VendedorDetalleFormJInternalFrame vendedorJInternalFrame) {
			this.vendedorJInternalFrame=vendedorJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.vendedorJInternalFrame.getjButtonActualizarToolBarVendedor();
			
			if(component!=null && component.equals(this.vendedorJInternalFrame.getjButtonActualizarToolBarVendedor())) {
				componentTab=this.vendedorJInternalFrame.getjButtonEliminarToolBarVendedor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.vendedorJInternalFrame.getjButtonEliminarToolBarVendedor())) {
				componentTab=this.vendedorJInternalFrame.getjButtonCancelarToolBarVendedor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.vendedorJInternalFrame.getjButtonCancelarToolBarVendedor())) {
				componentTab=this.vendedorJInternalFrame.jComboBoxid_empresaVendedor;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.vendedorJInternalFrame.jCheckBoxcon_coberturaVendedor)) {
				componentTab=this.vendedorJInternalFrame.jComboBoxTiposAccionesFormularioVendedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxTiposAccionesFormularioVendedor)) {
				componentTab=this.vendedorJInternalFrame.jButtonEliminarVendedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.vendedorJInternalFrame.jButtonEliminarVendedor)) {
				componentTab=this.vendedorJInternalFrame.jButtonActualizarVendedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.vendedorJInternalFrame.jButtonActualizarVendedor)) {
				componentTab=this.vendedorJInternalFrame.jButtonCancelarVendedor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_empresaVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_sucursalVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_sucursalVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextFieldcodigoVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextFieldcodigoVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextAreanombreVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextAreanombreVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextFieldrucVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextFieldrucVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextAreaemailVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextAreaemailVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_empleadoVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_empleadoVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextAreatelefonoVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextAreatelefonoVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_empleado_soporteVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_empleado_soporteVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_vendedorVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_vendedorVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_paisVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_paisVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_ciudadVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_ciudadVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_zonaVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_zonaVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextArearepresentanteVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextArearepresentanteVendedor)) {
			componentTab=this.vendedorJInternalFrame.jCheckBoxes_supervisorVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jCheckBoxes_supervisorVendedor)) {
			componentTab=this.vendedorJInternalFrame.jDateChooserfecha_creacionVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jDateChooserfecha_creacionVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextAreadireccion_domicilioVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextAreadireccion_domicilioVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextAreadireccion_referenciaVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextAreadireccion_referenciaVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextAreadescripcionVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextAreadescripcionVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextFieldporcentaje_comisionVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextFieldporcentaje_comisionVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextFieldcomisionVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextFieldcomisionVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextFieldnumero_facturasVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jCheckBoxcon_presupuestoVendedor)) {
			componentTab=this.vendedorJInternalFrame.jCheckBoxcon_coberturaVendedor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.vendedorJInternalFrame.getjButtonActualizarToolBarVendedor();
			
			if(component!=null && component.equals(this.vendedorJInternalFrame.getjButtonEliminarToolBarVendedor())) {
				componentTab=this.vendedorJInternalFrame.getjButtonActualizarToolBarVendedor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.vendedorJInternalFrame.getjButtonCancelarToolBarVendedor())) {
				componentTab=this.vendedorJInternalFrame.getjButtonEliminarToolBarVendedor();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_empresaVendedor)) {
				
				componentTab=this.vendedorJInternalFrame.getjButtonCancelarToolBarVendedor();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxTiposAccionesFormularioVendedor)) {
				componentTab=this.vendedorJInternalFrame.jCheckBoxcon_coberturaVendedor;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.vendedorJInternalFrame.jButtonEliminarVendedor)) {
				componentTab=this.vendedorJInternalFrame.jComboBoxTiposAccionesFormularioVendedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.vendedorJInternalFrame.jButtonActualizarVendedor)) {
				componentTab=this.vendedorJInternalFrame.jButtonEliminarVendedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.vendedorJInternalFrame.jButtonCancelarVendedor)) {
				componentTab=this.vendedorJInternalFrame.jButtonActualizarVendedor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_sucursalVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_empresaVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextFieldcodigoVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_sucursalVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextAreanombreVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextFieldcodigoVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextFieldrucVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextAreanombreVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextAreaemailVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextFieldrucVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_empleadoVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextAreaemailVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextAreatelefonoVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_empleadoVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_empleado_soporteVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextAreatelefonoVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_vendedorVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_empleado_soporteVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_paisVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_vendedorVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_ciudadVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_paisVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jComboBoxid_zonaVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_ciudadVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextArearepresentanteVendedor)) {
			componentTab=this.vendedorJInternalFrame.jComboBoxid_zonaVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jCheckBoxes_supervisorVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextArearepresentanteVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jDateChooserfecha_creacionVendedor)) {
			componentTab=this.vendedorJInternalFrame.jCheckBoxes_supervisorVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextAreadireccion_domicilioVendedor)) {
			componentTab=this.vendedorJInternalFrame.jDateChooserfecha_creacionVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextAreadireccion_referenciaVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextAreadireccion_domicilioVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextAreadescripcionVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextAreadireccion_referenciaVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextFieldporcentaje_comisionVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextAreadescripcionVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextFieldcomisionVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextFieldporcentaje_comisionVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jTextFieldnumero_facturasVendedor)) {
			componentTab=this.vendedorJInternalFrame.jTextFieldcomisionVendedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.vendedorJInternalFrame.jCheckBoxcon_coberturaVendedor)) {
			componentTab=this.vendedorJInternalFrame.jCheckBoxcon_presupuestoVendedor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.vendedorJInternalFrame.getjButtonActualizarToolBarVendedor();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.vendedorJInternalFrame.getjButtonActualizarToolBarVendedor();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.vendedorJInternalFrame.getjButtonCancelarToolBarVendedor();
			
			
			return componentTab;		
		}
		
		public VendedorDetalleFormJInternalFrame getvendedorJInternalFrame() {
			return this.vendedorJInternalFrame;
		}
		
		public void setvendedorJInternalFrame(VendedorDetalleFormJInternalFrame vendedorJInternalFrame) {
			this.vendedorJInternalFrame=vendedorJInternalFrame;
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
