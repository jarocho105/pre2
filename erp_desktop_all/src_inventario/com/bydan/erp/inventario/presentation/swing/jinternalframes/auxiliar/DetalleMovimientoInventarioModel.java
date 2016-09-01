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

import com.bydan.erp.inventario.util.DetalleMovimientoInventarioConstantesFunciones;
import com.bydan.erp.inventario.util.DetalleMovimientoInventarioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DetalleMovimientoInventarioParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleMovimientoInventarioBeanSwingJInternalFrame;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleMovimientoInventarioJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleMovimientoInventarioDetalleFormJInternalFrame;

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


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetalleMovimientoInventarioModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_ID
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_IDMOVIMIENTOINVENTARIO
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_IDEMPRESA
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_IDEJERCICIO
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_IDPERIODO
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_IDANIO
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_IDMES
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_IDBODEGA
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_IDPRODUCTO
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_IDUNIDAD
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_DESCRIPCION
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_CANTIDAD
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_COSTOUNITARIO
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_COSTOTOTAL
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_DISPONIBLE
										,DetalleMovimientoInventarioConstantesFunciones.LABEL_IDNOVEDADPRODUCTO
										};
	   
	    public List<DetalleMovimientoInventario> detallemovimientoinventarios;
	  	 
	    //NO SE UTILIZA
	    public DetalleMovimientoInventarioModel(List<DetalleMovimientoInventario> detallemovimientoinventarios,JInternalFrameBase jInternalFrameBase) {
	    	this.detallemovimientoinventarios=detallemovimientoinventarios;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleMovimientoInventarioModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detallemovimientoinventarios=new ArrayList<DetalleMovimientoInventario>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detallemovimientoinventarios.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detallemovimientoinventarios.get(rowIndex).getIsSelected();
	            
				case 1: return this.detallemovimientoinventarios.get(rowIndex).getId();
				case 2: return this.detallemovimientoinventarios.get(rowIndex).getid_movimiento_inventario();
				case 3: return this.detallemovimientoinventarios.get(rowIndex).getid_empresa();
				case 4: return this.detallemovimientoinventarios.get(rowIndex).getid_sucursal();
				case 5: return this.detallemovimientoinventarios.get(rowIndex).getid_ejercicio();
				case 6: return this.detallemovimientoinventarios.get(rowIndex).getid_periodo();
				case 7: return this.detallemovimientoinventarios.get(rowIndex).getid_anio();
				case 8: return this.detallemovimientoinventarios.get(rowIndex).getid_mes();
				case 9: return this.detallemovimientoinventarios.get(rowIndex).getid_bodega();
				case 10: return this.detallemovimientoinventarios.get(rowIndex).getid_producto();
				case 11: return this.detallemovimientoinventarios.get(rowIndex).getid_unidad();
				case 12: return this.detallemovimientoinventarios.get(rowIndex).getdescripcion();
				case 13: return this.detallemovimientoinventarios.get(rowIndex).getcantidad();
				case 14: return this.detallemovimientoinventarios.get(rowIndex).getcosto_unitario();
				case 15: return this.detallemovimientoinventarios.get(rowIndex).getcosto_total();
				case 16: return this.detallemovimientoinventarios.get(rowIndex).getdisponible();
				case 17: return this.detallemovimientoinventarios.get(rowIndex).getid_novedad_producto();	            
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
				case 12: return String.class;
				case 13: return Integer.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Integer.class;
				case 17: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetalleMovimientoInventario detallemovimientoinventario = this.detallemovimientoinventarios.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame=(DetalleMovimientoInventarioBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detallemovimientoinventario.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detallemovimientoinventario.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detallemovimientoinventario.setid_movimiento_inventario((Long) value);detallemovimientoinventario.setmovimientoinventario_descripcion(detallemovimientoinventarioBeanSwingJInternalFrame.getActualMovimientoInventarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detallemovimientoinventario.setid_empresa((Long) value);detallemovimientoinventario.setempresa_descripcion(detallemovimientoinventarioBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detallemovimientoinventario.setid_sucursal((Long) value);detallemovimientoinventario.setsucursal_descripcion(detallemovimientoinventarioBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detallemovimientoinventario.setid_ejercicio((Long) value);detallemovimientoinventario.setejercicio_descripcion(detallemovimientoinventarioBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detallemovimientoinventario.setid_periodo((Long) value);detallemovimientoinventario.setperiodo_descripcion(detallemovimientoinventarioBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detallemovimientoinventario.setid_anio((Long) value);detallemovimientoinventario.setanio_descripcion(detallemovimientoinventarioBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detallemovimientoinventario.setid_mes((Long) value);detallemovimientoinventario.setmes_descripcion(detallemovimientoinventarioBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detallemovimientoinventario.setid_bodega((Long) value);detallemovimientoinventario.setbodega_descripcion(detallemovimientoinventarioBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detallemovimientoinventario.setid_producto((Long) value);detallemovimientoinventario.setproducto_descripcion(detallemovimientoinventarioBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detallemovimientoinventario.setid_unidad((Long) value);detallemovimientoinventario.setunidad_descripcion(detallemovimientoinventarioBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detallemovimientoinventario.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detallemovimientoinventario.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detallemovimientoinventario.setcosto_unitario((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detallemovimientoinventario.setcosto_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detallemovimientoinventario.setdisponible((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detallemovimientoinventario.setid_novedad_producto((Long) value);detallemovimientoinventario.setnovedadproducto_descripcion(detallemovimientoinventarioBeanSwingJInternalFrame.getActualNovedadProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleMovimientoInventarioModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetalleMovimientoInventarioDetalleFormJInternalFrame detallemovimientoinventarioJInternalFrame=null;
		
		public DetalleMovimientoInventarioModel(DetalleMovimientoInventarioDetalleFormJInternalFrame detallemovimientoinventarioJInternalFrame) {
			this.detallemovimientoinventarioJInternalFrame=detallemovimientoinventarioJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.detallemovimientoinventarioJInternalFrame.getjButtonActualizarToolBarDetalleMovimientoInventario();
			
			if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.getjButtonActualizarToolBarDetalleMovimientoInventario())) {
				componentTab=this.detallemovimientoinventarioJInternalFrame.getjButtonEliminarToolBarDetalleMovimientoInventario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.getjButtonEliminarToolBarDetalleMovimientoInventario())) {
				componentTab=this.detallemovimientoinventarioJInternalFrame.getjButtonCancelarToolBarDetalleMovimientoInventario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.getjButtonCancelarToolBarDetalleMovimientoInventario())) {
				componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_movimiento_inventarioDetalleMovimientoInventario;
				return componentTab;
			}				
			
			*/
			
			if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldlote_clienteDetalleMovimientoInventario)) {
				componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxTiposAccionesFormularioDetalleMovimientoInventario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxTiposAccionesFormularioDetalleMovimientoInventario)) {
				componentTab=this.detallemovimientoinventarioJInternalFrame.jButtonEliminarDetalleMovimientoInventario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jButtonEliminarDetalleMovimientoInventario)) {
				componentTab=this.detallemovimientoinventarioJInternalFrame.jButtonActualizarDetalleMovimientoInventario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jButtonActualizarDetalleMovimientoInventario)) {
				componentTab=this.detallemovimientoinventarioJInternalFrame.jButtonCancelarDetalleMovimientoInventario;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_movimiento_inventarioDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_empresaDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_empresaDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_sucursalDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_sucursalDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_ejercicioDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_ejercicioDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_periodoDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_periodoDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_anioDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_anioDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_mesDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_mesDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_bodegaDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_bodegaDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_productoDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_productoDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_unidadDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_unidadDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextAreadescripcionDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextAreadescripcionDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldcantidadDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldcantidadDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFielddescuentoDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFielddescuentoDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldcosto_unitarioDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldcosto_unitarioDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldcosto_totalDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldcosto_totalDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFielddisponibleDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFielddisponibleDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldivaDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldivaDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldiva_valorDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldiva_valorDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jCheckBoxcosto_ivaDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jCheckBoxcosto_ivaDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldiceDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldiceDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldice_valorDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldice_valorDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFielddescuento1DetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFielddescuento1DetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFielddescuento2DetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFielddescuento2DetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldserieDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldserieDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldloteDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldloteDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jDateChooserfecha_caducidad_loteDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jDateChooserfecha_caducidad_loteDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_novedad_productoDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_novedad_productoDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_centro_costoDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_centro_costoDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldnumero_comprobanteDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldnumero_comprobanteDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldlote_clienteDetalleMovimientoInventario;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.detallemovimientoinventarioJInternalFrame.getjButtonActualizarToolBarDetalleMovimientoInventario();
			
			if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.getjButtonEliminarToolBarDetalleMovimientoInventario())) {
				componentTab=this.detallemovimientoinventarioJInternalFrame.getjButtonActualizarToolBarDetalleMovimientoInventario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.getjButtonCancelarToolBarDetalleMovimientoInventario())) {
				componentTab=this.detallemovimientoinventarioJInternalFrame.getjButtonEliminarToolBarDetalleMovimientoInventario();
				
				return componentTab;
			}
			*/
			
			if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_movimiento_inventarioDetalleMovimientoInventario)) {
				/*
				componentTab=this.detallemovimientoinventarioJInternalFrame.getjButtonCancelarToolBarDetalleMovimientoInventario();
				*/
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxTiposAccionesFormularioDetalleMovimientoInventario)) {
				componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldlote_clienteDetalleMovimientoInventario;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jButtonEliminarDetalleMovimientoInventario)) {
				componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxTiposAccionesFormularioDetalleMovimientoInventario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jButtonActualizarDetalleMovimientoInventario)) {
				componentTab=this.detallemovimientoinventarioJInternalFrame.jButtonEliminarDetalleMovimientoInventario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jButtonCancelarDetalleMovimientoInventario)) {
				componentTab=this.detallemovimientoinventarioJInternalFrame.jButtonActualizarDetalleMovimientoInventario;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_empresaDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_movimiento_inventarioDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_sucursalDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_empresaDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_ejercicioDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_sucursalDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_periodoDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_ejercicioDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_anioDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_periodoDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_mesDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_anioDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_mesDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_bodegaDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_productoDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_bodegaDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_unidadDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_productoDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextAreadescripcionDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_unidadDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldcantidadDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextAreadescripcionDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFielddescuentoDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldcantidadDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldcosto_unitarioDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFielddescuentoDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldcosto_totalDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldcosto_unitarioDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFielddisponibleDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldcosto_totalDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldivaDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFielddisponibleDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldiva_valorDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldivaDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jCheckBoxcosto_ivaDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldiva_valorDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldiceDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jCheckBoxcosto_ivaDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldice_valorDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldiceDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFielddescuento1DetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldice_valorDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFielddescuento2DetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFielddescuento1DetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldserieDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFielddescuento2DetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldloteDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldserieDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldloteDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jDateChooserfecha_caducidad_loteDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_novedad_productoDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jDateChooserfecha_caducidad_loteDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_centro_costoDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_novedad_productoDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_centro_costoDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldnumero_comprobanteDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallemovimientoinventarioJInternalFrame.jTextFieldlote_clienteDetalleMovimientoInventario)) {
			componentTab=this.detallemovimientoinventarioJInternalFrame.jTextFieldnumero_comprobanteDetalleMovimientoInventario;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			/*
			componentTab=this.detallemovimientoinventarioJInternalFrame.getjButtonActualizarToolBarDetalleMovimientoInventario();
			*/
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			/*
			componentTab=this.detallemovimientoinventarioJInternalFrame.getjButtonActualizarToolBarDetalleMovimientoInventario();
			*/
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			/*
			componentTab=this.detallemovimientoinventarioJInternalFrame.getjButtonCancelarToolBarDetalleMovimientoInventario();
			*/
			
			return componentTab;		
		}
		
		public DetalleMovimientoInventarioDetalleFormJInternalFrame getdetallemovimientoinventarioJInternalFrame() {
			return this.detallemovimientoinventarioJInternalFrame;
		}
		
		public void setdetallemovimientoinventarioJInternalFrame(DetalleMovimientoInventarioDetalleFormJInternalFrame detallemovimientoinventarioJInternalFrame) {
			this.detallemovimientoinventarioJInternalFrame=detallemovimientoinventarioJInternalFrame;
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
