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

import com.bydan.erp.importaciones.util.LiquidacionImpuestoImporConstantesFunciones;
import com.bydan.erp.importaciones.util.LiquidacionImpuestoImporParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.LiquidacionImpuestoImporParameterGeneral;

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

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.LiquidacionImpuestoImporBeanSwingJInternalFrame;
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
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.LiquidacionImpuestoImporJInternalFrame;

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.LiquidacionImpuestoImporDetalleFormJInternalFrame;

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
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class LiquidacionImpuestoImporModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_ID
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF
										,LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL
										};
	   
	    public List<LiquidacionImpuestoImpor> liquidacionimpuestoimpors;
	  	 
	    //NO SE UTILIZA
	    public LiquidacionImpuestoImporModel(List<LiquidacionImpuestoImpor> liquidacionimpuestoimpors,JInternalFrameBase jInternalFrameBase) {
	    	this.liquidacionimpuestoimpors=liquidacionimpuestoimpors;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public LiquidacionImpuestoImporModel(JInternalFrameBase jInternalFrameBase) {
	    	this.liquidacionimpuestoimpors=new ArrayList<LiquidacionImpuestoImpor>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.liquidacionimpuestoimpors.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.liquidacionimpuestoimpors.get(rowIndex).getIsSelected();
	            
				case 1: return this.liquidacionimpuestoimpors.get(rowIndex).getId();
				case 2: return this.liquidacionimpuestoimpors.get(rowIndex).getid_pedido_compra_impor();
				case 3: return this.liquidacionimpuestoimpors.get(rowIndex).getid_empresa();
				case 4: return this.liquidacionimpuestoimpors.get(rowIndex).getid_sucursal();
				case 5: return this.liquidacionimpuestoimpors.get(rowIndex).getid_cliente();
				case 6: return this.liquidacionimpuestoimpors.get(rowIndex).getid_factura();
				case 7: return this.liquidacionimpuestoimpors.get(rowIndex).getnumero_comprobante();
				case 8: return this.liquidacionimpuestoimpors.get(rowIndex).getnumero_dui();
				case 9: return this.liquidacionimpuestoimpors.get(rowIndex).getfecha();
				case 10: return this.liquidacionimpuestoimpors.get(rowIndex).getfecha_pago();
				case 11: return this.liquidacionimpuestoimpors.get(rowIndex).getfob();
				case 12: return this.liquidacionimpuestoimpors.get(rowIndex).getseguro();
				case 13: return this.liquidacionimpuestoimpors.get(rowIndex).getflete();
				case 14: return this.liquidacionimpuestoimpors.get(rowIndex).getporcentaje_fodi();
				case 15: return this.liquidacionimpuestoimpors.get(rowIndex).getporcentaje_iva();
				case 16: return this.liquidacionimpuestoimpors.get(rowIndex).gettasa_control();
				case 17: return this.liquidacionimpuestoimpors.get(rowIndex).getcfr();
				case 18: return this.liquidacionimpuestoimpors.get(rowIndex).getcif();
				case 19: return this.liquidacionimpuestoimpors.get(rowIndex).gettotal();	            
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
				case 7: return String.class;
				case 8: return String.class;
				case 9: return Date.class;
				case 10: return Date.class;
				case 11: return Double.class;
				case 12: return Double.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	LiquidacionImpuestoImpor liquidacionimpuestoimpor = this.liquidacionimpuestoimpors.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			LiquidacionImpuestoImporBeanSwingJInternalFrame liquidacionimpuestoimporBeanSwingJInternalFrame=(LiquidacionImpuestoImporBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {liquidacionimpuestoimpor.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {liquidacionimpuestoimpor.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {liquidacionimpuestoimpor.setid_pedido_compra_impor((Long) value);liquidacionimpuestoimpor.setpedidocompraimpor_descripcion(liquidacionimpuestoimporBeanSwingJInternalFrame.getActualPedidoCompraImporForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {liquidacionimpuestoimpor.setid_empresa((Long) value);liquidacionimpuestoimpor.setempresa_descripcion(liquidacionimpuestoimporBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {liquidacionimpuestoimpor.setid_sucursal((Long) value);liquidacionimpuestoimpor.setsucursal_descripcion(liquidacionimpuestoimporBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {liquidacionimpuestoimpor.setid_cliente((Long) value);liquidacionimpuestoimpor.setcliente_descripcion(liquidacionimpuestoimporBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {liquidacionimpuestoimpor.setid_factura((Long) value);liquidacionimpuestoimpor.setfactura_descripcion(liquidacionimpuestoimporBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {liquidacionimpuestoimpor.setnumero_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {liquidacionimpuestoimpor.setnumero_dui((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {liquidacionimpuestoimpor.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {liquidacionimpuestoimpor.setfecha_pago((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {liquidacionimpuestoimpor.setfob((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {liquidacionimpuestoimpor.setseguro((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {liquidacionimpuestoimpor.setflete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {liquidacionimpuestoimpor.setporcentaje_fodi((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {liquidacionimpuestoimpor.setporcentaje_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {liquidacionimpuestoimpor.settasa_control((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {liquidacionimpuestoimpor.setcfr((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {liquidacionimpuestoimpor.setcif((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {liquidacionimpuestoimpor.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public LiquidacionImpuestoImporModel(JInternalFrameBase jInternalFrameBase) {
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
		private LiquidacionImpuestoImporDetalleFormJInternalFrame liquidacionimpuestoimporJInternalFrame=null;
		
		public LiquidacionImpuestoImporModel(LiquidacionImpuestoImporDetalleFormJInternalFrame liquidacionimpuestoimporJInternalFrame) {
			this.liquidacionimpuestoimporJInternalFrame=liquidacionimpuestoimporJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.liquidacionimpuestoimporJInternalFrame.getjButtonActualizarToolBarLiquidacionImpuestoImpor();
			
			if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.getjButtonActualizarToolBarLiquidacionImpuestoImpor())) {
				componentTab=this.liquidacionimpuestoimporJInternalFrame.getjButtonEliminarToolBarLiquidacionImpuestoImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.getjButtonEliminarToolBarLiquidacionImpuestoImpor())) {
				componentTab=this.liquidacionimpuestoimporJInternalFrame.getjButtonCancelarToolBarLiquidacionImpuestoImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.getjButtonCancelarToolBarLiquidacionImpuestoImpor())) {
				componentTab=this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldtotalLiquidacionImpuestoImpor)) {
				componentTab=this.liquidacionimpuestoimporJInternalFrame.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor)) {
				componentTab=this.liquidacionimpuestoimporJInternalFrame.jButtonEliminarLiquidacionImpuestoImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jButtonEliminarLiquidacionImpuestoImpor)) {
				componentTab=this.liquidacionimpuestoimporJInternalFrame.jButtonActualizarLiquidacionImpuestoImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jButtonActualizarLiquidacionImpuestoImpor)) {
				componentTab=this.liquidacionimpuestoimporJInternalFrame.jButtonCancelarLiquidacionImpuestoImpor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_empresaLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_empresaLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_sucursalLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_sucursalLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_clienteLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_clienteLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_facturaLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_facturaLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldnumero_comprobanteLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldnumero_comprobanteLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldnumero_duiLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldnumero_duiLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jDateChooserfechaLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jDateChooserfechaLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jDateChooserfecha_pagoLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jDateChooserfecha_pagoLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldfobLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldfobLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldseguroLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldseguroLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldfleteLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldfleteLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldporcentaje_fodiLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldporcentaje_fodiLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldporcentaje_ivaLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldporcentaje_ivaLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldtasa_controlLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldtasa_controlLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldcfrLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldcfrLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldcifLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldcifLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldtotalLiquidacionImpuestoImpor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.liquidacionimpuestoimporJInternalFrame.getjButtonActualizarToolBarLiquidacionImpuestoImpor();
			
			if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.getjButtonEliminarToolBarLiquidacionImpuestoImpor())) {
				componentTab=this.liquidacionimpuestoimporJInternalFrame.getjButtonActualizarToolBarLiquidacionImpuestoImpor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.getjButtonCancelarToolBarLiquidacionImpuestoImpor())) {
				componentTab=this.liquidacionimpuestoimporJInternalFrame.getjButtonEliminarToolBarLiquidacionImpuestoImpor();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor)) {
				
				componentTab=this.liquidacionimpuestoimporJInternalFrame.getjButtonCancelarToolBarLiquidacionImpuestoImpor();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor)) {
				componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldtotalLiquidacionImpuestoImpor;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jButtonEliminarLiquidacionImpuestoImpor)) {
				componentTab=this.liquidacionimpuestoimporJInternalFrame.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jButtonActualizarLiquidacionImpuestoImpor)) {
				componentTab=this.liquidacionimpuestoimporJInternalFrame.jButtonEliminarLiquidacionImpuestoImpor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jButtonCancelarLiquidacionImpuestoImpor)) {
				componentTab=this.liquidacionimpuestoimporJInternalFrame.jButtonActualizarLiquidacionImpuestoImpor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_empresaLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_sucursalLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_empresaLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_clienteLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_sucursalLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_facturaLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_clienteLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldnumero_comprobanteLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jComboBoxid_facturaLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldnumero_duiLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldnumero_comprobanteLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jDateChooserfechaLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldnumero_duiLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jDateChooserfecha_pagoLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jDateChooserfechaLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldfobLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jDateChooserfecha_pagoLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldseguroLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldfobLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldfleteLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldseguroLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldporcentaje_fodiLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldfleteLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldporcentaje_ivaLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldporcentaje_fodiLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldtasa_controlLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldporcentaje_ivaLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldcfrLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldtasa_controlLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldcifLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldcfrLiquidacionImpuestoImpor;
			return componentTab;
		}

		if(component!=null && component.equals(this.liquidacionimpuestoimporJInternalFrame.jTextFieldtotalLiquidacionImpuestoImpor)) {
			componentTab=this.liquidacionimpuestoimporJInternalFrame.jTextFieldcifLiquidacionImpuestoImpor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.liquidacionimpuestoimporJInternalFrame.getjButtonActualizarToolBarLiquidacionImpuestoImpor();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.liquidacionimpuestoimporJInternalFrame.getjButtonActualizarToolBarLiquidacionImpuestoImpor();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.liquidacionimpuestoimporJInternalFrame.getjButtonCancelarToolBarLiquidacionImpuestoImpor();
			
			
			return componentTab;		
		}
		
		public LiquidacionImpuestoImporDetalleFormJInternalFrame getliquidacionimpuestoimporJInternalFrame() {
			return this.liquidacionimpuestoimporJInternalFrame;
		}
		
		public void setliquidacionimpuestoimporJInternalFrame(LiquidacionImpuestoImporDetalleFormJInternalFrame liquidacionimpuestoimporJInternalFrame) {
			this.liquidacionimpuestoimporJInternalFrame=liquidacionimpuestoimporJInternalFrame;
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
