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

import com.bydan.erp.nomina.util.TurnoConstantesFunciones;
import com.bydan.erp.nomina.util.TurnoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TurnoParameterGeneral;

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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.TurnoBeanSwingJInternalFrame;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.TurnoJInternalFrame;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.TurnoDetalleFormJInternalFrame;

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

public class TurnoModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,TurnoConstantesFunciones.LABEL_ID
										,TurnoConstantesFunciones.LABEL_IDEMPRESA
										,TurnoConstantesFunciones.LABEL_HORAENTRADA
										,TurnoConstantesFunciones.LABEL_HORASALIDA
										,TurnoConstantesFunciones.LABEL_HORAINGRESORECESO
										,TurnoConstantesFunciones.LABEL_HORASALIDARECESO
										,TurnoConstantesFunciones.LABEL_HORADURANTERECESO
										,TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO
										,TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO
										,TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO
										,TurnoConstantesFunciones.LABEL_HORAINGRESO25
										,TurnoConstantesFunciones.LABEL_HORASALIDA25
										,TurnoConstantesFunciones.LABEL_HORAINGRESO50
										,TurnoConstantesFunciones.LABEL_HORASALIDA50
										,TurnoConstantesFunciones.LABEL_HORAINGRESO100
										,TurnoConstantesFunciones.LABEL_HORASALIDA100
										,TurnoConstantesFunciones.LABEL_HORAINGRESO200
										,TurnoConstantesFunciones.LABEL_HORASALIDA200
										};
	   
	    public List<Turno> turnos;
	  	 
	    //NO SE UTILIZA
	    public TurnoModel(List<Turno> turnos,JInternalFrameBase jInternalFrameBase) {
	    	this.turnos=turnos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public TurnoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.turnos=new ArrayList<Turno>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.turnos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.turnos.get(rowIndex).getIsSelected();
	            
				case 1: return this.turnos.get(rowIndex).getId();
				case 2: return this.turnos.get(rowIndex).getid_empresa();
				case 3: return this.turnos.get(rowIndex).gethora_entrada();
				case 4: return this.turnos.get(rowIndex).gethora_salida();
				case 5: return this.turnos.get(rowIndex).gethora_ingreso_receso();
				case 6: return this.turnos.get(rowIndex).gethora_salida_receso();
				case 7: return this.turnos.get(rowIndex).gethora_durante_receso();
				case 8: return this.turnos.get(rowIndex).gethora_ingreso_almuerzo();
				case 9: return this.turnos.get(rowIndex).gethora_salida_almuerzo();
				case 10: return this.turnos.get(rowIndex).gethora_durante_almuerzo();
				case 11: return this.turnos.get(rowIndex).gethora_ingreso25();
				case 12: return this.turnos.get(rowIndex).gethora_salida25();
				case 13: return this.turnos.get(rowIndex).gethora_ingreso50();
				case 14: return this.turnos.get(rowIndex).gethora_salida50();
				case 15: return this.turnos.get(rowIndex).gethora_ingreso100();
				case 16: return this.turnos.get(rowIndex).gethora_salida100();
				case 17: return this.turnos.get(rowIndex).gethora_ingreso200();
				case 18: return this.turnos.get(rowIndex).gethora_salida200();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return Time.class;
				case 4: return Time.class;
				case 5: return Time.class;
				case 6: return Time.class;
				case 7: return Time.class;
				case 8: return Time.class;
				case 9: return Time.class;
				case 10: return Time.class;
				case 11: return Time.class;
				case 12: return Time.class;
				case 13: return Time.class;
				case 14: return Time.class;
				case 15: return Time.class;
				case 16: return Time.class;
				case 17: return Time.class;
				case 18: return Time.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Turno turno = this.turnos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			TurnoBeanSwingJInternalFrame turnoBeanSwingJInternalFrame=(TurnoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {turno.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {turno.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {turno.setid_empresa((Long) value);turno.setempresa_descripcion(turnoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {turno.sethora_entrada((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {turno.sethora_salida((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {turno.sethora_ingreso_receso((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {turno.sethora_salida_receso((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {turno.sethora_durante_receso((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {turno.sethora_ingreso_almuerzo((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {turno.sethora_salida_almuerzo((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {turno.sethora_durante_almuerzo((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {turno.sethora_ingreso25((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {turno.sethora_salida25((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {turno.sethora_ingreso50((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {turno.sethora_salida50((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {turno.sethora_ingreso100((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {turno.sethora_salida100((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {turno.sethora_ingreso200((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {turno.sethora_salida200((Time) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private TurnoDetalleFormJInternalFrame turnoJInternalFrame=null;
		
		public TurnoModel(TurnoDetalleFormJInternalFrame turnoJInternalFrame) {
			this.turnoJInternalFrame=turnoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.turnoJInternalFrame.getjButtonActualizarToolBarTurno();
			
			if(component!=null && component.equals(this.turnoJInternalFrame.getjButtonActualizarToolBarTurno())) {
				componentTab=this.turnoJInternalFrame.getjButtonEliminarToolBarTurno();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.turnoJInternalFrame.getjButtonEliminarToolBarTurno())) {
				componentTab=this.turnoJInternalFrame.getjButtonCancelarToolBarTurno();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.turnoJInternalFrame.getjButtonCancelarToolBarTurno())) {
				componentTab=this.turnoJInternalFrame.jComboBoxid_empresaTurno;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_salida200Turno)) {
				componentTab=this.turnoJInternalFrame.jComboBoxTiposAccionesFormularioTurno;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.turnoJInternalFrame.jComboBoxTiposAccionesFormularioTurno)) {
				componentTab=this.turnoJInternalFrame.jButtonEliminarTurno;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.turnoJInternalFrame.jButtonEliminarTurno)) {
				componentTab=this.turnoJInternalFrame.jButtonActualizarTurno;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.turnoJInternalFrame.jButtonActualizarTurno)) {
				componentTab=this.turnoJInternalFrame.jButtonCancelarTurno;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.turnoJInternalFrame.jComboBoxid_empresaTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_entradaTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_entradaTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_salidaTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_salidaTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_ingreso_recesoTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_ingreso_recesoTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_salida_recesoTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_salida_recesoTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_durante_recesoTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_durante_recesoTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_ingreso_almuerzoTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_ingreso_almuerzoTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_salida_almuerzoTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_salida_almuerzoTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_durante_almuerzoTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_durante_almuerzoTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_ingreso25Turno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_ingreso25Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_salida25Turno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_salida25Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_ingreso50Turno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_ingreso50Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_salida50Turno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_salida50Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_ingreso100Turno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_ingreso100Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_salida100Turno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_salida100Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_ingreso200Turno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_ingreso200Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_salida200Turno;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.turnoJInternalFrame.getjButtonActualizarToolBarTurno();
			
			if(component!=null && component.equals(this.turnoJInternalFrame.getjButtonEliminarToolBarTurno())) {
				componentTab=this.turnoJInternalFrame.getjButtonActualizarToolBarTurno();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.turnoJInternalFrame.getjButtonCancelarToolBarTurno())) {
				componentTab=this.turnoJInternalFrame.getjButtonEliminarToolBarTurno();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.turnoJInternalFrame.jComboBoxid_empresaTurno)) {
				
				componentTab=this.turnoJInternalFrame.getjButtonCancelarToolBarTurno();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.turnoJInternalFrame.jComboBoxTiposAccionesFormularioTurno)) {
				componentTab=this.turnoJInternalFrame.jSpinnerhora_salida200Turno;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.turnoJInternalFrame.jButtonEliminarTurno)) {
				componentTab=this.turnoJInternalFrame.jComboBoxTiposAccionesFormularioTurno;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.turnoJInternalFrame.jButtonActualizarTurno)) {
				componentTab=this.turnoJInternalFrame.jButtonEliminarTurno;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.turnoJInternalFrame.jButtonCancelarTurno)) {
				componentTab=this.turnoJInternalFrame.jButtonActualizarTurno;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_entradaTurno)) {
			componentTab=this.turnoJInternalFrame.jComboBoxid_empresaTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_salidaTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_entradaTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_ingreso_recesoTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_salidaTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_salida_recesoTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_ingreso_recesoTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_durante_recesoTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_salida_recesoTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_ingreso_almuerzoTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_durante_recesoTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_salida_almuerzoTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_ingreso_almuerzoTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_durante_almuerzoTurno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_salida_almuerzoTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_ingreso25Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_durante_almuerzoTurno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_salida25Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_ingreso25Turno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_ingreso50Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_salida25Turno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_salida50Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_ingreso50Turno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_ingreso100Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_salida50Turno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_salida100Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_ingreso100Turno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_ingreso200Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_salida100Turno;
			return componentTab;
		}

		if(component!=null && component.equals(this.turnoJInternalFrame.jSpinnerhora_salida200Turno)) {
			componentTab=this.turnoJInternalFrame.jSpinnerhora_ingreso200Turno;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.turnoJInternalFrame.getjButtonActualizarToolBarTurno();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.turnoJInternalFrame.getjButtonActualizarToolBarTurno();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.turnoJInternalFrame.getjButtonCancelarToolBarTurno();
			
			
			return componentTab;		
		}
		
		public TurnoDetalleFormJInternalFrame getturnoJInternalFrame() {
			return this.turnoJInternalFrame;
		}
		
		public void setturnoJInternalFrame(TurnoDetalleFormJInternalFrame turnoJInternalFrame) {
			this.turnoJInternalFrame=turnoJInternalFrame;
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
