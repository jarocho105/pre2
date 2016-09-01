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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report;




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

//import com.bydan.erp.inventario.util.DemandaProductosConstantesFunciones;
import com.bydan.erp.inventario.util.report.DemandaProductosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.DemandaProductosParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.report.DemandaProductosBeanSwingJInternalFrame;
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
import com.bydan.erp.inventario.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.inventario.util.*;

import com.bydan.erp.inventario.util.report.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.report.DemandaProductosJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.report.DemandaProductosDetalleFormJInternalFrame;

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



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.util.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DemandaProductosModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DemandaProductosConstantesFunciones.LABEL_ID
										,DemandaProductosConstantesFunciones.LABEL_CODIGO
										,DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD
										,DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE
										,DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO
										,DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO
										,DemandaProductosConstantesFunciones.LABEL_NOMBRE
										,DemandaProductosConstantesFunciones.LABEL_DEMTRI
										,DemandaProductosConstantesFunciones.LABEL_DEMBI
										,DemandaProductosConstantesFunciones.LABEL_DEMMEN
										,DemandaProductosConstantesFunciones.LABEL_INGRESOS
										,DemandaProductosConstantesFunciones.LABEL_EGRESOS
										,DemandaProductosConstantesFunciones.LABEL_EXISTENCIA
										,DemandaProductosConstantesFunciones.LABEL_COSTO
										};
	   
	    public List<DemandaProductos> demandaproductoss;
	  	 
	    //NO SE UTILIZA
	    public DemandaProductosModel(List<DemandaProductos> demandaproductoss,JInternalFrameBase jInternalFrameBase) {
	    	this.demandaproductoss=demandaproductoss;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DemandaProductosModel(JInternalFrameBase jInternalFrameBase) {
	    	this.demandaproductoss=new ArrayList<DemandaProductos>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.demandaproductoss.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.demandaproductoss.get(rowIndex).getIsSelected();
	            
				case 1: return this.demandaproductoss.get(rowIndex).getId();
				case 2: return this.demandaproductoss.get(rowIndex).getcodigo();
				case 3: return this.demandaproductoss.get(rowIndex).getnombre_unidad();
				case 4: return this.demandaproductoss.get(rowIndex).getcantidad_disponible();
				case 5: return this.demandaproductoss.get(rowIndex).getstock_minimo();
				case 6: return this.demandaproductoss.get(rowIndex).getcodigo_producto();
				case 7: return this.demandaproductoss.get(rowIndex).getnombre();
				case 8: return this.demandaproductoss.get(rowIndex).getdem_tri();
				case 9: return this.demandaproductoss.get(rowIndex).getdem_bi();
				case 10: return this.demandaproductoss.get(rowIndex).getdem_men();
				case 11: return this.demandaproductoss.get(rowIndex).getingresos();
				case 12: return this.demandaproductoss.get(rowIndex).getegresos();
				case 13: return this.demandaproductoss.get(rowIndex).getexistencia();
				case 14: return this.demandaproductoss.get(rowIndex).getcosto();	            
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
				case 4: return Integer.class;
				case 5: return Integer.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return Double.class;
				case 9: return Double.class;
				case 10: return Double.class;
				case 11: return Double.class;
				case 12: return Double.class;
				case 13: return Double.class;
				case 14: return Double.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DemandaProductos demandaproductos = this.demandaproductoss.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DemandaProductosBeanSwingJInternalFrame demandaproductosBeanSwingJInternalFrame=(DemandaProductosBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {demandaproductos.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {demandaproductos.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {demandaproductos.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {demandaproductos.setnombre_unidad((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {demandaproductos.setcantidad_disponible((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {demandaproductos.setstock_minimo((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {demandaproductos.setcodigo_producto((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {demandaproductos.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {demandaproductos.setdem_tri((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {demandaproductos.setdem_bi((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {demandaproductos.setdem_men((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {demandaproductos.setingresos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {demandaproductos.setegresos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {demandaproductos.setexistencia((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {demandaproductos.setcosto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DemandaProductosModel(JInternalFrameBase jInternalFrameBase) {
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
		private DemandaProductosDetalleFormJInternalFrame demandaproductosJInternalFrame=null;
		
		public DemandaProductosModel(DemandaProductosDetalleFormJInternalFrame demandaproductosJInternalFrame) {
			this.demandaproductosJInternalFrame=demandaproductosJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.demandaproductosJInternalFrame.getjButtonActualizarToolBarDemandaProductos();
			
			if(component!=null && component.equals(this.demandaproductosJInternalFrame.getjButtonActualizarToolBarDemandaProductos())) {
				componentTab=this.demandaproductosJInternalFrame.getjButtonEliminarToolBarDemandaProductos();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.demandaproductosJInternalFrame.getjButtonEliminarToolBarDemandaProductos())) {
				componentTab=this.demandaproductosJInternalFrame.getjButtonCancelarToolBarDemandaProductos();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.demandaproductosJInternalFrame.getjButtonCancelarToolBarDemandaProductos())) {
				componentTab=this.demandaproductosJInternalFrame.jComboBoxid_bodegaDemandaProductos;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldcostoDemandaProductos)) {
				componentTab=this.demandaproductosJInternalFrame.jComboBoxTiposAccionesFormularioDemandaProductos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxTiposAccionesFormularioDemandaProductos)) {
				componentTab=this.demandaproductosJInternalFrame.jButtonEliminarDemandaProductos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.demandaproductosJInternalFrame.jButtonEliminarDemandaProductos)) {
				componentTab=this.demandaproductosJInternalFrame.jButtonActualizarDemandaProductos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.demandaproductosJInternalFrame.jButtonActualizarDemandaProductos)) {
				componentTab=this.demandaproductosJInternalFrame.jButtonCancelarDemandaProductos;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_bodegaDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_productoDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_productoDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_empresaDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_empresaDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_sucursalDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_sucursalDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_lineaDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_lineaDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_linea_grupoDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_linea_grupoDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_linea_categoriaDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_linea_categoriaDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_linea_marcaDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_linea_marcaDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jDateChooserfecha_ultima_venta_hastaDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jDateChooserfecha_ultima_venta_hastaDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextAreacodigoDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextAreacodigoDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldnombre_unidadDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldnombre_unidadDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldcantidad_disponibleDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldcantidad_disponibleDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldstock_minimoDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldstock_minimoDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldcodigo_productoDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldcodigo_productoDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextAreanombreDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextAreanombreDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFielddem_triDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFielddem_triDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFielddem_biDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFielddem_biDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFielddem_menDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFielddem_menDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldingresosDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldingresosDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldegresosDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldegresosDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldexistenciaDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldexistenciaDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldcostoDemandaProductos;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.demandaproductosJInternalFrame.getjButtonActualizarToolBarDemandaProductos();
			
			if(component!=null && component.equals(this.demandaproductosJInternalFrame.getjButtonEliminarToolBarDemandaProductos())) {
				componentTab=this.demandaproductosJInternalFrame.getjButtonActualizarToolBarDemandaProductos();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.demandaproductosJInternalFrame.getjButtonCancelarToolBarDemandaProductos())) {
				componentTab=this.demandaproductosJInternalFrame.getjButtonEliminarToolBarDemandaProductos();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_bodegaDemandaProductos)) {
				
				componentTab=this.demandaproductosJInternalFrame.getjButtonCancelarToolBarDemandaProductos();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxTiposAccionesFormularioDemandaProductos)) {
				componentTab=this.demandaproductosJInternalFrame.jTextFieldcostoDemandaProductos;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.demandaproductosJInternalFrame.jButtonEliminarDemandaProductos)) {
				componentTab=this.demandaproductosJInternalFrame.jComboBoxTiposAccionesFormularioDemandaProductos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.demandaproductosJInternalFrame.jButtonActualizarDemandaProductos)) {
				componentTab=this.demandaproductosJInternalFrame.jButtonEliminarDemandaProductos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.demandaproductosJInternalFrame.jButtonCancelarDemandaProductos)) {
				componentTab=this.demandaproductosJInternalFrame.jButtonActualizarDemandaProductos;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_productoDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_bodegaDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_empresaDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_productoDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_sucursalDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_empresaDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_lineaDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_sucursalDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_linea_grupoDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_lineaDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_linea_categoriaDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_linea_grupoDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jComboBoxid_linea_marcaDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_linea_categoriaDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jDateChooserfecha_ultima_venta_hastaDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jComboBoxid_linea_marcaDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextAreacodigoDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jDateChooserfecha_ultima_venta_hastaDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldnombre_unidadDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextAreacodigoDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldcantidad_disponibleDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldnombre_unidadDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldstock_minimoDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldcantidad_disponibleDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldcodigo_productoDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldstock_minimoDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextAreanombreDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldcodigo_productoDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFielddem_triDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextAreanombreDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFielddem_biDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFielddem_triDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFielddem_menDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFielddem_biDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldingresosDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFielddem_menDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldegresosDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldingresosDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldexistenciaDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldegresosDemandaProductos;
			return componentTab;
		}

		if(component!=null && component.equals(this.demandaproductosJInternalFrame.jTextFieldcostoDemandaProductos)) {
			componentTab=this.demandaproductosJInternalFrame.jTextFieldexistenciaDemandaProductos;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.demandaproductosJInternalFrame.getjButtonActualizarToolBarDemandaProductos();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.demandaproductosJInternalFrame.getjButtonActualizarToolBarDemandaProductos();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.demandaproductosJInternalFrame.getjButtonCancelarToolBarDemandaProductos();
			
			
			return componentTab;		
		}
		
		public DemandaProductosDetalleFormJInternalFrame getdemandaproductosJInternalFrame() {
			return this.demandaproductosJInternalFrame;
		}
		
		public void setdemandaproductosJInternalFrame(DemandaProductosDetalleFormJInternalFrame demandaproductosJInternalFrame) {
			this.demandaproductosJInternalFrame=demandaproductosJInternalFrame;
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
