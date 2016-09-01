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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report;




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

//import com.bydan.erp.activosfijos.util.TransferenciasConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.TransferenciasParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.TransferenciasParameterGeneral;

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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report.TransferenciasBeanSwingJInternalFrame;
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
import com.bydan.erp.activosfijos.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.activosfijos.util.*;

import com.bydan.erp.activosfijos.util.report.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.report.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report.TransferenciasJInternalFrame;

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report.TransferenciasDetalleFormJInternalFrame;

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

public class TransferenciasModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,TransferenciasConstantesFunciones.LABEL_ID
										,TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN
										,TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN
										,TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN
										,TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN
										,TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN
										,TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO
										,TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO
										,TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO
										,TransferenciasConstantesFunciones.LABEL_GRUPODESTINO
										,TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO
										,TransferenciasConstantesFunciones.LABEL_SECUENCIAL
										,TransferenciasConstantesFunciones.LABEL_FECHA
										,TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO
										,TransferenciasConstantesFunciones.LABEL_COSTO
										,TransferenciasConstantesFunciones.LABEL_DEPRECIACION
										,TransferenciasConstantesFunciones.LABEL_COSTOORIGEN
										,TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN
										,TransferenciasConstantesFunciones.LABEL_RAZON
										,TransferenciasConstantesFunciones.LABEL_DESCRIPCION
										,TransferenciasConstantesFunciones.LABEL_TIPO
										};
	   
	    public List<Transferencias> transferenciass;
	  	 
	    //NO SE UTILIZA
	    public TransferenciasModel(List<Transferencias> transferenciass,JInternalFrameBase jInternalFrameBase) {
	    	this.transferenciass=transferenciass;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public TransferenciasModel(JInternalFrameBase jInternalFrameBase) {
	    	this.transferenciass=new ArrayList<Transferencias>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.transferenciass.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.transferenciass.get(rowIndex).getIsSelected();
	            
				case 1: return this.transferenciass.get(rowIndex).getId();
				case 2: return this.transferenciass.get(rowIndex).getempresa_origen();
				case 3: return this.transferenciass.get(rowIndex).getsucursal_origen();
				case 4: return this.transferenciass.get(rowIndex).getsub_grupo_origen();
				case 5: return this.transferenciass.get(rowIndex).getgrupo_origen();
				case 6: return this.transferenciass.get(rowIndex).getactivo_origen();
				case 7: return this.transferenciass.get(rowIndex).getempresa_destino();
				case 8: return this.transferenciass.get(rowIndex).getsucursal_destino();
				case 9: return this.transferenciass.get(rowIndex).getsub_grupo_destino();
				case 10: return this.transferenciass.get(rowIndex).getgrupo_destino();
				case 11: return this.transferenciass.get(rowIndex).getactivo_destino();
				case 12: return this.transferenciass.get(rowIndex).getsecuencial();
				case 13: return this.transferenciass.get(rowIndex).getfecha();
				case 14: return this.transferenciass.get(rowIndex).getnumero_documento();
				case 15: return this.transferenciass.get(rowIndex).getcosto();
				case 16: return this.transferenciass.get(rowIndex).getdepreciacion();
				case 17: return this.transferenciass.get(rowIndex).getcosto_origen();
				case 18: return this.transferenciass.get(rowIndex).getdepreciacion_origen();
				case 19: return this.transferenciass.get(rowIndex).getrazon();
				case 20: return this.transferenciass.get(rowIndex).getdescripcion();
				case 21: return this.transferenciass.get(rowIndex).gettipo();	            
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
				case 4: return String.class;
				case 5: return String.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return String.class;
				case 13: return Date.class;
				case 14: return String.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return String.class;
				case 20: return String.class;
				case 21: return String.class;	            
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
	    	Transferencias transferencias = this.transferenciass.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			TransferenciasBeanSwingJInternalFrame transferenciasBeanSwingJInternalFrame=(TransferenciasBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {transferencias.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {transferencias.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {transferencias.setempresa_origen((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {transferencias.setsucursal_origen((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {transferencias.setsub_grupo_origen((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {transferencias.setgrupo_origen((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {transferencias.setactivo_origen((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {transferencias.setempresa_destino((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {transferencias.setsucursal_destino((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {transferencias.setsub_grupo_destino((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {transferencias.setgrupo_destino((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {transferencias.setactivo_destino((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {transferencias.setsecuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {transferencias.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {transferencias.setnumero_documento((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {transferencias.setcosto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {transferencias.setdepreciacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {transferencias.setcosto_origen((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {transferencias.setdepreciacion_origen((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {transferencias.setrazon((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {transferencias.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {transferencias.settipo((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public TransferenciasModel(JInternalFrameBase jInternalFrameBase) {
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
		private TransferenciasDetalleFormJInternalFrame transferenciasJInternalFrame=null;
		
		public TransferenciasModel(TransferenciasDetalleFormJInternalFrame transferenciasJInternalFrame) {
			this.transferenciasJInternalFrame=transferenciasJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.transferenciasJInternalFrame.getjButtonActualizarToolBarTransferencias();
			
			if(component!=null && component.equals(this.transferenciasJInternalFrame.getjButtonActualizarToolBarTransferencias())) {
				componentTab=this.transferenciasJInternalFrame.getjButtonEliminarToolBarTransferencias();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciasJInternalFrame.getjButtonEliminarToolBarTransferencias())) {
				componentTab=this.transferenciasJInternalFrame.getjButtonCancelarToolBarTransferencias();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciasJInternalFrame.getjButtonCancelarToolBarTransferencias())) {
				componentTab=this.transferenciasJInternalFrame.jComboBoxid_empresaTransferencias;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextFieldtipoTransferencias)) {
				componentTab=this.transferenciasJInternalFrame.jComboBoxTiposAccionesFormularioTransferencias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciasJInternalFrame.jComboBoxTiposAccionesFormularioTransferencias)) {
				componentTab=this.transferenciasJInternalFrame.jButtonEliminarTransferencias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciasJInternalFrame.jButtonEliminarTransferencias)) {
				componentTab=this.transferenciasJInternalFrame.jButtonActualizarTransferencias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciasJInternalFrame.jButtonActualizarTransferencias)) {
				componentTab=this.transferenciasJInternalFrame.jButtonCancelarTransferencias;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jComboBoxid_empresaTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreaempresa_origenTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreaempresa_origenTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreasucursal_origenTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreasucursal_origenTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreasub_grupo_origenTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreasub_grupo_origenTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreagrupo_origenTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreagrupo_origenTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreaactivo_origenTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreaactivo_origenTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreaempresa_destinoTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreaempresa_destinoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreasucursal_destinoTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreasucursal_destinoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreasub_grupo_destinoTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreasub_grupo_destinoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreagrupo_destinoTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreagrupo_destinoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreaactivo_destinoTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreaactivo_destinoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextFieldsecuencialTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextFieldsecuencialTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jDateChooserfechaTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jDateChooserfechaTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextFieldnumero_documentoTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextFieldnumero_documentoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextFieldcostoTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextFieldcostoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextFielddepreciacionTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextFielddepreciacionTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextFieldcosto_origenTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextFieldcosto_origenTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextFielddepreciacion_origenTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextFielddepreciacion_origenTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextArearazonTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextArearazonTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreadescripcionTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreadescripcionTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextFieldtipoTransferencias;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.transferenciasJInternalFrame.getjButtonActualizarToolBarTransferencias();
			
			if(component!=null && component.equals(this.transferenciasJInternalFrame.getjButtonEliminarToolBarTransferencias())) {
				componentTab=this.transferenciasJInternalFrame.getjButtonActualizarToolBarTransferencias();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciasJInternalFrame.getjButtonCancelarToolBarTransferencias())) {
				componentTab=this.transferenciasJInternalFrame.getjButtonEliminarToolBarTransferencias();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.transferenciasJInternalFrame.jComboBoxid_empresaTransferencias)) {
				
				componentTab=this.transferenciasJInternalFrame.getjButtonCancelarToolBarTransferencias();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.transferenciasJInternalFrame.jComboBoxTiposAccionesFormularioTransferencias)) {
				componentTab=this.transferenciasJInternalFrame.jTextFieldtipoTransferencias;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.transferenciasJInternalFrame.jButtonEliminarTransferencias)) {
				componentTab=this.transferenciasJInternalFrame.jComboBoxTiposAccionesFormularioTransferencias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciasJInternalFrame.jButtonActualizarTransferencias)) {
				componentTab=this.transferenciasJInternalFrame.jButtonEliminarTransferencias;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.transferenciasJInternalFrame.jButtonCancelarTransferencias)) {
				componentTab=this.transferenciasJInternalFrame.jButtonActualizarTransferencias;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreaempresa_origenTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jComboBoxid_empresaTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreasucursal_origenTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreaempresa_origenTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreasub_grupo_origenTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreasucursal_origenTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreagrupo_origenTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreasub_grupo_origenTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreaactivo_origenTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreagrupo_origenTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreaempresa_destinoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreaactivo_origenTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreasucursal_destinoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreaempresa_destinoTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreasub_grupo_destinoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreasucursal_destinoTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreagrupo_destinoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreasub_grupo_destinoTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreaactivo_destinoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreagrupo_destinoTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextFieldsecuencialTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreaactivo_destinoTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jDateChooserfechaTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextFieldsecuencialTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextFieldnumero_documentoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jDateChooserfechaTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextFieldcostoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextFieldnumero_documentoTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextFielddepreciacionTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextFieldcostoTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextFieldcosto_origenTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextFielddepreciacionTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextFielddepreciacion_origenTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextFieldcosto_origenTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextArearazonTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextFielddepreciacion_origenTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextAreadescripcionTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextArearazonTransferencias;
			return componentTab;
		}

		if(component!=null && component.equals(this.transferenciasJInternalFrame.jTextFieldtipoTransferencias)) {
			componentTab=this.transferenciasJInternalFrame.jTextAreadescripcionTransferencias;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.transferenciasJInternalFrame.getjButtonActualizarToolBarTransferencias();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.transferenciasJInternalFrame.getjButtonActualizarToolBarTransferencias();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.transferenciasJInternalFrame.getjButtonCancelarToolBarTransferencias();
			
			
			return componentTab;		
		}
		
		public TransferenciasDetalleFormJInternalFrame gettransferenciasJInternalFrame() {
			return this.transferenciasJInternalFrame;
		}
		
		public void settransferenciasJInternalFrame(TransferenciasDetalleFormJInternalFrame transferenciasJInternalFrame) {
			this.transferenciasJInternalFrame=transferenciasJInternalFrame;
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
