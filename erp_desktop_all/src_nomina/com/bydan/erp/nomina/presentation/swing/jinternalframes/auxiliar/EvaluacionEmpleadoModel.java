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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.nomina.util.EvaluacionEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.EvaluacionEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EvaluacionEmpleadoParameterGeneral;

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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.EvaluacionEmpleadoBeanSwingJInternalFrame;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.EvaluacionEmpleadoJInternalFrame;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.EvaluacionEmpleadoDetalleFormJInternalFrame;

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

public class EvaluacionEmpleadoModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,EvaluacionEmpleadoConstantesFunciones.LABEL_ID
										,EvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA
										,EvaluacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL
										,EvaluacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO
										,EvaluacionEmpleadoConstantesFunciones.LABEL_IDPERIODO
										,EvaluacionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA
										,EvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO
										,EvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADOEVALUA
										,EvaluacionEmpleadoConstantesFunciones.LABEL_IDTIPOEVALUACIONEMPLEADO
										,EvaluacionEmpleadoConstantesFunciones.LABEL_FECHA
										,EvaluacionEmpleadoConstantesFunciones.LABEL_ESTAEVALUADO
										,EvaluacionEmpleadoConstantesFunciones.LABEL_IDANIO
										,EvaluacionEmpleadoConstantesFunciones.LABEL_IDSEMESTRE
										,EvaluacionEmpleadoConstantesFunciones.LABEL_IDTRIMESTRE
										,EvaluacionEmpleadoConstantesFunciones.LABEL_IDBIMESTRE
										,EvaluacionEmpleadoConstantesFunciones.LABEL_IDMES
										,EvaluacionEmpleadoConstantesFunciones.LABEL_OBSERVACION1
										,EvaluacionEmpleadoConstantesFunciones.LABEL_OBSERVACION2
										,EvaluacionEmpleadoConstantesFunciones.LABEL_OBSERVACION3
										,EvaluacionEmpleadoConstantesFunciones.LABEL_OBSERVACION4
										};
	   
	    public List<EvaluacionEmpleado> evaluacionempleados;
	  	 
	    //NO SE UTILIZA
	    public EvaluacionEmpleadoModel(List<EvaluacionEmpleado> evaluacionempleados,JInternalFrameBase jInternalFrameBase) {
	    	this.evaluacionempleados=evaluacionempleados;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public EvaluacionEmpleadoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.evaluacionempleados=new ArrayList<EvaluacionEmpleado>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.evaluacionempleados.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.evaluacionempleados.get(rowIndex).getIsSelected();
	            
				case 1: return this.evaluacionempleados.get(rowIndex).getId();
				case 2: return this.evaluacionempleados.get(rowIndex).getid_empresa();
				case 3: return this.evaluacionempleados.get(rowIndex).getid_sucursal();
				case 4: return this.evaluacionempleados.get(rowIndex).getid_ejercicio();
				case 5: return this.evaluacionempleados.get(rowIndex).getid_periodo();
				case 6: return this.evaluacionempleados.get(rowIndex).getid_estructura();
				case 7: return this.evaluacionempleados.get(rowIndex).getid_empleado();
				case 8: return this.evaluacionempleados.get(rowIndex).getid_empleado_evalua();
				case 9: return this.evaluacionempleados.get(rowIndex).getid_tipo_evaluacion_empleado();
				case 10: return this.evaluacionempleados.get(rowIndex).getfecha();
				case 11: return this.evaluacionempleados.get(rowIndex).getesta_evaluado();
				case 12: return this.evaluacionempleados.get(rowIndex).getid_anio();
				case 13: return this.evaluacionempleados.get(rowIndex).getid_semestre();
				case 14: return this.evaluacionempleados.get(rowIndex).getid_trimestre();
				case 15: return this.evaluacionempleados.get(rowIndex).getid_bimestre();
				case 16: return this.evaluacionempleados.get(rowIndex).getid_mes();
				case 17: return this.evaluacionempleados.get(rowIndex).getobservacion1();
				case 18: return this.evaluacionempleados.get(rowIndex).getobservacion2();
				case 19: return this.evaluacionempleados.get(rowIndex).getobservacion3();
				case 20: return this.evaluacionempleados.get(rowIndex).getobservacion4();	            
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
				case 10: return Date.class;
				case 11: return Boolean.class;
				case 12: return Long.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return String.class;
				case 18: return String.class;
				case 19: return String.class;
				case 20: return String.class;	            
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
	    	EvaluacionEmpleado evaluacionempleado = this.evaluacionempleados.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			EvaluacionEmpleadoBeanSwingJInternalFrame evaluacionempleadoBeanSwingJInternalFrame=(EvaluacionEmpleadoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {evaluacionempleado.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {evaluacionempleado.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {evaluacionempleado.setid_empresa((Long) value);evaluacionempleado.setempresa_descripcion(evaluacionempleadoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {evaluacionempleado.setid_sucursal((Long) value);evaluacionempleado.setsucursal_descripcion(evaluacionempleadoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {evaluacionempleado.setid_ejercicio((Long) value);evaluacionempleado.setejercicio_descripcion(evaluacionempleadoBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {evaluacionempleado.setid_periodo((Long) value);evaluacionempleado.setperiodo_descripcion(evaluacionempleadoBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {evaluacionempleado.setid_estructura((Long) value);evaluacionempleado.setestructura_descripcion(evaluacionempleadoBeanSwingJInternalFrame.getActualEstructuraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {evaluacionempleado.setid_empleado((Long) value);evaluacionempleado.setempleado_descripcion(evaluacionempleadoBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {evaluacionempleado.setid_empleado_evalua((Long) value);evaluacionempleado.setempleadoevalua_descripcion(evaluacionempleadoBeanSwingJInternalFrame.getActualEmpleadoEvaluaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {evaluacionempleado.setid_tipo_evaluacion_empleado((Long) value);evaluacionempleado.settipoevaluacionempleado_descripcion(evaluacionempleadoBeanSwingJInternalFrame.getActualTipoEvaluacionEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {evaluacionempleado.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {evaluacionempleado.setesta_evaluado((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {evaluacionempleado.setid_anio((Long) value);evaluacionempleado.setanio_descripcion(evaluacionempleadoBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {evaluacionempleado.setid_semestre((Long) value);evaluacionempleado.setsemestre_descripcion(evaluacionempleadoBeanSwingJInternalFrame.getActualSemestreForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {evaluacionempleado.setid_trimestre((Long) value);evaluacionempleado.settrimestre_descripcion(evaluacionempleadoBeanSwingJInternalFrame.getActualTrimestreForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {evaluacionempleado.setid_bimestre((Long) value);evaluacionempleado.setbimestre_descripcion(evaluacionempleadoBeanSwingJInternalFrame.getActualBimestreForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {evaluacionempleado.setid_mes((Long) value);evaluacionempleado.setmes_descripcion(evaluacionempleadoBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {evaluacionempleado.setobservacion1((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {evaluacionempleado.setobservacion2((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {evaluacionempleado.setobservacion3((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {evaluacionempleado.setobservacion4((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private EvaluacionEmpleadoDetalleFormJInternalFrame evaluacionempleadoJInternalFrame=null;
		
		public EvaluacionEmpleadoModel(EvaluacionEmpleadoDetalleFormJInternalFrame evaluacionempleadoJInternalFrame) {
			this.evaluacionempleadoJInternalFrame=evaluacionempleadoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.evaluacionempleadoJInternalFrame.getjButtonActualizarToolBarEvaluacionEmpleado();
			
			if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.getjButtonActualizarToolBarEvaluacionEmpleado())) {
				componentTab=this.evaluacionempleadoJInternalFrame.getjButtonEliminarToolBarEvaluacionEmpleado();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.getjButtonEliminarToolBarEvaluacionEmpleado())) {
				componentTab=this.evaluacionempleadoJInternalFrame.getjButtonCancelarToolBarEvaluacionEmpleado();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.getjButtonCancelarToolBarEvaluacionEmpleado())) {
				componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_empresaEvaluacionEmpleado;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jTextAreaobservacion4EvaluacionEmpleado)) {
				componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxTiposAccionesFormularioEvaluacionEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxTiposAccionesFormularioEvaluacionEmpleado)) {
				componentTab=this.evaluacionempleadoJInternalFrame.jButtonEliminarEvaluacionEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jButtonEliminarEvaluacionEmpleado)) {
				componentTab=this.evaluacionempleadoJInternalFrame.jButtonActualizarEvaluacionEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jButtonActualizarEvaluacionEmpleado)) {
				componentTab=this.evaluacionempleadoJInternalFrame.jButtonCancelarEvaluacionEmpleado;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_empresaEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_sucursalEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_sucursalEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_ejercicioEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_ejercicioEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_periodoEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_periodoEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_estructuraEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_estructuraEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_empleadoEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_empleadoEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_empleado_evaluaEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_empleado_evaluaEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jDateChooserfechaEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jDateChooserfechaEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jCheckBoxesta_evaluadoEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jCheckBoxesta_evaluadoEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_anioEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_anioEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_semestreEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_semestreEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_trimestreEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_trimestreEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_bimestreEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_bimestreEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_mesEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_mesEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jTextAreaobservacion1EvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jTextAreaobservacion1EvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jTextAreaobservacion2EvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jTextAreaobservacion2EvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jTextAreaobservacion3EvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jTextAreaobservacion3EvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jTextAreaobservacion4EvaluacionEmpleado;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.evaluacionempleadoJInternalFrame.getjButtonActualizarToolBarEvaluacionEmpleado();
			
			if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.getjButtonEliminarToolBarEvaluacionEmpleado())) {
				componentTab=this.evaluacionempleadoJInternalFrame.getjButtonActualizarToolBarEvaluacionEmpleado();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.getjButtonCancelarToolBarEvaluacionEmpleado())) {
				componentTab=this.evaluacionempleadoJInternalFrame.getjButtonEliminarToolBarEvaluacionEmpleado();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_empresaEvaluacionEmpleado)) {
				
				componentTab=this.evaluacionempleadoJInternalFrame.getjButtonCancelarToolBarEvaluacionEmpleado();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxTiposAccionesFormularioEvaluacionEmpleado)) {
				componentTab=this.evaluacionempleadoJInternalFrame.jTextAreaobservacion4EvaluacionEmpleado;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jButtonEliminarEvaluacionEmpleado)) {
				componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxTiposAccionesFormularioEvaluacionEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jButtonActualizarEvaluacionEmpleado)) {
				componentTab=this.evaluacionempleadoJInternalFrame.jButtonEliminarEvaluacionEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jButtonCancelarEvaluacionEmpleado)) {
				componentTab=this.evaluacionempleadoJInternalFrame.jButtonActualizarEvaluacionEmpleado;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_sucursalEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_empresaEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_ejercicioEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_sucursalEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_periodoEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_ejercicioEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_estructuraEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_periodoEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_empleadoEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_estructuraEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_empleado_evaluaEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_empleadoEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_empleado_evaluaEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jDateChooserfechaEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jCheckBoxesta_evaluadoEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jDateChooserfechaEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_anioEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jCheckBoxesta_evaluadoEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_semestreEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_anioEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_trimestreEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_semestreEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_bimestreEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_trimestreEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jComboBoxid_mesEvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_bimestreEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jTextAreaobservacion1EvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jComboBoxid_mesEvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jTextAreaobservacion2EvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jTextAreaobservacion1EvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jTextAreaobservacion3EvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jTextAreaobservacion2EvaluacionEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.evaluacionempleadoJInternalFrame.jTextAreaobservacion4EvaluacionEmpleado)) {
			componentTab=this.evaluacionempleadoJInternalFrame.jTextAreaobservacion3EvaluacionEmpleado;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.evaluacionempleadoJInternalFrame.getjButtonActualizarToolBarEvaluacionEmpleado();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.evaluacionempleadoJInternalFrame.getjButtonActualizarToolBarEvaluacionEmpleado();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.evaluacionempleadoJInternalFrame.getjButtonCancelarToolBarEvaluacionEmpleado();
			
			
			return componentTab;		
		}
		
		public EvaluacionEmpleadoDetalleFormJInternalFrame getevaluacionempleadoJInternalFrame() {
			return this.evaluacionempleadoJInternalFrame;
		}
		
		public void setevaluacionempleadoJInternalFrame(EvaluacionEmpleadoDetalleFormJInternalFrame evaluacionempleadoJInternalFrame) {
			this.evaluacionempleadoJInternalFrame=evaluacionempleadoJInternalFrame;
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
