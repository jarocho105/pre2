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
package com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.produccion.util.OrdenProduConstantesFunciones;
import com.bydan.erp.produccion.util.OrdenProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.OrdenProduParameterGeneral;

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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.OrdenProduBeanSwingJInternalFrame;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.produccion.presentation.swing.jinternalframes.OrdenProduJInternalFrame;

import com.bydan.erp.produccion.presentation.swing.jinternalframes.OrdenProduDetalleFormJInternalFrame;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class OrdenProduModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,OrdenProduConstantesFunciones.LABEL_ID
										,OrdenProduConstantesFunciones.LABEL_IDEMPRESA
										,OrdenProduConstantesFunciones.LABEL_IDSUCURSAL
										,OrdenProduConstantesFunciones.LABEL_IDEJERCICIO
										,OrdenProduConstantesFunciones.LABEL_IDPERIODO
										,OrdenProduConstantesFunciones.LABEL_IDFORMATO
										,OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU
										,OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE
										,OrdenProduConstantesFunciones.LABEL_SECUENCIAL
										,OrdenProduConstantesFunciones.LABEL_IDCLIENTE
										,OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE
										,OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE
										,OrdenProduConstantesFunciones.LABEL_RUCCLIENTE
										,OrdenProduConstantesFunciones.LABEL_LOTE
										,OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO
										,OrdenProduConstantesFunciones.LABEL_FECHAENTREGA
										,OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO
										,OrdenProduConstantesFunciones.LABEL_FECHA
										,OrdenProduConstantesFunciones.LABEL_DESCRIPCION
										,OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU
										};
	   
	    public List<OrdenProdu> ordenprodus;
	  	 
	    //NO SE UTILIZA
	    public OrdenProduModel(List<OrdenProdu> ordenprodus,JInternalFrameBase jInternalFrameBase) {
	    	this.ordenprodus=ordenprodus;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public OrdenProduModel(JInternalFrameBase jInternalFrameBase) {
	    	this.ordenprodus=new ArrayList<OrdenProdu>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.ordenprodus.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.ordenprodus.get(rowIndex).getIsSelected();
	            
				case 1: return this.ordenprodus.get(rowIndex).getId();
				case 2: return this.ordenprodus.get(rowIndex).getid_empresa();
				case 3: return this.ordenprodus.get(rowIndex).getid_sucursal();
				case 4: return this.ordenprodus.get(rowIndex).getid_ejercicio();
				case 5: return this.ordenprodus.get(rowIndex).getid_periodo();
				case 6: return this.ordenprodus.get(rowIndex).getid_formato();
				case 7: return this.ordenprodus.get(rowIndex).getid_tipo_prioridad_empresa_produ();
				case 8: return this.ordenprodus.get(rowIndex).getid_empleado_responsable();
				case 9: return this.ordenprodus.get(rowIndex).getsecuencial();
				case 10: return this.ordenprodus.get(rowIndex).getid_cliente();
				case 11: return this.ordenprodus.get(rowIndex).getdireccion_cliente();
				case 12: return this.ordenprodus.get(rowIndex).gettelefono_cliente();
				case 13: return this.ordenprodus.get(rowIndex).getruc_cliente();
				case 14: return this.ordenprodus.get(rowIndex).getlote();
				case 15: return this.ordenprodus.get(rowIndex).getfecha_pedido();
				case 16: return this.ordenprodus.get(rowIndex).getfecha_entrega();
				case 17: return this.ordenprodus.get(rowIndex).getes_uso_interno();
				case 18: return this.ordenprodus.get(rowIndex).getfecha();
				case 19: return this.ordenprodus.get(rowIndex).getdescripcion();
				case 20: return this.ordenprodus.get(rowIndex).getid_estado_orden_produ();	            
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
				case 9: return String.class;
				case 10: return Long.class;
				case 11: return String.class;
				case 12: return String.class;
				case 13: return String.class;
				case 14: return String.class;
				case 15: return Date.class;
				case 16: return Date.class;
				case 17: return Boolean.class;
				case 18: return Date.class;
				case 19: return String.class;
				case 20: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	OrdenProdu ordenprodu = this.ordenprodus.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			OrdenProduBeanSwingJInternalFrame ordenproduBeanSwingJInternalFrame=(OrdenProduBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {ordenprodu.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {ordenprodu.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {ordenprodu.setid_empresa((Long) value);ordenprodu.setempresa_descripcion(ordenproduBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {ordenprodu.setid_sucursal((Long) value);ordenprodu.setsucursal_descripcion(ordenproduBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {ordenprodu.setid_ejercicio((Long) value);ordenprodu.setejercicio_descripcion(ordenproduBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {ordenprodu.setid_periodo((Long) value);ordenprodu.setperiodo_descripcion(ordenproduBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {ordenprodu.setid_formato((Long) value);ordenprodu.setformato_descripcion(ordenproduBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {ordenprodu.setid_tipo_prioridad_empresa_produ((Long) value);ordenprodu.settipoprioridadempresaprodu_descripcion(ordenproduBeanSwingJInternalFrame.getActualTipoPrioridadEmpresaProduForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {ordenprodu.setid_empleado_responsable((Long) value);ordenprodu.setempleadoresponsable_descripcion(ordenproduBeanSwingJInternalFrame.getActualEmpleadoResponsableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {ordenprodu.setsecuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {ordenprodu.setid_cliente((Long) value);ordenprodu.setcliente_descripcion(ordenproduBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {ordenprodu.setdireccion_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {ordenprodu.settelefono_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {ordenprodu.setruc_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {ordenprodu.setlote((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {ordenprodu.setfecha_pedido((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {ordenprodu.setfecha_entrega((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {ordenprodu.setes_uso_interno((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {ordenprodu.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {ordenprodu.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {ordenprodu.setid_estado_orden_produ((Long) value);ordenprodu.setestadoordenprodu_descripcion(ordenproduBeanSwingJInternalFrame.getActualEstadoOrdenProduForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private OrdenProduDetalleFormJInternalFrame ordenproduJInternalFrame=null;
		
		public OrdenProduModel(OrdenProduDetalleFormJInternalFrame ordenproduJInternalFrame) {
			this.ordenproduJInternalFrame=ordenproduJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.ordenproduJInternalFrame.getjButtonActualizarToolBarOrdenProdu();
			
			if(component!=null && component.equals(this.ordenproduJInternalFrame.getjButtonActualizarToolBarOrdenProdu())) {
				componentTab=this.ordenproduJInternalFrame.getjButtonEliminarToolBarOrdenProdu();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordenproduJInternalFrame.getjButtonEliminarToolBarOrdenProdu())) {
				componentTab=this.ordenproduJInternalFrame.getjButtonCancelarToolBarOrdenProdu();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordenproduJInternalFrame.getjButtonCancelarToolBarOrdenProdu())) {
				componentTab=this.ordenproduJInternalFrame.jComboBoxid_empresaOrdenProdu;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_estado_orden_produOrdenProdu)) {
				componentTab=this.ordenproduJInternalFrame.jComboBoxTiposAccionesFormularioOrdenProdu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxTiposAccionesFormularioOrdenProdu)) {
				componentTab=this.ordenproduJInternalFrame.jButtonEliminarOrdenProdu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordenproduJInternalFrame.jButtonEliminarOrdenProdu)) {
				componentTab=this.ordenproduJInternalFrame.jButtonActualizarOrdenProdu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordenproduJInternalFrame.jButtonActualizarOrdenProdu)) {
				componentTab=this.ordenproduJInternalFrame.jButtonCancelarOrdenProdu;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_empresaOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_sucursalOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_sucursalOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_ejercicioOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_ejercicioOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_periodoOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_periodoOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_formatoOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_formatoOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_empleado_responsableOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_empleado_responsableOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jTextFieldsecuencialOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jTextFieldsecuencialOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_clienteOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_clienteOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jTextAreadireccion_clienteOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jTextAreadireccion_clienteOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jTextFieldtelefono_clienteOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jTextFieldtelefono_clienteOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jTextFieldruc_clienteOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jTextFieldruc_clienteOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jTextFieldloteOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jTextFieldloteOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jDateChooserfecha_pedidoOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jDateChooserfecha_pedidoOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jDateChooserfecha_entregaOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jDateChooserfecha_entregaOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jCheckBoxes_uso_internoOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jCheckBoxes_uso_internoOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jDateChooserfechaOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jDateChooserfechaOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jTextAreadescripcionOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jTextAreadescripcionOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_estado_orden_produOrdenProdu;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.ordenproduJInternalFrame.getjButtonActualizarToolBarOrdenProdu();
			
			if(component!=null && component.equals(this.ordenproduJInternalFrame.getjButtonEliminarToolBarOrdenProdu())) {
				componentTab=this.ordenproduJInternalFrame.getjButtonActualizarToolBarOrdenProdu();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordenproduJInternalFrame.getjButtonCancelarToolBarOrdenProdu())) {
				componentTab=this.ordenproduJInternalFrame.getjButtonEliminarToolBarOrdenProdu();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_empresaOrdenProdu)) {
				
				componentTab=this.ordenproduJInternalFrame.getjButtonCancelarToolBarOrdenProdu();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxTiposAccionesFormularioOrdenProdu)) {
				componentTab=this.ordenproduJInternalFrame.jComboBoxid_estado_orden_produOrdenProdu;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.ordenproduJInternalFrame.jButtonEliminarOrdenProdu)) {
				componentTab=this.ordenproduJInternalFrame.jComboBoxTiposAccionesFormularioOrdenProdu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordenproduJInternalFrame.jButtonActualizarOrdenProdu)) {
				componentTab=this.ordenproduJInternalFrame.jButtonEliminarOrdenProdu;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.ordenproduJInternalFrame.jButtonCancelarOrdenProdu)) {
				componentTab=this.ordenproduJInternalFrame.jButtonActualizarOrdenProdu;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_sucursalOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_empresaOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_ejercicioOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_sucursalOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_periodoOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_ejercicioOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_formatoOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_periodoOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_formatoOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_empleado_responsableOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jTextFieldsecuencialOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_empleado_responsableOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_clienteOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jTextFieldsecuencialOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jTextAreadireccion_clienteOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jComboBoxid_clienteOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jTextFieldtelefono_clienteOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jTextAreadireccion_clienteOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jTextFieldruc_clienteOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jTextFieldtelefono_clienteOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jTextFieldloteOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jTextFieldruc_clienteOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jDateChooserfecha_pedidoOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jTextFieldloteOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jDateChooserfecha_entregaOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jDateChooserfecha_pedidoOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jCheckBoxes_uso_internoOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jDateChooserfecha_entregaOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jDateChooserfechaOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jCheckBoxes_uso_internoOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jTextAreadescripcionOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jDateChooserfechaOrdenProdu;
			return componentTab;
		}

		if(component!=null && component.equals(this.ordenproduJInternalFrame.jComboBoxid_estado_orden_produOrdenProdu)) {
			componentTab=this.ordenproduJInternalFrame.jTextAreadescripcionOrdenProdu;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.ordenproduJInternalFrame.getjButtonActualizarToolBarOrdenProdu();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.ordenproduJInternalFrame.getjButtonActualizarToolBarOrdenProdu();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.ordenproduJInternalFrame.getjButtonCancelarToolBarOrdenProdu();
			
			
			return componentTab;		
		}
		
		public OrdenProduDetalleFormJInternalFrame getordenproduJInternalFrame() {
			return this.ordenproduJInternalFrame;
		}
		
		public void setordenproduJInternalFrame(OrdenProduDetalleFormJInternalFrame ordenproduJInternalFrame) {
			this.ordenproduJInternalFrame=ordenproduJInternalFrame;
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
