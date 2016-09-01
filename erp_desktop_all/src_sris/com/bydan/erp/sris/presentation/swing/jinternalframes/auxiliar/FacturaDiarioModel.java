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
package com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.sris.util.FacturaDiarioConstantesFunciones;
import com.bydan.erp.sris.util.FacturaDiarioParameterReturnGeneral;
//import com.bydan.erp.sris.util.FacturaDiarioParameterGeneral;

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

import com.bydan.erp.sris.presentation.swing.jinternalframes.FacturaDiarioBeanSwingJInternalFrame;
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
import com.bydan.erp.sris.resources.reportes.AuxiliarReportes;


import com.bydan.erp.sris.util.*;
import com.bydan.erp.sris.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.sris.presentation.swing.jinternalframes.FacturaDiarioJInternalFrame;

import com.bydan.erp.sris.presentation.swing.jinternalframes.FacturaDiarioDetalleFormJInternalFrame;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class FacturaDiarioModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,FacturaDiarioConstantesFunciones.LABEL_ID
										,FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA
										,FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL
										,FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE
										,FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA
										,FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA
										,FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION
										,FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO
										,FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE
										,FacturaDiarioConstantesFunciones.LABEL_RUC
										,FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA
										,FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION
										,FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA
										,FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE
										,FacturaDiarioConstantesFunciones.LABEL_MONTOIVA
										,FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA
										};
	   
	    public List<FacturaDiario> facturadiarios;
	  	 
	    //NO SE UTILIZA
	    public FacturaDiarioModel(List<FacturaDiario> facturadiarios,JInternalFrameBase jInternalFrameBase) {
	    	this.facturadiarios=facturadiarios;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public FacturaDiarioModel(JInternalFrameBase jInternalFrameBase) {
	    	this.facturadiarios=new ArrayList<FacturaDiario>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.facturadiarios.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.facturadiarios.get(rowIndex).getIsSelected();
	            
				case 1: return this.facturadiarios.get(rowIndex).getId();
				case 2: return this.facturadiarios.get(rowIndex).getid_empresa();
				case 3: return this.facturadiarios.get(rowIndex).getid_sucursal();
				case 4: return this.facturadiarios.get(rowIndex).getid_cliente();
				case 5: return this.facturadiarios.get(rowIndex).getid_periodo_declara();
				case 6: return this.facturadiarios.get(rowIndex).getid_tipo_iva();
				case 7: return this.facturadiarios.get(rowIndex).getfecha_emision();
				case 8: return this.facturadiarios.get(rowIndex).getfecha_vencimiento();
				case 9: return this.facturadiarios.get(rowIndex).getnumero_serie();
				case 10: return this.facturadiarios.get(rowIndex).getruc();
				case 11: return this.facturadiarios.get(rowIndex).getnumero_autoriza();
				case 12: return this.facturadiarios.get(rowIndex).getes_devolucion();
				case 13: return this.facturadiarios.get(rowIndex).getvalor_factura();
				case 14: return this.facturadiarios.get(rowIndex).getbase_imponible();
				case 15: return this.facturadiarios.get(rowIndex).getmonto_iva();
				case 16: return this.facturadiarios.get(rowIndex).getbim_tarjeta();	            
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
				case 7: return Date.class;
				case 8: return Date.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return Boolean.class;
				case 13: return Double.class;
				case 14: return Double.class;
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
	    	FacturaDiario facturadiario = this.facturadiarios.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			FacturaDiarioBeanSwingJInternalFrame facturadiarioBeanSwingJInternalFrame=(FacturaDiarioBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {facturadiario.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {facturadiario.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {facturadiario.setid_empresa((Long) value);facturadiario.setempresa_descripcion(facturadiarioBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {facturadiario.setid_sucursal((Long) value);facturadiario.setsucursal_descripcion(facturadiarioBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {facturadiario.setid_cliente((Long) value);facturadiario.setcliente_descripcion(facturadiarioBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {facturadiario.setid_periodo_declara((Long) value);facturadiario.setperiododeclara_descripcion(facturadiarioBeanSwingJInternalFrame.getActualPeriodoDeclaraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {facturadiario.setid_tipo_iva((Long) value);facturadiario.settipoiva_descripcion(facturadiarioBeanSwingJInternalFrame.getActualTipoIvaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {facturadiario.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {facturadiario.setfecha_vencimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {facturadiario.setnumero_serie((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {facturadiario.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {facturadiario.setnumero_autoriza((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {facturadiario.setes_devolucion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {facturadiario.setvalor_factura((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {facturadiario.setbase_imponible((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {facturadiario.setmonto_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {facturadiario.setbim_tarjeta((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public FacturaDiarioModel(JInternalFrameBase jInternalFrameBase) {
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
		private FacturaDiarioDetalleFormJInternalFrame facturadiarioJInternalFrame=null;
		
		public FacturaDiarioModel(FacturaDiarioDetalleFormJInternalFrame facturadiarioJInternalFrame) {
			this.facturadiarioJInternalFrame=facturadiarioJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.facturadiarioJInternalFrame.getjButtonActualizarToolBarFacturaDiario();
			
			if(component!=null && component.equals(this.facturadiarioJInternalFrame.getjButtonActualizarToolBarFacturaDiario())) {
				componentTab=this.facturadiarioJInternalFrame.getjButtonEliminarToolBarFacturaDiario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturadiarioJInternalFrame.getjButtonEliminarToolBarFacturaDiario())) {
				componentTab=this.facturadiarioJInternalFrame.getjButtonCancelarToolBarFacturaDiario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturadiarioJInternalFrame.getjButtonCancelarToolBarFacturaDiario())) {
				componentTab=this.facturadiarioJInternalFrame.jComboBoxid_empresaFacturaDiario;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.facturadiarioJInternalFrame.jTextFieldbim_tarjetaFacturaDiario)) {
				componentTab=this.facturadiarioJInternalFrame.jComboBoxTiposAccionesFormularioFacturaDiario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturadiarioJInternalFrame.jComboBoxTiposAccionesFormularioFacturaDiario)) {
				componentTab=this.facturadiarioJInternalFrame.jButtonEliminarFacturaDiario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturadiarioJInternalFrame.jButtonEliminarFacturaDiario)) {
				componentTab=this.facturadiarioJInternalFrame.jButtonActualizarFacturaDiario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturadiarioJInternalFrame.jButtonActualizarFacturaDiario)) {
				componentTab=this.facturadiarioJInternalFrame.jButtonCancelarFacturaDiario;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jComboBoxid_empresaFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jComboBoxid_sucursalFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jComboBoxid_sucursalFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jComboBoxid_clienteFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jComboBoxid_clienteFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jComboBoxid_periodo_declaraFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jComboBoxid_periodo_declaraFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jComboBoxid_tipo_ivaFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jComboBoxid_tipo_ivaFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jDateChooserfecha_emisionFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jDateChooserfecha_emisionFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jDateChooserfecha_vencimientoFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jDateChooserfecha_vencimientoFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jTextFieldnumero_serieFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jTextFieldnumero_serieFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jTextFieldrucFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jTextFieldrucFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jTextFieldnumero_autorizaFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jTextFieldnumero_autorizaFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jCheckBoxes_devolucionFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jCheckBoxes_devolucionFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jTextFieldvalor_facturaFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jTextFieldvalor_facturaFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jTextFieldbase_imponibleFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jTextFieldbase_imponibleFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jTextFieldmonto_ivaFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jTextFieldmonto_ivaFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jTextFieldbim_tarjetaFacturaDiario;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.facturadiarioJInternalFrame.getjButtonActualizarToolBarFacturaDiario();
			
			if(component!=null && component.equals(this.facturadiarioJInternalFrame.getjButtonEliminarToolBarFacturaDiario())) {
				componentTab=this.facturadiarioJInternalFrame.getjButtonActualizarToolBarFacturaDiario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturadiarioJInternalFrame.getjButtonCancelarToolBarFacturaDiario())) {
				componentTab=this.facturadiarioJInternalFrame.getjButtonEliminarToolBarFacturaDiario();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturadiarioJInternalFrame.jComboBoxid_empresaFacturaDiario)) {
				
				componentTab=this.facturadiarioJInternalFrame.getjButtonCancelarToolBarFacturaDiario();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturadiarioJInternalFrame.jComboBoxTiposAccionesFormularioFacturaDiario)) {
				componentTab=this.facturadiarioJInternalFrame.jTextFieldbim_tarjetaFacturaDiario;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturadiarioJInternalFrame.jButtonEliminarFacturaDiario)) {
				componentTab=this.facturadiarioJInternalFrame.jComboBoxTiposAccionesFormularioFacturaDiario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturadiarioJInternalFrame.jButtonActualizarFacturaDiario)) {
				componentTab=this.facturadiarioJInternalFrame.jButtonEliminarFacturaDiario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturadiarioJInternalFrame.jButtonCancelarFacturaDiario)) {
				componentTab=this.facturadiarioJInternalFrame.jButtonActualizarFacturaDiario;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jComboBoxid_sucursalFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jComboBoxid_empresaFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jComboBoxid_clienteFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jComboBoxid_sucursalFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jComboBoxid_periodo_declaraFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jComboBoxid_clienteFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jComboBoxid_tipo_ivaFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jComboBoxid_periodo_declaraFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jDateChooserfecha_emisionFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jComboBoxid_tipo_ivaFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jDateChooserfecha_vencimientoFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jDateChooserfecha_emisionFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jTextFieldnumero_serieFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jDateChooserfecha_vencimientoFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jTextFieldrucFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jTextFieldnumero_serieFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jTextFieldnumero_autorizaFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jTextFieldrucFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jCheckBoxes_devolucionFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jTextFieldnumero_autorizaFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jTextFieldvalor_facturaFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jCheckBoxes_devolucionFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jTextFieldbase_imponibleFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jTextFieldvalor_facturaFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jTextFieldmonto_ivaFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jTextFieldbase_imponibleFacturaDiario;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturadiarioJInternalFrame.jTextFieldbim_tarjetaFacturaDiario)) {
			componentTab=this.facturadiarioJInternalFrame.jTextFieldmonto_ivaFacturaDiario;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.facturadiarioJInternalFrame.getjButtonActualizarToolBarFacturaDiario();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.facturadiarioJInternalFrame.getjButtonActualizarToolBarFacturaDiario();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.facturadiarioJInternalFrame.getjButtonCancelarToolBarFacturaDiario();
			
			
			return componentTab;		
		}
		
		public FacturaDiarioDetalleFormJInternalFrame getfacturadiarioJInternalFrame() {
			return this.facturadiarioJInternalFrame;
		}
		
		public void setfacturadiarioJInternalFrame(FacturaDiarioDetalleFormJInternalFrame facturadiarioJInternalFrame) {
			this.facturadiarioJInternalFrame=facturadiarioJInternalFrame;
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
