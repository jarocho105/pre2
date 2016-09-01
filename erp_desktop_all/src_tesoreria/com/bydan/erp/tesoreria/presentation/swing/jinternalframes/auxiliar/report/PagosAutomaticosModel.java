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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report;




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

//import com.bydan.erp.tesoreria.util.PagosAutomaticosConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.PagosAutomaticosParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.PagosAutomaticosParameterGeneral;

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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.PagosAutomaticosBeanSwingJInternalFrame;
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
import com.bydan.erp.tesoreria.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.tesoreria.util.*;

import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.report.*;
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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.PagosAutomaticosJInternalFrame;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.PagosAutomaticosDetalleFormJInternalFrame;

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

public class PagosAutomaticosModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,PagosAutomaticosConstantesFunciones.LABEL_ID
										,PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE
										,PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA
										,PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION
										,PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO
										,PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO
										,PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR
										,PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO
										,PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA
										,PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO
										,PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION
										,PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE
										,PagosAutomaticosConstantesFunciones.LABEL_ESTADO
										,PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE
										,PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO
										};
	   
	    public List<PagosAutomaticos> pagosautomaticoss;
	  	 
	    //NO SE UTILIZA
	    public PagosAutomaticosModel(List<PagosAutomaticos> pagosautomaticoss,JInternalFrameBase jInternalFrameBase) {
	    	this.pagosautomaticoss=pagosautomaticoss;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public PagosAutomaticosModel(JInternalFrameBase jInternalFrameBase) {
	    	this.pagosautomaticoss=new ArrayList<PagosAutomaticos>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.pagosautomaticoss.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.pagosautomaticoss.get(rowIndex).getIsSelected();
	            
				case 1: return this.pagosautomaticoss.get(rowIndex).getId();
				case 2: return this.pagosautomaticoss.get(rowIndex).getnombre_cliente();
				case 3: return this.pagosautomaticoss.get(rowIndex).getnumero_factura();
				case 4: return this.pagosautomaticoss.get(rowIndex).getfecha_emision();
				case 5: return this.pagosautomaticoss.get(rowIndex).getfecha_vencimiento();
				case 6: return this.pagosautomaticoss.get(rowIndex).getnombre_banco();
				case 7: return this.pagosautomaticoss.get(rowIndex).getvalor_por_pagar();
				case 8: return this.pagosautomaticoss.get(rowIndex).getvalor_cancelado();
				case 9: return this.pagosautomaticoss.get(rowIndex).getnumero_cuenta();
				case 10: return this.pagosautomaticoss.get(rowIndex).getesta_autorizado();
				case 11: return this.pagosautomaticoss.get(rowIndex).getdescripcion();
				case 12: return this.pagosautomaticoss.get(rowIndex).getfecha_corte_dato();
				case 13: return this.pagosautomaticoss.get(rowIndex).getestado();
				case 14: return this.pagosautomaticoss.get(rowIndex).getcodigo_cuenta_con_cliente();
				case 15: return this.pagosautomaticoss.get(rowIndex).getcodigo_cuenta_con_banco();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return String.class;
				case 3: return String.class;
				case 4: return Date.class;
				case 5: return Date.class;
				case 6: return String.class;
				case 7: return Double.class;
				case 8: return Double.class;
				case 9: return String.class;
				case 10: return Boolean.class;
				case 11: return String.class;
				case 12: return Date.class;
				case 13: return String.class;
				case 14: return String.class;
				case 15: return String.class;	            
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
	    	PagosAutomaticos pagosautomaticos = this.pagosautomaticoss.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			PagosAutomaticosBeanSwingJInternalFrame pagosautomaticosBeanSwingJInternalFrame=(PagosAutomaticosBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {pagosautomaticos.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {pagosautomaticos.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {pagosautomaticos.setnombre_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {pagosautomaticos.setnumero_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {pagosautomaticos.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {pagosautomaticos.setfecha_vencimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {pagosautomaticos.setnombre_banco((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {pagosautomaticos.setvalor_por_pagar((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {pagosautomaticos.setvalor_cancelado((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {pagosautomaticos.setnumero_cuenta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {pagosautomaticos.setesta_autorizado((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {pagosautomaticos.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {pagosautomaticos.setfecha_corte_dato((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {pagosautomaticos.setestado((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {pagosautomaticos.setcodigo_cuenta_con_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {pagosautomaticos.setcodigo_cuenta_con_banco((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public PagosAutomaticosModel(JInternalFrameBase jInternalFrameBase) {
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
		private PagosAutomaticosDetalleFormJInternalFrame pagosautomaticosJInternalFrame=null;
		
		public PagosAutomaticosModel(PagosAutomaticosDetalleFormJInternalFrame pagosautomaticosJInternalFrame) {
			this.pagosautomaticosJInternalFrame=pagosautomaticosJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.pagosautomaticosJInternalFrame.getjButtonActualizarToolBarPagosAutomaticos();
			
			if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.getjButtonActualizarToolBarPagosAutomaticos())) {
				componentTab=this.pagosautomaticosJInternalFrame.getjButtonEliminarToolBarPagosAutomaticos();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.getjButtonEliminarToolBarPagosAutomaticos())) {
				componentTab=this.pagosautomaticosJInternalFrame.getjButtonCancelarToolBarPagosAutomaticos();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.getjButtonCancelarToolBarPagosAutomaticos())) {
				componentTab=this.pagosautomaticosJInternalFrame.jComboBoxid_empresaPagosAutomaticos;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos)) {
				componentTab=this.pagosautomaticosJInternalFrame.jComboBoxTiposAccionesFormularioPagosAutomaticos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jComboBoxTiposAccionesFormularioPagosAutomaticos)) {
				componentTab=this.pagosautomaticosJInternalFrame.jButtonEliminarPagosAutomaticos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jButtonEliminarPagosAutomaticos)) {
				componentTab=this.pagosautomaticosJInternalFrame.jButtonActualizarPagosAutomaticos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jButtonActualizarPagosAutomaticos)) {
				componentTab=this.pagosautomaticosJInternalFrame.jButtonCancelarPagosAutomaticos;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jComboBoxid_empresaPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jDateChooserfecha_cortePagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jDateChooserfecha_cortePagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextAreanombre_clientePagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextAreanombre_clientePagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextFieldnumero_facturaPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextFieldnumero_facturaPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jDateChooserfecha_emisionPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jDateChooserfecha_emisionPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jDateChooserfecha_vencimientoPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jDateChooserfecha_vencimientoPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextAreanombre_bancoPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextAreanombre_bancoPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextFieldvalor_por_pagarPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextFieldvalor_por_pagarPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextFieldvalor_canceladoPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextFieldvalor_canceladoPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextFieldnumero_cuentaPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextFieldnumero_cuentaPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jCheckBoxesta_autorizadoPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jCheckBoxesta_autorizadoPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextAreadescripcionPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextAreadescripcionPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jDateChooserfecha_corte_datoPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jDateChooserfecha_corte_datoPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextAreaestadoPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextAreaestadoPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextFieldcodigo_cuenta_con_clientePagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextFieldcodigo_cuenta_con_clientePagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.pagosautomaticosJInternalFrame.getjButtonActualizarToolBarPagosAutomaticos();
			
			if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.getjButtonEliminarToolBarPagosAutomaticos())) {
				componentTab=this.pagosautomaticosJInternalFrame.getjButtonActualizarToolBarPagosAutomaticos();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.getjButtonCancelarToolBarPagosAutomaticos())) {
				componentTab=this.pagosautomaticosJInternalFrame.getjButtonEliminarToolBarPagosAutomaticos();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jComboBoxid_empresaPagosAutomaticos)) {
				
				componentTab=this.pagosautomaticosJInternalFrame.getjButtonCancelarToolBarPagosAutomaticos();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jComboBoxTiposAccionesFormularioPagosAutomaticos)) {
				componentTab=this.pagosautomaticosJInternalFrame.jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jButtonEliminarPagosAutomaticos)) {
				componentTab=this.pagosautomaticosJInternalFrame.jComboBoxTiposAccionesFormularioPagosAutomaticos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jButtonActualizarPagosAutomaticos)) {
				componentTab=this.pagosautomaticosJInternalFrame.jButtonEliminarPagosAutomaticos;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jButtonCancelarPagosAutomaticos)) {
				componentTab=this.pagosautomaticosJInternalFrame.jButtonActualizarPagosAutomaticos;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jDateChooserfecha_cortePagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jComboBoxid_empresaPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextAreanombre_clientePagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jDateChooserfecha_cortePagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextFieldnumero_facturaPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextAreanombre_clientePagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jDateChooserfecha_emisionPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextFieldnumero_facturaPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jDateChooserfecha_vencimientoPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jDateChooserfecha_emisionPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextAreanombre_bancoPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jDateChooserfecha_vencimientoPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextFieldvalor_por_pagarPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextAreanombre_bancoPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextFieldvalor_canceladoPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextFieldvalor_por_pagarPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextFieldnumero_cuentaPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextFieldvalor_canceladoPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jCheckBoxesta_autorizadoPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextFieldnumero_cuentaPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextAreadescripcionPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jCheckBoxesta_autorizadoPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jDateChooserfecha_corte_datoPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextAreadescripcionPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextAreaestadoPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jDateChooserfecha_corte_datoPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextFieldcodigo_cuenta_con_clientePagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextAreaestadoPagosAutomaticos;
			return componentTab;
		}

		if(component!=null && component.equals(this.pagosautomaticosJInternalFrame.jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos)) {
			componentTab=this.pagosautomaticosJInternalFrame.jTextFieldcodigo_cuenta_con_clientePagosAutomaticos;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.pagosautomaticosJInternalFrame.getjButtonActualizarToolBarPagosAutomaticos();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.pagosautomaticosJInternalFrame.getjButtonActualizarToolBarPagosAutomaticos();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.pagosautomaticosJInternalFrame.getjButtonCancelarToolBarPagosAutomaticos();
			
			
			return componentTab;		
		}
		
		public PagosAutomaticosDetalleFormJInternalFrame getpagosautomaticosJInternalFrame() {
			return this.pagosautomaticosJInternalFrame;
		}
		
		public void setpagosautomaticosJInternalFrame(PagosAutomaticosDetalleFormJInternalFrame pagosautomaticosJInternalFrame) {
			this.pagosautomaticosJInternalFrame=pagosautomaticosJInternalFrame;
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
