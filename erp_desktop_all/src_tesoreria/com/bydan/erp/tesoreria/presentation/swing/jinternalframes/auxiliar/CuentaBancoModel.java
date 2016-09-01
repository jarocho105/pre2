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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.tesoreria.util.CuentaBancoConstantesFunciones;
import com.bydan.erp.tesoreria.util.CuentaBancoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.CuentaBancoParameterGeneral;

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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.CuentaBancoBeanSwingJInternalFrame;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.CuentaBancoJInternalFrame;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.CuentaBancoDetalleFormJInternalFrame;

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

public class CuentaBancoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,CuentaBancoConstantesFunciones.LABEL_ID
										,CuentaBancoConstantesFunciones.LABEL_IDEMPRESA
										,CuentaBancoConstantesFunciones.LABEL_IDSUCURSAL
										,CuentaBancoConstantesFunciones.LABEL_IDBANCO
										,CuentaBancoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL
										,CuentaBancoConstantesFunciones.LABEL_CODIGO
										,CuentaBancoConstantesFunciones.LABEL_NUMEROCUENTA
										,CuentaBancoConstantesFunciones.LABEL_NUMEROCHEQUE
										,CuentaBancoConstantesFunciones.LABEL_NUMEROCHEQUEAUXILIAR
										,CuentaBancoConstantesFunciones.LABEL_SALDO
										,CuentaBancoConstantesFunciones.LABEL_PROCEDENCIA
										,CuentaBancoConstantesFunciones.LABEL_DESTINO
										,CuentaBancoConstantesFunciones.LABEL_IDCUENTACONTABLE
										,CuentaBancoConstantesFunciones.LABEL_ESBANCO
										,CuentaBancoConstantesFunciones.LABEL_IDESTADOCUENTABANCO
										,CuentaBancoConstantesFunciones.LABEL_IDFORMATOINGRESO
										,CuentaBancoConstantesFunciones.LABEL_IDFORMATOEGRESO
										,CuentaBancoConstantesFunciones.LABEL_IDFORMATODIARIO
										,CuentaBancoConstantesFunciones.LABEL_IDFORMATOCHEQUE
										,CuentaBancoConstantesFunciones.LABEL_IDFORMATORETENCION
										,CuentaBancoConstantesFunciones.LABEL_IDFORMATORETENCIONIVA
										};
	   
	    public List<CuentaBanco> cuentabancos;
	  	 
	    //NO SE UTILIZA
	    public CuentaBancoModel(List<CuentaBanco> cuentabancos,JInternalFrameBase jInternalFrameBase) {
	    	this.cuentabancos=cuentabancos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public CuentaBancoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.cuentabancos=new ArrayList<CuentaBanco>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.cuentabancos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.cuentabancos.get(rowIndex).getIsSelected();
	            
				case 1: return this.cuentabancos.get(rowIndex).getId();
				case 2: return this.cuentabancos.get(rowIndex).getid_empresa();
				case 3: return this.cuentabancos.get(rowIndex).getid_sucursal();
				case 4: return this.cuentabancos.get(rowIndex).getid_banco();
				case 5: return this.cuentabancos.get(rowIndex).getid_tipo_cuenta_banco_global();
				case 6: return this.cuentabancos.get(rowIndex).getcodigo();
				case 7: return this.cuentabancos.get(rowIndex).getnumero_cuenta();
				case 8: return this.cuentabancos.get(rowIndex).getnumero_cheque();
				case 9: return this.cuentabancos.get(rowIndex).getnumero_cheque_auxiliar();
				case 10: return this.cuentabancos.get(rowIndex).getsaldo();
				case 11: return this.cuentabancos.get(rowIndex).getprocedencia();
				case 12: return this.cuentabancos.get(rowIndex).getdestino();
				case 13: return this.cuentabancos.get(rowIndex).getid_cuenta_contable();
				case 14: return this.cuentabancos.get(rowIndex).getes_banco();
				case 15: return this.cuentabancos.get(rowIndex).getid_estado_cuenta_banco();
				case 16: return this.cuentabancos.get(rowIndex).getid_formato_ingreso();
				case 17: return this.cuentabancos.get(rowIndex).getid_formato_egreso();
				case 18: return this.cuentabancos.get(rowIndex).getid_formato_diario();
				case 19: return this.cuentabancos.get(rowIndex).getid_formato_cheque();
				case 20: return this.cuentabancos.get(rowIndex).getid_formato_retencion();
				case 21: return this.cuentabancos.get(rowIndex).getid_formato_retencion_iva();	            
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
				case 10: return Double.class;
				case 11: return String.class;
				case 12: return String.class;
				case 13: return Long.class;
				case 14: return Boolean.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Long.class;
				case 19: return Long.class;
				case 20: return Long.class;
				case 21: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	CuentaBanco cuentabanco = this.cuentabancos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame=(CuentaBancoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {cuentabanco.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {cuentabanco.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {cuentabanco.setid_empresa((Long) value);cuentabanco.setempresa_descripcion(cuentabancoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {cuentabanco.setid_sucursal((Long) value);cuentabanco.setsucursal_descripcion(cuentabancoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {cuentabanco.setid_banco((Long) value);cuentabanco.setbanco_descripcion(cuentabancoBeanSwingJInternalFrame.getActualBancoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {cuentabanco.setid_tipo_cuenta_banco_global((Long) value);cuentabanco.settipocuentabancoglobal_descripcion(cuentabancoBeanSwingJInternalFrame.getActualTipoCuentaBancoGlobalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {cuentabanco.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {cuentabanco.setnumero_cuenta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {cuentabanco.setnumero_cheque((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {cuentabanco.setnumero_cheque_auxiliar((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {cuentabanco.setsaldo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {cuentabanco.setprocedencia((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {cuentabanco.setdestino((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {cuentabanco.setid_cuenta_contable((Long) value);cuentabanco.setcuentacontable_descripcion(cuentabancoBeanSwingJInternalFrame.getActualCuentaContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {cuentabanco.setes_banco((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {cuentabanco.setid_estado_cuenta_banco((Long) value);cuentabanco.setestadocuentabanco_descripcion(cuentabancoBeanSwingJInternalFrame.getActualEstadoCuentaBancoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {cuentabanco.setid_formato_ingreso((Long) value);cuentabanco.setformatoingreso_descripcion(cuentabancoBeanSwingJInternalFrame.getActualFormatoIngresoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {cuentabanco.setid_formato_egreso((Long) value);cuentabanco.setformatoegreso_descripcion(cuentabancoBeanSwingJInternalFrame.getActualFormatoEgresoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {cuentabanco.setid_formato_diario((Long) value);cuentabanco.setformatodiario_descripcion(cuentabancoBeanSwingJInternalFrame.getActualFormatoDiarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {cuentabanco.setid_formato_cheque((Long) value);cuentabanco.setformatocheque_descripcion(cuentabancoBeanSwingJInternalFrame.getActualFormatoChequeForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {cuentabanco.setid_formato_retencion((Long) value);cuentabanco.setformatoretencion_descripcion(cuentabancoBeanSwingJInternalFrame.getActualFormatoRetencionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {cuentabanco.setid_formato_retencion_iva((Long) value);cuentabanco.setformatoretencioniva_descripcion(cuentabancoBeanSwingJInternalFrame.getActualFormatoRetencionIvaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public CuentaBancoModel(JInternalFrameBase jInternalFrameBase) {
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
		private CuentaBancoDetalleFormJInternalFrame cuentabancoJInternalFrame=null;
		
		public CuentaBancoModel(CuentaBancoDetalleFormJInternalFrame cuentabancoJInternalFrame) {
			this.cuentabancoJInternalFrame=cuentabancoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.cuentabancoJInternalFrame.getjButtonActualizarToolBarCuentaBanco();
			
			if(component!=null && component.equals(this.cuentabancoJInternalFrame.getjButtonActualizarToolBarCuentaBanco())) {
				componentTab=this.cuentabancoJInternalFrame.getjButtonEliminarToolBarCuentaBanco();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentabancoJInternalFrame.getjButtonEliminarToolBarCuentaBanco())) {
				componentTab=this.cuentabancoJInternalFrame.getjButtonCancelarToolBarCuentaBanco();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentabancoJInternalFrame.getjButtonCancelarToolBarCuentaBanco())) {
				componentTab=this.cuentabancoJInternalFrame.jComboBoxid_empresaCuentaBanco;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_formato_retencion_ivaCuentaBanco)) {
				componentTab=this.cuentabancoJInternalFrame.jComboBoxTiposAccionesFormularioCuentaBanco;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxTiposAccionesFormularioCuentaBanco)) {
				componentTab=this.cuentabancoJInternalFrame.jButtonEliminarCuentaBanco;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentabancoJInternalFrame.jButtonEliminarCuentaBanco)) {
				componentTab=this.cuentabancoJInternalFrame.jButtonActualizarCuentaBanco;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentabancoJInternalFrame.jButtonActualizarCuentaBanco)) {
				componentTab=this.cuentabancoJInternalFrame.jButtonCancelarCuentaBanco;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_empresaCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_sucursalCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_sucursalCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_bancoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_bancoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jTextAreacodigoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jTextAreacodigoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jTextFieldnumero_cuentaCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jTextFieldnumero_cuentaCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jTextFieldnumero_chequeCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jTextFieldnumero_chequeCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jTextFieldnumero_cheque_auxiliarCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jTextFieldnumero_cheque_auxiliarCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jTextFieldsaldoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jTextFieldsaldoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jTextAreaprocedenciaCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jTextAreaprocedenciaCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jTextAreadestinoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jTextAreadestinoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_cuenta_contableCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_cuenta_contableCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jCheckBoxes_bancoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jCheckBoxes_bancoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_estado_cuenta_bancoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_estado_cuenta_bancoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_formato_ingresoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_formato_ingresoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_formato_egresoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_formato_egresoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_formato_diarioCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_formato_diarioCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_formato_chequeCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_formato_chequeCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_formato_retencionCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_formato_retencionCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_formato_retencion_ivaCuentaBanco;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.cuentabancoJInternalFrame.getjButtonActualizarToolBarCuentaBanco();
			
			if(component!=null && component.equals(this.cuentabancoJInternalFrame.getjButtonEliminarToolBarCuentaBanco())) {
				componentTab=this.cuentabancoJInternalFrame.getjButtonActualizarToolBarCuentaBanco();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentabancoJInternalFrame.getjButtonCancelarToolBarCuentaBanco())) {
				componentTab=this.cuentabancoJInternalFrame.getjButtonEliminarToolBarCuentaBanco();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_empresaCuentaBanco)) {
				
				componentTab=this.cuentabancoJInternalFrame.getjButtonCancelarToolBarCuentaBanco();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxTiposAccionesFormularioCuentaBanco)) {
				componentTab=this.cuentabancoJInternalFrame.jComboBoxid_formato_retencion_ivaCuentaBanco;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cuentabancoJInternalFrame.jButtonEliminarCuentaBanco)) {
				componentTab=this.cuentabancoJInternalFrame.jComboBoxTiposAccionesFormularioCuentaBanco;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentabancoJInternalFrame.jButtonActualizarCuentaBanco)) {
				componentTab=this.cuentabancoJInternalFrame.jButtonEliminarCuentaBanco;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cuentabancoJInternalFrame.jButtonCancelarCuentaBanco)) {
				componentTab=this.cuentabancoJInternalFrame.jButtonActualizarCuentaBanco;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_sucursalCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_empresaCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_bancoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_sucursalCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_bancoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jTextAreacodigoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jTextFieldnumero_cuentaCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jTextAreacodigoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jTextFieldnumero_chequeCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jTextFieldnumero_cuentaCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jTextFieldnumero_cheque_auxiliarCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jTextFieldnumero_chequeCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jTextFieldsaldoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jTextFieldnumero_cheque_auxiliarCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jTextAreaprocedenciaCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jTextFieldsaldoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jTextAreadestinoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jTextAreaprocedenciaCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_cuenta_contableCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jTextAreadestinoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jCheckBoxes_bancoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_cuenta_contableCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_estado_cuenta_bancoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jCheckBoxes_bancoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_formato_ingresoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_estado_cuenta_bancoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_formato_egresoCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_formato_ingresoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_formato_diarioCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_formato_egresoCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_formato_chequeCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_formato_diarioCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_formato_retencionCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_formato_chequeCuentaBanco;
			return componentTab;
		}

		if(component!=null && component.equals(this.cuentabancoJInternalFrame.jComboBoxid_formato_retencion_ivaCuentaBanco)) {
			componentTab=this.cuentabancoJInternalFrame.jComboBoxid_formato_retencionCuentaBanco;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.cuentabancoJInternalFrame.getjButtonActualizarToolBarCuentaBanco();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.cuentabancoJInternalFrame.getjButtonActualizarToolBarCuentaBanco();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.cuentabancoJInternalFrame.getjButtonCancelarToolBarCuentaBanco();
			
			
			return componentTab;		
		}
		
		public CuentaBancoDetalleFormJInternalFrame getcuentabancoJInternalFrame() {
			return this.cuentabancoJInternalFrame;
		}
		
		public void setcuentabancoJInternalFrame(CuentaBancoDetalleFormJInternalFrame cuentabancoJInternalFrame) {
			this.cuentabancoJInternalFrame=cuentabancoJInternalFrame;
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
