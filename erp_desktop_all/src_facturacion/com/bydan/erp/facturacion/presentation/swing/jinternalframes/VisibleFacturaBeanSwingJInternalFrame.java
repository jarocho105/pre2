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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.facturacion.util.VisibleFacturaConstantesFunciones;
import com.bydan.erp.facturacion.util.VisibleFacturaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.VisibleFacturaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.VisibleFacturaBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
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
import java.util.Collections;
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
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
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

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
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

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class VisibleFacturaBeanSwingJInternalFrame extends VisibleFacturaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VisibleFacturaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VisibleFactura> visiblefacturaValidator = new ClassValidator<VisibleFactura>(VisibleFactura.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VisibleFactura visiblefactura;	
	public VisibleFactura visiblefacturaAux;
	public VisibleFactura visiblefacturaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VisibleFactura visiblefacturaTotales;
	public Long idVisibleFacturaActual;
	public Long iIdNuevoVisibleFactura=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

		
	
	
	
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoVisibleFactura;
	public Boolean isPermisoNuevoVisibleFactura;
	public Boolean isPermisoActualizarVisibleFactura;
	public Boolean isPermisoActualizarOriginalVisibleFactura;
	public Boolean isPermisoEliminarVisibleFactura;
	public Boolean isPermisoGuardarCambiosVisibleFactura;
	public Boolean isPermisoConsultaVisibleFactura;
	public Boolean isPermisoBusquedaVisibleFactura;
	public Boolean isPermisoReporteVisibleFactura;
	public Boolean isPermisoPaginacionMedioVisibleFactura;
	public Boolean isPermisoPaginacionAltoVisibleFactura;
	public Boolean isPermisoPaginacionTodoVisibleFactura;
	public Boolean isPermisoCopiarVisibleFactura;
	public Boolean isPermisoVerFormVisibleFactura;
	public Boolean isPermisoDuplicarVisibleFactura;
	public Boolean isPermisoOrdenVisibleFactura;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public VisibleFacturaParameterReturnGeneral visiblefacturaReturnGeneral;
	public VisibleFacturaParameterReturnGeneral visiblefacturaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVisibleFactura=false;
	public Boolean esParaAccionDesdeFormularioVisibleFactura=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VisibleFacturaSessionBeanAdditional visiblefacturaSessionBeanAdditional=null;
	
	public VisibleFacturaSessionBeanAdditional getVisibleFacturaSessionBeanAdditional() {
		return this.visiblefacturaSessionBeanAdditional;
	}
	
	public void setVisibleFacturaSessionBeanAdditional(VisibleFacturaSessionBeanAdditional visiblefacturaSessionBeanAdditional) {
		try {
			this.visiblefacturaSessionBeanAdditional=visiblefacturaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VisibleFacturaBeanSwingJInternalFrameAdditional visiblefacturaBeanSwingJInternalFrameAdditional=null;
	//public class VisibleFacturaBeanSwingJInternalFrame
	
	public VisibleFacturaBeanSwingJInternalFrameAdditional getVisibleFacturaBeanSwingJInternalFrameAdditional() {
		return this.visiblefacturaBeanSwingJInternalFrameAdditional;
	}
	
	public void setVisibleFacturaBeanSwingJInternalFrameAdditional(VisibleFacturaBeanSwingJInternalFrameAdditional visiblefacturaBeanSwingJInternalFrameAdditional) {
		try {
			this.visiblefacturaBeanSwingJInternalFrameAdditional=visiblefacturaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VisibleFacturaLogic visiblefacturaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VisibleFactura visiblefacturaBean;
	public VisibleFacturaConstantesFunciones visiblefacturaConstantesFunciones;
	//public VisibleFacturaParameterReturnGeneral visiblefacturaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<VisibleFactura> visiblefacturas;	
	//public List<VisibleFactura> visiblefacturasEliminados;
	//public List<VisibleFactura> visiblefacturasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVisibleFactura=false;
	public Boolean isVisibilidadCeldaDuplicarVisibleFactura=true;
	public Boolean isVisibilidadCeldaCopiarVisibleFactura=true;
	public Boolean isVisibilidadCeldaVerFormVisibleFactura=true;
	public Boolean isVisibilidadCeldaOrdenVisibleFactura=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVisibleFactura=false;
	public Boolean isVisibilidadCeldaModificarVisibleFactura=false;
	public Boolean isVisibilidadCeldaActualizarVisibleFactura=false;
	public Boolean isVisibilidadCeldaEliminarVisibleFactura=false;
	public Boolean isVisibilidadCeldaCancelarVisibleFactura=false;
	public Boolean isVisibilidadCeldaGuardarVisibleFactura=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVisibleFactura=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoVisibleFactura() {
		return this.iIdNuevoVisibleFactura;
	}

	public void setiIdNuevoVisibleFactura(Long iIdNuevoVisibleFactura) {
		this.iIdNuevoVisibleFactura = iIdNuevoVisibleFactura;
	}
	
	public Long getidVisibleFacturaActual() {
		return this.idVisibleFacturaActual;
	}

	public void setidVisibleFacturaActual(Long idVisibleFacturaActual) {
		this.idVisibleFacturaActual = idVisibleFacturaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VisibleFactura getvisiblefactura() {
		return this.visiblefactura;
	}

	public void setvisiblefactura(VisibleFactura visiblefactura) {
		this.visiblefactura = visiblefactura;
	}
	
	public VisibleFactura getvisiblefacturaAux() {
		return this.visiblefacturaAux;
	}

	public void setvisiblefacturaAux(VisibleFactura visiblefacturaAux) {
		this.visiblefacturaAux = visiblefacturaAux;
	}				
	
	public VisibleFactura getvisiblefacturaAnterior() {
		return this.visiblefacturaAnterior;
	}

	public void setvisiblefacturaAnterior(VisibleFactura visiblefacturaAnterior) {
		this.visiblefacturaAnterior = visiblefacturaAnterior;
	}	
	
	public VisibleFactura getvisiblefacturaTotales() {
		return this.visiblefacturaTotales;
	}

	public void setvisiblefacturaTotales(VisibleFactura visiblefacturaTotales) {
		this.visiblefacturaTotales = visiblefacturaTotales;
	}	
	
	public VisibleFactura getvisiblefacturaBean() {
		return this.visiblefacturaBean;
	}

	public void setvisiblefacturaBean(VisibleFactura visiblefacturaBean) {
		this.visiblefacturaBean = visiblefacturaBean;
	}	
	
	public VisibleFacturaParameterReturnGeneral getvisiblefacturaReturnGeneral() {
		return this.visiblefacturaReturnGeneral;
	}

	public void setvisiblefacturaReturnGeneral(VisibleFacturaParameterReturnGeneral visiblefacturaReturnGeneral) {
		this.visiblefacturaReturnGeneral = visiblefacturaReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VisibleFacturaLogic getVisibleFacturaLogic()	{		
		return visiblefacturaLogic;
	}

	public void setVisibleFacturaLogic(VisibleFacturaLogic visiblefacturaLogic) {
		this.visiblefacturaLogic = visiblefacturaLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoVisibleFactura() {
		return isEsNuevoVisibleFactura;
	}

	public void setIsEsNuevoVisibleFactura(Boolean isEsNuevoVisibleFactura) {
		this.isEsNuevoVisibleFactura = isEsNuevoVisibleFactura;
	}

	public Boolean getEsParaAccionDesdeFormularioVisibleFactura() {
		return esParaAccionDesdeFormularioVisibleFactura;
	}
	
	public void setEsParaAccionDesdeFormularioVisibleFactura(Boolean esParaAccionDesdeFormularioVisibleFactura) {
		this.esParaAccionDesdeFormularioVisibleFactura = esParaAccionDesdeFormularioVisibleFactura;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.visiblefacturaSessionBean==null) {
				this.visiblefacturaSessionBean=new VisibleFacturaSessionBean();
			}

			if(!this.visiblefacturaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(visiblefacturaSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.visiblefactura!=null) {
						this.visiblefactura.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
						this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVisibleFactura.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
						if(this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura.getItemCount()>0) {
							this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVisibleFacturaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaVisibleFacturaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVisibleFacturaGenerico!=null && jComboBoxid_empresaVisibleFacturaGenerico.getItemCount()>0) {
					jComboBoxid_empresaVisibleFacturaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VisibleFactura visiblefactura,JComboBox jComboBoxid_empresaVisibleFacturaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVisibleFacturaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVisibleFacturaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				visiblefactura.setid_empresa(empresaAux.getId());
				visiblefactura.setempresa_descripcion(VisibleFacturaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				visiblefactura.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVisibleFactura!=null) { 
							this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVisibleFactura!=null) { 
					}

					if(!VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
							this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
							this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesVisibleFactura() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			VisibleFacturaConstantesFunciones.refrescarForeignKeysDescripcionesVisibleFactura(this.visiblefacturaLogic.getVisibleFacturas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			VisibleFacturaConstantesFunciones.refrescarForeignKeysDescripcionesVisibleFactura(this.visiblefacturas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//visiblefacturaLogic.setVisibleFacturas(this.visiblefacturas);
			visiblefacturaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public VisibleFacturaParameterReturnGeneral getVisibleFacturaParameterGeneral() {
		return this.visiblefacturaParameterGeneral;
	}
	
	public void setVisibleFacturaParameterGeneral(VisibleFacturaParameterReturnGeneral visiblefacturaParameterGeneral) {
		this.visiblefacturaParameterGeneral = visiblefacturaParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoVisibleFactura() {
		return isPermisoTodoVisibleFactura;
	}

	public void setIsPermisoTodoVisibleFactura(Boolean isPermisoTodoVisibleFactura) {
		this.isPermisoTodoVisibleFactura = isPermisoTodoVisibleFactura;
	}

	public Boolean getIsPermisoNuevoVisibleFactura() {
		return isPermisoNuevoVisibleFactura;
	}

	public void setIsPermisoNuevoVisibleFactura(Boolean isPermisoNuevoVisibleFactura) {
		this.isPermisoNuevoVisibleFactura = isPermisoNuevoVisibleFactura;
	}

	public Boolean getIsPermisoActualizarVisibleFactura() {
		return isPermisoActualizarVisibleFactura;
	}

	public void setIsPermisoActualizarVisibleFactura(Boolean isPermisoActualizarVisibleFactura) {
		this.isPermisoActualizarVisibleFactura = isPermisoActualizarVisibleFactura;
	}

	public Boolean getIsPermisoEliminarVisibleFactura() {
		return isPermisoEliminarVisibleFactura;
	}

	public void setIsPermisoEliminarVisibleFactura(Boolean isPermisoEliminarVisibleFactura) {
		this.isPermisoEliminarVisibleFactura = isPermisoEliminarVisibleFactura;
	}

	public Boolean getIsPermisoGuardarCambiosVisibleFactura() {
		return isPermisoGuardarCambiosVisibleFactura;
	}

	public void setIsPermisoGuardarCambiosVisibleFactura(Boolean isPermisoGuardarCambiosVisibleFactura) {
		this.isPermisoGuardarCambiosVisibleFactura = isPermisoGuardarCambiosVisibleFactura;
	}
	
	public Boolean getIsPermisoConsultaVisibleFactura() {
		return isPermisoConsultaVisibleFactura;
	}

	public void setIsPermisoConsultaVisibleFactura(Boolean isPermisoConsultaVisibleFactura) {
		this.isPermisoConsultaVisibleFactura = isPermisoConsultaVisibleFactura;
	}

	public Boolean getIsPermisoBusquedaVisibleFactura() {
		return isPermisoBusquedaVisibleFactura;
	}

	public void setIsPermisoBusquedaVisibleFactura(Boolean isPermisoBusquedaVisibleFactura) {
		this.isPermisoBusquedaVisibleFactura = isPermisoBusquedaVisibleFactura;
	}

	public Boolean getIsPermisoReporteVisibleFactura() {
		return isPermisoReporteVisibleFactura;
	}

	public void setIsPermisoReporteVisibleFactura(Boolean isPermisoReporteVisibleFactura) {
		this.isPermisoReporteVisibleFactura = isPermisoReporteVisibleFactura;
	}
	
	public Boolean getIsPermisoPaginacionMedioVisibleFactura() {
		return isPermisoPaginacionMedioVisibleFactura;
	}

	public void setIsPermisoPaginacionMedioVisibleFactura(Boolean isPermisoPaginacionMedioVisibleFactura) {
		this.isPermisoPaginacionMedioVisibleFactura = isPermisoPaginacionMedioVisibleFactura;
	}
	
	public Boolean getIsPermisoPaginacionTodoVisibleFactura() {
		return isPermisoPaginacionTodoVisibleFactura;
	}

	public void setIsPermisoPaginacionTodoVisibleFactura(Boolean isPermisoPaginacionTodoVisibleFactura) {
		this.isPermisoPaginacionTodoVisibleFactura = isPermisoPaginacionTodoVisibleFactura;
	}
	
	public Boolean getIsPermisoPaginacionAltoVisibleFactura() {
		return isPermisoPaginacionAltoVisibleFactura;
	}

	public void setIsPermisoPaginacionAltoVisibleFactura(Boolean isPermisoPaginacionAltoVisibleFactura) {
		this.isPermisoPaginacionAltoVisibleFactura = isPermisoPaginacionAltoVisibleFactura;
	}
	
	public Boolean getIsPermisoCopiarVisibleFactura() {
		return isPermisoCopiarVisibleFactura;
	}

	public void setIsPermisoCopiarVisibleFactura(Boolean isPermisoCopiarVisibleFactura) {
		this.isPermisoCopiarVisibleFactura = isPermisoCopiarVisibleFactura;
	}
	
	public Boolean getIsPermisoVerFormVisibleFactura() {
		return isPermisoVerFormVisibleFactura;
	}

	public void setIsPermisoVerFormVisibleFactura(Boolean isPermisoVerFormVisibleFactura) {
		this.isPermisoVerFormVisibleFactura = isPermisoVerFormVisibleFactura;
	}
	
	public Boolean getIsPermisoDuplicarVisibleFactura() {
		return isPermisoDuplicarVisibleFactura;
	}

	public void setIsPermisoDuplicarVisibleFactura(Boolean isPermisoDuplicarVisibleFactura) {
		this.isPermisoDuplicarVisibleFactura = isPermisoDuplicarVisibleFactura;
	}
	
	public Boolean getIsPermisoOrdenVisibleFactura() {
		return isPermisoOrdenVisibleFactura;
	}

	public void setIsPermisoOrdenVisibleFactura(Boolean isPermisoOrdenVisibleFactura) {
		this.isPermisoOrdenVisibleFactura = isPermisoOrdenVisibleFactura;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoVisibleFactura() {
		return isVisibilidadCeldaNuevoVisibleFactura;
	}

	public void setIsVisibilidadCeldaNuevoVisibleFactura(Boolean isVisibilidadCeldaNuevoVisibleFactura) {
		this.isVisibilidadCeldaNuevoVisibleFactura = isVisibilidadCeldaNuevoVisibleFactura;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVisibleFactura() {
		return isVisibilidadCeldaDuplicarVisibleFactura;
	}

	public void setIsVisibilidadCeldaDuplicarVisibleFactura(Boolean isVisibilidadCeldaDuplicarVisibleFactura) {
		this.isVisibilidadCeldaDuplicarVisibleFactura = isVisibilidadCeldaDuplicarVisibleFactura;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVisibleFactura() {
		return isVisibilidadCeldaCopiarVisibleFactura;
	}

	public void setIsVisibilidadCeldaCopiarVisibleFactura(Boolean isVisibilidadCeldaCopiarVisibleFactura) {
		this.isVisibilidadCeldaCopiarVisibleFactura = isVisibilidadCeldaCopiarVisibleFactura;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVisibleFactura() {
		return isVisibilidadCeldaVerFormVisibleFactura;
	}

	public void setIsVisibilidadCeldaVerFormVisibleFactura(Boolean isVisibilidadCeldaVerFormVisibleFactura) {
		this.isVisibilidadCeldaVerFormVisibleFactura = isVisibilidadCeldaVerFormVisibleFactura;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVisibleFactura() {
		return isVisibilidadCeldaOrdenVisibleFactura;
	}

	public void setIsVisibilidadCeldaOrdenVisibleFactura(Boolean isVisibilidadCeldaOrdenVisibleFactura) {
		this.isVisibilidadCeldaOrdenVisibleFactura = isVisibilidadCeldaOrdenVisibleFactura;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVisibleFactura() {
		return isVisibilidadCeldaNuevoRelacionesVisibleFactura;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVisibleFactura(Boolean isVisibilidadCeldaNuevoRelacionesVisibleFactura) {
		this.isVisibilidadCeldaNuevoRelacionesVisibleFactura = isVisibilidadCeldaNuevoRelacionesVisibleFactura;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVisibleFactura() {
		return isVisibilidadCeldaModificarVisibleFactura;
	}

	public void setIsVisibilidadCeldaModificarVisibleFactura(Boolean isVisibilidadCeldaModificarVisibleFactura) {
		this.isVisibilidadCeldaModificarVisibleFactura = isVisibilidadCeldaModificarVisibleFactura;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVisibleFactura() {
		return isVisibilidadCeldaActualizarVisibleFactura;
	}

	public void setIsVisibilidadCeldaActualizarVisibleFactura(Boolean isVisibilidadCeldaActualizarVisibleFactura) {
		this.isVisibilidadCeldaActualizarVisibleFactura = isVisibilidadCeldaActualizarVisibleFactura;
	}

	public Boolean getIsVisibilidadCeldaEliminarVisibleFactura() {
		return isVisibilidadCeldaEliminarVisibleFactura;
	}

	public void setIsVisibilidadCeldaEliminarVisibleFactura(Boolean isVisibilidadCeldaEliminarVisibleFactura) {
		this.isVisibilidadCeldaEliminarVisibleFactura = isVisibilidadCeldaEliminarVisibleFactura;
	}

	public Boolean getIsVisibilidadCeldaCancelarVisibleFactura() {
		return isVisibilidadCeldaCancelarVisibleFactura;
	}

	public void setIsVisibilidadCeldaCancelarVisibleFactura(Boolean isVisibilidadCeldaCancelarVisibleFactura) {
		this.isVisibilidadCeldaCancelarVisibleFactura = isVisibilidadCeldaCancelarVisibleFactura;
	}

	public Boolean getIsVisibilidadCeldaGuardarVisibleFactura() {
		return isVisibilidadCeldaGuardarVisibleFactura;
	}

	public void setIsVisibilidadCeldaGuardarVisibleFactura(Boolean isVisibilidadCeldaGuardarVisibleFactura) {
		this.isVisibilidadCeldaGuardarVisibleFactura = isVisibilidadCeldaGuardarVisibleFactura;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVisibleFactura() {
		return isVisibilidadCeldaGuardarCambiosVisibleFactura;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVisibleFactura(Boolean isVisibilidadCeldaGuardarCambiosVisibleFactura) {
		this.isVisibilidadCeldaGuardarCambiosVisibleFactura = isVisibilidadCeldaGuardarCambiosVisibleFactura;
	}
		
	public VisibleFacturaSessionBean getvisiblefacturaSessionBean() {
		return this.visiblefacturaSessionBean;
	}
	
	public void setvisiblefacturaSessionBean(VisibleFacturaSessionBean visiblefacturaSessionBean) {
		this.visiblefacturaSessionBean=visiblefacturaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(VisibleFactura visiblefactura)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(visiblefactura,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(VisibleFactura visiblefactura,VisibleFactura visiblefacturaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVisibleFactura(visiblefactura);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		visiblefacturaAux.setId(visiblefactura.getId());
		visiblefacturaAux.setVersionRow(visiblefactura.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessVisibleFactura();
		
			int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = visiblefacturaValidator.getInvalidValues(this.visiblefactura);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			visiblefacturaLogic.setDatosCliente(datosCliente);
			visiblefacturaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				visiblefacturaAux=new  VisibleFactura();
				
				visiblefacturaAux.setIsNew(true);
				visiblefacturaAux.setIsChanged(true);
				
				visiblefacturaAux.setVisibleFacturaOriginal(this.visiblefactura);
				
				visiblefacturaAux.setId(this.visiblefactura.getId());	
				visiblefacturaAux.setVersionRow(this.visiblefactura.getVersionRow());	
				visiblefacturaAux.setid_empresa(this.visiblefactura.getid_empresa());	
				visiblefacturaAux.setcabe_consignatario(this.visiblefactura.getcabe_consignatario());	
				visiblefacturaAux.setcabe_tipo_tasa(this.visiblefactura.getcabe_tipo_tasa());	
				visiblefacturaAux.setcabe_consultor(this.visiblefactura.getcabe_consultor());	
				visiblefacturaAux.setcabe_ice(this.visiblefactura.getcabe_ice());	
				visiblefacturaAux.setcabe_transporte(this.visiblefactura.getcabe_transporte());	
				visiblefacturaAux.setcabe_fue(this.visiblefactura.getcabe_fue());	
				visiblefacturaAux.setcabe_orden(this.visiblefactura.getcabe_orden());	
				visiblefacturaAux.setdeta_autori_precio(this.visiblefactura.getdeta_autori_precio());	
				visiblefacturaAux.setdeta_area(this.visiblefactura.getdeta_area());	
				visiblefacturaAux.setdeta_foto(this.visiblefactura.getdeta_foto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.visiblefacturaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(visiblefacturaAux,visiblefacturaLogic.getVisibleFacturas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(visiblefacturaAux,visiblefacturas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.visiblefacturaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						visiblefacturaLogic.saveVisibleFacturas();//WithConnection
						//visiblefacturaLogic.getSetVersionRowVisibleFacturas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.visiblefactura,visiblefacturaAux);
					
					this.refrescarForeignKeysDescripcionesVisibleFactura();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								visiblefacturaLogic.saveVisibleFacturaRelaciones(visiblefacturaAux);//WithConnection
								//visiblefacturaLogic.getSetVersionRowVisibleFacturas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.visiblefactura,visiblefacturaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.visiblefacturaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(visiblefacturaAux,visiblefacturaLogic.getVisibleFacturas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(visiblefacturaAux,visiblefacturas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.visiblefactura,visiblefacturaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				visiblefacturaAux=new  VisibleFactura();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado() 
					|| (this.visiblefacturaSessionBean.getEsGuardarRelacionado() && this.visiblefactura.getId()>=0)) {
						
					visiblefacturaAux.setIsNew(false);
				}
				
				visiblefacturaAux.setIsDeleted(false);
			
				visiblefacturaAux.setId(this.visiblefactura.getId());	
				visiblefacturaAux.setVersionRow(this.visiblefactura.getVersionRow());	
				visiblefacturaAux.setid_empresa(this.visiblefactura.getid_empresa());	
				visiblefacturaAux.setcabe_consignatario(this.visiblefactura.getcabe_consignatario());	
				visiblefacturaAux.setcabe_tipo_tasa(this.visiblefactura.getcabe_tipo_tasa());	
				visiblefacturaAux.setcabe_consultor(this.visiblefactura.getcabe_consultor());	
				visiblefacturaAux.setcabe_ice(this.visiblefactura.getcabe_ice());	
				visiblefacturaAux.setcabe_transporte(this.visiblefactura.getcabe_transporte());	
				visiblefacturaAux.setcabe_fue(this.visiblefactura.getcabe_fue());	
				visiblefacturaAux.setcabe_orden(this.visiblefactura.getcabe_orden());	
				visiblefacturaAux.setdeta_autori_precio(this.visiblefactura.getdeta_autori_precio());	
				visiblefacturaAux.setdeta_area(this.visiblefactura.getdeta_area());	
				visiblefacturaAux.setdeta_foto(this.visiblefactura.getdeta_foto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(visiblefacturaAux,visiblefacturaLogic.getVisibleFacturas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(visiblefacturaAux,visiblefacturas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.visiblefacturaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						visiblefacturaLogic.saveVisibleFacturas();//WithConnection
						//visiblefacturaLogic.getSetVersionRowVisibleFacturas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.visiblefactura,visiblefacturaAux);
					
					this.refrescarForeignKeysDescripcionesVisibleFactura();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								visiblefacturaLogic.saveVisibleFacturaRelaciones(visiblefacturaAux);//WithConnection
								//visiblefacturaLogic.getSetVersionRowVisibleFacturas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.visiblefactura,visiblefacturaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.visiblefacturaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(visiblefacturaAux,visiblefacturaLogic.getVisibleFacturas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(visiblefacturaAux,visiblefacturas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.visiblefactura,visiblefacturaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				visiblefacturaAux=new  VisibleFactura();
				
				visiblefacturaAux.setIsNew(false);
				visiblefacturaAux.setIsChanged(false);
				
				visiblefacturaAux.setIsDeleted(true);
				
				visiblefacturaAux.setId(this.visiblefactura.getId());	
				visiblefacturaAux.setVersionRow(this.visiblefactura.getVersionRow());	
				visiblefacturaAux.setid_empresa(this.visiblefactura.getid_empresa());	
				visiblefacturaAux.setcabe_consignatario(this.visiblefactura.getcabe_consignatario());	
				visiblefacturaAux.setcabe_tipo_tasa(this.visiblefactura.getcabe_tipo_tasa());	
				visiblefacturaAux.setcabe_consultor(this.visiblefactura.getcabe_consultor());	
				visiblefacturaAux.setcabe_ice(this.visiblefactura.getcabe_ice());	
				visiblefacturaAux.setcabe_transporte(this.visiblefactura.getcabe_transporte());	
				visiblefacturaAux.setcabe_fue(this.visiblefactura.getcabe_fue());	
				visiblefacturaAux.setcabe_orden(this.visiblefactura.getcabe_orden());	
				visiblefacturaAux.setdeta_autori_precio(this.visiblefactura.getdeta_autori_precio());	
				visiblefacturaAux.setdeta_area(this.visiblefactura.getdeta_area());	
				visiblefacturaAux.setdeta_foto(this.visiblefactura.getdeta_foto());	
				
				if(this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.visiblefacturaAux.getId()>=0) {	
						this.visiblefacturasEliminados.add(visiblefacturaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(visiblefacturaAux,visiblefacturaLogic.getVisibleFacturas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(visiblefacturaAux,visiblefacturas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.visiblefacturaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						visiblefacturaLogic.saveVisibleFacturas();//WithConnection
						//visiblefacturaLogic.getSetVersionRowVisibleFacturas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								visiblefacturaLogic.saveVisibleFacturaRelaciones(visiblefacturaAux);//WithConnection
								//visiblefacturaLogic.getSetVersionRowVisibleFacturas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.visiblefacturaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(visiblefacturaAux,visiblefacturaLogic.getVisibleFacturas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(visiblefacturaAux,visiblefacturas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.getVisibleFacturas().addAll(this.visiblefacturasEliminados);
					
					visiblefacturaLogic.saveVisibleFacturas();//WithConnection
					//visiblefacturaLogic.getSetVersionRowVisibleFacturas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesVisibleFactura();
				
				this.visiblefacturasEliminados= new ArrayList<VisibleFactura>();		
			}
			
			if(this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Visibilidad Factura GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Visibilidad Factura",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.visiblefactura=visiblefacturaAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessVisibleFactura();
      	}
		
	}	
	
	public void actualizarRelaciones(VisibleFactura visiblefacturaLocal) throws Exception {
		
		if(this.visiblefacturaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VisibleFactura visiblefacturaLocal) throws Exception {	
		if(this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				visiblefacturaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVisibleFacturaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = visiblefacturaValidator.getInvalidValues(this.visiblefactura);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VisibleFactura visiblefactura,List<VisibleFactura> visiblefacturas) throws Exception {
		try	{		
			VisibleFacturaConstantesFunciones.actualizarLista(visiblefactura,visiblefacturas,this.visiblefacturaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(VisibleFactura visiblefactura,List<VisibleFactura> visiblefacturas) throws Exception {
		try	{			
			VisibleFacturaConstantesFunciones.actualizarSelectedLista(visiblefactura,visiblefacturas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VisibleFactura> visiblefacturasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				visiblefacturasLocal=this.visiblefacturaLogic.getVisibleFacturas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				visiblefacturasLocal=this.visiblefacturas;
			}
			//ARCHITECTURE
		
			for(VisibleFactura visiblefacturaLocal:visiblefacturasLocal) {
				if(this.permiteMantenimiento(visiblefacturaLocal) && visiblefacturaLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+VisibleFacturaConstantesFunciones.getVisibleFacturaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VisibleFacturaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelid_empresaVisibleFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VisibleFacturaConstantesFunciones.CABECONSIGNATARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_consignatarioVisibleFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VisibleFacturaConstantesFunciones.CABETIPOTASA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_tipo_tasaVisibleFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VisibleFacturaConstantesFunciones.CABECONSULTOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_consultorVisibleFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VisibleFacturaConstantesFunciones.CABEICE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_iceVisibleFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VisibleFacturaConstantesFunciones.CABETRANSPORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_transporteVisibleFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VisibleFacturaConstantesFunciones.CABEFUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_fueVisibleFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VisibleFacturaConstantesFunciones.CABEORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_ordenVisibleFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VisibleFacturaConstantesFunciones.DETAAUTORIPRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabeldeta_autori_precioVisibleFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VisibleFacturaConstantesFunciones.DETAAREA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabeldeta_areaVisibleFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VisibleFacturaConstantesFunciones.DETAFOTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabeldeta_fotoVisibleFactura,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisibleFactura.jLabelid_empresaVisibleFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_consignatarioVisibleFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_tipo_tasaVisibleFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_consultorVisibleFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_iceVisibleFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_transporteVisibleFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_fueVisibleFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_ordenVisibleFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisibleFactura.jLabeldeta_autori_precioVisibleFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisibleFactura.jLabeldeta_areaVisibleFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVisibleFactura.jLabeldeta_fotoVisibleFactura,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoVisibleFactura--;	
		
		
		this.visiblefacturaAux=new VisibleFactura();
		
		this.visiblefacturaAux.setId(this.iIdNuevoVisibleFactura);
		this.visiblefacturaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.visiblefacturaLogic.getVisibleFacturas().add(this.visiblefacturaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.visiblefacturas.add(this.visiblefacturaAux);
		}
		//ARCHITECTURE
		
		this.visiblefactura=this.visiblefacturaAux;
		
		if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVisibleFactura(this.visiblefactura);
			this.setVariablesObjetoActualToFormularioForeignKeyVisibleFactura(this.visiblefactura);
		}
				
		//this.setDefaultControlesVisibleFactura();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVisibleFactura();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVisibleFactura();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVisibleFactura();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVisibleFactura(this.visiblefacturaBean,this.visiblefactura,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(VisibleFacturaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.visiblefacturaSessionBean.getConGuardarRelaciones()) {
			classes=VisibleFacturaConstantesFunciones.getClassesRelationshipsOfVisibleFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.visiblefacturaReturnGeneral=visiblefacturaLogic.procesarEventosVisibleFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.visiblefacturaLogic.getVisibleFacturas(),this.visiblefactura,this.visiblefacturaParameterGeneral,this.isEsNuevoVisibleFactura,classes);//this.visiblefacturaLogic.getVisibleFactura()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVisibleFactura(this.visiblefacturaReturnGeneral,this.visiblefacturaBean,false);
		
		if(this.visiblefacturaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVisibleFactura(this.visiblefacturaReturnGeneral.getVisibleFactura());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVisibleFactura(this.visiblefacturaReturnGeneral.getVisibleFactura());
		}
		
		if(this.visiblefacturaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVisibleFactura(this.visiblefacturaReturnGeneral.getVisibleFactura(),classes);//this.visiblefacturaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVisibleFactura();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVisibleFactura();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VisibleFacturaBeanSwingJInternalFrameAdditional.RecargarFormVisibleFactura(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVisibleFactura(false);
						
			if(visiblefacturaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVisibleFactura();
			}
			
			this.actualizarVisualTableDatosVisibleFactura();
			
			this.jTableDatosVisibleFactura.setRowSelectionInterval(this.getIndiceNuevoVisibleFactura(), this.getIndiceNuevoVisibleFactura());
			
			this.seleccionarFilaTablaVisibleFacturaActual();
						
			this.actualizarEstadoCeldasBotonesVisibleFactura("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVisibleFactura(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consignatarioVisibleFactura.setEnabled(isHabilitar && this.visiblefacturaConstantesFunciones.activarcabe_consignatarioVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_tipo_tasaVisibleFactura.setEnabled(isHabilitar && this.visiblefacturaConstantesFunciones.activarcabe_tipo_tasaVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consultorVisibleFactura.setEnabled(isHabilitar && this.visiblefacturaConstantesFunciones.activarcabe_consultorVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_iceVisibleFactura.setEnabled(isHabilitar && this.visiblefacturaConstantesFunciones.activarcabe_iceVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_transporteVisibleFactura.setEnabled(isHabilitar && this.visiblefacturaConstantesFunciones.activarcabe_transporteVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_fueVisibleFactura.setEnabled(isHabilitar && this.visiblefacturaConstantesFunciones.activarcabe_fueVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_ordenVisibleFactura.setEnabled(isHabilitar && this.visiblefacturaConstantesFunciones.activarcabe_ordenVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_autori_precioVisibleFactura.setEnabled(isHabilitar && this.visiblefacturaConstantesFunciones.activardeta_autori_precioVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_areaVisibleFactura.setEnabled(isHabilitar && this.visiblefacturaConstantesFunciones.activardeta_areaVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_fotoVisibleFactura.setEnabled(isHabilitar && this.visiblefacturaConstantesFunciones.activardeta_fotoVisibleFactura);	
		//
		this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura.setEnabled(isHabilitar && this.visiblefacturaConstantesFunciones.activarid_empresaVisibleFactura);
	};
	
	public void setDefaultControlesVisibleFactura() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVisibleFactura(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.visiblefacturaSessionBean.setConGuardarRelaciones(true);			
			this.visiblefacturaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVisibleFactura.jTabbedPaneRelacionesVisibleFactura.setVisible(true);
			
					
		} else {
			//this.visiblefacturaSessionBean.setConGuardarRelaciones(false);			
			this.visiblefacturaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVisibleFactura.jTabbedPaneRelacionesVisibleFactura.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVisibleFactura() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VisibleFactura visiblefacturaAux:this.visiblefacturaLogic.getVisibleFacturas()) {
				if(visiblefacturaAux.getId().equals(this.iIdNuevoVisibleFactura)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VisibleFactura visiblefacturaAux:this.visiblefacturas) {
				if(visiblefacturaAux.getId().equals(this.iIdNuevoVisibleFactura)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualVisibleFactura(VisibleFactura visiblefactura,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VisibleFactura visiblefacturaAux:this.visiblefacturaLogic.getVisibleFacturas()) {
				if(visiblefacturaAux.getId().equals(visiblefactura.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VisibleFactura visiblefacturaAux:this.visiblefacturas) {
				if(visiblefacturaAux.getId().equals(visiblefactura.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalVisibleFactura(VisibleFactura visiblefacturaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VisibleFactura visiblefacturaAux:this.visiblefacturaLogic.getVisibleFacturas()) {
				if(visiblefacturaAux.getVisibleFacturaOriginal().getId().equals(visiblefacturaOriginal.getId())) {
					existe=true;
					visiblefacturaOriginal.setId(visiblefacturaAux.getId());
					visiblefacturaOriginal.setVersionRow(visiblefacturaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VisibleFactura visiblefacturaAux:this.visiblefacturas) {
				if(visiblefacturaAux.getVisibleFacturaOriginal().getId().equals(visiblefacturaOriginal.getId())) {
					existe=true;
					visiblefacturaOriginal.setId(visiblefacturaAux.getId());
					visiblefacturaOriginal.setVersionRow(visiblefacturaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVisibleFactura(Boolean esParaCancelar) throws Exception {
		visiblefacturasAux=new ArrayList<VisibleFactura>();
		visiblefacturaAux=new VisibleFactura();
		
		if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VisibleFactura visiblefacturaAux:this.visiblefacturaLogic.getVisibleFacturas()) {
					if(visiblefacturaAux.getId()<0) {
						visiblefacturasAux.add(visiblefacturaAux);
					}		
				}
				this.iIdNuevoVisibleFactura=0L;
				this.visiblefacturaLogic.getVisibleFacturas().removeAll(visiblefacturasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VisibleFactura visiblefacturaAux:this.visiblefacturas) {
					if(visiblefacturaAux.getId()<0) {
						visiblefacturasAux.add(visiblefacturaAux);
					}		
				}
				this.iIdNuevoVisibleFactura=0L;
				this.visiblefacturas.removeAll(visiblefacturasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVisibleFactura 
					&& this.visiblefacturaLogic.getVisibleFacturas().size()>0
					) {
					visiblefacturaAux=this.visiblefacturaLogic.getVisibleFacturas().get(this.visiblefacturaLogic.getVisibleFacturas().size() - 1);
				
					if(visiblefacturaAux.getId()<0) {
						this.visiblefacturaLogic.getVisibleFacturas().remove(visiblefacturaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVisibleFactura && this.visiblefacturas.size()>0) {
					visiblefacturaAux=this.visiblefacturas.get(this.visiblefacturas.size() - 1);
				
					if(visiblefacturaAux.getId()<0) {
						this.visiblefacturas.remove(visiblefacturaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVisibleFactura(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(visiblefactura.getId()<0) {
				this.visiblefacturaLogic.getVisibleFacturas().remove(this.visiblefactura);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(visiblefactura.getId()<0) {
				this.visiblefacturas.remove(this.visiblefactura);
			}
		}			
	}
	
	public void setEstadosInicialesVisibleFactura(List<VisibleFactura> visiblefacturasAux) throws Exception {
		VisibleFacturaConstantesFunciones.setEstadosInicialesVisibleFactura(visiblefacturasAux);
	}
	
	public void setEstadosInicialesVisibleFactura(VisibleFactura visiblefacturaAux) throws Exception {
		VisibleFacturaConstantesFunciones.setEstadosInicialesVisibleFactura(visiblefacturaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVisibleFacturaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVisibleFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVisibleFacturaActual()) {
				if(!this.isEsNuevoVisibleFactura) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVisibleFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVisibleFactura=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVisibleFacturaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Visibilidad Factura ?", "MANTENIMIENTO DE Visibilidad Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVisibleFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VisibleFactura visiblefactura) throws Exception {
		VisibleFacturaConstantesFunciones.seleccionarAsignar(this.visiblefactura,visiblefactura);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVisibleFactura=this.isPermisoActualizarOriginalVisibleFactura;
			
			
			this.seleccionarAsignar(visiblefactura);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VisibleFacturaConstantesFunciones.quitarEspaciosVisibleFactura(this.visiblefactura,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesVisibleFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.visiblefacturaSessionBean.setsFuncionBusquedaRapida(this.visiblefacturaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVisibleFactura) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVisibleFactura(esParaCancelar);				
				this.cancelarNuevoVisibleFactura(esParaCancelar);								
			}
			
			this.visiblefactura=new VisibleFactura();
			
			this.inicializarVisibleFactura();
			
			this.actualizarEstadoCeldasBotonesVisibleFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVisibleFactura() throws Exception {
		try {
			VisibleFacturaConstantesFunciones.inicializarVisibleFactura(this.visiblefactura);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.visiblefacturaLogic.getVisibleFacturas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVisibleFacturas(String sAccionBusqueda,List<VisibleFactura> visiblefacturasParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="VisibleFactura"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VisibleFacturaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VisibleFacturaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VisibleFactura"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Visibilidad Facturas");		
		parameters.put("busquedapor", VisibleFacturaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVisibleFactura=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VisibleFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VisibleFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVisibleFactura=new JRBeanArrayDataSource(VisibleFacturaJInternalFrame.TraerVisibleFacturaBeans(visiblefacturasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVisibleFactura);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VisibleFacturaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VisibleFacturaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VisibleFacturaBean.TraerVisibleFacturaBeans(visiblefacturasParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteVisibleFacturas(sAccionBusqueda,sTipoArchivoReporte,visiblefacturasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVisibleFacturas(sAccionBusqueda,sTipoArchivoReporte,visiblefacturasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVisibleFacturaActionPerformed(null);
					//this.generarExcelReporteVisibleFacturas(sAccionBusqueda,sTipoArchivoReporte,visiblefacturasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVisibleFacturas(sAccionBusqueda,sTipoArchivoReporte,visiblefacturasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVisibleFacturas(sAccionBusqueda,sTipoArchivoReporte,visiblefacturasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVisibleFacturas(sAccionBusqueda,sTipoArchivoReporte,visiblefacturasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVisibleFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<VisibleFactura> visiblefacturasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"visiblefactura";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VisibleFacturas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVisibleFactura("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VisibleFactura visiblefactura : visiblefacturasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VisibleFacturaConstantesFunciones.generarExcelReporteDataVisibleFactura("NORMAL",row,workbook,visiblefactura,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visibilidad Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVisibleFactura(String sTipo,Row row,Workbook workbook) {
		
		VisibleFacturaConstantesFunciones.generarExcelReporteHeaderVisibleFactura(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVisibleFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<VisibleFactura> visiblefacturasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"visiblefactura_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VisibleFacturas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VisibleFactura visiblefactura : visiblefacturasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VisibleFacturaConstantesFunciones.getVisibleFacturaDescripcion(visiblefactura));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(visiblefactura.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(visiblefactura.getcabe_consignatario()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(visiblefactura.getcabe_tipo_tasa()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(visiblefactura.getcabe_consultor()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisibleFacturaConstantesFunciones.LABEL_CABEICE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABEICE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(visiblefactura.getcabe_ice()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(visiblefactura.getcabe_transporte()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisibleFacturaConstantesFunciones.LABEL_CABEFUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABEFUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(visiblefactura.getcabe_fue()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisibleFacturaConstantesFunciones.LABEL_CABEORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABEORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(visiblefactura.getcabe_orden()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(visiblefactura.getdeta_autori_precio()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisibleFacturaConstantesFunciones.LABEL_DETAAREA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_DETAAREA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(visiblefactura.getdeta_area()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VisibleFacturaConstantesFunciones.LABEL_DETAFOTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_DETAFOTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(visiblefactura.getdeta_foto()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visibilidad Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVisibleFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<VisibleFactura> visiblefacturasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VisibleFactura> visiblefacturasRespaldo=null;
		
		classes=VisibleFacturaConstantesFunciones.getClassesRelationshipsOfVisibleFactura(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.visiblefacturaLogic.setDatosCliente(this.datosCliente);
		this.visiblefacturaLogic.setDatosDeep(this.datosDeep);
		this.visiblefacturaLogic.setIsConDeep(true);
		
		visiblefacturasRespaldo=this.visiblefacturaLogic.getVisibleFacturas();
		
		this.visiblefacturaLogic.setVisibleFacturas(visiblefacturasParaReportes);	
		this.visiblefacturaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		visiblefacturasParaReportes=this.visiblefacturaLogic.getVisibleFacturas();
		this.visiblefacturaLogic.setVisibleFacturas(visiblefacturasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"visiblefactura_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VisibleFacturas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVisibleFactura("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VisibleFactura visiblefactura : visiblefacturasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVisibleFactura("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VisibleFacturaConstantesFunciones.generarExcelReporteDataVisibleFactura("NORMAL",row,workbook,visiblefactura,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VisibleFacturaConstantesFunciones.getVisibleFacturaDescripcion(visiblefactura));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visibilidad Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVisibleFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVisibleFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVisibleFactura.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVisibleFactura.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVisibleFactura() throws Exception {		
		this.startProcessVisibleFactura(true);
	}
	
	public void startProcessVisibleFactura(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVisibleFactura ,this.jPanelParametrosReportesVisibleFactura, this.jScrollPanelDatosVisibleFactura,this.jPanelPaginacionVisibleFactura, this.jScrollPanelDatosEdicionVisibleFactura, this.jPanelAccionesVisibleFactura,this.jPanelAccionesFormularioVisibleFactura,this.jmenuBarVisibleFactura,this.jmenuBarDetalleVisibleFactura,this.jTtoolBarVisibleFactura,this.jTtoolBarDetalleVisibleFactura);		
		
		final JTabbedPane jTabbedPaneBusquedasVisibleFactura=this.jTabbedPaneBusquedasVisibleFactura; 
		
		final JPanel jPanelParametrosReportesVisibleFactura=this.jPanelParametrosReportesVisibleFactura;
		//final JScrollPane jScrollPanelDatosVisibleFactura=this.jScrollPanelDatosVisibleFactura;
		final JTable jTableDatosVisibleFactura=this.jTableDatosVisibleFactura;		
		final JPanel jPanelPaginacionVisibleFactura=this.jPanelPaginacionVisibleFactura;
		//final JScrollPane jScrollPanelDatosEdicionVisibleFactura=this.jScrollPanelDatosEdicionVisibleFactura;
		final JPanel jPanelAccionesVisibleFactura=this.jPanelAccionesVisibleFactura;
		
		JPanel jPanelCamposAuxiliarVisibleFactura=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVisibleFactura=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
			jPanelCamposAuxiliarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jPanelCamposVisibleFactura;
			jPanelAccionesFormularioAuxiliarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jPanelAccionesFormularioVisibleFactura;
		}
		
		final JPanel jPanelCamposVisibleFactura=jPanelCamposAuxiliarVisibleFactura;
		final JPanel jPanelAccionesFormularioVisibleFactura=jPanelAccionesFormularioAuxiliarVisibleFactura;
		
		
		final JMenuBar jmenuBarVisibleFactura=this.jmenuBarVisibleFactura;
		final JToolBar jTtoolBarVisibleFactura=this.jTtoolBarVisibleFactura;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVisibleFactura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVisibleFactura=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
			jmenuBarDetalleAuxiliarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jmenuBarDetalleVisibleFactura;
			jTtoolBarDetalleAuxiliarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jTtoolBarDetalleVisibleFactura;
		}
		
		final JMenuBar jmenuBarDetalleVisibleFactura=jmenuBarDetalleAuxiliarVisibleFactura;
		final JToolBar jTtoolBarDetalleVisibleFactura=jTtoolBarDetalleAuxiliarVisibleFactura;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVisibleFactura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVisibleFactura;
			processRunnable.jTableDatos=jTableDatosVisibleFactura;
			processRunnable.jPanelCampos=jPanelCamposVisibleFactura;
			processRunnable.jPanelPaginacion=jPanelPaginacionVisibleFactura;
			processRunnable.jPanelAcciones=jPanelAccionesVisibleFactura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVisibleFactura;
			
			
			processRunnable.jmenuBar=jmenuBarVisibleFactura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVisibleFactura;
			processRunnable.jTtoolBar=jTtoolBarVisibleFactura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVisibleFactura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVisibleFactura ,jPanelParametrosReportesVisibleFactura,jTableDatosVisibleFactura, /*jScrollPanelDatosVisibleFactura,*/jPanelCamposVisibleFactura,jPanelPaginacionVisibleFactura, /*jScrollPanelDatosEdicionVisibleFactura,*/ jPanelAccionesVisibleFactura,jPanelAccionesFormularioVisibleFactura,jmenuBarVisibleFactura,jmenuBarDetalleVisibleFactura,jTtoolBarVisibleFactura,jTtoolBarDetalleVisibleFactura);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVisibleFactura ,jPanelParametrosReportesVisibleFactura, jScrollPanelDatosVisibleFactura,jPanelPaginacionVisibleFactura, jScrollPanelDatosEdicionVisibleFactura, jPanelAccionesVisibleFactura,jPanelAccionesFormularioVisibleFactura,jmenuBarVisibleFactura,jmenuBarDetalleVisibleFactura,jTtoolBarVisibleFactura,jTtoolBarDetalleVisibleFactura);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessVisibleFactura() {// throws Exception 
		this.finishProcessVisibleFactura(true);
	}
	
	public void finishProcessVisibleFactura(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVisibleFactura ,this.jPanelParametrosReportesVisibleFactura, this.jScrollPanelDatosVisibleFactura,this.jPanelPaginacionVisibleFactura, this.jScrollPanelDatosEdicionVisibleFactura, this.jPanelAccionesVisibleFactura,this.jPanelAccionesFormularioVisibleFactura,this.jmenuBarVisibleFactura,this.jmenuBarDetalleVisibleFactura,this.jTtoolBarVisibleFactura,this.jTtoolBarDetalleVisibleFactura);		
		
		final JTabbedPane jTabbedPaneBusquedasVisibleFactura=this.jTabbedPaneBusquedasVisibleFactura; 
		
		final JPanel jPanelParametrosReportesVisibleFactura=this.jPanelParametrosReportesVisibleFactura;
		//final JScrollPane jScrollPanelDatosVisibleFactura=this.jScrollPanelDatosVisibleFactura;
		final JTable jTableDatosVisibleFactura=this.jTableDatosVisibleFactura;		
		final JPanel jPanelPaginacionVisibleFactura=this.jPanelPaginacionVisibleFactura;
		//final JScrollPane jScrollPanelDatosEdicionVisibleFactura=this.jScrollPanelDatosEdicionVisibleFactura;
		final JPanel jPanelAccionesVisibleFactura=this.jPanelAccionesVisibleFactura;
		
		JPanel jPanelCamposAuxiliarVisibleFactura=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVisibleFactura=new JPanel();
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
			jPanelCamposAuxiliarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jPanelCamposVisibleFactura;
			jPanelAccionesFormularioAuxiliarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jPanelAccionesFormularioVisibleFactura;
		}
		
		final JPanel jPanelCamposVisibleFactura=jPanelCamposAuxiliarVisibleFactura;
		final JPanel jPanelAccionesFormularioVisibleFactura=jPanelAccionesFormularioAuxiliarVisibleFactura;
		
		
		final JMenuBar jmenuBarVisibleFactura=this.jmenuBarVisibleFactura;		
		final JToolBar jTtoolBarVisibleFactura=this.jTtoolBarVisibleFactura;
				
		JMenuBar jmenuBarDetalleAuxiliarVisibleFactura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVisibleFactura=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
			jmenuBarDetalleAuxiliarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jmenuBarDetalleVisibleFactura;
			jTtoolBarDetalleAuxiliarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jTtoolBarDetalleVisibleFactura;		
		}
		
		final JMenuBar jmenuBarDetalleVisibleFactura=jmenuBarDetalleAuxiliarVisibleFactura;
		final JToolBar jTtoolBarDetalleVisibleFactura=jTtoolBarDetalleAuxiliarVisibleFactura;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVisibleFactura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVisibleFactura;
			processRunnable.jTableDatos=jTableDatosVisibleFactura;
			processRunnable.jPanelCampos=jPanelCamposVisibleFactura;
			processRunnable.jPanelPaginacion=jPanelPaginacionVisibleFactura;
			processRunnable.jPanelAcciones=jPanelAccionesVisibleFactura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVisibleFactura;
			
			
			processRunnable.jmenuBar=jmenuBarVisibleFactura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVisibleFactura;
			processRunnable.jTtoolBar=jTtoolBarVisibleFactura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVisibleFactura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVisibleFactura ,jPanelParametrosReportesVisibleFactura, jTableDatosVisibleFactura,/*jScrollPanelDatosVisibleFactura,*/jPanelCamposVisibleFactura,jPanelPaginacionVisibleFactura, /*jScrollPanelDatosEdicionVisibleFactura,*/ jPanelAccionesVisibleFactura,jPanelAccionesFormularioVisibleFactura,jmenuBarVisibleFactura,jmenuBarDetalleVisibleFactura,jTtoolBarVisibleFactura,jTtoolBarDetalleVisibleFactura));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVisibleFactura(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVisibleFactura(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVisibleFactura(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVisibleFactura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVisibleFactura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVisibleFactura,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVisibleFactura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVisibleFactura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVisibleFactura,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.visiblefacturaConstantesFunciones.getsFinalQueryVisibleFactura();
		String  finalQueryPaginacionTodos=this.visiblefacturaConstantesFunciones.getsFinalQueryVisibleFactura();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=VisibleFacturaConstantesFunciones.getArrayColumnasGlobalesNoVisibleFactura(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VisibleFacturaConstantesFunciones.getArrayColumnasGlobalesVisibleFactura(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VisibleFacturaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.visiblefacturasEliminados= new ArrayList<VisibleFactura>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVisibleFactura();
		
				///*VisibleFacturaSessionBean*/this.visiblefacturaSessionBean=new VisibleFacturaSessionBean();
			
			if(this.visiblefacturaSessionBean==null) {
				this.visiblefacturaSessionBean=new VisibleFacturaSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=VisibleFacturaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VisibleFacturaConstantesFunciones.getClassesForeignKeysOfVisibleFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/visiblefactura."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			visiblefacturasAux= new ArrayList<VisibleFactura>();
			
				
			visiblefacturaLogic.setDatosCliente(this.datosCliente);
			visiblefacturaLogic.setDatosDeep(this.datosDeep);
			visiblefacturaLogic.setIsConDeep(true);
			
			
			visiblefacturaLogic.getVisibleFacturaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					visiblefacturaLogic.getTodosVisibleFacturas(finalQueryGlobal,pagination);
					
					//visiblefacturaLogic.getTodosVisibleFacturasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(visiblefacturaLogic.getVisibleFacturas()==null|| visiblefacturaLogic.getVisibleFacturas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							visiblefacturasAux= new ArrayList<VisibleFactura>();
							visiblefacturasAux.addAll(visiblefacturaLogic.getVisibleFacturas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							visiblefacturasAux= new ArrayList<VisibleFactura>();
							visiblefacturasAux.addAll(visiblefacturas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							visiblefacturaLogic.getTodosVisibleFacturas(finalQueryGlobal+"",this.pagination);												
							
							//visiblefacturaLogic.getTodosVisibleFacturasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteVisibleFacturas("Todos",visiblefacturaLogic.getVisibleFacturas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							visiblefacturaLogic.setVisibleFacturas(new ArrayList<VisibleFactura>());					
							visiblefacturaLogic.getVisibleFacturas().addAll(visiblefacturasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							visiblefacturas=new ArrayList<VisibleFactura>();
							visiblefacturas.addAll(visiblefacturasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idVisibleFactura=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idVisibleFactura=this.idActual;
				
				} else if(this.idVisibleFacturaActual!=null && this.idVisibleFacturaActual!=0L) {
					idVisibleFactura=idVisibleFacturaActual;
				}
				
					
				this.sDetalleReporte=VisibleFacturaConstantesFunciones.getDetalleIndicePorId(idVisibleFactura);
				
				this.visiblefacturas=new ArrayList<VisibleFactura>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					visiblefacturaLogic.getEntity(idVisibleFactura);
					
					//visiblefacturaLogic.getEntityWithConnection(idVisibleFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					visiblefacturaLogic.setVisibleFacturas(new ArrayList<VisibleFactura>());
					visiblefacturaLogic.getVisibleFacturas().add(visiblefacturaLogic.getVisibleFactura());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.visiblefacturas=new ArrayList<VisibleFactura>();
					this.visiblefacturas.add(visiblefactura);
				}
				
				if(visiblefacturaLogic.getVisibleFactura()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=VisibleFacturaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					visiblefacturaLogic.getVisibleFacturasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VisibleFacturaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VisibleFacturaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=visiblefacturaLogic.getVisibleFacturas()==null||visiblefacturaLogic.getVisibleFacturas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=visiblefacturas==null|| visiblefacturas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						visiblefacturasAux=new ArrayList<VisibleFactura>();
						visiblefacturasAux.addAll(visiblefacturaLogic.getVisibleFacturas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							visiblefacturasAux=new ArrayList<VisibleFactura>();
							visiblefacturasAux.addAll(visiblefacturas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							visiblefacturaLogic.getVisibleFacturasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VisibleFacturaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VisibleFacturaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVisibleFacturas("FK_IdEmpresa",visiblefacturaLogic.getVisibleFacturas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVisibleFacturas("FK_IdEmpresa",visiblefacturas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						visiblefacturaLogic.setVisibleFacturas(new ArrayList<VisibleFactura>());
						visiblefacturaLogic.getVisibleFacturas().addAll(visiblefacturasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							visiblefacturas=new ArrayList<VisibleFactura>();
							visiblefacturas.addAll(visiblefacturasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVisibleFactura();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVisibleFactura();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=visiblefacturaLogic.getVisibleFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=visiblefacturas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=visiblefacturaLogic.getVisibleFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=visiblefacturas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VisibleFactura visiblefactura) {
		Boolean permite=true;
		
		if(this.visiblefactura.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VisibleFacturaConstantesFunciones.getOrderByListaVisibleFactura();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VisibleFacturaConstantesFunciones.getOrderByListaVisibleFactura();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VisibleFactura visiblefactura:visiblefacturaLogic.getVisibleFacturas()) {
				if(visiblefactura.getsType().equals(Constantes2.S_TOTALES)) {
					visiblefacturaTotales=visiblefactura;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VisibleFactura visiblefactura:this.visiblefacturas) {
				if(visiblefactura.getsType().equals(Constantes2.S_TOTALES)) {
					visiblefacturaTotales=visiblefactura;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.visiblefacturaAux=new VisibleFactura();
			this.visiblefacturaAux.setsType(Constantes2.S_TOTALES);
			this.visiblefacturaAux.setIsNew(false);
			this.visiblefacturaAux.setIsChanged(false);
			this.visiblefacturaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				VisibleFacturaConstantesFunciones.TotalizarValoresFilaVisibleFactura(this.visiblefacturaLogic.getVisibleFacturas(),this.visiblefacturaAux);
				
				this.visiblefacturaLogic.getVisibleFacturas().add(this.visiblefacturaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VisibleFacturaConstantesFunciones.TotalizarValoresFilaVisibleFactura(this.visiblefacturas,this.visiblefacturaAux);
				
				this.visiblefacturas.add(this.visiblefacturaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		visiblefacturaTotales=new VisibleFactura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.visiblefacturaLogic.getVisibleFacturas().remove(visiblefacturaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.visiblefacturas.remove(visiblefacturaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		visiblefacturaTotales=new VisibleFactura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VisibleFactura visiblefactura:visiblefacturaLogic.getVisibleFacturas()) {
				if(visiblefactura.getsType().equals(Constantes2.S_TOTALES)) {
					visiblefacturaTotales=visiblefactura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VisibleFacturaConstantesFunciones.TotalizarValoresFilaVisibleFactura(this.visiblefacturaLogic.getVisibleFacturas(),visiblefacturaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VisibleFactura visiblefactura:this.visiblefacturas) {
				if(visiblefactura.getsType().equals(Constantes2.S_TOTALES)) {
					visiblefacturaTotales=visiblefactura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VisibleFacturaConstantesFunciones.TotalizarValoresFilaVisibleFactura(this.visiblefacturas,visiblefacturaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVisibleFacturasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVisibleFacturasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					visiblefacturaLogic.getVisibleFacturasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosVisibleFactura() {
		this.isPermisoTodoVisibleFactura=false;
		this.isPermisoNuevoVisibleFactura=false;
		this.isPermisoActualizarVisibleFactura=false;
		this.isPermisoActualizarOriginalVisibleFactura=false;
		this.isPermisoEliminarVisibleFactura=false;
		this.isPermisoGuardarCambiosVisibleFactura=false;
		this.isPermisoConsultaVisibleFactura=false;
		this.isPermisoBusquedaVisibleFactura=false;
		this.isPermisoReporteVisibleFactura=false;		
		this.isPermisoOrdenVisibleFactura=false;		
		this.isPermisoPaginacionMedioVisibleFactura=false;		
		this.isPermisoPaginacionAltoVisibleFactura=false;
		this.isPermisoPaginacionTodoVisibleFactura=false;
		this.isPermisoCopiarVisibleFactura=false;		
		this.isPermisoVerFormVisibleFactura=false;		
		this.isPermisoDuplicarVisibleFactura=false;		
		this.isPermisoOrdenVisibleFactura=false;		
	}
	
	public void setPermisosUsuarioVisibleFactura(Boolean isPermiso) {
		this.isPermisoTodoVisibleFactura=isPermiso;
		this.isPermisoNuevoVisibleFactura=isPermiso;
		this.isPermisoActualizarVisibleFactura=isPermiso;
		this.isPermisoActualizarOriginalVisibleFactura=isPermiso;
		this.isPermisoEliminarVisibleFactura=isPermiso;
		this.isPermisoGuardarCambiosVisibleFactura=isPermiso;
		this.isPermisoConsultaVisibleFactura=isPermiso;
		this.isPermisoBusquedaVisibleFactura=isPermiso;
		this.isPermisoReporteVisibleFactura=isPermiso;
		this.isPermisoOrdenVisibleFactura=isPermiso;		
		this.isPermisoPaginacionMedioVisibleFactura=isPermiso;		
		this.isPermisoPaginacionAltoVisibleFactura=isPermiso;		
		this.isPermisoPaginacionTodoVisibleFactura=isPermiso;		
		this.isPermisoCopiarVisibleFactura=isPermiso;		
		this.isPermisoVerFormVisibleFactura=isPermiso;		
		this.isPermisoDuplicarVisibleFactura=isPermiso;
		this.isPermisoOrdenVisibleFactura=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVisibleFactura(Boolean isPermiso) {
		//this.isPermisoTodoVisibleFactura=isPermiso;
		this.isPermisoNuevoVisibleFactura=isPermiso;
		this.isPermisoActualizarVisibleFactura=isPermiso;
		this.isPermisoActualizarOriginalVisibleFactura=isPermiso;
		this.isPermisoEliminarVisibleFactura=isPermiso;
		this.isPermisoGuardarCambiosVisibleFactura=isPermiso;
		//this.isPermisoConsultaVisibleFactura=isPermiso;
		//this.isPermisoBusquedaVisibleFactura=isPermiso;
		//this.isPermisoReporteVisibleFactura=isPermiso;
		//this.isPermisoOrdenVisibleFactura=isPermiso;		
		//this.isPermisoPaginacionMedioVisibleFactura=isPermiso;		
		//this.isPermisoPaginacionAltoVisibleFactura=isPermiso;		
		//this.isPermisoPaginacionTodoVisibleFactura=isPermiso;		
		//this.isPermisoCopiarVisibleFactura=isPermiso;		
		//this.isPermisoDuplicarVisibleFactura=isPermiso;
		//this.isPermisoOrdenVisibleFactura=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVisibleFacturaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VisibleFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebVisibleFactura(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVisibleFacturaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVisibleFacturaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVisibleFacturaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVisibleFacturaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVisibleFactura() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VisibleFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VisibleFacturaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVisibleFactura=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVisibleFactura=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVisibleFactura=this.isPermisoActualizarVisibleFactura;
			this.isPermisoEliminarVisibleFactura=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVisibleFactura=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVisibleFactura=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVisibleFactura=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVisibleFactura=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVisibleFactura=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVisibleFactura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVisibleFactura=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVisibleFactura=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVisibleFactura=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVisibleFactura=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVisibleFactura=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVisibleFactura=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVisibleFactura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVisibleFactura.setToolTipText(this.jTableDatosVisibleFactura.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVisibleFactura(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVisibleFactura(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VisibleFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(VisibleFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioVisibleFactura() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyVisibleFacturaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVisibleFacturaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VisibleFacturaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyVisibleFacturaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyVisibleFacturaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			VisibleFacturaParameterReturnGeneral visiblefacturaReturnGeneral=new VisibleFacturaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.visiblefacturaConstantesFunciones.cargarid_empresaVisibleFactura)
					 || (this.esRecargarFks && this.visiblefacturaConstantesFunciones.cargarid_empresaVisibleFactura)) {

					if(!this.visiblefacturaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+visiblefacturaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				visiblefacturaReturnGeneral=visiblefacturaLogic.cargarCombosLoteForeignKeyVisibleFactura(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=visiblefacturaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyVisibleFactura()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.visiblefacturaSessionBean==null) {
				this.visiblefacturaSessionBean=new VisibleFacturaSessionBean();
			}

			if(!this.visiblefacturaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyVisibleFactura()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVisibleFactura(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVisibleFactura()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVisibleFactura();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVisibleFactura(VisibleFactura visiblefactura)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVisibleFactura(VisibleFactura visiblefactura,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVisibleFactura()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVisibleFactura()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVisibleFactura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVisibleFactura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVisibleFactura()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVisibleFactura()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVisibleFactura(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVisibleFactura()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura!=null && this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura.getItemCount()>0) {
				this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public VisibleFacturaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VisibleFacturaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VisibleFacturaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.visiblefacturaSessionBean=new VisibleFacturaSessionBean(); 
		this.visiblefacturaConstantesFunciones=new VisibleFacturaConstantesFunciones(); 
		this.visiblefacturaBean=new VisibleFactura();//(this.visiblefacturaConstantesFunciones); 		
		this.visiblefacturaReturnGeneral=new VisibleFacturaParameterReturnGeneral(); 
		
		this.visiblefacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.visiblefacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VisibleFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VisibleFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VisibleFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVisibleFactura(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.visiblefacturaConstantesFunciones=new VisibleFacturaConstantesFunciones(); 
			this.visiblefacturaBean=new VisibleFactura();//this.visiblefacturaConstantesFunciones); 			
			this.visiblefacturaReturnGeneral=new VisibleFacturaParameterReturnGeneral(); 
		
			VisibleFacturaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Visibilidad Factura Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.visiblefactura=new VisibleFactura();
			this.visiblefacturas = new ArrayList<VisibleFactura>();
			this.visiblefacturasAux = new ArrayList<VisibleFactura>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic=new VisibleFacturaLogic();
				this.visiblefacturaLogic.getNewConnexionToDeep("");
			}
			
			//this.visiblefacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.visiblefacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVisibleFactura);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVisibleFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVisibleFactura);	
					}
					
					if(this.jInternalFrameImportacionVisibleFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVisibleFactura);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVisibleFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVisibleFactura);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVisibleFactura);
				this.jInternalFrameDetalleFormVisibleFactura.setVisible(false);
				this.jInternalFrameDetalleFormVisibleFactura.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVisibleFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVisibleFactura);
					this.jInternalFrameReporteDinamicoVisibleFactura.setVisible(false);
					this.jInternalFrameReporteDinamicoVisibleFactura.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVisibleFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVisibleFactura);
					this.jInternalFrameImportacionVisibleFactura.setVisible(false);
					this.jInternalFrameImportacionVisibleFactura.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVisibleFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVisibleFactura);
					this.jInternalFrameOrderByVisibleFactura.setVisible(false);
					this.jInternalFrameOrderByVisibleFactura.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVisibleFacturaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VisibleFacturaConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.visiblefacturaReturnGeneral=new VisibleFacturaParameterReturnGeneral();
			
			this.visiblefacturaParameterGeneral=new VisibleFacturaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.visiblefacturaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(VisibleFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VisibleFacturaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.visiblefacturaSessionBean.getEsGuardarRelacionado(),this.visiblefacturaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VisibleFacturaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.visiblefacturaSessionBean.getEsGuardarRelacionado(),this.visiblefacturaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoVisibleFactura=false;
			this.isVisibilidadCeldaDuplicarVisibleFactura=true;
			this.isVisibilidadCeldaCopiarVisibleFactura=true;
			this.isVisibilidadCeldaVerFormVisibleFactura=true;
			this.isVisibilidadCeldaOrdenVisibleFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=false;
			this.isVisibilidadCeldaModificarVisibleFactura=false;
			this.isVisibilidadCeldaActualizarVisibleFactura=false;
			this.isVisibilidadCeldaEliminarVisibleFactura=false;
			this.isVisibilidadCeldaCancelarVisibleFactura=false;
			this.isVisibilidadCeldaGuardarVisibleFactura=false;
			this.isVisibilidadCeldaGuardarCambiosVisibleFactura=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVisibleFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVisibleFactura();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVisibleFactura(false);
			
			this.setPermisosUsuarioVisibleFactura();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado() 
				|| (this.visiblefacturaSessionBean.getEsGuardarRelacionado() && this.visiblefacturaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVisibleFacturaClasesRelacionadas();
			}
			
			if(this.visiblefacturaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVisibleFacturaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVisibleFactura();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVisibleFactura();
			}
			
			if(!this.isPermisoBusquedaVisibleFactura) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVisibleFactura.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioVisibleFactura,this.isPermisoPaginacionMedioVisibleFactura,this.isPermisoPaginacionTodoVisibleFactura);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VisibleFacturaConstantesFunciones.getTiposSeleccionarVisibleFactura());
				
				this.tiposColumnasSelect=VisibleFacturaConstantesFunciones.getTiposSeleccionarVisibleFactura(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVisibleFactura();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioVisibleFactura(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioVisibleFactura(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVisibleFactura() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				visiblefacturaImplementable= (VisibleFacturaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VisibleFacturaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				visiblefacturaImplementableHome= (VisibleFacturaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VisibleFacturaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.visiblefacturas= new ArrayList<VisibleFactura>();
			this.visiblefacturasEliminados= new ArrayList<VisibleFactura>();
						
			this.isEsNuevoVisibleFactura=false;
			this.esParaAccionDesdeFormularioVisibleFactura=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVisibleFactura(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVisibleFactura();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VisibleFacturaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VisibleFacturaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVisibleFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVisibleFactura(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVisibleFactura!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVisibleFactura();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVisibleFactura();
			}
			
			VisibleFacturaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVisibleFactura.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVisibleFactura.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVisibleFactura.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVisibleFactura(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VisibleFactura: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVisibleFactura() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVisibleFactura")) {
				iIndex=this.jInternalFrameDetalleFormVisibleFactura.jTabbedPaneRelacionesVisibleFactura.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVisibleFactura.jTabbedPaneRelacionesVisibleFactura.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVisibleFactura();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyVisibleFactura(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVisibleFactura(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVisibleFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVisibleFacturaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVisibleFactura();
		
		this.cargarCombosFrameForeignKeyVisibleFactura();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVisibleFactura();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVisibleFactura();
		}
	}
	
	
	
	public void jButtonNuevoVisibleFacturaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.visiblefacturaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVisibleFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			
			
			if(jTableDatosVisibleFactura.getRowCount()>=1) {
				jTableDatosVisibleFactura.removeRowSelectionInterval(0, jTableDatosVisibleFactura.getRowCount()-1);						
			}
			
			this.isEsNuevoVisibleFactura=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVisibleFactura(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVisibleFactura(true);			
			//this.visiblefactura=new VisibleFactura();
			//this.visiblefactura.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVisibleFactura(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVisibleFactura() ;
			
			if(VisibleFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVisibleFactura(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.visiblefactura);	
			this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);				
			
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			
			if(this.visiblefacturaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VisibleFactura: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVisibleFacturaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VisibleFactura> visiblefacturasSeleccionados=new ArrayList<VisibleFactura>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVisibleFactura.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVisibleFactura.getSelectedRows().length;			
			}
			
			visiblefacturasSeleccionados=this.getVisibleFacturasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVisibleFactura--;			
				//VisibleFactura visiblefacturaAux= new VisibleFactura();			
				//visiblefacturaAux.setId(this.iIdNuevoVisibleFactura);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VisibleFactura visiblefacturaOrigen=new VisibleFactura();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VisibleFactura visiblefacturaOrigen : visiblefacturasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							visiblefacturaOrigen =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							visiblefacturaOrigen =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVisibleFactura();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.visiblefactura.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVisibleFactura(visiblefacturaOrigen,this.visiblefactura,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.visiblefacturaLogic.getVisibleFacturas().add(this.visiblefacturaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.visiblefacturas.add(this.visiblefacturaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVisibleFactura(false);
				
				this.jTableDatosVisibleFactura.setRowSelectionInterval(this.getIndiceNuevoVisibleFactura(), this.getIndiceNuevoVisibleFactura());
				
				int iLastRow =  this.jTableDatosVisibleFactura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVisibleFactura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVisibleFactura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVisibleFactura(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VisibleFactura> visiblefacturasSeleccionados=new ArrayList<VisibleFactura>();									
		
			VisibleFactura visiblefacturaOrigen=new VisibleFactura();
			VisibleFactura visiblefacturaDestino=new VisibleFactura();
				
			visiblefacturasSeleccionados=this.getVisibleFacturasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVisibleFactura.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || visiblefacturasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVisibleFactura.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						visiblefacturaOrigen =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						visiblefacturaOrigen =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						visiblefacturaDestino =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						visiblefacturaDestino =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				visiblefacturaOrigen =visiblefacturasSeleccionados.get(0);
				visiblefacturaDestino =visiblefacturasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVisibleFactura(visiblefacturaOrigen,visiblefacturaDestino,true,false);
				
				visiblefacturaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(visiblefacturaDestino,visiblefacturaLogic.getVisibleFacturas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(visiblefacturaDestino,visiblefacturas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVisibleFactura(false);
				
				//this.jTableDatosVisibleFactura.setRowSelectionInterval(this.getIndiceNuevoVisibleFactura(), this.getIndiceNuevoVisibleFactura());
				
				int iLastRow =  this.jTableDatosVisibleFactura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVisibleFactura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVisibleFactura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVisibleFactura(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVisibleFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVisibleFactura.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVisibleFactura.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVisibleFactura.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVisibleFactura.setVisible(!isVisible);
			this.jPanelPaginacionVisibleFactura.setVisible(!isVisible);
			this.jPanelAccionesVisibleFactura.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVisibleFactura();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVisibleFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVisibleFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVisibleFactura();
			
			this.abrirFrameOrderByVisibleFactura();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVisibleFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVisibleFactura(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVisibleFactura);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVisibleFactura.isMaximum()) {
					this.jInternalFrameDetalleFormVisibleFactura.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVisibleFactura.setSize(this.jInternalFrameDetalleFormVisibleFactura.iWidthFormulario,this.jInternalFrameDetalleFormVisibleFactura.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVisibleFactura.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVisibleFactura.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVisibleFactura.isMaximum()) {
						this.jInternalFrameDetalleFormVisibleFactura.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVisibleFactura.jContentPaneDetalleVisibleFactura.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVisibleFactura.jTabbedPaneRelacionesVisibleFactura.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVisibleFactura.jContentPaneDetalleVisibleFactura.getWidth(),VisibleFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVisibleFactura.jTabbedPaneRelacionesVisibleFactura.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVisibleFactura.jContentPaneDetalleVisibleFactura.getWidth(),VisibleFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVisibleFactura.jTabbedPaneRelacionesVisibleFactura.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVisibleFactura.jContentPaneDetalleVisibleFactura.getWidth(),VisibleFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVisibleFactura.setVisible(true);
	        this.jInternalFrameDetalleFormVisibleFactura.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVisibleFactura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVisibleFactura==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVisibleFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVisibleFactura,false,this);
				} else {
					this.jInternalFrameOrderByVisibleFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVisibleFactura,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVisibleFactura);
				this.jInternalFrameOrderByVisibleFactura.setVisible(false);
				this.jInternalFrameOrderByVisibleFactura.setSelected(false);
				
				this.jInternalFrameOrderByVisibleFactura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVisibleFactura"));
				
				this.inicializarActualizarBindingTablaOrderByVisibleFactura();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVisibleFactura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVisibleFactura==null) {
				
				this.jInternalFrameImportacionVisibleFactura=new ImportacionJInternalFrame(VisibleFacturaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVisibleFactura);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVisibleFactura);
				this.jInternalFrameImportacionVisibleFactura.setVisible(false);
				this.jInternalFrameImportacionVisibleFactura.setSelected(false);


				this.jInternalFrameImportacionVisibleFactura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVisibleFactura"));
				this.jInternalFrameImportacionVisibleFactura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVisibleFactura"));
				this.jInternalFrameImportacionVisibleFactura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVisibleFactura"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVisibleFactura() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVisibleFactura==null) {
				this.jInternalFrameReporteDinamicoVisibleFactura=new ReporteDinamicoJInternalFrame(VisibleFacturaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVisibleFactura);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVisibleFactura);
				this.jInternalFrameReporteDinamicoVisibleFactura.setVisible(false);
				this.jInternalFrameReporteDinamicoVisibleFactura.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVisibleFactura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVisibleFactura"));
				this.jInternalFrameReporteDinamicoVisibleFactura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVisibleFactura"));
				this.jInternalFrameReporteDinamicoVisibleFactura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVisibleFactura"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVisibleFactura();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVisibleFactura() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVisibleFactura);
			
	       	this.jInternalFrameDetalleFormVisibleFactura.setVisible(false);
	        this.jInternalFrameDetalleFormVisibleFactura.setSelected(false);
			
			//this.jInternalFrameDetalleFormVisibleFactura.dispose();
			//this.jInternalFrameDetalleFormVisibleFactura=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVisibleFactura() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVisibleFactura.setVisible(true);
	        this.jInternalFrameReporteDinamicoVisibleFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVisibleFactura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVisibleFactura.setVisible(true);
	        this.jInternalFrameImportacionVisibleFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVisibleFactura() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVisibleFactura.setVisible(true);
	        this.jInternalFrameOrderByVisibleFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVisibleFactura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVisibleFactura.setVisible(false);
	        this.jInternalFrameOrderByVisibleFactura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVisibleFactura() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVisibleFactura.setVisible(false);
	        this.jInternalFrameReporteDinamicoVisibleFactura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVisibleFactura() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVisibleFactura.setVisible(false);
	        this.jInternalFrameImportacionVisibleFactura.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVisibleFactura(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVisibleFactura(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVisibleFactura(true);
			//this.isEsNuevoVisibleFactura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVisibleFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVisibleFactura(false) ;
			
			if(visiblefacturaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VisibleFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVisibleFactura(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVisibleFactura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVisibleFacturaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVisibleFactura(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVisibleFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVisibleFactura(true);
			//this.isEsNuevoVisibleFactura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.visiblefactura.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVisibleFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVisibleFactura(false) ;
			
			if(VisibleFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVisibleFactura(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVisibleFactura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVisibleFactura(false);
			
			//if(!this.isEsNuevoVisibleFactura) {								
				int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
				
			}
			
			if(this.permiteMantenimiento(this.visiblefactura)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVisibleFactura=true;
					this.inicializarActualizarBindingTablaVisibleFactura(false);
					this.isEsNuevoVisibleFactura=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVisibleFactura=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVisibleFactura=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVisibleFactura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVisibleFactura(false);
				
				this.habilitarDeshabilitarControlesVisibleFactura(false);
			
												
				
				if(VisibleFacturaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVisibleFactura();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVisibleFacturaActionPerformed(evt,visiblefacturaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVisibleFactura(this.visiblefactura,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVisibleFactura.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,visiblefacturaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.visiblefactura.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VisibleFactura.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VisibleFactura.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				this.visiblefactura.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				this.visiblefactura.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.visiblefactura)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VisibleFacturaModel) this.jTableDatosVisibleFactura.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVisibleFactura=true;
				this.inicializarActualizarBindingTablaVisibleFactura(false);
				this.isEsNuevoVisibleFactura=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVisibleFactura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVisibleFactura(false);
				
				this.habilitarDeshabilitarControlesVisibleFactura(false);
				
				
				
				if(VisibleFacturaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVisibleFactura();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVisibleFactura.getRowCount()>=1) {
				jTableDatosVisibleFactura.removeRowSelectionInterval(0, jTableDatosVisibleFactura.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVisibleFactura(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVisibleFactura(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVisibleFactura(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVisibleFactura(false) ;
			
			this.isEsNuevoVisibleFactura=false;
			
			if(VisibleFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVisibleFactura();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVisibleFactura(false);
				
				//SI ES MANUAL
				if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVisibleFactura();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVisibleFactura--;			
			//VisibleFactura visiblefacturaAux= new VisibleFactura();			
			//visiblefacturaAux.setId(this.iIdNuevoVisibleFactura);
			
			if(this.jInternalFrameDetalleFormVisibleFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVisibleFactura();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
			
			this.visiblefactura.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.visiblefacturaLogic.getVisibleFacturas().add(this.visiblefacturaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.visiblefacturas.add(this.visiblefacturaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVisibleFactura(false);
			
			this.jTableDatosVisibleFactura.setRowSelectionInterval(this.getIndiceNuevoVisibleFactura(), this.getIndiceNuevoVisibleFactura());
			
			int iLastRow =  this.jTableDatosVisibleFactura.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVisibleFactura.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVisibleFactura.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVisibleFactura(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVisibleFactura(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVisibleFactura(false);
			
			//SI ES MANUAL
			if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVisibleFactura();
			}
			
			//this.abrirFrameTreeVisibleFactura();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Visibilidad FacturaS ?", "MANTENIMIENTO DE Visibilidad Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionVisibleFactura.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralVisibleFactura();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.visiblefacturaReturnGeneral=visiblefacturaLogic.procesarImportacionVisibleFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.visiblefacturaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarVisibleFacturaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVisibleFactura.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVisibleFactura.setFileImportacion(this.jInternalFrameImportacionVisibleFactura.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVisibleFactura.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVisibleFactura.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVisibleFactura.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVisibleFactura.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VisibleFactura> visiblefacturasSeleccionados=new ArrayList<VisibleFactura>();		

		visiblefacturasSeleccionados=this.getVisibleFacturasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVisibleFactura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVisibleFactura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VisibleFacturaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VisibleFacturaBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteVisibleFacturas("Todos",visiblefacturasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visibilidad Factura",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoVisibleFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVisibleFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_beConsignatario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_beConsignatario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_beConsignatario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_beConsignatario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_beTipoTasa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_beTipoTasa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_beTipoTasa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_beTipoTasa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_beConsultor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_beConsultor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_beConsultor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_beConsultor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEICE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_beIce_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_beIce_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_beIce_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_beIce_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_beTransporte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_beTransporte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_beTransporte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_beTransporte_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEFUE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_beFue_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_beFue_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_beFue_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_beFue_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_beOrden_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_beOrden_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_beOrden_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_beOrden_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taAutoriPrecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taAutoriPrecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taAutoriPrecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taAutoriPrecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAAREA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taArea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taArea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taArea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taArea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAFOTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taFoto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taFoto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taFoto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taFoto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoVisibleFactura.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVisibleFactura.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVisibleFactura.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO:
					sNombreCampoCategoria="cabe_consignatario";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA:
					sNombreCampoCategoria="cabe_tipo_tasa";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR:
					sNombreCampoCategoria="cabe_consultor";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEICE:
					sNombreCampoCategoria="cabe_ice";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE:
					sNombreCampoCategoria="cabe_transporte";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEFUE:
					sNombreCampoCategoria="cabe_fue";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEORDEN:
					sNombreCampoCategoria="cabe_orden";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO:
					sNombreCampoCategoria="deta_autori_precio";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAAREA:
					sNombreCampoCategoria="deta_area";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAFOTO:
					sNombreCampoCategoria="deta_foto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVisibleFactura.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO:
					sNombreCampoCategoriaValor="cabe_consignatario";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA:
					sNombreCampoCategoriaValor="cabe_tipo_tasa";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR:
					sNombreCampoCategoriaValor="cabe_consultor";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEICE:
					sNombreCampoCategoriaValor="cabe_ice";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE:
					sNombreCampoCategoriaValor="cabe_transporte";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEFUE:
					sNombreCampoCategoriaValor="cabe_fue";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEORDEN:
					sNombreCampoCategoriaValor="cabe_orden";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO:
					sNombreCampoCategoriaValor="deta_autori_precio";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAAREA:
					sNombreCampoCategoriaValor="deta_area";
					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAFOTO:
					sNombreCampoCategoriaValor="deta_foto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVisibleFactura.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVisibleFactura.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Consignatario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cabe_consignatario");
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Tasa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cabe_tipo_tasa");
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Consultor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cabe_consultor");
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEICE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cabe_ice");
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transporte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cabe_transporte");
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEFUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fuente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cabe_fue");
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cabe_orden");
					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Autorizacion Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"deta_autori_precio");
					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAAREA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Area",sNombreCampoCategoria,sNombreCampoCategoriaValor,"deta_area");
					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAFOTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Foto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"deta_foto");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VisibleFactura> visiblefacturasSeleccionados=new ArrayList<VisibleFactura>();		
		
		visiblefacturasSeleccionados=this.getVisibleFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"visiblefactura";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("VisibleFacturas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVisibleFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVisibleFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VisibleFactura visiblefactura:visiblefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visiblefactura.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO);
					iRow++;

					for(VisibleFactura visiblefactura:visiblefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visiblefactura.getcabe_consignatario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA);
					iRow++;

					for(VisibleFactura visiblefactura:visiblefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visiblefactura.getcabe_tipo_tasa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR);
					iRow++;

					for(VisibleFactura visiblefactura:visiblefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visiblefactura.getcabe_consultor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEICE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABEICE);
					iRow++;

					for(VisibleFactura visiblefactura:visiblefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visiblefactura.getcabe_ice());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE);
					iRow++;

					for(VisibleFactura visiblefactura:visiblefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visiblefactura.getcabe_transporte());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEFUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABEFUE);
					iRow++;

					for(VisibleFactura visiblefactura:visiblefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visiblefactura.getcabe_fue());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VisibleFacturaConstantesFunciones.LABEL_CABEORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABEORDEN);
					iRow++;

					for(VisibleFactura visiblefactura:visiblefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visiblefactura.getcabe_orden());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO);
					iRow++;

					for(VisibleFactura visiblefactura:visiblefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visiblefactura.getdeta_autori_precio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAAREA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_DETAAREA);
					iRow++;

					for(VisibleFactura visiblefactura:visiblefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visiblefactura.getdeta_area());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VisibleFacturaConstantesFunciones.LABEL_DETAFOTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_DETAFOTO);
					iRow++;

					for(VisibleFactura visiblefactura:visiblefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(visiblefactura.getdeta_foto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelVisibleFactura(row);				
			//	iRow++;
			//}				
			
			//for(VisibleFactura visiblefacturaAux:visiblefacturasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVisibleFactura(visiblefacturaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visibilidad Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVisibleFactura(false);
			
			//SI ES MANUAL
			if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVisibleFactura();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVisibleFactura(false);
			
			//SI ES MANUAL
			if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVisibleFactura();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVisibleFactura(false);
			
			//SI ES MANUAL
			if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVisibleFactura();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVisibleFactura() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVisibleFactura.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVisibleFactura.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVisibleFactura.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVisibleFactura.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVisibleFactura.setMinimumSize(dimensionMinimum);
		this.jTableDatosVisibleFactura.setMaximumSize(dimensionMaximum);
		this.jTableDatosVisibleFactura.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVisibleFactura(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVisibleFactura(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVisibleFactura(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVisibleFactura(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVisibleFactura(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVisibleFactura(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVisibleFactura(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVisibleFactura(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VisibleFacturaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVisibleFactura() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVisibleFactura();
		
		this.inicializarActualizarBindingBotonesManualVisibleFactura(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVisibleFactura();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVisibleFactura() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVisibleFactura(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVisibleFactura(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVisibleFactura.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVisibleFactura.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVisibleFactura.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxPostAccionNuevoVisibleFactura.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxPostAccionSinCerrarVisibleFactura.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxPostAccionSinMensajeVisibleFactura.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVisibleFactura.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVisibleFactura.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVisibleFactura.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
				this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxPostAccionNuevoVisibleFactura.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxPostAccionSinCerrarVisibleFactura.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxPostAccionSinMensajeVisibleFactura.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVisibleFactura.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVisibleFactura.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVisibleFactura.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVisibleFactura!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVisibleFactura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVisibleFactura.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVisibleFactura.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVisibleFactura.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVisibleFactura.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVisibleFactura!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVisibleFactura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVisibleFactura.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVisibleFactura.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVisibleFactura(Boolean esInicializar) throws Exception {
		try	{	
			if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVisibleFactura(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVisibleFactura() throws Exception {
		try	{
			if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVisibleFactura();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVisibleFactura() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVisibleFactura() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVisibleFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVisibleFactura.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVisibleFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVisibleFactura.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVisibleFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVisibleFactura.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVisibleFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVisibleFactura.addItem(reporte);
			}
			
			
			if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVisibleFactura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVisibleFactura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVisibleFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVisibleFactura.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVisibleFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVisibleFactura.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVisibleFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVisibleFactura.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVisibleFactura.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVisibleFactura();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVisibleFactura() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVisibleFactura!=null) {
				this.jInternalFrameReporteDinamicoVisibleFactura.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVisibleFactura.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVisibleFactura!=null) {
				this.jInternalFrameReporteDinamicoVisibleFactura.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVisibleFactura.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVisibleFactura!=null) {
				
				if(this.jInternalFrameReporteDinamicoVisibleFactura.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVisibleFactura.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVisibleFactura.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVisibleFactura.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVisibleFactura.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVisibleFactura.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVisibleFactura()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVisibleFactura(Boolean esInicializar) throws Exception {				
		if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVisibleFactura();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVisibleFactura() throws Exception {
		this.inicializarActualizarBindingTablaVisibleFactura(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVisibleFactura() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVisibleFactura.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVisibleFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVisibleFactura.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVisibleFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVisibleFactura.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVisibleFacturaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisibleFacturaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVisibleFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVisibleFactura.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVisibleFactura.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVisibleFactura(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=visiblefacturaLogic.getVisibleFacturas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=visiblefacturas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVisibleFactura.setModel(new VisibleFacturaModel(this.visiblefacturaLogic.getVisibleFacturas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVisibleFactura.setModel(new VisibleFacturaModel(this.visiblefacturas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVisibleFactura!=null && this.jInternalFrameOrderByVisibleFactura.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVisibleFactura();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVisibleFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO,visiblefacturaConstantesFunciones.resaltarSeleccionarVisibleFactura,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO,visiblefacturaConstantesFunciones.resaltarSeleccionarVisibleFactura,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVisibleFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,VisibleFacturaConstantesFunciones.LABEL_ID));

		if(this.visiblefacturaConstantesFunciones.mostraridVisibleFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisibleFacturaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.visiblefacturaConstantesFunciones.resaltaridVisibleFactura,this.visiblefacturaConstantesFunciones.activaridVisibleFactura,this,true,"idVisibleFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.visiblefacturaConstantesFunciones.resaltaridVisibleFactura,this.visiblefacturaConstantesFunciones.activaridVisibleFactura,this,true,"idVisibleFactura","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisibleFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.visiblefacturaConstantesFunciones.mostrarid_empresaVisibleFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.visiblefacturaConstantesFunciones.resaltarid_empresaVisibleFactura,this,this.visiblefacturaConstantesFunciones.activarid_empresaVisibleFactura));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.visiblefacturaConstantesFunciones.resaltarid_empresaVisibleFactura,this,this.visiblefacturaConstantesFunciones.activarid_empresaVisibleFactura,false,"id_empresaVisibleFactura","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisibleFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO));

		if(this.visiblefacturaConstantesFunciones.mostrarcabe_consignatarioVisibleFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.visiblefacturaConstantesFunciones.resaltarcabe_consignatarioVisibleFactura,this.visiblefacturaConstantesFunciones.activarcabe_consignatarioVisibleFactura));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.visiblefacturaConstantesFunciones.resaltarcabe_consignatarioVisibleFactura,this.visiblefacturaConstantesFunciones.activarcabe_consignatarioVisibleFactura,this,true,"cabe_consignatarioVisibleFactura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisibleFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA));

		if(this.visiblefacturaConstantesFunciones.mostrarcabe_tipo_tasaVisibleFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.visiblefacturaConstantesFunciones.resaltarcabe_tipo_tasaVisibleFactura,this.visiblefacturaConstantesFunciones.activarcabe_tipo_tasaVisibleFactura));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.visiblefacturaConstantesFunciones.resaltarcabe_tipo_tasaVisibleFactura,this.visiblefacturaConstantesFunciones.activarcabe_tipo_tasaVisibleFactura,this,true,"cabe_tipo_tasaVisibleFactura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisibleFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR));

		if(this.visiblefacturaConstantesFunciones.mostrarcabe_consultorVisibleFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.visiblefacturaConstantesFunciones.resaltarcabe_consultorVisibleFactura,this.visiblefacturaConstantesFunciones.activarcabe_consultorVisibleFactura));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.visiblefacturaConstantesFunciones.resaltarcabe_consultorVisibleFactura,this.visiblefacturaConstantesFunciones.activarcabe_consultorVisibleFactura,this,true,"cabe_consultorVisibleFactura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisibleFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,VisibleFacturaConstantesFunciones.LABEL_CABEICE));

		if(this.visiblefacturaConstantesFunciones.mostrarcabe_iceVisibleFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisibleFacturaConstantesFunciones.LABEL_CABEICE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.visiblefacturaConstantesFunciones.resaltarcabe_iceVisibleFactura,this.visiblefacturaConstantesFunciones.activarcabe_iceVisibleFactura));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.visiblefacturaConstantesFunciones.resaltarcabe_iceVisibleFactura,this.visiblefacturaConstantesFunciones.activarcabe_iceVisibleFactura,this,true,"cabe_iceVisibleFactura","BASICO"));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
			//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisibleFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE));

		if(this.visiblefacturaConstantesFunciones.mostrarcabe_transporteVisibleFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.visiblefacturaConstantesFunciones.resaltarcabe_transporteVisibleFactura,this.visiblefacturaConstantesFunciones.activarcabe_transporteVisibleFactura));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.visiblefacturaConstantesFunciones.resaltarcabe_transporteVisibleFactura,this.visiblefacturaConstantesFunciones.activarcabe_transporteVisibleFactura,this,true,"cabe_transporteVisibleFactura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisibleFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,VisibleFacturaConstantesFunciones.LABEL_CABEFUE));

		if(this.visiblefacturaConstantesFunciones.mostrarcabe_fueVisibleFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisibleFacturaConstantesFunciones.LABEL_CABEFUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.visiblefacturaConstantesFunciones.resaltarcabe_fueVisibleFactura,this.visiblefacturaConstantesFunciones.activarcabe_fueVisibleFactura));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.visiblefacturaConstantesFunciones.resaltarcabe_fueVisibleFactura,this.visiblefacturaConstantesFunciones.activarcabe_fueVisibleFactura,this,true,"cabe_fueVisibleFactura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisibleFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,VisibleFacturaConstantesFunciones.LABEL_CABEORDEN));

		if(this.visiblefacturaConstantesFunciones.mostrarcabe_ordenVisibleFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisibleFacturaConstantesFunciones.LABEL_CABEORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.visiblefacturaConstantesFunciones.resaltarcabe_ordenVisibleFactura,this.visiblefacturaConstantesFunciones.activarcabe_ordenVisibleFactura));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.visiblefacturaConstantesFunciones.resaltarcabe_ordenVisibleFactura,this.visiblefacturaConstantesFunciones.activarcabe_ordenVisibleFactura,this,true,"cabe_ordenVisibleFactura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisibleFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO));

		if(this.visiblefacturaConstantesFunciones.mostrardeta_autori_precioVisibleFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.visiblefacturaConstantesFunciones.resaltardeta_autori_precioVisibleFactura,this.visiblefacturaConstantesFunciones.activardeta_autori_precioVisibleFactura));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.visiblefacturaConstantesFunciones.resaltardeta_autori_precioVisibleFactura,this.visiblefacturaConstantesFunciones.activardeta_autori_precioVisibleFactura,this,true,"deta_autori_precioVisibleFactura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisibleFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,VisibleFacturaConstantesFunciones.LABEL_DETAAREA));

		if(this.visiblefacturaConstantesFunciones.mostrardeta_areaVisibleFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisibleFacturaConstantesFunciones.LABEL_DETAAREA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.visiblefacturaConstantesFunciones.resaltardeta_areaVisibleFactura,this.visiblefacturaConstantesFunciones.activardeta_areaVisibleFactura));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.visiblefacturaConstantesFunciones.resaltardeta_areaVisibleFactura,this.visiblefacturaConstantesFunciones.activardeta_areaVisibleFactura,this,true,"deta_areaVisibleFactura","BASICO"));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
			//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVisibleFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,VisibleFacturaConstantesFunciones.LABEL_DETAFOTO));

		if(this.visiblefacturaConstantesFunciones.mostrardeta_fotoVisibleFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VisibleFacturaConstantesFunciones.LABEL_DETAFOTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.visiblefacturaConstantesFunciones.resaltardeta_fotoVisibleFactura,this.visiblefacturaConstantesFunciones.activardeta_fotoVisibleFactura));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.visiblefacturaConstantesFunciones.resaltardeta_fotoVisibleFactura,this.visiblefacturaConstantesFunciones.activardeta_fotoVisibleFactura,this,true,"deta_fotoVisibleFactura","BASICO"));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
			//tableColumn.addPropertyChangeListener(new VisibleFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.visiblefacturaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.visiblefacturaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVisibleFactura.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.visiblefacturaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.visiblefacturaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVisibleFactura.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVisibleFactura && this.isPermisoGuardarCambiosVisibleFactura) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.visiblefacturaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.visiblefacturaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVisibleFactura.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosVisibleFactura.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVisibleFactura && this.isPermisoGuardarCambiosVisibleFactura) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVisibleFactura && this.isPermisoGuardarCambiosVisibleFactura) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVisibleFactura.moveColumn(this.jTableDatosVisibleFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVisibleFactura.moveColumn(this.jTableDatosVisibleFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVisibleFactura.moveColumn(this.jTableDatosVisibleFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVisibleFactura.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVisibleFactura.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVisibleFactura,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VisibleFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVisibleFactura.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVisibleFactura.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VisibleFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VisibleFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVisibleFactura.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVisibleFactura.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVisibleFactura.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=visiblefacturaLogic.getVisibleFacturas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=visiblefacturas.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosVisibleFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVisibleFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVisibleFactura();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoVisibleFactura=false;
					
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			
				if(this.visiblefacturaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVisibleFactura==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVisibleFactura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVisibleFactura.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.visiblefactura.getsType().equals("DUPLICADO")
				   || this.visiblefactura.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVisibleFactura=true;
				
				} else {
					this.isEsNuevoVisibleFactura=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
					if(this.visiblefactura.getId()>=0 && !this.visiblefactura.getIsNew()) {						
						this.isEsNuevoVisibleFactura=false;
						
					} else {
						this.isEsNuevoVisibleFactura=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVisibleFactura(esRelaciones);						
				
				this.seleccionarVisibleFactura(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.visiblefactura.getId()<0) {
					this.isEsNuevoVisibleFactura=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVisibleFactura(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVisibleFactura(evt,rowIndex);
				}	
				
				if(this.visiblefacturaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VisibleFactura: " + this.dDif); 
					}
				}								
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVisibleFactura(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.visiblefactura)) {
					if(this.visiblefactura.getId()>0) {
						this.visiblefactura.setIsDeleted(true);
						
						this.visiblefacturasEliminados.add(this.visiblefactura);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.visiblefacturaLogic.getVisibleFacturas().remove(this.visiblefactura);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.visiblefacturas.remove(this.visiblefactura);				
					}
					
					
					((VisibleFacturaModel) this.jTableDatosVisibleFactura.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVisibleFactura(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVisibleFactura(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVisibleFactura) {
			
			if(this.jInternalFrameDetalleFormVisibleFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVisibleFactura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVisibleFactura.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVisibleFactura(this.visiblefactura);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.visiblefacturaConstantesFunciones.cargarid_empresaVisibleFactura || this.visiblefacturaConstantesFunciones.event_dependid_empresaVisibleFactura) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.visiblefactura.getid_empresa());
									//this.inicializarActualizarBindingVisibleFactura(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(visiblefactura.getEmpresa()!=null) {
							this.empresasForeignKey.add(visiblefactura.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.visiblefactura.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVisibleFactura("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVisibleFactura(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVisibleFactura() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVisibleFactura(VisibleFactura visiblefactura) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVisibleFactura(visiblefactura,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVisibleFactura(VisibleFactura visiblefactura,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVisibleFactura(visiblefactura);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVisibleFactura(visiblefactura,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVisibleFactura(visiblefactura);
	}
	
	public void setVariablesObjetoActualToFormularioVisibleFactura(VisibleFactura visiblefactura) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVisibleFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVisibleFactura.jLabelidVisibleFactura.setText(visiblefactura.getId().toString());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consignatarioVisibleFactura.setSelected(visiblefactura.getcabe_consignatario());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_tipo_tasaVisibleFactura.setSelected(visiblefactura.getcabe_tipo_tasa());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consultorVisibleFactura.setSelected(visiblefactura.getcabe_consultor());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_iceVisibleFactura.setSelected(visiblefactura.getcabe_ice());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_transporteVisibleFactura.setSelected(visiblefactura.getcabe_transporte());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_fueVisibleFactura.setSelected(visiblefactura.getcabe_fue());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_ordenVisibleFactura.setSelected(visiblefactura.getcabe_orden());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_autori_precioVisibleFactura.setSelected(visiblefactura.getdeta_autori_precio());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_areaVisibleFactura.setSelected(visiblefactura.getdeta_area());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_fotoVisibleFactura.setSelected(visiblefactura.getdeta_foto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VisibleFactura visiblefacturaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,visiblefacturaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VisibleFactura visiblefacturaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				visiblefacturaLocal=this.visiblefactura;
			} else {
				visiblefacturaLocal=this.visiblefacturaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(visiblefacturaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVisibleFactura(visiblefacturaLocal,true);
					
					if(visiblefacturaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(visiblefacturaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(visiblefacturaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVisibleFactura(VisibleFactura visiblefactura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVisibleFactura(visiblefactura,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(visiblefactura);
	}
	
	public void setVariablesFormularioToObjetoActualVisibleFactura(VisibleFactura visiblefactura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVisibleFactura(visiblefactura,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVisibleFactura(VisibleFactura visiblefactura,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVisibleFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVisibleFactura.jLabelidVisibleFactura.getText()==null || this.jInternalFrameDetalleFormVisibleFactura.jLabelidVisibleFactura.getText()=="" || this.jInternalFrameDetalleFormVisibleFactura.jLabelidVisibleFactura.getText()=="Id") {
				this.jInternalFrameDetalleFormVisibleFactura.jLabelidVisibleFactura.setText("0");
			}

			if(conColumnasBase) {visiblefactura.setId(Long.parseLong(this.jInternalFrameDetalleFormVisibleFactura.jLabelidVisibleFactura.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VisibleFacturaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelIdVisibleFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			visiblefactura.setcabe_consignatario(this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consignatarioVisibleFactura.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_consignatarioVisibleFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			visiblefactura.setcabe_tipo_tasa(this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_tipo_tasaVisibleFactura.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_tipo_tasaVisibleFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			visiblefactura.setcabe_consultor(this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consultorVisibleFactura.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_consultorVisibleFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			visiblefactura.setcabe_ice(this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_iceVisibleFactura.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VisibleFacturaConstantesFunciones.LABEL_CABEICE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_iceVisibleFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			visiblefactura.setcabe_transporte(this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_transporteVisibleFactura.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_transporteVisibleFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			visiblefactura.setcabe_fue(this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_fueVisibleFactura.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VisibleFacturaConstantesFunciones.LABEL_CABEFUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_fueVisibleFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			visiblefactura.setcabe_orden(this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_ordenVisibleFactura.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VisibleFacturaConstantesFunciones.LABEL_CABEORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabelcabe_ordenVisibleFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			visiblefactura.setdeta_autori_precio(this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_autori_precioVisibleFactura.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabeldeta_autori_precioVisibleFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			visiblefactura.setdeta_area(this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_areaVisibleFactura.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VisibleFacturaConstantesFunciones.LABEL_DETAAREA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabeldeta_areaVisibleFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			visiblefactura.setdeta_foto(this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_fotoVisibleFactura.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VisibleFacturaConstantesFunciones.LABEL_DETAFOTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVisibleFactura.jLabeldeta_fotoVisibleFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVisibleFactura(VisibleFactura visiblefacturaBean,VisibleFactura visiblefactura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVisibleFactura(VisibleFactura visiblefacturaOrigen,VisibleFactura visiblefactura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && visiblefacturaOrigen.getId()!=null && !visiblefacturaOrigen.getId().equals(0L))) {visiblefactura.setId(visiblefacturaOrigen.getId());}}
			if(conDefault || (!conDefault && visiblefacturaOrigen.getcabe_consignatario()!=null && !visiblefacturaOrigen.getcabe_consignatario().equals(false))) {visiblefactura.setcabe_consignatario(visiblefacturaOrigen.getcabe_consignatario());}
			if(conDefault || (!conDefault && visiblefacturaOrigen.getcabe_tipo_tasa()!=null && !visiblefacturaOrigen.getcabe_tipo_tasa().equals(false))) {visiblefactura.setcabe_tipo_tasa(visiblefacturaOrigen.getcabe_tipo_tasa());}
			if(conDefault || (!conDefault && visiblefacturaOrigen.getcabe_consultor()!=null && !visiblefacturaOrigen.getcabe_consultor().equals(false))) {visiblefactura.setcabe_consultor(visiblefacturaOrigen.getcabe_consultor());}
			if(conDefault || (!conDefault && visiblefacturaOrigen.getcabe_ice()!=null && !visiblefacturaOrigen.getcabe_ice().equals(false))) {visiblefactura.setcabe_ice(visiblefacturaOrigen.getcabe_ice());}
			if(conDefault || (!conDefault && visiblefacturaOrigen.getcabe_transporte()!=null && !visiblefacturaOrigen.getcabe_transporte().equals(false))) {visiblefactura.setcabe_transporte(visiblefacturaOrigen.getcabe_transporte());}
			if(conDefault || (!conDefault && visiblefacturaOrigen.getcabe_fue()!=null && !visiblefacturaOrigen.getcabe_fue().equals(false))) {visiblefactura.setcabe_fue(visiblefacturaOrigen.getcabe_fue());}
			if(conDefault || (!conDefault && visiblefacturaOrigen.getcabe_orden()!=null && !visiblefacturaOrigen.getcabe_orden().equals(false))) {visiblefactura.setcabe_orden(visiblefacturaOrigen.getcabe_orden());}
			if(conDefault || (!conDefault && visiblefacturaOrigen.getdeta_autori_precio()!=null && !visiblefacturaOrigen.getdeta_autori_precio().equals(false))) {visiblefactura.setdeta_autori_precio(visiblefacturaOrigen.getdeta_autori_precio());}
			if(conDefault || (!conDefault && visiblefacturaOrigen.getdeta_area()!=null && !visiblefacturaOrigen.getdeta_area().equals(false))) {visiblefactura.setdeta_area(visiblefacturaOrigen.getdeta_area());}
			if(conDefault || (!conDefault && visiblefacturaOrigen.getdeta_foto()!=null && !visiblefacturaOrigen.getdeta_foto().equals(false))) {visiblefactura.setdeta_foto(visiblefacturaOrigen.getdeta_foto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVisibleFactura(VisibleFactura visiblefactura) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVisibleFactura.jLabelidVisibleFactura.setText(visiblefactura.getId().toString());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consignatarioVisibleFactura.setSelected(visiblefactura.getcabe_consignatario());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_tipo_tasaVisibleFactura.setSelected(visiblefactura.getcabe_tipo_tasa());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consultorVisibleFactura.setSelected(visiblefactura.getcabe_consultor());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_iceVisibleFactura.setSelected(visiblefactura.getcabe_ice());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_transporteVisibleFactura.setSelected(visiblefactura.getcabe_transporte());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_fueVisibleFactura.setSelected(visiblefactura.getcabe_fue());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_ordenVisibleFactura.setSelected(visiblefactura.getcabe_orden());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_autori_precioVisibleFactura.setSelected(visiblefactura.getdeta_autori_precio());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_areaVisibleFactura.setSelected(visiblefactura.getdeta_area());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_fotoVisibleFactura.setSelected(visiblefactura.getdeta_foto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVisibleFactura(VisibleFacturaBean visiblefacturaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVisibleFactura.jLabelidVisibleFactura.setText(visiblefacturaBean.getId().toString());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consignatarioVisibleFactura.setSelected(visiblefacturaBean.getcabe_consignatario());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_tipo_tasaVisibleFactura.setSelected(visiblefacturaBean.getcabe_tipo_tasa());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consultorVisibleFactura.setSelected(visiblefacturaBean.getcabe_consultor());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_iceVisibleFactura.setSelected(visiblefacturaBean.getcabe_ice());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_transporteVisibleFactura.setSelected(visiblefacturaBean.getcabe_transporte());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_fueVisibleFactura.setSelected(visiblefacturaBean.getcabe_fue());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_ordenVisibleFactura.setSelected(visiblefacturaBean.getcabe_orden());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_autori_precioVisibleFactura.setSelected(visiblefacturaBean.getdeta_autori_precio());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_areaVisibleFactura.setSelected(visiblefacturaBean.getdeta_area());
			this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_fotoVisibleFactura.setSelected(visiblefacturaBean.getdeta_foto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVisibleFactura(VisibleFacturaParameterReturnGeneral visiblefacturaReturnGeneral,VisibleFacturaBean visiblefacturaBean,Boolean conDefault) throws Exception { 
		try {
			VisibleFactura visiblefacturaLocal=new VisibleFactura();
			
			visiblefacturaLocal=visiblefacturaReturnGeneral.getVisibleFactura();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && visiblefacturaLocal.getId()!=null && !visiblefacturaLocal.getId().equals(0L))) {visiblefacturaBean.setId(visiblefacturaLocal.getId());}}
			if(conDefault || (!conDefault && visiblefacturaLocal.getcabe_consignatario()!=null && !visiblefacturaLocal.getcabe_consignatario().equals(false))) {visiblefacturaBean.setcabe_consignatario(visiblefacturaLocal.getcabe_consignatario());}
			if(conDefault || (!conDefault && visiblefacturaLocal.getcabe_tipo_tasa()!=null && !visiblefacturaLocal.getcabe_tipo_tasa().equals(false))) {visiblefacturaBean.setcabe_tipo_tasa(visiblefacturaLocal.getcabe_tipo_tasa());}
			if(conDefault || (!conDefault && visiblefacturaLocal.getcabe_consultor()!=null && !visiblefacturaLocal.getcabe_consultor().equals(false))) {visiblefacturaBean.setcabe_consultor(visiblefacturaLocal.getcabe_consultor());}
			if(conDefault || (!conDefault && visiblefacturaLocal.getcabe_ice()!=null && !visiblefacturaLocal.getcabe_ice().equals(false))) {visiblefacturaBean.setcabe_ice(visiblefacturaLocal.getcabe_ice());}
			if(conDefault || (!conDefault && visiblefacturaLocal.getcabe_transporte()!=null && !visiblefacturaLocal.getcabe_transporte().equals(false))) {visiblefacturaBean.setcabe_transporte(visiblefacturaLocal.getcabe_transporte());}
			if(conDefault || (!conDefault && visiblefacturaLocal.getcabe_fue()!=null && !visiblefacturaLocal.getcabe_fue().equals(false))) {visiblefacturaBean.setcabe_fue(visiblefacturaLocal.getcabe_fue());}
			if(conDefault || (!conDefault && visiblefacturaLocal.getcabe_orden()!=null && !visiblefacturaLocal.getcabe_orden().equals(false))) {visiblefacturaBean.setcabe_orden(visiblefacturaLocal.getcabe_orden());}
			if(conDefault || (!conDefault && visiblefacturaLocal.getdeta_autori_precio()!=null && !visiblefacturaLocal.getdeta_autori_precio().equals(false))) {visiblefacturaBean.setdeta_autori_precio(visiblefacturaLocal.getdeta_autori_precio());}
			if(conDefault || (!conDefault && visiblefacturaLocal.getdeta_area()!=null && !visiblefacturaLocal.getdeta_area().equals(false))) {visiblefacturaBean.setdeta_area(visiblefacturaLocal.getdeta_area());}
			if(conDefault || (!conDefault && visiblefacturaLocal.getdeta_foto()!=null && !visiblefacturaLocal.getdeta_foto().equals(false))) {visiblefacturaBean.setdeta_foto(visiblefacturaLocal.getdeta_foto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVisibleFacturaGenerico(Long idVisibleFacturaSeleccionado,JComboBox jComboBoxVisibleFactura,List<VisibleFactura> visiblefacturasLocal)throws Exception {
		try {
			VisibleFactura  visiblefacturaTemp=null;

			for(VisibleFactura visiblefacturaAux:visiblefacturasLocal) {
				if(visiblefacturaAux.getId()!=null && visiblefacturaAux.getId().equals(idVisibleFacturaSeleccionado)) {
					visiblefacturaTemp=visiblefacturaAux;
					break;
				}
			}

			jComboBoxVisibleFactura.setSelectedItem(visiblefacturaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVisibleFacturaGenerico(JComboBox jComboBoxVisibleFactura,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVisibleFactura.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVisibleFactura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVisibleFactura.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVisibleFactura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			visiblefactura=(VisibleFactura) visiblefacturaLogic.getVisibleFacturas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			visiblefactura =(VisibleFactura) visiblefacturas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!visiblefactura.getIsNew() && !visiblefactura.getIsChanged() && !visiblefactura.getIsDeleted()) {
				sDescripcion=visiblefactura.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=visiblefactura.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VisibleFactura visiblefacturaRow=new VisibleFactura();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			visiblefacturaRow=(VisibleFactura) visiblefacturaLogic.getVisibleFacturas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			visiblefacturaRow=(VisibleFactura) visiblefacturas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVisibleFactura(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVisibleFactura.setVisible((this.isVisibilidadCeldaNuevoVisibleFactura && this.isPermisoNuevoVisibleFactura));			
			this.jButtonDuplicarVisibleFactura.setVisible((this.isVisibilidadCeldaDuplicarVisibleFactura && this.isPermisoDuplicarVisibleFactura));			
			this.jButtonCopiarVisibleFactura.setVisible((this.isVisibilidadCeldaCopiarVisibleFactura && this.isPermisoCopiarVisibleFactura));
			this.jButtonVerFormVisibleFactura.setVisible((this.isVisibilidadCeldaVerFormVisibleFactura && this.isPermisoVerFormVisibleFactura));
			
			this.jButtonAbrirOrderByVisibleFactura.setVisible((this.isVisibilidadCeldaOrdenVisibleFactura && this.isPermisoOrdenVisibleFactura));			
			
			this.jButtonNuevoRelacionesVisibleFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesVisibleFactura && this.isPermisoNuevoVisibleFactura));			
			this.jButtonNuevoGuardarCambiosVisibleFactura.setVisible((this.isVisibilidadCeldaNuevoVisibleFactura && this.isPermisoNuevoVisibleFactura && this.isPermisoGuardarCambiosVisibleFactura));
			
			if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
			this.jInternalFrameDetalleFormVisibleFactura.jButtonModificarVisibleFactura.setVisible((this.isVisibilidadCeldaModificarVisibleFactura && this.isPermisoActualizarVisibleFactura));	
			this.jInternalFrameDetalleFormVisibleFactura.jButtonActualizarVisibleFactura.setVisible((this.isVisibilidadCeldaActualizarVisibleFactura && this.isPermisoActualizarVisibleFactura));	
			this.jInternalFrameDetalleFormVisibleFactura.jButtonEliminarVisibleFactura.setVisible((this.isVisibilidadCeldaEliminarVisibleFactura && this.isPermisoEliminarVisibleFactura));
			this.jInternalFrameDetalleFormVisibleFactura.jButtonCancelarVisibleFactura.setVisible(this.isVisibilidadCeldaCancelarVisibleFactura);							
			this.jInternalFrameDetalleFormVisibleFactura.jButtonGuardarCambiosVisibleFactura.setVisible((this.isVisibilidadCeldaGuardarVisibleFactura && this.isPermisoGuardarCambiosVisibleFactura));			
			
			}
						
			this.jButtonGuardarCambiosTablaVisibleFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosVisibleFactura && this.isPermisoGuardarCambiosVisibleFactura));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVisibleFactura.setVisible((this.isVisibilidadCeldaNuevoVisibleFactura && this.isPermisoNuevoVisibleFactura));						
			this.jButtonDuplicarToolBarVisibleFactura.setVisible((this.isVisibilidadCeldaDuplicarVisibleFactura && this.isPermisoDuplicarVisibleFactura));						
			this.jButtonCopiarToolBarVisibleFactura.setVisible((this.isVisibilidadCeldaCopiarVisibleFactura && this.isPermisoCopiarVisibleFactura));			
			this.jButtonVerFormToolBarVisibleFactura.setVisible((this.isVisibilidadCeldaVerFormVisibleFactura && this.isPermisoVerFormVisibleFactura));			
			this.jButtonAbrirOrderByToolBarVisibleFactura.setVisible((this.isVisibilidadCeldaOrdenVisibleFactura && this.isPermisoOrdenVisibleFactura));
			this.jButtonNuevoRelacionesToolBarVisibleFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesVisibleFactura && this.isPermisoNuevoVisibleFactura));			
			this.jButtonNuevoGuardarCambiosToolBarVisibleFactura.setVisible((this.isVisibilidadCeldaNuevoVisibleFactura && this.isPermisoNuevoVisibleFactura && this.isPermisoGuardarCambiosVisibleFactura));			
			
			if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
			this.jInternalFrameDetalleFormVisibleFactura.jButtonModificarToolBarVisibleFactura.setVisible((this.isVisibilidadCeldaModificarVisibleFactura && this.isPermisoActualizarVisibleFactura));	
			this.jInternalFrameDetalleFormVisibleFactura.jButtonActualizarToolBarVisibleFactura.setVisible((this.isVisibilidadCeldaActualizarVisibleFactura  && this.isPermisoActualizarVisibleFactura));	
			this.jInternalFrameDetalleFormVisibleFactura.jButtonEliminarToolBarVisibleFactura.setVisible((this.isVisibilidadCeldaEliminarVisibleFactura && this.isPermisoEliminarVisibleFactura));
			this.jInternalFrameDetalleFormVisibleFactura.jButtonCancelarToolBarVisibleFactura.setVisible(this.isVisibilidadCeldaCancelarVisibleFactura);				
			this.jInternalFrameDetalleFormVisibleFactura.jButtonGuardarCambiosToolBarVisibleFactura.setVisible((this.isVisibilidadCeldaGuardarVisibleFactura && this.isPermisoGuardarCambiosVisibleFactura));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVisibleFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosVisibleFactura && this.isPermisoGuardarCambiosVisibleFactura));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVisibleFactura.setVisible((this.isVisibilidadCeldaNuevoVisibleFactura && this.isPermisoNuevoVisibleFactura));			
			this.jMenuItemDuplicarVisibleFactura.setVisible((this.isVisibilidadCeldaDuplicarVisibleFactura && this.isPermisoDuplicarVisibleFactura));			
			this.jMenuItemCopiarVisibleFactura.setVisible((this.isVisibilidadCeldaCopiarVisibleFactura && this.isPermisoCopiarVisibleFactura));			
			this.jMenuItemVerFormVisibleFactura.setVisible((this.isVisibilidadCeldaVerFormVisibleFactura && this.isPermisoVerFormVisibleFactura));			
			this.jMenuItemAbrirOrderByVisibleFactura.setVisible((this.isVisibilidadCeldaOrdenVisibleFactura && this.isPermisoOrdenVisibleFactura));			
			//this.jMenuItemMostrarOcultarVisibleFactura.setVisible((this.isVisibilidadCeldaOrdenVisibleFactura && this.isPermisoOrdenVisibleFactura));
			this.jMenuItemDetalleAbrirOrderByVisibleFactura.setVisible((this.isVisibilidadCeldaOrdenVisibleFactura && this.isPermisoOrdenVisibleFactura));			
			//this.jMenuItemDetalleMostrarOcultarVisibleFactura.setVisible((this.isVisibilidadCeldaOrdenVisibleFactura && this.isPermisoOrdenVisibleFactura));			
			this.jMenuItemNuevoRelacionesVisibleFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesVisibleFactura && this.isPermisoNuevoVisibleFactura));			
			this.jMenuItemNuevoGuardarCambiosVisibleFactura.setVisible((this.isVisibilidadCeldaNuevoVisibleFactura && this.isPermisoNuevoVisibleFactura && this.isPermisoGuardarCambiosVisibleFactura));									
			
			if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
			this.jInternalFrameDetalleFormVisibleFactura.jMenuItemModificarVisibleFactura.setVisible((this.isVisibilidadCeldaModificarVisibleFactura && this.isPermisoActualizarVisibleFactura));	
			this.jInternalFrameDetalleFormVisibleFactura.jMenuItemActualizarVisibleFactura.setVisible((this.isVisibilidadCeldaActualizarVisibleFactura && this.isPermisoActualizarVisibleFactura));	
			this.jInternalFrameDetalleFormVisibleFactura.jMenuItemEliminarVisibleFactura.setVisible((this.isVisibilidadCeldaEliminarVisibleFactura && this.isPermisoEliminarVisibleFactura));
			this.jInternalFrameDetalleFormVisibleFactura.jMenuItemCancelarVisibleFactura.setVisible(this.isVisibilidadCeldaCancelarVisibleFactura);				
			}
			
			this.jMenuItemGuardarCambiosVisibleFactura.setVisible((this.isVisibilidadCeldaGuardarVisibleFactura && this.isPermisoGuardarCambiosVisibleFactura));						
			this.jMenuItemGuardarCambiosTablaVisibleFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosVisibleFactura && this.isPermisoGuardarCambiosVisibleFactura));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVisibleFactura=this.jButtonNuevoVisibleFactura.isVisible();
			this.isVisibilidadCeldaDuplicarVisibleFactura=this.jButtonDuplicarVisibleFactura.isVisible();
			this.isVisibilidadCeldaCopiarVisibleFactura=this.jButtonCopiarVisibleFactura.isVisible();
			this.isVisibilidadCeldaVerFormVisibleFactura=this.jButtonVerFormVisibleFactura.isVisible();
			
			this.isVisibilidadCeldaOrdenVisibleFactura=this.jButtonAbrirOrderByVisibleFactura.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=this.jButtonNuevoRelacionesVisibleFactura.isVisible();
			this.isVisibilidadCeldaModificarVisibleFactura=this.jButtonModificarVisibleFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
			this.isVisibilidadCeldaActualizarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jButtonActualizarVisibleFactura.isVisible();
			this.isVisibilidadCeldaEliminarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jButtonEliminarVisibleFactura.isVisible();
			this.isVisibilidadCeldaCancelarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jButtonCancelarVisibleFactura.isVisible();
			this.isVisibilidadCeldaGuardarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jButtonGuardarCambiosVisibleFactura.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVisibleFactura=this.jButtonGuardarCambiosTablaVisibleFactura.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVisibleFactura=this.jButtonNuevoToolBarVisibleFactura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=this.jButtonNuevoRelacionesToolBarVisibleFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
			this.isVisibilidadCeldaModificarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jButtonModificarToolBarVisibleFactura.isVisible();
			this.isVisibilidadCeldaActualizarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jButtonActualizarToolBarVisibleFactura.isVisible();
			this.isVisibilidadCeldaEliminarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jButtonEliminarToolBarVisibleFactura.isVisible();
			this.isVisibilidadCeldaCancelarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jButtonCancelarToolBarVisibleFactura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVisibleFactura=this.jButtonGuardarCambiosToolBarVisibleFactura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVisibleFactura=this.jButtonGuardarCambiosTablaToolBarVisibleFactura.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVisibleFactura=this.jMenuItemNuevoVisibleFactura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=this.jMenuItemNuevoRelacionesVisibleFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
			this.isVisibilidadCeldaModificarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jMenuItemModificarVisibleFactura.isVisible();
			this.isVisibilidadCeldaActualizarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jMenuItemActualizarVisibleFactura.isVisible();
			this.isVisibilidadCeldaEliminarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jMenuItemEliminarVisibleFactura.isVisible();
			this.isVisibilidadCeldaCancelarVisibleFactura=this.jInternalFrameDetalleFormVisibleFactura.jMenuItemCancelarVisibleFactura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVisibleFactura=this.jMenuItemGuardarCambiosVisibleFactura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVisibleFactura=this.jMenuItemGuardarCambiosTablaVisibleFactura.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVisibleFactura(Boolean esInicializar) {
		if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.visiblefacturaSessionBean.getConGuardarRelaciones()) {
				//if(this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVisibleFactura();
			}
			
			this.inicializarActualizarBindingBotonesManualVisibleFactura(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVisibleFactura() {
		this.jButtonNuevoVisibleFactura.setVisible(this.isPermisoNuevoVisibleFactura);			
		this.jButtonDuplicarVisibleFactura.setVisible(this.isPermisoDuplicarVisibleFactura);			
		this.jButtonCopiarVisibleFactura.setVisible(this.isPermisoCopiarVisibleFactura);			
		this.jButtonVerFormVisibleFactura.setVisible(this.isPermisoVerFormVisibleFactura);			
		
		this.jButtonAbrirOrderByVisibleFactura.setVisible(this.isPermisoOrdenVisibleFactura);					
		
		this.jButtonNuevoRelacionesVisibleFactura.setVisible(this.isPermisoNuevoVisibleFactura);			
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisibleFactura.jButtonModificarVisibleFactura.setVisible(this.isPermisoActualizarVisibleFactura);	
			this.jInternalFrameDetalleFormVisibleFactura.jButtonActualizarVisibleFactura.setVisible(this.isPermisoActualizarVisibleFactura);	
			this.jInternalFrameDetalleFormVisibleFactura.jButtonEliminarVisibleFactura.setVisible(this.isPermisoEliminarVisibleFactura);
			this.jInternalFrameDetalleFormVisibleFactura.jButtonCancelarVisibleFactura.setVisible(this.isVisibilidadCeldaCancelarVisibleFactura);						
			this.jInternalFrameDetalleFormVisibleFactura.jButtonGuardarCambiosVisibleFactura.setVisible(this.isPermisoGuardarCambiosVisibleFactura);							
		}
		
		this.jButtonGuardarCambiosTablaVisibleFactura.setVisible(this.isPermisoActualizarVisibleFactura);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVisibleFactura() {
		this.jInternalFrameDetalleFormVisibleFactura.jButtonModificarVisibleFactura.setVisible(this.isPermisoActualizarVisibleFactura);	
		this.jInternalFrameDetalleFormVisibleFactura.jButtonActualizarVisibleFactura.setVisible(this.isPermisoActualizarVisibleFactura);	
		this.jInternalFrameDetalleFormVisibleFactura.jButtonEliminarVisibleFactura.setVisible(this.isPermisoEliminarVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jButtonCancelarVisibleFactura.setVisible(this.isVisibilidadCeldaCancelarVisibleFactura);							
		this.jInternalFrameDetalleFormVisibleFactura.jButtonGuardarCambiosVisibleFactura.setVisible((this.isVisibilidadCeldaGuardarVisibleFactura && this.isPermisoGuardarCambiosVisibleFactura));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVisibleFactura() {
		if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVisibleFactura();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVisibleFactura() {
	}
	
	public void jTableDatosVisibleFacturaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVisibleFactura(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVisibleFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisibleFactura(this.getvisiblefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visiblefactura==null) {
						this.visiblefactura = new VisibleFactura();
					}

					this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
				}

				if(this.visiblefactura.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.visiblefactura.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisibleFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVisibleFacturaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVisibleFactura(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVisibleFactura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVisibleFactura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVisibleFactura(this.getvisiblefactura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.visiblefacturaLogic.getConnexion());

				if(this.visiblefactura.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.visiblefactura.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVisibleFactura=(TitledBorder)this.jScrollPanelDatosVisibleFactura.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVisibleFactura.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVisibleFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisibleFactura(this.getvisiblefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visiblefactura==null) {
						this.visiblefactura = new VisibleFactura();
					}

					this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
				}

				if(this.visiblefactura.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.visiblefactura.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisibleFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncabe_consignatarioVisibleFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisibleFactura(this.getvisiblefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visiblefactura==null) {
						this.visiblefactura = new VisibleFactura();
					}

					this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
				}

				if(this.visiblefactura.getcabe_consignatario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cabe_consignatario = "+this.visiblefactura.getcabe_consignatario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisibleFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncabe_tipo_tasaVisibleFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisibleFactura(this.getvisiblefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visiblefactura==null) {
						this.visiblefactura = new VisibleFactura();
					}

					this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
				}

				if(this.visiblefactura.getcabe_tipo_tasa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cabe_tipo_tasa = "+this.visiblefactura.getcabe_tipo_tasa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisibleFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncabe_consultorVisibleFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisibleFactura(this.getvisiblefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visiblefactura==null) {
						this.visiblefactura = new VisibleFactura();
					}

					this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
				}

				if(this.visiblefactura.getcabe_consultor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cabe_consultor = "+this.visiblefactura.getcabe_consultor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisibleFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncabe_iceVisibleFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisibleFactura(this.getvisiblefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visiblefactura==null) {
						this.visiblefactura = new VisibleFactura();
					}

					this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
				}

				if(this.visiblefactura.getcabe_ice()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cabe_ice = "+this.visiblefactura.getcabe_ice().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisibleFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncabe_transporteVisibleFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisibleFactura(this.getvisiblefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visiblefactura==null) {
						this.visiblefactura = new VisibleFactura();
					}

					this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
				}

				if(this.visiblefactura.getcabe_transporte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cabe_transporte = "+this.visiblefactura.getcabe_transporte().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisibleFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncabe_fueVisibleFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisibleFactura(this.getvisiblefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visiblefactura==null) {
						this.visiblefactura = new VisibleFactura();
					}

					this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
				}

				if(this.visiblefactura.getcabe_fue()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cabe_fue = "+this.visiblefactura.getcabe_fue().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisibleFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncabe_ordenVisibleFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisibleFactura(this.getvisiblefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visiblefactura==null) {
						this.visiblefactura = new VisibleFactura();
					}

					this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
				}

				if(this.visiblefactura.getcabe_orden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cabe_orden = "+this.visiblefactura.getcabe_orden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisibleFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondeta_autori_precioVisibleFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisibleFactura(this.getvisiblefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visiblefactura==null) {
						this.visiblefactura = new VisibleFactura();
					}

					this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
				}

				if(this.visiblefactura.getdeta_autori_precio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where deta_autori_precio = "+this.visiblefactura.getdeta_autori_precio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisibleFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondeta_areaVisibleFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisibleFactura(this.getvisiblefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visiblefactura==null) {
						this.visiblefactura = new VisibleFactura();
					}

					this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
				}

				if(this.visiblefactura.getdeta_area()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where deta_area = "+this.visiblefactura.getdeta_area().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisibleFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondeta_fotoVisibleFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVisibleFactura(this.getvisiblefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.visiblefactura==null) {
						this.visiblefactura = new VisibleFactura();
					}

					this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);
				}

				if(this.visiblefactura.getdeta_foto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where deta_foto = "+this.visiblefactura.getdeta_foto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVisibleFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaVisibleFacturaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVisibleFactura(false,false);

			this.getVisibleFacturasFK_IdEmpresa();

			this.inicializarActualizarBindingVisibleFactura(false);

			//if(VisibleFacturaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVisibleFactura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.visiblefacturaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVisibleFactura() {
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
			this.jInternalFrameDetalleFormVisibleFactura.setVisible(false);	    			
			this.jInternalFrameDetalleFormVisibleFactura.dispose();
			this.jInternalFrameDetalleFormVisibleFactura=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVisibleFactura!=null) {
			this.jInternalFrameReporteDinamicoVisibleFactura.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVisibleFactura.dispose();
			this.jInternalFrameReporteDinamicoVisibleFactura=null;
		}
		
		if(this.jInternalFrameImportacionVisibleFactura!=null) {
			this.jInternalFrameImportacionVisibleFactura.setVisible(false);	    			
			this.jInternalFrameImportacionVisibleFactura.dispose();
			this.jInternalFrameImportacionVisibleFactura=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVisibleFactura();
			
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			
			
			if(sTipo.equals("NuevoVisibleFactura")) {
				jButtonNuevoVisibleFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVisibleFactura")) {
				jButtonDuplicarVisibleFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVisibleFactura")) {
				jButtonCopiarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("VerFormVisibleFactura")) {
				jButtonVerFormVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVisibleFactura")) {
				jButtonNuevoVisibleFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVisibleFactura")) {
				jButtonDuplicarVisibleFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVisibleFactura")) {
				jButtonNuevoVisibleFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVisibleFactura")) {
				jButtonDuplicarVisibleFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVisibleFactura")) {
				jButtonNuevoVisibleFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVisibleFactura")) {
				jButtonNuevoVisibleFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVisibleFactura")) {
				jButtonNuevoVisibleFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVisibleFactura")) {
				jButtonModificarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVisibleFactura")) {
				jButtonModificarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVisibleFactura")) {
				jButtonModificarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVisibleFactura")) {
				jButtonActualizarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVisibleFactura")) {
				jButtonActualizarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVisibleFactura")) {
				jButtonActualizarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("EliminarVisibleFactura")) {
				jButtonEliminarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVisibleFactura")) {
				jButtonEliminarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVisibleFactura")) {
				jButtonEliminarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("CancelarVisibleFactura")) {
				jButtonCancelarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVisibleFactura")) {
				jButtonCancelarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVisibleFactura")) {
				jButtonCancelarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("CerrarVisibleFactura")) {
				jButtonCerrarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVisibleFactura")) {
				jButtonCerrarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVisibleFactura")) {
				jButtonCerrarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVisibleFactura")) {
				jButtonMostrarOcultarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVisibleFactura")) {
				jButtonCancelarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVisibleFactura")) {
				jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVisibleFactura")) {
				jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVisibleFactura")) {
				jButtonCopiarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVisibleFactura")) {
				jButtonVerFormVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVisibleFactura")) {
				jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVisibleFactura")) {
				jButtonCopiarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVisibleFactura")) {
				jButtonVerFormVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVisibleFactura")) {
				jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVisibleFactura")) {
				jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVisibleFactura")) {
				jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVisibleFactura")) {
				jButtonRecargarInformacionVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVisibleFactura")) {
				jButtonRecargarInformacionVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVisibleFactura")) {
				jButtonRecargarInformacionVisibleFacturaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVisibleFactura")) {
				jButtonAnterioresVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVisibleFactura")) {
				jButtonAnterioresVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVisibleFactura")) {
				jButtonAnterioresVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVisibleFactura")) {
				jButtonSiguientesVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVisibleFactura")) {
				jButtonSiguientesVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVisibleFactura")) {
				jButtonSiguientesVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVisibleFactura") || sTipo.equals("MenuItemDetalleAbrirOrderByVisibleFactura")) {
				jButtonAbrirOrderByVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVisibleFactura") || sTipo.equals("MenuItemDetalleMostrarOcultarVisibleFactura")) {
				jButtonMostrarOcultarVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVisibleFactura")) {
				jButtonNuevoGuardarCambiosVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVisibleFactura")) {
				jButtonNuevoGuardarCambiosVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVisibleFactura")) {
				jButtonNuevoGuardarCambiosVisibleFacturaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVisibleFactura")) {
				jButtonCerrarReporteDinamicoVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVisibleFactura")) {
				jButtonGenerarReporteDinamicoVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVisibleFactura")) {
				
				jButtonGenerarExcelReporteDinamicoVisibleFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVisibleFactura")) {
				jButtonCerrarImportacionVisibleFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVisibleFactura")) {
				
				jButtonGenerarImportacionVisibleFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVisibleFactura")) {
				
				jButtonAbrirImportacionVisibleFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVisibleFactura")) {
				jComboBoxTiposAccionesVisibleFacturaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVisibleFactura")) {
				jComboBoxTiposRelacionesVisibleFacturaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVisibleFactura")) {
				jComboBoxTiposAccionesVisibleFacturaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVisibleFactura")) {
				
				jComboBoxTiposSeleccionarVisibleFacturaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVisibleFactura")) {
				jTextFieldValorCampoGeneralVisibleFacturaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVisibleFactura")) {
				jButtonAbrirOrderByVisibleFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVisibleFactura")) {
				jButtonAbrirOrderByVisibleFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVisibleFactura")) {
				jButtonCerrarOrderByVisibleFacturaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVisibleFacturaBusqueda")) {
				this.jButtonidVisibleFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVisibleFacturaUpdate")) {
				this.jButtonid_empresaVisibleFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVisibleFacturaBusqueda")) {
				this.jButtonid_empresaVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cabe_consignatarioVisibleFacturaBusqueda")) {
				this.jButtoncabe_consignatarioVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cabe_tipo_tasaVisibleFacturaBusqueda")) {
				this.jButtoncabe_tipo_tasaVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cabe_consultorVisibleFacturaBusqueda")) {
				this.jButtoncabe_consultorVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cabe_iceVisibleFacturaBusqueda")) {
				this.jButtoncabe_iceVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cabe_transporteVisibleFacturaBusqueda")) {
				this.jButtoncabe_transporteVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cabe_fueVisibleFacturaBusqueda")) {
				this.jButtoncabe_fueVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cabe_ordenVisibleFacturaBusqueda")) {
				this.jButtoncabe_ordenVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("deta_autori_precioVisibleFacturaBusqueda")) {
				this.jButtondeta_autori_precioVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("deta_areaVisibleFacturaBusqueda")) {
				this.jButtondeta_areaVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("deta_fotoVisibleFacturaBusqueda")) {
				this.jButtondeta_fotoVisibleFacturaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVisibleFactura();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVisibleFacturaActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
				


				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VisibleFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VisibleFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VisibleFactura visiblefacturaLocal=null;
			
			if(!this.getEsControlTabla()) {
				visiblefacturaLocal=this.visiblefactura;
			} else {
				visiblefacturaLocal=this.visiblefacturaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
							
				
				


				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VisibleFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VisibleFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisibleFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaAnterior =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visiblefacturaAnterior =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVisibleFacturaActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
								
						
				


				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VisibleFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VisibleFactura.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
								
				
				


				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VisibleFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VisibleFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisibleFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaAnterior =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visiblefacturaAnterior =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisibleFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaAnterior =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visiblefacturaAnterior =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisibleFacturaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
							
				
				


				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VisibleFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VisibleFactura.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVisibleFacturaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visiblefacturaAnterior =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.visiblefacturaAnterior =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisibleFacturaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
								
				
				


				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VisibleFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VisibleFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisibleFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaAnterior =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visiblefacturaAnterior =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisibleFacturaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVisibleFacturaActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVisibleFactura")) {
					jCheckBoxSeleccionarTodosVisibleFacturaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVisibleFactura")) {
					jCheckBoxSeleccionadosVisibleFacturaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVisibleFactura")) {
					
				}
				
				


				
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VisibleFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VisibleFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
												
				
				


				
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VisibleFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VisibleFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVisibleFacturaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.visiblefacturaAnterior =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.visiblefacturaAnterior =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVisibleFacturaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVisibleFacturaActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VisibleFactura.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VisibleFactura.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.visiblefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.visiblefactura);
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VisibleFactura.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VisibleFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVisibleFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.visiblefacturaAnterior =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.visiblefacturaAnterior =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVisibleFactura")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVisibleFacturaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVisibleFactura.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.visiblefactura =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.visiblefactura =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.visiblefactura);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVisibleFactura")) {
				
				}
				
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVisibleFactura")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVisibleFactura.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVisibleFactura")) {
			
			}
			
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVisibleFactura();
			
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			
			if(sTipo.equals("NuevoVisibleFactura")) {
				jButtonNuevoVisibleFacturaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVisibleFactura")) {
				jButtonDuplicarVisibleFacturaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVisibleFactura")) {
				jButtonCopiarVisibleFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVisibleFactura")) {
				jButtonVerFormVisibleFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVisibleFactura")) {
				jButtonNuevoVisibleFacturaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVisibleFactura")) {
				jButtonModificarVisibleFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVisibleFactura")) {
				jButtonActualizarVisibleFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVisibleFactura")) {
				jButtonEliminarVisibleFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVisibleFactura")) {
				jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVisibleFactura")) {
				jButtonCancelarVisibleFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVisibleFactura")) {
				jButtonCerrarVisibleFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVisibleFactura")) {
				jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVisibleFactura")) {
				jButtonNuevoGuardarCambiosVisibleFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVisibleFactura")) {
				jButtonAbrirOrderByVisibleFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVisibleFactura")) {
				jButtonRecargarInformacionVisibleFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVisibleFactura")) {
				jButtonAnterioresVisibleFacturaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVisibleFactura")) {
				jButtonSiguientesVisibleFacturaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVisibleFacturaBusqueda")) {
				this.jButtonidVisibleFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVisibleFacturaUpdate")) {
				this.jButtonid_empresaVisibleFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVisibleFacturaBusqueda")) {
				this.jButtonid_empresaVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cabe_consignatarioVisibleFacturaBusqueda")) {
				this.jButtoncabe_consignatarioVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cabe_tipo_tasaVisibleFacturaBusqueda")) {
				this.jButtoncabe_tipo_tasaVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cabe_consultorVisibleFacturaBusqueda")) {
				this.jButtoncabe_consultorVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cabe_iceVisibleFacturaBusqueda")) {
				this.jButtoncabe_iceVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cabe_transporteVisibleFacturaBusqueda")) {
				this.jButtoncabe_transporteVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cabe_fueVisibleFacturaBusqueda")) {
				this.jButtoncabe_fueVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cabe_ordenVisibleFacturaBusqueda")) {
				this.jButtoncabe_ordenVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("deta_autori_precioVisibleFacturaBusqueda")) {
				this.jButtondeta_autori_precioVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("deta_areaVisibleFacturaBusqueda")) {
				this.jButtondeta_areaVisibleFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("deta_fotoVisibleFacturaBusqueda")) {
				this.jButtondeta_fotoVisibleFacturaBusquedaActionPerformed(evt);
			}
			
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVisibleFactura();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVisibleFactura")) {
				closingInternalFrameVisibleFactura();
				
			} else if(sTipo.equals("jButtonCancelarVisibleFactura")) {
				JInternalFrameBase jInternalFrameDetalleFormVisibleFactura = (JInternalFrameBase)evt.getSource();
	            	
	            VisibleFacturaBeanSwingJInternalFrame jInternalFrameParent=(VisibleFacturaBeanSwingJInternalFrame)jInternalFrameDetalleFormVisibleFactura.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVisibleFacturaActionPerformed(null);
			}
			
			VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.visiblefactura,new Object(),this.visiblefacturaParameterGeneral,this.visiblefacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVisibleFactura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVisibleFactura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVisibleFactura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.visiblefactura)) {
			if(!esControlTabla) {
				if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);			
				}
				
				if(this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVisibleFactura(this.visiblefactura,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.visiblefacturaReturnGeneral=visiblefacturaLogic.procesarEventosVisibleFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.visiblefacturaLogic.getVisibleFacturas(),this.visiblefactura,this.visiblefacturaParameterGeneral,this.isEsNuevoVisibleFactura,classes);//this.visiblefacturaLogic.getVisibleFactura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVisibleFactura(this.visiblefacturaReturnGeneral,this.visiblefacturaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVisibleFactura(classes,this.visiblefacturaReturnGeneral,this.visiblefacturaBean,false);
					}
						
					if(this.visiblefacturaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVisibleFactura(this.visiblefacturaReturnGeneral.getVisibleFactura());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVisibleFactura(this.visiblefacturaReturnGeneral.getVisibleFactura());	
					}
						
					if(this.visiblefacturaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVisibleFactura(this.visiblefacturaReturnGeneral.getVisibleFactura(),classes);//this.visiblefacturaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVisibleFactura(this.visiblefactura,classes);//this.visiblefacturaBean);									
				}
			
				if(VisibleFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVisibleFactura(this.visiblefactura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVisibleFactura(this.visiblefactura);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.visiblefacturaAnterior!=null) {
						this.visiblefactura=this.visiblefacturaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.visiblefacturaReturnGeneral=visiblefacturaLogic.procesarEventosVisibleFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.visiblefacturaLogic.getVisibleFacturas(),this.visiblefactura,this.visiblefacturaParameterGeneral,this.isEsNuevoVisibleFactura,classes);//this.visiblefacturaLogic.getVisibleFactura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.visiblefacturaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.visiblefacturaReturnGeneral.getVisibleFactura(),visiblefacturaLogic.getVisibleFacturas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.visiblefacturaReturnGeneral.getVisibleFactura(),this.visiblefacturas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVisibleFactura.repaint();
				
				//((AbstractTableModel) this.jTableDatosVisibleFactura.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVisibleFactura();
			}
		}
	}
	
	public void actualizarVisualTableDatosVisibleFactura() throws Exception {
		
		VisibleFacturaModel visiblefacturaModel=(VisibleFacturaModel)this.jTableDatosVisibleFactura.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			visiblefacturaModel.visiblefacturas=this.visiblefacturaLogic.getVisibleFacturas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			visiblefacturaModel.visiblefacturas=this.visiblefacturas;
		}
		
		
		((VisibleFacturaModel) this.jTableDatosVisibleFactura.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVisibleFactura() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getvisiblefacturaAnterior(),this.visiblefacturaLogic.getVisibleFacturas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getvisiblefacturaAnterior(),this.visiblefacturas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVisibleFactura();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVisibleFactura(VisibleFactura visiblefactura,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.visiblefactura,new Object(),generalEntityParameterGeneral,this.visiblefacturaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.visiblefacturaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VisibleFacturaConstantesFunciones.getClassesRelationshipsOfVisibleFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VisibleFacturaConstantesFunciones.getClassesRelationshipsFromStringsOfVisibleFactura(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVisibleFactura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VisibleFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.visiblefactura,new Object(),generalEntityParameterGeneral,this.visiblefacturaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVisibleFactura(VisibleFacturaBean visiblefacturaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVisibleFactura(ArrayList<Classe> classes,VisibleFacturaReturnGeneral visiblefacturaReturnGeneral,VisibleFacturaBean visiblefacturaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVisibleFactura(VisibleFactura visiblefactura,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.visiblefactura)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVisibleFactura = new VisibleFacturaDetalleFormJInternalFrame(jDesktopPane,this.visiblefacturaSessionBean.getConGuardarRelaciones(),this.visiblefacturaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.setVisible(false);
		this.jInternalFrameDetalleFormVisibleFactura.setSelected(false);						
		
		this.jInternalFrameDetalleFormVisibleFactura.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVisibleFactura.visiblefacturaLogic=this.visiblefacturaLogic;
		
		this.cargarCombosFrameForeignKeyVisibleFactura("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVisibleFactura();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVisibleFactura();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVisibleFactura("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVisibleFactura();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVisibleFactura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVisibleFactura"));
		
		this.jInternalFrameDetalleFormVisibleFactura.jButtonModificarVisibleFactura.addActionListener(new ButtonActionListener(this,"ModificarVisibleFactura"));

		
		this.jInternalFrameDetalleFormVisibleFactura.jButtonModificarToolBarVisibleFactura.addActionListener(new ButtonActionListener(this,"ModificarToolBarVisibleFactura"));
					
		this.jInternalFrameDetalleFormVisibleFactura.jMenuItemModificarVisibleFactura.addActionListener(new ButtonActionListener(this,"MenuItemModificarVisibleFactura"));		
		
		
		
		this.jInternalFrameDetalleFormVisibleFactura.jButtonActualizarVisibleFactura.addActionListener (new ButtonActionListener(this,"ActualizarVisibleFactura"));
		
		
		this.jInternalFrameDetalleFormVisibleFactura.jButtonActualizarToolBarVisibleFactura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVisibleFactura"));
						
		this.jInternalFrameDetalleFormVisibleFactura.jMenuItemActualizarVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVisibleFactura"));		
		
		
		
		this.jInternalFrameDetalleFormVisibleFactura.jButtonEliminarVisibleFactura.addActionListener (new ButtonActionListener(this,"EliminarVisibleFactura"));
		
		
		this.jInternalFrameDetalleFormVisibleFactura.jButtonEliminarToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"EliminarToolBarVisibleFactura"));
								
		this.jInternalFrameDetalleFormVisibleFactura.jMenuItemEliminarVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVisibleFactura"));		
		
		
		
		this.jInternalFrameDetalleFormVisibleFactura.jButtonCancelarVisibleFactura.addActionListener (new ButtonActionListener(this,"CancelarVisibleFactura"));
		
		
		this.jInternalFrameDetalleFormVisibleFactura.jButtonCancelarToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"CancelarToolBarVisibleFactura"));
					
		this.jInternalFrameDetalleFormVisibleFactura.jMenuItemCancelarVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVisibleFactura"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVisibleFactura.jMenuItemDetalleCerrarVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVisibleFactura"));		
		
		
		
		this.jInternalFrameDetalleFormVisibleFactura.jButtonGuardarCambiosToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVisibleFactura"));
		
		
		
		this.jInternalFrameDetalleFormVisibleFactura.jButtonGuardarCambiosToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVisibleFactura"));
		
		
		
		this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVisibleFactura"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtonidVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idVisibleFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVisibleFactura.jButtonid_empresaVisibleFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVisibleFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtonid_empresaVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_consignatarioVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_consignatarioVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_tipo_tasaVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_tipo_tasaVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_consultorVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_consultorVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_iceVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_iceVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_transporteVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_transporteVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_fueVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_fueVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_ordenVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_ordenVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtondeta_autori_precioVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"deta_autori_precioVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtondeta_areaVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"deta_areaVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtondeta_fotoVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"deta_fotoVisibleFacturaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVisibleFactura.jTabbedPaneRelacionesVisibleFactura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVisibleFactura"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVisibleFactura"));
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisibleFactura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVisibleFactura"));
		}
		
		this.jTableDatosVisibleFactura.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVisibleFactura"));
		
		this.jTableDatosVisibleFactura.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVisibleFactura"));
		
		this.jButtonNuevoVisibleFactura.addActionListener(new ButtonActionListener(this,"NuevoVisibleFactura"));
		
		this.jButtonDuplicarVisibleFactura.addActionListener(new ButtonActionListener(this,"DuplicarVisibleFactura"));
		
		this.jButtonCopiarVisibleFactura.addActionListener(new ButtonActionListener(this,"CopiarVisibleFactura"));
		
		this.jButtonVerFormVisibleFactura.addActionListener(new ButtonActionListener(this,"VerFormVisibleFactura"));
		
		
		this.jButtonNuevoToolBarVisibleFactura.addActionListener(new ButtonActionListener(this,"NuevoToolBarVisibleFactura"));
			
		this.jButtonDuplicarToolBarVisibleFactura.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVisibleFactura"));
			
		this.jMenuItemNuevoVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVisibleFactura"));
			
		this.jMenuItemDuplicarVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVisibleFactura"));		
		
		
		this.jButtonNuevoRelacionesVisibleFactura.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVisibleFactura"));
		
		
		this.jButtonNuevoRelacionesToolBarVisibleFactura.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVisibleFactura"));
			
		this.jMenuItemNuevoRelacionesVisibleFactura.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVisibleFactura"));		
		
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisibleFactura.jButtonModificarVisibleFactura.addActionListener(new ButtonActionListener(this,"ModificarVisibleFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisibleFactura.jButtonModificarToolBarVisibleFactura.addActionListener(new ButtonActionListener(this,"ModificarToolBarVisibleFactura"));
			
			this.jInternalFrameDetalleFormVisibleFactura.jMenuItemModificarVisibleFactura.addActionListener(new ButtonActionListener(this,"MenuItemModificarVisibleFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVisibleFactura.jButtonActualizarVisibleFactura.addActionListener (new ButtonActionListener(this,"ActualizarVisibleFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisibleFactura.jButtonActualizarToolBarVisibleFactura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVisibleFactura"));
				
			this.jInternalFrameDetalleFormVisibleFactura.jMenuItemActualizarVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVisibleFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisibleFactura.jButtonEliminarVisibleFactura.addActionListener (new ButtonActionListener(this,"EliminarVisibleFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisibleFactura.jButtonEliminarToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"EliminarToolBarVisibleFactura"));
						
			this.jInternalFrameDetalleFormVisibleFactura.jMenuItemEliminarVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVisibleFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisibleFactura.jButtonCancelarVisibleFactura.addActionListener (new ButtonActionListener(this,"CancelarVisibleFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisibleFactura.jButtonCancelarToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"CancelarToolBarVisibleFactura"));
			
			this.jInternalFrameDetalleFormVisibleFactura.jMenuItemCancelarVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVisibleFactura"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVisibleFactura"));		
		
		
		this.jButtonCerrarVisibleFactura.addActionListener (new ButtonActionListener(this,"CerrarVisibleFactura"));
		
		
		this.jButtonCerrarToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"CerrarToolBarVisibleFactura"));
			
		this.jMenuItemCerrarVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVisibleFactura"));
			
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisibleFactura.jMenuItemDetalleCerrarVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVisibleFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisibleFactura.jButtonGuardarCambiosVisibleFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosVisibleFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisibleFactura.jButtonGuardarCambiosToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVisibleFactura"));
		}
		
		this.jButtonCopiarToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"CopiarToolBarVisibleFactura"));
			
		this.jButtonVerFormToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"VerFormToolBarVisibleFactura"));
		
		this.jMenuItemGuardarCambiosVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVisibleFactura"));
			
		this.jMenuItemCopiarVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVisibleFactura"));		
		
		this.jMenuItemVerFormVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVisibleFactura"));		
		
		
		this.jButtonGuardarCambiosTablaVisibleFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVisibleFactura"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVisibleFactura"));
			
		this.jMenuItemGuardarCambiosTablaVisibleFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVisibleFactura"));		
		
		
		
		this.jButtonRecargarInformacionVisibleFactura.addActionListener (new ButtonActionListener(this,"RecargarInformacionVisibleFactura"));
					
		this.jButtonRecargarInformacionToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVisibleFactura"));
		
		this.jMenuItemRecargarInformacionVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVisibleFactura"));		
		
		
		
		this.jButtonAnterioresVisibleFactura.addActionListener (new ButtonActionListener(this,"AnterioresVisibleFactura"));
		
		
		this.jButtonAnterioresToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVisibleFactura"));
		
		this.jMenuItemAnterioresVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVisibleFactura"));		
		
		
		this.jButtonSiguientesVisibleFactura.addActionListener (new ButtonActionListener(this,"SiguientesVisibleFactura"));
		
		
		this.jButtonSiguientesToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVisibleFactura"));
			
		this.jMenuItemSiguientesVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVisibleFactura"));
			
		this.jMenuItemAbrirOrderByVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVisibleFactura"));
			
		this.jMenuItemMostrarOcultarVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVisibleFactura"));
			
		this.jMenuItemDetalleAbrirOrderByVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVisibleFactura"));
			
		this.jMenuItemDetalleMostarOcultarVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVisibleFactura"));		
		
		
		this.jButtonNuevoGuardarCambiosVisibleFactura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVisibleFactura"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVisibleFactura"));
			
		this.jMenuItemNuevoGuardarCambiosVisibleFactura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVisibleFactura"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVisibleFactura.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVisibleFactura"));

		this.jCheckBoxSeleccionadosVisibleFactura.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVisibleFactura"));
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVisibleFactura"));
		}
		
		
		this.jComboBoxTiposRelacionesVisibleFactura.addActionListener (new ButtonActionListener(this,"TiposRelacionesVisibleFactura"));
			
		this.jComboBoxTiposAccionesVisibleFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesVisibleFactura"));
					
		this.jComboBoxTiposSeleccionarVisibleFactura.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVisibleFactura"));
			
		this.jTextFieldValorCampoGeneralVisibleFactura.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVisibleFactura"));		
		
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtonidVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idVisibleFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVisibleFactura.jButtonid_empresaVisibleFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVisibleFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtonid_empresaVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_consignatarioVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_consignatarioVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_tipo_tasaVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_tipo_tasaVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_consultorVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_consultorVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_iceVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_iceVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_transporteVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_transporteVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_fueVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_fueVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_ordenVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_ordenVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtondeta_autori_precioVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"deta_autori_precioVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtondeta_areaVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"deta_areaVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtondeta_fotoVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"deta_fotoVisibleFacturaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVisibleFactura!=null) {
				this.jInternalFrameReporteDinamicoVisibleFactura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVisibleFactura"));
				this.jInternalFrameReporteDinamicoVisibleFactura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVisibleFactura"));
				this.jInternalFrameReporteDinamicoVisibleFactura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVisibleFactura"));
			}
			
			//this.jButtonCerrarReporteDinamicoVisibleFactura.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVisibleFactura"));				
			//this.jButtonGenerarReporteDinamicoVisibleFactura.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVisibleFactura"));
			//this.jButtonGenerarExcelReporteDinamicoVisibleFactura.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVisibleFactura"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVisibleFactura!=null) {
				this.jInternalFrameImportacionVisibleFactura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVisibleFactura"));
				this.jInternalFrameImportacionVisibleFactura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVisibleFactura"));
				this.jInternalFrameImportacionVisibleFactura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVisibleFactura"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVisibleFactura.addActionListener (new ButtonActionListener(this,"AbrirOrderByVisibleFactura"));
			
			this.jButtonAbrirOrderByToolBarVisibleFactura.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVisibleFactura"));			
			
			if(this.jInternalFrameOrderByVisibleFactura!=null) {
				this.jInternalFrameOrderByVisibleFactura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVisibleFactura"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVisibleFactura.jTabbedPaneRelacionesVisibleFactura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVisibleFactura"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameVisibleFactura();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVisibleFactura.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVisibleFactura = (JInternalFrameBase)event.getSource();
	            	
	            VisibleFacturaBeanSwingJInternalFrame jInternalFrameParent=(VisibleFacturaBeanSwingJInternalFrame)jInternalFrameDetalleFormVisibleFactura.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVisibleFacturaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVisibleFactura.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVisibleFacturaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVisibleFactura.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVisibleFactura.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVisibleFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVisibleFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVisibleFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVisibleFactura";
		inputMap = this.jButtonNuevoVisibleFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVisibleFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVisibleFacturaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVisibleFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVisibleFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVisibleFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVisibleFactura";
		inputMap = this.jButtonNuevoRelacionesVisibleFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVisibleFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVisibleFacturaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVisibleFactura";
		inputMap = this.jButtonModificarVisibleFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVisibleFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVisibleFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVisibleFactura";
		inputMap = this.jButtonActualizarVisibleFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVisibleFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVisibleFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVisibleFactura";
		inputMap = this.jButtonEliminarVisibleFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVisibleFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVisibleFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVisibleFactura";
		inputMap = this.jButtonCancelarVisibleFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVisibleFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVisibleFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVisibleFactura";
		inputMap = this.jButtonCerrarVisibleFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVisibleFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVisibleFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVisibleFactura.jButtonGuardarCambiosVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVisibleFactura";
		inputMap = this.jInternalFrameDetalleFormVisibleFactura.jButtonGuardarCambiosVisibleFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVisibleFactura.jButtonGuardarCambiosVisibleFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVisibleFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVisibleFactura.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVisibleFacturaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVisibleFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVisibleFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVisibleFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVisibleFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVisibleFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVisibleFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtonidVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idVisibleFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVisibleFactura.jButtonid_empresaVisibleFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVisibleFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtonid_empresaVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_consignatarioVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_consignatarioVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_tipo_tasaVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_tipo_tasaVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_consultorVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_consultorVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_iceVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_iceVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_transporteVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_transporteVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_fueVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_fueVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtoncabe_ordenVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cabe_ordenVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtondeta_autori_precioVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"deta_autori_precioVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtondeta_areaVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"deta_areaVisibleFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVisibleFactura.jButtondeta_fotoVisibleFacturaBusqueda.addActionListener(new ButtonActionListener(this,"deta_fotoVisibleFacturaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVisibleFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVisibleFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVisibleFacturaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVisibleFactura.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVisibleFactura(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VisibleFactura visiblefacturaAux:this.visiblefacturaLogic.getVisibleFacturas()) {
					visiblefacturaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VisibleFactura visiblefacturaAux:visiblefacturas) {
					visiblefacturaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVisibleFacturaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVisibleFactura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VisibleFactura visiblefacturaAux:this.visiblefacturaLogic.getVisibleFacturas()) {
						visiblefacturaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VisibleFactura visiblefacturaAux:visiblefacturas) {
						visiblefacturaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VisibleFactura visiblefacturaAux:this.visiblefacturaLogic.getVisibleFacturas()) {
					
						if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO)) {
							existe=true;
							visiblefacturaAux.setcabe_consignatario(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA)) {
							existe=true;
							visiblefacturaAux.setcabe_tipo_tasa(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR)) {
							existe=true;
							visiblefacturaAux.setcabe_consultor(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABEICE)) {
							existe=true;
							visiblefacturaAux.setcabe_ice(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE)) {
							existe=true;
							visiblefacturaAux.setcabe_transporte(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABEFUE)) {
							existe=true;
							visiblefacturaAux.setcabe_fue(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABEORDEN)) {
							existe=true;
							visiblefacturaAux.setcabe_orden(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO)) {
							existe=true;
							visiblefacturaAux.setdeta_autori_precio(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_DETAAREA)) {
							existe=true;
							visiblefacturaAux.setdeta_area(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_DETAFOTO)) {
							existe=true;
							visiblefacturaAux.setdeta_foto(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VisibleFactura visiblefacturaAux:visiblefacturas) {
						
						if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO)) {
							existe=true;
							visiblefacturaAux.setcabe_consignatario(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA)) {
							existe=true;
							visiblefacturaAux.setcabe_tipo_tasa(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR)) {
							existe=true;
							visiblefacturaAux.setcabe_consultor(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABEICE)) {
							existe=true;
							visiblefacturaAux.setcabe_ice(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE)) {
							existe=true;
							visiblefacturaAux.setcabe_transporte(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABEFUE)) {
							existe=true;
							visiblefacturaAux.setcabe_fue(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABEORDEN)) {
							existe=true;
							visiblefacturaAux.setcabe_orden(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO)) {
							existe=true;
							visiblefacturaAux.setdeta_autori_precio(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_DETAAREA)) {
							existe=true;
							visiblefacturaAux.setdeta_area(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_DETAFOTO)) {
							existe=true;
							visiblefacturaAux.setdeta_foto(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVisibleFactura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVisibleFactura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVisibleFactura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVisibleFacturaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVisibleFactura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVisibleFactura.getSelectedRows();
			
			VisibleFactura visiblefacturaLocal=new VisibleFactura();
			
			//this.seleccionarTodosVisibleFactura(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					visiblefacturaLocal =(VisibleFactura) this.visiblefacturaLogic.getVisibleFacturas().toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					visiblefacturaLocal =(VisibleFactura) this.visiblefacturas.toArray()[this.jTableDatosVisibleFactura.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				visiblefacturaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VisibleFactura visiblefacturaAux:this.visiblefacturaLogic.getVisibleFacturas()) {
						visiblefacturaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VisibleFactura visiblefacturaAux:visiblefacturas) {
						visiblefacturaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVisibleFactura(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVisibleFactura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVisibleFactura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVisibleFactura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVisibleFacturaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVisibleFacturaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVisibleFacturaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVisibleFactura(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVisibleFactura.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VisibleFactura visiblefacturaAux:this.visiblefacturaLogic.getVisibleFacturas()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VisibleFactura visiblefacturaAux:visiblefacturas) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVisibleFactura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVisibleFacturaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVisibleFactura(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVisibleFactura=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVisibleFactura.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVisibleFactura) {				
					conSplash=true;//false;										
					
					//this.startProcessVisibleFactura(conSplash);
				
					this.generarReporteVisibleFacturasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVisibleFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVisibleFacturasSeleccionados();
				//this.jComboBoxTiposAccionesVisibleFactura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVisibleFacturasSeleccionados(false);
				//this.jComboBoxTiposAccionesVisibleFactura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVisibleFacturasSeleccionados(true);
				//this.jComboBoxTiposAccionesVisibleFactura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVisibleFactura();
				
				this.exportarVisibleFacturasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVisibleFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVisibleFacturas();
				//this.importarVisibleFacturas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVisibleFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVisibleFactura();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVisibleFacturasSeleccionados();
				//this.jComboBoxTiposAccionesVisibleFactura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Visibilidad Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVisibleFactura();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVisibleFactura)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVisibleFactura(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Visibilidad Factura",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVisibleFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.setSelectedIndex(0);					
				}	
			} 			
			else if(VisibleFacturaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVisibleFactura) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVisibleFactura(conSplash);
					
						//this.actualizarParametrosGeneralVisibleFactura();
						
						this.generarReporteProcesoAccionVisibleFacturasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVisibleFactura.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VisibleFacturaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Visibilidad FacturaS SELECCIONADOS?", "MANTENIMIENTO DE Visibilidad Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVisibleFactura();
				
						this.actualizarParametrosGeneralVisibleFactura();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.visiblefacturaReturnGeneral=visiblefacturaLogic.procesarAccionVisibleFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.visiblefacturaLogic.getVisibleFacturas(),this.visiblefacturaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVisibleFacturaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVisibleFactura.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVisibleFactura();
					
					VisibleFacturaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVisibleFacturaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVisibleFactura.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVisibleFactura.jComboBoxTiposAccionesFormularioVisibleFactura.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVisibleFactura(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVisibleFacturaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVisibleFactura();
			
			if(this.jInternalFrameDetalleFormVisibleFactura==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VisibleFactura> visiblefacturasSeleccionados=new ArrayList<VisibleFactura>();		
			VisibleFactura visiblefactura=new VisibleFactura();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVisibleFactura(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVisibleFactura.getSelectedItem();
			
			
			
			
			visiblefacturasSeleccionados=this.getVisibleFacturasSeleccionados(true);
			//this.sTipoAccion;
			
			if(visiblefacturasSeleccionados.size()==1) {
				for(VisibleFactura visiblefacturaAux:visiblefacturasSeleccionados) {
					visiblefactura=visiblefacturaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVisibleFactura();
			
      		//this.finishProcessVisibleFactura(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVisibleFacturaReturnGeneral() throws Exception {
		if(this.visiblefacturaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.visiblefacturaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.visiblefacturaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.visiblefacturaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.visiblefacturaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.visiblefacturaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVisibleFactura(false);
		}
		
		if(this.visiblefacturaReturnGeneral.getConRetornoLista() || this.visiblefacturaReturnGeneral.getConRetornoObjeto()) {
			if(this.visiblefacturaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.visiblefacturaLogic.setVisibleFacturas(this.visiblefacturaReturnGeneral.getVisibleFacturas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.visiblefacturaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.visiblefacturaLogic.setVisibleFactura(this.visiblefacturaReturnGeneral.getVisibleFactura());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingVisibleFactura(false);
		}
	}
	
	public void actualizarParametrosGeneralVisibleFactura() throws Exception {
		
		
	}
	
	public ArrayList<VisibleFactura> getVisibleFacturasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VisibleFactura> visiblefacturasSeleccionados=new ArrayList<VisibleFactura>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVisibleFactura) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VisibleFactura visiblefacturaAux:visiblefacturaLogic.getVisibleFacturas()) {
					if(visiblefacturaAux.getIsSelected()) {
						visiblefacturasSeleccionados.add(visiblefacturaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VisibleFactura visiblefacturaAux:this.visiblefacturas) {
					if(visiblefacturaAux.getIsSelected()) {
						visiblefacturasSeleccionados.add(visiblefacturaAux);				
					}
				}
			}
			
			if(visiblefacturasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						visiblefacturasSeleccionados.addAll(this.visiblefacturaLogic.getVisibleFacturas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						visiblefacturasSeleccionados.addAll(this.visiblefacturas);				
					}
				}
			}
		} else {
			visiblefacturasSeleccionados.add(this.visiblefactura);
		}
		
		return visiblefacturasSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteVisibleFacturasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVisibleFacturasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVisibleFacturasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVisibleFacturasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVisibleFacturasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Visibilidad Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVisibleFacturasSeleccionados() throws Exception {
		ArrayList<VisibleFactura> visiblefacturasSeleccionados=new ArrayList<VisibleFactura>();		
		
		visiblefacturasSeleccionados=this.getVisibleFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVisibleFacturas("Todos",visiblefacturasSeleccionados);
		
	}	
	
	public void generarReporteNormalVisibleFacturasSeleccionados() throws Exception {
		ArrayList<VisibleFactura> visiblefacturasSeleccionados=new ArrayList<VisibleFactura>();		
		
		visiblefacturasSeleccionados=this.getVisibleFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVisibleFacturas("Todos",visiblefacturasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVisibleFacturasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VisibleFactura> visiblefacturasSeleccionados=new ArrayList<VisibleFactura>();
		
		visiblefacturasSeleccionados=this.getVisibleFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVisibleFacturas("Todos",visiblefacturasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVisibleFacturasSeleccionados() throws Exception {
		ArrayList<VisibleFactura> visiblefacturasSeleccionados=new ArrayList<VisibleFactura>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVisibleFactura();
		
		
		visiblefacturasSeleccionados=this.getVisibleFacturasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVisibleFactura();
		
		
		//this.generarReporteVisibleFacturas("Todos",visiblefacturasSeleccionados ,visiblefacturaImplementable,visiblefacturaImplementableHome);
	}
	
	public void mostrarImportacionVisibleFacturas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVisibleFactura();
		
		this.abrirFrameImportacionVisibleFactura();		
		
			
		//this.generarReporteVisibleFacturas("Todos",visiblefacturasSeleccionados ,visiblefacturaImplementable,visiblefacturaImplementableHome);
	}
	
	public void importarVisibleFacturas() throws Exception {		
	
	}
	
	public void exportarVisibleFacturasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVisibleFacturasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVisibleFacturasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVisibleFacturasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Visibilidad Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVisibleFacturasSeleccionados() throws Exception {
		ArrayList<VisibleFactura> visiblefacturasSeleccionados=new ArrayList<VisibleFactura>();		
		
		visiblefacturasSeleccionados=this.getVisibleFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"visiblefactura."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVisibleFactura(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VisibleFactura visiblefacturaAux:visiblefacturasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVisibleFactura(visiblefacturaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//visiblefacturaAux.setsDetalleGeneralEntityReporte(visiblefacturaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visibilidad Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVisibleFactura(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VisibleFacturaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisibleFacturaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisibleFacturaConstantesFunciones.LABEL_CABEICE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisibleFacturaConstantesFunciones.LABEL_CABEFUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisibleFacturaConstantesFunciones.LABEL_CABEORDEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisibleFacturaConstantesFunciones.LABEL_DETAAREA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VisibleFacturaConstantesFunciones.LABEL_DETAFOTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVisibleFactura(VisibleFactura visiblefactura,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=visiblefactura.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=visiblefactura.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=visiblefactura.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=visiblefactura.getcabe_consignatario().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=visiblefactura.getcabe_tipo_tasa().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=visiblefactura.getcabe_consultor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=visiblefactura.getcabe_ice().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=visiblefactura.getcabe_transporte().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=visiblefactura.getcabe_fue().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=visiblefactura.getcabe_orden().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=visiblefactura.getdeta_autori_precio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=visiblefactura.getdeta_area().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=visiblefactura.getdeta_foto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVisibleFacturasSeleccionados() throws Exception {
		ArrayList<VisibleFactura> visiblefacturasSeleccionados=new ArrayList<VisibleFactura>();		
		
		visiblefacturasSeleccionados=this.getVisibleFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"visiblefactura.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VisibleFacturas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVisibleFactura(row);				
				iRow++;
			}				
			
			for(VisibleFactura visiblefacturaAux:visiblefacturasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVisibleFactura(visiblefacturaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visibilidad Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVisibleFacturasSeleccionados() throws Exception {
		ArrayList<VisibleFactura> visiblefacturasSeleccionados=new ArrayList<VisibleFactura>();		
		
		visiblefacturasSeleccionados=this.getVisibleFacturasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"visiblefactura.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("visiblefacturas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("visiblefactura");
			//elementRoot.appendChild(element);
		
			for(VisibleFactura visiblefacturaAux:visiblefacturasSeleccionados) {
				element = document.createElement("visiblefactura");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVisibleFactura(visiblefacturaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Visibilidad Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVisibleFactura(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA);
		cell = row.createCell(iColumn++);cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR);
		cell = row.createCell(iColumn++);cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABEICE);
		cell = row.createCell(iColumn++);cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE);
		cell = row.createCell(iColumn++);cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABEFUE);
		cell = row.createCell(iColumn++);cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_CABEORDEN);
		cell = row.createCell(iColumn++);cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_DETAAREA);
		cell = row.createCell(iColumn++);cell.setCellValue(VisibleFacturaConstantesFunciones.LABEL_DETAFOTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVisibleFactura(VisibleFactura visiblefactura,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(visiblefactura.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(visiblefactura.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(visiblefactura.getcabe_consignatario());
		cell = row.createCell(iColumn++);cell.setCellValue(visiblefactura.getcabe_tipo_tasa());
		cell = row.createCell(iColumn++);cell.setCellValue(visiblefactura.getcabe_consultor());
		cell = row.createCell(iColumn++);cell.setCellValue(visiblefactura.getcabe_ice());
		cell = row.createCell(iColumn++);cell.setCellValue(visiblefactura.getcabe_transporte());
		cell = row.createCell(iColumn++);cell.setCellValue(visiblefactura.getcabe_fue());
		cell = row.createCell(iColumn++);cell.setCellValue(visiblefactura.getcabe_orden());
		cell = row.createCell(iColumn++);cell.setCellValue(visiblefactura.getdeta_autori_precio());
		cell = row.createCell(iColumn++);cell.setCellValue(visiblefactura.getdeta_area());
		cell = row.createCell(iColumn++);cell.setCellValue(visiblefactura.getdeta_foto());				
	}
	
	public void setFilaDatosExportarXmlVisibleFactura(VisibleFactura visiblefactura,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VisibleFacturaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(visiblefactura.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VisibleFacturaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(visiblefactura.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VisibleFacturaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(visiblefactura.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcabe_consignatario = document.createElement(VisibleFacturaConstantesFunciones.CABECONSIGNATARIO);
		elementcabe_consignatario.appendChild(document.createTextNode(visiblefactura.getcabe_consignatario().toString().trim()));
		element.appendChild(elementcabe_consignatario);

		Element elementcabe_tipo_tasa = document.createElement(VisibleFacturaConstantesFunciones.CABETIPOTASA);
		elementcabe_tipo_tasa.appendChild(document.createTextNode(visiblefactura.getcabe_tipo_tasa().toString().trim()));
		element.appendChild(elementcabe_tipo_tasa);

		Element elementcabe_consultor = document.createElement(VisibleFacturaConstantesFunciones.CABECONSULTOR);
		elementcabe_consultor.appendChild(document.createTextNode(visiblefactura.getcabe_consultor().toString().trim()));
		element.appendChild(elementcabe_consultor);

		Element elementcabe_ice = document.createElement(VisibleFacturaConstantesFunciones.CABEICE);
		elementcabe_ice.appendChild(document.createTextNode(visiblefactura.getcabe_ice().toString().trim()));
		element.appendChild(elementcabe_ice);

		Element elementcabe_transporte = document.createElement(VisibleFacturaConstantesFunciones.CABETRANSPORTE);
		elementcabe_transporte.appendChild(document.createTextNode(visiblefactura.getcabe_transporte().toString().trim()));
		element.appendChild(elementcabe_transporte);

		Element elementcabe_fue = document.createElement(VisibleFacturaConstantesFunciones.CABEFUE);
		elementcabe_fue.appendChild(document.createTextNode(visiblefactura.getcabe_fue().toString().trim()));
		element.appendChild(elementcabe_fue);

		Element elementcabe_orden = document.createElement(VisibleFacturaConstantesFunciones.CABEORDEN);
		elementcabe_orden.appendChild(document.createTextNode(visiblefactura.getcabe_orden().toString().trim()));
		element.appendChild(elementcabe_orden);

		Element elementdeta_autori_precio = document.createElement(VisibleFacturaConstantesFunciones.DETAAUTORIPRECIO);
		elementdeta_autori_precio.appendChild(document.createTextNode(visiblefactura.getdeta_autori_precio().toString().trim()));
		element.appendChild(elementdeta_autori_precio);

		Element elementdeta_area = document.createElement(VisibleFacturaConstantesFunciones.DETAAREA);
		elementdeta_area.appendChild(document.createTextNode(visiblefactura.getdeta_area().toString().trim()));
		element.appendChild(elementdeta_area);

		Element elementdeta_foto = document.createElement(VisibleFacturaConstantesFunciones.DETAFOTO);
		elementdeta_foto.appendChild(document.createTextNode(visiblefactura.getdeta_foto().toString().trim()));
		element.appendChild(elementdeta_foto);
	}
	
	public void generarReporteGroupGenericoVisibleFacturasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VisibleFactura> visiblefacturasSeleccionados=new ArrayList<VisibleFactura>();
		
		visiblefacturasSeleccionados=this.getVisibleFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoVisibleFactura(visiblefacturasSeleccionados);
		
		this.generarReporteVisibleFacturas("Todos",visiblefacturasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVisibleFactura(ArrayList<VisibleFactura> visiblefacturasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VisibleFactura visiblefacturaAux:visiblefacturasSeleccionados) {
				visiblefacturaAux.setsDetalleGeneralEntityReporte(visiblefacturaAux.toString());
			
				if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					visiblefacturaAux.setsDescripcionGeneralEntityReporte1(visiblefacturaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO)) {
					existe=true;
					visiblefacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(visiblefacturaAux.getcabe_consignatario()));
				}
				 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA)) {
					existe=true;
					visiblefacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(visiblefacturaAux.getcabe_tipo_tasa()));
				}
				 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR)) {
					existe=true;
					visiblefacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(visiblefacturaAux.getcabe_consultor()));
				}
				 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABEICE)) {
					existe=true;
					visiblefacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(visiblefacturaAux.getcabe_ice()));
				}
				 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE)) {
					existe=true;
					visiblefacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(visiblefacturaAux.getcabe_transporte()));
				}
				 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABEFUE)) {
					existe=true;
					visiblefacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(visiblefacturaAux.getcabe_fue()));
				}
				 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_CABEORDEN)) {
					existe=true;
					visiblefacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(visiblefacturaAux.getcabe_orden()));
				}
				 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO)) {
					existe=true;
					visiblefacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(visiblefacturaAux.getdeta_autori_precio()));
				}
				 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_DETAAREA)) {
					existe=true;
					visiblefacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(visiblefacturaAux.getdeta_area()));
				}
				 else if(sTipoSeleccionar.equals(VisibleFacturaConstantesFunciones.LABEL_DETAFOTO)) {
					existe=true;
					visiblefacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(visiblefacturaAux.getdeta_foto()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VisibleFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVisibleFactura(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVisibleFactura=true;
				this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=true;
				this.isVisibilidadCeldaGuardarCambiosVisibleFactura=true;
			}
			
			this.isVisibilidadCeldaModificarVisibleFactura=false;
			this.isVisibilidadCeldaActualizarVisibleFactura=false;
			this.isVisibilidadCeldaEliminarVisibleFactura=false;
			this.isVisibilidadCeldaCancelarVisibleFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVisibleFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarVisibleFactura=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVisibleFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=false;
			this.isVisibilidadCeldaGuardarCambiosVisibleFactura=false;
			this.isVisibilidadCeldaModificarVisibleFactura=false;
			this.isVisibilidadCeldaActualizarVisibleFactura=true;
			this.isVisibilidadCeldaEliminarVisibleFactura=false;
			this.isVisibilidadCeldaCancelarVisibleFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVisibleFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarVisibleFactura=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVisibleFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=false;
			this.isVisibilidadCeldaGuardarCambiosVisibleFactura=false;
			this.isVisibilidadCeldaModificarVisibleFactura=false;
			this.isVisibilidadCeldaActualizarVisibleFactura=true;
			this.isVisibilidadCeldaEliminarVisibleFactura=true;
			this.isVisibilidadCeldaCancelarVisibleFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVisibleFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarVisibleFactura=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVisibleFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=false;
			this.isVisibilidadCeldaGuardarCambiosVisibleFactura=false;
			this.isVisibilidadCeldaModificarVisibleFactura=false;
			this.isVisibilidadCeldaActualizarVisibleFactura=true;
			this.isVisibilidadCeldaEliminarVisibleFactura=false;
			this.isVisibilidadCeldaCancelarVisibleFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVisibleFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarVisibleFactura=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVisibleFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=true;
			this.isVisibilidadCeldaGuardarCambiosVisibleFactura=true;
			this.isVisibilidadCeldaModificarVisibleFactura=false;
			this.isVisibilidadCeldaActualizarVisibleFactura=false;
			this.isVisibilidadCeldaEliminarVisibleFactura=false;
			this.isVisibilidadCeldaCancelarVisibleFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVisibleFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarVisibleFactura=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVisibleFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=false;
			this.isVisibilidadCeldaGuardarCambiosVisibleFactura=false;
			this.isVisibilidadCeldaActualizarVisibleFactura=false;
			this.isVisibilidadCeldaEliminarVisibleFactura=false;
			this.isVisibilidadCeldaCancelarVisibleFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVisibleFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarVisibleFactura=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVisibleFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=false;
			this.isVisibilidadCeldaGuardarCambiosVisibleFactura=false;
			this.isVisibilidadCeldaModificarVisibleFactura=true;
			this.isVisibilidadCeldaActualizarVisibleFactura=false;
			this.isVisibilidadCeldaEliminarVisibleFactura=false;
			this.isVisibilidadCeldaCancelarVisibleFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVisibleFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarVisibleFactura=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VisibleFacturaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVisibleFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=true;
			this.isVisibilidadCeldaGuardarCambiosVisibleFactura=true;
		} else {
			this.actualizarEstadoPanelsVisibleFactura(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVisibleFactura=false;
			//this.isVisibilidadCeldaVerFormVisibleFactura=false;
			this.isVisibilidadCeldaDuplicarVisibleFactura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!visiblefacturaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=false;
		} else {
			this.isVisibilidadCeldaNuevoVisibleFactura=false;
			this.isVisibilidadCeldaGuardarCambiosVisibleFactura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(visiblefacturaSessionBean.getEsGuardarRelacionado()) {
			if(!visiblefacturaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=false;												
			}
			
			this.jButtonCerrarVisibleFactura.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVisibleFactura=false;
		}
		
		if(!this.permiteMantenimiento(this.visiblefactura)) {
			this.isVisibilidadCeldaActualizarVisibleFactura=false;
			this.isVisibilidadCeldaEliminarVisibleFactura=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVisibleFactura() {
	}
	
	public void actualizarEstadoPanelsVisibleFactura(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVisibleFactura!=null) {
				this.jScrollPanelDatosEdicionVisibleFactura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisibleFactura!=null) {
				this.jTabbedPaneBusquedasVisibleFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVisibleFactura!=null) {
				this.jScrollPanelDatosVisibleFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionVisibleFactura!=null) {
				this.jPanelPaginacionVisibleFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVisibleFactura!=null) {
				this.jPanelParametrosReportesVisibleFactura.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVisibleFactura!=null) {
				this.jScrollPanelDatosEdicionVisibleFactura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisibleFactura!=null) {
				this.jTabbedPaneBusquedasVisibleFactura.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVisibleFactura!=null) {
				this.jScrollPanelDatosVisibleFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionVisibleFactura!=null) {
				this.jPanelPaginacionVisibleFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVisibleFactura!=null) {
				this.jPanelParametrosReportesVisibleFactura.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVisibleFactura!=null) {
				this.jScrollPanelDatosEdicionVisibleFactura.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisibleFactura!=null) {
				this.jTabbedPaneBusquedasVisibleFactura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVisibleFactura!=null) {
				this.jScrollPanelDatosVisibleFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionVisibleFactura!=null) {
				this.jPanelPaginacionVisibleFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVisibleFactura!=null) {
				this.jPanelParametrosReportesVisibleFactura.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVisibleFactura!=null) {
				this.jScrollPanelDatosEdicionVisibleFactura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisibleFactura!=null) {
				this.jTabbedPaneBusquedasVisibleFactura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVisibleFactura!=null) {
				this.jScrollPanelDatosVisibleFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionVisibleFactura!=null) {
				this.jPanelPaginacionVisibleFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVisibleFactura!=null) {
				this.jPanelParametrosReportesVisibleFactura.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVisibleFactura!=null) {
				this.jScrollPanelDatosEdicionVisibleFactura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisibleFactura!=null) {
				this.jTabbedPaneBusquedasVisibleFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVisibleFactura!=null) {
				this.jScrollPanelDatosVisibleFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionVisibleFactura!=null) {
				this.jPanelPaginacionVisibleFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVisibleFactura!=null) {
				this.jPanelParametrosReportesVisibleFactura.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVisibleFactura!=null) {
				this.jScrollPanelDatosEdicionVisibleFactura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisibleFactura!=null) {
				this.jTabbedPaneBusquedasVisibleFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVisibleFactura!=null) {
				this.jScrollPanelDatosVisibleFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionVisibleFactura!=null) {
				this.jPanelPaginacionVisibleFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVisibleFactura!=null) {
				this.jPanelParametrosReportesVisibleFactura.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVisibleFactura!=null) {
				this.jScrollPanelDatosEdicionVisibleFactura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisibleFactura!=null) {
				this.jTabbedPaneBusquedasVisibleFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVisibleFactura!=null) {
				this.jScrollPanelDatosVisibleFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionVisibleFactura!=null) {
				this.jPanelPaginacionVisibleFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVisibleFactura!=null) {
				this.jPanelParametrosReportesVisibleFactura.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVisibleFactura!=null) {
					this.jTabbedPaneBusquedasVisibleFactura.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVisibleFactura!=null) {
				this.jPanelParametrosReportesVisibleFactura.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVisibleFactura!=null) {
				this.jTabbedPaneBusquedasVisibleFactura.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVisibleFactura!=null) {
				this.jPanelParametrosReportesVisibleFactura.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//VisibleFacturaSessionBean visiblefacturaSessionBean=new VisibleFacturaSessionBean();
		
		if(this.visiblefacturaSessionBean==null) {
			this.visiblefacturaSessionBean=new VisibleFacturaSessionBean();
		}
		
		this.visiblefacturaSessionBean.setsUltimaBusquedaVisibleFactura(this.getsAccionBusqueda());
		this.visiblefacturaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.visiblefacturaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			visiblefacturaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//VisibleFacturaSessionBean visiblefacturaSessionBean=new VisibleFacturaSessionBean();
		
		if(this.visiblefacturaSessionBean==null) {
			this.visiblefacturaSessionBean=new VisibleFacturaSessionBean();
		}
		
		if(this.visiblefacturaSessionBean.getsUltimaBusquedaVisibleFactura()!=null&&!this.visiblefacturaSessionBean.getsUltimaBusquedaVisibleFactura().equals("")) {
			this.setsAccionBusqueda(visiblefacturaSessionBean.getsUltimaBusquedaVisibleFactura());
			this.setiNumeroPaginacion(visiblefacturaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(visiblefacturaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(visiblefacturaSessionBean.getid_empresa());
				visiblefacturaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.visiblefacturaSessionBean.setsUltimaBusquedaVisibleFactura("");
		this.visiblefacturaSessionBean.setiNumeroPaginacion(VisibleFacturaConstantesFunciones.INUMEROPAGINACION);
		this.visiblefacturaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaVisibleFactura(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVisibleFactura() {
		this.updateBorderResaltarBusquedasFormularioVisibleFactura();
		this.updateVisibilidadBusquedasFormularioVisibleFactura();
		this.updateHabilitarBusquedasFormularioVisibleFactura();
	}
	
	public void updateBorderResaltarBusquedasFormularioVisibleFactura() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVisibleFactura.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVisibleFactura() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVisibleFactura.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVisibleFactura() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVisibleFactura.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVisibleFactura(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarVisibleFactura.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioVisibleFactura() throws Exception {

		if(this.jInternalFrameDetalleFormVisibleFactura==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVisibleFactura();
		this.updateVisibilidadResaltarControlesFormularioVisibleFactura();
		this.updateHabilitarResaltarControlesFormularioVisibleFactura();
		
	}
	
	public void updateBorderResaltarControlesFormularioVisibleFactura() throws Exception {
		if(this.jInternalFrameDetalleFormVisibleFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.visiblefacturaConstantesFunciones.resaltaridVisibleFactura!=null && this.jInternalFrameDetalleFormVisibleFactura!=null) {this.jInternalFrameDetalleFormVisibleFactura.jLabelidVisibleFactura.setBorder(this.visiblefacturaConstantesFunciones.resaltaridVisibleFactura);}
		if(this.visiblefacturaConstantesFunciones.resaltarid_empresaVisibleFactura!=null && this.jInternalFrameDetalleFormVisibleFactura!=null) {this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura.setBorder(this.visiblefacturaConstantesFunciones.resaltarid_empresaVisibleFactura);}
		if(this.visiblefacturaConstantesFunciones.resaltarcabe_consignatarioVisibleFactura!=null && this.jInternalFrameDetalleFormVisibleFactura!=null) {this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consignatarioVisibleFactura.setBorderPainted(true);this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consignatarioVisibleFactura.setBorder(this.visiblefacturaConstantesFunciones.resaltarcabe_consignatarioVisibleFactura);}
		if(this.visiblefacturaConstantesFunciones.resaltarcabe_tipo_tasaVisibleFactura!=null && this.jInternalFrameDetalleFormVisibleFactura!=null) {this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_tipo_tasaVisibleFactura.setBorderPainted(true);this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_tipo_tasaVisibleFactura.setBorder(this.visiblefacturaConstantesFunciones.resaltarcabe_tipo_tasaVisibleFactura);}
		if(this.visiblefacturaConstantesFunciones.resaltarcabe_consultorVisibleFactura!=null && this.jInternalFrameDetalleFormVisibleFactura!=null) {this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consultorVisibleFactura.setBorderPainted(true);this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consultorVisibleFactura.setBorder(this.visiblefacturaConstantesFunciones.resaltarcabe_consultorVisibleFactura);}
		if(this.visiblefacturaConstantesFunciones.resaltarcabe_iceVisibleFactura!=null && this.jInternalFrameDetalleFormVisibleFactura!=null) {this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_iceVisibleFactura.setBorderPainted(true);this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_iceVisibleFactura.setBorder(this.visiblefacturaConstantesFunciones.resaltarcabe_iceVisibleFactura);}
		if(this.visiblefacturaConstantesFunciones.resaltarcabe_transporteVisibleFactura!=null && this.jInternalFrameDetalleFormVisibleFactura!=null) {this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_transporteVisibleFactura.setBorderPainted(true);this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_transporteVisibleFactura.setBorder(this.visiblefacturaConstantesFunciones.resaltarcabe_transporteVisibleFactura);}
		if(this.visiblefacturaConstantesFunciones.resaltarcabe_fueVisibleFactura!=null && this.jInternalFrameDetalleFormVisibleFactura!=null) {this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_fueVisibleFactura.setBorderPainted(true);this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_fueVisibleFactura.setBorder(this.visiblefacturaConstantesFunciones.resaltarcabe_fueVisibleFactura);}
		if(this.visiblefacturaConstantesFunciones.resaltarcabe_ordenVisibleFactura!=null && this.jInternalFrameDetalleFormVisibleFactura!=null) {this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_ordenVisibleFactura.setBorderPainted(true);this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_ordenVisibleFactura.setBorder(this.visiblefacturaConstantesFunciones.resaltarcabe_ordenVisibleFactura);}
		if(this.visiblefacturaConstantesFunciones.resaltardeta_autori_precioVisibleFactura!=null && this.jInternalFrameDetalleFormVisibleFactura!=null) {this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_autori_precioVisibleFactura.setBorderPainted(true);this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_autori_precioVisibleFactura.setBorder(this.visiblefacturaConstantesFunciones.resaltardeta_autori_precioVisibleFactura);}
		if(this.visiblefacturaConstantesFunciones.resaltardeta_areaVisibleFactura!=null && this.jInternalFrameDetalleFormVisibleFactura!=null) {this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_areaVisibleFactura.setBorderPainted(true);this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_areaVisibleFactura.setBorder(this.visiblefacturaConstantesFunciones.resaltardeta_areaVisibleFactura);}
		if(this.visiblefacturaConstantesFunciones.resaltardeta_fotoVisibleFactura!=null && this.jInternalFrameDetalleFormVisibleFactura!=null) {this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_fotoVisibleFactura.setBorderPainted(true);this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_fotoVisibleFactura.setBorder(this.visiblefacturaConstantesFunciones.resaltardeta_fotoVisibleFactura);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVisibleFactura() throws Exception {		
		if(this.jInternalFrameDetalleFormVisibleFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
	
		//this.jInternalFrameDetalleFormVisibleFactura.jLabelidVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostraridVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jPanelidVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostraridVisibleFactura);
		//this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarid_empresaVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jPanelid_empresaVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarid_empresaVisibleFactura);
		//this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consignatarioVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarcabe_consignatarioVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jPanelcabe_consignatarioVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarcabe_consignatarioVisibleFactura);
		//this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_tipo_tasaVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarcabe_tipo_tasaVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jPanelcabe_tipo_tasaVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarcabe_tipo_tasaVisibleFactura);
		//this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consultorVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarcabe_consultorVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jPanelcabe_consultorVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarcabe_consultorVisibleFactura);
		//this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_iceVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarcabe_iceVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jPanelcabe_iceVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarcabe_iceVisibleFactura);
		//this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_transporteVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarcabe_transporteVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jPanelcabe_transporteVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarcabe_transporteVisibleFactura);
		//this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_fueVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarcabe_fueVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jPanelcabe_fueVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarcabe_fueVisibleFactura);
		//this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_ordenVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarcabe_ordenVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jPanelcabe_ordenVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrarcabe_ordenVisibleFactura);
		//this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_autori_precioVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrardeta_autori_precioVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jPaneldeta_autori_precioVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrardeta_autori_precioVisibleFactura);
		//this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_areaVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrardeta_areaVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jPaneldeta_areaVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrardeta_areaVisibleFactura);
		//this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_fotoVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrardeta_fotoVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jPaneldeta_fotoVisibleFactura.setVisible(this.visiblefacturaConstantesFunciones.mostrardeta_fotoVisibleFactura);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVisibleFactura() throws Exception {
		if(this.jInternalFrameDetalleFormVisibleFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVisibleFactura!=null) {
	
		this.jInternalFrameDetalleFormVisibleFactura.jLabelidVisibleFactura.setEnabled(this.visiblefacturaConstantesFunciones.activaridVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jComboBoxid_empresaVisibleFactura.setEnabled(this.visiblefacturaConstantesFunciones.activarid_empresaVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consignatarioVisibleFactura.setEnabled(this.visiblefacturaConstantesFunciones.activarcabe_consignatarioVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_tipo_tasaVisibleFactura.setEnabled(this.visiblefacturaConstantesFunciones.activarcabe_tipo_tasaVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_consultorVisibleFactura.setEnabled(this.visiblefacturaConstantesFunciones.activarcabe_consultorVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_iceVisibleFactura.setEnabled(this.visiblefacturaConstantesFunciones.activarcabe_iceVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_transporteVisibleFactura.setEnabled(this.visiblefacturaConstantesFunciones.activarcabe_transporteVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_fueVisibleFactura.setEnabled(this.visiblefacturaConstantesFunciones.activarcabe_fueVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxcabe_ordenVisibleFactura.setEnabled(this.visiblefacturaConstantesFunciones.activarcabe_ordenVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_autori_precioVisibleFactura.setEnabled(this.visiblefacturaConstantesFunciones.activardeta_autori_precioVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_areaVisibleFactura.setEnabled(this.visiblefacturaConstantesFunciones.activardeta_areaVisibleFactura);
		this.jInternalFrameDetalleFormVisibleFactura.jCheckBoxdeta_fotoVisibleFactura.setEnabled(this.visiblefacturaConstantesFunciones.activardeta_fotoVisibleFactura);
		}
	}
	
		
}