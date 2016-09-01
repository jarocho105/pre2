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

import com.bydan.erp.contabilidad.util.DetalleAsientoContableCajaChicaConstantesFunciones;
import com.bydan.erp.contabilidad.util.DetalleAsientoContableCajaChicaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.DetalleAsientoContableCajaChicaParameterGeneral;

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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.DetalleAsientoContableCajaChicaBeanSwingJInternalFrame;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.DetalleAsientoContableCajaChicaJInternalFrame;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.DetalleAsientoContableCajaChicaDetalleFormJInternalFrame;

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


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetalleAsientoContableCajaChicaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_ID
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDEMPRESA
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDMODULO
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDEJERCICIO
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDPERIODO
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDANIO
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDMES
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDASIENTOCONTABLECAJACHICA
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPOGASTOEMPRESA
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_FECHAEMISION
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDTRANSACCION
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDFACTURA
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_ESPROVEEDOR
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDASIENTOCONTABLE
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_DETALLE
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORBIENTARIFA12
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORSERVICIOTARIFA12
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_PORCENTAJEIVA
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORBIENTARIFA0
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORSERVICIOTARIFA0
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORIVA
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORBIENICE
										,DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORSERVICIOICE
										};
	   
	    public List<DetalleAsientoContableCajaChica> detalleasientocontablecajachicas;
	  	 
	    //NO SE UTILIZA
	    public DetalleAsientoContableCajaChicaModel(List<DetalleAsientoContableCajaChica> detalleasientocontablecajachicas,JInternalFrameBase jInternalFrameBase) {
	    	this.detalleasientocontablecajachicas=detalleasientocontablecajachicas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleAsientoContableCajaChicaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detalleasientocontablecajachicas=new ArrayList<DetalleAsientoContableCajaChica>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detalleasientocontablecajachicas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detalleasientocontablecajachicas.get(rowIndex).getIsSelected();
	            
				case 1: return this.detalleasientocontablecajachicas.get(rowIndex).getId();
				case 2: return this.detalleasientocontablecajachicas.get(rowIndex).getid_empresa();
				case 3: return this.detalleasientocontablecajachicas.get(rowIndex).getid_sucursal();
				case 4: return this.detalleasientocontablecajachicas.get(rowIndex).getid_modulo();
				case 5: return this.detalleasientocontablecajachicas.get(rowIndex).getid_ejercicio();
				case 6: return this.detalleasientocontablecajachicas.get(rowIndex).getid_periodo();
				case 7: return this.detalleasientocontablecajachicas.get(rowIndex).getid_anio();
				case 8: return this.detalleasientocontablecajachicas.get(rowIndex).getid_mes();
				case 9: return this.detalleasientocontablecajachicas.get(rowIndex).getid_asiento_contable_caja_chica();
				case 10: return this.detalleasientocontablecajachicas.get(rowIndex).getid_tipo_gasto_empresa();
				case 11: return this.detalleasientocontablecajachicas.get(rowIndex).getfecha_emision();
				case 12: return this.detalleasientocontablecajachicas.get(rowIndex).getid_transaccion();
				case 13: return this.detalleasientocontablecajachicas.get(rowIndex).getid_factura();
				case 14: return this.detalleasientocontablecajachicas.get(rowIndex).getes_proveedor();
				case 15: return this.detalleasientocontablecajachicas.get(rowIndex).getid_asiento_contable();
				case 16: return this.detalleasientocontablecajachicas.get(rowIndex).getdetalle();
				case 17: return this.detalleasientocontablecajachicas.get(rowIndex).getvalor_bien_tarifa12();
				case 18: return this.detalleasientocontablecajachicas.get(rowIndex).getvalor_servicio_tarifa12();
				case 19: return this.detalleasientocontablecajachicas.get(rowIndex).getporcentaje_iva();
				case 20: return this.detalleasientocontablecajachicas.get(rowIndex).getvalor_bien_tarifa0();
				case 21: return this.detalleasientocontablecajachicas.get(rowIndex).getvalor_servicio_tarifa0();
				case 22: return this.detalleasientocontablecajachicas.get(rowIndex).getvalor_iva();
				case 23: return this.detalleasientocontablecajachicas.get(rowIndex).getvalor_bien_ice();
				case 24: return this.detalleasientocontablecajachicas.get(rowIndex).getvalor_servicio_ice();	            
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
				case 12: return Long.class;
				case 13: return Long.class;
				case 14: return Boolean.class;
				case 15: return Long.class;
				case 16: return String.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return Double.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetalleAsientoContableCajaChica detalleasientocontablecajachica = this.detalleasientocontablecajachicas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleAsientoContableCajaChicaBeanSwingJInternalFrame detalleasientocontablecajachicaBeanSwingJInternalFrame=(DetalleAsientoContableCajaChicaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detalleasientocontablecajachica.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detalleasientocontablecajachica.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detalleasientocontablecajachica.setid_empresa((Long) value);detalleasientocontablecajachica.setempresa_descripcion(detalleasientocontablecajachicaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detalleasientocontablecajachica.setid_sucursal((Long) value);detalleasientocontablecajachica.setsucursal_descripcion(detalleasientocontablecajachicaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detalleasientocontablecajachica.setid_modulo((Long) value);detalleasientocontablecajachica.setmodulo_descripcion(detalleasientocontablecajachicaBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detalleasientocontablecajachica.setid_ejercicio((Long) value);detalleasientocontablecajachica.setejercicio_descripcion(detalleasientocontablecajachicaBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detalleasientocontablecajachica.setid_periodo((Long) value);detalleasientocontablecajachica.setperiodo_descripcion(detalleasientocontablecajachicaBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detalleasientocontablecajachica.setid_anio((Long) value);detalleasientocontablecajachica.setanio_descripcion(detalleasientocontablecajachicaBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detalleasientocontablecajachica.setid_mes((Long) value);detalleasientocontablecajachica.setmes_descripcion(detalleasientocontablecajachicaBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detalleasientocontablecajachica.setid_asiento_contable_caja_chica((Long) value);detalleasientocontablecajachica.setasientocontablecajachica_descripcion(detalleasientocontablecajachicaBeanSwingJInternalFrame.getActualAsientoContableCajaChicaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detalleasientocontablecajachica.setid_tipo_gasto_empresa((Long) value);detalleasientocontablecajachica.settipogastoempresa_descripcion(detalleasientocontablecajachicaBeanSwingJInternalFrame.getActualTipoGastoEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detalleasientocontablecajachica.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detalleasientocontablecajachica.setid_transaccion((Long) value);detalleasientocontablecajachica.settransaccion_descripcion(detalleasientocontablecajachicaBeanSwingJInternalFrame.getActualTransaccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detalleasientocontablecajachica.setid_factura((Long) value);detalleasientocontablecajachica.setfactura_descripcion(detalleasientocontablecajachicaBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detalleasientocontablecajachica.setes_proveedor((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detalleasientocontablecajachica.setid_asiento_contable((Long) value);detalleasientocontablecajachica.setasientocontable_descripcion(detalleasientocontablecajachicaBeanSwingJInternalFrame.getActualAsientoContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detalleasientocontablecajachica.setdetalle((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detalleasientocontablecajachica.setvalor_bien_tarifa12((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detalleasientocontablecajachica.setvalor_servicio_tarifa12((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detalleasientocontablecajachica.setporcentaje_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detalleasientocontablecajachica.setvalor_bien_tarifa0((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {detalleasientocontablecajachica.setvalor_servicio_tarifa0((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {detalleasientocontablecajachica.setvalor_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {detalleasientocontablecajachica.setvalor_bien_ice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {detalleasientocontablecajachica.setvalor_servicio_ice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleAsientoContableCajaChicaModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetalleAsientoContableCajaChicaDetalleFormJInternalFrame detalleasientocontablecajachicaJInternalFrame=null;
		
		public DetalleAsientoContableCajaChicaModel(DetalleAsientoContableCajaChicaDetalleFormJInternalFrame detalleasientocontablecajachicaJInternalFrame) {
			this.detalleasientocontablecajachicaJInternalFrame=detalleasientocontablecajachicaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.getjButtonActualizarToolBarDetalleAsientoContableCajaChica();
			
			if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.getjButtonActualizarToolBarDetalleAsientoContableCajaChica())) {
				componentTab=this.detalleasientocontablecajachicaJInternalFrame.getjButtonEliminarToolBarDetalleAsientoContableCajaChica();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.getjButtonEliminarToolBarDetalleAsientoContableCajaChica())) {
				componentTab=this.detalleasientocontablecajachicaJInternalFrame.getjButtonCancelarToolBarDetalleAsientoContableCajaChica();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.getjButtonCancelarToolBarDetalleAsientoContableCajaChica())) {
				componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_empresaDetalleAsientoContableCajaChica;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jDateChooserfechaDetalleAsientoContableCajaChica)) {
				componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica)) {
				componentTab=this.detalleasientocontablecajachicaJInternalFrame.jButtonEliminarDetalleAsientoContableCajaChica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jButtonEliminarDetalleAsientoContableCajaChica)) {
				componentTab=this.detalleasientocontablecajachicaJInternalFrame.jButtonActualizarDetalleAsientoContableCajaChica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jButtonActualizarDetalleAsientoContableCajaChica)) {
				componentTab=this.detalleasientocontablecajachicaJInternalFrame.jButtonCancelarDetalleAsientoContableCajaChica;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_empresaDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_sucursalDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_sucursalDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_moduloDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_moduloDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_ejercicioDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_ejercicioDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_periodoDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_periodoDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_anioDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_anioDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_mesDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_mesDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jDateChooserfecha_emisionDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jDateChooserfecha_emisionDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_transaccionDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_transaccionDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_facturaDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_facturaDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jCheckBoxes_proveedorDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jCheckBoxes_proveedorDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_asiento_contableDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_asiento_contableDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextAreadetalleDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextAreadetalleDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_ivaDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_ivaDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_centro_costoDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_centro_costoDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jDateChooserfechaDetalleAsientoContableCajaChica;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.getjButtonActualizarToolBarDetalleAsientoContableCajaChica();
			
			if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.getjButtonEliminarToolBarDetalleAsientoContableCajaChica())) {
				componentTab=this.detalleasientocontablecajachicaJInternalFrame.getjButtonActualizarToolBarDetalleAsientoContableCajaChica();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.getjButtonCancelarToolBarDetalleAsientoContableCajaChica())) {
				componentTab=this.detalleasientocontablecajachicaJInternalFrame.getjButtonEliminarToolBarDetalleAsientoContableCajaChica();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_empresaDetalleAsientoContableCajaChica)) {
				
				componentTab=this.detalleasientocontablecajachicaJInternalFrame.getjButtonCancelarToolBarDetalleAsientoContableCajaChica();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica)) {
				componentTab=this.detalleasientocontablecajachicaJInternalFrame.jDateChooserfechaDetalleAsientoContableCajaChica;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jButtonEliminarDetalleAsientoContableCajaChica)) {
				componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jButtonActualizarDetalleAsientoContableCajaChica)) {
				componentTab=this.detalleasientocontablecajachicaJInternalFrame.jButtonEliminarDetalleAsientoContableCajaChica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jButtonCancelarDetalleAsientoContableCajaChica)) {
				componentTab=this.detalleasientocontablecajachicaJInternalFrame.jButtonActualizarDetalleAsientoContableCajaChica;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_sucursalDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_empresaDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_moduloDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_sucursalDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_ejercicioDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_moduloDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_periodoDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_ejercicioDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_anioDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_periodoDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_mesDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_anioDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_mesDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jDateChooserfecha_emisionDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_transaccionDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jDateChooserfecha_emisionDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_facturaDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_transaccionDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jCheckBoxes_proveedorDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_facturaDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_asiento_contableDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jCheckBoxes_proveedorDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextAreadetalleDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_asiento_contableDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextAreadetalleDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_ivaDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_ivaDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_centro_costoDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_centro_costoDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleasientocontablecajachicaJInternalFrame.jDateChooserfechaDetalleAsientoContableCajaChica)) {
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.getjButtonActualizarToolBarDetalleAsientoContableCajaChica();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.getjButtonActualizarToolBarDetalleAsientoContableCajaChica();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleasientocontablecajachicaJInternalFrame.getjButtonCancelarToolBarDetalleAsientoContableCajaChica();
			
			
			return componentTab;		
		}
		
		public DetalleAsientoContableCajaChicaDetalleFormJInternalFrame getdetalleasientocontablecajachicaJInternalFrame() {
			return this.detalleasientocontablecajachicaJInternalFrame;
		}
		
		public void setdetalleasientocontablecajachicaJInternalFrame(DetalleAsientoContableCajaChicaDetalleFormJInternalFrame detalleasientocontablecajachicaJInternalFrame) {
			this.detalleasientocontablecajachicaJInternalFrame=detalleasientocontablecajachicaJInternalFrame;
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
