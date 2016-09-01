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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report;


import java.sql.Time;


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

//import com.bydan.erp.cartera.util.CobrarEstadosCuentasPorFacturaConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarEstadosCuentasPorFacturaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarEstadosCuentasPorFacturaParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.report.CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;






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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.report.CobrarEstadosCuentasPorFacturaJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.report.CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame;

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


import com.bydan.erp.seguridad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class CobrarEstadosCuentasPorFacturaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_ID
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION
										,CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO
										};
	   
	    public List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturas;
	  	 
	    //NO SE UTILIZA
	    public CobrarEstadosCuentasPorFacturaModel(List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturas,JInternalFrameBase jInternalFrameBase) {
	    	this.cobrarestadoscuentasporfacturas=cobrarestadoscuentasporfacturas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public CobrarEstadosCuentasPorFacturaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.cobrarestadoscuentasporfacturas=new ArrayList<CobrarEstadosCuentasPorFactura>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.cobrarestadoscuentasporfacturas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getIsSelected();
	            
				case 1: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getId();
				case 2: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getnombre_cuenta_contable();
				case 3: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getnombre_ciudad();
				case 4: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getnombre_zona();
				case 5: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getnombre_completo();
				case 6: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getruc();
				case 7: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getrepresentante();
				case 8: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getdia_pago();
				case 9: return this.cobrarestadoscuentasporfacturas.get(rowIndex).gethora_pago();
				case 10: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getobservacion();
				case 11: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getnombre_transaccion();
				case 12: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getfecha_vence();
				case 13: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getfecha_emision();
				case 14: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getnumero_comprobante();
				case 15: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getnumero_factura();
				case 16: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getdebito_mone_local();
				case 17: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getcredito_mone_local();
				case 18: return this.cobrarestadoscuentasporfacturas.get(rowIndex).getdireccion_direccion();
				case 19: return this.cobrarestadoscuentasporfacturas.get(rowIndex).gettelefono_telefono();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return String.class;
				case 3: return String.class;
				case 4: return String.class;
				case 5: return String.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return Integer.class;
				case 9: return Time.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return Date.class;
				case 13: return Date.class;
				case 14: return String.class;
				case 15: return String.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return String.class;
				case 19: return String.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura = this.cobrarestadoscuentasporfacturas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame cobrarestadoscuentasporfacturaBeanSwingJInternalFrame=(CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {cobrarestadoscuentasporfactura.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {cobrarestadoscuentasporfactura.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {cobrarestadoscuentasporfactura.setnombre_cuenta_contable((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {cobrarestadoscuentasporfactura.setnombre_ciudad((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {cobrarestadoscuentasporfactura.setnombre_zona((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {cobrarestadoscuentasporfactura.setnombre_completo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {cobrarestadoscuentasporfactura.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {cobrarestadoscuentasporfactura.setrepresentante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {cobrarestadoscuentasporfactura.setdia_pago((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {cobrarestadoscuentasporfactura.sethora_pago((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {cobrarestadoscuentasporfactura.setobservacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {cobrarestadoscuentasporfactura.setnombre_transaccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {cobrarestadoscuentasporfactura.setfecha_vence((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {cobrarestadoscuentasporfactura.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {cobrarestadoscuentasporfactura.setnumero_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {cobrarestadoscuentasporfactura.setnumero_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {cobrarestadoscuentasporfactura.setdebito_mone_local((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {cobrarestadoscuentasporfactura.setcredito_mone_local((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {cobrarestadoscuentasporfactura.setdireccion_direccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {cobrarestadoscuentasporfactura.settelefono_telefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public CobrarEstadosCuentasPorFacturaModel(JInternalFrameBase jInternalFrameBase) {
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
		private CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame cobrarestadoscuentasporfacturaJInternalFrame=null;
		
		public CobrarEstadosCuentasPorFacturaModel(CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame cobrarestadoscuentasporfacturaJInternalFrame) {
			this.cobrarestadoscuentasporfacturaJInternalFrame=cobrarestadoscuentasporfacturaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonActualizarToolBarCobrarEstadosCuentasPorFactura();
			
			if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonActualizarToolBarCobrarEstadosCuentasPorFactura())) {
				componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonEliminarToolBarCobrarEstadosCuentasPorFactura();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonEliminarToolBarCobrarEstadosCuentasPorFactura())) {
				componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonCancelarToolBarCobrarEstadosCuentasPorFactura();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonCancelarToolBarCobrarEstadosCuentasPorFactura())) {
				componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jComboBoxid_empresaCobrarEstadosCuentasPorFactura;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura)) {
				componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura)) {
				componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jButtonEliminarCobrarEstadosCuentasPorFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jButtonEliminarCobrarEstadosCuentasPorFactura)) {
				componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jButtonActualizarCobrarEstadosCuentasPorFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jButtonActualizarCobrarEstadosCuentasPorFactura)) {
				componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jButtonCancelarCobrarEstadosCuentasPorFactura;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jComboBoxid_empresaCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_completoCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_completoCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldrucCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldrucCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextArearepresentanteCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextArearepresentanteCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFielddia_pagoCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFielddia_pagoCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jSpinnerhora_pagoCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jSpinnerhora_pagoCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreaobservacionCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreaobservacionCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_venceCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_venceCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonActualizarToolBarCobrarEstadosCuentasPorFactura();
			
			if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonEliminarToolBarCobrarEstadosCuentasPorFactura())) {
				componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonActualizarToolBarCobrarEstadosCuentasPorFactura();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonCancelarToolBarCobrarEstadosCuentasPorFactura())) {
				componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonEliminarToolBarCobrarEstadosCuentasPorFactura();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jComboBoxid_empresaCobrarEstadosCuentasPorFactura)) {
				
				componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonCancelarToolBarCobrarEstadosCuentasPorFactura();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura)) {
				componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jButtonEliminarCobrarEstadosCuentasPorFactura)) {
				componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jButtonActualizarCobrarEstadosCuentasPorFactura)) {
				componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jButtonEliminarCobrarEstadosCuentasPorFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jButtonCancelarCobrarEstadosCuentasPorFactura)) {
				componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jButtonActualizarCobrarEstadosCuentasPorFactura;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jComboBoxid_empresaCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_completoCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldrucCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_completoCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextArearepresentanteCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldrucCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFielddia_pagoCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextArearepresentanteCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jSpinnerhora_pagoCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFielddia_pagoCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreaobservacionCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jSpinnerhora_pagoCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreaobservacionCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_venceCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_venceCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura)) {
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonActualizarToolBarCobrarEstadosCuentasPorFactura();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonActualizarToolBarCobrarEstadosCuentasPorFactura();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.cobrarestadoscuentasporfacturaJInternalFrame.getjButtonCancelarToolBarCobrarEstadosCuentasPorFactura();
			
			
			return componentTab;		
		}
		
		public CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame getcobrarestadoscuentasporfacturaJInternalFrame() {
			return this.cobrarestadoscuentasporfacturaJInternalFrame;
		}
		
		public void setcobrarestadoscuentasporfacturaJInternalFrame(CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame cobrarestadoscuentasporfacturaJInternalFrame) {
			this.cobrarestadoscuentasporfacturaJInternalFrame=cobrarestadoscuentasporfacturaJInternalFrame;
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
