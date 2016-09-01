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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report;




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

//import com.bydan.erp.activosfijos.util.DepreciacionesConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.DepreciacionesParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.DepreciacionesParameterGeneral;

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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report.DepreciacionesBeanSwingJInternalFrame;
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
import com.bydan.erp.activosfijos.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.activosfijos.util.*;

import com.bydan.erp.activosfijos.util.report.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.report.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report.DepreciacionesJInternalFrame;

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report.DepreciacionesDetalleFormJInternalFrame;

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

public class DepreciacionesModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DepreciacionesConstantesFunciones.LABEL_ID
										,DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO
										,DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO
										,DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO
										,DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO
										,DepreciacionesConstantesFunciones.LABEL_CLAVE
										,DepreciacionesConstantesFunciones.LABEL_NOMBRE
										,DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA
										,DepreciacionesConstantesFunciones.LABEL_VIDAUTIL
										,DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA
										,DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO
										,DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION
										,DepreciacionesConstantesFunciones.LABEL_IDANIO
										,DepreciacionesConstantesFunciones.LABEL_IDMES
										,DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO
										,DepreciacionesConstantesFunciones.LABEL_VALORGASTO
										};
	   
	    public List<Depreciaciones> depreciacioness;
	  	 
	    //NO SE UTILIZA
	    public DepreciacionesModel(List<Depreciaciones> depreciacioness,JInternalFrameBase jInternalFrameBase) {
	    	this.depreciacioness=depreciacioness;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DepreciacionesModel(JInternalFrameBase jInternalFrameBase) {
	    	this.depreciacioness=new ArrayList<Depreciaciones>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.depreciacioness.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.depreciacioness.get(rowIndex).getIsSelected();
	            
				case 1: return this.depreciacioness.get(rowIndex).getId();
				case 2: return this.depreciacioness.get(rowIndex).getcodigo_sub_grupo();
				case 3: return this.depreciacioness.get(rowIndex).getnombre_sub_grupo();
				case 4: return this.depreciacioness.get(rowIndex).getcodigo_detalle_grupo();
				case 5: return this.depreciacioness.get(rowIndex).getnombre_detalle_grupo();
				case 6: return this.depreciacioness.get(rowIndex).getclave();
				case 7: return this.depreciacioness.get(rowIndex).getnombre();
				case 8: return this.depreciacioness.get(rowIndex).getfecha_compra();
				case 9: return this.depreciacioness.get(rowIndex).getvida_util();
				case 10: return this.depreciacioness.get(rowIndex).getcosto_de_compra();
				case 11: return this.depreciacioness.get(rowIndex).getfecha_mantenimiento();
				case 12: return this.depreciacioness.get(rowIndex).getfecha_depreciacion();
				case 13: return this.depreciacioness.get(rowIndex).getid_anio();
				case 14: return this.depreciacioness.get(rowIndex).getid_mes();
				case 15: return this.depreciacioness.get(rowIndex).getvalor_acumulado();
				case 16: return this.depreciacioness.get(rowIndex).getvalor_gasto();	            
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
				case 9: return Double.class;
				case 10: return Double.class;
				case 11: return Date.class;
				case 12: return Date.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Double.class;
				case 16: return Double.class;	            
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
	    	Depreciaciones depreciaciones = this.depreciacioness.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DepreciacionesBeanSwingJInternalFrame depreciacionesBeanSwingJInternalFrame=(DepreciacionesBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {depreciaciones.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {depreciaciones.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {depreciaciones.setcodigo_sub_grupo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {depreciaciones.setnombre_sub_grupo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {depreciaciones.setcodigo_detalle_grupo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {depreciaciones.setnombre_detalle_grupo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {depreciaciones.setclave((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {depreciaciones.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {depreciaciones.setfecha_compra((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {depreciaciones.setvida_util((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {depreciaciones.setcosto_de_compra((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {depreciaciones.setfecha_mantenimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {depreciaciones.setfecha_depreciacion((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {depreciaciones.setid_anio((Long) value);depreciaciones.setanio_descripcion(depreciacionesBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {depreciaciones.setid_mes((Long) value);depreciaciones.setmes_descripcion(depreciacionesBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {depreciaciones.setvalor_acumulado((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {depreciaciones.setvalor_gasto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DepreciacionesModel(JInternalFrameBase jInternalFrameBase) {
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
		private DepreciacionesDetalleFormJInternalFrame depreciacionesJInternalFrame=null;
		
		public DepreciacionesModel(DepreciacionesDetalleFormJInternalFrame depreciacionesJInternalFrame) {
			this.depreciacionesJInternalFrame=depreciacionesJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.depreciacionesJInternalFrame.getjButtonActualizarToolBarDepreciaciones();
			
			if(component!=null && component.equals(this.depreciacionesJInternalFrame.getjButtonActualizarToolBarDepreciaciones())) {
				componentTab=this.depreciacionesJInternalFrame.getjButtonEliminarToolBarDepreciaciones();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.depreciacionesJInternalFrame.getjButtonEliminarToolBarDepreciaciones())) {
				componentTab=this.depreciacionesJInternalFrame.getjButtonCancelarToolBarDepreciaciones();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.depreciacionesJInternalFrame.getjButtonCancelarToolBarDepreciaciones())) {
				componentTab=this.depreciacionesJInternalFrame.jComboBoxid_empresaDepreciaciones;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextFieldvalor_gastoDepreciaciones)) {
				componentTab=this.depreciacionesJInternalFrame.jComboBoxTiposAccionesFormularioDepreciaciones;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxTiposAccionesFormularioDepreciaciones)) {
				componentTab=this.depreciacionesJInternalFrame.jButtonEliminarDepreciaciones;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.depreciacionesJInternalFrame.jButtonEliminarDepreciaciones)) {
				componentTab=this.depreciacionesJInternalFrame.jButtonActualizarDepreciaciones;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.depreciacionesJInternalFrame.jButtonActualizarDepreciaciones)) {
				componentTab=this.depreciacionesJInternalFrame.jButtonCancelarDepreciaciones;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxid_empresaDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jComboBoxid_anio_inicioDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxid_anio_inicioDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jComboBoxid_anio_finDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxid_anio_finDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jComboBoxid_mes_inicioDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxid_mes_inicioDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jComboBoxid_mes_finDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxid_mes_finDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextFieldcodigo_sub_grupoDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextFieldcodigo_sub_grupoDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextAreanombre_sub_grupoDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextAreanombre_sub_grupoDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextFieldcodigo_detalle_grupoDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextFieldcodigo_detalle_grupoDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextAreanombre_detalle_grupoDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextAreanombre_detalle_grupoDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextFieldclaveDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextFieldclaveDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextAreanombreDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextAreanombreDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jDateChooserfecha_compraDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jDateChooserfecha_compraDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextFieldvida_utilDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextFieldvida_utilDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextFieldcosto_de_compraDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextFieldcosto_de_compraDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jDateChooserfecha_mantenimientoDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jDateChooserfecha_mantenimientoDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jDateChooserfecha_depreciacionDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jDateChooserfecha_depreciacionDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jComboBoxid_anioDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxid_anioDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jComboBoxid_mesDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxid_mesDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextFieldvalor_acumuladoDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextFieldvalor_acumuladoDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextFieldvalor_gastoDepreciaciones;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.depreciacionesJInternalFrame.getjButtonActualizarToolBarDepreciaciones();
			
			if(component!=null && component.equals(this.depreciacionesJInternalFrame.getjButtonEliminarToolBarDepreciaciones())) {
				componentTab=this.depreciacionesJInternalFrame.getjButtonActualizarToolBarDepreciaciones();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.depreciacionesJInternalFrame.getjButtonCancelarToolBarDepreciaciones())) {
				componentTab=this.depreciacionesJInternalFrame.getjButtonEliminarToolBarDepreciaciones();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxid_empresaDepreciaciones)) {
				
				componentTab=this.depreciacionesJInternalFrame.getjButtonCancelarToolBarDepreciaciones();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxTiposAccionesFormularioDepreciaciones)) {
				componentTab=this.depreciacionesJInternalFrame.jTextFieldvalor_gastoDepreciaciones;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.depreciacionesJInternalFrame.jButtonEliminarDepreciaciones)) {
				componentTab=this.depreciacionesJInternalFrame.jComboBoxTiposAccionesFormularioDepreciaciones;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.depreciacionesJInternalFrame.jButtonActualizarDepreciaciones)) {
				componentTab=this.depreciacionesJInternalFrame.jButtonEliminarDepreciaciones;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.depreciacionesJInternalFrame.jButtonCancelarDepreciaciones)) {
				componentTab=this.depreciacionesJInternalFrame.jButtonActualizarDepreciaciones;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxid_anio_inicioDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jComboBoxid_empresaDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxid_anio_finDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jComboBoxid_anio_inicioDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxid_mes_inicioDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jComboBoxid_anio_finDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxid_mes_finDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jComboBoxid_mes_inicioDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextFieldcodigo_sub_grupoDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jComboBoxid_mes_finDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextAreanombre_sub_grupoDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextFieldcodigo_sub_grupoDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextFieldcodigo_detalle_grupoDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextAreanombre_sub_grupoDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextAreanombre_detalle_grupoDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextFieldcodigo_detalle_grupoDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextFieldclaveDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextAreanombre_detalle_grupoDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextAreanombreDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextFieldclaveDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jDateChooserfecha_compraDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextAreanombreDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextFieldvida_utilDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jDateChooserfecha_compraDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextFieldcosto_de_compraDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextFieldvida_utilDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jDateChooserfecha_mantenimientoDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextFieldcosto_de_compraDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jDateChooserfecha_depreciacionDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jDateChooserfecha_mantenimientoDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxid_anioDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jDateChooserfecha_depreciacionDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jComboBoxid_mesDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jComboBoxid_anioDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextFieldvalor_acumuladoDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jComboBoxid_mesDepreciaciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.depreciacionesJInternalFrame.jTextFieldvalor_gastoDepreciaciones)) {
			componentTab=this.depreciacionesJInternalFrame.jTextFieldvalor_acumuladoDepreciaciones;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.depreciacionesJInternalFrame.getjButtonActualizarToolBarDepreciaciones();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.depreciacionesJInternalFrame.getjButtonActualizarToolBarDepreciaciones();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.depreciacionesJInternalFrame.getjButtonCancelarToolBarDepreciaciones();
			
			
			return componentTab;		
		}
		
		public DepreciacionesDetalleFormJInternalFrame getdepreciacionesJInternalFrame() {
			return this.depreciacionesJInternalFrame;
		}
		
		public void setdepreciacionesJInternalFrame(DepreciacionesDetalleFormJInternalFrame depreciacionesJInternalFrame) {
			this.depreciacionesJInternalFrame=depreciacionesJInternalFrame;
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
