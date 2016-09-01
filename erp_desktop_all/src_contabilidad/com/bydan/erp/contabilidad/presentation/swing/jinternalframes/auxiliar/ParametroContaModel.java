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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.contabilidad.util.ParametroContaConstantesFunciones;
import com.bydan.erp.contabilidad.util.ParametroContaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.ParametroContaParameterGeneral;

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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.ParametroContaBeanSwingJInternalFrame;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.ParametroContaJInternalFrame;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.ParametroContaDetalleFormJInternalFrame;

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

public class ParametroContaModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ParametroContaConstantesFunciones.LABEL_ID
										,ParametroContaConstantesFunciones.LABEL_IDEMPRESA
										,ParametroContaConstantesFunciones.LABEL_IDMONEDA
										,ParametroContaConstantesFunciones.LABEL_IDMONEDAEXTRANJERA
										,ParametroContaConstantesFunciones.LABEL_CONMASCARA
										,ParametroContaConstantesFunciones.LABEL_NUMERONIVEL
										,ParametroContaConstantesFunciones.LABEL_ESPRESUPUESTO
										,ParametroContaConstantesFunciones.LABEL_ESLOTE
										,ParametroContaConstantesFunciones.LABEL_CONSECUENCIALAUTOMATICO
										,ParametroContaConstantesFunciones.LABEL_CONCUENTASNIFF
										,ParametroContaConstantesFunciones.LABEL_CONCENTROCOSTOMASCARA
										,ParametroContaConstantesFunciones.LABEL_CONCENTROCOSTONUEVAESTRUCTURA
										,ParametroContaConstantesFunciones.LABEL_CENTROCOSTONUMERONIVEL
										,ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEACTIVO
										,ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEPASIVO
										,ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEPATRIMONIO
										,ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESO
										,ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEEGRESO
										,ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLERESUMEN
										,ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEDEUDOR
										,ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEACREEDOR
										,ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESO1
										,ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESO2
										,ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESO3
										,ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEEGRESO1
										,ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEEGRESO2
										,ParametroContaConstantesFunciones.LABEL_IDCUENTACONTABLEEGRESO3
										};
	   
	    public List<ParametroConta> parametrocontas;
	  	 
	    //NO SE UTILIZA
	    public ParametroContaModel(List<ParametroConta> parametrocontas,JInternalFrameBase jInternalFrameBase) {
	    	this.parametrocontas=parametrocontas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ParametroContaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.parametrocontas=new ArrayList<ParametroConta>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.parametrocontas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.parametrocontas.get(rowIndex).getIsSelected();
	            
				case 1: return this.parametrocontas.get(rowIndex).getId();
				case 2: return this.parametrocontas.get(rowIndex).getid_empresa();
				case 3: return this.parametrocontas.get(rowIndex).getid_moneda();
				case 4: return this.parametrocontas.get(rowIndex).getid_moneda_extranjera();
				case 5: return this.parametrocontas.get(rowIndex).getcon_mascara();
				case 6: return this.parametrocontas.get(rowIndex).getnumero_nivel();
				case 7: return this.parametrocontas.get(rowIndex).getes_presupuesto();
				case 8: return this.parametrocontas.get(rowIndex).getes_lote();
				case 9: return this.parametrocontas.get(rowIndex).getcon_secuencial_automatico();
				case 10: return this.parametrocontas.get(rowIndex).getcon_cuentas_niff();
				case 11: return this.parametrocontas.get(rowIndex).getcon_centro_costo_mascara();
				case 12: return this.parametrocontas.get(rowIndex).getcon_centro_costo_nueva_estructura();
				case 13: return this.parametrocontas.get(rowIndex).getcentro_costo_numero_nivel();
				case 14: return this.parametrocontas.get(rowIndex).getid_cuenta_contable_activo();
				case 15: return this.parametrocontas.get(rowIndex).getid_cuenta_contable_pasivo();
				case 16: return this.parametrocontas.get(rowIndex).getid_cuenta_contable_patrimonio();
				case 17: return this.parametrocontas.get(rowIndex).getid_cuenta_contable_ingreso();
				case 18: return this.parametrocontas.get(rowIndex).getid_cuenta_contable_egreso();
				case 19: return this.parametrocontas.get(rowIndex).getid_cuenta_contable_resumen();
				case 20: return this.parametrocontas.get(rowIndex).getid_cuenta_contable_deudor();
				case 21: return this.parametrocontas.get(rowIndex).getid_cuenta_contable_acreedor();
				case 22: return this.parametrocontas.get(rowIndex).getid_cuenta_contable_ingreso1();
				case 23: return this.parametrocontas.get(rowIndex).getid_cuenta_contable_ingreso2();
				case 24: return this.parametrocontas.get(rowIndex).getid_cuenta_contable_ingreso3();
				case 25: return this.parametrocontas.get(rowIndex).getid_cuenta_contable_egreso1();
				case 26: return this.parametrocontas.get(rowIndex).getid_cuenta_contable_egreso2();
				case 27: return this.parametrocontas.get(rowIndex).getid_cuenta_contable_egreso3();	            
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
				case 5: return Boolean.class;
				case 6: return Integer.class;
				case 7: return Boolean.class;
				case 8: return Boolean.class;
				case 9: return Boolean.class;
				case 10: return Boolean.class;
				case 11: return Boolean.class;
				case 12: return Boolean.class;
				case 13: return Integer.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Long.class;
				case 19: return Long.class;
				case 20: return Long.class;
				case 21: return Long.class;
				case 22: return Long.class;
				case 23: return Long.class;
				case 24: return Long.class;
				case 25: return Long.class;
				case 26: return Long.class;
				case 27: return Long.class;	            
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
				case 21: return true;
				case 22: return true;
				case 23: return true;
				case 24: return true;
				case 25: return true;
				case 26: return true;
				case 27: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ParametroConta parametroconta = this.parametrocontas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ParametroContaBeanSwingJInternalFrame parametrocontaBeanSwingJInternalFrame=(ParametroContaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {parametroconta.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {parametroconta.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {parametroconta.setid_empresa((Long) value);parametroconta.setempresa_descripcion(parametrocontaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {parametroconta.setid_moneda((Long) value);parametroconta.setmoneda_descripcion(parametrocontaBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {parametroconta.setid_moneda_extranjera((Long) value);parametroconta.setmonedaextranjera_descripcion(parametrocontaBeanSwingJInternalFrame.getActualMonedaExtranjeraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {parametroconta.setcon_mascara((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {parametroconta.setnumero_nivel((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {parametroconta.setes_presupuesto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {parametroconta.setes_lote((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {parametroconta.setcon_secuencial_automatico((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {parametroconta.setcon_cuentas_niff((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {parametroconta.setcon_centro_costo_mascara((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {parametroconta.setcon_centro_costo_nueva_estructura((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {parametroconta.setcentro_costo_numero_nivel((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {parametroconta.setid_cuenta_contable_activo((Long) value);parametroconta.setcuentacontableactivo_descripcion(parametrocontaBeanSwingJInternalFrame.getActualCuentaContableActivoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {parametroconta.setid_cuenta_contable_pasivo((Long) value);parametroconta.setcuentacontablepasivo_descripcion(parametrocontaBeanSwingJInternalFrame.getActualCuentaContablePasivoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {parametroconta.setid_cuenta_contable_patrimonio((Long) value);parametroconta.setcuentacontablepatrimonio_descripcion(parametrocontaBeanSwingJInternalFrame.getActualCuentaContablePatrimonioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {parametroconta.setid_cuenta_contable_ingreso((Long) value);parametroconta.setcuentacontableingreso_descripcion(parametrocontaBeanSwingJInternalFrame.getActualCuentaContableIngresoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {parametroconta.setid_cuenta_contable_egreso((Long) value);parametroconta.setcuentacontableegreso_descripcion(parametrocontaBeanSwingJInternalFrame.getActualCuentaContableEgresoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {parametroconta.setid_cuenta_contable_resumen((Long) value);parametroconta.setcuentacontableresumen_descripcion(parametrocontaBeanSwingJInternalFrame.getActualCuentaContableResumenForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {parametroconta.setid_cuenta_contable_deudor((Long) value);parametroconta.setcuentacontabledeudor_descripcion(parametrocontaBeanSwingJInternalFrame.getActualCuentaContableDeudorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {parametroconta.setid_cuenta_contable_acreedor((Long) value);parametroconta.setcuentacontableacreedor_descripcion(parametrocontaBeanSwingJInternalFrame.getActualCuentaContableAcreedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {parametroconta.setid_cuenta_contable_ingreso1((Long) value);parametroconta.setcuentacontableingreso1_descripcion(parametrocontaBeanSwingJInternalFrame.getActualCuentaContableIngreso1ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {parametroconta.setid_cuenta_contable_ingreso2((Long) value);parametroconta.setcuentacontableingreso2_descripcion(parametrocontaBeanSwingJInternalFrame.getActualCuentaContableIngreso2ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {parametroconta.setid_cuenta_contable_ingreso3((Long) value);parametroconta.setcuentacontableingreso3_descripcion(parametrocontaBeanSwingJInternalFrame.getActualCuentaContableIngreso3ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {parametroconta.setid_cuenta_contable_egreso1((Long) value);parametroconta.setcuentacontableegreso1_descripcion(parametrocontaBeanSwingJInternalFrame.getActualCuentaContableEgreso1ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {parametroconta.setid_cuenta_contable_egreso2((Long) value);parametroconta.setcuentacontableegreso2_descripcion(parametrocontaBeanSwingJInternalFrame.getActualCuentaContableEgreso2ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {parametroconta.setid_cuenta_contable_egreso3((Long) value);parametroconta.setcuentacontableegreso3_descripcion(parametrocontaBeanSwingJInternalFrame.getActualCuentaContableEgreso3ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private ParametroContaDetalleFormJInternalFrame parametrocontaJInternalFrame=null;
		
		public ParametroContaModel(ParametroContaDetalleFormJInternalFrame parametrocontaJInternalFrame) {
			this.parametrocontaJInternalFrame=parametrocontaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrocontaJInternalFrame.getjButtonActualizarToolBarParametroConta();
			
			if(component!=null && component.equals(this.parametrocontaJInternalFrame.getjButtonActualizarToolBarParametroConta())) {
				componentTab=this.parametrocontaJInternalFrame.getjButtonEliminarToolBarParametroConta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocontaJInternalFrame.getjButtonEliminarToolBarParametroConta())) {
				componentTab=this.parametrocontaJInternalFrame.getjButtonCancelarToolBarParametroConta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocontaJInternalFrame.getjButtonCancelarToolBarParametroConta())) {
				componentTab=this.parametrocontaJInternalFrame.jComboBoxid_empresaParametroConta;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egreso3ParametroConta)) {
				componentTab=this.parametrocontaJInternalFrame.jComboBoxTiposAccionesFormularioParametroConta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxTiposAccionesFormularioParametroConta)) {
				componentTab=this.parametrocontaJInternalFrame.jButtonEliminarParametroConta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocontaJInternalFrame.jButtonEliminarParametroConta)) {
				componentTab=this.parametrocontaJInternalFrame.jButtonActualizarParametroConta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocontaJInternalFrame.jButtonActualizarParametroConta)) {
				componentTab=this.parametrocontaJInternalFrame.jButtonCancelarParametroConta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_empresaParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_monedaParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_monedaParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_moneda_extranjeraParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_moneda_extranjeraParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jCheckBoxcon_mascaraParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jCheckBoxcon_mascaraParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jTextFieldnumero_nivelParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jTextFieldnumero_nivelParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jCheckBoxes_presupuestoParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jCheckBoxes_presupuestoParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jCheckBoxes_loteParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jCheckBoxes_loteParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jCheckBoxcon_secuencial_automaticoParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jCheckBoxcon_secuencial_automaticoParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jCheckBoxcon_cuentas_niffParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jCheckBoxcon_cuentas_niffParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jCheckBoxcon_centro_costo_mascaraParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jCheckBoxcon_centro_costo_mascaraParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jCheckBoxcon_centro_costo_nueva_estructuraParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jCheckBoxcon_centro_costo_nueva_estructuraParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jTextFieldcentro_costo_numero_nivelParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jTextFieldcentro_costo_numero_nivelParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_activoParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_activoParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_pasivoParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_pasivoParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_patrimonioParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_patrimonioParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingresoParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingresoParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egresoParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egresoParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_resumenParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_resumenParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_deudorParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_deudorParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_acreedorParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_acreedorParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingreso1ParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingreso1ParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingreso2ParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingreso2ParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingreso3ParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingreso3ParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egreso1ParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egreso1ParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egreso2ParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egreso2ParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egreso3ParametroConta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrocontaJInternalFrame.getjButtonActualizarToolBarParametroConta();
			
			if(component!=null && component.equals(this.parametrocontaJInternalFrame.getjButtonEliminarToolBarParametroConta())) {
				componentTab=this.parametrocontaJInternalFrame.getjButtonActualizarToolBarParametroConta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocontaJInternalFrame.getjButtonCancelarToolBarParametroConta())) {
				componentTab=this.parametrocontaJInternalFrame.getjButtonEliminarToolBarParametroConta();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_empresaParametroConta)) {
				
				componentTab=this.parametrocontaJInternalFrame.getjButtonCancelarToolBarParametroConta();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxTiposAccionesFormularioParametroConta)) {
				componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egreso3ParametroConta;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrocontaJInternalFrame.jButtonEliminarParametroConta)) {
				componentTab=this.parametrocontaJInternalFrame.jComboBoxTiposAccionesFormularioParametroConta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocontaJInternalFrame.jButtonActualizarParametroConta)) {
				componentTab=this.parametrocontaJInternalFrame.jButtonEliminarParametroConta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocontaJInternalFrame.jButtonCancelarParametroConta)) {
				componentTab=this.parametrocontaJInternalFrame.jButtonActualizarParametroConta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_monedaParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_empresaParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_moneda_extranjeraParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_monedaParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jCheckBoxcon_mascaraParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_moneda_extranjeraParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jTextFieldnumero_nivelParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jCheckBoxcon_mascaraParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jCheckBoxes_presupuestoParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jTextFieldnumero_nivelParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jCheckBoxes_loteParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jCheckBoxes_presupuestoParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jCheckBoxcon_secuencial_automaticoParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jCheckBoxes_loteParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jCheckBoxcon_cuentas_niffParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jCheckBoxcon_secuencial_automaticoParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jCheckBoxcon_centro_costo_mascaraParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jCheckBoxcon_cuentas_niffParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jCheckBoxcon_centro_costo_nueva_estructuraParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jCheckBoxcon_centro_costo_mascaraParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jTextFieldcentro_costo_numero_nivelParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jCheckBoxcon_centro_costo_nueva_estructuraParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_activoParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jTextFieldcentro_costo_numero_nivelParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_pasivoParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_activoParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_patrimonioParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_pasivoParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingresoParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_patrimonioParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egresoParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingresoParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_resumenParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egresoParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_deudorParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_resumenParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_acreedorParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_deudorParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingreso1ParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_acreedorParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingreso2ParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingreso1ParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingreso3ParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingreso2ParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egreso1ParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_ingreso3ParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egreso2ParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egreso1ParametroConta;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egreso3ParametroConta)) {
			componentTab=this.parametrocontaJInternalFrame.jComboBoxid_cuenta_contable_egreso2ParametroConta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrocontaJInternalFrame.getjButtonActualizarToolBarParametroConta();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrocontaJInternalFrame.getjButtonActualizarToolBarParametroConta();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrocontaJInternalFrame.getjButtonCancelarToolBarParametroConta();
			
			
			return componentTab;		
		}
		
		public ParametroContaDetalleFormJInternalFrame getparametrocontaJInternalFrame() {
			return this.parametrocontaJInternalFrame;
		}
		
		public void setparametrocontaJInternalFrame(ParametroContaDetalleFormJInternalFrame parametrocontaJInternalFrame) {
			this.parametrocontaJInternalFrame=parametrocontaJInternalFrame;
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
