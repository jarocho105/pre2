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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.TipoComproConstantesFunciones;
import com.bydan.erp.cartera.util.TipoComproParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoComproParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoComproBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class TipoComproBeanSwingJInternalFrame extends TipoComproJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoComproBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCompro> tipocomproValidator = new ClassValidator<TipoCompro>(TipoCompro.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCompro tipocompro;	
	public TipoCompro tipocomproAux;
	public TipoCompro tipocomproAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCompro tipocomproTotales;
	public Long idTipoComproActual;
	public Long iIdNuevoTipoCompro=0L;
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
	
	public Boolean isPermisoTodoTipoCompro;
	public Boolean isPermisoNuevoTipoCompro;
	public Boolean isPermisoActualizarTipoCompro;
	public Boolean isPermisoActualizarOriginalTipoCompro;
	public Boolean isPermisoEliminarTipoCompro;
	public Boolean isPermisoGuardarCambiosTipoCompro;
	public Boolean isPermisoConsultaTipoCompro;
	public Boolean isPermisoBusquedaTipoCompro;
	public Boolean isPermisoReporteTipoCompro;
	public Boolean isPermisoPaginacionMedioTipoCompro;
	public Boolean isPermisoPaginacionAltoTipoCompro;
	public Boolean isPermisoPaginacionTodoTipoCompro;
	public Boolean isPermisoCopiarTipoCompro;
	public Boolean isPermisoVerFormTipoCompro;
	public Boolean isPermisoDuplicarTipoCompro;
	public Boolean isPermisoOrdenTipoCompro;
	
	
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
	
	public TipoComproParameterReturnGeneral tipocomproReturnGeneral;
	public TipoComproParameterReturnGeneral tipocomproParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCompro=false;
	public Boolean esParaAccionDesdeFormularioTipoCompro=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoComproSessionBeanAdditional tipocomproSessionBeanAdditional=null;
	
	public TipoComproSessionBeanAdditional getTipoComproSessionBeanAdditional() {
		return this.tipocomproSessionBeanAdditional;
	}
	
	public void setTipoComproSessionBeanAdditional(TipoComproSessionBeanAdditional tipocomproSessionBeanAdditional) {
		try {
			this.tipocomproSessionBeanAdditional=tipocomproSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoComproBeanSwingJInternalFrameAdditional tipocomproBeanSwingJInternalFrameAdditional=null;
	//public class TipoComproBeanSwingJInternalFrame
	
	public TipoComproBeanSwingJInternalFrameAdditional getTipoComproBeanSwingJInternalFrameAdditional() {
		return this.tipocomproBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoComproBeanSwingJInternalFrameAdditional(TipoComproBeanSwingJInternalFrameAdditional tipocomproBeanSwingJInternalFrameAdditional) {
		try {
			this.tipocomproBeanSwingJInternalFrameAdditional=tipocomproBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoComproLogic tipocomproLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCompro tipocomproBean;
	public TipoComproConstantesFunciones tipocomproConstantesFunciones;
	//public TipoComproParameterReturnGeneral tipocomproReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoCompro> tipocompros;	
	//public List<TipoCompro> tipocomprosEliminados;
	//public List<TipoCompro> tipocomprosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCompro=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCompro=true;
	public Boolean isVisibilidadCeldaCopiarTipoCompro=true;
	public Boolean isVisibilidadCeldaVerFormTipoCompro=true;
	public Boolean isVisibilidadCeldaOrdenTipoCompro=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCompro=false;
	public Boolean isVisibilidadCeldaModificarTipoCompro=false;
	public Boolean isVisibilidadCeldaActualizarTipoCompro=false;
	public Boolean isVisibilidadCeldaEliminarTipoCompro=false;
	public Boolean isVisibilidadCeldaCancelarTipoCompro=false;
	public Boolean isVisibilidadCeldaGuardarTipoCompro=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCompro=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoCompro() {
		return this.iIdNuevoTipoCompro;
	}

	public void setiIdNuevoTipoCompro(Long iIdNuevoTipoCompro) {
		this.iIdNuevoTipoCompro = iIdNuevoTipoCompro;
	}
	
	public Long getidTipoComproActual() {
		return this.idTipoComproActual;
	}

	public void setidTipoComproActual(Long idTipoComproActual) {
		this.idTipoComproActual = idTipoComproActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCompro gettipocompro() {
		return this.tipocompro;
	}

	public void settipocompro(TipoCompro tipocompro) {
		this.tipocompro = tipocompro;
	}
	
	public TipoCompro gettipocomproAux() {
		return this.tipocomproAux;
	}

	public void settipocomproAux(TipoCompro tipocomproAux) {
		this.tipocomproAux = tipocomproAux;
	}				
	
	public TipoCompro gettipocomproAnterior() {
		return this.tipocomproAnterior;
	}

	public void settipocomproAnterior(TipoCompro tipocomproAnterior) {
		this.tipocomproAnterior = tipocomproAnterior;
	}	
	
	public TipoCompro gettipocomproTotales() {
		return this.tipocomproTotales;
	}

	public void settipocomproTotales(TipoCompro tipocomproTotales) {
		this.tipocomproTotales = tipocomproTotales;
	}	
	
	public TipoCompro gettipocomproBean() {
		return this.tipocomproBean;
	}

	public void settipocomproBean(TipoCompro tipocomproBean) {
		this.tipocomproBean = tipocomproBean;
	}	
	
	public TipoComproParameterReturnGeneral gettipocomproReturnGeneral() {
		return this.tipocomproReturnGeneral;
	}

	public void settipocomproReturnGeneral(TipoComproParameterReturnGeneral tipocomproReturnGeneral) {
		this.tipocomproReturnGeneral = tipocomproReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
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
	
	
	public TipoComproLogic getTipoComproLogic()	{		
		return tipocomproLogic;
	}

	public void setTipoComproLogic(TipoComproLogic tipocomproLogic) {
		this.tipocomproLogic = tipocomproLogic;
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
	
	public Boolean getIsEsNuevoTipoCompro() {
		return isEsNuevoTipoCompro;
	}

	public void setIsEsNuevoTipoCompro(Boolean isEsNuevoTipoCompro) {
		this.isEsNuevoTipoCompro = isEsNuevoTipoCompro;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCompro() {
		return esParaAccionDesdeFormularioTipoCompro;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCompro(Boolean esParaAccionDesdeFormularioTipoCompro) {
		this.esParaAccionDesdeFormularioTipoCompro = esParaAccionDesdeFormularioTipoCompro;
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

			if(this.tipocomproSessionBean==null) {
				this.tipocomproSessionBean=new TipoComproSessionBean();
			}

			if(!this.tipocomproSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipocomproSessionBean.getlidEmpresaActual());
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

					if(this.tipocompro!=null) {
						this.tipocompro.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoCompro!=null) {
						this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoCompro.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoCompro!=null) {
						if(this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoComproGenerico)throws Exception
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
				jComboBoxid_empresaTipoComproGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoComproGenerico!=null && jComboBoxid_empresaTipoComproGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoComproGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoCompro tipocompro,JComboBox jComboBoxid_empresaTipoComproGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoComproGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoComproGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipocompro.setid_empresa(empresaAux.getId());
				tipocompro.setempresa_descripcion(TipoComproConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipocompro.setEmpresa(empresaAux);			}
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

					if(!TipoComproJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoCompro!=null) { 
							this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoCompro!=null) { 
					}

					if(!TipoComproJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoCompro!=null) {
							this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoCompro!=null) {
							this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoCompro() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoComproConstantesFunciones.refrescarForeignKeysDescripcionesTipoCompro(this.tipocomproLogic.getTipoCompros());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoComproConstantesFunciones.refrescarForeignKeysDescripcionesTipoCompro(this.tipocompros);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocomproLogic.setTipoCompros(this.tipocompros);
			tipocomproLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoComproParameterReturnGeneral getTipoComproParameterGeneral() {
		return this.tipocomproParameterGeneral;
	}
	
	public void setTipoComproParameterGeneral(TipoComproParameterReturnGeneral tipocomproParameterGeneral) {
		this.tipocomproParameterGeneral = tipocomproParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCompro() {
		return isPermisoTodoTipoCompro;
	}

	public void setIsPermisoTodoTipoCompro(Boolean isPermisoTodoTipoCompro) {
		this.isPermisoTodoTipoCompro = isPermisoTodoTipoCompro;
	}

	public Boolean getIsPermisoNuevoTipoCompro() {
		return isPermisoNuevoTipoCompro;
	}

	public void setIsPermisoNuevoTipoCompro(Boolean isPermisoNuevoTipoCompro) {
		this.isPermisoNuevoTipoCompro = isPermisoNuevoTipoCompro;
	}

	public Boolean getIsPermisoActualizarTipoCompro() {
		return isPermisoActualizarTipoCompro;
	}

	public void setIsPermisoActualizarTipoCompro(Boolean isPermisoActualizarTipoCompro) {
		this.isPermisoActualizarTipoCompro = isPermisoActualizarTipoCompro;
	}

	public Boolean getIsPermisoEliminarTipoCompro() {
		return isPermisoEliminarTipoCompro;
	}

	public void setIsPermisoEliminarTipoCompro(Boolean isPermisoEliminarTipoCompro) {
		this.isPermisoEliminarTipoCompro = isPermisoEliminarTipoCompro;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCompro() {
		return isPermisoGuardarCambiosTipoCompro;
	}

	public void setIsPermisoGuardarCambiosTipoCompro(Boolean isPermisoGuardarCambiosTipoCompro) {
		this.isPermisoGuardarCambiosTipoCompro = isPermisoGuardarCambiosTipoCompro;
	}
	
	public Boolean getIsPermisoConsultaTipoCompro() {
		return isPermisoConsultaTipoCompro;
	}

	public void setIsPermisoConsultaTipoCompro(Boolean isPermisoConsultaTipoCompro) {
		this.isPermisoConsultaTipoCompro = isPermisoConsultaTipoCompro;
	}

	public Boolean getIsPermisoBusquedaTipoCompro() {
		return isPermisoBusquedaTipoCompro;
	}

	public void setIsPermisoBusquedaTipoCompro(Boolean isPermisoBusquedaTipoCompro) {
		this.isPermisoBusquedaTipoCompro = isPermisoBusquedaTipoCompro;
	}

	public Boolean getIsPermisoReporteTipoCompro() {
		return isPermisoReporteTipoCompro;
	}

	public void setIsPermisoReporteTipoCompro(Boolean isPermisoReporteTipoCompro) {
		this.isPermisoReporteTipoCompro = isPermisoReporteTipoCompro;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCompro() {
		return isPermisoPaginacionMedioTipoCompro;
	}

	public void setIsPermisoPaginacionMedioTipoCompro(Boolean isPermisoPaginacionMedioTipoCompro) {
		this.isPermisoPaginacionMedioTipoCompro = isPermisoPaginacionMedioTipoCompro;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCompro() {
		return isPermisoPaginacionTodoTipoCompro;
	}

	public void setIsPermisoPaginacionTodoTipoCompro(Boolean isPermisoPaginacionTodoTipoCompro) {
		this.isPermisoPaginacionTodoTipoCompro = isPermisoPaginacionTodoTipoCompro;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCompro() {
		return isPermisoPaginacionAltoTipoCompro;
	}

	public void setIsPermisoPaginacionAltoTipoCompro(Boolean isPermisoPaginacionAltoTipoCompro) {
		this.isPermisoPaginacionAltoTipoCompro = isPermisoPaginacionAltoTipoCompro;
	}
	
	public Boolean getIsPermisoCopiarTipoCompro() {
		return isPermisoCopiarTipoCompro;
	}

	public void setIsPermisoCopiarTipoCompro(Boolean isPermisoCopiarTipoCompro) {
		this.isPermisoCopiarTipoCompro = isPermisoCopiarTipoCompro;
	}
	
	public Boolean getIsPermisoVerFormTipoCompro() {
		return isPermisoVerFormTipoCompro;
	}

	public void setIsPermisoVerFormTipoCompro(Boolean isPermisoVerFormTipoCompro) {
		this.isPermisoVerFormTipoCompro = isPermisoVerFormTipoCompro;
	}
	
	public Boolean getIsPermisoDuplicarTipoCompro() {
		return isPermisoDuplicarTipoCompro;
	}

	public void setIsPermisoDuplicarTipoCompro(Boolean isPermisoDuplicarTipoCompro) {
		this.isPermisoDuplicarTipoCompro = isPermisoDuplicarTipoCompro;
	}
	
	public Boolean getIsPermisoOrdenTipoCompro() {
		return isPermisoOrdenTipoCompro;
	}

	public void setIsPermisoOrdenTipoCompro(Boolean isPermisoOrdenTipoCompro) {
		this.isPermisoOrdenTipoCompro = isPermisoOrdenTipoCompro;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCompro() {
		return isVisibilidadCeldaNuevoTipoCompro;
	}

	public void setIsVisibilidadCeldaNuevoTipoCompro(Boolean isVisibilidadCeldaNuevoTipoCompro) {
		this.isVisibilidadCeldaNuevoTipoCompro = isVisibilidadCeldaNuevoTipoCompro;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCompro() {
		return isVisibilidadCeldaDuplicarTipoCompro;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCompro(Boolean isVisibilidadCeldaDuplicarTipoCompro) {
		this.isVisibilidadCeldaDuplicarTipoCompro = isVisibilidadCeldaDuplicarTipoCompro;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCompro() {
		return isVisibilidadCeldaCopiarTipoCompro;
	}

	public void setIsVisibilidadCeldaCopiarTipoCompro(Boolean isVisibilidadCeldaCopiarTipoCompro) {
		this.isVisibilidadCeldaCopiarTipoCompro = isVisibilidadCeldaCopiarTipoCompro;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCompro() {
		return isVisibilidadCeldaVerFormTipoCompro;
	}

	public void setIsVisibilidadCeldaVerFormTipoCompro(Boolean isVisibilidadCeldaVerFormTipoCompro) {
		this.isVisibilidadCeldaVerFormTipoCompro = isVisibilidadCeldaVerFormTipoCompro;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCompro() {
		return isVisibilidadCeldaOrdenTipoCompro;
	}

	public void setIsVisibilidadCeldaOrdenTipoCompro(Boolean isVisibilidadCeldaOrdenTipoCompro) {
		this.isVisibilidadCeldaOrdenTipoCompro = isVisibilidadCeldaOrdenTipoCompro;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCompro() {
		return isVisibilidadCeldaNuevoRelacionesTipoCompro;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCompro(Boolean isVisibilidadCeldaNuevoRelacionesTipoCompro) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCompro = isVisibilidadCeldaNuevoRelacionesTipoCompro;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCompro() {
		return isVisibilidadCeldaModificarTipoCompro;
	}

	public void setIsVisibilidadCeldaModificarTipoCompro(Boolean isVisibilidadCeldaModificarTipoCompro) {
		this.isVisibilidadCeldaModificarTipoCompro = isVisibilidadCeldaModificarTipoCompro;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCompro() {
		return isVisibilidadCeldaActualizarTipoCompro;
	}

	public void setIsVisibilidadCeldaActualizarTipoCompro(Boolean isVisibilidadCeldaActualizarTipoCompro) {
		this.isVisibilidadCeldaActualizarTipoCompro = isVisibilidadCeldaActualizarTipoCompro;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCompro() {
		return isVisibilidadCeldaEliminarTipoCompro;
	}

	public void setIsVisibilidadCeldaEliminarTipoCompro(Boolean isVisibilidadCeldaEliminarTipoCompro) {
		this.isVisibilidadCeldaEliminarTipoCompro = isVisibilidadCeldaEliminarTipoCompro;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCompro() {
		return isVisibilidadCeldaCancelarTipoCompro;
	}

	public void setIsVisibilidadCeldaCancelarTipoCompro(Boolean isVisibilidadCeldaCancelarTipoCompro) {
		this.isVisibilidadCeldaCancelarTipoCompro = isVisibilidadCeldaCancelarTipoCompro;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCompro() {
		return isVisibilidadCeldaGuardarTipoCompro;
	}

	public void setIsVisibilidadCeldaGuardarTipoCompro(Boolean isVisibilidadCeldaGuardarTipoCompro) {
		this.isVisibilidadCeldaGuardarTipoCompro = isVisibilidadCeldaGuardarTipoCompro;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCompro() {
		return isVisibilidadCeldaGuardarCambiosTipoCompro;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCompro(Boolean isVisibilidadCeldaGuardarCambiosTipoCompro) {
		this.isVisibilidadCeldaGuardarCambiosTipoCompro = isVisibilidadCeldaGuardarCambiosTipoCompro;
	}
		
	public TipoComproSessionBean gettipocomproSessionBean() {
		return this.tipocomproSessionBean;
	}
	
	public void settipocomproSessionBean(TipoComproSessionBean tipocomproSessionBean) {
		this.tipocomproSessionBean=tipocomproSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCompro(TipoCompro tipocompro)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipocompro,null);
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
	
	public void bugActualizarReferenciaActual(TipoCompro tipocompro,TipoCompro tipocomproAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCompro(tipocompro);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocomproAux.setId(tipocompro.getId());
		tipocomproAux.setVersionRow(tipocompro.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCompro();
		
			int intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoComproJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCompro(this.tipocompro,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocomproValidator.getInvalidValues(this.tipocompro);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocomproLogic.setDatosCliente(datosCliente);
			tipocomproLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocomproAux=new  TipoCompro();
				
				tipocomproAux.setIsNew(true);
				tipocomproAux.setIsChanged(true);
				
				tipocomproAux.setTipoComproOriginal(this.tipocompro);
				
				tipocomproAux.setId(this.tipocompro.getId());	
				tipocomproAux.setVersionRow(this.tipocompro.getVersionRow());	
				tipocomproAux.setid_empresa(this.tipocompro.getid_empresa());	
				tipocomproAux.setcodigo(this.tipocompro.getcodigo());	
				tipocomproAux.setnombre(this.tipocompro.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocomproSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocomproSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocomproAux,tipocomproLogic.getTipoCompros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocomproAux,tipocompros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocomproSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocomproSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomproLogic.saveTipoCompros();//WithConnection
						//tipocomproLogic.getSetVersionRowTipoCompros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocompro,tipocomproAux);
					
					this.refrescarForeignKeysDescripcionesTipoCompro();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocomproSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocomproLogic.saveTipoComproRelaciones(tipocomproAux);//WithConnection
								//tipocomproLogic.getSetVersionRowTipoCompros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocompro,tipocomproAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocomproSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocomproSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocomproAux,tipocomproLogic.getTipoCompros());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocomproAux,tipocompros);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocompro,tipocomproAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocomproAux=new  TipoCompro();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocomproSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocomproSessionBean.getEsGuardarRelacionado() && this.tipocompro.getId()>=0)) {
						
					tipocomproAux.setIsNew(false);
				}
				
				tipocomproAux.setIsDeleted(false);
			
				tipocomproAux.setId(this.tipocompro.getId());	
				tipocomproAux.setVersionRow(this.tipocompro.getVersionRow());	
				tipocomproAux.setid_empresa(this.tipocompro.getid_empresa());	
				tipocomproAux.setcodigo(this.tipocompro.getcodigo());	
				tipocomproAux.setnombre(this.tipocompro.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocomproAux,tipocomproLogic.getTipoCompros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocomproAux,tipocompros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocomproSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocomproSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomproLogic.saveTipoCompros();//WithConnection
						//tipocomproLogic.getSetVersionRowTipoCompros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocompro,tipocomproAux);
					
					this.refrescarForeignKeysDescripcionesTipoCompro();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocomproSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocomproLogic.saveTipoComproRelaciones(tipocomproAux);//WithConnection
								//tipocomproLogic.getSetVersionRowTipoCompros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocompro,tipocomproAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocomproSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocomproSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocomproAux,tipocomproLogic.getTipoCompros());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocomproAux,tipocompros);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocompro,tipocomproAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocomproAux=new  TipoCompro();
				
				tipocomproAux.setIsNew(false);
				tipocomproAux.setIsChanged(false);
				
				tipocomproAux.setIsDeleted(true);
				
				tipocomproAux.setId(this.tipocompro.getId());	
				tipocomproAux.setVersionRow(this.tipocompro.getVersionRow());	
				tipocomproAux.setid_empresa(this.tipocompro.getid_empresa());	
				tipocomproAux.setcodigo(this.tipocompro.getcodigo());	
				tipocomproAux.setnombre(this.tipocompro.getnombre());	
				
				if(this.tipocomproSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocomproAux.getId()>=0) {	
						this.tipocomprosEliminados.add(tipocomproAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocomproAux,tipocomproLogic.getTipoCompros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocomproAux,tipocompros);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocomproSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocomproSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomproLogic.saveTipoCompros();//WithConnection
						//tipocomproLogic.getSetVersionRowTipoCompros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocomproSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocomproLogic.saveTipoComproRelaciones(tipocomproAux);//WithConnection
								//tipocomproLogic.getSetVersionRowTipoCompros();//WithConnection
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
							if(this.tipocomproSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocomproSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocomproAux,tipocomproLogic.getTipoCompros());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocomproAux,tipocompros);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.getTipoCompros().addAll(this.tipocomprosEliminados);
					
					tipocomproLogic.saveTipoCompros();//WithConnection
					//tipocomproLogic.getSetVersionRowTipoCompros();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoCompro();
				
				this.tipocomprosEliminados= new ArrayList<TipoCompro>();		
			}
			
			if(this.tipocomproSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomproSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Compro GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Compro",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocompro=tipocomproAux;
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
      		//this.finishProcessTipoCompro();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCompro tipocomproLocal) throws Exception {
		
		if(this.tipocomproSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCompro tipocomproLocal) throws Exception {	
		if(this.tipocomproSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipocomproLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoComproActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocomproValidator.getInvalidValues(this.tipocompro);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCompro tipocompro,List<TipoCompro> tipocompros) throws Exception {
		try	{		
			TipoComproConstantesFunciones.actualizarLista(tipocompro,tipocompros,this.tipocomproSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCompro tipocompro,List<TipoCompro> tipocompros) throws Exception {
		try	{			
			TipoComproConstantesFunciones.actualizarSelectedLista(tipocompro,tipocompros);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCompro> tipocomprosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocomprosLocal=this.tipocomproLogic.getTipoCompros();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocomprosLocal=this.tipocompros;
			}
			//ARCHITECTURE
		
			for(TipoCompro tipocomproLocal:tipocomprosLocal) {
				if(this.permiteMantenimiento(tipocomproLocal) && tipocomproLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoComproConstantesFunciones.getTipoComproLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoComproConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCompro.jLabelid_empresaTipoCompro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoComproConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCompro.jLabelcodigoTipoCompro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoComproConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCompro.jLabelnombreTipoCompro,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCompro.jLabelid_empresaTipoCompro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCompro.jLabelcodigoTipoCompro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCompro.jLabelnombreTipoCompro,"");
		
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
		this.iIdNuevoTipoCompro--;	
		
		
		this.tipocomproAux=new TipoCompro();
		
		this.tipocomproAux.setId(this.iIdNuevoTipoCompro);
		this.tipocomproAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocomproLogic.getTipoCompros().add(this.tipocomproAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocompros.add(this.tipocomproAux);
		}
		//ARCHITECTURE
		
		this.tipocompro=this.tipocomproAux;
		
		if(TipoComproJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCompro(this.tipocompro);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCompro(this.tipocompro);
		}
				
		//this.setDefaultControlesTipoCompro();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCompro();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCompro();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCompro();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCompro(this.tipocomproBean,this.tipocompro,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoComproConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocomproSessionBean.getConGuardarRelaciones()) {
			classes=TipoComproConstantesFunciones.getClassesRelationshipsOfTipoCompro(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocomproReturnGeneral=tipocomproLogic.procesarEventosTipoComprosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocomproLogic.getTipoCompros(),this.tipocompro,this.tipocomproParameterGeneral,this.isEsNuevoTipoCompro,classes);//this.tipocomproLogic.getTipoCompro()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCompro(this.tipocomproReturnGeneral,this.tipocomproBean,false);
		
		if(this.tipocomproReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCompro(this.tipocomproReturnGeneral.getTipoCompro());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCompro(this.tipocomproReturnGeneral.getTipoCompro());
		}
		
		if(this.tipocomproReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCompro(this.tipocomproReturnGeneral.getTipoCompro(),classes);//this.tipocomproBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCompro(this.tipocompro,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCompro();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCompro();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoComproBeanSwingJInternalFrameAdditional.RecargarFormTipoCompro(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCompro(false);
						
			if(tipocomproSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoComproJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCompro();
			}
			
			this.actualizarVisualTableDatosTipoCompro();
			
			this.jTableDatosTipoCompro.setRowSelectionInterval(this.getIndiceNuevoTipoCompro(), this.getIndiceNuevoTipoCompro());
			
			this.seleccionarFilaTablaTipoComproActual();
						
			this.actualizarEstadoCeldasBotonesTipoCompro("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCompro(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCompro.jTextFieldcodigoTipoCompro.setEnabled(isHabilitar && this.tipocomproConstantesFunciones.activarcodigoTipoCompro);
		this.jInternalFrameDetalleFormTipoCompro.jTextAreanombreTipoCompro.setEnabled(isHabilitar && this.tipocomproConstantesFunciones.activarnombreTipoCompro);	
		//
		this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro.setEnabled(isHabilitar && this.tipocomproConstantesFunciones.activarid_empresaTipoCompro);
	};
	
	public void setDefaultControlesTipoCompro() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCompro(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocomproSessionBean.setConGuardarRelaciones(true);			
			this.tipocomproSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCompro.jTabbedPaneRelacionesTipoCompro.setVisible(true);
			
					
		} else {
			//this.tipocomproSessionBean.setConGuardarRelaciones(false);			
			this.tipocomproSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCompro.jTabbedPaneRelacionesTipoCompro.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoCompro() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCompro tipocomproAux:this.tipocomproLogic.getTipoCompros()) {
				if(tipocomproAux.getId().equals(this.iIdNuevoTipoCompro)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCompro tipocomproAux:this.tipocompros) {
				if(tipocomproAux.getId().equals(this.iIdNuevoTipoCompro)) {
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
	
	public int getIndiceActualTipoCompro(TipoCompro tipocompro,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCompro tipocomproAux:this.tipocomproLogic.getTipoCompros()) {
				if(tipocomproAux.getId().equals(tipocompro.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCompro tipocomproAux:this.tipocompros) {
				if(tipocomproAux.getId().equals(tipocompro.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCompro(TipoCompro tipocomproOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCompro tipocomproAux:this.tipocomproLogic.getTipoCompros()) {
				if(tipocomproAux.getTipoComproOriginal().getId().equals(tipocomproOriginal.getId())) {
					existe=true;
					tipocomproOriginal.setId(tipocomproAux.getId());
					tipocomproOriginal.setVersionRow(tipocomproAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCompro tipocomproAux:this.tipocompros) {
				if(tipocomproAux.getTipoComproOriginal().getId().equals(tipocomproOriginal.getId())) {
					existe=true;
					tipocomproOriginal.setId(tipocomproAux.getId());
					tipocomproOriginal.setVersionRow(tipocomproAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCompro(Boolean esParaCancelar) throws Exception {
		tipocomprosAux=new ArrayList<TipoCompro>();
		tipocomproAux=new TipoCompro();
		
		if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCompro tipocomproAux:this.tipocomproLogic.getTipoCompros()) {
					if(tipocomproAux.getId()<0) {
						tipocomprosAux.add(tipocomproAux);
					}		
				}
				this.iIdNuevoTipoCompro=0L;
				this.tipocomproLogic.getTipoCompros().removeAll(tipocomprosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCompro tipocomproAux:this.tipocompros) {
					if(tipocomproAux.getId()<0) {
						tipocomprosAux.add(tipocomproAux);
					}		
				}
				this.iIdNuevoTipoCompro=0L;
				this.tipocompros.removeAll(tipocomprosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCompro 
					&& this.tipocomproLogic.getTipoCompros().size()>0
					) {
					tipocomproAux=this.tipocomproLogic.getTipoCompros().get(this.tipocomproLogic.getTipoCompros().size() - 1);
				
					if(tipocomproAux.getId()<0) {
						this.tipocomproLogic.getTipoCompros().remove(tipocomproAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCompro && this.tipocompros.size()>0) {
					tipocomproAux=this.tipocompros.get(this.tipocompros.size() - 1);
				
					if(tipocomproAux.getId()<0) {
						this.tipocompros.remove(tipocomproAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCompro(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocompro.getId()<0) {
				this.tipocomproLogic.getTipoCompros().remove(this.tipocompro);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocompro.getId()<0) {
				this.tipocompros.remove(this.tipocompro);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCompro(List<TipoCompro> tipocomprosAux) throws Exception {
		TipoComproConstantesFunciones.setEstadosInicialesTipoCompro(tipocomprosAux);
	}
	
	public void setEstadosInicialesTipoCompro(TipoCompro tipocomproAux) throws Exception {
		TipoComproConstantesFunciones.setEstadosInicialesTipoCompro(tipocomproAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoComproActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCompro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoComproActual()) {
				if(!this.isEsNuevoTipoCompro) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCompro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCompro=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoComproActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Compro ?", "MANTENIMIENTO DE Tipo Compro", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCompro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCompro tipocompro) throws Exception {
		TipoComproConstantesFunciones.seleccionarAsignar(this.tipocompro,tipocompro);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCompro=this.isPermisoActualizarOriginalTipoCompro;
			
			
			this.seleccionarAsignar(tipocompro);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoComproConstantesFunciones.quitarEspaciosTipoCompro(this.tipocompro,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCompro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocomproSessionBean.setsFuncionBusquedaRapida(this.tipocomproSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCompro) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCompro(esParaCancelar);				
				this.cancelarNuevoTipoCompro(esParaCancelar);								
			}
			
			this.tipocompro=new TipoCompro();
			
			this.inicializarTipoCompro();
			
			this.actualizarEstadoCeldasBotonesTipoCompro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCompro() throws Exception {
		try {
			TipoComproConstantesFunciones.inicializarTipoCompro(this.tipocompro);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocomproLogic.getTipoCompros().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCompros(String sAccionBusqueda,List<TipoCompro> tipocomprosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCompro"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoComproMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoComproMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCompro"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Compros");		
		parameters.put("busquedapor", TipoComproConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCompro=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoComproConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoComproConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCompro=new JRBeanArrayDataSource(TipoComproJInternalFrame.TraerTipoComproBeans(tipocomprosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCompro);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoComproConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoComproConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoComproBean.TraerTipoComproBeans(tipocomprosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCompros(sAccionBusqueda,sTipoArchivoReporte,tipocomprosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCompros(sAccionBusqueda,sTipoArchivoReporte,tipocomprosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoComproActionPerformed(null);
					//this.generarExcelReporteTipoCompros(sAccionBusqueda,sTipoArchivoReporte,tipocomprosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCompros(sAccionBusqueda,sTipoArchivoReporte,tipocomprosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCompros(sAccionBusqueda,sTipoArchivoReporte,tipocomprosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCompros(sAccionBusqueda,sTipoArchivoReporte,tipocomprosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCompros(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCompro> tipocomprosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocompro";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCompros");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCompro("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCompro tipocompro : tipocomprosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoComproConstantesFunciones.generarExcelReporteDataTipoCompro("NORMAL",row,workbook,tipocompro,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomproSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCompro(String sTipo,Row row,Workbook workbook) {
		
		TipoComproConstantesFunciones.generarExcelReporteHeaderTipoCompro(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCompros(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCompro> tipocomprosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocompro_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCompros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCompro tipocompro : tipocomprosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoComproConstantesFunciones.getTipoComproDescripcion(tipocompro));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoComproConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoComproConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocompro.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoComproConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoComproConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocompro.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoComproConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoComproConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocompro.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomproSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCompros(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCompro> tipocomprosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCompro> tipocomprosRespaldo=null;
		
		classes=TipoComproConstantesFunciones.getClassesRelationshipsOfTipoCompro(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocomproLogic.setDatosCliente(this.datosCliente);
		this.tipocomproLogic.setDatosDeep(this.datosDeep);
		this.tipocomproLogic.setIsConDeep(true);
		
		tipocomprosRespaldo=this.tipocomproLogic.getTipoCompros();
		
		this.tipocomproLogic.setTipoCompros(tipocomprosParaReportes);	
		this.tipocomproLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocomprosParaReportes=this.tipocomproLogic.getTipoCompros();
		this.tipocomproLogic.setTipoCompros(tipocomprosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocompro_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCompros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCompro("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCompro tipocompro : tipocomprosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCompro("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoComproConstantesFunciones.generarExcelReporteDataTipoCompro("NORMAL",row,workbook,tipocompro,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoComproConstantesFunciones.getTipoComproDescripcion(tipocompro));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomproSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCompro.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCompro.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCompro.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCompro.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCompro() throws Exception {		
		this.startProcessTipoCompro(true);
	}
	
	public void startProcessTipoCompro(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoCompro ,this.jPanelParametrosReportesTipoCompro, this.jScrollPanelDatosTipoCompro,this.jPanelPaginacionTipoCompro, this.jScrollPanelDatosEdicionTipoCompro, this.jPanelAccionesTipoCompro,this.jPanelAccionesFormularioTipoCompro,this.jmenuBarTipoCompro,this.jmenuBarDetalleTipoCompro,this.jTtoolBarTipoCompro,this.jTtoolBarDetalleTipoCompro);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCompro=this.jTabbedPaneBusquedasTipoCompro; 
		
		final JPanel jPanelParametrosReportesTipoCompro=this.jPanelParametrosReportesTipoCompro;
		//final JScrollPane jScrollPanelDatosTipoCompro=this.jScrollPanelDatosTipoCompro;
		final JTable jTableDatosTipoCompro=this.jTableDatosTipoCompro;		
		final JPanel jPanelPaginacionTipoCompro=this.jPanelPaginacionTipoCompro;
		//final JScrollPane jScrollPanelDatosEdicionTipoCompro=this.jScrollPanelDatosEdicionTipoCompro;
		final JPanel jPanelAccionesTipoCompro=this.jPanelAccionesTipoCompro;
		
		JPanel jPanelCamposAuxiliarTipoCompro=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCompro=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) {
			jPanelCamposAuxiliarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jPanelCamposTipoCompro;
			jPanelAccionesFormularioAuxiliarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jPanelAccionesFormularioTipoCompro;
		}
		
		final JPanel jPanelCamposTipoCompro=jPanelCamposAuxiliarTipoCompro;
		final JPanel jPanelAccionesFormularioTipoCompro=jPanelAccionesFormularioAuxiliarTipoCompro;
		
		
		final JMenuBar jmenuBarTipoCompro=this.jmenuBarTipoCompro;
		final JToolBar jTtoolBarTipoCompro=this.jTtoolBarTipoCompro;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCompro=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCompro=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) {
			jmenuBarDetalleAuxiliarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jmenuBarDetalleTipoCompro;
			jTtoolBarDetalleAuxiliarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jTtoolBarDetalleTipoCompro;
		}
		
		final JMenuBar jmenuBarDetalleTipoCompro=jmenuBarDetalleAuxiliarTipoCompro;
		final JToolBar jTtoolBarDetalleTipoCompro=jTtoolBarDetalleAuxiliarTipoCompro;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCompro;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCompro;
			processRunnable.jTableDatos=jTableDatosTipoCompro;
			processRunnable.jPanelCampos=jPanelCamposTipoCompro;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCompro;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCompro;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCompro;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCompro;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCompro;
			processRunnable.jTtoolBar=jTtoolBarTipoCompro;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCompro;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCompro ,jPanelParametrosReportesTipoCompro,jTableDatosTipoCompro, /*jScrollPanelDatosTipoCompro,*/jPanelCamposTipoCompro,jPanelPaginacionTipoCompro, /*jScrollPanelDatosEdicionTipoCompro,*/ jPanelAccionesTipoCompro,jPanelAccionesFormularioTipoCompro,jmenuBarTipoCompro,jmenuBarDetalleTipoCompro,jTtoolBarTipoCompro,jTtoolBarDetalleTipoCompro);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCompro ,jPanelParametrosReportesTipoCompro, jScrollPanelDatosTipoCompro,jPanelPaginacionTipoCompro, jScrollPanelDatosEdicionTipoCompro, jPanelAccionesTipoCompro,jPanelAccionesFormularioTipoCompro,jmenuBarTipoCompro,jmenuBarDetalleTipoCompro,jTtoolBarTipoCompro,jTtoolBarDetalleTipoCompro);
						
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
	
	public void finishProcessTipoCompro() {// throws Exception 
		this.finishProcessTipoCompro(true);
	}
	
	public void finishProcessTipoCompro(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoCompro ,this.jPanelParametrosReportesTipoCompro, this.jScrollPanelDatosTipoCompro,this.jPanelPaginacionTipoCompro, this.jScrollPanelDatosEdicionTipoCompro, this.jPanelAccionesTipoCompro,this.jPanelAccionesFormularioTipoCompro,this.jmenuBarTipoCompro,this.jmenuBarDetalleTipoCompro,this.jTtoolBarTipoCompro,this.jTtoolBarDetalleTipoCompro);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCompro=this.jTabbedPaneBusquedasTipoCompro; 
		
		final JPanel jPanelParametrosReportesTipoCompro=this.jPanelParametrosReportesTipoCompro;
		//final JScrollPane jScrollPanelDatosTipoCompro=this.jScrollPanelDatosTipoCompro;
		final JTable jTableDatosTipoCompro=this.jTableDatosTipoCompro;		
		final JPanel jPanelPaginacionTipoCompro=this.jPanelPaginacionTipoCompro;
		//final JScrollPane jScrollPanelDatosEdicionTipoCompro=this.jScrollPanelDatosEdicionTipoCompro;
		final JPanel jPanelAccionesTipoCompro=this.jPanelAccionesTipoCompro;
		
		JPanel jPanelCamposAuxiliarTipoCompro=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCompro=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) {
			jPanelCamposAuxiliarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jPanelCamposTipoCompro;
			jPanelAccionesFormularioAuxiliarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jPanelAccionesFormularioTipoCompro;
		}
		
		final JPanel jPanelCamposTipoCompro=jPanelCamposAuxiliarTipoCompro;
		final JPanel jPanelAccionesFormularioTipoCompro=jPanelAccionesFormularioAuxiliarTipoCompro;
		
		
		final JMenuBar jmenuBarTipoCompro=this.jmenuBarTipoCompro;		
		final JToolBar jTtoolBarTipoCompro=this.jTtoolBarTipoCompro;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCompro=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCompro=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) {
			jmenuBarDetalleAuxiliarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jmenuBarDetalleTipoCompro;
			jTtoolBarDetalleAuxiliarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jTtoolBarDetalleTipoCompro;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCompro=jmenuBarDetalleAuxiliarTipoCompro;
		final JToolBar jTtoolBarDetalleTipoCompro=jTtoolBarDetalleAuxiliarTipoCompro;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCompro;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCompro;
			processRunnable.jTableDatos=jTableDatosTipoCompro;
			processRunnable.jPanelCampos=jPanelCamposTipoCompro;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCompro;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCompro;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCompro;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCompro;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCompro;
			processRunnable.jTtoolBar=jTtoolBarTipoCompro;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCompro;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCompro ,jPanelParametrosReportesTipoCompro, jTableDatosTipoCompro,/*jScrollPanelDatosTipoCompro,*/jPanelCamposTipoCompro,jPanelPaginacionTipoCompro, /*jScrollPanelDatosEdicionTipoCompro,*/ jPanelAccionesTipoCompro,jPanelAccionesFormularioTipoCompro,jmenuBarTipoCompro,jmenuBarDetalleTipoCompro,jTtoolBarTipoCompro,jTtoolBarDetalleTipoCompro));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCompro(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCompro(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCompro(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCompro(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCompro,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCompro,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCompro(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCompro,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCompro,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocomproConstantesFunciones.getsFinalQueryTipoCompro();
		String  finalQueryPaginacionTodos=this.tipocomproConstantesFunciones.getsFinalQueryTipoCompro();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoComproConstantesFunciones.getArrayColumnasGlobalesNoTipoCompro(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoComproConstantesFunciones.getArrayColumnasGlobalesTipoCompro(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoComproConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocomprosEliminados= new ArrayList<TipoCompro>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCompro();
		
				///*TipoComproSessionBean*/this.tipocomproSessionBean=new TipoComproSessionBean();
			
			if(this.tipocomproSessionBean==null) {
				this.tipocomproSessionBean=new TipoComproSessionBean();
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
					this.iNumeroPaginacion=TipoComproConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoComproConstantesFunciones.getClassesForeignKeysOfTipoCompro(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocompro."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocomprosAux= new ArrayList<TipoCompro>();
			
				
			tipocomproLogic.setDatosCliente(this.datosCliente);
			tipocomproLogic.setDatosDeep(this.datosDeep);
			tipocomproLogic.setIsConDeep(true);
			
			
			tipocomproLogic.getTipoComproDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocomproLogic.getTodosTipoCompros(finalQueryGlobal,pagination);
					
					//tipocomproLogic.getTodosTipoComprosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocomproLogic.getTipoCompros()==null|| tipocomproLogic.getTipoCompros().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocomprosAux= new ArrayList<TipoCompro>();
							tipocomprosAux.addAll(tipocomproLogic.getTipoCompros());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomprosAux= new ArrayList<TipoCompro>();
							tipocomprosAux.addAll(tipocompros);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocomproLogic.getTodosTipoCompros(finalQueryGlobal+"",this.pagination);												
							
							//tipocomproLogic.getTodosTipoComprosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCompros("Todos",tipocomproLogic.getTipoCompros() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocomproLogic.setTipoCompros(new ArrayList<TipoCompro>());					
							tipocomproLogic.getTipoCompros().addAll(tipocomprosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocompros=new ArrayList<TipoCompro>();
							tipocompros.addAll(tipocomprosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCompro=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCompro=this.idActual;
				
				} else if(this.idTipoComproActual!=null && this.idTipoComproActual!=0L) {
					idTipoCompro=idTipoComproActual;
				}
				
					
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndicePorId(idTipoCompro);
				
				this.tipocompros=new ArrayList<TipoCompro>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocomproLogic.getEntity(idTipoCompro);
					
					//tipocomproLogic.getEntityWithConnection(idTipoCompro);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomproLogic.setTipoCompros(new ArrayList<TipoCompro>());
					tipocomproLogic.getTipoCompros().add(tipocomproLogic.getTipoCompro());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocompros=new ArrayList<TipoCompro>();
					this.tipocompros.add(tipocompro);
				}
				
				if(tipocomproLogic.getTipoCompro()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocomproLogic.getTipoComprosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocomproLogic.getTipoCompros()==null||tipocomproLogic.getTipoCompros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocompros==null|| tipocompros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomprosAux=new ArrayList<TipoCompro>();
						tipocomprosAux.addAll(tipocomproLogic.getTipoCompros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomprosAux=new ArrayList<TipoCompro>();
							tipocomprosAux.addAll(tipocompros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocomproLogic.getTipoComprosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCompros("BusquedaPorCodigo",tipocomproLogic.getTipoCompros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCompros("BusquedaPorCodigo",tipocompros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomproLogic.setTipoCompros(new ArrayList<TipoCompro>());
						tipocomproLogic.getTipoCompros().addAll(tipocomprosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocompros=new ArrayList<TipoCompro>();
							tipocompros.addAll(tipocomprosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocomproLogic.getTipoComprosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocomproLogic.getTipoCompros()==null||tipocomproLogic.getTipoCompros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocompros==null|| tipocompros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomprosAux=new ArrayList<TipoCompro>();
						tipocomprosAux.addAll(tipocomproLogic.getTipoCompros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomprosAux=new ArrayList<TipoCompro>();
							tipocomprosAux.addAll(tipocompros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocomproLogic.getTipoComprosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCompros("BusquedaPorNombre",tipocomproLogic.getTipoCompros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCompros("BusquedaPorNombre",tipocompros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomproLogic.setTipoCompros(new ArrayList<TipoCompro>());
						tipocomproLogic.getTipoCompros().addAll(tipocomprosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocompros=new ArrayList<TipoCompro>();
							tipocompros.addAll(tipocomprosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocomproLogic.getTipoComprosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocomproLogic.getTipoCompros()==null||tipocomproLogic.getTipoCompros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocompros==null|| tipocompros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomprosAux=new ArrayList<TipoCompro>();
						tipocomprosAux.addAll(tipocomproLogic.getTipoCompros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomprosAux=new ArrayList<TipoCompro>();
							tipocomprosAux.addAll(tipocompros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocomproLogic.getTipoComprosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoComproConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCompros("FK_IdEmpresa",tipocomproLogic.getTipoCompros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCompros("FK_IdEmpresa",tipocompros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomproLogic.setTipoCompros(new ArrayList<TipoCompro>());
						tipocomproLogic.getTipoCompros().addAll(tipocomprosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocompros=new ArrayList<TipoCompro>();
							tipocompros.addAll(tipocomprosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCompro();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCompro();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocomproLogic.getTipoCompros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocompros.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocomproLogic.getTipoCompros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocompros.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCompro tipocompro) {
		Boolean permite=true;
		
		if(this.tipocompro.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoComproConstantesFunciones.getOrderByListaTipoCompro();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoComproConstantesFunciones.getOrderByListaTipoCompro();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCompro tipocompro:tipocomproLogic.getTipoCompros()) {
				if(tipocompro.getsType().equals(Constantes2.S_TOTALES)) {
					tipocomproTotales=tipocompro;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCompro tipocompro:this.tipocompros) {
				if(tipocompro.getsType().equals(Constantes2.S_TOTALES)) {
					tipocomproTotales=tipocompro;
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
			this.tipocomproAux=new TipoCompro();
			this.tipocomproAux.setsType(Constantes2.S_TOTALES);
			this.tipocomproAux.setIsNew(false);
			this.tipocomproAux.setIsChanged(false);
			this.tipocomproAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoComproConstantesFunciones.TotalizarValoresFilaTipoCompro(this.tipocomproLogic.getTipoCompros(),this.tipocomproAux);
				
				this.tipocomproLogic.getTipoCompros().add(this.tipocomproAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoComproConstantesFunciones.TotalizarValoresFilaTipoCompro(this.tipocompros,this.tipocomproAux);
				
				this.tipocompros.add(this.tipocomproAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocomproTotales=new TipoCompro();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocomproLogic.getTipoCompros().remove(tipocomproTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocompros.remove(tipocomproTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocomproTotales=new TipoCompro();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCompro tipocompro:tipocomproLogic.getTipoCompros()) {
				if(tipocompro.getsType().equals(Constantes2.S_TOTALES)) {
					tipocomproTotales=tipocompro;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoComproConstantesFunciones.TotalizarValoresFilaTipoCompro(this.tipocomproLogic.getTipoCompros(),tipocomproTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCompro tipocompro:this.tipocompros) {
				if(tipocompro.getsType().equals(Constantes2.S_TOTALES)) {
					tipocomproTotales=tipocompro;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoComproConstantesFunciones.TotalizarValoresFilaTipoCompro(this.tipocompros,tipocomproTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoComprosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoComprosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoComprosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoComprosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomproLogic.getTipoComprosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoComprosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomproLogic.getTipoComprosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoComprosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomproLogic.getTipoComprosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoCompro() {
		this.isPermisoTodoTipoCompro=false;
		this.isPermisoNuevoTipoCompro=false;
		this.isPermisoActualizarTipoCompro=false;
		this.isPermisoActualizarOriginalTipoCompro=false;
		this.isPermisoEliminarTipoCompro=false;
		this.isPermisoGuardarCambiosTipoCompro=false;
		this.isPermisoConsultaTipoCompro=false;
		this.isPermisoBusquedaTipoCompro=false;
		this.isPermisoReporteTipoCompro=false;		
		this.isPermisoOrdenTipoCompro=false;		
		this.isPermisoPaginacionMedioTipoCompro=false;		
		this.isPermisoPaginacionAltoTipoCompro=false;
		this.isPermisoPaginacionTodoTipoCompro=false;
		this.isPermisoCopiarTipoCompro=false;		
		this.isPermisoVerFormTipoCompro=false;		
		this.isPermisoDuplicarTipoCompro=false;		
		this.isPermisoOrdenTipoCompro=false;		
	}
	
	public void setPermisosUsuarioTipoCompro(Boolean isPermiso) {
		this.isPermisoTodoTipoCompro=isPermiso;
		this.isPermisoNuevoTipoCompro=isPermiso;
		this.isPermisoActualizarTipoCompro=isPermiso;
		this.isPermisoActualizarOriginalTipoCompro=isPermiso;
		this.isPermisoEliminarTipoCompro=isPermiso;
		this.isPermisoGuardarCambiosTipoCompro=isPermiso;
		this.isPermisoConsultaTipoCompro=isPermiso;
		this.isPermisoBusquedaTipoCompro=isPermiso;
		this.isPermisoReporteTipoCompro=isPermiso;
		this.isPermisoOrdenTipoCompro=isPermiso;		
		this.isPermisoPaginacionMedioTipoCompro=isPermiso;		
		this.isPermisoPaginacionAltoTipoCompro=isPermiso;		
		this.isPermisoPaginacionTodoTipoCompro=isPermiso;		
		this.isPermisoCopiarTipoCompro=isPermiso;		
		this.isPermisoVerFormTipoCompro=isPermiso;		
		this.isPermisoDuplicarTipoCompro=isPermiso;
		this.isPermisoOrdenTipoCompro=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCompro(Boolean isPermiso) {
		//this.isPermisoTodoTipoCompro=isPermiso;
		this.isPermisoNuevoTipoCompro=isPermiso;
		this.isPermisoActualizarTipoCompro=isPermiso;
		this.isPermisoActualizarOriginalTipoCompro=isPermiso;
		this.isPermisoEliminarTipoCompro=isPermiso;
		this.isPermisoGuardarCambiosTipoCompro=isPermiso;
		//this.isPermisoConsultaTipoCompro=isPermiso;
		//this.isPermisoBusquedaTipoCompro=isPermiso;
		//this.isPermisoReporteTipoCompro=isPermiso;
		//this.isPermisoOrdenTipoCompro=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCompro=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCompro=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCompro=isPermiso;		
		//this.isPermisoCopiarTipoCompro=isPermiso;		
		//this.isPermisoDuplicarTipoCompro=isPermiso;
		//this.isPermisoOrdenTipoCompro=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoComproClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoComproJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCompro(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoComproClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoComproClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoComproClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoComproClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoCompro() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoComproJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocomproSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoComproConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCompro=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCompro=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCompro=this.isPermisoActualizarTipoCompro;
			this.isPermisoEliminarTipoCompro=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCompro=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCompro=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCompro=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCompro=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCompro=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCompro=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCompro=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCompro=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCompro=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCompro=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCompro=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCompro=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCompro=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocomproSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCompro.setToolTipText(this.jTableDatosTipoCompro.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCompro(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCompro(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoComproJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoComproJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCompro() throws Exception {
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
	public void inicializarCombosForeignKeyTipoComproListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoComproListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoComproJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoComproListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoComproListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoComproParameterReturnGeneral tipocomproReturnGeneral=new TipoComproParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipocomproConstantesFunciones.cargarid_empresaTipoCompro)
					 || (this.esRecargarFks && this.tipocomproConstantesFunciones.cargarid_empresaTipoCompro)) {

					if(!this.tipocomproSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipocomproSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocomproReturnGeneral=tipocomproLogic.cargarCombosLoteForeignKeyTipoCompro(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipocomproReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCompro()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipocomproSessionBean==null) {
				this.tipocomproSessionBean=new TipoComproSessionBean();
			}

			if(!this.tipocomproSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoCompro()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCompro(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCompro()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCompro();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCompro(TipoCompro tipocompro)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCompro(TipoCompro tipocompro,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCompro()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCompro()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCompro()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCompro()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCompro()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCompro()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCompro(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCompro()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro!=null && this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoComproBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoComproBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoComproBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocomproSessionBean=new TipoComproSessionBean(); 
		this.tipocomproConstantesFunciones=new TipoComproConstantesFunciones(); 
		this.tipocomproBean=new TipoCompro();//(this.tipocomproConstantesFunciones); 		
		this.tipocomproReturnGeneral=new TipoComproParameterReturnGeneral(); 
		
		this.tipocomproSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocomproSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoComproBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoComproBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoComproBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCompro(true);
			
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
			
			this.tipocomproConstantesFunciones=new TipoComproConstantesFunciones(); 
			this.tipocomproBean=new TipoCompro();//this.tipocomproConstantesFunciones); 			
			this.tipocomproReturnGeneral=new TipoComproParameterReturnGeneral(); 
		
			TipoComproBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Compro Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocompro=new TipoCompro();
			this.tipocompros = new ArrayList<TipoCompro>();
			this.tipocomprosAux = new ArrayList<TipoCompro>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic=new TipoComproLogic();
				this.tipocomproLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocomproSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocomproSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCompro);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCompro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCompro);	
					}
					
					if(this.jInternalFrameImportacionTipoCompro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCompro);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCompro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCompro);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCompro!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCompro);
				this.jInternalFrameDetalleFormTipoCompro.setVisible(false);
				this.jInternalFrameDetalleFormTipoCompro.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCompro!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCompro);
					this.jInternalFrameReporteDinamicoTipoCompro.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCompro.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCompro!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCompro);
					this.jInternalFrameImportacionTipoCompro.setVisible(false);
					this.jInternalFrameImportacionTipoCompro.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCompro!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCompro);
					this.jInternalFrameOrderByTipoCompro.setVisible(false);
					this.jInternalFrameOrderByTipoCompro.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoComproActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoComproConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocomproReturnGeneral=new TipoComproParameterReturnGeneral();
			
			this.tipocomproParameterGeneral=new TipoComproParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocomproLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoComproJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocomproSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoComproConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocomproSessionBean.getEsGuardarRelacionado(),this.tipocomproSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoComproConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocomproSessionBean.getEsGuardarRelacionado(),this.tipocomproSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCompro=false;
			this.isVisibilidadCeldaDuplicarTipoCompro=true;
			this.isVisibilidadCeldaCopiarTipoCompro=true;
			this.isVisibilidadCeldaVerFormTipoCompro=true;
			this.isVisibilidadCeldaOrdenTipoCompro=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompro=false;
			this.isVisibilidadCeldaModificarTipoCompro=false;
			this.isVisibilidadCeldaActualizarTipoCompro=false;
			this.isVisibilidadCeldaEliminarTipoCompro=false;
			this.isVisibilidadCeldaCancelarTipoCompro=false;
			this.isVisibilidadCeldaGuardarTipoCompro=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCompro=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCompro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCompro();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCompro(false);
			
			this.setPermisosUsuarioTipoCompro();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocomproSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocomproSessionBean.getEsGuardarRelacionado() && this.tipocomproSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoComproClasesRelacionadas();
			}
			
			if(this.tipocomproSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoComproClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoComproJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCompro();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCompro();
			}
			
			if(!this.isPermisoBusquedaTipoCompro) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoCompro.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCompro,this.isPermisoPaginacionMedioTipoCompro,this.isPermisoPaginacionTodoTipoCompro);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoComproConstantesFunciones.getTiposSeleccionarTipoCompro());
				
				this.tiposColumnasSelect=TipoComproConstantesFunciones.getTiposSeleccionarTipoCompro(true);
				
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
			//if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCompro();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoCompro(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoCompro(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCompro() ;
			
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
				tipocomproImplementable= (TipoComproImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoComproConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocomproImplementableHome= (TipoComproImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoComproConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocompros= new ArrayList<TipoCompro>();
			this.tipocomprosEliminados= new ArrayList<TipoCompro>();
						
			this.isEsNuevoTipoCompro=false;
			this.esParaAccionDesdeFormularioTipoCompro=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCompro(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCompro();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoComproBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoComproConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCompro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCompro(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCompro!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCompro();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCompro();
			}
			
			TipoComproBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoCompro.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoCompro.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoCompro.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCompro(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCompro: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCompro() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCompro")) {
				iIndex=this.jInternalFrameDetalleFormTipoCompro.jTabbedPaneRelacionesTipoCompro.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCompro.jTabbedPaneRelacionesTipoCompro.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCompro();	
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
	
	public void cargarCombosForeignKeyTipoCompro(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCompro(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCompro(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoComproListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCompro();
		
		this.cargarCombosFrameForeignKeyTipoCompro();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCompro();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCompro();
		}
	}
	
	
	
	public void jButtonNuevoTipoComproActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocomproSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCompro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			
			
			if(jTableDatosTipoCompro.getRowCount()>=1) {
				jTableDatosTipoCompro.removeRowSelectionInterval(0, jTableDatosTipoCompro.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCompro=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCompro(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCompro(true);			
			//this.tipocompro=new TipoCompro();
			//this.tipocompro.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCompro(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCompro() ;
			
			if(TipoComproJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCompro(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocompro);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);				
			
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			
			if(this.tipocomproSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCompro: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoComproActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCompro> tipocomprosSeleccionados=new ArrayList<TipoCompro>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCompro.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCompro.getSelectedRows().length;			
			}
			
			tipocomprosSeleccionados=this.getTipoComprosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCompro--;			
				//TipoCompro tipocomproAux= new TipoCompro();			
				//tipocomproAux.setId(this.iIdNuevoTipoCompro);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCompro tipocomproOrigen=new TipoCompro();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCompro tipocomproOrigen : tipocomprosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocomproOrigen =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomproOrigen =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCompro();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocompro.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCompro(tipocomproOrigen,this.tipocompro,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocomproLogic.getTipoCompros().add(this.tipocomproAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocompros.add(this.tipocomproAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCompro(false);
				
				this.jTableDatosTipoCompro.setRowSelectionInterval(this.getIndiceNuevoTipoCompro(), this.getIndiceNuevoTipoCompro());
				
				int iLastRow =  this.jTableDatosTipoCompro.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCompro.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCompro.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCompro(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoComproActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCompro> tipocomprosSeleccionados=new ArrayList<TipoCompro>();									
		
			TipoCompro tipocomproOrigen=new TipoCompro();
			TipoCompro tipocomproDestino=new TipoCompro();
				
			tipocomprosSeleccionados=this.getTipoComprosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCompro.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocomprosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCompro.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomproOrigen =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocomproOrigen =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomproDestino =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocomproDestino =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocomproOrigen =tipocomprosSeleccionados.get(0);
				tipocomproDestino =tipocomprosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCompro(tipocomproOrigen,tipocomproDestino,true,false);
				
				tipocomproDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocomproDestino,tipocomproLogic.getTipoCompros());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocomproDestino,tipocompros);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCompro(false);
				
				//this.jTableDatosTipoCompro.setRowSelectionInterval(this.getIndiceNuevoTipoCompro(), this.getIndiceNuevoTipoCompro());
				
				int iLastRow =  this.jTableDatosTipoCompro.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCompro.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCompro.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCompro(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoComproActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCompro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCompro.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoComproActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCompro.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoCompro.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoCompro.setVisible(!isVisible);
			this.jPanelPaginacionTipoCompro.setVisible(!isVisible);
			this.jPanelAccionesTipoCompro.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoComproActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCompro();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoComproActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCompro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoComproActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCompro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoComproActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCompro();
			
			this.abrirFrameOrderByTipoCompro();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoComproActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCompro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCompro(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCompro);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCompro.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCompro.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCompro.setSize(this.jInternalFrameDetalleFormTipoCompro.iWidthFormulario,this.jInternalFrameDetalleFormTipoCompro.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCompro.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCompro.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCompro.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCompro.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCompro.jContentPaneDetalleTipoCompro.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCompro.jTabbedPaneRelacionesTipoCompro.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCompro.jContentPaneDetalleTipoCompro.getWidth(),TipoComproConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCompro.jTabbedPaneRelacionesTipoCompro.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCompro.jContentPaneDetalleTipoCompro.getWidth(),TipoComproConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCompro.jTabbedPaneRelacionesTipoCompro.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCompro.jContentPaneDetalleTipoCompro.getWidth(),TipoComproConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCompro.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCompro.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCompro() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCompro==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCompro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCompro,false,this);
				} else {
					this.jInternalFrameOrderByTipoCompro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCompro,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCompro);
				this.jInternalFrameOrderByTipoCompro.setVisible(false);
				this.jInternalFrameOrderByTipoCompro.setSelected(false);
				
				this.jInternalFrameOrderByTipoCompro.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCompro"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCompro();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCompro() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCompro==null) {
				
				this.jInternalFrameImportacionTipoCompro=new ImportacionJInternalFrame(TipoComproConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCompro);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCompro);
				this.jInternalFrameImportacionTipoCompro.setVisible(false);
				this.jInternalFrameImportacionTipoCompro.setSelected(false);


				this.jInternalFrameImportacionTipoCompro.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCompro"));
				this.jInternalFrameImportacionTipoCompro.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCompro"));
				this.jInternalFrameImportacionTipoCompro.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCompro"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCompro() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCompro==null) {
				this.jInternalFrameReporteDinamicoTipoCompro=new ReporteDinamicoJInternalFrame(TipoComproConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCompro);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCompro);
				this.jInternalFrameReporteDinamicoTipoCompro.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCompro.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCompro.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCompro"));
				this.jInternalFrameReporteDinamicoTipoCompro.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCompro"));
				this.jInternalFrameReporteDinamicoTipoCompro.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCompro"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCompro();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoCompro() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCompro);
			
	       	this.jInternalFrameDetalleFormTipoCompro.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCompro.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCompro.dispose();
			//this.jInternalFrameDetalleFormTipoCompro=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCompro() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCompro.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCompro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCompro() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCompro.setVisible(true);
	        this.jInternalFrameImportacionTipoCompro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCompro() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCompro.setVisible(true);
	        this.jInternalFrameOrderByTipoCompro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCompro() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCompro.setVisible(false);
	        this.jInternalFrameOrderByTipoCompro.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCompro() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCompro.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCompro.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCompro() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCompro.setVisible(false);
	        this.jInternalFrameImportacionTipoCompro.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoComproActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCompro(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCompro(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCompro(true);
			//this.isEsNuevoTipoCompro=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCompro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCompro(false) ;
			
			if(tipocomproSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoComproJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCompro(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCompro(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoComproActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCompro(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCompro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCompro(true);
			//this.isEsNuevoTipoCompro=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocompro.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCompro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCompro(false) ;
			
			if(TipoComproJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCompro(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCompro(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoComproActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCompro(false);
			
			//if(!this.isEsNuevoTipoCompro) {								
				int intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoComproJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCompro(this.tipocompro,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);
				
			}
			
			if(this.permiteMantenimiento(this.tipocompro)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocomproSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCompro=true;
					this.inicializarActualizarBindingTablaTipoCompro(false);
					this.isEsNuevoTipoCompro=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCompro=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCompro=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCompro(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCompro(false);
				
				this.habilitarDeshabilitarControlesTipoCompro(false);
			
												
				
				if(TipoComproJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCompro();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoComproActionPerformed(evt,tipocomproSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCompro(this.tipocompro,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCompro.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocomproSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocompro.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCompro.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompro.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoComproActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				this.tipocompro.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				this.tipocompro.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocompro)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocomproSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoComproModel) this.jTableDatosTipoCompro.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCompro=true;
				this.inicializarActualizarBindingTablaTipoCompro(false);
				this.isEsNuevoTipoCompro=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCompro(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCompro(false);
				
				this.habilitarDeshabilitarControlesTipoCompro(false);
				
				
				
				if(TipoComproJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCompro();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoComproActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCompro.getRowCount()>=1) {
				jTableDatosTipoCompro.removeRowSelectionInterval(0, jTableDatosTipoCompro.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCompro(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCompro(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCompro(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCompro(false) ;
			
			this.isEsNuevoTipoCompro=false;
			
			if(TipoComproJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCompro();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoComproActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCompro(false);
				
				//SI ES MANUAL
				if(TipoComproJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCompro();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoComproActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCompro--;			
			//TipoCompro tipocomproAux= new TipoCompro();			
			//tipocomproAux.setId(this.iIdNuevoTipoCompro);
			
			if(this.jInternalFrameDetalleFormTipoCompro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCompro();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);
			
			this.tipocompro.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocomproLogic.getTipoCompros().add(this.tipocomproAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocompros.add(this.tipocomproAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCompro(false);
			
			this.jTableDatosTipoCompro.setRowSelectionInterval(this.getIndiceNuevoTipoCompro(), this.getIndiceNuevoTipoCompro());
			
			int iLastRow =  this.jTableDatosTipoCompro.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCompro.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCompro.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCompro(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoComproActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCompro(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCompro(false);
			
			//SI ES MANUAL
			if(TipoComproJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCompro();
			}
			
			//this.abrirFrameTreeTipoCompro();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoComproActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ComproS ?", "MANTENIMIENTO DE Tipo Compro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCompro.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCompro();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocomproReturnGeneral=tipocomproLogic.procesarImportacionTipoComprosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocomproParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoComproReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoComproActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCompro.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCompro.setFileImportacion(this.jInternalFrameImportacionTipoCompro.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCompro.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCompro.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCompro.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCompro.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoComproActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCompro> tipocomprosSeleccionados=new ArrayList<TipoCompro>();		

		tipocomprosSeleccionados=this.getTipoComprosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCompro.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCompro.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoComproBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoComproBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCompros("Todos",tipocomprosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomproSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compro",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCompro.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCompro.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoComproConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoComproConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoComproConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoCompro.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCompro.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCompro.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoComproConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoComproConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoComproConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCompro.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoComproConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoComproConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoComproConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCompro.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCompro.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoComproConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoComproConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoComproConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoComproActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCompro> tipocomprosSeleccionados=new ArrayList<TipoCompro>();		
		
		tipocomprosSeleccionados=this.getTipoComprosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocompro";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCompros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCompro.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCompro.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoComproConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoComproConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoCompro tipocompro:tipocomprosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocompro.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoComproConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoComproConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCompro tipocompro:tipocomprosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocompro.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoComproConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoComproConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCompro tipocompro:tipocomprosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocompro.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCompro(row);				
			//	iRow++;
			//}				
			
			//for(TipoCompro tipocomproAux:tipocomprosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCompro(tipocomproAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomproSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compro",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocomproLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCompro(false);
			
			//SI ES MANUAL
			if(TipoComproJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCompro();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoComproActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCompro(false);
			
			//SI ES MANUAL
			if(TipoComproJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCompro();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoComproActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCompro(false);
			
			//SI ES MANUAL
			if(TipoComproJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCompro();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCompro() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCompro.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCompro.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCompro.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCompro.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCompro.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCompro.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCompro.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCompro(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCompro(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCompro(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCompro(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCompro(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCompro(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCompro(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCompro(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoComproJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoComproJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCompro() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCompro();
		
		this.inicializarActualizarBindingBotonesManualTipoCompro(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCompro();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCompro() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCompro(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCompro(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCompro.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCompro.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCompro.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCompro!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCompro.jCheckBoxPostAccionNuevoTipoCompro.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCompro.jCheckBoxPostAccionSinCerrarTipoCompro.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCompro.jCheckBoxPostAccionSinMensajeTipoCompro.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCompro.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCompro.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCompro.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCompro!=null) {
				this.jInternalFrameDetalleFormTipoCompro.jCheckBoxPostAccionNuevoTipoCompro.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCompro.jCheckBoxPostAccionSinCerrarTipoCompro.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCompro.jCheckBoxPostAccionSinMensajeTipoCompro.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCompro.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCompro.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCompro!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCompro.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCompro!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCompro.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCompro.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCompro.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCompro.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCompro.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCompro!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCompro.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCompro.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCompro.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCompro(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoComproJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCompro(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCompro() throws Exception {
		try	{
			if(TipoComproJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCompro();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCompro() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCompro() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCompro.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCompro.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCompro.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCompro.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCompro.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCompro.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCompro.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCompro.addItem(reporte);
			}
			
			
			if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCompro.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCompro.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCompro.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCompro.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCompro.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCompro.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCompro.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCompro.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCompro.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCompro();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCompro() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCompro!=null) {
				this.jInternalFrameReporteDinamicoTipoCompro.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCompro.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCompro!=null) {
				this.jInternalFrameReporteDinamicoTipoCompro.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCompro.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCompro!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCompro.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCompro.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCompro.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCompro.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCompro.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCompro.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCompro()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoCompro.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoCompro.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCompro(Boolean esInicializar) throws Exception {				
		if(TipoComproJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCompro();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCompro() throws Exception {
		this.inicializarActualizarBindingTablaTipoCompro(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCompro() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCompro.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCompro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCompro.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoComproPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCompro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCompro.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoComproPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoComproOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoComproOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoComproPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCompro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCompro.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoComproPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCompro.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCompro(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocomproLogic.getTipoCompros().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocompros.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoComproJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCompro.setModel(new TipoComproModel(this.tipocomproLogic.getTipoCompros(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCompro.setModel(new TipoComproModel(this.tipocompros,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCompro!=null && this.jInternalFrameOrderByTipoCompro.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCompro();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCompro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCompro,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoComproPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoComproConstantesFunciones.SCLASSWEBTITULO,tipocomproConstantesFunciones.resaltarSeleccionarTipoCompro,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoComproConstantesFunciones.SCLASSWEBTITULO,tipocomproConstantesFunciones.resaltarSeleccionarTipoCompro,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCompro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCompro,TipoComproConstantesFunciones.LABEL_ID));

		if(this.tipocomproConstantesFunciones.mostraridTipoCompro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoComproConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocomproConstantesFunciones.resaltaridTipoCompro,this.tipocomproConstantesFunciones.activaridTipoCompro,this,true,"idTipoCompro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocomproConstantesFunciones.resaltaridTipoCompro,this.tipocomproConstantesFunciones.activaridTipoCompro,this,true,"idTipoCompro","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCompro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCompro,TipoComproConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipocomproConstantesFunciones.mostrarid_empresaTipoCompro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoComproConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipocomproConstantesFunciones.resaltarid_empresaTipoCompro,this,this.tipocomproConstantesFunciones.activarid_empresaTipoCompro));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipocomproConstantesFunciones.resaltarid_empresaTipoCompro,this,this.tipocomproConstantesFunciones.activarid_empresaTipoCompro,false,"id_empresaTipoCompro","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoComproPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCompro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCompro,TipoComproConstantesFunciones.LABEL_CODIGO));

		if(this.tipocomproConstantesFunciones.mostrarcodigoTipoCompro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoComproConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocomproConstantesFunciones.resaltarcodigoTipoCompro,this.tipocomproConstantesFunciones.activarcodigoTipoCompro,this,true,"codigoTipoCompro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocomproConstantesFunciones.resaltarcodigoTipoCompro,this.tipocomproConstantesFunciones.activarcodigoTipoCompro,this,true,"codigoTipoCompro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoComproPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCompro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCompro,TipoComproConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocomproConstantesFunciones.mostrarnombreTipoCompro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoComproConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocomproConstantesFunciones.resaltarnombreTipoCompro,this.tipocomproConstantesFunciones.activarnombreTipoCompro,this,true,"nombreTipoCompro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocomproConstantesFunciones.resaltarnombreTipoCompro,this.tipocomproConstantesFunciones.activarnombreTipoCompro,this,true,"nombreTipoCompro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TipoComproPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocomproSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocomproSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocomproSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCompro.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocomproSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocomproSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCompro.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCompro && this.isPermisoGuardarCambiosTipoCompro) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocomproSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocomproSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCompro.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCompro.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCompro && this.isPermisoGuardarCambiosTipoCompro) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCompro && this.isPermisoGuardarCambiosTipoCompro) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCompro.moveColumn(this.jTableDatosTipoCompro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCompro.moveColumn(this.jTableDatosTipoCompro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCompro.moveColumn(this.jTableDatosTipoCompro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCompro.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCompro.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCompro,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoComproJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCompro.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCompro.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoComproJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoComproJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCompro.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCompro.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCompro.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocomproLogic.getTipoCompros().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocompros.size()-1;
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
		//this.jTableDatosTipoCompro.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCompro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCompro();
			
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
				
				//this.isEsNuevoTipoCompro=false;
					
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			
				if(this.tipocomproSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCompro==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCompro.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCompro.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocompro.getsType().equals("DUPLICADO")
				   || this.tipocompro.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCompro=true;
				
				} else {
					this.isEsNuevoTipoCompro=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocompro.getId()>=0 && !this.tipocompro.getIsNew()) {						
						this.isEsNuevoTipoCompro=false;
						
					} else {
						this.isEsNuevoTipoCompro=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCompro(esRelaciones);						
				
				this.seleccionarTipoCompro(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocompro.getId()<0) {
					this.isEsNuevoTipoCompro=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCompro(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCompro(evt,rowIndex);
				}	
				
				if(this.tipocomproSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCompro: " + this.dDif); 
					}
				}								
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCompro(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocompro)) {
					if(this.tipocompro.getId()>0) {
						this.tipocompro.setIsDeleted(true);
						
						this.tipocomprosEliminados.add(this.tipocompro);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocomproLogic.getTipoCompros().remove(this.tipocompro);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocompros.remove(this.tipocompro);				
					}
					
					
					((TipoComproModel) this.jTableDatosTipoCompro.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCompro(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCompro(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCompro) {
			
			if(this.jInternalFrameDetalleFormTipoCompro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCompro.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCompro.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoComproJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCompro(this.tipocompro);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipocomproConstantesFunciones.cargarid_empresaTipoCompro || this.tipocomproConstantesFunciones.event_dependid_empresaTipoCompro) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipocompro.getid_empresa());
									//this.inicializarActualizarBindingTipoCompro(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipocompro.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipocompro.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipocompro.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCompro("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCompro(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCompro() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCompro(TipoCompro tipocompro) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCompro(tipocompro,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCompro(TipoCompro tipocompro,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCompro(tipocompro);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCompro(tipocompro,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCompro(tipocompro);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCompro(TipoCompro tipocompro) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCompro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCompro.jLabelidTipoCompro.setText(tipocompro.getId().toString());
			this.jInternalFrameDetalleFormTipoCompro.jTextFieldcodigoTipoCompro.setText(tipocompro.getcodigo());
			this.jInternalFrameDetalleFormTipoCompro.jTextAreanombreTipoCompro.setText(tipocompro.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCompro tipocomproLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocomproLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCompro tipocomproLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocomproLocal=this.tipocompro;
			} else {
				tipocomproLocal=this.tipocomproAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocomproLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCompro(tipocomproLocal,true);
					
					if(tipocomproSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocomproLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocomproSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocomproLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCompro(TipoCompro tipocompro,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCompro(tipocompro,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(tipocompro);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCompro(TipoCompro tipocompro,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCompro(tipocompro,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCompro(TipoCompro tipocompro,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCompro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCompro.jLabelidTipoCompro.getText()==null || this.jInternalFrameDetalleFormTipoCompro.jLabelidTipoCompro.getText()=="" || this.jInternalFrameDetalleFormTipoCompro.jLabelidTipoCompro.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCompro.jLabelidTipoCompro.setText("0");
			}

			if(conColumnasBase) {tipocompro.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCompro.jLabelidTipoCompro.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoComproConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCompro.jLabelIdTipoCompro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocompro.setcodigo(this.jInternalFrameDetalleFormTipoCompro.jTextFieldcodigoTipoCompro.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoComproConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCompro.jLabelcodigoTipoCompro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocompro.setnombre(this.jInternalFrameDetalleFormTipoCompro.jTextAreanombreTipoCompro.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoComproConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCompro.jLabelnombreTipoCompro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCompro(TipoCompro tipocomproBean,TipoCompro tipocompro,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCompro(TipoCompro tipocomproOrigen,TipoCompro tipocompro,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocomproOrigen.getId()!=null && !tipocomproOrigen.getId().equals(0L))) {tipocompro.setId(tipocomproOrigen.getId());}}
			if(conDefault || (!conDefault && tipocomproOrigen.getcodigo()!=null && !tipocomproOrigen.getcodigo().equals(""))) {tipocompro.setcodigo(tipocomproOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocomproOrigen.getnombre()!=null && !tipocomproOrigen.getnombre().equals(""))) {tipocompro.setnombre(tipocomproOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCompro(TipoCompro tipocompro) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCompro.jLabelidTipoCompro.setText(tipocompro.getId().toString());
			this.jInternalFrameDetalleFormTipoCompro.jTextFieldcodigoTipoCompro.setText(tipocompro.getcodigo());
			this.jInternalFrameDetalleFormTipoCompro.jTextAreanombreTipoCompro.setText(tipocompro.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCompro(TipoComproBean tipocomproBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCompro.jLabelidTipoCompro.setText(tipocomproBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCompro.jTextFieldcodigoTipoCompro.setText(tipocomproBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCompro.jTextAreanombreTipoCompro.setText(tipocomproBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCompro(TipoComproParameterReturnGeneral tipocomproReturnGeneral,TipoComproBean tipocomproBean,Boolean conDefault) throws Exception { 
		try {
			TipoCompro tipocomproLocal=new TipoCompro();
			
			tipocomproLocal=tipocomproReturnGeneral.getTipoCompro();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocomproLocal.getId()!=null && !tipocomproLocal.getId().equals(0L))) {tipocomproBean.setId(tipocomproLocal.getId());}}
			if(conDefault || (!conDefault && tipocomproLocal.getcodigo()!=null && !tipocomproLocal.getcodigo().equals(""))) {tipocomproBean.setcodigo(tipocomproLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocomproLocal.getnombre()!=null && !tipocomproLocal.getnombre().equals(""))) {tipocomproBean.setnombre(tipocomproLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoComproGenerico(Long idTipoComproSeleccionado,JComboBox jComboBoxTipoCompro,List<TipoCompro> tipocomprosLocal)throws Exception {
		try {
			TipoCompro  tipocomproTemp=null;

			for(TipoCompro tipocomproAux:tipocomprosLocal) {
				if(tipocomproAux.getId()!=null && tipocomproAux.getId().equals(idTipoComproSeleccionado)) {
					tipocomproTemp=tipocomproAux;
					break;
				}
			}

			jComboBoxTipoCompro.setSelectedItem(tipocomproTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoComproGenerico(JComboBox jComboBoxTipoCompro,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCompro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCompro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCompro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCompro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCompro.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCompro.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCompro.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCompro.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCompro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCompro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocompro=(TipoCompro) tipocomproLogic.getTipoCompros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocompro =(TipoCompro) tipocompros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipocompro.getIsNew() && !tipocompro.getIsChanged() && !tipocompro.getIsDeleted()) {
				sDescripcion=tipocompro.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipocompro.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCompro tipocomproRow=new TipoCompro();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocomproRow=(TipoCompro) tipocomproLogic.getTipoCompros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocomproRow=(TipoCompro) tipocompros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCompro(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCompro.setVisible((this.isVisibilidadCeldaNuevoTipoCompro && this.isPermisoNuevoTipoCompro));			
			this.jButtonDuplicarTipoCompro.setVisible((this.isVisibilidadCeldaDuplicarTipoCompro && this.isPermisoDuplicarTipoCompro));			
			this.jButtonCopiarTipoCompro.setVisible((this.isVisibilidadCeldaCopiarTipoCompro && this.isPermisoCopiarTipoCompro));
			this.jButtonVerFormTipoCompro.setVisible((this.isVisibilidadCeldaVerFormTipoCompro && this.isPermisoVerFormTipoCompro));
			
			this.jButtonAbrirOrderByTipoCompro.setVisible((this.isVisibilidadCeldaOrdenTipoCompro && this.isPermisoOrdenTipoCompro));			
			
			this.jButtonNuevoRelacionesTipoCompro.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCompro && this.isPermisoNuevoTipoCompro));			
			this.jButtonNuevoGuardarCambiosTipoCompro.setVisible((this.isVisibilidadCeldaNuevoTipoCompro && this.isPermisoNuevoTipoCompro && this.isPermisoGuardarCambiosTipoCompro));
			
			if(this.jInternalFrameDetalleFormTipoCompro!=null) {
			this.jInternalFrameDetalleFormTipoCompro.jButtonModificarTipoCompro.setVisible((this.isVisibilidadCeldaModificarTipoCompro && this.isPermisoActualizarTipoCompro));	
			this.jInternalFrameDetalleFormTipoCompro.jButtonActualizarTipoCompro.setVisible((this.isVisibilidadCeldaActualizarTipoCompro && this.isPermisoActualizarTipoCompro));	
			this.jInternalFrameDetalleFormTipoCompro.jButtonEliminarTipoCompro.setVisible((this.isVisibilidadCeldaEliminarTipoCompro && this.isPermisoEliminarTipoCompro));
			this.jInternalFrameDetalleFormTipoCompro.jButtonCancelarTipoCompro.setVisible(this.isVisibilidadCeldaCancelarTipoCompro);							
			this.jInternalFrameDetalleFormTipoCompro.jButtonGuardarCambiosTipoCompro.setVisible((this.isVisibilidadCeldaGuardarTipoCompro && this.isPermisoGuardarCambiosTipoCompro));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCompro.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCompro && this.isPermisoGuardarCambiosTipoCompro));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCompro.setVisible((this.isVisibilidadCeldaNuevoTipoCompro && this.isPermisoNuevoTipoCompro));						
			this.jButtonDuplicarToolBarTipoCompro.setVisible((this.isVisibilidadCeldaDuplicarTipoCompro && this.isPermisoDuplicarTipoCompro));						
			this.jButtonCopiarToolBarTipoCompro.setVisible((this.isVisibilidadCeldaCopiarTipoCompro && this.isPermisoCopiarTipoCompro));			
			this.jButtonVerFormToolBarTipoCompro.setVisible((this.isVisibilidadCeldaVerFormTipoCompro && this.isPermisoVerFormTipoCompro));			
			this.jButtonAbrirOrderByToolBarTipoCompro.setVisible((this.isVisibilidadCeldaOrdenTipoCompro && this.isPermisoOrdenTipoCompro));
			this.jButtonNuevoRelacionesToolBarTipoCompro.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCompro && this.isPermisoNuevoTipoCompro));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCompro.setVisible((this.isVisibilidadCeldaNuevoTipoCompro && this.isPermisoNuevoTipoCompro && this.isPermisoGuardarCambiosTipoCompro));			
			
			if(this.jInternalFrameDetalleFormTipoCompro!=null) {
			this.jInternalFrameDetalleFormTipoCompro.jButtonModificarToolBarTipoCompro.setVisible((this.isVisibilidadCeldaModificarTipoCompro && this.isPermisoActualizarTipoCompro));	
			this.jInternalFrameDetalleFormTipoCompro.jButtonActualizarToolBarTipoCompro.setVisible((this.isVisibilidadCeldaActualizarTipoCompro  && this.isPermisoActualizarTipoCompro));	
			this.jInternalFrameDetalleFormTipoCompro.jButtonEliminarToolBarTipoCompro.setVisible((this.isVisibilidadCeldaEliminarTipoCompro && this.isPermisoEliminarTipoCompro));
			this.jInternalFrameDetalleFormTipoCompro.jButtonCancelarToolBarTipoCompro.setVisible(this.isVisibilidadCeldaCancelarTipoCompro);				
			this.jInternalFrameDetalleFormTipoCompro.jButtonGuardarCambiosToolBarTipoCompro.setVisible((this.isVisibilidadCeldaGuardarTipoCompro && this.isPermisoGuardarCambiosTipoCompro));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCompro.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCompro && this.isPermisoGuardarCambiosTipoCompro));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCompro.setVisible((this.isVisibilidadCeldaNuevoTipoCompro && this.isPermisoNuevoTipoCompro));			
			this.jMenuItemDuplicarTipoCompro.setVisible((this.isVisibilidadCeldaDuplicarTipoCompro && this.isPermisoDuplicarTipoCompro));			
			this.jMenuItemCopiarTipoCompro.setVisible((this.isVisibilidadCeldaCopiarTipoCompro && this.isPermisoCopiarTipoCompro));			
			this.jMenuItemVerFormTipoCompro.setVisible((this.isVisibilidadCeldaVerFormTipoCompro && this.isPermisoVerFormTipoCompro));			
			this.jMenuItemAbrirOrderByTipoCompro.setVisible((this.isVisibilidadCeldaOrdenTipoCompro && this.isPermisoOrdenTipoCompro));			
			//this.jMenuItemMostrarOcultarTipoCompro.setVisible((this.isVisibilidadCeldaOrdenTipoCompro && this.isPermisoOrdenTipoCompro));
			this.jMenuItemDetalleAbrirOrderByTipoCompro.setVisible((this.isVisibilidadCeldaOrdenTipoCompro && this.isPermisoOrdenTipoCompro));			
			//this.jMenuItemDetalleMostrarOcultarTipoCompro.setVisible((this.isVisibilidadCeldaOrdenTipoCompro && this.isPermisoOrdenTipoCompro));			
			this.jMenuItemNuevoRelacionesTipoCompro.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCompro && this.isPermisoNuevoTipoCompro));			
			this.jMenuItemNuevoGuardarCambiosTipoCompro.setVisible((this.isVisibilidadCeldaNuevoTipoCompro && this.isPermisoNuevoTipoCompro && this.isPermisoGuardarCambiosTipoCompro));									
			
			if(this.jInternalFrameDetalleFormTipoCompro!=null) {
			this.jInternalFrameDetalleFormTipoCompro.jMenuItemModificarTipoCompro.setVisible((this.isVisibilidadCeldaModificarTipoCompro && this.isPermisoActualizarTipoCompro));	
			this.jInternalFrameDetalleFormTipoCompro.jMenuItemActualizarTipoCompro.setVisible((this.isVisibilidadCeldaActualizarTipoCompro && this.isPermisoActualizarTipoCompro));	
			this.jInternalFrameDetalleFormTipoCompro.jMenuItemEliminarTipoCompro.setVisible((this.isVisibilidadCeldaEliminarTipoCompro && this.isPermisoEliminarTipoCompro));
			this.jInternalFrameDetalleFormTipoCompro.jMenuItemCancelarTipoCompro.setVisible(this.isVisibilidadCeldaCancelarTipoCompro);				
			}
			
			this.jMenuItemGuardarCambiosTipoCompro.setVisible((this.isVisibilidadCeldaGuardarTipoCompro && this.isPermisoGuardarCambiosTipoCompro));						
			this.jMenuItemGuardarCambiosTablaTipoCompro.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCompro && this.isPermisoGuardarCambiosTipoCompro));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCompro=this.jButtonNuevoTipoCompro.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCompro=this.jButtonDuplicarTipoCompro.isVisible();
			this.isVisibilidadCeldaCopiarTipoCompro=this.jButtonCopiarTipoCompro.isVisible();
			this.isVisibilidadCeldaVerFormTipoCompro=this.jButtonVerFormTipoCompro.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCompro=this.jButtonAbrirOrderByTipoCompro.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCompro=this.jButtonNuevoRelacionesTipoCompro.isVisible();
			this.isVisibilidadCeldaModificarTipoCompro=this.jButtonModificarTipoCompro.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCompro!=null) {
			this.isVisibilidadCeldaActualizarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jButtonActualizarTipoCompro.isVisible();
			this.isVisibilidadCeldaEliminarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jButtonEliminarTipoCompro.isVisible();
			this.isVisibilidadCeldaCancelarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jButtonCancelarTipoCompro.isVisible();
			this.isVisibilidadCeldaGuardarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jButtonGuardarCambiosTipoCompro.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCompro=this.jButtonGuardarCambiosTablaTipoCompro.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCompro=this.jButtonNuevoToolBarTipoCompro.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCompro=this.jButtonNuevoRelacionesToolBarTipoCompro.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCompro!=null) {
			this.isVisibilidadCeldaModificarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jButtonModificarToolBarTipoCompro.isVisible();
			this.isVisibilidadCeldaActualizarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jButtonActualizarToolBarTipoCompro.isVisible();
			this.isVisibilidadCeldaEliminarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jButtonEliminarToolBarTipoCompro.isVisible();
			this.isVisibilidadCeldaCancelarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jButtonCancelarToolBarTipoCompro.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCompro=this.jButtonGuardarCambiosToolBarTipoCompro.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCompro=this.jButtonGuardarCambiosTablaToolBarTipoCompro.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCompro=this.jMenuItemNuevoTipoCompro.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCompro=this.jMenuItemNuevoRelacionesTipoCompro.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCompro!=null) {
			this.isVisibilidadCeldaModificarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jMenuItemModificarTipoCompro.isVisible();
			this.isVisibilidadCeldaActualizarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jMenuItemActualizarTipoCompro.isVisible();
			this.isVisibilidadCeldaEliminarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jMenuItemEliminarTipoCompro.isVisible();
			this.isVisibilidadCeldaCancelarTipoCompro=this.jInternalFrameDetalleFormTipoCompro.jMenuItemCancelarTipoCompro.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCompro=this.jMenuItemGuardarCambiosTipoCompro.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCompro=this.jMenuItemGuardarCambiosTablaTipoCompro.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCompro(Boolean esInicializar) {
		if(TipoComproJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocomproSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocomproSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCompro();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCompro(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCompro() {
		this.jButtonNuevoTipoCompro.setVisible(this.isPermisoNuevoTipoCompro);			
		this.jButtonDuplicarTipoCompro.setVisible(this.isPermisoDuplicarTipoCompro);			
		this.jButtonCopiarTipoCompro.setVisible(this.isPermisoCopiarTipoCompro);			
		this.jButtonVerFormTipoCompro.setVisible(this.isPermisoVerFormTipoCompro);			
		
		this.jButtonAbrirOrderByTipoCompro.setVisible(this.isPermisoOrdenTipoCompro);					
		
		this.jButtonNuevoRelacionesTipoCompro.setVisible(this.isPermisoNuevoTipoCompro);			
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompro.jButtonModificarTipoCompro.setVisible(this.isPermisoActualizarTipoCompro);	
			this.jInternalFrameDetalleFormTipoCompro.jButtonActualizarTipoCompro.setVisible(this.isPermisoActualizarTipoCompro);	
			this.jInternalFrameDetalleFormTipoCompro.jButtonEliminarTipoCompro.setVisible(this.isPermisoEliminarTipoCompro);
			this.jInternalFrameDetalleFormTipoCompro.jButtonCancelarTipoCompro.setVisible(this.isVisibilidadCeldaCancelarTipoCompro);						
			this.jInternalFrameDetalleFormTipoCompro.jButtonGuardarCambiosTipoCompro.setVisible(this.isPermisoGuardarCambiosTipoCompro);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCompro.setVisible(this.isPermisoActualizarTipoCompro);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCompro() {
		this.jInternalFrameDetalleFormTipoCompro.jButtonModificarTipoCompro.setVisible(this.isPermisoActualizarTipoCompro);	
		this.jInternalFrameDetalleFormTipoCompro.jButtonActualizarTipoCompro.setVisible(this.isPermisoActualizarTipoCompro);	
		this.jInternalFrameDetalleFormTipoCompro.jButtonEliminarTipoCompro.setVisible(this.isPermisoEliminarTipoCompro);
		this.jInternalFrameDetalleFormTipoCompro.jButtonCancelarTipoCompro.setVisible(this.isVisibilidadCeldaCancelarTipoCompro);							
		this.jInternalFrameDetalleFormTipoCompro.jButtonGuardarCambiosTipoCompro.setVisible((this.isVisibilidadCeldaGuardarTipoCompro && this.isPermisoGuardarCambiosTipoCompro));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCompro() {
		if(TipoComproJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCompro();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCompro() {
	}
	
	public void jTableDatosTipoComproListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCompro(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoComproBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCompro(this.gettipocompro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocompro==null) {
						this.tipocompro = new TipoCompro();
					}

					this.setVariablesFormularioToObjetoActualTipoCompro(this.tipocompro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);
				}

				if(this.tipocompro.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocompro.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCompro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoComproUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoCompro(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoCompro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoCompro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoCompro(this.gettipocompro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipocomproLogic.getConnexion());

				if(this.tipocompro.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipocompro.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoCompro=(TitledBorder)this.jScrollPanelDatosTipoCompro.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoCompro.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoComproBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCompro(this.gettipocompro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocompro==null) {
						this.tipocompro = new TipoCompro();
					}

					this.setVariablesFormularioToObjetoActualTipoCompro(this.tipocompro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);
				}

				if(this.tipocompro.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipocompro.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCompro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoComproBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCompro(this.gettipocompro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocompro==null) {
						this.tipocompro = new TipoCompro();
					}

					this.setVariablesFormularioToObjetoActualTipoCompro(this.tipocompro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);
				}

				if(this.tipocompro.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocompro.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCompro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoComproBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCompro(this.gettipocompro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocompro==null) {
						this.tipocompro = new TipoCompro();
					}

					this.setVariablesFormularioToObjetoActualTipoCompro(this.tipocompro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);
				}

				if(this.tipocompro.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocompro.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCompro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoComproActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCompro(false,false);

			this.getTipoComprosBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoCompro(false);

			//if(TipoComproBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCompro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoComproActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCompro(false,false);

			this.getTipoComprosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoCompro(false);

			//if(TipoComproBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCompro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoComproActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCompro(false,false);

			this.getTipoComprosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoCompro(false);

			//if(TipoComproBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCompro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomproLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoCompro() {
		if(this.jInternalFrameDetalleFormTipoCompro!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) {
			this.jInternalFrameDetalleFormTipoCompro.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCompro.dispose();
			this.jInternalFrameDetalleFormTipoCompro=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCompro!=null) {
			this.jInternalFrameReporteDinamicoTipoCompro.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCompro.dispose();
			this.jInternalFrameReporteDinamicoTipoCompro=null;
		}
		
		if(this.jInternalFrameImportacionTipoCompro!=null) {
			this.jInternalFrameImportacionTipoCompro.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCompro.dispose();
			this.jInternalFrameImportacionTipoCompro=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCompro();
			
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCompro")) {
				jButtonNuevoTipoComproActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCompro")) {
				jButtonDuplicarTipoComproActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCompro")) {
				jButtonCopiarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCompro")) {
				jButtonVerFormTipoComproActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCompro")) {
				jButtonNuevoTipoComproActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCompro")) {
				jButtonDuplicarTipoComproActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCompro")) {
				jButtonNuevoTipoComproActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCompro")) {
				jButtonDuplicarTipoComproActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCompro")) {
				jButtonNuevoTipoComproActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCompro")) {
				jButtonNuevoTipoComproActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCompro")) {
				jButtonNuevoTipoComproActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCompro")) {
				jButtonModificarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCompro")) {
				jButtonModificarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCompro")) {
				jButtonModificarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCompro")) {
				jButtonActualizarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCompro")) {
				jButtonActualizarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCompro")) {
				jButtonActualizarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCompro")) {
				jButtonEliminarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCompro")) {
				jButtonEliminarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCompro")) {
				jButtonEliminarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCompro")) {
				jButtonCancelarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCompro")) {
				jButtonCancelarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCompro")) {
				jButtonCancelarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCompro")) {
				jButtonCerrarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCompro")) {
				jButtonCerrarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCompro")) {
				jButtonCerrarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCompro")) {
				jButtonMostrarOcultarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCompro")) {
				jButtonCancelarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCompro")) {
				jButtonGuardarCambiosTipoComproActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCompro")) {
				jButtonGuardarCambiosTipoComproActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCompro")) {
				jButtonCopiarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCompro")) {
				jButtonVerFormTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCompro")) {
				jButtonGuardarCambiosTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCompro")) {
				jButtonCopiarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCompro")) {
				jButtonVerFormTipoComproActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCompro")) {
				jButtonGuardarCambiosTipoComproActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCompro")) {
				jButtonGuardarCambiosTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCompro")) {
				jButtonGuardarCambiosTipoComproActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCompro")) {
				jButtonRecargarInformacionTipoComproActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCompro")) {
				jButtonRecargarInformacionTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCompro")) {
				jButtonRecargarInformacionTipoComproActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCompro")) {
				jButtonAnterioresTipoComproActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCompro")) {
				jButtonAnterioresTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCompro")) {
				jButtonAnterioresTipoComproActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCompro")) {
				jButtonSiguientesTipoComproActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCompro")) {
				jButtonSiguientesTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCompro")) {
				jButtonSiguientesTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCompro") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCompro")) {
				jButtonAbrirOrderByTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCompro") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCompro")) {
				jButtonMostrarOcultarTipoComproActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCompro")) {
				jButtonNuevoGuardarCambiosTipoComproActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCompro")) {
				jButtonNuevoGuardarCambiosTipoComproActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCompro")) {
				jButtonNuevoGuardarCambiosTipoComproActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCompro")) {
				jButtonCerrarReporteDinamicoTipoComproActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCompro")) {
				jButtonGenerarReporteDinamicoTipoComproActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCompro")) {
				
				jButtonGenerarExcelReporteDinamicoTipoComproActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCompro")) {
				jButtonCerrarImportacionTipoComproActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCompro")) {
				
				jButtonGenerarImportacionTipoComproActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCompro")) {
				
				jButtonAbrirImportacionTipoComproActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCompro")) {
				jComboBoxTiposAccionesTipoComproActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCompro")) {
				jComboBoxTiposRelacionesTipoComproActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCompro")) {
				jComboBoxTiposAccionesTipoComproActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCompro")) {
				
				jComboBoxTiposSeleccionarTipoComproActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCompro")) {
				jTextFieldValorCampoGeneralTipoComproActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCompro")) {
				jButtonAbrirOrderByTipoComproActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCompro")) {
				jButtonAbrirOrderByTipoComproActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCompro")) {
				jButtonCerrarOrderByTipoComproActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoComproBusqueda")) {
				this.jButtonidTipoComproBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoComproUpdate")) {
				this.jButtonid_empresaTipoComproUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoComproBusqueda")) {
				this.jButtonid_empresaTipoComproBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoComproBusqueda")) {
				this.jButtoncodigoTipoComproBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoComproBusqueda")) {
				this.jButtonnombreTipoComproBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoCompro")) {
				this.jButtonBusquedaPorCodigoTipoComproActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoCompro")) {
				this.jButtonBusquedaPorNombreTipoComproActionPerformed(evt);
			}
			
			;
			
			
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCompro();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComproActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
				


				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCompro tipocomproLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocomproLocal=this.tipocompro;
			} else {
				tipocomproLocal=this.tipocomproAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
							
				
				


				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComproActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproAnterior =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomproAnterior =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
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
			
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			
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
			
			


			
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComproActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
								
						
				


				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompro.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
								
				
				


				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComproActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproAnterior =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomproAnterior =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComproActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproAnterior =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomproAnterior =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComproActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
							
				
				


				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompro.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComproActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomproAnterior =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocomproAnterior =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
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
			
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			
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
			
			


			
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComproActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
								
				
				


				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComproActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproAnterior =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomproAnterior =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComproActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComproActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCompro")) {
					jCheckBoxSeleccionarTodosTipoComproItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCompro")) {
					jCheckBoxSeleccionadosTipoComproItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCompro")) {
					
				}
				
				


				
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
												
				
				


				
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComproActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomproAnterior =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocomproAnterior =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComproActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
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
			
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
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
			
			


			
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComproActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompro.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompro.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompro);
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
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
				
				


				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompro.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComproActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomproAnterior =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomproAnterior =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCompro")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoComproListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCompro.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocompro =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocompro =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocompro);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCompro")) {
				
				}
				
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCompro")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCompro.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCompro")) {
			
			}
			
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCompro();
			
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCompro")) {
				jButtonNuevoTipoComproActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCompro")) {
				jButtonDuplicarTipoComproActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCompro")) {
				jButtonCopiarTipoComproActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCompro")) {
				jButtonVerFormTipoComproActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCompro")) {
				jButtonNuevoTipoComproActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCompro")) {
				jButtonModificarTipoComproActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCompro")) {
				jButtonActualizarTipoComproActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCompro")) {
				jButtonEliminarTipoComproActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCompro")) {
				jButtonGuardarCambiosTipoComproActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCompro")) {
				jButtonCancelarTipoComproActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCompro")) {
				jButtonCerrarTipoComproActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCompro")) {
				jButtonGuardarCambiosTipoComproActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCompro")) {
				jButtonNuevoGuardarCambiosTipoComproActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCompro")) {
				jButtonAbrirOrderByTipoComproActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCompro")) {
				jButtonRecargarInformacionTipoComproActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCompro")) {
				jButtonAnterioresTipoComproActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCompro")) {
				jButtonSiguientesTipoComproActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoComproBusqueda")) {
				this.jButtonidTipoComproBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoComproUpdate")) {
				this.jButtonid_empresaTipoComproUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoComproBusqueda")) {
				this.jButtonid_empresaTipoComproBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoComproBusqueda")) {
				this.jButtoncodigoTipoComproBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoComproBusqueda")) {
				this.jButtonnombreTipoComproBusquedaActionPerformed(evt);
			}
			
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCompro();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCompro")) {
				closingInternalFrameTipoCompro();
				
			} else if(sTipo.equals("jButtonCancelarTipoCompro")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCompro = (JInternalFrameBase)evt.getSource();
	            	
	            TipoComproBeanSwingJInternalFrame jInternalFrameParent=(TipoComproBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCompro.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoComproActionPerformed(null);
			}
			
			TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocompro,new Object(),this.tipocomproParameterGeneral,this.tipocomproReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCompro(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCompro(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCompro(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocompro)) {
			if(!esControlTabla) {
				if(TipoComproJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCompro(this.tipocompro,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);			
				}
				
				if(this.tipocomproSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCompro(this.tipocompro,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocomproReturnGeneral=tipocomproLogic.procesarEventosTipoComprosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocomproLogic.getTipoCompros(),this.tipocompro,this.tipocomproParameterGeneral,this.isEsNuevoTipoCompro,classes);//this.tipocomproLogic.getTipoCompro()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCompro(this.tipocomproReturnGeneral,this.tipocomproBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocomproSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCompro(classes,this.tipocomproReturnGeneral,this.tipocomproBean,false);
					}
						
					if(this.tipocomproReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCompro(this.tipocomproReturnGeneral.getTipoCompro());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCompro(this.tipocomproReturnGeneral.getTipoCompro());	
					}
						
					if(this.tipocomproReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCompro(this.tipocomproReturnGeneral.getTipoCompro(),classes);//this.tipocomproBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCompro(this.tipocompro,classes);//this.tipocomproBean);									
				}
			
				if(TipoComproJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCompro(this.tipocompro,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompro(this.tipocompro);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocomproAnterior!=null) {
						this.tipocompro=this.tipocomproAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocomproReturnGeneral=tipocomproLogic.procesarEventosTipoComprosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocomproLogic.getTipoCompros(),this.tipocompro,this.tipocomproParameterGeneral,this.isEsNuevoTipoCompro,classes);//this.tipocomproLogic.getTipoCompro()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocomproSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocomproSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocomproReturnGeneral.getTipoCompro(),tipocomproLogic.getTipoCompros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocomproReturnGeneral.getTipoCompro(),this.tipocompros);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCompro.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCompro.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCompro();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCompro() throws Exception {
		
		TipoComproModel tipocomproModel=(TipoComproModel)this.jTableDatosTipoCompro.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocomproModel.tipocompros=this.tipocomproLogic.getTipoCompros();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocomproModel.tipocompros=this.tipocompros;
		}
		
		
		((TipoComproModel) this.jTableDatosTipoCompro.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCompro() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocomproAnterior(),this.tipocomproLogic.getTipoCompros());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocomproAnterior(),this.tipocompros);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCompro();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCompro(TipoCompro tipocompro,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
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
										
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocompro,new Object(),generalEntityParameterGeneral,this.tipocomproReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocomproSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoComproConstantesFunciones.getClassesRelationshipsOfTipoCompro(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoComproConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCompro(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCompro(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoComproBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocompro,new Object(),generalEntityParameterGeneral,this.tipocomproReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCompro(TipoComproBean tipocomproBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCompro(ArrayList<Classe> classes,TipoComproReturnGeneral tipocomproReturnGeneral,TipoComproBean tipocomproBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCompro(TipoCompro tipocompro,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipocompro)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCompro = new TipoComproDetalleFormJInternalFrame(jDesktopPane,this.tipocomproSessionBean.getConGuardarRelaciones(),this.tipocomproSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCompro);
		this.jInternalFrameDetalleFormTipoCompro.setVisible(false);
		this.jInternalFrameDetalleFormTipoCompro.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCompro.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCompro.tipocomproLogic=this.tipocomproLogic;
		
		this.cargarCombosFrameForeignKeyTipoCompro("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCompro();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCompro();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCompro("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCompro();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCompro.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCompro"));
		
		this.jInternalFrameDetalleFormTipoCompro.jButtonModificarTipoCompro.addActionListener(new ButtonActionListener(this,"ModificarTipoCompro"));

		
		this.jInternalFrameDetalleFormTipoCompro.jButtonModificarToolBarTipoCompro.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCompro"));
					
		this.jInternalFrameDetalleFormTipoCompro.jMenuItemModificarTipoCompro.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCompro"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCompro.jButtonActualizarTipoCompro.addActionListener (new ButtonActionListener(this,"ActualizarTipoCompro"));
		
		
		this.jInternalFrameDetalleFormTipoCompro.jButtonActualizarToolBarTipoCompro.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCompro"));
						
		this.jInternalFrameDetalleFormTipoCompro.jMenuItemActualizarTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCompro"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCompro.jButtonEliminarTipoCompro.addActionListener (new ButtonActionListener(this,"EliminarTipoCompro"));
		
		
		this.jInternalFrameDetalleFormTipoCompro.jButtonEliminarToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCompro"));
								
		this.jInternalFrameDetalleFormTipoCompro.jMenuItemEliminarTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCompro"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCompro.jButtonCancelarTipoCompro.addActionListener (new ButtonActionListener(this,"CancelarTipoCompro"));
		
		
		this.jInternalFrameDetalleFormTipoCompro.jButtonCancelarToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCompro"));
					
		this.jInternalFrameDetalleFormTipoCompro.jMenuItemCancelarTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCompro"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCompro.jMenuItemDetalleCerrarTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCompro"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCompro.jButtonGuardarCambiosToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCompro"));
		
		
		
		this.jInternalFrameDetalleFormTipoCompro.jButtonGuardarCambiosToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCompro"));
		
		
		
		this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCompro"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompro.jButtonidTipoComproBusqueda.addActionListener(new ButtonActionListener(this,"idTipoComproBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCompro.jButtonid_empresaTipoComproUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoComproUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompro.jButtonid_empresaTipoComproBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoComproBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompro.jButtoncodigoTipoComproBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoComproBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompro.jButtonnombreTipoComproBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoComproBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCompro.jTabbedPaneRelacionesTipoCompro.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCompro"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCompro"));
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompro.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCompro"));
		}
		
		this.jTableDatosTipoCompro.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCompro"));
		
		this.jTableDatosTipoCompro.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCompro"));
		
		this.jButtonNuevoTipoCompro.addActionListener(new ButtonActionListener(this,"NuevoTipoCompro"));
		
		this.jButtonDuplicarTipoCompro.addActionListener(new ButtonActionListener(this,"DuplicarTipoCompro"));
		
		this.jButtonCopiarTipoCompro.addActionListener(new ButtonActionListener(this,"CopiarTipoCompro"));
		
		this.jButtonVerFormTipoCompro.addActionListener(new ButtonActionListener(this,"VerFormTipoCompro"));
		
		
		this.jButtonNuevoToolBarTipoCompro.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCompro"));
			
		this.jButtonDuplicarToolBarTipoCompro.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCompro"));
			
		this.jMenuItemNuevoTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCompro"));
			
		this.jMenuItemDuplicarTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCompro"));		
		
		
		this.jButtonNuevoRelacionesTipoCompro.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCompro"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCompro.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCompro"));
			
		this.jMenuItemNuevoRelacionesTipoCompro.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCompro"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompro.jButtonModificarTipoCompro.addActionListener(new ButtonActionListener(this,"ModificarTipoCompro"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompro.jButtonModificarToolBarTipoCompro.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCompro"));
			
			this.jInternalFrameDetalleFormTipoCompro.jMenuItemModificarTipoCompro.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCompro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCompro.jButtonActualizarTipoCompro.addActionListener (new ButtonActionListener(this,"ActualizarTipoCompro"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompro.jButtonActualizarToolBarTipoCompro.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCompro"));
				
			this.jInternalFrameDetalleFormTipoCompro.jMenuItemActualizarTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCompro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompro.jButtonEliminarTipoCompro.addActionListener (new ButtonActionListener(this,"EliminarTipoCompro"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompro.jButtonEliminarToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCompro"));
						
			this.jInternalFrameDetalleFormTipoCompro.jMenuItemEliminarTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCompro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompro.jButtonCancelarTipoCompro.addActionListener (new ButtonActionListener(this,"CancelarTipoCompro"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompro.jButtonCancelarToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCompro"));
			
			this.jInternalFrameDetalleFormTipoCompro.jMenuItemCancelarTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCompro"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCompro"));		
		
		
		this.jButtonCerrarTipoCompro.addActionListener (new ButtonActionListener(this,"CerrarTipoCompro"));
		
		
		this.jButtonCerrarToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCompro"));
			
		this.jMenuItemCerrarTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCompro"));
			
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompro.jMenuItemDetalleCerrarTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCompro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompro.jButtonGuardarCambiosTipoCompro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCompro"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompro.jButtonGuardarCambiosToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCompro"));
		}
		
		this.jButtonCopiarToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCompro"));
			
		this.jButtonVerFormToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCompro"));
		
		this.jMenuItemGuardarCambiosTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCompro"));
			
		this.jMenuItemCopiarTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCompro"));		
		
		this.jMenuItemVerFormTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCompro"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCompro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCompro"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCompro"));
			
		this.jMenuItemGuardarCambiosTablaTipoCompro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCompro"));		
		
		
		
		this.jButtonRecargarInformacionTipoCompro.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCompro"));
					
		this.jButtonRecargarInformacionToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCompro"));
		
		this.jMenuItemRecargarInformacionTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCompro"));		
		
		
		
		this.jButtonAnterioresTipoCompro.addActionListener (new ButtonActionListener(this,"AnterioresTipoCompro"));
		
		
		this.jButtonAnterioresToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCompro"));
		
		this.jMenuItemAnterioresTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCompro"));		
		
		
		this.jButtonSiguientesTipoCompro.addActionListener (new ButtonActionListener(this,"SiguientesTipoCompro"));
		
		
		this.jButtonSiguientesToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCompro"));
			
		this.jMenuItemSiguientesTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCompro"));
			
		this.jMenuItemAbrirOrderByTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCompro"));
			
		this.jMenuItemMostrarOcultarTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCompro"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCompro"));
			
		this.jMenuItemDetalleMostarOcultarTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCompro"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCompro.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCompro"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCompro"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCompro.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCompro"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCompro.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCompro"));

		this.jCheckBoxSeleccionadosTipoCompro.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCompro"));
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCompro"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCompro.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCompro"));
			
		this.jComboBoxTiposAccionesTipoCompro.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCompro"));
					
		this.jComboBoxTiposSeleccionarTipoCompro.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCompro"));
			
		this.jTextFieldValorCampoGeneralTipoCompro.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCompro"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompro.jButtonidTipoComproBusqueda.addActionListener(new ButtonActionListener(this,"idTipoComproBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCompro.jButtonid_empresaTipoComproUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoComproUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompro.jButtonid_empresaTipoComproBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoComproBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompro.jButtoncodigoTipoComproBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoComproBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompro.jButtonnombreTipoComproBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoComproBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoCompro.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoCompro"));

			this.jButtonBusquedaPorNombreTipoCompro.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoCompro"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCompro!=null) {
				this.jInternalFrameReporteDinamicoTipoCompro.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCompro"));
				this.jInternalFrameReporteDinamicoTipoCompro.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCompro"));
				this.jInternalFrameReporteDinamicoTipoCompro.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCompro"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCompro.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCompro"));				
			//this.jButtonGenerarReporteDinamicoTipoCompro.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCompro"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCompro.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCompro"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCompro!=null) {
				this.jInternalFrameImportacionTipoCompro.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCompro"));
				this.jInternalFrameImportacionTipoCompro.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCompro"));
				this.jInternalFrameImportacionTipoCompro.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCompro"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCompro.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCompro"));
			
			this.jButtonAbrirOrderByToolBarTipoCompro.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCompro"));			
			
			if(this.jInternalFrameOrderByTipoCompro!=null) {
				this.jInternalFrameOrderByTipoCompro.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCompro"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCompro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompro.jTabbedPaneRelacionesTipoCompro.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCompro"));
		
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
            		closingInternalFrameTipoCompro();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCompro.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCompro = (JInternalFrameBase)event.getSource();
	            	
	            TipoComproBeanSwingJInternalFrame jInternalFrameParent=(TipoComproBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCompro.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoComproActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCompro.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoComproListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCompro.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCompro.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComproActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComproActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComproActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCompro";
		inputMap = this.jButtonNuevoTipoCompro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCompro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoComproActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComproActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComproActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComproActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCompro";
		inputMap = this.jButtonNuevoRelacionesTipoCompro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCompro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoComproActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCompro";
		inputMap = this.jButtonModificarTipoCompro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCompro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoComproActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCompro";
		inputMap = this.jButtonActualizarTipoCompro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCompro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoComproActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCompro";
		inputMap = this.jButtonEliminarTipoCompro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCompro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoComproActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCompro";
		inputMap = this.jButtonCancelarTipoCompro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCompro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoComproActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCompro";
		inputMap = this.jButtonCerrarTipoCompro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCompro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoComproActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCompro.jButtonGuardarCambiosTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCompro";
		inputMap = this.jInternalFrameDetalleFormTipoCompro.jButtonGuardarCambiosTipoCompro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCompro.jButtonGuardarCambiosTipoCompro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoComproActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCompro.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoComproItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCompro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoComproActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCompro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoComproActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCompro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoComproActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompro.jButtonidTipoComproBusqueda.addActionListener(new ButtonActionListener(this,"idTipoComproBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCompro.jButtonid_empresaTipoComproUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoComproUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompro.jButtonid_empresaTipoComproBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoComproBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompro.jButtoncodigoTipoComproBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoComproBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompro.jButtonnombreTipoComproBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoComproBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoCompro.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoCompro"));

		this.jButtonBusquedaPorNombreTipoCompro.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoCompro"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCompro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoComproActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoComproActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCompro.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCompro(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCompro tipocomproAux:this.tipocomproLogic.getTipoCompros()) {
					tipocomproAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCompro tipocomproAux:tipocompros) {
					tipocomproAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoComproItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCompro(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCompro tipocomproAux:this.tipocomproLogic.getTipoCompros()) {
						tipocomproAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCompro tipocomproAux:tipocompros) {
						tipocomproAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCompro tipocomproAux:this.tipocomproLogic.getTipoCompros()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCompro tipocomproAux:tipocompros) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCompro(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCompro.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCompro.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCompro,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoComproItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCompro(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCompro.getSelectedRows();
			
			TipoCompro tipocomproLocal=new TipoCompro();
			
			//this.seleccionarTodosTipoCompro(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomproLocal =(TipoCompro) this.tipocomproLogic.getTipoCompros().toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocomproLocal =(TipoCompro) this.tipocompros.toArray()[this.jTableDatosTipoCompro.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocomproLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCompro tipocomproAux:this.tipocomproLogic.getTipoCompros()) {
						tipocomproAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCompro tipocomproAux:tipocompros) {
						tipocomproAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCompro(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCompro.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCompro.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCompro,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoComproItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoComproParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoComproActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCompro(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCompro.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCompro tipocomproAux:this.tipocomproLogic.getTipoCompros()) {
				
						if(sTipoSeleccionar.equals(TipoComproConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocomproAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoComproConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocomproAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCompro tipocomproAux:tipocompros) {
					
						if(sTipoSeleccionar.equals(TipoComproConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocomproAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoComproConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocomproAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCompro(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoComproActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCompro(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCompro=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCompro.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCompro) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCompro(conSplash);
				
					this.generarReporteTipoComprosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCompro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoComprosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCompro.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoComprosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCompro.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoComprosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCompro.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCompro();
				
				this.exportarTipoComprosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCompro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCompros();
				//this.importarTipoCompros();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCompro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCompro();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoComprosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCompro.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Compro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCompro();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCompro)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCompro(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Compro",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCompro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoComproBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoCompro) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoCompro(conSplash);
					
						//this.actualizarParametrosGeneralTipoCompro();
						
						this.generarReporteProcesoAccionTipoComprosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoCompro.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoComproBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo ComproS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Compro", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoCompro();
				
						this.actualizarParametrosGeneralTipoCompro();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipocomproReturnGeneral=tipocomproLogic.procesarAccionTipoComprosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipocomproLogic.getTipoCompros(),this.tipocomproParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoComproReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCompro.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCompro();
					
					TipoComproBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoComproReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCompro.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCompro.jComboBoxTiposAccionesFormularioTipoCompro.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCompro(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoComproActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCompro();
			
			if(this.jInternalFrameDetalleFormTipoCompro==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCompro> tipocomprosSeleccionados=new ArrayList<TipoCompro>();		
			TipoCompro tipocompro=new TipoCompro();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCompro(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCompro.getSelectedItem();
			
			
			
			
			tipocomprosSeleccionados=this.getTipoComprosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocomprosSeleccionados.size()==1) {
				for(TipoCompro tipocomproAux:tipocomprosSeleccionados) {
					tipocompro=tipocomproAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCompro();
			
      		//this.finishProcessTipoCompro(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoComproReturnGeneral() throws Exception {
		if(this.tipocomproReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocomproReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocomproReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocomproReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocomproReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocomproReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCompro(false);
		}
		
		if(this.tipocomproReturnGeneral.getConRetornoLista() || this.tipocomproReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocomproReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocomproLogic.setTipoCompros(this.tipocomproReturnGeneral.getTipoCompros());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocomproReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocomproLogic.setTipoCompro(this.tipocomproReturnGeneral.getTipoCompro());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCompro(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCompro() throws Exception {
		
		
	}
	
	public ArrayList<TipoCompro> getTipoComprosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCompro> tipocomprosSeleccionados=new ArrayList<TipoCompro>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCompro) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCompro tipocomproAux:tipocomproLogic.getTipoCompros()) {
					if(tipocomproAux.getIsSelected()) {
						tipocomprosSeleccionados.add(tipocomproAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCompro tipocomproAux:this.tipocompros) {
					if(tipocomproAux.getIsSelected()) {
						tipocomprosSeleccionados.add(tipocomproAux);				
					}
				}
			}
			
			if(tipocomprosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocomprosSeleccionados.addAll(this.tipocomproLogic.getTipoCompros());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocomprosSeleccionados.addAll(this.tipocompros);				
					}
				}
			}
		} else {
			tipocomprosSeleccionados.add(this.tipocompro);
		}
		
		return tipocomprosSeleccionados;
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
	
	public void generarReporteTipoComprosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoComprosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoComprosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoComprosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoComprosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Compro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoComprosSeleccionados() throws Exception {
		ArrayList<TipoCompro> tipocomprosSeleccionados=new ArrayList<TipoCompro>();		
		
		tipocomprosSeleccionados=this.getTipoComprosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCompros("Todos",tipocomprosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoComprosSeleccionados() throws Exception {
		ArrayList<TipoCompro> tipocomprosSeleccionados=new ArrayList<TipoCompro>();		
		
		tipocomprosSeleccionados=this.getTipoComprosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCompros("Todos",tipocomprosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoComprosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCompro> tipocomprosSeleccionados=new ArrayList<TipoCompro>();
		
		tipocomprosSeleccionados=this.getTipoComprosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCompros("Todos",tipocomprosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoComprosSeleccionados() throws Exception {
		ArrayList<TipoCompro> tipocomprosSeleccionados=new ArrayList<TipoCompro>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCompro();
		
		
		tipocomprosSeleccionados=this.getTipoComprosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCompro();
		
		
		//this.generarReporteTipoCompros("Todos",tipocomprosSeleccionados ,tipocomproImplementable,tipocomproImplementableHome);
	}
	
	public void mostrarImportacionTipoCompros() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCompro();
		
		this.abrirFrameImportacionTipoCompro();		
		
			
		//this.generarReporteTipoCompros("Todos",tipocomprosSeleccionados ,tipocomproImplementable,tipocomproImplementableHome);
	}
	
	public void importarTipoCompros() throws Exception {		
	
	}
	
	public void exportarTipoComprosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoComprosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoComprosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoComprosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Compro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoComprosSeleccionados() throws Exception {
		ArrayList<TipoCompro> tipocomprosSeleccionados=new ArrayList<TipoCompro>();		
		
		tipocomprosSeleccionados=this.getTipoComprosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocompro."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCompro(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCompro tipocomproAux:tipocomprosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCompro(tipocomproAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocomproAux.setsDetalleGeneralEntityReporte(tipocomproAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomproSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCompro(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoComproConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoComproConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoComproConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoComproConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoComproConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCompro(TipoCompro tipocompro,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocompro.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocompro.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocompro.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocompro.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocompro.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoComprosSeleccionados() throws Exception {
		ArrayList<TipoCompro> tipocomprosSeleccionados=new ArrayList<TipoCompro>();		
		
		tipocomprosSeleccionados=this.getTipoComprosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocompro.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCompros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCompro(row);				
				iRow++;
			}				
			
			for(TipoCompro tipocomproAux:tipocomprosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCompro(tipocomproAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomproSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoComprosSeleccionados() throws Exception {
		ArrayList<TipoCompro> tipocomprosSeleccionados=new ArrayList<TipoCompro>();		
		
		tipocomprosSeleccionados=this.getTipoComprosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocompro.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocompros");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocompro");
			//elementRoot.appendChild(element);
		
			for(TipoCompro tipocomproAux:tipocomprosSeleccionados) {
				element = document.createElement("tipocompro");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCompro(tipocomproAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomproSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCompro(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoComproConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoComproConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoComproConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoComproConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoComproConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCompro(TipoCompro tipocompro,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocompro.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocompro.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocompro.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocompro.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCompro(TipoCompro tipocompro,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoComproConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocompro.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoComproConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocompro.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoComproConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipocompro.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoComproConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocompro.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoComproConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocompro.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoComprosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCompro> tipocomprosSeleccionados=new ArrayList<TipoCompro>();
		
		tipocomprosSeleccionados=this.getTipoComprosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCompro(tipocomprosSeleccionados);
		
		this.generarReporteTipoCompros("Todos",tipocomprosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCompro(ArrayList<TipoCompro> tipocomprosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCompro tipocomproAux:tipocomprosSeleccionados) {
				tipocomproAux.setsDetalleGeneralEntityReporte(tipocomproAux.toString());
			
				if(sTipoSeleccionar.equals(TipoComproConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipocomproAux.setsDescripcionGeneralEntityReporte1(tipocomproAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoComproConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocomproAux.setsDescripcionGeneralEntityReporte1(tipocomproAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoComproConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocomproAux.setsDescripcionGeneralEntityReporte1(tipocomproAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComproConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCompro(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCompro=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCompro=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCompro=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCompro=false;
			this.isVisibilidadCeldaActualizarTipoCompro=false;
			this.isVisibilidadCeldaEliminarTipoCompro=false;
			this.isVisibilidadCeldaCancelarTipoCompro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCompro=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCompro=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCompro=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompro=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCompro=false;
			this.isVisibilidadCeldaModificarTipoCompro=false;
			this.isVisibilidadCeldaActualizarTipoCompro=true;
			this.isVisibilidadCeldaEliminarTipoCompro=false;
			this.isVisibilidadCeldaCancelarTipoCompro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCompro=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCompro=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCompro=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompro=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCompro=false;
			this.isVisibilidadCeldaModificarTipoCompro=false;
			this.isVisibilidadCeldaActualizarTipoCompro=true;
			this.isVisibilidadCeldaEliminarTipoCompro=true;
			this.isVisibilidadCeldaCancelarTipoCompro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCompro=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCompro=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCompro=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompro=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCompro=false;
			this.isVisibilidadCeldaModificarTipoCompro=false;
			this.isVisibilidadCeldaActualizarTipoCompro=true;
			this.isVisibilidadCeldaEliminarTipoCompro=false;
			this.isVisibilidadCeldaCancelarTipoCompro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCompro=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCompro=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCompro=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompro=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCompro=true;
			this.isVisibilidadCeldaModificarTipoCompro=false;
			this.isVisibilidadCeldaActualizarTipoCompro=false;
			this.isVisibilidadCeldaEliminarTipoCompro=false;
			this.isVisibilidadCeldaCancelarTipoCompro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCompro=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCompro=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCompro=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompro=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCompro=false;
			this.isVisibilidadCeldaActualizarTipoCompro=false;
			this.isVisibilidadCeldaEliminarTipoCompro=false;
			this.isVisibilidadCeldaCancelarTipoCompro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCompro=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCompro=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCompro=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompro=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCompro=false;
			this.isVisibilidadCeldaModificarTipoCompro=true;
			this.isVisibilidadCeldaActualizarTipoCompro=false;
			this.isVisibilidadCeldaEliminarTipoCompro=false;
			this.isVisibilidadCeldaCancelarTipoCompro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCompro=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCompro=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoComproJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCompro=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompro=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCompro=true;
		} else {
			this.actualizarEstadoPanelsTipoCompro(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCompro=false;
			//this.isVisibilidadCeldaVerFormTipoCompro=false;
			this.isVisibilidadCeldaDuplicarTipoCompro=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocomproSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCompro=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCompro=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCompro=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocomproSessionBean.getEsGuardarRelacionado()) {
			if(!tipocomproSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCompro=false;												
			}
			
			this.jButtonCerrarTipoCompro.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCompro=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocompro)) {
			this.isVisibilidadCeldaActualizarTipoCompro=false;
			this.isVisibilidadCeldaEliminarTipoCompro=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCompro() {
	}
	
	public void actualizarEstadoPanelsTipoCompro(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCompro!=null) {
				this.jScrollPanelDatosEdicionTipoCompro.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompro!=null) {
				this.jTabbedPaneBusquedasTipoCompro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCompro!=null) {
				this.jScrollPanelDatosTipoCompro.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCompro!=null) {
				this.jPanelPaginacionTipoCompro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCompro!=null) {
				this.jPanelParametrosReportesTipoCompro.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCompro!=null) {
				this.jScrollPanelDatosEdicionTipoCompro.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompro!=null) {
				this.jTabbedPaneBusquedasTipoCompro.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCompro!=null) {
				this.jScrollPanelDatosTipoCompro.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCompro!=null) {
				this.jPanelPaginacionTipoCompro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCompro!=null) {
				this.jPanelParametrosReportesTipoCompro.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCompro!=null) {
				this.jScrollPanelDatosEdicionTipoCompro.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompro!=null) {
				this.jTabbedPaneBusquedasTipoCompro.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCompro!=null) {
				this.jScrollPanelDatosTipoCompro.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCompro!=null) {
				this.jPanelPaginacionTipoCompro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCompro!=null) {
				this.jPanelParametrosReportesTipoCompro.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCompro!=null) {
				this.jScrollPanelDatosEdicionTipoCompro.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompro!=null) {
				this.jTabbedPaneBusquedasTipoCompro.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCompro!=null) {
				this.jScrollPanelDatosTipoCompro.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCompro!=null) {
				this.jPanelPaginacionTipoCompro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCompro!=null) {
				this.jPanelParametrosReportesTipoCompro.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCompro!=null) {
				this.jScrollPanelDatosEdicionTipoCompro.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompro!=null) {
				this.jTabbedPaneBusquedasTipoCompro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCompro!=null) {
				this.jScrollPanelDatosTipoCompro.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCompro!=null) {
				this.jPanelPaginacionTipoCompro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCompro!=null) {
				this.jPanelParametrosReportesTipoCompro.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCompro!=null) {
				this.jScrollPanelDatosEdicionTipoCompro.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompro!=null) {
				this.jTabbedPaneBusquedasTipoCompro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCompro!=null) {
				this.jScrollPanelDatosTipoCompro.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCompro!=null) {
				this.jPanelPaginacionTipoCompro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCompro!=null) {
				this.jPanelParametrosReportesTipoCompro.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCompro!=null) {
				this.jScrollPanelDatosEdicionTipoCompro.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompro!=null) {
				this.jTabbedPaneBusquedasTipoCompro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCompro!=null) {
				this.jScrollPanelDatosTipoCompro.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCompro!=null) {
				this.jPanelPaginacionTipoCompro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCompro!=null) {
				this.jPanelParametrosReportesTipoCompro.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocomproSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoCompro!=null) {
					this.jTabbedPaneBusquedasTipoCompro.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoCompro!=null) {
				this.jPanelParametrosReportesTipoCompro.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocomproSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompro!=null) {
				this.jTabbedPaneBusquedasTipoCompro.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoCompro!=null) {
				this.jPanelParametrosReportesTipoCompro.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoCompro.remove(jPanelBusquedaPorCodigoTipoCompro);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoCompro.remove(jPanelBusquedaPorNombreTipoCompro);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoComproSessionBean tipocomproSessionBean=new TipoComproSessionBean();
		
		if(this.tipocomproSessionBean==null) {
			this.tipocomproSessionBean=new TipoComproSessionBean();
		}
		
		this.tipocomproSessionBean.setsUltimaBusquedaTipoCompro(this.getsAccionBusqueda());
		this.tipocomproSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocomproSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipocomproSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipocomproSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipocomproSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoComproSessionBean tipocomproSessionBean=new TipoComproSessionBean();
		
		if(this.tipocomproSessionBean==null) {
			this.tipocomproSessionBean=new TipoComproSessionBean();
		}
		
		if(this.tipocomproSessionBean.getsUltimaBusquedaTipoCompro()!=null&&!this.tipocomproSessionBean.getsUltimaBusquedaTipoCompro().equals("")) {
			this.setsAccionBusqueda(tipocomproSessionBean.getsUltimaBusquedaTipoCompro());
			this.setiNumeroPaginacion(tipocomproSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocomproSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipocomproSessionBean.getcodigo());
				tipocomproSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipocomproSessionBean.getnombre());
				tipocomproSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipocomproSessionBean.getid_empresa());
				tipocomproSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipocomproSessionBean.setsUltimaBusquedaTipoCompro("");
		this.tipocomproSessionBean.setiNumeroPaginacion(TipoComproConstantesFunciones.INUMEROPAGINACION);
		this.tipocomproSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCompro(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCompro() {
		this.updateBorderResaltarBusquedasFormularioTipoCompro();
		this.updateVisibilidadBusquedasFormularioTipoCompro();
		this.updateHabilitarBusquedasFormularioTipoCompro();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCompro() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoCompro.getComponents().length>0) {
	

		if(this.tipocomproConstantesFunciones.resaltarBusquedaPorCodigoTipoCompro!=null) {
			index= this.jTabbedPaneBusquedasTipoCompro.indexOfComponent(this.jPanelBusquedaPorCodigoTipoCompro);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCompro.getComponent(index);
				jPanel.setBorder(this.tipocomproConstantesFunciones.resaltarBusquedaPorCodigoTipoCompro);
			}
		}

		if(this.tipocomproConstantesFunciones.resaltarBusquedaPorNombreTipoCompro!=null) {
			index= this.jTabbedPaneBusquedasTipoCompro.indexOfComponent(this.jPanelBusquedaPorNombreTipoCompro);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCompro.getComponent(index);
				jPanel.setBorder(this.tipocomproConstantesFunciones.resaltarBusquedaPorNombreTipoCompro);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCompro() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoCompro.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoCompro.indexOfComponent(this.jPanelBusquedaPorCodigoTipoCompro);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCompro.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocomproConstantesFunciones.mostrarBusquedaPorCodigoTipoCompro);
			if(!this.tipocomproConstantesFunciones.mostrarBusquedaPorCodigoTipoCompro && index>-1) {
				this.jTabbedPaneBusquedasTipoCompro.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoCompro.indexOfComponent(this.jPanelBusquedaPorNombreTipoCompro);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCompro.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocomproConstantesFunciones.mostrarBusquedaPorNombreTipoCompro);
			if(!this.tipocomproConstantesFunciones.mostrarBusquedaPorNombreTipoCompro && index>-1) {
				this.jTabbedPaneBusquedasTipoCompro.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoCompro() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoCompro.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoCompro.indexOfComponent(this.jPanelBusquedaPorCodigoTipoCompro);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCompro.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocomproConstantesFunciones.activarBusquedaPorCodigoTipoCompro);
				this.jTabbedPaneBusquedasTipoCompro.setEnabledAt(index,this.tipocomproConstantesFunciones.activarBusquedaPorCodigoTipoCompro);
			}

			index= this.jTabbedPaneBusquedasTipoCompro.indexOfComponent(this.jPanelBusquedaPorNombreTipoCompro);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCompro.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocomproConstantesFunciones.activarBusquedaPorNombreTipoCompro);
				this.jTabbedPaneBusquedasTipoCompro.setEnabledAt(index,this.tipocomproConstantesFunciones.activarBusquedaPorNombreTipoCompro);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoCompro(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoCompro.indexOfComponent(this.jPanelBusquedaPorCodigoTipoCompro);

			this.jTabbedPaneBusquedasTipoCompro.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCompro.getComponent(index);

			this.tipocomproConstantesFunciones.setResaltarBusquedaPorCodigoTipoCompro(resaltar);

			jPanel.setBorder(this.tipocomproConstantesFunciones.resaltarBusquedaPorCodigoTipoCompro);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoCompro.indexOfComponent(this.jPanelBusquedaPorNombreTipoCompro);

			this.jTabbedPaneBusquedasTipoCompro.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCompro.getComponent(index);

			this.tipocomproConstantesFunciones.setResaltarBusquedaPorNombreTipoCompro(resaltar);

			jPanel.setBorder(this.tipocomproConstantesFunciones.resaltarBusquedaPorNombreTipoCompro);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoCompro.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoCompro() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCompro==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCompro();
		this.updateVisibilidadResaltarControlesFormularioTipoCompro();
		this.updateHabilitarResaltarControlesFormularioTipoCompro();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCompro() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCompro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocomproConstantesFunciones.resaltaridTipoCompro!=null && this.jInternalFrameDetalleFormTipoCompro!=null) {this.jInternalFrameDetalleFormTipoCompro.jLabelidTipoCompro.setBorder(this.tipocomproConstantesFunciones.resaltaridTipoCompro);}
		if(this.tipocomproConstantesFunciones.resaltarid_empresaTipoCompro!=null && this.jInternalFrameDetalleFormTipoCompro!=null) {this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro.setBorder(this.tipocomproConstantesFunciones.resaltarid_empresaTipoCompro);}
		if(this.tipocomproConstantesFunciones.resaltarcodigoTipoCompro!=null && this.jInternalFrameDetalleFormTipoCompro!=null) {this.jInternalFrameDetalleFormTipoCompro.jTextFieldcodigoTipoCompro.setBorder(this.tipocomproConstantesFunciones.resaltarcodigoTipoCompro);}
		if(this.tipocomproConstantesFunciones.resaltarnombreTipoCompro!=null && this.jInternalFrameDetalleFormTipoCompro!=null) {this.jInternalFrameDetalleFormTipoCompro.jTextAreanombreTipoCompro.setBorder(this.tipocomproConstantesFunciones.resaltarnombreTipoCompro);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCompro() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCompro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) {
	
		//this.jInternalFrameDetalleFormTipoCompro.jLabelidTipoCompro.setVisible(this.tipocomproConstantesFunciones.mostraridTipoCompro);
		this.jInternalFrameDetalleFormTipoCompro.jPanelidTipoCompro.setVisible(this.tipocomproConstantesFunciones.mostraridTipoCompro);
		//this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro.setVisible(this.tipocomproConstantesFunciones.mostrarid_empresaTipoCompro);
		this.jInternalFrameDetalleFormTipoCompro.jPanelid_empresaTipoCompro.setVisible(this.tipocomproConstantesFunciones.mostrarid_empresaTipoCompro);
		//this.jInternalFrameDetalleFormTipoCompro.jTextFieldcodigoTipoCompro.setVisible(this.tipocomproConstantesFunciones.mostrarcodigoTipoCompro);
		this.jInternalFrameDetalleFormTipoCompro.jPanelcodigoTipoCompro.setVisible(this.tipocomproConstantesFunciones.mostrarcodigoTipoCompro);
		//this.jInternalFrameDetalleFormTipoCompro.jTextAreanombreTipoCompro.setVisible(this.tipocomproConstantesFunciones.mostrarnombreTipoCompro);
		this.jInternalFrameDetalleFormTipoCompro.jPanelnombreTipoCompro.setVisible(this.tipocomproConstantesFunciones.mostrarnombreTipoCompro);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCompro() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCompro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCompro!=null) {
	
		this.jInternalFrameDetalleFormTipoCompro.jLabelidTipoCompro.setEnabled(this.tipocomproConstantesFunciones.activaridTipoCompro);
		this.jInternalFrameDetalleFormTipoCompro.jComboBoxid_empresaTipoCompro.setEnabled(this.tipocomproConstantesFunciones.activarid_empresaTipoCompro);
		this.jInternalFrameDetalleFormTipoCompro.jTextFieldcodigoTipoCompro.setEnabled(this.tipocomproConstantesFunciones.activarcodigoTipoCompro);
		this.jInternalFrameDetalleFormTipoCompro.jTextAreanombreTipoCompro.setEnabled(this.tipocomproConstantesFunciones.activarnombreTipoCompro);
		}
	}
	
		
}