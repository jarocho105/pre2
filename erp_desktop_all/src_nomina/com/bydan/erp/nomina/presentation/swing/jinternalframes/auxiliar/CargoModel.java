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

import com.bydan.erp.nomina.util.CargoConstantesFunciones;
import com.bydan.erp.nomina.util.CargoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.CargoParameterGeneral;

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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.CargoBeanSwingJInternalFrame;
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
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.CargoJInternalFrame;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.CargoDetalleFormJInternalFrame;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class CargoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,CargoConstantesFunciones.LABEL_ID
										,CargoConstantesFunciones.LABEL_IDEMPRESA
										,CargoConstantesFunciones.LABEL_IDCARGO
										,CargoConstantesFunciones.LABEL_IDCUENTACONTABLE
										,CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL
										,CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM
										,CargoConstantesFunciones.LABEL_IDCARGOGRUPO
										,CargoConstantesFunciones.LABEL_CODIGO
										,CargoConstantesFunciones.LABEL_NOMBRE
										,CargoConstantesFunciones.LABEL_VALORANTICIPO
										,CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO
										,CargoConstantesFunciones.LABEL_ESJEFE
										,CargoConstantesFunciones.LABEL_ESANUAL
										,CargoConstantesFunciones.LABEL_PORCENTAJE
										,CargoConstantesFunciones.LABEL_VALOR
										};
	   
	    public List<Cargo> cargos;
	  	 
	    //NO SE UTILIZA
	    public CargoModel(List<Cargo> cargos,JInternalFrameBase jInternalFrameBase) {
	    	this.cargos=cargos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public CargoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.cargos=new ArrayList<Cargo>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.cargos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.cargos.get(rowIndex).getIsSelected();
	            
				case 1: return this.cargos.get(rowIndex).getId();
				case 2: return this.cargos.get(rowIndex).getid_empresa();
				case 3: return this.cargos.get(rowIndex).getid_cargo();
				case 4: return this.cargos.get(rowIndex).getid_cuenta_contable();
				case 5: return this.cargos.get(rowIndex).getid_numero_patronal();
				case 6: return this.cargos.get(rowIndex).getid_tipo_pago__n_m();
				case 7: return this.cargos.get(rowIndex).getid_cargo_grupo();
				case 8: return this.cargos.get(rowIndex).getcodigo();
				case 9: return this.cargos.get(rowIndex).getnombre();
				case 10: return this.cargos.get(rowIndex).getvalor_anticipo();
				case 11: return this.cargos.get(rowIndex).getporcentaje_anticipo();
				case 12: return this.cargos.get(rowIndex).getes_jefe();
				case 13: return this.cargos.get(rowIndex).getes_anual();
				case 14: return this.cargos.get(rowIndex).getporcentaje();
				case 15: return this.cargos.get(rowIndex).getvalor();	            
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
				case 8: return String.class;
				case 9: return String.class;
				case 10: return Double.class;
				case 11: return Double.class;
				case 12: return Boolean.class;
				case 13: return Boolean.class;
				case 14: return Double.class;
				case 15: return Double.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Cargo cargo = this.cargos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame=(CargoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {cargo.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {cargo.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {cargo.setid_empresa((Long) value);cargo.setempresa_descripcion(cargoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {cargo.setid_cargo((Long) value);cargo.setcargo_descripcion(cargoBeanSwingJInternalFrame.getActualCargoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {cargo.setid_cuenta_contable((Long) value);cargo.setcuentacontable_descripcion(cargoBeanSwingJInternalFrame.getActualCuentaContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {cargo.setid_numero_patronal((Long) value);cargo.setnumeropatronal_descripcion(cargoBeanSwingJInternalFrame.getActualNumeroPatronalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {cargo.setid_tipo_pago__n_m((Long) value);cargo.settipopago_nm_descripcion(cargoBeanSwingJInternalFrame.getActualTipoPago_NMForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {cargo.setid_cargo_grupo((Long) value);cargo.setcargogrupo_descripcion(cargoBeanSwingJInternalFrame.getActualCargoGrupoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {cargo.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {cargo.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {cargo.setvalor_anticipo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {cargo.setporcentaje_anticipo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {cargo.setes_jefe((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {cargo.setes_anual((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {cargo.setporcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {cargo.setvalor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public CargoModel(JInternalFrameBase jInternalFrameBase) {
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
		private CargoDetalleFormJInternalFrame cargoJInternalFrame=null;
		
		public CargoModel(CargoDetalleFormJInternalFrame cargoJInternalFrame) {
			this.cargoJInternalFrame=cargoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.cargoJInternalFrame.getjButtonActualizarToolBarCargo();
			
			if(component!=null && component.equals(this.cargoJInternalFrame.getjButtonActualizarToolBarCargo())) {
				componentTab=this.cargoJInternalFrame.getjButtonEliminarToolBarCargo();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cargoJInternalFrame.getjButtonEliminarToolBarCargo())) {
				componentTab=this.cargoJInternalFrame.getjButtonCancelarToolBarCargo();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cargoJInternalFrame.getjButtonCancelarToolBarCargo())) {
				componentTab=this.cargoJInternalFrame.jComboBoxid_empresaCargo;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.cargoJInternalFrame.jTextFieldvalorCargo)) {
				componentTab=this.cargoJInternalFrame.jComboBoxTiposAccionesFormularioCargo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cargoJInternalFrame.jComboBoxTiposAccionesFormularioCargo)) {
				componentTab=this.cargoJInternalFrame.jButtonEliminarCargo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cargoJInternalFrame.jButtonEliminarCargo)) {
				componentTab=this.cargoJInternalFrame.jButtonActualizarCargo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cargoJInternalFrame.jButtonActualizarCargo)) {
				componentTab=this.cargoJInternalFrame.jButtonCancelarCargo;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cargoJInternalFrame.jComboBoxid_empresaCargo)) {
			componentTab=this.cargoJInternalFrame.jComboBoxid_cargoCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jComboBoxid_cargoCargo)) {
			componentTab=this.cargoJInternalFrame.jComboBoxid_cuenta_contableCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jComboBoxid_cuenta_contableCargo)) {
			componentTab=this.cargoJInternalFrame.jComboBoxid_numero_patronalCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jComboBoxid_numero_patronalCargo)) {
			componentTab=this.cargoJInternalFrame.jComboBoxid_tipo_pago__n_mCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jComboBoxid_tipo_pago__n_mCargo)) {
			componentTab=this.cargoJInternalFrame.jComboBoxid_cargo_grupoCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jComboBoxid_cargo_grupoCargo)) {
			componentTab=this.cargoJInternalFrame.jTextFieldcodigoCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jTextFieldcodigoCargo)) {
			componentTab=this.cargoJInternalFrame.jTextAreanombreCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jTextAreanombreCargo)) {
			componentTab=this.cargoJInternalFrame.jTextFieldvalor_anticipoCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jTextFieldvalor_anticipoCargo)) {
			componentTab=this.cargoJInternalFrame.jTextFieldporcentaje_anticipoCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jTextFieldporcentaje_anticipoCargo)) {
			componentTab=this.cargoJInternalFrame.jCheckBoxes_jefeCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jCheckBoxes_jefeCargo)) {
			componentTab=this.cargoJInternalFrame.jCheckBoxes_anualCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jCheckBoxes_anualCargo)) {
			componentTab=this.cargoJInternalFrame.jTextFieldporcentajeCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jTextFieldporcentajeCargo)) {
			componentTab=this.cargoJInternalFrame.jTextFieldvalorCargo;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.cargoJInternalFrame.getjButtonActualizarToolBarCargo();
			
			if(component!=null && component.equals(this.cargoJInternalFrame.getjButtonEliminarToolBarCargo())) {
				componentTab=this.cargoJInternalFrame.getjButtonActualizarToolBarCargo();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cargoJInternalFrame.getjButtonCancelarToolBarCargo())) {
				componentTab=this.cargoJInternalFrame.getjButtonEliminarToolBarCargo();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cargoJInternalFrame.jComboBoxid_empresaCargo)) {
				
				componentTab=this.cargoJInternalFrame.getjButtonCancelarToolBarCargo();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cargoJInternalFrame.jComboBoxTiposAccionesFormularioCargo)) {
				componentTab=this.cargoJInternalFrame.jTextFieldvalorCargo;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cargoJInternalFrame.jButtonEliminarCargo)) {
				componentTab=this.cargoJInternalFrame.jComboBoxTiposAccionesFormularioCargo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cargoJInternalFrame.jButtonActualizarCargo)) {
				componentTab=this.cargoJInternalFrame.jButtonEliminarCargo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cargoJInternalFrame.jButtonCancelarCargo)) {
				componentTab=this.cargoJInternalFrame.jButtonActualizarCargo;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cargoJInternalFrame.jComboBoxid_cargoCargo)) {
			componentTab=this.cargoJInternalFrame.jComboBoxid_empresaCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jComboBoxid_cuenta_contableCargo)) {
			componentTab=this.cargoJInternalFrame.jComboBoxid_cargoCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jComboBoxid_numero_patronalCargo)) {
			componentTab=this.cargoJInternalFrame.jComboBoxid_cuenta_contableCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jComboBoxid_tipo_pago__n_mCargo)) {
			componentTab=this.cargoJInternalFrame.jComboBoxid_numero_patronalCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jComboBoxid_cargo_grupoCargo)) {
			componentTab=this.cargoJInternalFrame.jComboBoxid_tipo_pago__n_mCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jTextFieldcodigoCargo)) {
			componentTab=this.cargoJInternalFrame.jComboBoxid_cargo_grupoCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jTextAreanombreCargo)) {
			componentTab=this.cargoJInternalFrame.jTextFieldcodigoCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jTextFieldvalor_anticipoCargo)) {
			componentTab=this.cargoJInternalFrame.jTextAreanombreCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jTextFieldporcentaje_anticipoCargo)) {
			componentTab=this.cargoJInternalFrame.jTextFieldvalor_anticipoCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jCheckBoxes_jefeCargo)) {
			componentTab=this.cargoJInternalFrame.jTextFieldporcentaje_anticipoCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jCheckBoxes_anualCargo)) {
			componentTab=this.cargoJInternalFrame.jCheckBoxes_jefeCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jTextFieldporcentajeCargo)) {
			componentTab=this.cargoJInternalFrame.jCheckBoxes_anualCargo;
			return componentTab;
		}

		if(component!=null && component.equals(this.cargoJInternalFrame.jTextFieldvalorCargo)) {
			componentTab=this.cargoJInternalFrame.jTextFieldporcentajeCargo;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.cargoJInternalFrame.getjButtonActualizarToolBarCargo();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.cargoJInternalFrame.getjButtonActualizarToolBarCargo();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.cargoJInternalFrame.getjButtonCancelarToolBarCargo();
			
			
			return componentTab;		
		}
		
		public CargoDetalleFormJInternalFrame getcargoJInternalFrame() {
			return this.cargoJInternalFrame;
		}
		
		public void setcargoJInternalFrame(CargoDetalleFormJInternalFrame cargoJInternalFrame) {
			this.cargoJInternalFrame=cargoJInternalFrame;
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
