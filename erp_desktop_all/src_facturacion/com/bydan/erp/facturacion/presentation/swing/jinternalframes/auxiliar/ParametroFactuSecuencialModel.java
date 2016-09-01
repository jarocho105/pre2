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

import com.bydan.erp.facturacion.util.ParametroFactuSecuencialConstantesFunciones;
import com.bydan.erp.facturacion.util.ParametroFactuSecuencialParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.ParametroFactuSecuencialParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ParametroFactuSecuencialBeanSwingJInternalFrame;
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
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ParametroFactuSecuencialJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ParametroFactuSecuencialDetalleFormJInternalFrame;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ParametroFactuSecuencialModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ParametroFactuSecuencialConstantesFunciones.LABEL_ID
										,ParametroFactuSecuencialConstantesFunciones.LABEL_IDEMPRESA
										,ParametroFactuSecuencialConstantesFunciones.LABEL_IDSUCURSAL
										,ParametroFactuSecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL
										,ParametroFactuSecuencialConstantesFunciones.LABEL_SECUENCIAL
										,ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODIGITOS
										,ParametroFactuSecuencialConstantesFunciones.LABEL_NUMEROITEMS
										,ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODESCUENTO
										,ParametroFactuSecuencialConstantesFunciones.LABEL_NUMEROADIICIONALES
										,ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODIGITOINICIO
										,ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODIGITOFIN
										,ParametroFactuSecuencialConstantesFunciones.LABEL_NUMERODIASPLAZO
										,ParametroFactuSecuencialConstantesFunciones.LABEL_CONDETALLE
										,ParametroFactuSecuencialConstantesFunciones.LABEL_CONLECTOR
										,ParametroFactuSecuencialConstantesFunciones.LABEL_IDBODEGA
										,ParametroFactuSecuencialConstantesFunciones.LABEL_IDTIPOPARAMFACTUPLAZO
										,ParametroFactuSecuencialConstantesFunciones.LABEL_IDFORMATO
										,ParametroFactuSecuencialConstantesFunciones.LABEL_CONTRANSFERENCIA
										,ParametroFactuSecuencialConstantesFunciones.LABEL_IDBODEGATRANSFERENCIA
										,ParametroFactuSecuencialConstantesFunciones.LABEL_IDTRANSACCIONTRANSFERENCIA
										};
	   
	    public List<ParametroFactuSecuencial> parametrofactusecuencials;
	  	 
	    //NO SE UTILIZA
	    public ParametroFactuSecuencialModel(List<ParametroFactuSecuencial> parametrofactusecuencials,JInternalFrameBase jInternalFrameBase) {
	    	this.parametrofactusecuencials=parametrofactusecuencials;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ParametroFactuSecuencialModel(JInternalFrameBase jInternalFrameBase) {
	    	this.parametrofactusecuencials=new ArrayList<ParametroFactuSecuencial>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.parametrofactusecuencials.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.parametrofactusecuencials.get(rowIndex).getIsSelected();
	            
				case 1: return this.parametrofactusecuencials.get(rowIndex).getId();
				case 2: return this.parametrofactusecuencials.get(rowIndex).getid_empresa();
				case 3: return this.parametrofactusecuencials.get(rowIndex).getid_sucursal();
				case 4: return this.parametrofactusecuencials.get(rowIndex).getid_tipo_documento_general();
				case 5: return this.parametrofactusecuencials.get(rowIndex).getsecuencial();
				case 6: return this.parametrofactusecuencials.get(rowIndex).getnumero_digitos();
				case 7: return this.parametrofactusecuencials.get(rowIndex).getnumero_items();
				case 8: return this.parametrofactusecuencials.get(rowIndex).getnumero_descuento();
				case 9: return this.parametrofactusecuencials.get(rowIndex).getnumero_adiicionales();
				case 10: return this.parametrofactusecuencials.get(rowIndex).getnumero_digito_inicio();
				case 11: return this.parametrofactusecuencials.get(rowIndex).getnumero_digito_fin();
				case 12: return this.parametrofactusecuencials.get(rowIndex).getnumero_dias_plazo();
				case 13: return this.parametrofactusecuencials.get(rowIndex).getcon_detalle();
				case 14: return this.parametrofactusecuencials.get(rowIndex).getcon_lector();
				case 15: return this.parametrofactusecuencials.get(rowIndex).getid_bodega();
				case 16: return this.parametrofactusecuencials.get(rowIndex).getid_tipo_param_factu_plazo();
				case 17: return this.parametrofactusecuencials.get(rowIndex).getid_formato();
				case 18: return this.parametrofactusecuencials.get(rowIndex).getcon_transferencia();
				case 19: return this.parametrofactusecuencials.get(rowIndex).getid_bodega_transferencia();
				case 20: return this.parametrofactusecuencials.get(rowIndex).getid_transaccion_transferencia();	            
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
				case 6: return Integer.class;
				case 7: return Integer.class;
				case 8: return Integer.class;
				case 9: return Integer.class;
				case 10: return Integer.class;
				case 11: return Integer.class;
				case 12: return Integer.class;
				case 13: return Boolean.class;
				case 14: return Boolean.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Boolean.class;
				case 19: return Long.class;
				case 20: return Long.class;	            
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
	    	ParametroFactuSecuencial parametrofactusecuencial = this.parametrofactusecuencials.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ParametroFactuSecuencialBeanSwingJInternalFrame parametrofactusecuencialBeanSwingJInternalFrame=(ParametroFactuSecuencialBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {parametrofactusecuencial.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {parametrofactusecuencial.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {parametrofactusecuencial.setid_empresa((Long) value);parametrofactusecuencial.setempresa_descripcion(parametrofactusecuencialBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {parametrofactusecuencial.setid_sucursal((Long) value);parametrofactusecuencial.setsucursal_descripcion(parametrofactusecuencialBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {parametrofactusecuencial.setid_tipo_documento_general((Long) value);parametrofactusecuencial.settipodocumentogeneral_descripcion(parametrofactusecuencialBeanSwingJInternalFrame.getActualTipoDocumentoGeneralForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {parametrofactusecuencial.setsecuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {parametrofactusecuencial.setnumero_digitos((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {parametrofactusecuencial.setnumero_items((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {parametrofactusecuencial.setnumero_descuento((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {parametrofactusecuencial.setnumero_adiicionales((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {parametrofactusecuencial.setnumero_digito_inicio((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {parametrofactusecuencial.setnumero_digito_fin((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {parametrofactusecuencial.setnumero_dias_plazo((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {parametrofactusecuencial.setcon_detalle((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {parametrofactusecuencial.setcon_lector((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {parametrofactusecuencial.setid_bodega((Long) value);parametrofactusecuencial.setbodega_descripcion(parametrofactusecuencialBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {parametrofactusecuencial.setid_tipo_param_factu_plazo((Long) value);parametrofactusecuencial.settipoparamfactuplazo_descripcion(parametrofactusecuencialBeanSwingJInternalFrame.getActualTipoParamFactuPlazoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {parametrofactusecuencial.setid_formato((Long) value);parametrofactusecuencial.setformato_descripcion(parametrofactusecuencialBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {parametrofactusecuencial.setcon_transferencia((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {parametrofactusecuencial.setid_bodega_transferencia((Long) value);parametrofactusecuencial.setbodegatransferencia_descripcion(parametrofactusecuencialBeanSwingJInternalFrame.getActualBodegaTransferenciaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {parametrofactusecuencial.setid_transaccion_transferencia((Long) value);parametrofactusecuencial.settransacciontransferencia_descripcion(parametrofactusecuencialBeanSwingJInternalFrame.getActualTransaccionTransferenciaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private ParametroFactuSecuencialDetalleFormJInternalFrame parametrofactusecuencialJInternalFrame=null;
		
		public ParametroFactuSecuencialModel(ParametroFactuSecuencialDetalleFormJInternalFrame parametrofactusecuencialJInternalFrame) {
			this.parametrofactusecuencialJInternalFrame=parametrofactusecuencialJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrofactusecuencialJInternalFrame.getjButtonActualizarToolBarParametroFactuSecuencial();
			
			if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.getjButtonActualizarToolBarParametroFactuSecuencial())) {
				componentTab=this.parametrofactusecuencialJInternalFrame.getjButtonEliminarToolBarParametroFactuSecuencial();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.getjButtonEliminarToolBarParametroFactuSecuencial())) {
				componentTab=this.parametrofactusecuencialJInternalFrame.getjButtonCancelarToolBarParametroFactuSecuencial();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.getjButtonCancelarToolBarParametroFactuSecuencial())) {
				componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_empresaParametroFactuSecuencial;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_transaccion_transferenciaParametroFactuSecuencial)) {
				componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactuSecuencial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactuSecuencial)) {
				componentTab=this.parametrofactusecuencialJInternalFrame.jButtonEliminarParametroFactuSecuencial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jButtonEliminarParametroFactuSecuencial)) {
				componentTab=this.parametrofactusecuencialJInternalFrame.jButtonActualizarParametroFactuSecuencial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jButtonActualizarParametroFactuSecuencial)) {
				componentTab=this.parametrofactusecuencialJInternalFrame.jButtonCancelarParametroFactuSecuencial;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_empresaParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_sucursalParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_sucursalParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_tipo_documento_generalParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_tipo_documento_generalParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldsecuencialParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldsecuencialParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_digitosParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_digitosParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_itemsParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_itemsParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_descuentoParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_descuentoParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_adiicionalesParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_adiicionalesParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_digito_inicioParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_digito_inicioParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_digito_finParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_digito_finParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_dias_plazoParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_dias_plazoParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jCheckBoxcon_detalleParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jCheckBoxcon_detalleParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jCheckBoxcon_lectorParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jCheckBoxcon_lectorParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_bodegaParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_bodegaParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_formatoParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_formatoParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jCheckBoxcon_transferenciaParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jCheckBoxcon_transferenciaParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_bodega_transferenciaParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_bodega_transferenciaParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_transaccion_transferenciaParametroFactuSecuencial;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrofactusecuencialJInternalFrame.getjButtonActualizarToolBarParametroFactuSecuencial();
			
			if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.getjButtonEliminarToolBarParametroFactuSecuencial())) {
				componentTab=this.parametrofactusecuencialJInternalFrame.getjButtonActualizarToolBarParametroFactuSecuencial();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.getjButtonCancelarToolBarParametroFactuSecuencial())) {
				componentTab=this.parametrofactusecuencialJInternalFrame.getjButtonEliminarToolBarParametroFactuSecuencial();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_empresaParametroFactuSecuencial)) {
				
				componentTab=this.parametrofactusecuencialJInternalFrame.getjButtonCancelarToolBarParametroFactuSecuencial();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactuSecuencial)) {
				componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_transaccion_transferenciaParametroFactuSecuencial;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jButtonEliminarParametroFactuSecuencial)) {
				componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxTiposAccionesFormularioParametroFactuSecuencial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jButtonActualizarParametroFactuSecuencial)) {
				componentTab=this.parametrofactusecuencialJInternalFrame.jButtonEliminarParametroFactuSecuencial;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jButtonCancelarParametroFactuSecuencial)) {
				componentTab=this.parametrofactusecuencialJInternalFrame.jButtonActualizarParametroFactuSecuencial;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_sucursalParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_empresaParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_tipo_documento_generalParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_sucursalParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldsecuencialParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_tipo_documento_generalParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_digitosParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldsecuencialParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_itemsParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_digitosParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_descuentoParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_itemsParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_adiicionalesParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_descuentoParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_digito_inicioParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_adiicionalesParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_digito_finParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_digito_inicioParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_dias_plazoParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_digito_finParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jCheckBoxcon_detalleParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jTextFieldnumero_dias_plazoParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jCheckBoxcon_lectorParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jCheckBoxcon_detalleParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_bodegaParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jCheckBoxcon_lectorParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_bodegaParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_formatoParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_tipo_param_factu_plazoParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jCheckBoxcon_transferenciaParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_formatoParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_bodega_transferenciaParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jCheckBoxcon_transferenciaParametroFactuSecuencial;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrofactusecuencialJInternalFrame.jComboBoxid_transaccion_transferenciaParametroFactuSecuencial)) {
			componentTab=this.parametrofactusecuencialJInternalFrame.jComboBoxid_bodega_transferenciaParametroFactuSecuencial;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrofactusecuencialJInternalFrame.getjButtonActualizarToolBarParametroFactuSecuencial();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrofactusecuencialJInternalFrame.getjButtonActualizarToolBarParametroFactuSecuencial();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrofactusecuencialJInternalFrame.getjButtonCancelarToolBarParametroFactuSecuencial();
			
			
			return componentTab;		
		}
		
		public ParametroFactuSecuencialDetalleFormJInternalFrame getparametrofactusecuencialJInternalFrame() {
			return this.parametrofactusecuencialJInternalFrame;
		}
		
		public void setparametrofactusecuencialJInternalFrame(ParametroFactuSecuencialDetalleFormJInternalFrame parametrofactusecuencialJInternalFrame) {
			this.parametrofactusecuencialJInternalFrame=parametrofactusecuencialJInternalFrame;
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
