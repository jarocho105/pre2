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

//import com.bydan.erp.inventario.util.MovimientosDetalladosConstantesFunciones;
import com.bydan.erp.inventario.util.report.MovimientosDetalladosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.MovimientosDetalladosParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.report.MovimientosDetalladosBeanSwingJInternalFrame;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.report.MovimientosDetalladosJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.report.MovimientosDetalladosDetalleFormJInternalFrame;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.inventario.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class MovimientosDetalladosModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,MovimientosDetalladosConstantesFunciones.LABEL_ID
										,MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL
										,MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE
										,MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION
										,MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE
										,MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA
										,MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL
										,MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION
										,MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO
										,MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD
										,MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD
										,MovimientosDetalladosConstantesFunciones.LABEL_IVA
										,MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO
										,MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL
										,MovimientosDetalladosConstantesFunciones.LABEL_ICE
										,MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO
										};
	   
	    public List<MovimientosDetallados> movimientosdetalladoss;
	  	 
	    //NO SE UTILIZA
	    public MovimientosDetalladosModel(List<MovimientosDetallados> movimientosdetalladoss,JInternalFrameBase jInternalFrameBase) {
	    	this.movimientosdetalladoss=movimientosdetalladoss;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public MovimientosDetalladosModel(JInternalFrameBase jInternalFrameBase) {
	    	this.movimientosdetalladoss=new ArrayList<MovimientosDetallados>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.movimientosdetalladoss.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.movimientosdetalladoss.get(rowIndex).getIsSelected();
	            
				case 1: return this.movimientosdetalladoss.get(rowIndex).getId();
				case 2: return this.movimientosdetalladoss.get(rowIndex).getnombre_sucursal();
				case 3: return this.movimientosdetalladoss.get(rowIndex).getnombre_completo_cliente();
				case 4: return this.movimientosdetalladoss.get(rowIndex).getnombre_transaccion();
				case 5: return this.movimientosdetalladoss.get(rowIndex).getnumero_comprobante();
				case 6: return this.movimientosdetalladoss.get(rowIndex).getnumero_factura();
				case 7: return this.movimientosdetalladoss.get(rowIndex).getnumero_secuencial();
				case 8: return this.movimientosdetalladoss.get(rowIndex).getfecha_emision();
				case 9: return this.movimientosdetalladoss.get(rowIndex).getnombre_producto();
				case 10: return this.movimientosdetalladoss.get(rowIndex).getnombre_unidad();
				case 11: return this.movimientosdetalladoss.get(rowIndex).getcantidad();
				case 12: return this.movimientosdetalladoss.get(rowIndex).getiva();
				case 13: return this.movimientosdetalladoss.get(rowIndex).getcosto_unitario();
				case 14: return this.movimientosdetalladoss.get(rowIndex).getcosto_total();
				case 15: return this.movimientosdetalladoss.get(rowIndex).getice();
				case 16: return this.movimientosdetalladoss.get(rowIndex).getcodigo_producto();	            
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
				case 8: return Date.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return Integer.class;
				case 12: return Double.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return String.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	MovimientosDetallados movimientosdetallados = this.movimientosdetalladoss.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			MovimientosDetalladosBeanSwingJInternalFrame movimientosdetalladosBeanSwingJInternalFrame=(MovimientosDetalladosBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {movimientosdetallados.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {movimientosdetallados.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {movimientosdetallados.setnombre_sucursal((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {movimientosdetallados.setnombre_completo_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {movimientosdetallados.setnombre_transaccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {movimientosdetallados.setnumero_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {movimientosdetallados.setnumero_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {movimientosdetallados.setnumero_secuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {movimientosdetallados.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {movimientosdetallados.setnombre_producto((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {movimientosdetallados.setnombre_unidad((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {movimientosdetallados.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {movimientosdetallados.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {movimientosdetallados.setcosto_unitario((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {movimientosdetallados.setcosto_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {movimientosdetallados.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {movimientosdetallados.setcodigo_producto((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public MovimientosDetalladosModel(JInternalFrameBase jInternalFrameBase) {
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
		private MovimientosDetalladosDetalleFormJInternalFrame movimientosdetalladosJInternalFrame=null;
		
		public MovimientosDetalladosModel(MovimientosDetalladosDetalleFormJInternalFrame movimientosdetalladosJInternalFrame) {
			this.movimientosdetalladosJInternalFrame=movimientosdetalladosJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.movimientosdetalladosJInternalFrame.getjButtonActualizarToolBarMovimientosDetallados();
			
			if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.getjButtonActualizarToolBarMovimientosDetallados())) {
				componentTab=this.movimientosdetalladosJInternalFrame.getjButtonEliminarToolBarMovimientosDetallados();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.getjButtonEliminarToolBarMovimientosDetallados())) {
				componentTab=this.movimientosdetalladosJInternalFrame.getjButtonCancelarToolBarMovimientosDetallados();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.getjButtonCancelarToolBarMovimientosDetallados())) {
				componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_empresaMovimientosDetallados;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldcodigo_productoMovimientosDetallados)) {
				componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxTiposAccionesFormularioMovimientosDetallados;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxTiposAccionesFormularioMovimientosDetallados)) {
				componentTab=this.movimientosdetalladosJInternalFrame.jButtonEliminarMovimientosDetallados;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jButtonEliminarMovimientosDetallados)) {
				componentTab=this.movimientosdetalladosJInternalFrame.jButtonActualizarMovimientosDetallados;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jButtonActualizarMovimientosDetallados)) {
				componentTab=this.movimientosdetalladosJInternalFrame.jButtonCancelarMovimientosDetallados;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_empresaMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_sucursalMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_sucursalMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_clienteMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_clienteMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_transaccionMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_transaccionMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_lineaMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_lineaMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_linea_grupoMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_linea_grupoMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_linea_categoriaMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_linea_categoriaMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_linea_marcaMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_linea_marcaMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jDateChooserfecha_emision_desdeMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jDateChooserfecha_emision_desdeMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jDateChooserfecha_emision_hastaMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jDateChooserfecha_emision_hastaMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextAreanombre_sucursalMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextAreanombre_sucursalMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextAreanombre_completo_clienteMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextAreanombre_completo_clienteMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextAreanombre_transaccionMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextAreanombre_transaccionMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldnumero_comprobanteMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldnumero_comprobanteMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldnumero_facturaMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldnumero_facturaMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldnumero_secuencialMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldnumero_secuencialMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jDateChooserfecha_emisionMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jDateChooserfecha_emisionMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextAreanombre_productoMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextAreanombre_productoMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldnombre_unidadMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldnombre_unidadMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldcantidadMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldcantidadMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldivaMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldivaMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldcosto_unitarioMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldcosto_unitarioMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldcosto_totalMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldcosto_totalMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldiceMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldiceMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldcodigo_productoMovimientosDetallados;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.movimientosdetalladosJInternalFrame.getjButtonActualizarToolBarMovimientosDetallados();
			
			if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.getjButtonEliminarToolBarMovimientosDetallados())) {
				componentTab=this.movimientosdetalladosJInternalFrame.getjButtonActualizarToolBarMovimientosDetallados();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.getjButtonCancelarToolBarMovimientosDetallados())) {
				componentTab=this.movimientosdetalladosJInternalFrame.getjButtonEliminarToolBarMovimientosDetallados();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_empresaMovimientosDetallados)) {
				
				componentTab=this.movimientosdetalladosJInternalFrame.getjButtonCancelarToolBarMovimientosDetallados();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxTiposAccionesFormularioMovimientosDetallados)) {
				componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldcodigo_productoMovimientosDetallados;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jButtonEliminarMovimientosDetallados)) {
				componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxTiposAccionesFormularioMovimientosDetallados;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jButtonActualizarMovimientosDetallados)) {
				componentTab=this.movimientosdetalladosJInternalFrame.jButtonEliminarMovimientosDetallados;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jButtonCancelarMovimientosDetallados)) {
				componentTab=this.movimientosdetalladosJInternalFrame.jButtonActualizarMovimientosDetallados;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_sucursalMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_empresaMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_clienteMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_sucursalMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_transaccionMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_clienteMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_lineaMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_transaccionMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_linea_grupoMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_lineaMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_linea_categoriaMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_linea_grupoMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jComboBoxid_linea_marcaMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_linea_categoriaMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jDateChooserfecha_emision_desdeMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jComboBoxid_linea_marcaMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jDateChooserfecha_emision_hastaMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jDateChooserfecha_emision_desdeMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextAreanombre_sucursalMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jDateChooserfecha_emision_hastaMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextAreanombre_completo_clienteMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextAreanombre_sucursalMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextAreanombre_transaccionMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextAreanombre_completo_clienteMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldnumero_comprobanteMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextAreanombre_transaccionMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldnumero_facturaMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldnumero_comprobanteMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldnumero_secuencialMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldnumero_facturaMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jDateChooserfecha_emisionMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldnumero_secuencialMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextAreanombre_productoMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jDateChooserfecha_emisionMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldnombre_unidadMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextAreanombre_productoMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldcantidadMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldnombre_unidadMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldivaMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldcantidadMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldcosto_unitarioMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldivaMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldcosto_totalMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldcosto_unitarioMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldiceMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldcosto_totalMovimientosDetallados;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientosdetalladosJInternalFrame.jTextFieldcodigo_productoMovimientosDetallados)) {
			componentTab=this.movimientosdetalladosJInternalFrame.jTextFieldiceMovimientosDetallados;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.movimientosdetalladosJInternalFrame.getjButtonActualizarToolBarMovimientosDetallados();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.movimientosdetalladosJInternalFrame.getjButtonActualizarToolBarMovimientosDetallados();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.movimientosdetalladosJInternalFrame.getjButtonCancelarToolBarMovimientosDetallados();
			
			
			return componentTab;		
		}
		
		public MovimientosDetalladosDetalleFormJInternalFrame getmovimientosdetalladosJInternalFrame() {
			return this.movimientosdetalladosJInternalFrame;
		}
		
		public void setmovimientosdetalladosJInternalFrame(MovimientosDetalladosDetalleFormJInternalFrame movimientosdetalladosJInternalFrame) {
			this.movimientosdetalladosJInternalFrame=movimientosdetalladosJInternalFrame;
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
