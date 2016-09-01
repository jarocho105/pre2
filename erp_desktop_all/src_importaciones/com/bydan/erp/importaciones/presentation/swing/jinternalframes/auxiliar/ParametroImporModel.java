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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.importaciones.util.ParametroImporConstantesFunciones;
import com.bydan.erp.importaciones.util.ParametroImporParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.ParametroImporParameterGeneral;

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

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.ParametroImporBeanSwingJInternalFrame;
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
import com.bydan.erp.importaciones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.importaciones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
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


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.ParametroImporJInternalFrame;

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.ParametroImporDetalleFormJInternalFrame;

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

public class ParametroImporModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ParametroImporConstantesFunciones.LABEL_ID
										,ParametroImporConstantesFunciones.LABEL_IDEMPRESA
										,ParametroImporConstantesFunciones.LABEL_IDPAIS
										,ParametroImporConstantesFunciones.LABEL_IDBODEGA
										,ParametroImporConstantesFunciones.LABEL_IDCENTROCOSTO
										,ParametroImporConstantesFunciones.LABEL_IDCUENTACONTABLE
										,ParametroImporConstantesFunciones.LABEL_IDTRANSACCIONORDENCOMPRA
										,ParametroImporConstantesFunciones.LABEL_IDTRANSACCIONINGRESO
										,ParametroImporConstantesFunciones.LABEL_IDFORMATOORDENCOMPRA
										,ParametroImporConstantesFunciones.LABEL_IDFORMATOINGRESO
										,ParametroImporConstantesFunciones.LABEL_IDFORMATOPEDIDO
										,ParametroImporConstantesFunciones.LABEL_IDFORMATOLIQUIDACION
										,ParametroImporConstantesFunciones.LABEL_DIASLLEGABODEGA
										,ParametroImporConstantesFunciones.LABEL_PORCENTAJESEGURO
										,ParametroImporConstantesFunciones.LABEL_FODIN
										,ParametroImporConstantesFunciones.LABEL_CORPEI
										,ParametroImporConstantesFunciones.LABEL_CONSECUENCIAL
										,ParametroImporConstantesFunciones.LABEL_SECUENCIAL
										,ParametroImporConstantesFunciones.LABEL_CONPESOPRECIO
										,ParametroImporConstantesFunciones.LABEL_CONLOTE
										,ParametroImporConstantesFunciones.LABEL_CONUNIDAD
										,ParametroImporConstantesFunciones.LABEL_CONCONVERSION
										};
	   
	    public List<ParametroImpor> parametroimpors;
	  	 
	    //NO SE UTILIZA
	    public ParametroImporModel(List<ParametroImpor> parametroimpors,JInternalFrameBase jInternalFrameBase) {
	    	this.parametroimpors=parametroimpors;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ParametroImporModel(JInternalFrameBase jInternalFrameBase) {
	    	this.parametroimpors=new ArrayList<ParametroImpor>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.parametroimpors.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.parametroimpors.get(rowIndex).getIsSelected();
	            
				case 1: return this.parametroimpors.get(rowIndex).getId();
				case 2: return this.parametroimpors.get(rowIndex).getid_empresa();
				case 3: return this.parametroimpors.get(rowIndex).getid_pais();
				case 4: return this.parametroimpors.get(rowIndex).getid_bodega();
				case 5: return this.parametroimpors.get(rowIndex).getid_centro_costo();
				case 6: return this.parametroimpors.get(rowIndex).getid_cuenta_contable();
				case 7: return this.parametroimpors.get(rowIndex).getid_transaccion_orden_compra();
				case 8: return this.parametroimpors.get(rowIndex).getid_transaccion_ingreso();
				case 9: return this.parametroimpors.get(rowIndex).getid_formato_orden_compra();
				case 10: return this.parametroimpors.get(rowIndex).getid_formato_ingreso();
				case 11: return this.parametroimpors.get(rowIndex).getid_formato_pedido();
				case 12: return this.parametroimpors.get(rowIndex).getid_formato_liquidacion();
				case 13: return this.parametroimpors.get(rowIndex).getdias_llega_bodega();
				case 14: return this.parametroimpors.get(rowIndex).getporcentaje_seguro();
				case 15: return this.parametroimpors.get(rowIndex).getfodin();
				case 16: return this.parametroimpors.get(rowIndex).getcorpei();
				case 17: return this.parametroimpors.get(rowIndex).getcon_secuencial();
				case 18: return this.parametroimpors.get(rowIndex).getsecuencial();
				case 19: return this.parametroimpors.get(rowIndex).getcon_peso_precio();
				case 20: return this.parametroimpors.get(rowIndex).getcon_lote();
				case 21: return this.parametroimpors.get(rowIndex).getcon_unidad();
				case 22: return this.parametroimpors.get(rowIndex).getcon_conversion();	            
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
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return Long.class;
				case 13: return Integer.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return Boolean.class;
				case 18: return String.class;
				case 19: return Boolean.class;
				case 20: return Boolean.class;
				case 21: return Boolean.class;
				case 22: return Boolean.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ParametroImpor parametroimpor = this.parametroimpors.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ParametroImporBeanSwingJInternalFrame parametroimporBeanSwingJInternalFrame=(ParametroImporBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {parametroimpor.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {parametroimpor.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {parametroimpor.setid_empresa((Long) value);parametroimpor.setempresa_descripcion(parametroimporBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {parametroimpor.setid_pais((Long) value);parametroimpor.setpais_descripcion(parametroimporBeanSwingJInternalFrame.getActualPaisForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {parametroimpor.setid_bodega((Long) value);parametroimpor.setbodega_descripcion(parametroimporBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {parametroimpor.setid_centro_costo((Long) value);parametroimpor.setcentrocosto_descripcion(parametroimporBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {parametroimpor.setid_cuenta_contable((Long) value);parametroimpor.setcuentacontable_descripcion(parametroimporBeanSwingJInternalFrame.getActualCuentaContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {parametroimpor.setid_transaccion_orden_compra((Long) value);parametroimpor.settransaccionordencompra_descripcion(parametroimporBeanSwingJInternalFrame.getActualTransaccionOrdenCompraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {parametroimpor.setid_transaccion_ingreso((Long) value);parametroimpor.settransaccioningreso_descripcion(parametroimporBeanSwingJInternalFrame.getActualTransaccionIngresoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {parametroimpor.setid_formato_orden_compra((Long) value);parametroimpor.setformatoordencompra_descripcion(parametroimporBeanSwingJInternalFrame.getActualFormatoOrdenCompraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {parametroimpor.setid_formato_ingreso((Long) value);parametroimpor.setformatoingreso_descripcion(parametroimporBeanSwingJInternalFrame.getActualFormatoIngresoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {parametroimpor.setid_formato_pedido((Long) value);parametroimpor.setformatopedido_descripcion(parametroimporBeanSwingJInternalFrame.getActualFormatoPedidoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {parametroimpor.setid_formato_liquidacion((Long) value);parametroimpor.setformatoliquidacion_descripcion(parametroimporBeanSwingJInternalFrame.getActualFormatoLiquidacionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {parametroimpor.setdias_llega_bodega((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {parametroimpor.setporcentaje_seguro((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {parametroimpor.setfodin((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {parametroimpor.setcorpei((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {parametroimpor.setcon_secuencial((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {parametroimpor.setsecuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {parametroimpor.setcon_peso_precio((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {parametroimpor.setcon_lote((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {parametroimpor.setcon_unidad((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {parametroimpor.setcon_conversion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ParametroImporModel(JInternalFrameBase jInternalFrameBase) {
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
		private ParametroImporDetalleFormJInternalFrame parametroimporJInternalFrame=null;
		
		public ParametroImporModel(ParametroImporDetalleFormJInternalFrame parametroimporJInternalFrame) {
			this.parametroimporJInternalFrame=parametroimporJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametroimporJInternalFrame.getjButtonActualizarToolBarParametroImpor();
			
			if(component!=null && component.equals(this.parametroimporJInternalFrame.getjButtonActualizarToolBarParametroImpor())) {
				componentTab=this.parametroimporJInternalFrame.getjButtonEliminarToolBarParametroImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametroimporJInternalFrame.getjButtonEliminarToolBarParametroImpor())) {
				componentTab=this.parametroimporJInternalFrame.getjButtonCancelarToolBarParametroImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametroimporJInternalFrame.getjButtonCancelarToolBarParametroImpor())) {
				componentTab=this.parametroimporJInternalFrame.jComboBoxid_empresaParametroImpor;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.parametroimporJInternalFrame.jCheckBoxcon_conversionParametroImpor)) {
				componentTab=this.parametroimporJInternalFrame.jComboBoxTiposAccionesFormularioParametroImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxTiposAccionesFormularioParametroImpor)) {
				componentTab=this.parametroimporJInternalFrame.jButtonEliminarParametroImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametroimporJInternalFrame.jButtonEliminarParametroImpor)) {
				componentTab=this.parametroimporJInternalFrame.jButtonActualizarParametroImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametroimporJInternalFrame.jButtonActualizarParametroImpor)) {
				componentTab=this.parametroimporJInternalFrame.jButtonCancelarParametroImpor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_empresaParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_paisParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_paisParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_bodegaParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_bodegaParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_centro_costoParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_centro_costoParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_cuenta_contableParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_cuenta_contableParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_transaccion_orden_compraParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_transaccion_orden_compraParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_transaccion_ingresoParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_transaccion_ingresoParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_formato_orden_compraParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_formato_orden_compraParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_formato_ingresoParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_formato_ingresoParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_formato_pedidoParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_formato_pedidoParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_formato_liquidacionParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_formato_liquidacionParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jTextFielddias_llega_bodegaParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jTextFielddias_llega_bodegaParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jTextFieldporcentaje_seguroParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jTextFieldporcentaje_seguroParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jTextFieldfodinParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jTextFieldfodinParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jTextFieldcorpeiParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jTextFieldcorpeiParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jCheckBoxcon_secuencialParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jCheckBoxcon_secuencialParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jTextFieldsecuencialParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jTextFieldsecuencialParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jCheckBoxcon_peso_precioParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jCheckBoxcon_peso_precioParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jCheckBoxcon_loteParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jCheckBoxcon_loteParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jCheckBoxcon_unidadParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jCheckBoxcon_unidadParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jCheckBoxcon_conversionParametroImpor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametroimporJInternalFrame.getjButtonActualizarToolBarParametroImpor();
			
			if(component!=null && component.equals(this.parametroimporJInternalFrame.getjButtonEliminarToolBarParametroImpor())) {
				componentTab=this.parametroimporJInternalFrame.getjButtonActualizarToolBarParametroImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametroimporJInternalFrame.getjButtonCancelarToolBarParametroImpor())) {
				componentTab=this.parametroimporJInternalFrame.getjButtonEliminarToolBarParametroImpor();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_empresaParametroImpor)) {
				
				componentTab=this.parametroimporJInternalFrame.getjButtonCancelarToolBarParametroImpor();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxTiposAccionesFormularioParametroImpor)) {
				componentTab=this.parametroimporJInternalFrame.jCheckBoxcon_conversionParametroImpor;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametroimporJInternalFrame.jButtonEliminarParametroImpor)) {
				componentTab=this.parametroimporJInternalFrame.jComboBoxTiposAccionesFormularioParametroImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametroimporJInternalFrame.jButtonActualizarParametroImpor)) {
				componentTab=this.parametroimporJInternalFrame.jButtonEliminarParametroImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametroimporJInternalFrame.jButtonCancelarParametroImpor)) {
				componentTab=this.parametroimporJInternalFrame.jButtonActualizarParametroImpor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_paisParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_empresaParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_bodegaParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_paisParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_centro_costoParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_bodegaParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_cuenta_contableParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_centro_costoParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_transaccion_orden_compraParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_cuenta_contableParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_transaccion_ingresoParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_transaccion_orden_compraParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_formato_orden_compraParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_transaccion_ingresoParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_formato_ingresoParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_formato_orden_compraParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_formato_pedidoParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_formato_ingresoParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jComboBoxid_formato_liquidacionParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_formato_pedidoParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jTextFielddias_llega_bodegaParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jComboBoxid_formato_liquidacionParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jTextFieldporcentaje_seguroParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jTextFielddias_llega_bodegaParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jTextFieldfodinParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jTextFieldporcentaje_seguroParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jTextFieldcorpeiParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jTextFieldfodinParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jCheckBoxcon_secuencialParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jTextFieldcorpeiParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jTextFieldsecuencialParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jCheckBoxcon_secuencialParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jCheckBoxcon_peso_precioParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jTextFieldsecuencialParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jCheckBoxcon_loteParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jCheckBoxcon_peso_precioParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jCheckBoxcon_unidadParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jCheckBoxcon_loteParametroImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametroimporJInternalFrame.jCheckBoxcon_conversionParametroImpor)) {
			componentTab=this.parametroimporJInternalFrame.jCheckBoxcon_unidadParametroImpor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.parametroimporJInternalFrame.getjButtonActualizarToolBarParametroImpor();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.parametroimporJInternalFrame.getjButtonActualizarToolBarParametroImpor();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.parametroimporJInternalFrame.getjButtonCancelarToolBarParametroImpor();
			
			
			return componentTab;		
		}
		
		public ParametroImporDetalleFormJInternalFrame getparametroimporJInternalFrame() {
			return this.parametroimporJInternalFrame;
		}
		
		public void setparametroimporJInternalFrame(ParametroImporDetalleFormJInternalFrame parametroimporJInternalFrame) {
			this.parametroimporJInternalFrame=parametroimporJInternalFrame;
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
