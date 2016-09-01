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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.cartera.util.BalanceGeneralClienteConstantesFunciones;
import com.bydan.erp.cartera.util.BalanceGeneralClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.BalanceGeneralClienteParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.BalanceGeneralClienteBeanSwingJInternalFrame;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.BalanceGeneralClienteJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.BalanceGeneralClienteDetalleFormJInternalFrame;

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

public class BalanceGeneralClienteModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,BalanceGeneralClienteConstantesFunciones.LABEL_ID
										,BalanceGeneralClienteConstantesFunciones.LABEL_IDEMPRESA
										,BalanceGeneralClienteConstantesFunciones.LABEL_IDCLIENTE
										,BalanceGeneralClienteConstantesFunciones.LABEL_CAJABANCOSDISPONIBLE
										,BalanceGeneralClienteConstantesFunciones.LABEL_CUENTASPORCOBRARCLIENTES
										,BalanceGeneralClienteConstantesFunciones.LABEL_INVENTARIO
										,BalanceGeneralClienteConstantesFunciones.LABEL_OTROSACTIVOSCORRIENTES
										,BalanceGeneralClienteConstantesFunciones.LABEL_TOTALACTIVOSCORRIENTES
										,BalanceGeneralClienteConstantesFunciones.LABEL_BIENESINMUEBLES
										,BalanceGeneralClienteConstantesFunciones.LABEL_BIENESMUEBLES
										,BalanceGeneralClienteConstantesFunciones.LABEL_OTROSACTIVOSNOCORRIENTES
										,BalanceGeneralClienteConstantesFunciones.LABEL_TOTALACTIVOSNOCORRIENTES
										,BalanceGeneralClienteConstantesFunciones.LABEL_VENTASMENSUALES
										,BalanceGeneralClienteConstantesFunciones.LABEL_COSTOVENTASMENSUALES
										,BalanceGeneralClienteConstantesFunciones.LABEL_UTILIDADBRUTA
										,BalanceGeneralClienteConstantesFunciones.LABEL_GASTOSOPERATIVOS
										,BalanceGeneralClienteConstantesFunciones.LABEL_SUELDOS
										,BalanceGeneralClienteConstantesFunciones.LABEL_SERVICIOS
										,BalanceGeneralClienteConstantesFunciones.LABEL_ARRIENDOS
										,BalanceGeneralClienteConstantesFunciones.LABEL_IMPUESTOS
										,BalanceGeneralClienteConstantesFunciones.LABEL_UTILIDADOPERATIVA
										,BalanceGeneralClienteConstantesFunciones.LABEL_GASTOSFAMILIARES
										,BalanceGeneralClienteConstantesFunciones.LABEL_EXCEDENTEANTESDIVIDENDOS
										,BalanceGeneralClienteConstantesFunciones.LABEL_DIVIDENDOSBANCOSOTROS
										,BalanceGeneralClienteConstantesFunciones.LABEL_EXEDENTENETOMENSUAL
										,BalanceGeneralClienteConstantesFunciones.LABEL_DEUDASBANCARIAS
										,BalanceGeneralClienteConstantesFunciones.LABEL_CUENTASPORPAGAR
										,BalanceGeneralClienteConstantesFunciones.LABEL_ANTICIPOSRECIBOS
										,BalanceGeneralClienteConstantesFunciones.LABEL_OTRASCUENTASPORPAGAR
										,BalanceGeneralClienteConstantesFunciones.LABEL_OTRASDEUDASFAMILIARES
										,BalanceGeneralClienteConstantesFunciones.LABEL_TOTALPASIVOCORRIENTE
										,BalanceGeneralClienteConstantesFunciones.LABEL_DEUDASBANCARIASLARGOPLAZO
										,BalanceGeneralClienteConstantesFunciones.LABEL_OTROSPASIVOSLARGOPLAZO
										,BalanceGeneralClienteConstantesFunciones.LABEL_TOTALPASIVONOCORRIENTE
										,BalanceGeneralClienteConstantesFunciones.LABEL_TOTALPASIVO
										,BalanceGeneralClienteConstantesFunciones.LABEL_PATRIMONIO
										,BalanceGeneralClienteConstantesFunciones.LABEL_DESCRIPCION
										};
	   
	    public List<BalanceGeneralCliente> balancegeneralclientes;
	  	 
	    //NO SE UTILIZA
	    public BalanceGeneralClienteModel(List<BalanceGeneralCliente> balancegeneralclientes,JInternalFrameBase jInternalFrameBase) {
	    	this.balancegeneralclientes=balancegeneralclientes;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public BalanceGeneralClienteModel(JInternalFrameBase jInternalFrameBase) {
	    	this.balancegeneralclientes=new ArrayList<BalanceGeneralCliente>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.balancegeneralclientes.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.balancegeneralclientes.get(rowIndex).getIsSelected();
	            
				case 1: return this.balancegeneralclientes.get(rowIndex).getId();
				case 2: return this.balancegeneralclientes.get(rowIndex).getid_empresa();
				case 3: return this.balancegeneralclientes.get(rowIndex).getid_cliente();
				case 4: return this.balancegeneralclientes.get(rowIndex).getcaja_bancos_disponible();
				case 5: return this.balancegeneralclientes.get(rowIndex).getcuentas_por_cobrar_clientes();
				case 6: return this.balancegeneralclientes.get(rowIndex).getinventario();
				case 7: return this.balancegeneralclientes.get(rowIndex).getotros_activos_corrientes();
				case 8: return this.balancegeneralclientes.get(rowIndex).gettotal_activos_corrientes();
				case 9: return this.balancegeneralclientes.get(rowIndex).getbienes_inmuebles();
				case 10: return this.balancegeneralclientes.get(rowIndex).getbienes_muebles();
				case 11: return this.balancegeneralclientes.get(rowIndex).getotros_activos_no_corrientes();
				case 12: return this.balancegeneralclientes.get(rowIndex).gettotal_activos_no_corrientes();
				case 13: return this.balancegeneralclientes.get(rowIndex).getventas_mensuales();
				case 14: return this.balancegeneralclientes.get(rowIndex).getcosto_ventas_mensuales();
				case 15: return this.balancegeneralclientes.get(rowIndex).getutilidad_bruta();
				case 16: return this.balancegeneralclientes.get(rowIndex).getgastos_operativos();
				case 17: return this.balancegeneralclientes.get(rowIndex).getsueldos();
				case 18: return this.balancegeneralclientes.get(rowIndex).getservicios();
				case 19: return this.balancegeneralclientes.get(rowIndex).getarriendos();
				case 20: return this.balancegeneralclientes.get(rowIndex).getimpuestos();
				case 21: return this.balancegeneralclientes.get(rowIndex).getutilidad_operativa();
				case 22: return this.balancegeneralclientes.get(rowIndex).getgastos_familiares();
				case 23: return this.balancegeneralclientes.get(rowIndex).getexcedente_antes_dividendos();
				case 24: return this.balancegeneralclientes.get(rowIndex).getdividendos_bancos_otros();
				case 25: return this.balancegeneralclientes.get(rowIndex).getexedente_neto_mensual();
				case 26: return this.balancegeneralclientes.get(rowIndex).getdeudas_bancarias();
				case 27: return this.balancegeneralclientes.get(rowIndex).getcuentas_por_pagar();
				case 28: return this.balancegeneralclientes.get(rowIndex).getanticipos_recibos();
				case 29: return this.balancegeneralclientes.get(rowIndex).getotras_cuentas_por_pagar();
				case 30: return this.balancegeneralclientes.get(rowIndex).getotras_deudas_familiares();
				case 31: return this.balancegeneralclientes.get(rowIndex).gettotal_pasivo_corriente();
				case 32: return this.balancegeneralclientes.get(rowIndex).getdeudas_bancarias_largo_plazo();
				case 33: return this.balancegeneralclientes.get(rowIndex).getotros_pasivos_largo_plazo();
				case 34: return this.balancegeneralclientes.get(rowIndex).gettotal_pasivo_no_corriente();
				case 35: return this.balancegeneralclientes.get(rowIndex).gettotal_pasivo();
				case 36: return this.balancegeneralclientes.get(rowIndex).getpatrimonio();
				case 37: return this.balancegeneralclientes.get(rowIndex).getdescripcion();	            
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
				case 4: return Double.class;
				case 5: return Double.class;
				case 6: return Double.class;
				case 7: return Double.class;
				case 8: return Double.class;
				case 9: return Double.class;
				case 10: return Double.class;
				case 11: return Double.class;
				case 12: return Double.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return Double.class;
				case 25: return Double.class;
				case 26: return Double.class;
				case 27: return Double.class;
				case 28: return Double.class;
				case 29: return Double.class;
				case 30: return Double.class;
				case 31: return Double.class;
				case 32: return Double.class;
				case 33: return Double.class;
				case 34: return Double.class;
				case 35: return Double.class;
				case 36: return Double.class;
				case 37: return String.class;	            
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
				case 28: return true;
				case 29: return true;
				case 30: return true;
				case 31: return true;
				case 32: return true;
				case 33: return true;
				case 34: return true;
				case 35: return true;
				case 36: return true;
				case 37: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	BalanceGeneralCliente balancegeneralcliente = this.balancegeneralclientes.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			BalanceGeneralClienteBeanSwingJInternalFrame balancegeneralclienteBeanSwingJInternalFrame=(BalanceGeneralClienteBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {balancegeneralcliente.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {balancegeneralcliente.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {balancegeneralcliente.setid_empresa((Long) value);balancegeneralcliente.setempresa_descripcion(balancegeneralclienteBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {balancegeneralcliente.setid_cliente((Long) value);balancegeneralcliente.setcliente_descripcion(balancegeneralclienteBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {balancegeneralcliente.setcaja_bancos_disponible((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {balancegeneralcliente.setcuentas_por_cobrar_clientes((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {balancegeneralcliente.setinventario((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {balancegeneralcliente.setotros_activos_corrientes((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {balancegeneralcliente.settotal_activos_corrientes((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {balancegeneralcliente.setbienes_inmuebles((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {balancegeneralcliente.setbienes_muebles((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {balancegeneralcliente.setotros_activos_no_corrientes((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {balancegeneralcliente.settotal_activos_no_corrientes((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {balancegeneralcliente.setventas_mensuales((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {balancegeneralcliente.setcosto_ventas_mensuales((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {balancegeneralcliente.setutilidad_bruta((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {balancegeneralcliente.setgastos_operativos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {balancegeneralcliente.setsueldos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {balancegeneralcliente.setservicios((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {balancegeneralcliente.setarriendos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {balancegeneralcliente.setimpuestos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {balancegeneralcliente.setutilidad_operativa((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {balancegeneralcliente.setgastos_familiares((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {balancegeneralcliente.setexcedente_antes_dividendos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {balancegeneralcliente.setdividendos_bancos_otros((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {balancegeneralcliente.setexedente_neto_mensual((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {balancegeneralcliente.setdeudas_bancarias((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {balancegeneralcliente.setcuentas_por_pagar((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {balancegeneralcliente.setanticipos_recibos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {balancegeneralcliente.setotras_cuentas_por_pagar((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {balancegeneralcliente.setotras_deudas_familiares((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {balancegeneralcliente.settotal_pasivo_corriente((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {balancegeneralcliente.setdeudas_bancarias_largo_plazo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {balancegeneralcliente.setotros_pasivos_largo_plazo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {balancegeneralcliente.settotal_pasivo_no_corriente((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {balancegeneralcliente.settotal_pasivo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {balancegeneralcliente.setpatrimonio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {balancegeneralcliente.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public BalanceGeneralClienteModel(JInternalFrameBase jInternalFrameBase) {
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
		private BalanceGeneralClienteDetalleFormJInternalFrame balancegeneralclienteJInternalFrame=null;
		
		public BalanceGeneralClienteModel(BalanceGeneralClienteDetalleFormJInternalFrame balancegeneralclienteJInternalFrame) {
			this.balancegeneralclienteJInternalFrame=balancegeneralclienteJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.balancegeneralclienteJInternalFrame.getjButtonActualizarToolBarBalanceGeneralCliente();
			
			if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.getjButtonActualizarToolBarBalanceGeneralCliente())) {
				componentTab=this.balancegeneralclienteJInternalFrame.getjButtonEliminarToolBarBalanceGeneralCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.getjButtonEliminarToolBarBalanceGeneralCliente())) {
				componentTab=this.balancegeneralclienteJInternalFrame.getjButtonCancelarToolBarBalanceGeneralCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.getjButtonCancelarToolBarBalanceGeneralCliente())) {
				componentTab=this.balancegeneralclienteJInternalFrame.jComboBoxid_empresaBalanceGeneralCliente;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextAreadescripcionBalanceGeneralCliente)) {
				componentTab=this.balancegeneralclienteJInternalFrame.jComboBoxTiposAccionesFormularioBalanceGeneralCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jComboBoxTiposAccionesFormularioBalanceGeneralCliente)) {
				componentTab=this.balancegeneralclienteJInternalFrame.jButtonEliminarBalanceGeneralCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jButtonEliminarBalanceGeneralCliente)) {
				componentTab=this.balancegeneralclienteJInternalFrame.jButtonActualizarBalanceGeneralCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jButtonActualizarBalanceGeneralCliente)) {
				componentTab=this.balancegeneralclienteJInternalFrame.jButtonCancelarBalanceGeneralCliente;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jComboBoxid_empresaBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jComboBoxid_clienteBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jComboBoxid_clienteBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldcaja_bancos_disponibleBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldcaja_bancos_disponibleBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldinventarioBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldinventarioBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldotros_activos_corrientesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldotros_activos_corrientesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldtotal_activos_corrientesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldtotal_activos_corrientesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldbienes_inmueblesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldbienes_inmueblesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldbienes_mueblesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldbienes_mueblesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldotros_activos_no_corrientesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldotros_activos_no_corrientesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldventas_mensualesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldventas_mensualesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldcosto_ventas_mensualesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldcosto_ventas_mensualesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldutilidad_brutaBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldutilidad_brutaBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldgastos_operativosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldgastos_operativosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldsueldosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldsueldosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldserviciosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldserviciosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldarriendosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldarriendosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldimpuestosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldimpuestosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldutilidad_operativaBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldutilidad_operativaBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldgastos_familiaresBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldgastos_familiaresBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldexcedente_antes_dividendosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldexcedente_antes_dividendosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFielddividendos_bancos_otrosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFielddividendos_bancos_otrosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldexedente_neto_mensualBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldexedente_neto_mensualBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFielddeudas_bancariasBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFielddeudas_bancariasBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldcuentas_por_pagarBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldcuentas_por_pagarBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldanticipos_recibosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldanticipos_recibosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldotras_deudas_familiaresBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldotras_deudas_familiaresBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldtotal_pasivoBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldtotal_pasivoBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldpatrimonioBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldpatrimonioBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextAreadescripcionBalanceGeneralCliente;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.balancegeneralclienteJInternalFrame.getjButtonActualizarToolBarBalanceGeneralCliente();
			
			if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.getjButtonEliminarToolBarBalanceGeneralCliente())) {
				componentTab=this.balancegeneralclienteJInternalFrame.getjButtonActualizarToolBarBalanceGeneralCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.getjButtonCancelarToolBarBalanceGeneralCliente())) {
				componentTab=this.balancegeneralclienteJInternalFrame.getjButtonEliminarToolBarBalanceGeneralCliente();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jComboBoxid_empresaBalanceGeneralCliente)) {
				
				componentTab=this.balancegeneralclienteJInternalFrame.getjButtonCancelarToolBarBalanceGeneralCliente();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jComboBoxTiposAccionesFormularioBalanceGeneralCliente)) {
				componentTab=this.balancegeneralclienteJInternalFrame.jTextAreadescripcionBalanceGeneralCliente;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jButtonEliminarBalanceGeneralCliente)) {
				componentTab=this.balancegeneralclienteJInternalFrame.jComboBoxTiposAccionesFormularioBalanceGeneralCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jButtonActualizarBalanceGeneralCliente)) {
				componentTab=this.balancegeneralclienteJInternalFrame.jButtonEliminarBalanceGeneralCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jButtonCancelarBalanceGeneralCliente)) {
				componentTab=this.balancegeneralclienteJInternalFrame.jButtonActualizarBalanceGeneralCliente;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jComboBoxid_clienteBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jComboBoxid_empresaBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldcaja_bancos_disponibleBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jComboBoxid_clienteBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldcaja_bancos_disponibleBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldinventarioBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldcuentas_por_cobrar_clientesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldotros_activos_corrientesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldinventarioBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldtotal_activos_corrientesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldotros_activos_corrientesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldbienes_inmueblesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldtotal_activos_corrientesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldbienes_mueblesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldbienes_inmueblesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldotros_activos_no_corrientesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldbienes_mueblesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldotros_activos_no_corrientesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldventas_mensualesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldtotal_activos_no_corrientesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldcosto_ventas_mensualesBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldventas_mensualesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldutilidad_brutaBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldcosto_ventas_mensualesBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldgastos_operativosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldutilidad_brutaBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldsueldosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldgastos_operativosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldserviciosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldsueldosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldarriendosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldserviciosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldimpuestosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldarriendosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldutilidad_operativaBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldimpuestosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldgastos_familiaresBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldutilidad_operativaBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldexcedente_antes_dividendosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldgastos_familiaresBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFielddividendos_bancos_otrosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldexcedente_antes_dividendosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldexedente_neto_mensualBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFielddividendos_bancos_otrosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFielddeudas_bancariasBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldexedente_neto_mensualBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldcuentas_por_pagarBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFielddeudas_bancariasBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldanticipos_recibosBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldcuentas_por_pagarBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldanticipos_recibosBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldotras_deudas_familiaresBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldotras_cuentas_por_pagarBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldotras_deudas_familiaresBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldtotal_pasivo_corrienteBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFielddeudas_bancarias_largo_plazoBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldotros_pasivos_largo_plazoBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldtotal_pasivoBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldtotal_pasivo_no_corrienteBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextFieldpatrimonioBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldtotal_pasivoBalanceGeneralCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.balancegeneralclienteJInternalFrame.jTextAreadescripcionBalanceGeneralCliente)) {
			componentTab=this.balancegeneralclienteJInternalFrame.jTextFieldpatrimonioBalanceGeneralCliente;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.balancegeneralclienteJInternalFrame.getjButtonActualizarToolBarBalanceGeneralCliente();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.balancegeneralclienteJInternalFrame.getjButtonActualizarToolBarBalanceGeneralCliente();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.balancegeneralclienteJInternalFrame.getjButtonCancelarToolBarBalanceGeneralCliente();
			
			
			return componentTab;		
		}
		
		public BalanceGeneralClienteDetalleFormJInternalFrame getbalancegeneralclienteJInternalFrame() {
			return this.balancegeneralclienteJInternalFrame;
		}
		
		public void setbalancegeneralclienteJInternalFrame(BalanceGeneralClienteDetalleFormJInternalFrame balancegeneralclienteJInternalFrame) {
			this.balancegeneralclienteJInternalFrame=balancegeneralclienteJInternalFrame;
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
