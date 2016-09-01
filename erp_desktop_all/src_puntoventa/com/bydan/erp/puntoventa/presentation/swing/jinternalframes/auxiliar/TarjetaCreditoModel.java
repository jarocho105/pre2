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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.puntoventa.util.TarjetaCreditoConstantesFunciones;
import com.bydan.erp.puntoventa.util.TarjetaCreditoParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.TarjetaCreditoParameterGeneral;

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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.TarjetaCreditoBeanSwingJInternalFrame;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.TarjetaCreditoJInternalFrame;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.TarjetaCreditoDetalleFormJInternalFrame;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class TarjetaCreditoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,TarjetaCreditoConstantesFunciones.LABEL_ID
										,TarjetaCreditoConstantesFunciones.LABEL_IDEMPRESA
										,TarjetaCreditoConstantesFunciones.LABEL_IDSUCURSAL
										,TarjetaCreditoConstantesFunciones.LABEL_IDBANCO
										,TarjetaCreditoConstantesFunciones.LABEL_CODIGO
										,TarjetaCreditoConstantesFunciones.LABEL_NOMBRE
										,TarjetaCreditoConstantesFunciones.LABEL_NOMBRECORTO
										,TarjetaCreditoConstantesFunciones.LABEL_DIGITOVALIDO
										,TarjetaCreditoConstantesFunciones.LABEL_DIGITOTARJETA
										,TarjetaCreditoConstantesFunciones.LABEL_COMISION
										,TarjetaCreditoConstantesFunciones.LABEL_INTERES
										,TarjetaCreditoConstantesFunciones.LABEL_MONTOMINIMO
										,TarjetaCreditoConstantesFunciones.LABEL_PORCENTAJERETENCION
										,TarjetaCreditoConstantesFunciones.LABEL_COMISIONRETENCION
										,TarjetaCreditoConstantesFunciones.LABEL_ESRETENCIONREDONDEO
										,TarjetaCreditoConstantesFunciones.LABEL_ESPAGOBANCOREDONDEO
										,TarjetaCreditoConstantesFunciones.LABEL_ESCOMISIONREDONDEO
										,TarjetaCreditoConstantesFunciones.LABEL_IDTIPORETENCION
										,TarjetaCreditoConstantesFunciones.LABEL_IDCUENTACONTABLE
										,TarjetaCreditoConstantesFunciones.LABEL_IDTIPORETENCIONIVA
										,TarjetaCreditoConstantesFunciones.LABEL_IDCUENTACONTABLECOMISION
										,TarjetaCreditoConstantesFunciones.LABEL_IDFORMULAPAGOBANCO
										,TarjetaCreditoConstantesFunciones.LABEL_IDCUENTACONTABLEDIFERENCIA
										,TarjetaCreditoConstantesFunciones.LABEL_IDFORMULARETENCION
										,TarjetaCreditoConstantesFunciones.LABEL_IDFORMULACOMISION
										};
	   
	    public List<TarjetaCredito> tarjetacreditos;
	  	 
	    //NO SE UTILIZA
	    public TarjetaCreditoModel(List<TarjetaCredito> tarjetacreditos,JInternalFrameBase jInternalFrameBase) {
	    	this.tarjetacreditos=tarjetacreditos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public TarjetaCreditoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.tarjetacreditos=new ArrayList<TarjetaCredito>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.tarjetacreditos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.tarjetacreditos.get(rowIndex).getIsSelected();
	            
				case 1: return this.tarjetacreditos.get(rowIndex).getId();
				case 2: return this.tarjetacreditos.get(rowIndex).getid_empresa();
				case 3: return this.tarjetacreditos.get(rowIndex).getid_sucursal();
				case 4: return this.tarjetacreditos.get(rowIndex).getid_banco();
				case 5: return this.tarjetacreditos.get(rowIndex).getcodigo();
				case 6: return this.tarjetacreditos.get(rowIndex).getnombre();
				case 7: return this.tarjetacreditos.get(rowIndex).getnombre_corto();
				case 8: return this.tarjetacreditos.get(rowIndex).getdigito_valido();
				case 9: return this.tarjetacreditos.get(rowIndex).getdigito_tarjeta();
				case 10: return this.tarjetacreditos.get(rowIndex).getcomision();
				case 11: return this.tarjetacreditos.get(rowIndex).getinteres();
				case 12: return this.tarjetacreditos.get(rowIndex).getmonto_minimo();
				case 13: return this.tarjetacreditos.get(rowIndex).getporcentaje_retencion();
				case 14: return this.tarjetacreditos.get(rowIndex).getcomision_retencion();
				case 15: return this.tarjetacreditos.get(rowIndex).getes_retencion_redondeo();
				case 16: return this.tarjetacreditos.get(rowIndex).getes_pago_banco_redondeo();
				case 17: return this.tarjetacreditos.get(rowIndex).getes_comision_redondeo();
				case 18: return this.tarjetacreditos.get(rowIndex).getid_tipo_retencion();
				case 19: return this.tarjetacreditos.get(rowIndex).getid_cuenta_contable();
				case 20: return this.tarjetacreditos.get(rowIndex).getid_tipo_retencion_iva();
				case 21: return this.tarjetacreditos.get(rowIndex).getid_cuenta_contable_comision();
				case 22: return this.tarjetacreditos.get(rowIndex).getid_formula_pago_banco();
				case 23: return this.tarjetacreditos.get(rowIndex).getid_cuenta_contable_diferencia();
				case 24: return this.tarjetacreditos.get(rowIndex).getid_formula_retencion();
				case 25: return this.tarjetacreditos.get(rowIndex).getid_formula_comision();	            
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
				case 5: return String.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return Integer.class;
				case 9: return Integer.class;
				case 10: return Double.class;
				case 11: return Double.class;
				case 12: return Double.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Boolean.class;
				case 16: return Boolean.class;
				case 17: return Boolean.class;
				case 18: return Long.class;
				case 19: return Long.class;
				case 20: return Long.class;
				case 21: return Long.class;
				case 22: return Long.class;
				case 23: return Long.class;
				case 24: return Long.class;
				case 25: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	TarjetaCredito tarjetacredito = this.tarjetacreditos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame=(TarjetaCreditoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {tarjetacredito.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {tarjetacredito.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {tarjetacredito.setid_empresa((Long) value);tarjetacredito.setempresa_descripcion(tarjetacreditoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {tarjetacredito.setid_sucursal((Long) value);tarjetacredito.setsucursal_descripcion(tarjetacreditoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {tarjetacredito.setid_banco((Long) value);tarjetacredito.setbanco_descripcion(tarjetacreditoBeanSwingJInternalFrame.getActualBancoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {tarjetacredito.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {tarjetacredito.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {tarjetacredito.setnombre_corto((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {tarjetacredito.setdigito_valido((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {tarjetacredito.setdigito_tarjeta((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {tarjetacredito.setcomision((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {tarjetacredito.setinteres((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {tarjetacredito.setmonto_minimo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {tarjetacredito.setporcentaje_retencion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {tarjetacredito.setcomision_retencion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {tarjetacredito.setes_retencion_redondeo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {tarjetacredito.setes_pago_banco_redondeo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {tarjetacredito.setes_comision_redondeo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {tarjetacredito.setid_tipo_retencion((Long) value);tarjetacredito.settiporetencion_descripcion(tarjetacreditoBeanSwingJInternalFrame.getActualTipoRetencionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {tarjetacredito.setid_cuenta_contable((Long) value);tarjetacredito.setcuentacontable_descripcion(tarjetacreditoBeanSwingJInternalFrame.getActualCuentaContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {tarjetacredito.setid_tipo_retencion_iva((Long) value);tarjetacredito.settiporetencioniva_descripcion(tarjetacreditoBeanSwingJInternalFrame.getActualTipoRetencionIvaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {tarjetacredito.setid_cuenta_contable_comision((Long) value);tarjetacredito.setcuentacontablecomision_descripcion(tarjetacreditoBeanSwingJInternalFrame.getActualCuentaContableComisionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {tarjetacredito.setid_formula_pago_banco((Long) value);tarjetacredito.setformulapagobanco_descripcion(tarjetacreditoBeanSwingJInternalFrame.getActualFormulaPagoBancoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {tarjetacredito.setid_cuenta_contable_diferencia((Long) value);tarjetacredito.setcuentacontablediferencia_descripcion(tarjetacreditoBeanSwingJInternalFrame.getActualCuentaContableDiferenciaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {tarjetacredito.setid_formula_retencion((Long) value);tarjetacredito.setformularetencion_descripcion(tarjetacreditoBeanSwingJInternalFrame.getActualFormulaRetencionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {tarjetacredito.setid_formula_comision((Long) value);tarjetacredito.setformulacomision_descripcion(tarjetacreditoBeanSwingJInternalFrame.getActualFormulaComisionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public TarjetaCreditoModel(JInternalFrameBase jInternalFrameBase) {
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
		private TarjetaCreditoDetalleFormJInternalFrame tarjetacreditoJInternalFrame=null;
		
		public TarjetaCreditoModel(TarjetaCreditoDetalleFormJInternalFrame tarjetacreditoJInternalFrame) {
			this.tarjetacreditoJInternalFrame=tarjetacreditoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.tarjetacreditoJInternalFrame.getjButtonActualizarToolBarTarjetaCredito();
			
			if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.getjButtonActualizarToolBarTarjetaCredito())) {
				componentTab=this.tarjetacreditoJInternalFrame.getjButtonEliminarToolBarTarjetaCredito();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.getjButtonEliminarToolBarTarjetaCredito())) {
				componentTab=this.tarjetacreditoJInternalFrame.getjButtonCancelarToolBarTarjetaCredito();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.getjButtonCancelarToolBarTarjetaCredito())) {
				componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_empresaTarjetaCredito;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_formula_comisionTarjetaCredito)) {
				componentTab=this.tarjetacreditoJInternalFrame.jComboBoxTiposAccionesFormularioTarjetaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxTiposAccionesFormularioTarjetaCredito)) {
				componentTab=this.tarjetacreditoJInternalFrame.jButtonEliminarTarjetaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jButtonEliminarTarjetaCredito)) {
				componentTab=this.tarjetacreditoJInternalFrame.jButtonActualizarTarjetaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jButtonActualizarTarjetaCredito)) {
				componentTab=this.tarjetacreditoJInternalFrame.jButtonCancelarTarjetaCredito;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_empresaTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_sucursalTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_sucursalTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_bancoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_bancoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFieldcodigoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFieldcodigoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextAreanombreTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextAreanombreTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFieldnombre_cortoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFieldnombre_cortoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFielddigito_validoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFielddigito_validoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFielddigito_tarjetaTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFielddigito_tarjetaTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFieldcomisionTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFieldcomisionTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFieldinteresTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFieldinteresTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFieldmonto_minimoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFieldmonto_minimoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFieldporcentaje_retencionTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFieldporcentaje_retencionTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFieldcomision_retencionTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFieldcomision_retencionTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jCheckBoxes_retencion_redondeoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jCheckBoxes_retencion_redondeoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jCheckBoxes_pago_banco_redondeoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jCheckBoxes_pago_banco_redondeoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jCheckBoxes_comision_redondeoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jCheckBoxes_comision_redondeoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_tipo_retencionTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_tipo_retencionTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_cuenta_contableTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_cuenta_contableTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_tipo_retencion_ivaTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_tipo_retencion_ivaTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_cuenta_contable_comisionTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_cuenta_contable_comisionTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_formula_pago_bancoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_formula_pago_bancoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_cuenta_contable_diferenciaTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_cuenta_contable_diferenciaTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_formula_retencionTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_formula_retencionTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_formula_comisionTarjetaCredito;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.tarjetacreditoJInternalFrame.getjButtonActualizarToolBarTarjetaCredito();
			
			if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.getjButtonEliminarToolBarTarjetaCredito())) {
				componentTab=this.tarjetacreditoJInternalFrame.getjButtonActualizarToolBarTarjetaCredito();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.getjButtonCancelarToolBarTarjetaCredito())) {
				componentTab=this.tarjetacreditoJInternalFrame.getjButtonEliminarToolBarTarjetaCredito();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_empresaTarjetaCredito)) {
				
				componentTab=this.tarjetacreditoJInternalFrame.getjButtonCancelarToolBarTarjetaCredito();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxTiposAccionesFormularioTarjetaCredito)) {
				componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_formula_comisionTarjetaCredito;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jButtonEliminarTarjetaCredito)) {
				componentTab=this.tarjetacreditoJInternalFrame.jComboBoxTiposAccionesFormularioTarjetaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jButtonActualizarTarjetaCredito)) {
				componentTab=this.tarjetacreditoJInternalFrame.jButtonEliminarTarjetaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jButtonCancelarTarjetaCredito)) {
				componentTab=this.tarjetacreditoJInternalFrame.jButtonActualizarTarjetaCredito;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_sucursalTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_empresaTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_bancoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_sucursalTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFieldcodigoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_bancoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextAreanombreTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFieldcodigoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFieldnombre_cortoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextAreanombreTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFielddigito_validoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFieldnombre_cortoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFielddigito_tarjetaTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFielddigito_validoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFieldcomisionTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFielddigito_tarjetaTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFieldinteresTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFieldcomisionTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFieldmonto_minimoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFieldinteresTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFieldporcentaje_retencionTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFieldmonto_minimoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jTextFieldcomision_retencionTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFieldporcentaje_retencionTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jCheckBoxes_retencion_redondeoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jTextFieldcomision_retencionTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jCheckBoxes_pago_banco_redondeoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jCheckBoxes_retencion_redondeoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jCheckBoxes_comision_redondeoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jCheckBoxes_pago_banco_redondeoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_tipo_retencionTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jCheckBoxes_comision_redondeoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_cuenta_contableTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_tipo_retencionTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_tipo_retencion_ivaTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_cuenta_contableTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_cuenta_contable_comisionTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_tipo_retencion_ivaTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_formula_pago_bancoTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_cuenta_contable_comisionTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_cuenta_contable_diferenciaTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_formula_pago_bancoTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_formula_retencionTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_cuenta_contable_diferenciaTarjetaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.tarjetacreditoJInternalFrame.jComboBoxid_formula_comisionTarjetaCredito)) {
			componentTab=this.tarjetacreditoJInternalFrame.jComboBoxid_formula_retencionTarjetaCredito;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.tarjetacreditoJInternalFrame.getjButtonActualizarToolBarTarjetaCredito();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.tarjetacreditoJInternalFrame.getjButtonActualizarToolBarTarjetaCredito();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.tarjetacreditoJInternalFrame.getjButtonCancelarToolBarTarjetaCredito();
			
			
			return componentTab;		
		}
		
		public TarjetaCreditoDetalleFormJInternalFrame gettarjetacreditoJInternalFrame() {
			return this.tarjetacreditoJInternalFrame;
		}
		
		public void settarjetacreditoJInternalFrame(TarjetaCreditoDetalleFormJInternalFrame tarjetacreditoJInternalFrame) {
			this.tarjetacreditoJInternalFrame=tarjetacreditoJInternalFrame;
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
