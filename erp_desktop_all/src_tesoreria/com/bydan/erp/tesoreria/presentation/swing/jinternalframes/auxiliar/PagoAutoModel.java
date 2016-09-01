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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.tesoreria.util.PagoAutoConstantesFunciones;
import com.bydan.erp.tesoreria.util.PagoAutoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.PagoAutoParameterGeneral;

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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.PagoAutoBeanSwingJInternalFrame;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.PagoAutoJInternalFrame;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.PagoAutoDetalleFormJInternalFrame;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class PagoAutoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,PagoAutoConstantesFunciones.LABEL_ID
										,PagoAutoConstantesFunciones.LABEL_IDEMPRESA
										,PagoAutoConstantesFunciones.LABEL_IDSUCURSAL
										,PagoAutoConstantesFunciones.LABEL_IDEJERCICIO
										,PagoAutoConstantesFunciones.LABEL_IDCLIENTE
										,PagoAutoConstantesFunciones.LABEL_IDASIENTOCONTABLE
										,PagoAutoConstantesFunciones.LABEL_IDCENTROCOSTO
										,PagoAutoConstantesFunciones.LABEL_IDCENTROACTIVIDAD
										,PagoAutoConstantesFunciones.LABEL_IDFACTURA
										,PagoAutoConstantesFunciones.LABEL_IDDETALLEPROVE
										,PagoAutoConstantesFunciones.LABEL_IDCUENTABANCO
										,PagoAutoConstantesFunciones.LABEL_IDTRANSACCION
										,PagoAutoConstantesFunciones.LABEL_IDESTADOPAGOAUTO
										,PagoAutoConstantesFunciones.LABEL_NUMEROFACTURA
										,PagoAutoConstantesFunciones.LABEL_FECHAEMISION
										,PagoAutoConstantesFunciones.LABEL_FECHAVENCIMIENTO
										,PagoAutoConstantesFunciones.LABEL_FECHACORTE
										,PagoAutoConstantesFunciones.LABEL_VALORPORPAGAR
										,PagoAutoConstantesFunciones.LABEL_VALORCANCELADO
										,PagoAutoConstantesFunciones.LABEL_ESTAAUTORIZADO
										,PagoAutoConstantesFunciones.LABEL_DESCRIPCION
										};
	   
	    public List<PagoAuto> pagoautos;
	  	 
	    //NO SE UTILIZA
	    public PagoAutoModel(List<PagoAuto> pagoautos,JInternalFrameBase jInternalFrameBase) {
	    	this.pagoautos=pagoautos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public PagoAutoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.pagoautos=new ArrayList<PagoAuto>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.pagoautos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.pagoautos.get(rowIndex).getIsSelected();
	            
				case 1: return this.pagoautos.get(rowIndex).getId();
				case 2: return this.pagoautos.get(rowIndex).getid_empresa();
				case 3: return this.pagoautos.get(rowIndex).getid_sucursal();
				case 4: return this.pagoautos.get(rowIndex).getid_ejercicio();
				case 5: return this.pagoautos.get(rowIndex).getid_cliente();
				case 6: return this.pagoautos.get(rowIndex).getid_asiento_contable();
				case 7: return this.pagoautos.get(rowIndex).getid_centro_costo();
				case 8: return this.pagoautos.get(rowIndex).getid_centro_actividad();
				case 9: return this.pagoautos.get(rowIndex).getid_factura();
				case 10: return this.pagoautos.get(rowIndex).getid_detalle_prove();
				case 11: return this.pagoautos.get(rowIndex).getid_cuenta_banco();
				case 12: return this.pagoautos.get(rowIndex).getid_transaccion();
				case 13: return this.pagoautos.get(rowIndex).getid_estado_pago_auto();
				case 14: return this.pagoautos.get(rowIndex).getnumero_factura();
				case 15: return this.pagoautos.get(rowIndex).getfecha_emision();
				case 16: return this.pagoautos.get(rowIndex).getfecha_vencimiento();
				case 17: return this.pagoautos.get(rowIndex).getfecha_corte();
				case 18: return this.pagoautos.get(rowIndex).getvalor_por_pagar();
				case 19: return this.pagoautos.get(rowIndex).getvalor_cancelado();
				case 20: return this.pagoautos.get(rowIndex).getesta_autorizado();
				case 21: return this.pagoautos.get(rowIndex).getdescripcion();	            
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
				case 15: return Date.class;
				case 16: return Date.class;
				case 17: return Date.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Boolean.class;
				case 21: return String.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	PagoAuto pagoauto = this.pagoautos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFrame=(PagoAutoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {pagoauto.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {pagoauto.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {pagoauto.setid_empresa((Long) value);pagoauto.setempresa_descripcion(pagoautoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {pagoauto.setid_sucursal((Long) value);pagoauto.setsucursal_descripcion(pagoautoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {pagoauto.setid_ejercicio((Long) value);pagoauto.setejercicio_descripcion(pagoautoBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {pagoauto.setid_cliente((Long) value);pagoauto.setcliente_descripcion(pagoautoBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {pagoauto.setid_asiento_contable((Long) value);pagoauto.setasientocontable_descripcion(pagoautoBeanSwingJInternalFrame.getActualAsientoContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {pagoauto.setid_centro_costo((Long) value);pagoauto.setcentrocosto_descripcion(pagoautoBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {pagoauto.setid_centro_actividad((Long) value);pagoauto.setcentroactividad_descripcion(pagoautoBeanSwingJInternalFrame.getActualCentroActividadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {pagoauto.setid_factura((Long) value);pagoauto.setfactura_descripcion(pagoautoBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {pagoauto.setid_detalle_prove((Long) value);pagoauto.setdetalleprove_descripcion(pagoautoBeanSwingJInternalFrame.getActualDetalleProveForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {pagoauto.setid_cuenta_banco((Long) value);pagoauto.setcuentabanco_descripcion(pagoautoBeanSwingJInternalFrame.getActualCuentaBancoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {pagoauto.setid_transaccion((Long) value);pagoauto.settransaccion_descripcion(pagoautoBeanSwingJInternalFrame.getActualTransaccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {pagoauto.setid_estado_pago_auto((Long) value);pagoauto.setestadopagoauto_descripcion(pagoautoBeanSwingJInternalFrame.getActualEstadoPagoAutoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {pagoauto.setnumero_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {pagoauto.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {pagoauto.setfecha_vencimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {pagoauto.setfecha_corte((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {pagoauto.setvalor_por_pagar((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {pagoauto.setvalor_cancelado((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {pagoauto.setesta_autorizado((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {pagoauto.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public PagoAutoModel(JInternalFrameBase jInternalFrameBase) {
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
		private PagoAutoDetalleFormJInternalFrame pagoautoJInternalFrame=null;
		
		public PagoAutoModel(PagoAutoDetalleFormJInternalFrame pagoautoJInternalFrame) {
			this.pagoautoJInternalFrame=pagoautoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.pagoautoJInternalFrame.getjButtonActualizarToolBarPagoAuto();
			
			if(component!=null && component.equals(this.pagoautoJInternalFrame.getjButtonActualizarToolBarPagoAuto())) {
				componentTab=this.pagoautoJInternalFrame.getjButtonEliminarToolBarPagoAuto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagoautoJInternalFrame.getjButtonEliminarToolBarPagoAuto())) {
				componentTab=this.pagoautoJInternalFrame.getjButtonCancelarToolBarPagoAuto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagoautoJInternalFrame.getjButtonCancelarToolBarPagoAuto())) {
				componentTab=this.pagoautoJInternalFrame.jComboBoxid_empresaPagoAuto;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.pagoautoJInternalFrame.jTextAreadescripcionPagoAuto)) {
				componentTab=this.pagoautoJInternalFrame.jComboBoxTiposAccionesFormularioPagoAuto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxTiposAccionesFormularioPagoAuto)) {
				componentTab=this.pagoautoJInternalFrame.jButtonEliminarPagoAuto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagoautoJInternalFrame.jButtonEliminarPagoAuto)) {
				componentTab=this.pagoautoJInternalFrame.jButtonActualizarPagoAuto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagoautoJInternalFrame.jButtonActualizarPagoAuto)) {
				componentTab=this.pagoautoJInternalFrame.jButtonCancelarPagoAuto;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_empresaPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_sucursalPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_sucursalPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_ejercicioPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_ejercicioPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_clientePagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_clientePagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_asiento_contablePagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_asiento_contablePagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_centro_costoPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_centro_costoPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_centro_actividadPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_centro_actividadPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_facturaPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_facturaPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_detalle_provePagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_detalle_provePagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_cuenta_bancoPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_cuenta_bancoPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_transaccionPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_transaccionPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_estado_pago_autoPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_estado_pago_autoPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jTextFieldnumero_facturaPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jTextFieldnumero_facturaPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jDateChooserfecha_emisionPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jDateChooserfecha_emisionPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jDateChooserfecha_vencimientoPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jDateChooserfecha_vencimientoPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jDateChooserfecha_cortePagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jDateChooserfecha_cortePagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jTextFieldvalor_por_pagarPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jTextFieldvalor_por_pagarPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jTextFieldvalor_canceladoPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jTextFieldvalor_canceladoPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jCheckBoxesta_autorizadoPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jCheckBoxesta_autorizadoPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jTextAreadescripcionPagoAuto;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.pagoautoJInternalFrame.getjButtonActualizarToolBarPagoAuto();
			
			if(component!=null && component.equals(this.pagoautoJInternalFrame.getjButtonEliminarToolBarPagoAuto())) {
				componentTab=this.pagoautoJInternalFrame.getjButtonActualizarToolBarPagoAuto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagoautoJInternalFrame.getjButtonCancelarToolBarPagoAuto())) {
				componentTab=this.pagoautoJInternalFrame.getjButtonEliminarToolBarPagoAuto();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_empresaPagoAuto)) {
				
				componentTab=this.pagoautoJInternalFrame.getjButtonCancelarToolBarPagoAuto();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxTiposAccionesFormularioPagoAuto)) {
				componentTab=this.pagoautoJInternalFrame.jTextAreadescripcionPagoAuto;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pagoautoJInternalFrame.jButtonEliminarPagoAuto)) {
				componentTab=this.pagoautoJInternalFrame.jComboBoxTiposAccionesFormularioPagoAuto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagoautoJInternalFrame.jButtonActualizarPagoAuto)) {
				componentTab=this.pagoautoJInternalFrame.jButtonEliminarPagoAuto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagoautoJInternalFrame.jButtonCancelarPagoAuto)) {
				componentTab=this.pagoautoJInternalFrame.jButtonActualizarPagoAuto;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_sucursalPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_empresaPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_ejercicioPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_sucursalPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_clientePagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_ejercicioPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_asiento_contablePagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_clientePagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_centro_costoPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_asiento_contablePagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_centro_actividadPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_centro_costoPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_facturaPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_centro_actividadPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_detalle_provePagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_facturaPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_cuenta_bancoPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_detalle_provePagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_transaccionPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_cuenta_bancoPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jComboBoxid_estado_pago_autoPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_transaccionPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jTextFieldnumero_facturaPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jComboBoxid_estado_pago_autoPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jDateChooserfecha_emisionPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jTextFieldnumero_facturaPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jDateChooserfecha_vencimientoPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jDateChooserfecha_emisionPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jDateChooserfecha_cortePagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jDateChooserfecha_vencimientoPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jTextFieldvalor_por_pagarPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jDateChooserfecha_cortePagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jTextFieldvalor_canceladoPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jTextFieldvalor_por_pagarPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jCheckBoxesta_autorizadoPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jTextFieldvalor_canceladoPagoAuto;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagoautoJInternalFrame.jTextAreadescripcionPagoAuto)) {
			componentTab=this.pagoautoJInternalFrame.jCheckBoxesta_autorizadoPagoAuto;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.pagoautoJInternalFrame.getjButtonActualizarToolBarPagoAuto();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.pagoautoJInternalFrame.getjButtonActualizarToolBarPagoAuto();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.pagoautoJInternalFrame.getjButtonCancelarToolBarPagoAuto();
			
			
			return componentTab;		
		}
		
		public PagoAutoDetalleFormJInternalFrame getpagoautoJInternalFrame() {
			return this.pagoautoJInternalFrame;
		}
		
		public void setpagoautoJInternalFrame(PagoAutoDetalleFormJInternalFrame pagoautoJInternalFrame) {
			this.pagoautoJInternalFrame=pagoautoJInternalFrame;
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
