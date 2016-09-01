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

import com.bydan.erp.cartera.util.RecapConstantesFunciones;
import com.bydan.erp.cartera.util.RecapParameterReturnGeneral;
//import com.bydan.erp.cartera.util.RecapParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.RecapBeanSwingJInternalFrame;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.RecapJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.RecapDetalleFormJInternalFrame;

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

public class RecapModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,RecapConstantesFunciones.LABEL_ID
										,RecapConstantesFunciones.LABEL_IDEMPRESA
										,RecapConstantesFunciones.LABEL_IDSUCURSAL
										,RecapConstantesFunciones.LABEL_IDEJERCICIO
										,RecapConstantesFunciones.LABEL_NUMERO
										,RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION
										,RecapConstantesFunciones.LABEL_FECHAINICIO
										,RecapConstantesFunciones.LABEL_FECHAFINAL
										,RecapConstantesFunciones.LABEL_FECHAELABORACION
										,RecapConstantesFunciones.LABEL_FECHACADUCIDAD
										,RecapConstantesFunciones.LABEL_MONTOIVA
										,RecapConstantesFunciones.LABEL_SINMONTOIVA
										,RecapConstantesFunciones.LABEL_IVA
										,RecapConstantesFunciones.LABEL_OTROIMPUESTO
										,RecapConstantesFunciones.LABEL_VALORPROPUESTO
										,RecapConstantesFunciones.LABEL_SUBTOTAL
										,RecapConstantesFunciones.LABEL_FINANCIERO
										,RecapConstantesFunciones.LABEL_TOTAL
										,RecapConstantesFunciones.LABEL_VALORCAMBIO
										};
	   
	    public List<Recap> recaps;
	  	 
	    //NO SE UTILIZA
	    public RecapModel(List<Recap> recaps,JInternalFrameBase jInternalFrameBase) {
	    	this.recaps=recaps;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public RecapModel(JInternalFrameBase jInternalFrameBase) {
	    	this.recaps=new ArrayList<Recap>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.recaps.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.recaps.get(rowIndex).getIsSelected();
	            
				case 1: return this.recaps.get(rowIndex).getId();
				case 2: return this.recaps.get(rowIndex).getid_empresa();
				case 3: return this.recaps.get(rowIndex).getid_sucursal();
				case 4: return this.recaps.get(rowIndex).getid_ejercicio();
				case 5: return this.recaps.get(rowIndex).getnumero();
				case 6: return this.recaps.get(rowIndex).getnumero_autorizacion();
				case 7: return this.recaps.get(rowIndex).getfecha_inicio();
				case 8: return this.recaps.get(rowIndex).getfecha_final();
				case 9: return this.recaps.get(rowIndex).getfecha_elaboracion();
				case 10: return this.recaps.get(rowIndex).getfecha_caducidad();
				case 11: return this.recaps.get(rowIndex).getmonto_iva();
				case 12: return this.recaps.get(rowIndex).getsin_monto_iva();
				case 13: return this.recaps.get(rowIndex).getiva();
				case 14: return this.recaps.get(rowIndex).getotro_impuesto();
				case 15: return this.recaps.get(rowIndex).getvalor_propuesto();
				case 16: return this.recaps.get(rowIndex).getsubtotal();
				case 17: return this.recaps.get(rowIndex).getfinanciero();
				case 18: return this.recaps.get(rowIndex).gettotal();
				case 19: return this.recaps.get(rowIndex).getvalor_cambio();	            
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
				case 7: return Date.class;
				case 8: return Date.class;
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
	    	Recap recap = this.recaps.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			RecapBeanSwingJInternalFrame recapBeanSwingJInternalFrame=(RecapBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {recap.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {recap.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {recap.setid_empresa((Long) value);recap.setempresa_descripcion(recapBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {recap.setid_sucursal((Long) value);recap.setsucursal_descripcion(recapBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {recap.setid_ejercicio((Long) value);recap.setejercicio_descripcion(recapBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {recap.setnumero((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {recap.setnumero_autorizacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {recap.setfecha_inicio((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {recap.setfecha_final((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {recap.setfecha_elaboracion((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {recap.setfecha_caducidad((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {recap.setmonto_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {recap.setsin_monto_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {recap.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {recap.setotro_impuesto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {recap.setvalor_propuesto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {recap.setsubtotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {recap.setfinanciero((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {recap.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {recap.setvalor_cambio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public RecapModel(JInternalFrameBase jInternalFrameBase) {
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
		private RecapDetalleFormJInternalFrame recapJInternalFrame=null;
		
		public RecapModel(RecapDetalleFormJInternalFrame recapJInternalFrame) {
			this.recapJInternalFrame=recapJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.recapJInternalFrame.getjButtonActualizarToolBarRecap();
			
			if(component!=null && component.equals(this.recapJInternalFrame.getjButtonActualizarToolBarRecap())) {
				componentTab=this.recapJInternalFrame.getjButtonEliminarToolBarRecap();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.recapJInternalFrame.getjButtonEliminarToolBarRecap())) {
				componentTab=this.recapJInternalFrame.getjButtonCancelarToolBarRecap();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.recapJInternalFrame.getjButtonCancelarToolBarRecap())) {
				componentTab=this.recapJInternalFrame.jComboBoxid_empresaRecap;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldvalor_cambioRecap)) {
				componentTab=this.recapJInternalFrame.jComboBoxTiposAccionesFormularioRecap;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.recapJInternalFrame.jComboBoxTiposAccionesFormularioRecap)) {
				componentTab=this.recapJInternalFrame.jButtonEliminarRecap;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.recapJInternalFrame.jButtonEliminarRecap)) {
				componentTab=this.recapJInternalFrame.jButtonActualizarRecap;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.recapJInternalFrame.jButtonActualizarRecap)) {
				componentTab=this.recapJInternalFrame.jButtonCancelarRecap;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.recapJInternalFrame.jComboBoxid_empresaRecap)) {
			componentTab=this.recapJInternalFrame.jComboBoxid_sucursalRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jComboBoxid_sucursalRecap)) {
			componentTab=this.recapJInternalFrame.jComboBoxid_ejercicioRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jComboBoxid_ejercicioRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldnumeroRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldnumeroRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldnumero_autorizacionRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldnumero_autorizacionRecap)) {
			componentTab=this.recapJInternalFrame.jDateChooserfecha_inicioRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jDateChooserfecha_inicioRecap)) {
			componentTab=this.recapJInternalFrame.jDateChooserfecha_finalRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jDateChooserfecha_finalRecap)) {
			componentTab=this.recapJInternalFrame.jDateChooserfecha_elaboracionRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jDateChooserfecha_elaboracionRecap)) {
			componentTab=this.recapJInternalFrame.jDateChooserfecha_caducidadRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jDateChooserfecha_caducidadRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldmonto_ivaRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldmonto_ivaRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldsin_monto_ivaRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldsin_monto_ivaRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldivaRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldivaRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldotro_impuestoRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldotro_impuestoRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldvalor_propuestoRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldvalor_propuestoRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldsubtotalRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldsubtotalRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldfinancieroRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldfinancieroRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldtotalRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldtotalRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldvalor_cambioRecap;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.recapJInternalFrame.getjButtonActualizarToolBarRecap();
			
			if(component!=null && component.equals(this.recapJInternalFrame.getjButtonEliminarToolBarRecap())) {
				componentTab=this.recapJInternalFrame.getjButtonActualizarToolBarRecap();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.recapJInternalFrame.getjButtonCancelarToolBarRecap())) {
				componentTab=this.recapJInternalFrame.getjButtonEliminarToolBarRecap();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.recapJInternalFrame.jComboBoxid_empresaRecap)) {
				
				componentTab=this.recapJInternalFrame.getjButtonCancelarToolBarRecap();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.recapJInternalFrame.jComboBoxTiposAccionesFormularioRecap)) {
				componentTab=this.recapJInternalFrame.jTextFieldvalor_cambioRecap;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.recapJInternalFrame.jButtonEliminarRecap)) {
				componentTab=this.recapJInternalFrame.jComboBoxTiposAccionesFormularioRecap;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.recapJInternalFrame.jButtonActualizarRecap)) {
				componentTab=this.recapJInternalFrame.jButtonEliminarRecap;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.recapJInternalFrame.jButtonCancelarRecap)) {
				componentTab=this.recapJInternalFrame.jButtonActualizarRecap;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.recapJInternalFrame.jComboBoxid_sucursalRecap)) {
			componentTab=this.recapJInternalFrame.jComboBoxid_empresaRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jComboBoxid_ejercicioRecap)) {
			componentTab=this.recapJInternalFrame.jComboBoxid_sucursalRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldnumeroRecap)) {
			componentTab=this.recapJInternalFrame.jComboBoxid_ejercicioRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldnumero_autorizacionRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldnumeroRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jDateChooserfecha_inicioRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldnumero_autorizacionRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jDateChooserfecha_finalRecap)) {
			componentTab=this.recapJInternalFrame.jDateChooserfecha_inicioRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jDateChooserfecha_elaboracionRecap)) {
			componentTab=this.recapJInternalFrame.jDateChooserfecha_finalRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jDateChooserfecha_caducidadRecap)) {
			componentTab=this.recapJInternalFrame.jDateChooserfecha_elaboracionRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldmonto_ivaRecap)) {
			componentTab=this.recapJInternalFrame.jDateChooserfecha_caducidadRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldsin_monto_ivaRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldmonto_ivaRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldivaRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldsin_monto_ivaRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldotro_impuestoRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldivaRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldvalor_propuestoRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldotro_impuestoRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldsubtotalRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldvalor_propuestoRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldfinancieroRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldsubtotalRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldtotalRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldfinancieroRecap;
			return componentTab;
		}

		if(component!=null && component.equals(this.recapJInternalFrame.jTextFieldvalor_cambioRecap)) {
			componentTab=this.recapJInternalFrame.jTextFieldtotalRecap;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.recapJInternalFrame.getjButtonActualizarToolBarRecap();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.recapJInternalFrame.getjButtonActualizarToolBarRecap();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.recapJInternalFrame.getjButtonCancelarToolBarRecap();
			
			
			return componentTab;		
		}
		
		public RecapDetalleFormJInternalFrame getrecapJInternalFrame() {
			return this.recapJInternalFrame;
		}
		
		public void setrecapJInternalFrame(RecapDetalleFormJInternalFrame recapJInternalFrame) {
			this.recapJInternalFrame=recapJInternalFrame;
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
