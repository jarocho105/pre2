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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.facturacion.util.TerminoProformaConstantesFunciones;
import com.bydan.erp.facturacion.util.TerminoProformaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TerminoProformaParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TerminoProformaBeanSwingJInternalFrame;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TerminoProformaJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.TerminoProformaDetalleFormJInternalFrame;

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

public class TerminoProformaModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,TerminoProformaConstantesFunciones.LABEL_ID
										,TerminoProformaConstantesFunciones.LABEL_IDEMPRESA
										,TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL
										,TerminoProformaConstantesFunciones.LABEL_IDMONEDA
										,TerminoProformaConstantesFunciones.LABEL_IDPROFORMA
										,TerminoProformaConstantesFunciones.LABEL_ATENCION
										,TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO
										,TerminoProformaConstantesFunciones.LABEL_REFERENCIA
										,TerminoProformaConstantesFunciones.LABEL_DESCRIPCION
										,TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2
										,TerminoProformaConstantesFunciones.LABEL_MARCA
										,TerminoProformaConstantesFunciones.LABEL_ORIGEN
										,TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA
										,TerminoProformaConstantesFunciones.LABEL_FECHAPAGO
										,TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA
										,TerminoProformaConstantesFunciones.LABEL_ADJUNTO
										,TerminoProformaConstantesFunciones.LABEL_RESPONSABLE
										,TerminoProformaConstantesFunciones.LABEL_CARGO
										};
	   
	    public List<TerminoProforma> terminoproformas;
	  	 
	    //NO SE UTILIZA
	    public TerminoProformaModel(List<TerminoProforma> terminoproformas,JInternalFrameBase jInternalFrameBase) {
	    	this.terminoproformas=terminoproformas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public TerminoProformaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.terminoproformas=new ArrayList<TerminoProforma>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.terminoproformas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.terminoproformas.get(rowIndex).getIsSelected();
	            
				case 1: return this.terminoproformas.get(rowIndex).getId();
				case 2: return this.terminoproformas.get(rowIndex).getid_empresa();
				case 3: return this.terminoproformas.get(rowIndex).getid_sucursal();
				case 4: return this.terminoproformas.get(rowIndex).getid_moneda();
				case 5: return this.terminoproformas.get(rowIndex).getid_proforma();
				case 6: return this.terminoproformas.get(rowIndex).getatencion();
				case 7: return this.terminoproformas.get(rowIndex).getregistro_sanitario();
				case 8: return this.terminoproformas.get(rowIndex).getreferencia();
				case 9: return this.terminoproformas.get(rowIndex).getdescripcion();
				case 10: return this.terminoproformas.get(rowIndex).getdescripcion2();
				case 11: return this.terminoproformas.get(rowIndex).getmarca();
				case 12: return this.terminoproformas.get(rowIndex).getorigen();
				case 13: return this.terminoproformas.get(rowIndex).getgarantia_tecnica();
				case 14: return this.terminoproformas.get(rowIndex).getfecha_pago();
				case 15: return this.terminoproformas.get(rowIndex).getfecha_entrega();
				case 16: return this.terminoproformas.get(rowIndex).getadjunto();
				case 17: return this.terminoproformas.get(rowIndex).getresponsable();
				case 18: return this.terminoproformas.get(rowIndex).getcargo();	            
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
				case 6: return String.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return String.class;
				case 13: return String.class;
				case 14: return String.class;
				case 15: return String.class;
				case 16: return String.class;
				case 17: return String.class;
				case 18: return String.class;	            
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
	    	TerminoProforma terminoproforma = this.terminoproformas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			TerminoProformaBeanSwingJInternalFrame terminoproformaBeanSwingJInternalFrame=(TerminoProformaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {terminoproforma.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {terminoproforma.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {terminoproforma.setid_empresa((Long) value);terminoproforma.setempresa_descripcion(terminoproformaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {terminoproforma.setid_sucursal((Long) value);terminoproforma.setsucursal_descripcion(terminoproformaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {terminoproforma.setid_moneda((Long) value);terminoproforma.setmoneda_descripcion(terminoproformaBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {terminoproforma.setid_proforma((Long) value);terminoproforma.setproforma_descripcion(terminoproformaBeanSwingJInternalFrame.getActualProformaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {terminoproforma.setatencion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {terminoproforma.setregistro_sanitario((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {terminoproforma.setreferencia((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {terminoproforma.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {terminoproforma.setdescripcion2((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {terminoproforma.setmarca((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {terminoproforma.setorigen((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {terminoproforma.setgarantia_tecnica((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {terminoproforma.setfecha_pago((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {terminoproforma.setfecha_entrega((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {terminoproforma.setadjunto((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {terminoproforma.setresponsable((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {terminoproforma.setcargo((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private TerminoProformaDetalleFormJInternalFrame terminoproformaJInternalFrame=null;
		
		public TerminoProformaModel(TerminoProformaDetalleFormJInternalFrame terminoproformaJInternalFrame) {
			this.terminoproformaJInternalFrame=terminoproformaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.terminoproformaJInternalFrame.getjButtonActualizarToolBarTerminoProforma();
			
			if(component!=null && component.equals(this.terminoproformaJInternalFrame.getjButtonActualizarToolBarTerminoProforma())) {
				componentTab=this.terminoproformaJInternalFrame.getjButtonEliminarToolBarTerminoProforma();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.terminoproformaJInternalFrame.getjButtonEliminarToolBarTerminoProforma())) {
				componentTab=this.terminoproformaJInternalFrame.getjButtonCancelarToolBarTerminoProforma();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.terminoproformaJInternalFrame.getjButtonCancelarToolBarTerminoProforma())) {
				componentTab=this.terminoproformaJInternalFrame.jComboBoxid_empresaTerminoProforma;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextFieldcargoTerminoProforma)) {
				componentTab=this.terminoproformaJInternalFrame.jComboBoxTiposAccionesFormularioTerminoProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.terminoproformaJInternalFrame.jComboBoxTiposAccionesFormularioTerminoProforma)) {
				componentTab=this.terminoproformaJInternalFrame.jButtonEliminarTerminoProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.terminoproformaJInternalFrame.jButtonEliminarTerminoProforma)) {
				componentTab=this.terminoproformaJInternalFrame.jButtonActualizarTerminoProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.terminoproformaJInternalFrame.jButtonActualizarTerminoProforma)) {
				componentTab=this.terminoproformaJInternalFrame.jButtonCancelarTerminoProforma;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jComboBoxid_empresaTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jComboBoxid_sucursalTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jComboBoxid_sucursalTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jComboBoxid_monedaTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jComboBoxid_monedaTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jComboBoxid_proformaTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jComboBoxid_proformaTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextAreaatencionTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextAreaatencionTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextFieldregistro_sanitarioTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextFieldregistro_sanitarioTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextAreareferenciaTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextAreareferenciaTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextAreadescripcionTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextAreadescripcionTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextAreadescripcion2TerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextAreadescripcion2TerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextFieldmarcaTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextFieldmarcaTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextFieldorigenTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextFieldorigenTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextFieldgarantia_tecnicaTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextFieldgarantia_tecnicaTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextFieldfecha_pagoTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextFieldfecha_pagoTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextFieldfecha_entregaTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextFieldfecha_entregaTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextAreaadjuntoTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextAreaadjuntoTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextArearesponsableTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextArearesponsableTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextFieldcargoTerminoProforma;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.terminoproformaJInternalFrame.getjButtonActualizarToolBarTerminoProforma();
			
			if(component!=null && component.equals(this.terminoproformaJInternalFrame.getjButtonEliminarToolBarTerminoProforma())) {
				componentTab=this.terminoproformaJInternalFrame.getjButtonActualizarToolBarTerminoProforma();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.terminoproformaJInternalFrame.getjButtonCancelarToolBarTerminoProforma())) {
				componentTab=this.terminoproformaJInternalFrame.getjButtonEliminarToolBarTerminoProforma();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.terminoproformaJInternalFrame.jComboBoxid_empresaTerminoProforma)) {
				
				componentTab=this.terminoproformaJInternalFrame.getjButtonCancelarToolBarTerminoProforma();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.terminoproformaJInternalFrame.jComboBoxTiposAccionesFormularioTerminoProforma)) {
				componentTab=this.terminoproformaJInternalFrame.jTextFieldcargoTerminoProforma;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.terminoproformaJInternalFrame.jButtonEliminarTerminoProforma)) {
				componentTab=this.terminoproformaJInternalFrame.jComboBoxTiposAccionesFormularioTerminoProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.terminoproformaJInternalFrame.jButtonActualizarTerminoProforma)) {
				componentTab=this.terminoproformaJInternalFrame.jButtonEliminarTerminoProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.terminoproformaJInternalFrame.jButtonCancelarTerminoProforma)) {
				componentTab=this.terminoproformaJInternalFrame.jButtonActualizarTerminoProforma;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jComboBoxid_sucursalTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jComboBoxid_empresaTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jComboBoxid_monedaTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jComboBoxid_sucursalTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jComboBoxid_proformaTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jComboBoxid_monedaTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextAreaatencionTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jComboBoxid_proformaTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextFieldregistro_sanitarioTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextAreaatencionTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextAreareferenciaTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextFieldregistro_sanitarioTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextAreadescripcionTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextAreareferenciaTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextAreadescripcion2TerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextAreadescripcionTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextFieldmarcaTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextAreadescripcion2TerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextFieldorigenTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextFieldmarcaTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextFieldgarantia_tecnicaTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextFieldorigenTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextFieldfecha_pagoTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextFieldgarantia_tecnicaTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextFieldfecha_entregaTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextFieldfecha_pagoTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextAreaadjuntoTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextFieldfecha_entregaTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextArearesponsableTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextAreaadjuntoTerminoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.terminoproformaJInternalFrame.jTextFieldcargoTerminoProforma)) {
			componentTab=this.terminoproformaJInternalFrame.jTextArearesponsableTerminoProforma;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.terminoproformaJInternalFrame.getjButtonActualizarToolBarTerminoProforma();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.terminoproformaJInternalFrame.getjButtonActualizarToolBarTerminoProforma();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.terminoproformaJInternalFrame.getjButtonCancelarToolBarTerminoProforma();
			
			
			return componentTab;		
		}
		
		public TerminoProformaDetalleFormJInternalFrame getterminoproformaJInternalFrame() {
			return this.terminoproformaJInternalFrame;
		}
		
		public void setterminoproformaJInternalFrame(TerminoProformaDetalleFormJInternalFrame terminoproformaJInternalFrame) {
			this.terminoproformaJInternalFrame=terminoproformaJInternalFrame;
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
