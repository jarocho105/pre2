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

import com.bydan.erp.inventario.util.TransferenciaConstantesFunciones;
import com.bydan.erp.inventario.util.TransferenciaParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TransferenciaParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.TransferenciaBeanSwingJInternalFrame;
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
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.TransferenciaJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.TransferenciaDetalleFormJInternalFrame;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.nomina.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class TransferenciaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,TransferenciaConstantesFunciones.LABEL_ID
										,TransferenciaConstantesFunciones.LABEL_IDEMPRESA
										,TransferenciaConstantesFunciones.LABEL_IDSUCURSAL
										,TransferenciaConstantesFunciones.LABEL_IDMODULO
										,TransferenciaConstantesFunciones.LABEL_IDEJERCICIO
										,TransferenciaConstantesFunciones.LABEL_IDPERIODO
										,TransferenciaConstantesFunciones.LABEL_IDANIO
										,TransferenciaConstantesFunciones.LABEL_IDMES
										,TransferenciaConstantesFunciones.LABEL_IDUSUARIO
										,TransferenciaConstantesFunciones.LABEL_FECHAEMISION
										,TransferenciaConstantesFunciones.LABEL_FECHAENTREGA
										,TransferenciaConstantesFunciones.LABEL_NUMEROSECUENCIAL
										,TransferenciaConstantesFunciones.LABEL_IDMONEDA
										,TransferenciaConstantesFunciones.LABEL_IDTIPOCAMBIO
										,TransferenciaConstantesFunciones.LABEL_IDESTADOINVENTARIO
										,TransferenciaConstantesFunciones.LABEL_IDFORMATO
										,TransferenciaConstantesFunciones.LABEL_IDTRANSPORTISTA
										,TransferenciaConstantesFunciones.LABEL_IDEMPLEADO
										,TransferenciaConstantesFunciones.LABEL_DESCRIPCION
										,TransferenciaConstantesFunciones.LABEL_PORCENTAJEDESCUENTO
										,TransferenciaConstantesFunciones.LABEL_SUMAN
										,TransferenciaConstantesFunciones.LABEL_ICE
										,TransferenciaConstantesFunciones.LABEL_VALORDESCUENTO
										,TransferenciaConstantesFunciones.LABEL_TOTALDESCUENTO
										,TransferenciaConstantesFunciones.LABEL_IVA
										,TransferenciaConstantesFunciones.LABEL_STOCK
										,TransferenciaConstantesFunciones.LABEL_SUBTOTAL
										,TransferenciaConstantesFunciones.LABEL_TOTALOTRO
										,TransferenciaConstantesFunciones.LABEL_ULTIMOCOSTO
										,TransferenciaConstantesFunciones.LABEL_NUMEROITEMS
										,TransferenciaConstantesFunciones.LABEL_RETENCION
										,TransferenciaConstantesFunciones.LABEL_TOTAL
										};
	   
	    public List<Transferencia> transferencias;
	  	 
	    //NO SE UTILIZA
	    public TransferenciaModel(List<Transferencia> transferencias,JInternalFrameBase jInternalFrameBase) {
	    	this.transferencias=transferencias;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public TransferenciaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.transferencias=new ArrayList<Transferencia>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.transferencias.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.transferencias.get(rowIndex).getIsSelected();
	            
				case 1: return this.transferencias.get(rowIndex).getId();
				case 2: return this.transferencias.get(rowIndex).getid_empresa();
				case 3: return this.transferencias.get(rowIndex).getid_sucursal();
				case 4: return this.transferencias.get(rowIndex).getid_modulo();
				case 5: return this.transferencias.get(rowIndex).getid_ejercicio();
				case 6: return this.transferencias.get(rowIndex).getid_periodo();
				case 7: return this.transferencias.get(rowIndex).getid_anio();
				case 8: return this.transferencias.get(rowIndex).getid_mes();
				case 9: return this.transferencias.get(rowIndex).getid_usuario();
				case 10: return this.transferencias.get(rowIndex).getfecha_emision();
				case 11: return this.transferencias.get(rowIndex).getfecha_entrega();
				case 12: return this.transferencias.get(rowIndex).getnumero_secuencial();
				case 13: return this.transferencias.get(rowIndex).getid_moneda();
				case 14: return this.transferencias.get(rowIndex).getid_tipo_cambio();
				case 15: return this.transferencias.get(rowIndex).getid_estado_inventario();
				case 16: return this.transferencias.get(rowIndex).getid_formato();
				case 17: return this.transferencias.get(rowIndex).getid_transportista();
				case 18: return this.transferencias.get(rowIndex).getid_empleado();
				case 19: return this.transferencias.get(rowIndex).getdescripcion();
				case 20: return this.transferencias.get(rowIndex).getporcentaje_descuento();
				case 21: return this.transferencias.get(rowIndex).getsuman();
				case 22: return this.transferencias.get(rowIndex).getice();
				case 23: return this.transferencias.get(rowIndex).getvalor_descuento();
				case 24: return this.transferencias.get(rowIndex).gettotal_descuento();
				case 25: return this.transferencias.get(rowIndex).getiva();
				case 26: return this.transferencias.get(rowIndex).getstock();
				case 27: return this.transferencias.get(rowIndex).getsub_total();
				case 28: return this.transferencias.get(rowIndex).gettotal_otro();
				case 29: return this.transferencias.get(rowIndex).getultimo_costo();
				case 30: return this.transferencias.get(rowIndex).getnumero_items();
				case 31: return this.transferencias.get(rowIndex).getretencion();
				case 32: return this.transferencias.get(rowIndex).gettotal();	            
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
				case 10: return Date.class;
				case 11: return Date.class;
				case 12: return String.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Long.class;
				case 19: return String.class;
				case 20: return Double.class;
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
				case 31: return Double.class;
				case 32: return Double.class;	            
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
	    	Transferencia transferencia = this.transferencias.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			TransferenciaBeanSwingJInternalFrame transferenciaBeanSwingJInternalFrame=(TransferenciaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {transferencia.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {transferencia.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {transferencia.setid_empresa((Long) value);transferencia.setempresa_descripcion(transferenciaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {transferencia.setid_sucursal((Long) value);transferencia.setsucursal_descripcion(transferenciaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {transferencia.setid_modulo((Long) value);transferencia.setmodulo_descripcion(transferenciaBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {transferencia.setid_ejercicio((Long) value);transferencia.setejercicio_descripcion(transferenciaBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {transferencia.setid_periodo((Long) value);transferencia.setperiodo_descripcion(transferenciaBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {transferencia.setid_anio((Long) value);transferencia.setanio_descripcion(transferenciaBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {transferencia.setid_mes((Long) value);transferencia.setmes_descripcion(transferenciaBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {transferencia.setid_usuario((Long) value);transferencia.setusuario_descripcion(transferenciaBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {transferencia.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {transferencia.setfecha_entrega((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {transferencia.setnumero_secuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {transferencia.setid_moneda((Long) value);transferencia.setmoneda_descripcion(transferenciaBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {transferencia.setid_tipo_cambio((Long) value);transferencia.settipocambio_descripcion(transferenciaBeanSwingJInternalFrame.getActualTipoCambioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {transferencia.setid_estado_inventario((Long) value);transferencia.setestadoinventario_descripcion(transferenciaBeanSwingJInternalFrame.getActualEstadoInventarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {transferencia.setid_formato((Long) value);transferencia.setformato_descripcion(transferenciaBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {transferencia.setid_transportista((Long) value);transferencia.settransportista_descripcion(transferenciaBeanSwingJInternalFrame.getActualTransportistaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {transferencia.setid_empleado((Long) value);transferencia.setempleado_descripcion(transferenciaBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {transferencia.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {transferencia.setporcentaje_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {transferencia.setsuman((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {transferencia.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {transferencia.setvalor_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {transferencia.settotal_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {transferencia.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {transferencia.setstock((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {transferencia.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {transferencia.settotal_otro((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {transferencia.setultimo_costo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {transferencia.setnumero_items((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {transferencia.setretencion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {transferencia.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public TransferenciaModel(JInternalFrameBase jInternalFrameBase) {
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
		private TransferenciaDetalleFormJInternalFrame transferenciaJInternalFrame=null;
		
		public TransferenciaModel(TransferenciaDetalleFormJInternalFrame transferenciaJInternalFrame) {
			this.transferenciaJInternalFrame=transferenciaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.transferenciaJInternalFrame.getjButtonActualizarToolBarTransferencia();
			
			if(component!=null && component.equals(this.transferenciaJInternalFrame.getjButtonActualizarToolBarTransferencia())) {
				componentTab=this.transferenciaJInternalFrame.getjButtonEliminarToolBarTransferencia();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciaJInternalFrame.getjButtonEliminarToolBarTransferencia())) {
				componentTab=this.transferenciaJInternalFrame.getjButtonCancelarToolBarTransferencia();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciaJInternalFrame.getjButtonCancelarToolBarTransferencia())) {
				componentTab=this.transferenciaJInternalFrame.jComboBoxid_empresaTransferencia;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.transferenciaJInternalFrame.jDateChooserfechaTransferencia)) {
				componentTab=this.transferenciaJInternalFrame.jComboBoxTiposAccionesFormularioTransferencia;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxTiposAccionesFormularioTransferencia)) {
				componentTab=this.transferenciaJInternalFrame.jButtonEliminarTransferencia;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciaJInternalFrame.jButtonEliminarTransferencia)) {
				componentTab=this.transferenciaJInternalFrame.jButtonActualizarTransferencia;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciaJInternalFrame.jButtonActualizarTransferencia)) {
				componentTab=this.transferenciaJInternalFrame.jButtonCancelarTransferencia;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_empresaTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_sucursalTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_sucursalTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_moduloTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_moduloTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_ejercicioTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_ejercicioTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_periodoTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_periodoTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_anioTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_anioTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_mesTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_mesTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_usuarioTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_usuarioTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jDateChooserfecha_emisionTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jDateChooserfecha_emisionTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jDateChooserfecha_entregaTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jDateChooserfecha_entregaTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_monedaTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_monedaTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_tipo_cambioTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_tipo_cambioTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_formatoTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_formatoTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_transportistaTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_transportistaTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_empleadoTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_empleadoTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jTextAreadescripcionTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jTextAreadescripcionTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jTextFieldsumanTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jTextFieldfleteTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jTextFieldimpuestoTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jTextFieldimpuestoTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_tipo_transaccion_moduloTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_tipo_transaccion_moduloTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_asiento_contableTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_asiento_contableTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jTextFieldnumero_comprobanteTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jTextFieldnumero_comprobanteTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jDateChooserfechaTransferencia;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.transferenciaJInternalFrame.getjButtonActualizarToolBarTransferencia();
			
			if(component!=null && component.equals(this.transferenciaJInternalFrame.getjButtonEliminarToolBarTransferencia())) {
				componentTab=this.transferenciaJInternalFrame.getjButtonActualizarToolBarTransferencia();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciaJInternalFrame.getjButtonCancelarToolBarTransferencia())) {
				componentTab=this.transferenciaJInternalFrame.getjButtonEliminarToolBarTransferencia();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_empresaTransferencia)) {
				
				componentTab=this.transferenciaJInternalFrame.getjButtonCancelarToolBarTransferencia();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxTiposAccionesFormularioTransferencia)) {
				componentTab=this.transferenciaJInternalFrame.jDateChooserfechaTransferencia;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.transferenciaJInternalFrame.jButtonEliminarTransferencia)) {
				componentTab=this.transferenciaJInternalFrame.jComboBoxTiposAccionesFormularioTransferencia;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciaJInternalFrame.jButtonActualizarTransferencia)) {
				componentTab=this.transferenciaJInternalFrame.jButtonEliminarTransferencia;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciaJInternalFrame.jButtonCancelarTransferencia)) {
				componentTab=this.transferenciaJInternalFrame.jButtonActualizarTransferencia;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_sucursalTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_empresaTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_moduloTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_sucursalTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_ejercicioTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_moduloTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_periodoTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_ejercicioTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_anioTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_periodoTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_mesTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_anioTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_usuarioTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_mesTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jDateChooserfecha_emisionTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_usuarioTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jDateChooserfecha_entregaTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jDateChooserfecha_emisionTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_monedaTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jDateChooserfecha_entregaTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_tipo_cambioTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_monedaTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_formatoTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_tipo_cambioTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_transportistaTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_formatoTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_empleadoTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_transportistaTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jTextAreadescripcionTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_empleadoTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jTextFieldsumanTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jTextAreadescripcionTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jTextFieldimpuestoTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jTextFieldfleteTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_tipo_transaccion_moduloTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jTextFieldimpuestoTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jComboBoxid_asiento_contableTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_tipo_transaccion_moduloTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jTextFieldnumero_comprobanteTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jComboBoxid_asiento_contableTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciaJInternalFrame.jDateChooserfechaTransferencia)) {
			componentTab=this.transferenciaJInternalFrame.jTextFieldnumero_comprobanteTransferencia;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.transferenciaJInternalFrame.getjButtonActualizarToolBarTransferencia();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.transferenciaJInternalFrame.getjButtonActualizarToolBarTransferencia();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.transferenciaJInternalFrame.getjButtonCancelarToolBarTransferencia();
			
			
			return componentTab;		
		}
		
		public TransferenciaDetalleFormJInternalFrame gettransferenciaJInternalFrame() {
			return this.transferenciaJInternalFrame;
		}
		
		public void settransferenciaJInternalFrame(TransferenciaDetalleFormJInternalFrame transferenciaJInternalFrame) {
			this.transferenciaJInternalFrame=transferenciaJInternalFrame;
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
