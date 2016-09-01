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

import com.bydan.erp.cartera.util.ParametroCarteraDefectoConstantesFunciones;
import com.bydan.erp.cartera.util.ParametroCarteraDefectoParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ParametroCarteraDefectoParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ParametroCarteraDefectoBeanSwingJInternalFrame;
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
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ParametroCarteraDefectoJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ParametroCarteraDefectoDetalleFormJInternalFrame;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ParametroCarteraDefectoModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ParametroCarteraDefectoConstantesFunciones.LABEL_ID
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDEMPRESA
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDSUCURSAL
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDPAIS
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDREGION
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDPROVINCIA
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDCIUDAD
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDZONA
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPOIDENTIFICACION
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPONIVELEDU
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDPAISNACIONALIDAD
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPOGENERO
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDESTADOCIVIL
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDESTADOLEGAL
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDCUENTACONTABLE
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDVENDEDOR
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDRUTA
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDDIA
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPOPRECIO
										,ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPOLISTAPRECIO
										};
	   
	    public List<ParametroCarteraDefecto> parametrocarteradefectos;
	  	 
	    //NO SE UTILIZA
	    public ParametroCarteraDefectoModel(List<ParametroCarteraDefecto> parametrocarteradefectos,JInternalFrameBase jInternalFrameBase) {
	    	this.parametrocarteradefectos=parametrocarteradefectos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ParametroCarteraDefectoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.parametrocarteradefectos=new ArrayList<ParametroCarteraDefecto>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.parametrocarteradefectos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.parametrocarteradefectos.get(rowIndex).getIsSelected();
	            
				case 1: return this.parametrocarteradefectos.get(rowIndex).getId();
				case 2: return this.parametrocarteradefectos.get(rowIndex).getid_empresa();
				case 3: return this.parametrocarteradefectos.get(rowIndex).getid_sucursal();
				case 4: return this.parametrocarteradefectos.get(rowIndex).getid_pais();
				case 5: return this.parametrocarteradefectos.get(rowIndex).getid_region();
				case 6: return this.parametrocarteradefectos.get(rowIndex).getid_provincia();
				case 7: return this.parametrocarteradefectos.get(rowIndex).getid_ciudad();
				case 8: return this.parametrocarteradefectos.get(rowIndex).getid_zona();
				case 9: return this.parametrocarteradefectos.get(rowIndex).getid_tipo_identificacion();
				case 10: return this.parametrocarteradefectos.get(rowIndex).getid_tipo_nivel_edu();
				case 11: return this.parametrocarteradefectos.get(rowIndex).getid_pais_nacionalidad();
				case 12: return this.parametrocarteradefectos.get(rowIndex).getid_tipo_genero();
				case 13: return this.parametrocarteradefectos.get(rowIndex).getid_estado_civil();
				case 14: return this.parametrocarteradefectos.get(rowIndex).getid_estado_legal();
				case 15: return this.parametrocarteradefectos.get(rowIndex).getid_cuenta_contable();
				case 16: return this.parametrocarteradefectos.get(rowIndex).getid_vendedor();
				case 17: return this.parametrocarteradefectos.get(rowIndex).getid_ruta();
				case 18: return this.parametrocarteradefectos.get(rowIndex).getid_dia();
				case 19: return this.parametrocarteradefectos.get(rowIndex).getid_tipo_precio();
				case 20: return this.parametrocarteradefectos.get(rowIndex).getid_tipo_lista_precio();	            
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
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Long.class;
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
	    	ParametroCarteraDefecto parametrocarteradefecto = this.parametrocarteradefectos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=(ParametroCarteraDefectoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {parametrocarteradefecto.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {parametrocarteradefecto.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {parametrocarteradefecto.setid_empresa((Long) value);parametrocarteradefecto.setempresa_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {parametrocarteradefecto.setid_sucursal((Long) value);parametrocarteradefecto.setsucursal_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {parametrocarteradefecto.setid_pais((Long) value);parametrocarteradefecto.setpais_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualPaisForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {parametrocarteradefecto.setid_region((Long) value);parametrocarteradefecto.setregion_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualRegionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {parametrocarteradefecto.setid_provincia((Long) value);parametrocarteradefecto.setprovincia_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualProvinciaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {parametrocarteradefecto.setid_ciudad((Long) value);parametrocarteradefecto.setciudad_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualCiudadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {parametrocarteradefecto.setid_zona((Long) value);parametrocarteradefecto.setzona_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualZonaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {parametrocarteradefecto.setid_tipo_identificacion((Long) value);parametrocarteradefecto.settipoidentificacion_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualTipoIdentificacionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {parametrocarteradefecto.setid_tipo_nivel_edu((Long) value);parametrocarteradefecto.settiponiveledu_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualTipoNivelEduForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {parametrocarteradefecto.setid_pais_nacionalidad((Long) value);parametrocarteradefecto.setpaisnacionalidad_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualPaisNacionalidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {parametrocarteradefecto.setid_tipo_genero((Long) value);parametrocarteradefecto.settipogenero_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualTipoGeneroForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {parametrocarteradefecto.setid_estado_civil((Long) value);parametrocarteradefecto.setestadocivil_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualEstadoCivilForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {parametrocarteradefecto.setid_estado_legal((Long) value);parametrocarteradefecto.setestadolegal_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualEstadoLegalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {parametrocarteradefecto.setid_cuenta_contable((Long) value);parametrocarteradefecto.setcuentacontable_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualCuentaContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {parametrocarteradefecto.setid_vendedor((Long) value);parametrocarteradefecto.setvendedor_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualVendedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {parametrocarteradefecto.setid_ruta((Long) value);parametrocarteradefecto.setruta_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualRutaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {parametrocarteradefecto.setid_dia((Long) value);parametrocarteradefecto.setdia_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualDiaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {parametrocarteradefecto.setid_tipo_precio((Long) value);parametrocarteradefecto.settipoprecio_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualTipoPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {parametrocarteradefecto.setid_tipo_lista_precio((Long) value);parametrocarteradefecto.settipolistaprecio_descripcion(parametrocarteradefectoBeanSwingJInternalFrame.getActualTipoListaPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private ParametroCarteraDefectoDetalleFormJInternalFrame parametrocarteradefectoJInternalFrame=null;
		
		public ParametroCarteraDefectoModel(ParametroCarteraDefectoDetalleFormJInternalFrame parametrocarteradefectoJInternalFrame) {
			this.parametrocarteradefectoJInternalFrame=parametrocarteradefectoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrocarteradefectoJInternalFrame.getjButtonActualizarToolBarParametroCarteraDefecto();
			
			if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.getjButtonActualizarToolBarParametroCarteraDefecto())) {
				componentTab=this.parametrocarteradefectoJInternalFrame.getjButtonEliminarToolBarParametroCarteraDefecto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.getjButtonEliminarToolBarParametroCarteraDefecto())) {
				componentTab=this.parametrocarteradefectoJInternalFrame.getjButtonCancelarToolBarParametroCarteraDefecto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.getjButtonCancelarToolBarParametroCarteraDefecto())) {
				componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_empresaParametroCarteraDefecto;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_lista_precioParametroCarteraDefecto)) {
				componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxTiposAccionesFormularioParametroCarteraDefecto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxTiposAccionesFormularioParametroCarteraDefecto)) {
				componentTab=this.parametrocarteradefectoJInternalFrame.jButtonEliminarParametroCarteraDefecto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jButtonEliminarParametroCarteraDefecto)) {
				componentTab=this.parametrocarteradefectoJInternalFrame.jButtonActualizarParametroCarteraDefecto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jButtonActualizarParametroCarteraDefecto)) {
				componentTab=this.parametrocarteradefectoJInternalFrame.jButtonCancelarParametroCarteraDefecto;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_empresaParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_sucursalParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_sucursalParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_paisParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_paisParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_regionParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_regionParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_provinciaParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_provinciaParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_ciudadParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_ciudadParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_zonaParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_zonaParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_identificacionParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_identificacionParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_nivel_eduParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_nivel_eduParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_pais_nacionalidadParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_pais_nacionalidadParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_generoParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_generoParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_estado_civilParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_estado_civilParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_estado_legalParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_estado_legalParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_cuenta_contableParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_cuenta_contableParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_vendedorParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_vendedorParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_rutaParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_rutaParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_diaParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_diaParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_precioParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_precioParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_lista_precioParametroCarteraDefecto;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrocarteradefectoJInternalFrame.getjButtonActualizarToolBarParametroCarteraDefecto();
			
			if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.getjButtonEliminarToolBarParametroCarteraDefecto())) {
				componentTab=this.parametrocarteradefectoJInternalFrame.getjButtonActualizarToolBarParametroCarteraDefecto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.getjButtonCancelarToolBarParametroCarteraDefecto())) {
				componentTab=this.parametrocarteradefectoJInternalFrame.getjButtonEliminarToolBarParametroCarteraDefecto();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_empresaParametroCarteraDefecto)) {
				
				componentTab=this.parametrocarteradefectoJInternalFrame.getjButtonCancelarToolBarParametroCarteraDefecto();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxTiposAccionesFormularioParametroCarteraDefecto)) {
				componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_lista_precioParametroCarteraDefecto;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jButtonEliminarParametroCarteraDefecto)) {
				componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxTiposAccionesFormularioParametroCarteraDefecto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jButtonActualizarParametroCarteraDefecto)) {
				componentTab=this.parametrocarteradefectoJInternalFrame.jButtonEliminarParametroCarteraDefecto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jButtonCancelarParametroCarteraDefecto)) {
				componentTab=this.parametrocarteradefectoJInternalFrame.jButtonActualizarParametroCarteraDefecto;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_sucursalParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_empresaParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_paisParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_sucursalParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_regionParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_paisParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_provinciaParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_regionParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_ciudadParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_provinciaParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_zonaParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_ciudadParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_identificacionParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_zonaParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_nivel_eduParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_identificacionParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_pais_nacionalidadParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_nivel_eduParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_generoParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_pais_nacionalidadParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_estado_civilParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_generoParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_estado_legalParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_estado_civilParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_cuenta_contableParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_estado_legalParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_vendedorParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_cuenta_contableParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_rutaParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_vendedorParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_diaParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_rutaParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_precioParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_diaParametroCarteraDefecto;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_lista_precioParametroCarteraDefecto)) {
			componentTab=this.parametrocarteradefectoJInternalFrame.jComboBoxid_tipo_precioParametroCarteraDefecto;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrocarteradefectoJInternalFrame.getjButtonActualizarToolBarParametroCarteraDefecto();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrocarteradefectoJInternalFrame.getjButtonActualizarToolBarParametroCarteraDefecto();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrocarteradefectoJInternalFrame.getjButtonCancelarToolBarParametroCarteraDefecto();
			
			
			return componentTab;		
		}
		
		public ParametroCarteraDefectoDetalleFormJInternalFrame getparametrocarteradefectoJInternalFrame() {
			return this.parametrocarteradefectoJInternalFrame;
		}
		
		public void setparametrocarteradefectoJInternalFrame(ParametroCarteraDefectoDetalleFormJInternalFrame parametrocarteradefectoJInternalFrame) {
			this.parametrocarteradefectoJInternalFrame=parametrocarteradefectoJInternalFrame;
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
