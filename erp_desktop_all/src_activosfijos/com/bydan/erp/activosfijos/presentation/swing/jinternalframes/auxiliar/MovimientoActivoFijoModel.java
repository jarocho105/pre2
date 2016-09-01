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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.activosfijos.util.MovimientoActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.MovimientoActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.MovimientoActivoFijoParameterGeneral;

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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.MovimientoActivoFijoBeanSwingJInternalFrame;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.MovimientoActivoFijoJInternalFrame;

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.MovimientoActivoFijoDetalleFormJInternalFrame;

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

public class MovimientoActivoFijoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,MovimientoActivoFijoConstantesFunciones.LABEL_ID
										,MovimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA
										,MovimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL
										,MovimientoActivoFijoConstantesFunciones.LABEL_IDUSUARIO
										,MovimientoActivoFijoConstantesFunciones.LABEL_SECUENCIAL
										,MovimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESAORIGEN
										,MovimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSALORIGEN
										,MovimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJOORIGEN
										,MovimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESADESTINO
										,MovimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSALDESTINO
										,MovimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJODESTINO
										,MovimientoActivoFijoConstantesFunciones.LABEL_FECHA
										,MovimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO
										,MovimientoActivoFijoConstantesFunciones.LABEL_COSTO
										,MovimientoActivoFijoConstantesFunciones.LABEL_DEPRECIACION
										,MovimientoActivoFijoConstantesFunciones.LABEL_COSTOORIGEN
										,MovimientoActivoFijoConstantesFunciones.LABEL_DEPRECIACIONORIGEN
										,MovimientoActivoFijoConstantesFunciones.LABEL_RAZON
										,MovimientoActivoFijoConstantesFunciones.LABEL_DESCRIPCION
										};
	   
	    public List<MovimientoActivoFijo> movimientoactivofijos;
	  	 
	    //NO SE UTILIZA
	    public MovimientoActivoFijoModel(List<MovimientoActivoFijo> movimientoactivofijos,JInternalFrameBase jInternalFrameBase) {
	    	this.movimientoactivofijos=movimientoactivofijos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public MovimientoActivoFijoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.movimientoactivofijos=new ArrayList<MovimientoActivoFijo>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.movimientoactivofijos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.movimientoactivofijos.get(rowIndex).getIsSelected();
	            
				case 1: return this.movimientoactivofijos.get(rowIndex).getId();
				case 2: return this.movimientoactivofijos.get(rowIndex).getid_empresa();
				case 3: return this.movimientoactivofijos.get(rowIndex).getid_sucursal();
				case 4: return this.movimientoactivofijos.get(rowIndex).getid_usuario();
				case 5: return this.movimientoactivofijos.get(rowIndex).getsecuencial();
				case 6: return this.movimientoactivofijos.get(rowIndex).getid_empresa_origen();
				case 7: return this.movimientoactivofijos.get(rowIndex).getid_sucursal_origen();
				case 8: return this.movimientoactivofijos.get(rowIndex).getid_detalle_activo_fijo_origen();
				case 9: return this.movimientoactivofijos.get(rowIndex).getid_empresa_destino();
				case 10: return this.movimientoactivofijos.get(rowIndex).getid_sucursal_destino();
				case 11: return this.movimientoactivofijos.get(rowIndex).getid_detalle_activo_fijo_destino();
				case 12: return this.movimientoactivofijos.get(rowIndex).getfecha();
				case 13: return this.movimientoactivofijos.get(rowIndex).getnumero_documento();
				case 14: return this.movimientoactivofijos.get(rowIndex).getcosto();
				case 15: return this.movimientoactivofijos.get(rowIndex).getdepreciacion();
				case 16: return this.movimientoactivofijos.get(rowIndex).getcosto_origen();
				case 17: return this.movimientoactivofijos.get(rowIndex).getdepreciacion_origen();
				case 18: return this.movimientoactivofijos.get(rowIndex).getrazon();
				case 19: return this.movimientoactivofijos.get(rowIndex).getdescripcion();	            
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
				case 5: return String.class;
				case 6: return Long.class;
				case 7: return Long.class;
				case 8: return Long.class;
				case 9: return Long.class;
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return Date.class;
				case 13: return String.class;
				case 14: return Double.class;
				case 15: return Double.class;
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
	    	MovimientoActivoFijo movimientoactivofijo = this.movimientoactivofijos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			MovimientoActivoFijoBeanSwingJInternalFrame movimientoactivofijoBeanSwingJInternalFrame=(MovimientoActivoFijoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {movimientoactivofijo.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {movimientoactivofijo.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {movimientoactivofijo.setid_empresa((Long) value);movimientoactivofijo.setempresa_descripcion(movimientoactivofijoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {movimientoactivofijo.setid_sucursal((Long) value);movimientoactivofijo.setsucursal_descripcion(movimientoactivofijoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {movimientoactivofijo.setid_usuario((Long) value);movimientoactivofijo.setusuario_descripcion(movimientoactivofijoBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {movimientoactivofijo.setsecuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {movimientoactivofijo.setid_empresa_origen((Long) value);movimientoactivofijo.setempresaorigen_descripcion(movimientoactivofijoBeanSwingJInternalFrame.getActualEmpresaOrigenForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {movimientoactivofijo.setid_sucursal_origen((Long) value);movimientoactivofijo.setsucursalorigen_descripcion(movimientoactivofijoBeanSwingJInternalFrame.getActualSucursalOrigenForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {movimientoactivofijo.setid_detalle_activo_fijo_origen((Long) value);movimientoactivofijo.setdetalleactivofijoorigen_descripcion(movimientoactivofijoBeanSwingJInternalFrame.getActualDetalleActivoFijoOrigenForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {movimientoactivofijo.setid_empresa_destino((Long) value);movimientoactivofijo.setempresadestino_descripcion(movimientoactivofijoBeanSwingJInternalFrame.getActualEmpresaDestinoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {movimientoactivofijo.setid_sucursal_destino((Long) value);movimientoactivofijo.setsucursaldestino_descripcion(movimientoactivofijoBeanSwingJInternalFrame.getActualSucursalDestinoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {movimientoactivofijo.setid_detalle_activo_fijo_destino((Long) value);movimientoactivofijo.setdetalleactivofijodestino_descripcion(movimientoactivofijoBeanSwingJInternalFrame.getActualDetalleActivoFijoDestinoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {movimientoactivofijo.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {movimientoactivofijo.setnumero_documento((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {movimientoactivofijo.setcosto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {movimientoactivofijo.setdepreciacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {movimientoactivofijo.setcosto_origen((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {movimientoactivofijo.setdepreciacion_origen((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {movimientoactivofijo.setrazon((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {movimientoactivofijo.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public MovimientoActivoFijoModel(JInternalFrameBase jInternalFrameBase) {
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
		private MovimientoActivoFijoDetalleFormJInternalFrame movimientoactivofijoJInternalFrame=null;
		
		public MovimientoActivoFijoModel(MovimientoActivoFijoDetalleFormJInternalFrame movimientoactivofijoJInternalFrame) {
			this.movimientoactivofijoJInternalFrame=movimientoactivofijoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.movimientoactivofijoJInternalFrame.getjButtonActualizarToolBarMovimientoActivoFijo();
			
			if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.getjButtonActualizarToolBarMovimientoActivoFijo())) {
				componentTab=this.movimientoactivofijoJInternalFrame.getjButtonEliminarToolBarMovimientoActivoFijo();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.getjButtonEliminarToolBarMovimientoActivoFijo())) {
				componentTab=this.movimientoactivofijoJInternalFrame.getjButtonCancelarToolBarMovimientoActivoFijo();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.getjButtonCancelarToolBarMovimientoActivoFijo())) {
				componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_empresaMovimientoActivoFijo;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextAreadescripcionMovimientoActivoFijo)) {
				componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxTiposAccionesFormularioMovimientoActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxTiposAccionesFormularioMovimientoActivoFijo)) {
				componentTab=this.movimientoactivofijoJInternalFrame.jButtonEliminarMovimientoActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jButtonEliminarMovimientoActivoFijo)) {
				componentTab=this.movimientoactivofijoJInternalFrame.jButtonActualizarMovimientoActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jButtonActualizarMovimientoActivoFijo)) {
				componentTab=this.movimientoactivofijoJInternalFrame.jButtonCancelarMovimientoActivoFijo;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_empresaMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_sucursalMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_sucursalMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_usuarioMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_usuarioMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextFieldsecuencialMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextFieldsecuencialMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_empresa_origenMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_empresa_origenMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_sucursal_origenMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_sucursal_origenMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_empresa_destinoMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_empresa_destinoMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_sucursal_destinoMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_sucursal_destinoMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jDateChooserfechaMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jDateChooserfechaMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextFieldnumero_documentoMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextFieldnumero_documentoMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextFieldcostoMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextFieldcostoMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextFielddepreciacionMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextFielddepreciacionMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextFieldcosto_origenMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextFieldcosto_origenMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextFielddepreciacion_origenMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextFielddepreciacion_origenMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextArearazonMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextArearazonMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextAreadescripcionMovimientoActivoFijo;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.movimientoactivofijoJInternalFrame.getjButtonActualizarToolBarMovimientoActivoFijo();
			
			if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.getjButtonEliminarToolBarMovimientoActivoFijo())) {
				componentTab=this.movimientoactivofijoJInternalFrame.getjButtonActualizarToolBarMovimientoActivoFijo();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.getjButtonCancelarToolBarMovimientoActivoFijo())) {
				componentTab=this.movimientoactivofijoJInternalFrame.getjButtonEliminarToolBarMovimientoActivoFijo();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_empresaMovimientoActivoFijo)) {
				
				componentTab=this.movimientoactivofijoJInternalFrame.getjButtonCancelarToolBarMovimientoActivoFijo();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxTiposAccionesFormularioMovimientoActivoFijo)) {
				componentTab=this.movimientoactivofijoJInternalFrame.jTextAreadescripcionMovimientoActivoFijo;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jButtonEliminarMovimientoActivoFijo)) {
				componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxTiposAccionesFormularioMovimientoActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jButtonActualizarMovimientoActivoFijo)) {
				componentTab=this.movimientoactivofijoJInternalFrame.jButtonEliminarMovimientoActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jButtonCancelarMovimientoActivoFijo)) {
				componentTab=this.movimientoactivofijoJInternalFrame.jButtonActualizarMovimientoActivoFijo;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_sucursalMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_empresaMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_usuarioMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_sucursalMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextFieldsecuencialMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_usuarioMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_empresa_origenMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextFieldsecuencialMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_sucursal_origenMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_empresa_origenMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_sucursal_origenMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_empresa_destinoMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_detalle_activo_fijo_origenMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_sucursal_destinoMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_empresa_destinoMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_sucursal_destinoMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jDateChooserfechaMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jComboBoxid_detalle_activo_fijo_destinoMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextFieldnumero_documentoMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jDateChooserfechaMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextFieldcostoMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextFieldnumero_documentoMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextFielddepreciacionMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextFieldcostoMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextFieldcosto_origenMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextFielddepreciacionMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextFielddepreciacion_origenMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextFieldcosto_origenMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextArearazonMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextFielddepreciacion_origenMovimientoActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.movimientoactivofijoJInternalFrame.jTextAreadescripcionMovimientoActivoFijo)) {
			componentTab=this.movimientoactivofijoJInternalFrame.jTextArearazonMovimientoActivoFijo;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.movimientoactivofijoJInternalFrame.getjButtonActualizarToolBarMovimientoActivoFijo();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.movimientoactivofijoJInternalFrame.getjButtonActualizarToolBarMovimientoActivoFijo();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.movimientoactivofijoJInternalFrame.getjButtonCancelarToolBarMovimientoActivoFijo();
			
			
			return componentTab;		
		}
		
		public MovimientoActivoFijoDetalleFormJInternalFrame getmovimientoactivofijoJInternalFrame() {
			return this.movimientoactivofijoJInternalFrame;
		}
		
		public void setmovimientoactivofijoJInternalFrame(MovimientoActivoFijoDetalleFormJInternalFrame movimientoactivofijoJInternalFrame) {
			this.movimientoactivofijoJInternalFrame=movimientoactivofijoJInternalFrame;
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
