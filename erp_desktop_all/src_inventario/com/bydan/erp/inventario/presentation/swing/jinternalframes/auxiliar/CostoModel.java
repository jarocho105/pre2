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

import com.bydan.erp.inventario.util.CostoConstantesFunciones;
import com.bydan.erp.inventario.util.CostoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.CostoParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.CostoBeanSwingJInternalFrame;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.CostoJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.CostoDetalleFormJInternalFrame;

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

public class CostoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,CostoConstantesFunciones.LABEL_ID
										,CostoConstantesFunciones.LABEL_IDEMPRESA
										,CostoConstantesFunciones.LABEL_IDSUCURSAL
										,CostoConstantesFunciones.LABEL_IDBODEGA
										,CostoConstantesFunciones.LABEL_IDPRODUCTO
										,CostoConstantesFunciones.LABEL_IDPERIODO
										,CostoConstantesFunciones.LABEL_IDEJERCICIO
										,CostoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO
										,CostoConstantesFunciones.LABEL_IDTIPOCOSTO
										,CostoConstantesFunciones.LABEL_NUMEROCOMPROBANTE
										,CostoConstantesFunciones.LABEL_FECHA
										,CostoConstantesFunciones.LABEL_CANTIDAD
										,CostoConstantesFunciones.LABEL_VALORUNITARIO
										,CostoConstantesFunciones.LABEL_VALORTOTAL
										,CostoConstantesFunciones.LABEL_IDANIO
										,CostoConstantesFunciones.LABEL_IDMES
										};
	   
	    public List<Costo> costos;
	  	 
	    //NO SE UTILIZA
	    public CostoModel(List<Costo> costos,JInternalFrameBase jInternalFrameBase) {
	    	this.costos=costos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public CostoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.costos=new ArrayList<Costo>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.costos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.costos.get(rowIndex).getIsSelected();
	            
				case 1: return this.costos.get(rowIndex).getId();
				case 2: return this.costos.get(rowIndex).getid_empresa();
				case 3: return this.costos.get(rowIndex).getid_sucursal();
				case 4: return this.costos.get(rowIndex).getid_bodega();
				case 5: return this.costos.get(rowIndex).getid_producto();
				case 6: return this.costos.get(rowIndex).getid_periodo();
				case 7: return this.costos.get(rowIndex).getid_ejercicio();
				case 8: return this.costos.get(rowIndex).getid_detalle_movimiento_inventario();
				case 9: return this.costos.get(rowIndex).getid_tipo_costo();
				case 10: return this.costos.get(rowIndex).getnumero_comprobante();
				case 11: return this.costos.get(rowIndex).getfecha();
				case 12: return this.costos.get(rowIndex).getcantidad();
				case 13: return this.costos.get(rowIndex).getvalor_unitario();
				case 14: return this.costos.get(rowIndex).getvalor_total();
				case 15: return this.costos.get(rowIndex).getid_anio();
				case 16: return this.costos.get(rowIndex).getid_mes();	            
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
				case 12: return Integer.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Long.class;
				case 16: return Long.class;	            
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
	    	Costo costo = this.costos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			CostoBeanSwingJInternalFrame costoBeanSwingJInternalFrame=(CostoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {costo.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {costo.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {costo.setid_empresa((Long) value);costo.setempresa_descripcion(costoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {costo.setid_sucursal((Long) value);costo.setsucursal_descripcion(costoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {costo.setid_bodega((Long) value);costo.setbodega_descripcion(costoBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {costo.setid_producto((Long) value);costo.setproducto_descripcion(costoBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {costo.setid_periodo((Long) value);costo.setperiodo_descripcion(costoBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {costo.setid_ejercicio((Long) value);costo.setejercicio_descripcion(costoBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {costo.setid_detalle_movimiento_inventario((Long) value);costo.setdetallemovimientoinventario_descripcion(costoBeanSwingJInternalFrame.getActualDetalleMovimientoInventarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {costo.setid_tipo_costo((Long) value);costo.settipocosto_descripcion(costoBeanSwingJInternalFrame.getActualTipoCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {costo.setnumero_comprobante((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {costo.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {costo.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {costo.setvalor_unitario((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {costo.setvalor_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {costo.setid_anio((Long) value);costo.setanio_descripcion(costoBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {costo.setid_mes((Long) value);costo.setmes_descripcion(costoBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public CostoModel(JInternalFrameBase jInternalFrameBase) {
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
		private CostoDetalleFormJInternalFrame costoJInternalFrame=null;
		
		public CostoModel(CostoDetalleFormJInternalFrame costoJInternalFrame) {
			this.costoJInternalFrame=costoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.costoJInternalFrame.getjButtonActualizarToolBarCosto();
			
			if(component!=null && component.equals(this.costoJInternalFrame.getjButtonActualizarToolBarCosto())) {
				componentTab=this.costoJInternalFrame.getjButtonEliminarToolBarCosto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.costoJInternalFrame.getjButtonEliminarToolBarCosto())) {
				componentTab=this.costoJInternalFrame.getjButtonCancelarToolBarCosto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.costoJInternalFrame.getjButtonCancelarToolBarCosto())) {
				componentTab=this.costoJInternalFrame.jComboBoxid_empresaCosto;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_mesCosto)) {
				componentTab=this.costoJInternalFrame.jComboBoxTiposAccionesFormularioCosto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxTiposAccionesFormularioCosto)) {
				componentTab=this.costoJInternalFrame.jButtonEliminarCosto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.costoJInternalFrame.jButtonEliminarCosto)) {
				componentTab=this.costoJInternalFrame.jButtonActualizarCosto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.costoJInternalFrame.jButtonActualizarCosto)) {
				componentTab=this.costoJInternalFrame.jButtonCancelarCosto;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_empresaCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_sucursalCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_sucursalCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_bodegaCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_bodegaCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_productoCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_productoCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_periodoCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_periodoCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_ejercicioCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_ejercicioCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_detalle_movimiento_inventarioCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_detalle_movimiento_inventarioCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_tipo_costoCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_tipo_costoCosto)) {
			componentTab=this.costoJInternalFrame.jTextFieldnumero_comprobanteCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jTextFieldnumero_comprobanteCosto)) {
			componentTab=this.costoJInternalFrame.jDateChooserfechaCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jDateChooserfechaCosto)) {
			componentTab=this.costoJInternalFrame.jTextFieldcantidadCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jTextFieldcantidadCosto)) {
			componentTab=this.costoJInternalFrame.jTextFieldvalor_unitarioCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jTextFieldvalor_unitarioCosto)) {
			componentTab=this.costoJInternalFrame.jTextFieldvalor_totalCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jTextFieldvalor_totalCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_anioCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_anioCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_mesCosto;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.costoJInternalFrame.getjButtonActualizarToolBarCosto();
			
			if(component!=null && component.equals(this.costoJInternalFrame.getjButtonEliminarToolBarCosto())) {
				componentTab=this.costoJInternalFrame.getjButtonActualizarToolBarCosto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.costoJInternalFrame.getjButtonCancelarToolBarCosto())) {
				componentTab=this.costoJInternalFrame.getjButtonEliminarToolBarCosto();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_empresaCosto)) {
				
				componentTab=this.costoJInternalFrame.getjButtonCancelarToolBarCosto();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxTiposAccionesFormularioCosto)) {
				componentTab=this.costoJInternalFrame.jComboBoxid_mesCosto;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.costoJInternalFrame.jButtonEliminarCosto)) {
				componentTab=this.costoJInternalFrame.jComboBoxTiposAccionesFormularioCosto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.costoJInternalFrame.jButtonActualizarCosto)) {
				componentTab=this.costoJInternalFrame.jButtonEliminarCosto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.costoJInternalFrame.jButtonCancelarCosto)) {
				componentTab=this.costoJInternalFrame.jButtonActualizarCosto;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_sucursalCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_empresaCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_bodegaCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_sucursalCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_productoCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_bodegaCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_periodoCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_productoCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_ejercicioCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_periodoCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_detalle_movimiento_inventarioCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_ejercicioCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_tipo_costoCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_detalle_movimiento_inventarioCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jTextFieldnumero_comprobanteCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_tipo_costoCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jDateChooserfechaCosto)) {
			componentTab=this.costoJInternalFrame.jTextFieldnumero_comprobanteCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jTextFieldcantidadCosto)) {
			componentTab=this.costoJInternalFrame.jDateChooserfechaCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jTextFieldvalor_unitarioCosto)) {
			componentTab=this.costoJInternalFrame.jTextFieldcantidadCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jTextFieldvalor_totalCosto)) {
			componentTab=this.costoJInternalFrame.jTextFieldvalor_unitarioCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_anioCosto)) {
			componentTab=this.costoJInternalFrame.jTextFieldvalor_totalCosto;
			return componentTab;
		}

		if(component!=null && component.equals(this.costoJInternalFrame.jComboBoxid_mesCosto)) {
			componentTab=this.costoJInternalFrame.jComboBoxid_anioCosto;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.costoJInternalFrame.getjButtonActualizarToolBarCosto();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.costoJInternalFrame.getjButtonActualizarToolBarCosto();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.costoJInternalFrame.getjButtonCancelarToolBarCosto();
			
			
			return componentTab;		
		}
		
		public CostoDetalleFormJInternalFrame getcostoJInternalFrame() {
			return this.costoJInternalFrame;
		}
		
		public void setcostoJInternalFrame(CostoDetalleFormJInternalFrame costoJInternalFrame) {
			this.costoJInternalFrame=costoJInternalFrame;
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
