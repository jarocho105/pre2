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

import com.bydan.erp.contabilidad.util.AsientoContableConstantesFunciones;
import com.bydan.erp.contabilidad.util.AsientoContableParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.AsientoContableParameterGeneral;

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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.AsientoContableBeanSwingJInternalFrame;
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
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS

import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.AsientoContableJInternalFrame;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.AsientoContableDetalleFormJInternalFrame;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class AsientoContableModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,AsientoContableConstantesFunciones.LABEL_ID
										,AsientoContableConstantesFunciones.LABEL_IDEMPRESA
										,AsientoContableConstantesFunciones.LABEL_IDSUCURSAL
										,AsientoContableConstantesFunciones.LABEL_IDEJERCICIO
										,AsientoContableConstantesFunciones.LABEL_IDPERIODO
										,AsientoContableConstantesFunciones.LABEL_IDANIO
										,AsientoContableConstantesFunciones.LABEL_IDMES
										,AsientoContableConstantesFunciones.LABEL_IDMODULO
										,AsientoContableConstantesFunciones.LABEL_IDUSUARIO
										,AsientoContableConstantesFunciones.LABEL_IDTIPODOCUMENTO
										,AsientoContableConstantesFunciones.LABEL_CODIGO
										,AsientoContableConstantesFunciones.LABEL_FECHA
										,AsientoContableConstantesFunciones.LABEL_IDTIPOMOVIMIENTO
										,AsientoContableConstantesFunciones.LABEL_NUMEROMAYOR
										,AsientoContableConstantesFunciones.LABEL_IDMONEDA
										,AsientoContableConstantesFunciones.LABEL_ESRETENCION
										,AsientoContableConstantesFunciones.LABEL_NUMERORETENCION
										,AsientoContableConstantesFunciones.LABEL_VALOR
										,AsientoContableConstantesFunciones.LABEL_ESRETENCIONIVA
										,AsientoContableConstantesFunciones.LABEL_NUMERORETENCIONIVA
										,AsientoContableConstantesFunciones.LABEL_COTIZACION
										,AsientoContableConstantesFunciones.LABEL_IDCLIENTE
										,AsientoContableConstantesFunciones.LABEL_IDTIPODESCRIPCIONASIENTO
										,AsientoContableConstantesFunciones.LABEL_IDFORMATO
										,AsientoContableConstantesFunciones.LABEL_BENEFICIARIO
										,AsientoContableConstantesFunciones.LABEL_DESCRIPCION
										,AsientoContableConstantesFunciones.LABEL_FECHAFINALIZACION
										,AsientoContableConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE
										};
	   
	    public List<AsientoContable> asientocontables;
	  	 
	    //NO SE UTILIZA
	    public AsientoContableModel(List<AsientoContable> asientocontables,JInternalFrameBase jInternalFrameBase) {
	    	this.asientocontables=asientocontables;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public AsientoContableModel(JInternalFrameBase jInternalFrameBase) {
	    	this.asientocontables=new ArrayList<AsientoContable>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.asientocontables.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.asientocontables.get(rowIndex).getIsSelected();
	            
				case 1: return this.asientocontables.get(rowIndex).getId();
				case 2: return this.asientocontables.get(rowIndex).getid_empresa();
				case 3: return this.asientocontables.get(rowIndex).getid_sucursal();
				case 4: return this.asientocontables.get(rowIndex).getid_ejercicio();
				case 5: return this.asientocontables.get(rowIndex).getid_periodo();
				case 6: return this.asientocontables.get(rowIndex).getid_anio();
				case 7: return this.asientocontables.get(rowIndex).getid_mes();
				case 8: return this.asientocontables.get(rowIndex).getid_modulo();
				case 9: return this.asientocontables.get(rowIndex).getid_usuario();
				case 10: return this.asientocontables.get(rowIndex).getid_tipo_documento();
				case 11: return this.asientocontables.get(rowIndex).getcodigo();
				case 12: return this.asientocontables.get(rowIndex).getfecha();
				case 13: return this.asientocontables.get(rowIndex).getid_tipo_movimiento();
				case 14: return this.asientocontables.get(rowIndex).getnumero_mayor();
				case 15: return this.asientocontables.get(rowIndex).getid_moneda();
				case 16: return this.asientocontables.get(rowIndex).getes_retencion();
				case 17: return this.asientocontables.get(rowIndex).getnumero_retencion();
				case 18: return this.asientocontables.get(rowIndex).getvalor();
				case 19: return this.asientocontables.get(rowIndex).getes_retencion_iva();
				case 20: return this.asientocontables.get(rowIndex).getnumero_retencion_iva();
				case 21: return this.asientocontables.get(rowIndex).getcotizacion();
				case 22: return this.asientocontables.get(rowIndex).getid_cliente();
				case 23: return this.asientocontables.get(rowIndex).getid_tipo_descripcion_asiento();
				case 24: return this.asientocontables.get(rowIndex).getid_formato();
				case 25: return this.asientocontables.get(rowIndex).getbeneficiario();
				case 26: return this.asientocontables.get(rowIndex).getdescripcion();
				case 27: return this.asientocontables.get(rowIndex).getfecha_finalizacion();
				case 28: return this.asientocontables.get(rowIndex).getid_estado_asiento_contable();	            
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
				case 11: return String.class;
				case 12: return Date.class;
				case 13: return Long.class;
				case 14: return String.class;
				case 15: return Long.class;
				case 16: return Boolean.class;
				case 17: return String.class;
				case 18: return Double.class;
				case 19: return Boolean.class;
				case 20: return String.class;
				case 21: return Double.class;
				case 22: return Long.class;
				case 23: return Long.class;
				case 24: return Long.class;
				case 25: return String.class;
				case 26: return String.class;
				case 27: return Date.class;
				case 28: return Long.class;	            
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
	    	AsientoContable asientocontable = this.asientocontables.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=(AsientoContableBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {asientocontable.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {asientocontable.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {asientocontable.setid_empresa((Long) value);asientocontable.setempresa_descripcion(asientocontableBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {asientocontable.setid_sucursal((Long) value);asientocontable.setsucursal_descripcion(asientocontableBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {asientocontable.setid_ejercicio((Long) value);asientocontable.setejercicio_descripcion(asientocontableBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {asientocontable.setid_periodo((Long) value);asientocontable.setperiodo_descripcion(asientocontableBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {asientocontable.setid_anio((Long) value);asientocontable.setanio_descripcion(asientocontableBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {asientocontable.setid_mes((Long) value);asientocontable.setmes_descripcion(asientocontableBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {asientocontable.setid_modulo((Long) value);asientocontable.setmodulo_descripcion(asientocontableBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {asientocontable.setid_usuario((Long) value);asientocontable.setusuario_descripcion(asientocontableBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {asientocontable.setid_tipo_documento((Long) value);asientocontable.settipodocumento_descripcion(asientocontableBeanSwingJInternalFrame.getActualTipoDocumentoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {asientocontable.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {asientocontable.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {asientocontable.setid_tipo_movimiento((Long) value);asientocontable.settipomovimiento_descripcion(asientocontableBeanSwingJInternalFrame.getActualTipoMovimientoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {asientocontable.setnumero_mayor((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {asientocontable.setid_moneda((Long) value);asientocontable.setmoneda_descripcion(asientocontableBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {asientocontable.setes_retencion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {asientocontable.setnumero_retencion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {asientocontable.setvalor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {asientocontable.setes_retencion_iva((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {asientocontable.setnumero_retencion_iva((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {asientocontable.setcotizacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {asientocontable.setid_cliente((Long) value);asientocontable.setcliente_descripcion(asientocontableBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {asientocontable.setid_tipo_descripcion_asiento((Long) value);asientocontable.settipodescripcionasiento_descripcion(asientocontableBeanSwingJInternalFrame.getActualTipoDescripcionAsientoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {asientocontable.setid_formato((Long) value);asientocontable.setformato_descripcion(asientocontableBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {asientocontable.setbeneficiario((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {asientocontable.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {asientocontable.setfecha_finalizacion((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {asientocontable.setid_estado_asiento_contable((Long) value);asientocontable.setestadoasientocontable_descripcion(asientocontableBeanSwingJInternalFrame.getActualEstadoAsientoContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public AsientoContableModel(JInternalFrameBase jInternalFrameBase) {
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
		private AsientoContableDetalleFormJInternalFrame asientocontableJInternalFrame=null;
		
		public AsientoContableModel(AsientoContableDetalleFormJInternalFrame asientocontableJInternalFrame) {
			this.asientocontableJInternalFrame=asientocontableJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.asientocontableJInternalFrame.getjButtonActualizarToolBarAsientoContable();
			
			if(component!=null && component.equals(this.asientocontableJInternalFrame.getjButtonActualizarToolBarAsientoContable())) {
				componentTab=this.asientocontableJInternalFrame.getjButtonEliminarToolBarAsientoContable();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontableJInternalFrame.getjButtonEliminarToolBarAsientoContable())) {
				componentTab=this.asientocontableJInternalFrame.getjButtonCancelarToolBarAsientoContable();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontableJInternalFrame.getjButtonCancelarToolBarAsientoContable())) {
				componentTab=this.asientocontableJInternalFrame.jComboBoxid_empresaAsientoContable;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_tipo_movimiento_moduloAsientoContable)) {
				componentTab=this.asientocontableJInternalFrame.jComboBoxTiposAccionesFormularioAsientoContable;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxTiposAccionesFormularioAsientoContable)) {
				componentTab=this.asientocontableJInternalFrame.jButtonEliminarAsientoContable;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontableJInternalFrame.jButtonEliminarAsientoContable)) {
				componentTab=this.asientocontableJInternalFrame.jButtonActualizarAsientoContable;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontableJInternalFrame.jButtonActualizarAsientoContable)) {
				componentTab=this.asientocontableJInternalFrame.jButtonCancelarAsientoContable;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_empresaAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_sucursalAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_sucursalAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_ejercicioAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_ejercicioAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_periodoAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_periodoAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_anioAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_anioAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_mesAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_mesAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_moduloAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_moduloAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_usuarioAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_usuarioAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_tipo_documentoAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_tipo_documentoAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jDateChooserfechaAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jDateChooserfechaAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_tipo_movimientoAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_tipo_movimientoAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jTextAreanumero_mayorAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jTextAreanumero_mayorAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_monedaAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_monedaAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jCheckBoxes_retencionAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jCheckBoxes_retencionAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jTextFieldvalorAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jTextFieldvalorAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jCheckBoxes_retencion_ivaAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jCheckBoxes_retencion_ivaAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jTextFieldcotizacionAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_clienteAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_tipo_descripcion_asientoAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_tipo_descripcion_asientoAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_formatoAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_formatoAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jTextAreabeneficiarioAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jTextAreabeneficiarioAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jTextAreadescripcionAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jTextAreadescripcionAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jDateChooserfecha_emisionAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jDateChooserfecha_emisionAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jDateChooserfecha_finalizacionAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jDateChooserfecha_finalizacionAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_estado_asiento_contableAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_estado_asiento_contableAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_tipo_movimiento_moduloAsientoContable;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.asientocontableJInternalFrame.getjButtonActualizarToolBarAsientoContable();
			
			if(component!=null && component.equals(this.asientocontableJInternalFrame.getjButtonEliminarToolBarAsientoContable())) {
				componentTab=this.asientocontableJInternalFrame.getjButtonActualizarToolBarAsientoContable();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontableJInternalFrame.getjButtonCancelarToolBarAsientoContable())) {
				componentTab=this.asientocontableJInternalFrame.getjButtonEliminarToolBarAsientoContable();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_empresaAsientoContable)) {
				
				componentTab=this.asientocontableJInternalFrame.getjButtonCancelarToolBarAsientoContable();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxTiposAccionesFormularioAsientoContable)) {
				componentTab=this.asientocontableJInternalFrame.jComboBoxid_tipo_movimiento_moduloAsientoContable;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.asientocontableJInternalFrame.jButtonEliminarAsientoContable)) {
				componentTab=this.asientocontableJInternalFrame.jComboBoxTiposAccionesFormularioAsientoContable;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontableJInternalFrame.jButtonActualizarAsientoContable)) {
				componentTab=this.asientocontableJInternalFrame.jButtonEliminarAsientoContable;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.asientocontableJInternalFrame.jButtonCancelarAsientoContable)) {
				componentTab=this.asientocontableJInternalFrame.jButtonActualizarAsientoContable;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_sucursalAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_empresaAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_ejercicioAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_sucursalAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_periodoAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_ejercicioAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_anioAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_periodoAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_mesAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_anioAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_moduloAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_mesAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_usuarioAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_moduloAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_tipo_documentoAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_usuarioAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jDateChooserfechaAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_tipo_documentoAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_tipo_movimientoAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jDateChooserfechaAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jTextAreanumero_mayorAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_tipo_movimientoAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_monedaAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jTextAreanumero_mayorAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jCheckBoxes_retencionAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_monedaAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jTextFieldvalorAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jCheckBoxes_retencionAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jCheckBoxes_retencion_ivaAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jTextFieldvalorAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jTextFieldcotizacionAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jCheckBoxes_retencion_ivaAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_tipo_descripcion_asientoAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_clienteAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_formatoAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_tipo_descripcion_asientoAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jTextAreabeneficiarioAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_formatoAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jTextAreadescripcionAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jTextAreabeneficiarioAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jDateChooserfecha_emisionAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jTextAreadescripcionAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jDateChooserfecha_finalizacionAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jDateChooserfecha_emisionAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_estado_asiento_contableAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jDateChooserfecha_finalizacionAsientoContable;
			return componentTab;
		}

		if(component!=null && component.equals(this.asientocontableJInternalFrame.jComboBoxid_tipo_movimiento_moduloAsientoContable)) {
			componentTab=this.asientocontableJInternalFrame.jComboBoxid_estado_asiento_contableAsientoContable;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.asientocontableJInternalFrame.getjButtonActualizarToolBarAsientoContable();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.asientocontableJInternalFrame.getjButtonActualizarToolBarAsientoContable();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.asientocontableJInternalFrame.getjButtonCancelarToolBarAsientoContable();
			
			
			return componentTab;		
		}
		
		public AsientoContableDetalleFormJInternalFrame getasientocontableJInternalFrame() {
			return this.asientocontableJInternalFrame;
		}
		
		public void setasientocontableJInternalFrame(AsientoContableDetalleFormJInternalFrame asientocontableJInternalFrame) {
			this.asientocontableJInternalFrame=asientocontableJInternalFrame;
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
