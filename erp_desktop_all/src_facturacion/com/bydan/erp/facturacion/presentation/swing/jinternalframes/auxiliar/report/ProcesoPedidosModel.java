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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report;




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

//import com.bydan.erp.facturacion.util.ProcesoPedidosConstantesFunciones;
import com.bydan.erp.facturacion.util.report.ProcesoPedidosParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.ProcesoPedidosParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.report.ProcesoPedidosBeanSwingJInternalFrame;
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
import com.bydan.erp.facturacion.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.facturacion.util.*;

import com.bydan.erp.facturacion.util.report.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.report.ProcesoPedidosJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.report.ProcesoPedidosDetalleFormJInternalFrame;

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
import com.bydan.erp.comisiones.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ProcesoPedidosModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ProcesoPedidosConstantesFunciones.LABEL_ID
										,ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA
										,ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD
										,ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA
										,ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE
										,ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR
										,ProcesoPedidosConstantesFunciones.LABEL_CODIGO
										,ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO
										,ProcesoPedidosConstantesFunciones.LABEL_NUMERO
										,ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION
										,ProcesoPedidosConstantesFunciones.LABEL_TOTAL
										,ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION
										};
	   
	    public List<ProcesoPedidos> procesopedidoss;
	  	 
	    //NO SE UTILIZA
	    public ProcesoPedidosModel(List<ProcesoPedidos> procesopedidoss,JInternalFrameBase jInternalFrameBase) {
	    	this.procesopedidoss=procesopedidoss;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ProcesoPedidosModel(JInternalFrameBase jInternalFrameBase) {
	    	this.procesopedidoss=new ArrayList<ProcesoPedidos>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.procesopedidoss.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.procesopedidoss.get(rowIndex).getIsSelected();
	            
				case 1: return this.procesopedidoss.get(rowIndex).getId();
				case 2: return this.procesopedidoss.get(rowIndex).getnombre_provincia();
				case 3: return this.procesopedidoss.get(rowIndex).getnombre_ciudad();
				case 4: return this.procesopedidoss.get(rowIndex).getnombre_zona();
				case 5: return this.procesopedidoss.get(rowIndex).getnombre_grupo_cliente();
				case 6: return this.procesopedidoss.get(rowIndex).getnombre_vendedor();
				case 7: return this.procesopedidoss.get(rowIndex).getcodigo();
				case 8: return this.procesopedidoss.get(rowIndex).getnombre_completo();
				case 9: return this.procesopedidoss.get(rowIndex).getnumero();
				case 10: return this.procesopedidoss.get(rowIndex).getnumero_autorizacion();
				case 11: return this.procesopedidoss.get(rowIndex).gettotal();
				case 12: return this.procesopedidoss.get(rowIndex).getfecha_emision();	            
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
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return Double.class;
				case 12: return Date.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ProcesoPedidos procesopedidos = this.procesopedidoss.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ProcesoPedidosBeanSwingJInternalFrame procesopedidosBeanSwingJInternalFrame=(ProcesoPedidosBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {procesopedidos.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {procesopedidos.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {procesopedidos.setnombre_provincia((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {procesopedidos.setnombre_ciudad((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {procesopedidos.setnombre_zona((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {procesopedidos.setnombre_grupo_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {procesopedidos.setnombre_vendedor((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {procesopedidos.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {procesopedidos.setnombre_completo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {procesopedidos.setnumero((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {procesopedidos.setnumero_autorizacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {procesopedidos.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {procesopedidos.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ProcesoPedidosModel(JInternalFrameBase jInternalFrameBase) {
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
		private ProcesoPedidosDetalleFormJInternalFrame procesopedidosJInternalFrame=null;
		
		public ProcesoPedidosModel(ProcesoPedidosDetalleFormJInternalFrame procesopedidosJInternalFrame) {
			this.procesopedidosJInternalFrame=procesopedidosJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.procesopedidosJInternalFrame.getjButtonActualizarToolBarProcesoPedidos();
			
			if(component!=null && component.equals(this.procesopedidosJInternalFrame.getjButtonActualizarToolBarProcesoPedidos())) {
				componentTab=this.procesopedidosJInternalFrame.getjButtonEliminarToolBarProcesoPedidos();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.procesopedidosJInternalFrame.getjButtonEliminarToolBarProcesoPedidos())) {
				componentTab=this.procesopedidosJInternalFrame.getjButtonCancelarToolBarProcesoPedidos();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.procesopedidosJInternalFrame.getjButtonCancelarToolBarProcesoPedidos())) {
				componentTab=this.procesopedidosJInternalFrame.jComboBoxid_ciudadProcesoPedidos;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.procesopedidosJInternalFrame.jDateChooserfecha_emisionProcesoPedidos)) {
				componentTab=this.procesopedidosJInternalFrame.jComboBoxTiposAccionesFormularioProcesoPedidos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.procesopedidosJInternalFrame.jComboBoxTiposAccionesFormularioProcesoPedidos)) {
				componentTab=this.procesopedidosJInternalFrame.jButtonEliminarProcesoPedidos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.procesopedidosJInternalFrame.jButtonEliminarProcesoPedidos)) {
				componentTab=this.procesopedidosJInternalFrame.jButtonActualizarProcesoPedidos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.procesopedidosJInternalFrame.jButtonActualizarProcesoPedidos)) {
				componentTab=this.procesopedidosJInternalFrame.jButtonCancelarProcesoPedidos;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jComboBoxid_ciudadProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jComboBoxid_zonaProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jComboBoxid_zonaProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jComboBoxid_grupo_clienteProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jComboBoxid_grupo_clienteProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jComboBoxid_vendedorProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jComboBoxid_vendedorProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextAreanombre_provinciaProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextAreanombre_provinciaProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextAreanombre_ciudadProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextAreanombre_ciudadProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextFieldnombre_zonaProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextFieldnombre_zonaProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextAreanombre_grupo_clienteProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextAreanombre_grupo_clienteProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextAreanombre_vendedorProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextAreanombre_vendedorProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextFieldcodigoProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextFieldcodigoProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextAreanombre_completoProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextAreanombre_completoProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextFieldnumeroProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextFieldnumeroProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextFieldnumero_autorizacionProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextFieldnumero_autorizacionProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextFieldtotalProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextFieldtotalProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jDateChooserfecha_emisionProcesoPedidos;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.procesopedidosJInternalFrame.getjButtonActualizarToolBarProcesoPedidos();
			
			if(component!=null && component.equals(this.procesopedidosJInternalFrame.getjButtonEliminarToolBarProcesoPedidos())) {
				componentTab=this.procesopedidosJInternalFrame.getjButtonActualizarToolBarProcesoPedidos();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.procesopedidosJInternalFrame.getjButtonCancelarToolBarProcesoPedidos())) {
				componentTab=this.procesopedidosJInternalFrame.getjButtonEliminarToolBarProcesoPedidos();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.procesopedidosJInternalFrame.jComboBoxid_ciudadProcesoPedidos)) {
				
				componentTab=this.procesopedidosJInternalFrame.getjButtonCancelarToolBarProcesoPedidos();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.procesopedidosJInternalFrame.jComboBoxTiposAccionesFormularioProcesoPedidos)) {
				componentTab=this.procesopedidosJInternalFrame.jDateChooserfecha_emisionProcesoPedidos;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.procesopedidosJInternalFrame.jButtonEliminarProcesoPedidos)) {
				componentTab=this.procesopedidosJInternalFrame.jComboBoxTiposAccionesFormularioProcesoPedidos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.procesopedidosJInternalFrame.jButtonActualizarProcesoPedidos)) {
				componentTab=this.procesopedidosJInternalFrame.jButtonEliminarProcesoPedidos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.procesopedidosJInternalFrame.jButtonCancelarProcesoPedidos)) {
				componentTab=this.procesopedidosJInternalFrame.jButtonActualizarProcesoPedidos;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jComboBoxid_zonaProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jComboBoxid_ciudadProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jComboBoxid_grupo_clienteProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jComboBoxid_zonaProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jComboBoxid_vendedorProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jComboBoxid_grupo_clienteProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextAreanombre_provinciaProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jComboBoxid_vendedorProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextAreanombre_ciudadProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextAreanombre_provinciaProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextFieldnombre_zonaProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextAreanombre_ciudadProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextAreanombre_grupo_clienteProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextFieldnombre_zonaProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextAreanombre_vendedorProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextAreanombre_grupo_clienteProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextFieldcodigoProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextAreanombre_vendedorProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextAreanombre_completoProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextFieldcodigoProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextFieldnumeroProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextAreanombre_completoProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextFieldnumero_autorizacionProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextFieldnumeroProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jTextFieldtotalProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextFieldnumero_autorizacionProcesoPedidos;
			return componentTab;
		}

		if(component!=null && component.equals(this.procesopedidosJInternalFrame.jDateChooserfecha_emisionProcesoPedidos)) {
			componentTab=this.procesopedidosJInternalFrame.jTextFieldtotalProcesoPedidos;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.procesopedidosJInternalFrame.getjButtonActualizarToolBarProcesoPedidos();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.procesopedidosJInternalFrame.getjButtonActualizarToolBarProcesoPedidos();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.procesopedidosJInternalFrame.getjButtonCancelarToolBarProcesoPedidos();
			
			
			return componentTab;		
		}
		
		public ProcesoPedidosDetalleFormJInternalFrame getprocesopedidosJInternalFrame() {
			return this.procesopedidosJInternalFrame;
		}
		
		public void setprocesopedidosJInternalFrame(ProcesoPedidosDetalleFormJInternalFrame procesopedidosJInternalFrame) {
			this.procesopedidosJInternalFrame=procesopedidosJInternalFrame;
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
