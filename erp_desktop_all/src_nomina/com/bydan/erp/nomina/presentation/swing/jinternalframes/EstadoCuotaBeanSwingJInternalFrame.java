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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.EstadoCuotaConstantesFunciones;
import com.bydan.erp.nomina.util.EstadoCuotaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EstadoCuotaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EstadoCuotaBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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




@SuppressWarnings("unused")
public class EstadoCuotaBeanSwingJInternalFrame extends EstadoCuotaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoCuotaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoCuota> estadocuotaValidator = new ClassValidator<EstadoCuota>(EstadoCuota.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoCuota estadocuota;	
	public EstadoCuota estadocuotaAux;
	public EstadoCuota estadocuotaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoCuota estadocuotaTotales;
	public Long idEstadoCuotaActual;
	public Long iIdNuevoEstadoCuota=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosCuota=false;

	public Boolean getIsTienePermisosCuota() {
		return isTienePermisosCuota;
	}

	public void setIsTienePermisosCuota(Boolean isTienePermisosCuota) {
		this.isTienePermisosCuota= isTienePermisosCuota;
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
	
	public Boolean isPermisoTodoEstadoCuota;
	public Boolean isPermisoNuevoEstadoCuota;
	public Boolean isPermisoActualizarEstadoCuota;
	public Boolean isPermisoActualizarOriginalEstadoCuota;
	public Boolean isPermisoEliminarEstadoCuota;
	public Boolean isPermisoGuardarCambiosEstadoCuota;
	public Boolean isPermisoConsultaEstadoCuota;
	public Boolean isPermisoBusquedaEstadoCuota;
	public Boolean isPermisoReporteEstadoCuota;
	public Boolean isPermisoPaginacionMedioEstadoCuota;
	public Boolean isPermisoPaginacionAltoEstadoCuota;
	public Boolean isPermisoPaginacionTodoEstadoCuota;
	public Boolean isPermisoCopiarEstadoCuota;
	public Boolean isPermisoVerFormEstadoCuota;
	public Boolean isPermisoDuplicarEstadoCuota;
	public Boolean isPermisoOrdenEstadoCuota;
	
	
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
	
	public EstadoCuotaParameterReturnGeneral estadocuotaReturnGeneral;
	public EstadoCuotaParameterReturnGeneral estadocuotaParameterGeneral;
	
	

	public CuotaLogic cuotaLogic=null;

	public CuotaLogic getCuotaLogic() {
		return cuotaLogic;
	}

	public void setCuotaLogic(CuotaLogic cuotaLogic) {
		this.cuotaLogic = cuotaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoCuota=false;
	public Boolean esParaAccionDesdeFormularioEstadoCuota=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoCuotaSessionBeanAdditional estadocuotaSessionBeanAdditional=null;
	
	public EstadoCuotaSessionBeanAdditional getEstadoCuotaSessionBeanAdditional() {
		return this.estadocuotaSessionBeanAdditional;
	}
	
	public void setEstadoCuotaSessionBeanAdditional(EstadoCuotaSessionBeanAdditional estadocuotaSessionBeanAdditional) {
		try {
			this.estadocuotaSessionBeanAdditional=estadocuotaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoCuotaBeanSwingJInternalFrameAdditional estadocuotaBeanSwingJInternalFrameAdditional=null;
	//public class EstadoCuotaBeanSwingJInternalFrame
	
	public EstadoCuotaBeanSwingJInternalFrameAdditional getEstadoCuotaBeanSwingJInternalFrameAdditional() {
		return this.estadocuotaBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoCuotaBeanSwingJInternalFrameAdditional(EstadoCuotaBeanSwingJInternalFrameAdditional estadocuotaBeanSwingJInternalFrameAdditional) {
		try {
			this.estadocuotaBeanSwingJInternalFrameAdditional=estadocuotaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoCuotaLogic estadocuotaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoCuota estadocuotaBean;
	public EstadoCuotaConstantesFunciones estadocuotaConstantesFunciones;
	//public EstadoCuotaParameterReturnGeneral estadocuotaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoCuota> estadocuotas;	
	//public List<EstadoCuota> estadocuotasEliminados;
	//public List<EstadoCuota> estadocuotasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoCuota=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoCuota=true;
	public Boolean isVisibilidadCeldaCopiarEstadoCuota=true;
	public Boolean isVisibilidadCeldaVerFormEstadoCuota=true;
	public Boolean isVisibilidadCeldaOrdenEstadoCuota=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoCuota=false;
	public Boolean isVisibilidadCeldaModificarEstadoCuota=false;
	public Boolean isVisibilidadCeldaActualizarEstadoCuota=false;
	public Boolean isVisibilidadCeldaEliminarEstadoCuota=false;
	public Boolean isVisibilidadCeldaCancelarEstadoCuota=false;
	public Boolean isVisibilidadCeldaGuardarEstadoCuota=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoCuota=false;	
	
	
	
	public Long getiIdNuevoEstadoCuota() {
		return this.iIdNuevoEstadoCuota;
	}

	public void setiIdNuevoEstadoCuota(Long iIdNuevoEstadoCuota) {
		this.iIdNuevoEstadoCuota = iIdNuevoEstadoCuota;
	}
	
	public Long getidEstadoCuotaActual() {
		return this.idEstadoCuotaActual;
	}

	public void setidEstadoCuotaActual(Long idEstadoCuotaActual) {
		this.idEstadoCuotaActual = idEstadoCuotaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoCuota getestadocuota() {
		return this.estadocuota;
	}

	public void setestadocuota(EstadoCuota estadocuota) {
		this.estadocuota = estadocuota;
	}
	
	public EstadoCuota getestadocuotaAux() {
		return this.estadocuotaAux;
	}

	public void setestadocuotaAux(EstadoCuota estadocuotaAux) {
		this.estadocuotaAux = estadocuotaAux;
	}				
	
	public EstadoCuota getestadocuotaAnterior() {
		return this.estadocuotaAnterior;
	}

	public void setestadocuotaAnterior(EstadoCuota estadocuotaAnterior) {
		this.estadocuotaAnterior = estadocuotaAnterior;
	}	
	
	public EstadoCuota getestadocuotaTotales() {
		return this.estadocuotaTotales;
	}

	public void setestadocuotaTotales(EstadoCuota estadocuotaTotales) {
		this.estadocuotaTotales = estadocuotaTotales;
	}	
	
	public EstadoCuota getestadocuotaBean() {
		return this.estadocuotaBean;
	}

	public void setestadocuotaBean(EstadoCuota estadocuotaBean) {
		this.estadocuotaBean = estadocuotaBean;
	}	
	
	public EstadoCuotaParameterReturnGeneral getestadocuotaReturnGeneral() {
		return this.estadocuotaReturnGeneral;
	}

	public void setestadocuotaReturnGeneral(EstadoCuotaParameterReturnGeneral estadocuotaReturnGeneral) {
		this.estadocuotaReturnGeneral = estadocuotaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoCuotaLogic getEstadoCuotaLogic()	{		
		return estadocuotaLogic;
	}

	public void setEstadoCuotaLogic(EstadoCuotaLogic estadocuotaLogic) {
		this.estadocuotaLogic = estadocuotaLogic;
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
	
	public Boolean getIsEsNuevoEstadoCuota() {
		return isEsNuevoEstadoCuota;
	}

	public void setIsEsNuevoEstadoCuota(Boolean isEsNuevoEstadoCuota) {
		this.isEsNuevoEstadoCuota = isEsNuevoEstadoCuota;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoCuota() {
		return esParaAccionDesdeFormularioEstadoCuota;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoCuota(Boolean esParaAccionDesdeFormularioEstadoCuota) {
		this.esParaAccionDesdeFormularioEstadoCuota = esParaAccionDesdeFormularioEstadoCuota;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoCuota() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoCuotaConstantesFunciones.refrescarForeignKeysDescripcionesEstadoCuota(this.estadocuotaLogic.getEstadoCuotas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoCuotaConstantesFunciones.refrescarForeignKeysDescripcionesEstadoCuota(this.estadocuotas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadocuotaLogic.setEstadoCuotas(this.estadocuotas);
			estadocuotaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoCuotaParameterReturnGeneral getEstadoCuotaParameterGeneral() {
		return this.estadocuotaParameterGeneral;
	}
	
	public void setEstadoCuotaParameterGeneral(EstadoCuotaParameterReturnGeneral estadocuotaParameterGeneral) {
		this.estadocuotaParameterGeneral = estadocuotaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoCuota() {
		return isPermisoTodoEstadoCuota;
	}

	public void setIsPermisoTodoEstadoCuota(Boolean isPermisoTodoEstadoCuota) {
		this.isPermisoTodoEstadoCuota = isPermisoTodoEstadoCuota;
	}

	public Boolean getIsPermisoNuevoEstadoCuota() {
		return isPermisoNuevoEstadoCuota;
	}

	public void setIsPermisoNuevoEstadoCuota(Boolean isPermisoNuevoEstadoCuota) {
		this.isPermisoNuevoEstadoCuota = isPermisoNuevoEstadoCuota;
	}

	public Boolean getIsPermisoActualizarEstadoCuota() {
		return isPermisoActualizarEstadoCuota;
	}

	public void setIsPermisoActualizarEstadoCuota(Boolean isPermisoActualizarEstadoCuota) {
		this.isPermisoActualizarEstadoCuota = isPermisoActualizarEstadoCuota;
	}

	public Boolean getIsPermisoEliminarEstadoCuota() {
		return isPermisoEliminarEstadoCuota;
	}

	public void setIsPermisoEliminarEstadoCuota(Boolean isPermisoEliminarEstadoCuota) {
		this.isPermisoEliminarEstadoCuota = isPermisoEliminarEstadoCuota;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoCuota() {
		return isPermisoGuardarCambiosEstadoCuota;
	}

	public void setIsPermisoGuardarCambiosEstadoCuota(Boolean isPermisoGuardarCambiosEstadoCuota) {
		this.isPermisoGuardarCambiosEstadoCuota = isPermisoGuardarCambiosEstadoCuota;
	}
	
	public Boolean getIsPermisoConsultaEstadoCuota() {
		return isPermisoConsultaEstadoCuota;
	}

	public void setIsPermisoConsultaEstadoCuota(Boolean isPermisoConsultaEstadoCuota) {
		this.isPermisoConsultaEstadoCuota = isPermisoConsultaEstadoCuota;
	}

	public Boolean getIsPermisoBusquedaEstadoCuota() {
		return isPermisoBusquedaEstadoCuota;
	}

	public void setIsPermisoBusquedaEstadoCuota(Boolean isPermisoBusquedaEstadoCuota) {
		this.isPermisoBusquedaEstadoCuota = isPermisoBusquedaEstadoCuota;
	}

	public Boolean getIsPermisoReporteEstadoCuota() {
		return isPermisoReporteEstadoCuota;
	}

	public void setIsPermisoReporteEstadoCuota(Boolean isPermisoReporteEstadoCuota) {
		this.isPermisoReporteEstadoCuota = isPermisoReporteEstadoCuota;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoCuota() {
		return isPermisoPaginacionMedioEstadoCuota;
	}

	public void setIsPermisoPaginacionMedioEstadoCuota(Boolean isPermisoPaginacionMedioEstadoCuota) {
		this.isPermisoPaginacionMedioEstadoCuota = isPermisoPaginacionMedioEstadoCuota;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoCuota() {
		return isPermisoPaginacionTodoEstadoCuota;
	}

	public void setIsPermisoPaginacionTodoEstadoCuota(Boolean isPermisoPaginacionTodoEstadoCuota) {
		this.isPermisoPaginacionTodoEstadoCuota = isPermisoPaginacionTodoEstadoCuota;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoCuota() {
		return isPermisoPaginacionAltoEstadoCuota;
	}

	public void setIsPermisoPaginacionAltoEstadoCuota(Boolean isPermisoPaginacionAltoEstadoCuota) {
		this.isPermisoPaginacionAltoEstadoCuota = isPermisoPaginacionAltoEstadoCuota;
	}
	
	public Boolean getIsPermisoCopiarEstadoCuota() {
		return isPermisoCopiarEstadoCuota;
	}

	public void setIsPermisoCopiarEstadoCuota(Boolean isPermisoCopiarEstadoCuota) {
		this.isPermisoCopiarEstadoCuota = isPermisoCopiarEstadoCuota;
	}
	
	public Boolean getIsPermisoVerFormEstadoCuota() {
		return isPermisoVerFormEstadoCuota;
	}

	public void setIsPermisoVerFormEstadoCuota(Boolean isPermisoVerFormEstadoCuota) {
		this.isPermisoVerFormEstadoCuota = isPermisoVerFormEstadoCuota;
	}
	
	public Boolean getIsPermisoDuplicarEstadoCuota() {
		return isPermisoDuplicarEstadoCuota;
	}

	public void setIsPermisoDuplicarEstadoCuota(Boolean isPermisoDuplicarEstadoCuota) {
		this.isPermisoDuplicarEstadoCuota = isPermisoDuplicarEstadoCuota;
	}
	
	public Boolean getIsPermisoOrdenEstadoCuota() {
		return isPermisoOrdenEstadoCuota;
	}

	public void setIsPermisoOrdenEstadoCuota(Boolean isPermisoOrdenEstadoCuota) {
		this.isPermisoOrdenEstadoCuota = isPermisoOrdenEstadoCuota;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoCuota() {
		return isVisibilidadCeldaNuevoEstadoCuota;
	}

	public void setIsVisibilidadCeldaNuevoEstadoCuota(Boolean isVisibilidadCeldaNuevoEstadoCuota) {
		this.isVisibilidadCeldaNuevoEstadoCuota = isVisibilidadCeldaNuevoEstadoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoCuota() {
		return isVisibilidadCeldaDuplicarEstadoCuota;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoCuota(Boolean isVisibilidadCeldaDuplicarEstadoCuota) {
		this.isVisibilidadCeldaDuplicarEstadoCuota = isVisibilidadCeldaDuplicarEstadoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoCuota() {
		return isVisibilidadCeldaCopiarEstadoCuota;
	}

	public void setIsVisibilidadCeldaCopiarEstadoCuota(Boolean isVisibilidadCeldaCopiarEstadoCuota) {
		this.isVisibilidadCeldaCopiarEstadoCuota = isVisibilidadCeldaCopiarEstadoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoCuota() {
		return isVisibilidadCeldaVerFormEstadoCuota;
	}

	public void setIsVisibilidadCeldaVerFormEstadoCuota(Boolean isVisibilidadCeldaVerFormEstadoCuota) {
		this.isVisibilidadCeldaVerFormEstadoCuota = isVisibilidadCeldaVerFormEstadoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoCuota() {
		return isVisibilidadCeldaOrdenEstadoCuota;
	}

	public void setIsVisibilidadCeldaOrdenEstadoCuota(Boolean isVisibilidadCeldaOrdenEstadoCuota) {
		this.isVisibilidadCeldaOrdenEstadoCuota = isVisibilidadCeldaOrdenEstadoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoCuota() {
		return isVisibilidadCeldaNuevoRelacionesEstadoCuota;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoCuota(Boolean isVisibilidadCeldaNuevoRelacionesEstadoCuota) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoCuota = isVisibilidadCeldaNuevoRelacionesEstadoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoCuota() {
		return isVisibilidadCeldaModificarEstadoCuota;
	}

	public void setIsVisibilidadCeldaModificarEstadoCuota(Boolean isVisibilidadCeldaModificarEstadoCuota) {
		this.isVisibilidadCeldaModificarEstadoCuota = isVisibilidadCeldaModificarEstadoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoCuota() {
		return isVisibilidadCeldaActualizarEstadoCuota;
	}

	public void setIsVisibilidadCeldaActualizarEstadoCuota(Boolean isVisibilidadCeldaActualizarEstadoCuota) {
		this.isVisibilidadCeldaActualizarEstadoCuota = isVisibilidadCeldaActualizarEstadoCuota;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoCuota() {
		return isVisibilidadCeldaEliminarEstadoCuota;
	}

	public void setIsVisibilidadCeldaEliminarEstadoCuota(Boolean isVisibilidadCeldaEliminarEstadoCuota) {
		this.isVisibilidadCeldaEliminarEstadoCuota = isVisibilidadCeldaEliminarEstadoCuota;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoCuota() {
		return isVisibilidadCeldaCancelarEstadoCuota;
	}

	public void setIsVisibilidadCeldaCancelarEstadoCuota(Boolean isVisibilidadCeldaCancelarEstadoCuota) {
		this.isVisibilidadCeldaCancelarEstadoCuota = isVisibilidadCeldaCancelarEstadoCuota;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoCuota() {
		return isVisibilidadCeldaGuardarEstadoCuota;
	}

	public void setIsVisibilidadCeldaGuardarEstadoCuota(Boolean isVisibilidadCeldaGuardarEstadoCuota) {
		this.isVisibilidadCeldaGuardarEstadoCuota = isVisibilidadCeldaGuardarEstadoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoCuota() {
		return isVisibilidadCeldaGuardarCambiosEstadoCuota;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoCuota(Boolean isVisibilidadCeldaGuardarCambiosEstadoCuota) {
		this.isVisibilidadCeldaGuardarCambiosEstadoCuota = isVisibilidadCeldaGuardarCambiosEstadoCuota;
	}
		
	public EstadoCuotaSessionBean getestadocuotaSessionBean() {
		return this.estadocuotaSessionBean;
	}
	
	public void setestadocuotaSessionBean(EstadoCuotaSessionBean estadocuotaSessionBean) {
		this.estadocuotaSessionBean=estadocuotaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(EstadoCuota estadocuota)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(EstadoCuota estadocuota,EstadoCuota estadocuotaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoCuota(estadocuota);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadocuotaAux.setId(estadocuota.getId());
		estadocuotaAux.setVersionRow(estadocuota.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoCuota();
		
			int intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuota =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadocuota =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoCuota(this.estadocuota,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(this.estadocuota);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadocuotaValidator.getInvalidValues(this.estadocuota);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadocuotaLogic.setDatosCliente(datosCliente);
			estadocuotaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadocuotaAux=new  EstadoCuota();
				
				estadocuotaAux.setIsNew(true);
				estadocuotaAux.setIsChanged(true);
				
				estadocuotaAux.setEstadoCuotaOriginal(this.estadocuota);
				
				estadocuotaAux.setId(this.estadocuota.getId());	
				estadocuotaAux.setVersionRow(this.estadocuota.getVersionRow());	
				estadocuotaAux.setcodigo(this.estadocuota.getcodigo());	
				estadocuotaAux.setnombre(this.estadocuota.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadocuotaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadocuotaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadocuotaAux,estadocuotaLogic.getEstadoCuotas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocuotaAux,estadocuotas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadocuotaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadocuotaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocuotaLogic.saveEstadoCuotas();//WithConnection
						//estadocuotaLogic.getSetVersionRowEstadoCuotas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadocuota,estadocuotaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadocuotaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas().addAll(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotas.addAll(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadocuotaLogic.saveEstadoCuotaRelaciones(estadocuotaAux,this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());//WithConnection
								//estadocuotaLogic.getSetVersionRowEstadoCuotas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadocuota,estadocuotaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(new ArrayList<Cuota>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotas= new ArrayList<Cuota>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocuotaAux.setCuotas(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadocuotaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadocuotaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadocuotaAux,estadocuotaLogic.getEstadoCuotas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadocuotaAux,estadocuotas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadocuota,estadocuotaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadocuotaAux=new  EstadoCuota();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadocuotaSessionBean.getEsGuardarRelacionado() 
					|| (this.estadocuotaSessionBean.getEsGuardarRelacionado() && this.estadocuota.getId()>=0)) {
						
					estadocuotaAux.setIsNew(false);
				}
				
				estadocuotaAux.setIsDeleted(false);
			
				estadocuotaAux.setId(this.estadocuota.getId());	
				estadocuotaAux.setVersionRow(this.estadocuota.getVersionRow());	
				estadocuotaAux.setcodigo(this.estadocuota.getcodigo());	
				estadocuotaAux.setnombre(this.estadocuota.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadocuotaAux,estadocuotaLogic.getEstadoCuotas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocuotaAux,estadocuotas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadocuotaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadocuotaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocuotaLogic.saveEstadoCuotas();//WithConnection
						//estadocuotaLogic.getSetVersionRowEstadoCuotas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadocuota,estadocuotaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadocuotaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas().addAll(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotas.addAll(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadocuotaLogic.saveEstadoCuotaRelaciones(estadocuotaAux,this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());//WithConnection
								//estadocuotaLogic.getSetVersionRowEstadoCuotas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadocuota,estadocuotaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(new ArrayList<Cuota>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotas= new ArrayList<Cuota>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocuotaAux.setCuotas(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadocuotaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadocuotaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadocuotaAux,estadocuotaLogic.getEstadoCuotas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadocuotaAux,estadocuotas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadocuota,estadocuotaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadocuotaAux=new  EstadoCuota();
				
				estadocuotaAux.setIsNew(false);
				estadocuotaAux.setIsChanged(false);
				
				estadocuotaAux.setIsDeleted(true);
				
				estadocuotaAux.setId(this.estadocuota.getId());	
				estadocuotaAux.setVersionRow(this.estadocuota.getVersionRow());	
				estadocuotaAux.setcodigo(this.estadocuota.getcodigo());	
				estadocuotaAux.setnombre(this.estadocuota.getnombre());	
				
				if(this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadocuotaAux.getId()>=0) {	
						this.estadocuotasEliminados.add(estadocuotaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadocuotaAux,estadocuotaLogic.getEstadoCuotas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocuotaAux,estadocuotas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadocuotaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadocuotaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocuotaLogic.saveEstadoCuotas();//WithConnection
						//estadocuotaLogic.getSetVersionRowEstadoCuotas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadocuotaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas().addAll(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotas.addAll(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadocuotaLogic.saveEstadoCuotaRelaciones(estadocuotaAux,this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());//WithConnection
								//estadocuotaLogic.getSetVersionRowEstadoCuotas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(new ArrayList<Cuota>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotas= new ArrayList<Cuota>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocuotaAux.setCuotas(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadocuotaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadocuotaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadocuotaAux,estadocuotaLogic.getEstadoCuotas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadocuotaAux,estadocuotas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.getEstadoCuotas().addAll(this.estadocuotasEliminados);
					
					estadocuotaLogic.saveEstadoCuotas();//WithConnection
					//estadocuotaLogic.getSetVersionRowEstadoCuotas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadocuotasEliminados= new ArrayList<EstadoCuota>();		
			}
			
			if(this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Cuota GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Cuota",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadocuota=estadocuotaAux;
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
      		//this.finishProcessEstadoCuota();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoCuota estadocuotaLocal) throws Exception {
		
		if(this.estadocuotaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadocuotaLocal.setCuotas(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
			
			} else {
			
				estadocuotaLocal.setCuotas(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoCuota estadocuotaLocal) throws Exception {	
		if(this.estadocuotaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoCuotaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadocuota =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadocuota =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadocuotaValidator.getInvalidValues(this.estadocuota);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoCuota estadocuota,List<EstadoCuota> estadocuotas) throws Exception {
		try	{		
			EstadoCuotaConstantesFunciones.actualizarLista(estadocuota,estadocuotas,this.estadocuotaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoCuota estadocuota,List<EstadoCuota> estadocuotas) throws Exception {
		try	{			
			EstadoCuotaConstantesFunciones.actualizarSelectedLista(estadocuota,estadocuotas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoCuota> estadocuotasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadocuotasLocal=this.estadocuotaLogic.getEstadoCuotas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadocuotasLocal=this.estadocuotas;
			}
			//ARCHITECTURE
		
			for(EstadoCuota estadocuotaLocal:estadocuotasLocal) {
				if(this.permiteMantenimiento(estadocuotaLocal) && estadocuotaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoCuotaConstantesFunciones.getEstadoCuotaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoCuotaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCuota.jLabelcodigoEstadoCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoCuotaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCuota.jLabelnombreEstadoCuota,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoCuota.jLabelcodigoEstadoCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoCuota.jLabelnombreEstadoCuota,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cuota")) {
			if(this.estadocuota==null) {
				this.estadocuota= new EstadoCuota();
			}

			if(this.estadocuotaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoCuota
				this.setVariablesFormularioToObjetoActualEstadoCuota(this.estadocuota,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(this.estadocuota);

				this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.getcuota().setEstadoCuota(this.estadocuota);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoCuota--;	
		
		
		this.estadocuotaAux=new EstadoCuota();
		
		this.estadocuotaAux.setId(this.iIdNuevoEstadoCuota);
		this.estadocuotaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadocuotaLogic.getEstadoCuotas().add(this.estadocuotaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadocuotas.add(this.estadocuotaAux);
		}
		//ARCHITECTURE
		
		this.estadocuota=this.estadocuotaAux;
		
		if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoCuota(this.estadocuota);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoCuota(this.estadocuota);
		}
				
		//this.setDefaultControlesEstadoCuota();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoCuota();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoCuota();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoCuota();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoCuota(this.estadocuotaBean,this.estadocuota,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(this.estadocuota);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoCuotaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadocuotaSessionBean.getConGuardarRelaciones()) {
			classes=EstadoCuotaConstantesFunciones.getClassesRelationshipsOfEstadoCuota(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadocuotaReturnGeneral=estadocuotaLogic.procesarEventosEstadoCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadocuotaLogic.getEstadoCuotas(),this.estadocuota,this.estadocuotaParameterGeneral,this.isEsNuevoEstadoCuota,classes);//this.estadocuotaLogic.getEstadoCuota()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoCuota(this.estadocuotaReturnGeneral,this.estadocuotaBean,false);
		
		if(this.estadocuotaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoCuota(this.estadocuotaReturnGeneral.getEstadoCuota());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoCuota(this.estadocuotaReturnGeneral.getEstadoCuota());
		}
		
		if(this.estadocuotaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoCuota(this.estadocuotaReturnGeneral.getEstadoCuota(),classes);//this.estadocuotaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoCuota(this.estadocuota,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoCuota();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoCuota();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoCuotaBeanSwingJInternalFrameAdditional.RecargarFormEstadoCuota(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoCuota(false);
						
			if(estadocuotaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaSessionBean.getEsGuardarRelacionado() && CuotaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuotaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoCuota();
			}
			
			this.actualizarVisualTableDatosEstadoCuota();
			
			this.jTableDatosEstadoCuota.setRowSelectionInterval(this.getIndiceNuevoEstadoCuota(), this.getIndiceNuevoEstadoCuota());
			
			this.seleccionarFilaTablaEstadoCuotaActual();
						
			this.actualizarEstadoCeldasBotonesEstadoCuota("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoCuota(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoCuota.jTextFieldcodigoEstadoCuota.setEnabled(isHabilitar && this.estadocuotaConstantesFunciones.activarcodigoEstadoCuota);
		this.jInternalFrameDetalleFormEstadoCuota.jTextAreanombreEstadoCuota.setEnabled(isHabilitar && this.estadocuotaConstantesFunciones.activarnombreEstadoCuota);	
		
	};
	
	public void setDefaultControlesEstadoCuota() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoCuota(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadocuotaSessionBean.setConGuardarRelaciones(true);			
			this.estadocuotaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoCuota.jTabbedPaneRelacionesEstadoCuota.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadocuotaSessionBean.setConGuardarRelaciones(false);			
			this.estadocuotaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoCuota.jTabbedPaneRelacionesEstadoCuota.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoCuota() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCuota estadocuotaAux:this.estadocuotaLogic.getEstadoCuotas()) {
				if(estadocuotaAux.getId().equals(this.iIdNuevoEstadoCuota)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCuota estadocuotaAux:this.estadocuotas) {
				if(estadocuotaAux.getId().equals(this.iIdNuevoEstadoCuota)) {
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
	
	public int getIndiceActualEstadoCuota(EstadoCuota estadocuota,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCuota estadocuotaAux:this.estadocuotaLogic.getEstadoCuotas()) {
				if(estadocuotaAux.getId().equals(estadocuota.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCuota estadocuotaAux:this.estadocuotas) {
				if(estadocuotaAux.getId().equals(estadocuota.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoCuota(EstadoCuota estadocuotaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCuota estadocuotaAux:this.estadocuotaLogic.getEstadoCuotas()) {
				if(estadocuotaAux.getEstadoCuotaOriginal().getId().equals(estadocuotaOriginal.getId())) {
					existe=true;
					estadocuotaOriginal.setId(estadocuotaAux.getId());
					estadocuotaOriginal.setVersionRow(estadocuotaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCuota estadocuotaAux:this.estadocuotas) {
				if(estadocuotaAux.getEstadoCuotaOriginal().getId().equals(estadocuotaOriginal.getId())) {
					existe=true;
					estadocuotaOriginal.setId(estadocuotaAux.getId());
					estadocuotaOriginal.setVersionRow(estadocuotaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoCuota(Boolean esParaCancelar) throws Exception {
		estadocuotasAux=new ArrayList<EstadoCuota>();
		estadocuotaAux=new EstadoCuota();
		
		if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoCuota estadocuotaAux:this.estadocuotaLogic.getEstadoCuotas()) {
					if(estadocuotaAux.getId()<0) {
						estadocuotasAux.add(estadocuotaAux);
					}		
				}
				this.iIdNuevoEstadoCuota=0L;
				this.estadocuotaLogic.getEstadoCuotas().removeAll(estadocuotasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCuota estadocuotaAux:this.estadocuotas) {
					if(estadocuotaAux.getId()<0) {
						estadocuotasAux.add(estadocuotaAux);
					}		
				}
				this.iIdNuevoEstadoCuota=0L;
				this.estadocuotas.removeAll(estadocuotasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoCuota 
					&& this.estadocuotaLogic.getEstadoCuotas().size()>0
					) {
					estadocuotaAux=this.estadocuotaLogic.getEstadoCuotas().get(this.estadocuotaLogic.getEstadoCuotas().size() - 1);
				
					if(estadocuotaAux.getId()<0) {
						this.estadocuotaLogic.getEstadoCuotas().remove(estadocuotaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoCuota && this.estadocuotas.size()>0) {
					estadocuotaAux=this.estadocuotas.get(this.estadocuotas.size() - 1);
				
					if(estadocuotaAux.getId()<0) {
						this.estadocuotas.remove(estadocuotaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoCuota(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadocuota.getId()<0) {
				this.estadocuotaLogic.getEstadoCuotas().remove(this.estadocuota);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadocuota.getId()<0) {
				this.estadocuotas.remove(this.estadocuota);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoCuota(List<EstadoCuota> estadocuotasAux) throws Exception {
		EstadoCuotaConstantesFunciones.setEstadosInicialesEstadoCuota(estadocuotasAux);
	}
	
	public void setEstadosInicialesEstadoCuota(EstadoCuota estadocuotaAux) throws Exception {
		EstadoCuotaConstantesFunciones.setEstadosInicialesEstadoCuota(estadocuotaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoCuotaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoCuotaActual()) {
				if(!this.isEsNuevoEstadoCuota) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoCuota=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoCuotaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Cuota ?", "MANTENIMIENTO DE Estado Cuota", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoCuota estadocuota) throws Exception {
		EstadoCuotaConstantesFunciones.seleccionarAsignar(this.estadocuota,estadocuota);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoCuota=this.isPermisoActualizarOriginalEstadoCuota;
			
			
			this.seleccionarAsignar(estadocuota);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoCuotaConstantesFunciones.quitarEspaciosEstadoCuota(this.estadocuota,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoCuota("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadocuotaSessionBean.setsFuncionBusquedaRapida(this.estadocuotaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoCuota) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoCuota(esParaCancelar);				
				this.cancelarNuevoEstadoCuota(esParaCancelar);								
			}
			
			this.estadocuota=new EstadoCuota();
			
			this.inicializarEstadoCuota();
			
			this.actualizarEstadoCeldasBotonesEstadoCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoCuota() throws Exception {
		try {
			EstadoCuotaConstantesFunciones.inicializarEstadoCuota(this.estadocuota);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadocuotaLogic.getEstadoCuotas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoCuotas(String sAccionBusqueda,List<EstadoCuota> estadocuotasParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoCuota"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoCuotaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoCuotaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoCuota"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Cuotas");		
		parameters.put("busquedapor", EstadoCuotaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cuota.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoCuotaLogic estadocuotaLogicAuxiliar=new EstadoCuotaLogic();
					estadocuotaLogicAuxiliar.setDatosCliente(estadocuotaLogic.getDatosCliente());				
					estadocuotaLogicAuxiliar.setEstadoCuotas(estadocuotasParaReportes);
					
					estadocuotaLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoCuotaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadocuotasParaReportes=estadocuotaLogicAuxiliar.getEstadoCuotas();
					
					//estadocuotaLogic.getNewConnexionToDeep();
					
					//for (EstadoCuota estadocuota:estadocuotasParaReportes) {
					//	estadocuotaLogic.deepLoad(estadocuota, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadocuotaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadocuotaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCuota = AuxiliarReportes.class.getResourceAsStream("CuotaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cuota", reportFileCuota);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoCuota=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoCuotaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoCuotaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoCuota=new JRBeanArrayDataSource(EstadoCuotaJInternalFrame.TraerEstadoCuotaBeans(estadocuotasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoCuota);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoCuotaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoCuotaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoCuotaBean.TraerEstadoCuotaBeans(estadocuotasParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoCuotas(sAccionBusqueda,sTipoArchivoReporte,estadocuotasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoCuotas(sAccionBusqueda,sTipoArchivoReporte,estadocuotasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoCuotaActionPerformed(null);
					//this.generarExcelReporteEstadoCuotas(sAccionBusqueda,sTipoArchivoReporte,estadocuotasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoCuotas(sAccionBusqueda,sTipoArchivoReporte,estadocuotasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoCuotas(sAccionBusqueda,sTipoArchivoReporte,estadocuotasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoCuotas(sAccionBusqueda,sTipoArchivoReporte,estadocuotasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoCuotas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoCuota> estadocuotasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocuota";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoCuotas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoCuota("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoCuota estadocuota : estadocuotasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoCuotaConstantesFunciones.generarExcelReporteDataEstadoCuota("NORMAL",row,workbook,estadocuota,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuota",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoCuota(String sTipo,Row row,Workbook workbook) {
		
		EstadoCuotaConstantesFunciones.generarExcelReporteHeaderEstadoCuota(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoCuotas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoCuota> estadocuotasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocuota_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoCuotas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoCuota estadocuota : estadocuotasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoCuotaConstantesFunciones.getEstadoCuotaDescripcion(estadocuota));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoCuotaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoCuotaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadocuota.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoCuotaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoCuotaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadocuota.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuota",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoCuotas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoCuota> estadocuotasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoCuota> estadocuotasRespaldo=null;
		
		classes=EstadoCuotaConstantesFunciones.getClassesRelationshipsOfEstadoCuota(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadocuotaLogic.setDatosCliente(this.datosCliente);
		this.estadocuotaLogic.setDatosDeep(this.datosDeep);
		this.estadocuotaLogic.setIsConDeep(true);
		
		estadocuotasRespaldo=this.estadocuotaLogic.getEstadoCuotas();
		
		this.estadocuotaLogic.setEstadoCuotas(estadocuotasParaReportes);	
		this.estadocuotaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadocuotasParaReportes=this.estadocuotaLogic.getEstadoCuotas();
		this.estadocuotaLogic.setEstadoCuotas(estadocuotasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocuota_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoCuotas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoCuota("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoCuota estadocuota : estadocuotasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoCuota("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoCuotaConstantesFunciones.generarExcelReporteDataEstadoCuota("NORMAL",row,workbook,estadocuota,cellStyleDataAux);
		
			
			


				//Cuota
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CuotaConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadocuota.getCuotas()!=null && estadocuota.getCuotas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CuotaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CuotaConstantesFunciones.generarExcelReporteHeaderCuota("RELACIONADO",row,workbook);
				}

				if(estadocuota.getCuotas()!=null) {
					i2=0;
					for(Cuota cuota : estadocuota.getCuotas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CuotaConstantesFunciones.generarExcelReporteDataCuota("RELACIONADO",row,workbook,cuota,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoCuotaConstantesFunciones.getEstadoCuotaDescripcion(estadocuota));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuota",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoCuota.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCuota.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoCuota.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCuota.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoCuota() throws Exception {		
		this.startProcessEstadoCuota(true);
	}
	
	public void startProcessEstadoCuota(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoCuota, this.jScrollPanelDatosEstadoCuota,this.jPanelPaginacionEstadoCuota, this.jScrollPanelDatosEdicionEstadoCuota, this.jPanelAccionesEstadoCuota,this.jPanelAccionesFormularioEstadoCuota,this.jmenuBarEstadoCuota,this.jmenuBarDetalleEstadoCuota,this.jTtoolBarEstadoCuota,this.jTtoolBarDetalleEstadoCuota);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoCuota=null; 
		
		final JPanel jPanelParametrosReportesEstadoCuota=this.jPanelParametrosReportesEstadoCuota;
		//final JScrollPane jScrollPanelDatosEstadoCuota=this.jScrollPanelDatosEstadoCuota;
		final JTable jTableDatosEstadoCuota=this.jTableDatosEstadoCuota;		
		final JPanel jPanelPaginacionEstadoCuota=this.jPanelPaginacionEstadoCuota;
		//final JScrollPane jScrollPanelDatosEdicionEstadoCuota=this.jScrollPanelDatosEdicionEstadoCuota;
		final JPanel jPanelAccionesEstadoCuota=this.jPanelAccionesEstadoCuota;
		
		JPanel jPanelCamposAuxiliarEstadoCuota=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoCuota=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
			jPanelCamposAuxiliarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jPanelCamposEstadoCuota;
			jPanelAccionesFormularioAuxiliarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jPanelAccionesFormularioEstadoCuota;
		}
		
		final JPanel jPanelCamposEstadoCuota=jPanelCamposAuxiliarEstadoCuota;
		final JPanel jPanelAccionesFormularioEstadoCuota=jPanelAccionesFormularioAuxiliarEstadoCuota;
		
		
		final JMenuBar jmenuBarEstadoCuota=this.jmenuBarEstadoCuota;
		final JToolBar jTtoolBarEstadoCuota=this.jTtoolBarEstadoCuota;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoCuota=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoCuota=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
			jmenuBarDetalleAuxiliarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jmenuBarDetalleEstadoCuota;
			jTtoolBarDetalleAuxiliarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jTtoolBarDetalleEstadoCuota;
		}
		
		final JMenuBar jmenuBarDetalleEstadoCuota=jmenuBarDetalleAuxiliarEstadoCuota;
		final JToolBar jTtoolBarDetalleEstadoCuota=jTtoolBarDetalleAuxiliarEstadoCuota;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoCuota;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoCuota;
			processRunnable.jTableDatos=jTableDatosEstadoCuota;
			processRunnable.jPanelCampos=jPanelCamposEstadoCuota;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoCuota;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoCuota;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoCuota;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoCuota;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoCuota;
			processRunnable.jTtoolBar=jTtoolBarEstadoCuota;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoCuota;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoCuota ,jPanelParametrosReportesEstadoCuota,jTableDatosEstadoCuota, /*jScrollPanelDatosEstadoCuota,*/jPanelCamposEstadoCuota,jPanelPaginacionEstadoCuota, /*jScrollPanelDatosEdicionEstadoCuota,*/ jPanelAccionesEstadoCuota,jPanelAccionesFormularioEstadoCuota,jmenuBarEstadoCuota,jmenuBarDetalleEstadoCuota,jTtoolBarEstadoCuota,jTtoolBarDetalleEstadoCuota);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoCuota, jScrollPanelDatosEstadoCuota,jPanelPaginacionEstadoCuota, jScrollPanelDatosEdicionEstadoCuota, jPanelAccionesEstadoCuota,jPanelAccionesFormularioEstadoCuota,jmenuBarEstadoCuota,jmenuBarDetalleEstadoCuota,jTtoolBarEstadoCuota,jTtoolBarDetalleEstadoCuota);
						
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
	
	public void finishProcessEstadoCuota() {// throws Exception 
		this.finishProcessEstadoCuota(true);
	}
	
	public void finishProcessEstadoCuota(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoCuota, this.jScrollPanelDatosEstadoCuota,this.jPanelPaginacionEstadoCuota, this.jScrollPanelDatosEdicionEstadoCuota, this.jPanelAccionesEstadoCuota,this.jPanelAccionesFormularioEstadoCuota,this.jmenuBarEstadoCuota,this.jmenuBarDetalleEstadoCuota,this.jTtoolBarEstadoCuota,this.jTtoolBarDetalleEstadoCuota);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoCuota=null; 
		
		final JPanel jPanelParametrosReportesEstadoCuota=this.jPanelParametrosReportesEstadoCuota;
		//final JScrollPane jScrollPanelDatosEstadoCuota=this.jScrollPanelDatosEstadoCuota;
		final JTable jTableDatosEstadoCuota=this.jTableDatosEstadoCuota;		
		final JPanel jPanelPaginacionEstadoCuota=this.jPanelPaginacionEstadoCuota;
		//final JScrollPane jScrollPanelDatosEdicionEstadoCuota=this.jScrollPanelDatosEdicionEstadoCuota;
		final JPanel jPanelAccionesEstadoCuota=this.jPanelAccionesEstadoCuota;
		
		JPanel jPanelCamposAuxiliarEstadoCuota=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoCuota=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
			jPanelCamposAuxiliarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jPanelCamposEstadoCuota;
			jPanelAccionesFormularioAuxiliarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jPanelAccionesFormularioEstadoCuota;
		}
		
		final JPanel jPanelCamposEstadoCuota=jPanelCamposAuxiliarEstadoCuota;
		final JPanel jPanelAccionesFormularioEstadoCuota=jPanelAccionesFormularioAuxiliarEstadoCuota;
		
		
		final JMenuBar jmenuBarEstadoCuota=this.jmenuBarEstadoCuota;		
		final JToolBar jTtoolBarEstadoCuota=this.jTtoolBarEstadoCuota;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoCuota=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoCuota=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
			jmenuBarDetalleAuxiliarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jmenuBarDetalleEstadoCuota;
			jTtoolBarDetalleAuxiliarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jTtoolBarDetalleEstadoCuota;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoCuota=jmenuBarDetalleAuxiliarEstadoCuota;
		final JToolBar jTtoolBarDetalleEstadoCuota=jTtoolBarDetalleAuxiliarEstadoCuota;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoCuota;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoCuota;
			processRunnable.jTableDatos=jTableDatosEstadoCuota;
			processRunnable.jPanelCampos=jPanelCamposEstadoCuota;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoCuota;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoCuota;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoCuota;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoCuota;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoCuota;
			processRunnable.jTtoolBar=jTtoolBarEstadoCuota;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoCuota;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoCuota ,jPanelParametrosReportesEstadoCuota, jTableDatosEstadoCuota,/*jScrollPanelDatosEstadoCuota,*/jPanelCamposEstadoCuota,jPanelPaginacionEstadoCuota, /*jScrollPanelDatosEdicionEstadoCuota,*/ jPanelAccionesEstadoCuota,jPanelAccionesFormularioEstadoCuota,jmenuBarEstadoCuota,jmenuBarDetalleEstadoCuota,jTtoolBarEstadoCuota,jTtoolBarDetalleEstadoCuota));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoCuota(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoCuota(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoCuota(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoCuota(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoCuota,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoCuota,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoCuota(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoCuota,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoCuota,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadocuotaConstantesFunciones.getsFinalQueryEstadoCuota();
		String  finalQueryPaginacionTodos=this.estadocuotaConstantesFunciones.getsFinalQueryEstadoCuota();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoCuotaConstantesFunciones.getArrayColumnasGlobalesNoEstadoCuota(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoCuotaConstantesFunciones.getArrayColumnasGlobalesEstadoCuota(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoCuotaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadocuotasEliminados= new ArrayList<EstadoCuota>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoCuota();
		
				///*EstadoCuotaSessionBean*/this.estadocuotaSessionBean=new EstadoCuotaSessionBean();
			
			if(this.estadocuotaSessionBean==null) {
				this.estadocuotaSessionBean=new EstadoCuotaSessionBean();
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
					this.iNumeroPaginacion=EstadoCuotaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoCuotaConstantesFunciones.getClassesForeignKeysOfEstadoCuota(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadocuota."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadocuotasAux= new ArrayList<EstadoCuota>();
			
				
			estadocuotaLogic.setDatosCliente(this.datosCliente);
			estadocuotaLogic.setDatosDeep(this.datosDeep);
			estadocuotaLogic.setIsConDeep(true);
			
			
			estadocuotaLogic.getEstadoCuotaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadocuotaLogic.getTodosEstadoCuotas(finalQueryGlobal,pagination);
					
					//estadocuotaLogic.getTodosEstadoCuotasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadocuotaLogic.getEstadoCuotas()==null|| estadocuotaLogic.getEstadoCuotas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadocuotasAux= new ArrayList<EstadoCuota>();
							estadocuotasAux.addAll(estadocuotaLogic.getEstadoCuotas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadocuotasAux= new ArrayList<EstadoCuota>();
							estadocuotasAux.addAll(estadocuotas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadocuotaLogic.getTodosEstadoCuotas(finalQueryGlobal+"",this.pagination);												
							
							//estadocuotaLogic.getTodosEstadoCuotasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoCuotas("Todos",estadocuotaLogic.getEstadoCuotas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadocuotaLogic.setEstadoCuotas(new ArrayList<EstadoCuota>());					
							estadocuotaLogic.getEstadoCuotas().addAll(estadocuotasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadocuotas=new ArrayList<EstadoCuota>();
							estadocuotas.addAll(estadocuotasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoCuota=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoCuota=this.idActual;
				
				} else if(this.idEstadoCuotaActual!=null && this.idEstadoCuotaActual!=0L) {
					idEstadoCuota=idEstadoCuotaActual;
				}
				
					
				this.sDetalleReporte=EstadoCuotaConstantesFunciones.getDetalleIndicePorId(idEstadoCuota);
				
				this.estadocuotas=new ArrayList<EstadoCuota>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadocuotaLogic.getEntity(idEstadoCuota);
					
					//estadocuotaLogic.getEntityWithConnection(idEstadoCuota);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocuotaLogic.setEstadoCuotas(new ArrayList<EstadoCuota>());
					estadocuotaLogic.getEstadoCuotas().add(estadocuotaLogic.getEstadoCuota());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadocuotas=new ArrayList<EstadoCuota>();
					this.estadocuotas.add(estadocuota);
				}
				
				if(estadocuotaLogic.getEstadoCuota()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoCuota();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoCuota();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadocuotaLogic.getEstadoCuotas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadocuotas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadocuotaLogic.getEstadoCuotas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadocuotas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoCuota estadocuota) {
		Boolean permite=true;
		
		if(this.estadocuota.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoCuotaConstantesFunciones.getOrderByListaEstadoCuota();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoCuotaConstantesFunciones.getOrderByListaEstadoCuota();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCuota estadocuota:estadocuotaLogic.getEstadoCuotas()) {
				if(estadocuota.getsType().equals(Constantes2.S_TOTALES)) {
					estadocuotaTotales=estadocuota;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCuota estadocuota:this.estadocuotas) {
				if(estadocuota.getsType().equals(Constantes2.S_TOTALES)) {
					estadocuotaTotales=estadocuota;
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
			this.estadocuotaAux=new EstadoCuota();
			this.estadocuotaAux.setsType(Constantes2.S_TOTALES);
			this.estadocuotaAux.setIsNew(false);
			this.estadocuotaAux.setIsChanged(false);
			this.estadocuotaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoCuotaConstantesFunciones.TotalizarValoresFilaEstadoCuota(this.estadocuotaLogic.getEstadoCuotas(),this.estadocuotaAux);
				
				this.estadocuotaLogic.getEstadoCuotas().add(this.estadocuotaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoCuotaConstantesFunciones.TotalizarValoresFilaEstadoCuota(this.estadocuotas,this.estadocuotaAux);
				
				this.estadocuotas.add(this.estadocuotaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadocuotaTotales=new EstadoCuota();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadocuotaLogic.getEstadoCuotas().remove(estadocuotaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadocuotas.remove(estadocuotaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadocuotaTotales=new EstadoCuota();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCuota estadocuota:estadocuotaLogic.getEstadoCuotas()) {
				if(estadocuota.getsType().equals(Constantes2.S_TOTALES)) {
					estadocuotaTotales=estadocuota;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoCuotaConstantesFunciones.TotalizarValoresFilaEstadoCuota(this.estadocuotaLogic.getEstadoCuotas(),estadocuotaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCuota estadocuota:this.estadocuotas) {
				if(estadocuota.getsType().equals(Constantes2.S_TOTALES)) {
					estadocuotaTotales=estadocuota;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoCuotaConstantesFunciones.TotalizarValoresFilaEstadoCuota(this.estadocuotas,estadocuotaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoCuotaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoCuotaPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocuotaLogic.getEstadoCuotaPorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoCuota() {
		this.isPermisoTodoEstadoCuota=false;
		this.isPermisoNuevoEstadoCuota=false;
		this.isPermisoActualizarEstadoCuota=false;
		this.isPermisoActualizarOriginalEstadoCuota=false;
		this.isPermisoEliminarEstadoCuota=false;
		this.isPermisoGuardarCambiosEstadoCuota=false;
		this.isPermisoConsultaEstadoCuota=false;
		this.isPermisoBusquedaEstadoCuota=false;
		this.isPermisoReporteEstadoCuota=false;		
		this.isPermisoOrdenEstadoCuota=false;		
		this.isPermisoPaginacionMedioEstadoCuota=false;		
		this.isPermisoPaginacionAltoEstadoCuota=false;
		this.isPermisoPaginacionTodoEstadoCuota=false;
		this.isPermisoCopiarEstadoCuota=false;		
		this.isPermisoVerFormEstadoCuota=false;		
		this.isPermisoDuplicarEstadoCuota=false;		
		this.isPermisoOrdenEstadoCuota=false;		
	}
	
	public void setPermisosUsuarioEstadoCuota(Boolean isPermiso) {
		this.isPermisoTodoEstadoCuota=isPermiso;
		this.isPermisoNuevoEstadoCuota=isPermiso;
		this.isPermisoActualizarEstadoCuota=isPermiso;
		this.isPermisoActualizarOriginalEstadoCuota=isPermiso;
		this.isPermisoEliminarEstadoCuota=isPermiso;
		this.isPermisoGuardarCambiosEstadoCuota=isPermiso;
		this.isPermisoConsultaEstadoCuota=isPermiso;
		this.isPermisoBusquedaEstadoCuota=isPermiso;
		this.isPermisoReporteEstadoCuota=isPermiso;
		this.isPermisoOrdenEstadoCuota=isPermiso;		
		this.isPermisoPaginacionMedioEstadoCuota=isPermiso;		
		this.isPermisoPaginacionAltoEstadoCuota=isPermiso;		
		this.isPermisoPaginacionTodoEstadoCuota=isPermiso;		
		this.isPermisoCopiarEstadoCuota=isPermiso;		
		this.isPermisoVerFormEstadoCuota=isPermiso;		
		this.isPermisoDuplicarEstadoCuota=isPermiso;
		this.isPermisoOrdenEstadoCuota=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoCuota(Boolean isPermiso) {
		//this.isPermisoTodoEstadoCuota=isPermiso;
		this.isPermisoNuevoEstadoCuota=isPermiso;
		this.isPermisoActualizarEstadoCuota=isPermiso;
		this.isPermisoActualizarOriginalEstadoCuota=isPermiso;
		this.isPermisoEliminarEstadoCuota=isPermiso;
		this.isPermisoGuardarCambiosEstadoCuota=isPermiso;
		//this.isPermisoConsultaEstadoCuota=isPermiso;
		//this.isPermisoBusquedaEstadoCuota=isPermiso;
		//this.isPermisoReporteEstadoCuota=isPermiso;
		//this.isPermisoOrdenEstadoCuota=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoCuota=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoCuota=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoCuota=isPermiso;		
		//this.isPermisoCopiarEstadoCuota=isPermiso;		
		//this.isPermisoDuplicarEstadoCuota=isPermiso;
		//this.isPermisoOrdenEstadoCuota=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoCuotaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CuotaConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoCuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCuota=false;
		this.isTienePermisosCuota=this.verificarGetPermisosUsuarioOpcionEstadoCuotaClaseRelacionada(this.opcionsRelacionadas,CuotaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoCuota(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoCuotaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCuota=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoCuotaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoCuotaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoCuotaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCuota && this.jInternalFrameDetalleFormEstadoCuota!=null && this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCuota.jTabbedPaneRelacionesEstadoCuota.remove(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoCuota() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoCuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoCuotaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoCuota=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoCuota=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoCuota=this.isPermisoActualizarEstadoCuota;
			this.isPermisoEliminarEstadoCuota=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoCuota=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoCuota=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoCuota=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoCuota=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoCuota=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoCuota=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoCuota=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoCuota=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoCuota=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoCuota=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoCuota=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoCuota=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoCuota=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoCuota.setToolTipText(this.jTableDatosEstadoCuota.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoCuota(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoCuota(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoCuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoCuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoCuota() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCuota && this.estadocuotaConstantesFunciones.mostrarCuotaEstadoCuota && !EstadoCuotaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cuota");
			reporte.setsDescripcion("Cuota");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyEstadoCuotaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoCuotaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoCuotaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoCuotaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoCuotaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoCuota()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoCuota()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoCuota(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoCuota()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoCuota();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoCuota(EstadoCuota estadocuota)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoCuota(EstadoCuota estadocuota,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoCuota()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoCuota()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoCuota()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoCuota()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoCuota()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoCuota()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoCuota(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoCuota()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoCuotaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoCuotaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoCuotaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadocuotaSessionBean=new EstadoCuotaSessionBean(); 
		this.estadocuotaConstantesFunciones=new EstadoCuotaConstantesFunciones(); 
		this.estadocuotaBean=new EstadoCuota();//(this.estadocuotaConstantesFunciones); 		
		this.estadocuotaReturnGeneral=new EstadoCuotaParameterReturnGeneral(); 
		
		this.estadocuotaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadocuotaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoCuotaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoCuotaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoCuotaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoCuota(true);
			
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
			
			this.estadocuotaConstantesFunciones=new EstadoCuotaConstantesFunciones(); 
			this.estadocuotaBean=new EstadoCuota();//this.estadocuotaConstantesFunciones); 			
			this.estadocuotaReturnGeneral=new EstadoCuotaParameterReturnGeneral(); 
		
			EstadoCuotaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Cuota Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadocuota=new EstadoCuota();
			this.estadocuotas = new ArrayList<EstadoCuota>();
			this.estadocuotasAux = new ArrayList<EstadoCuota>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic=new EstadoCuotaLogic();
				this.estadocuotaLogic.getNewConnexionToDeep("");
			}
			
			//this.estadocuotaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadocuotaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoCuota);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoCuota!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoCuota);	
					}
					
					if(this.jInternalFrameImportacionEstadoCuota!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoCuota);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoCuota!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoCuota);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoCuota);
				this.jInternalFrameDetalleFormEstadoCuota.setVisible(false);
				this.jInternalFrameDetalleFormEstadoCuota.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoCuota!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoCuota);
					this.jInternalFrameReporteDinamicoEstadoCuota.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoCuota.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoCuota!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoCuota);
					this.jInternalFrameImportacionEstadoCuota.setVisible(false);
					this.jInternalFrameImportacionEstadoCuota.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoCuota!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoCuota);
					this.jInternalFrameOrderByEstadoCuota.setVisible(false);
					this.jInternalFrameOrderByEstadoCuota.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoCuotaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoCuotaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadocuotaReturnGeneral=new EstadoCuotaParameterReturnGeneral();
			
			this.estadocuotaParameterGeneral=new EstadoCuotaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadocuotaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoCuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CuotaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoCuotaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadocuotaSessionBean.getEsGuardarRelacionado(),this.estadocuotaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoCuotaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadocuotaSessionBean.getEsGuardarRelacionado(),this.estadocuotaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoCuota=false;
			this.isVisibilidadCeldaDuplicarEstadoCuota=true;
			this.isVisibilidadCeldaCopiarEstadoCuota=true;
			this.isVisibilidadCeldaVerFormEstadoCuota=true;
			this.isVisibilidadCeldaOrdenEstadoCuota=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=false;
			this.isVisibilidadCeldaModificarEstadoCuota=false;
			this.isVisibilidadCeldaActualizarEstadoCuota=false;
			this.isVisibilidadCeldaEliminarEstadoCuota=false;
			this.isVisibilidadCeldaCancelarEstadoCuota=false;
			this.isVisibilidadCeldaGuardarEstadoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuota=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoCuota();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoCuota(false);
			
			this.setPermisosUsuarioEstadoCuota();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadocuotaSessionBean.getEsGuardarRelacionado() 
				|| (this.estadocuotaSessionBean.getEsGuardarRelacionado() && this.estadocuotaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoCuotaClasesRelacionadas();
			}
			
			if(this.estadocuotaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoCuotaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoCuotaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoCuota();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoCuota();
			}
			
			if(!this.isPermisoBusquedaEstadoCuota) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoCuota,this.isPermisoPaginacionMedioEstadoCuota,this.isPermisoPaginacionTodoEstadoCuota);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoCuotaConstantesFunciones.getTiposSeleccionarEstadoCuota());
				
				this.tiposColumnasSelect=EstadoCuotaConstantesFunciones.getTiposSeleccionarEstadoCuota(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoCuota();				
				//this.tiposRelacionesSelect=EstadoCuotaConstantesFunciones.getTiposRelacionesEstadoCuota(true);
				
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
			//if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoCuota();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoCuota(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoCuota(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCuota() ;
			
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
			
			
			this.cuotaLogic=new CuotaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadocuotaImplementable= (EstadoCuotaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoCuotaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadocuotaImplementableHome= (EstadoCuotaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoCuotaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadocuotas= new ArrayList<EstadoCuota>();
			this.estadocuotasEliminados= new ArrayList<EstadoCuota>();
						
			this.isEsNuevoEstadoCuota=false;
			this.esParaAccionDesdeFormularioEstadoCuota=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoCuota(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoCuota();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoCuotaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoCuotaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoCuota(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoCuota!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoCuota();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoCuota();
			}
			
			EstadoCuotaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoCuota(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoCuota: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoCuota() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CuotaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CuotaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoCuota")) {
				iIndex=this.jInternalFrameDetalleFormEstadoCuota.jTabbedPaneRelacionesEstadoCuota.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoCuota.jTabbedPaneRelacionesEstadoCuota.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();	
				
				

				if(sTitle.equals("Cuotas")) {
					if(!CuotaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoCuota();

						this.cargarParteTabPanelRelacionadaCuota(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoCuota();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCuota(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoCuota.cargarSessionConBeanSwingJInternalFrameCuota(false,true,iIndex);
		this.jButtonCuotaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCuota();

		//this.jTabbedPaneRelacionesEstadoCuota.updateUI();
		//this.jTabbedPaneRelacionesEstadoCuota.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoCuota.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cuota")) {
				int row=this.jTableDatosEstadoCuota.getSelectedRow();
				jButtonCuotaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cuota")) {

					if(this.isTienePermisosCuota && this.estadocuotaConstantesFunciones.mostrarCuotaEstadoCuota && !EstadoCuotaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cuotas"+"("+CuotaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cuotas");

						if(estadocuotaConstantesFunciones.resaltarCuotaEstadoCuota!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadocuotaConstantesFunciones.resaltarCuotaEstadoCuota);
						}

						jmenuItem.setEnabled(this.estadocuotaConstantesFunciones.activarCuotaEstadoCuota);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cuota"));

						

						this.jInternalFrameDetalleFormEstadoCuota.jmenuDetalleEstadoCuota.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoCuota(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoCuota(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoCuota(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoCuotaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoCuota();
		
		this.cargarCombosFrameForeignKeyEstadoCuota();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoCuota();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoCuota();
		}
	}
	
	
	
	public void jButtonNuevoEstadoCuotaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadocuotaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			
			
			if(jTableDatosEstadoCuota.getRowCount()>=1) {
				jTableDatosEstadoCuota.removeRowSelectionInterval(0, jTableDatosEstadoCuota.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoCuota=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoCuota(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoCuota(true);			
			//this.estadocuota=new EstadoCuota();
			//this.estadocuota.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoCuota(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCuota() ;
			
			if(EstadoCuotaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoCuota(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadocuota);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);				
			
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			
			if(this.estadocuotaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoCuota: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoCuotaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoCuota> estadocuotasSeleccionados=new ArrayList<EstadoCuota>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoCuota.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoCuota.getSelectedRows().length;			
			}
			
			estadocuotasSeleccionados=this.getEstadoCuotasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoCuota--;			
				//EstadoCuota estadocuotaAux= new EstadoCuota();			
				//estadocuotaAux.setId(this.iIdNuevoEstadoCuota);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoCuota estadocuotaOrigen=new EstadoCuota();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoCuota estadocuotaOrigen : estadocuotasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadocuotaOrigen =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadocuotaOrigen =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoCuota();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadocuota.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoCuota(estadocuotaOrigen,this.estadocuota,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(this.estadocuota);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadocuotaLogic.getEstadoCuotas().add(this.estadocuotaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadocuotas.add(this.estadocuotaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoCuota(false);
				
				this.jTableDatosEstadoCuota.setRowSelectionInterval(this.getIndiceNuevoEstadoCuota(), this.getIndiceNuevoEstadoCuota());
				
				int iLastRow =  this.jTableDatosEstadoCuota.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoCuota.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoCuota.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoCuota(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoCuota> estadocuotasSeleccionados=new ArrayList<EstadoCuota>();									
		
			EstadoCuota estadocuotaOrigen=new EstadoCuota();
			EstadoCuota estadocuotaDestino=new EstadoCuota();
				
			estadocuotasSeleccionados=this.getEstadoCuotasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoCuota.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadocuotasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoCuota.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocuotaOrigen =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadocuotaOrigen =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocuotaDestino =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadocuotaDestino =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadocuotaOrigen =estadocuotasSeleccionados.get(0);
				estadocuotaDestino =estadocuotasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoCuota(estadocuotaOrigen,estadocuotaDestino,true,false);
				
				estadocuotaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadocuotaDestino,estadocuotaLogic.getEstadoCuotas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocuotaDestino,estadocuotas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoCuota(false);
				
				//this.jTableDatosEstadoCuota.setRowSelectionInterval(this.getIndiceNuevoEstadoCuota(), this.getIndiceNuevoEstadoCuota());
				
				int iLastRow =  this.jTableDatosEstadoCuota.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoCuota.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoCuota.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoCuota(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoCuota.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoCuota.isVisible();
			
			
			this.jPanelParametrosReportesEstadoCuota.setVisible(!isVisible);
			this.jPanelPaginacionEstadoCuota.setVisible(!isVisible);
			this.jPanelAccionesEstadoCuota.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoCuota();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoCuota();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoCuota();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoCuota();
			
			this.abrirFrameOrderByEstadoCuota();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoCuota();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoCuota(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoCuota);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoCuota.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoCuota.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoCuota.setSize(this.jInternalFrameDetalleFormEstadoCuota.iWidthFormulario,this.jInternalFrameDetalleFormEstadoCuota.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoCuota.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoCuota.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoCuota.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoCuota.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoCuota.jContentPaneDetalleEstadoCuota.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoCuota.jTabbedPaneRelacionesEstadoCuota.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoCuota.jContentPaneDetalleEstadoCuota.getWidth(),EstadoCuotaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoCuota.jTabbedPaneRelacionesEstadoCuota.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoCuota.jContentPaneDetalleEstadoCuota.getWidth(),EstadoCuotaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoCuota.jTabbedPaneRelacionesEstadoCuota.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoCuota.jContentPaneDetalleEstadoCuota.getWidth(),EstadoCuotaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CuotaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCuota();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoCuota.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoCuota.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoCuota() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoCuota==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoCuota=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCuota,false,this);
				} else {
					this.jInternalFrameOrderByEstadoCuota=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCuota,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoCuota);
				this.jInternalFrameOrderByEstadoCuota.setVisible(false);
				this.jInternalFrameOrderByEstadoCuota.setSelected(false);
				
				this.jInternalFrameOrderByEstadoCuota.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoCuota"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoCuota();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoCuota() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoCuota==null) {
				
				this.jInternalFrameImportacionEstadoCuota=new ImportacionJInternalFrame(EstadoCuotaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoCuota);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoCuota);
				this.jInternalFrameImportacionEstadoCuota.setVisible(false);
				this.jInternalFrameImportacionEstadoCuota.setSelected(false);


				this.jInternalFrameImportacionEstadoCuota.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoCuota"));
				this.jInternalFrameImportacionEstadoCuota.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoCuota"));
				this.jInternalFrameImportacionEstadoCuota.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoCuota"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoCuota() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoCuota==null) {
				this.jInternalFrameReporteDinamicoEstadoCuota=new ReporteDinamicoJInternalFrame(EstadoCuotaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoCuota);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoCuota);
				this.jInternalFrameReporteDinamicoEstadoCuota.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoCuota.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoCuota.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoCuota"));
				this.jInternalFrameReporteDinamicoEstadoCuota.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoCuota"));
				this.jInternalFrameReporteDinamicoEstadoCuota.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoCuota"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoCuota();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCuota() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoCuota.jContentPaneDetalleEstadoCuota.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoCuota() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoCuota);
			
	       	this.jInternalFrameDetalleFormEstadoCuota.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoCuota.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoCuota.dispose();
			//this.jInternalFrameDetalleFormEstadoCuota=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoCuota() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoCuota.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoCuota.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoCuota() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoCuota.setVisible(true);
	        this.jInternalFrameImportacionEstadoCuota.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoCuota() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoCuota.setVisible(true);
	        this.jInternalFrameOrderByEstadoCuota.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoCuota() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoCuota.setVisible(false);
	        this.jInternalFrameOrderByEstadoCuota.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoCuota() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoCuota.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoCuota.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoCuota() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoCuota.setVisible(false);
	        this.jInternalFrameImportacionEstadoCuota.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoCuota(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoCuota(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoCuota(true);
			//this.isEsNuevoEstadoCuota=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuota =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocuota =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoCuota("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoCuota(false) ;
			
			if(estadocuotaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaSessionBean.getEsGuardarRelacionado() && CuotaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuotaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoCuotaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoCuota(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCuota(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoCuotaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuota =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuota =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoCuota(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoCuota(true);
			//this.isEsNuevoEstadoCuota=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuota =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocuota =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadocuota.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoCuota("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoCuota(false) ;
			
			if(EstadoCuotaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoCuota(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCuota(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoCuota(false);
			
			//if(!this.isEsNuevoEstadoCuota) {								
				int intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuota =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadocuota =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoCuota(this.estadocuota,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(this.estadocuota);
				
			}
			
			if(this.permiteMantenimiento(this.estadocuota)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoCuota=true;
					this.inicializarActualizarBindingTablaEstadoCuota(false);
					this.isEsNuevoEstadoCuota=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoCuota=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoCuota=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoCuota(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoCuota(false);
				
				this.habilitarDeshabilitarControlesEstadoCuota(false);
			
												
				
				if(EstadoCuotaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoCuota();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoCuotaActionPerformed(evt,estadocuotaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoCuota(this.estadocuota,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoCuota.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadocuotaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadocuota.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoCuota.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuota.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuota =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				this.estadocuota.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocuota =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				this.estadocuota.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadocuota)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoCuotaModel) this.jTableDatosEstadoCuota.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoCuota=true;
				this.inicializarActualizarBindingTablaEstadoCuota(false);
				this.isEsNuevoEstadoCuota=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoCuota(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoCuota(false);
				
				this.habilitarDeshabilitarControlesEstadoCuota(false);
				
				
				
				if(EstadoCuotaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoCuota();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoCuota.getRowCount()>=1) {
				jTableDatosEstadoCuota.removeRowSelectionInterval(0, jTableDatosEstadoCuota.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoCuota(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoCuota(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoCuota(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCuota(false) ;
			
			this.isEsNuevoEstadoCuota=false;
			
			if(EstadoCuotaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoCuota();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoCuota(false);
				
				//SI ES MANUAL
				if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoCuota();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoCuota--;			
			//EstadoCuota estadocuotaAux= new EstadoCuota();			
			//estadocuotaAux.setId(this.iIdNuevoEstadoCuota);
			
			if(this.jInternalFrameDetalleFormEstadoCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoCuota();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(this.estadocuota);
			
			this.estadocuota.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadocuotaLogic.getEstadoCuotas().add(this.estadocuotaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadocuotas.add(this.estadocuotaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoCuota(false);
			
			this.jTableDatosEstadoCuota.setRowSelectionInterval(this.getIndiceNuevoEstadoCuota(), this.getIndiceNuevoEstadoCuota());
			
			int iLastRow =  this.jTableDatosEstadoCuota.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoCuota.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoCuota.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoCuota(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoCuota(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCuota(false);
			
			//SI ES MANUAL
			if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoCuota();
			}
			
			//this.abrirFrameTreeEstadoCuota();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado CuotaS ?", "MANTENIMIENTO DE Estado Cuota", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoCuota.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoCuota();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadocuotaReturnGeneral=estadocuotaLogic.procesarImportacionEstadoCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadocuotaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoCuotaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoCuota.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoCuota.setFileImportacion(this.jInternalFrameImportacionEstadoCuota.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoCuota.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoCuota.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoCuota.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoCuota.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoCuota> estadocuotasSeleccionados=new ArrayList<EstadoCuota>();		

		estadocuotasSeleccionados=this.getEstadoCuotasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCuota.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCuota.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoCuotaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoCuotaBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoCuotas("Todos",estadocuotasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuota",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoCuota.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCuota.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoCuotaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoCuotaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoCuota.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoCuota.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoCuota.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoCuotaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoCuotaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoCuota.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoCuotaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoCuotaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoCuota.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCuota.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoCuotaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoCuotaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoCuota> estadocuotasSeleccionados=new ArrayList<EstadoCuota>();		
		
		estadocuotasSeleccionados=this.getEstadoCuotasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocuota";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoCuotas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoCuota.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCuota.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoCuotaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoCuotaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoCuota estadocuota:estadocuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadocuota.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoCuotaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoCuotaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoCuota estadocuota:estadocuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadocuota.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoCuota(row);				
			//	iRow++;
			//}				
			
			//for(EstadoCuota estadocuotaAux:estadocuotasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoCuota(estadocuotaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuota",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadocuotaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCuota(false);
			
			//SI ES MANUAL
			if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoCuota();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCuota(false);
			
			//SI ES MANUAL
			if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoCuota();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCuota(false);
			
			//SI ES MANUAL
			if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoCuota();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuotaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoCuota() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoCuota.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoCuota.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoCuota.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoCuota.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoCuota.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoCuota.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoCuota.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoCuota(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoCuota(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoCuota(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoCuota(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoCuota(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoCuota(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCuota(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoCuota(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoCuotaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoCuota() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoCuota();
		
		this.inicializarActualizarBindingBotonesManualEstadoCuota(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoCuota();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCuota() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoCuota(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoCuota(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoCuota.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoCuota.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoCuota.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoCuota.jCheckBoxPostAccionNuevoEstadoCuota.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoCuota.jCheckBoxPostAccionSinCerrarEstadoCuota.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoCuota.jCheckBoxPostAccionSinMensajeEstadoCuota.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoCuota.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoCuota.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoCuota.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
				this.jInternalFrameDetalleFormEstadoCuota.jCheckBoxPostAccionNuevoEstadoCuota.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoCuota.jCheckBoxPostAccionSinCerrarEstadoCuota.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoCuota.jCheckBoxPostAccionSinMensajeEstadoCuota.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoCuota.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoCuota.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoCuota.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoCuota!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCuota.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoCuota.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoCuota.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoCuota.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoCuota.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoCuota!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCuota.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoCuota.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoCuota.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoCuota(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoCuota(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCuota() throws Exception {
		try	{
			if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoCuota();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoCuota() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoCuota() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoCuota.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoCuota.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoCuota.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoCuota.addItem(reporte);
			}
			
			
			if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoCuota.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoCuota.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoCuota.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoCuota.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoCuota.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoCuota.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoCuota();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoCuota() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoCuota!=null) {
				this.jInternalFrameReporteDinamicoEstadoCuota.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoCuota.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoCuota!=null) {
				this.jInternalFrameReporteDinamicoEstadoCuota.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoCuota.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoCuota!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoCuota.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoCuota.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoCuota.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoCuota.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoCuota.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoCuota.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoCuota()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoCuota(Boolean esInicializar) throws Exception {				
		if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoCuota();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoCuota() throws Exception {
		this.inicializarActualizarBindingTablaEstadoCuota(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoCuota() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoCuota.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoCuota.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoCuota.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoCuotaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoCuota.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoCuota.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoCuotaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoCuotaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuotaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoCuotaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoCuota.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoCuota.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoCuotaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoCuota.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoCuota(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadocuotaLogic.getEstadoCuotas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadocuotas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoCuota.setModel(new EstadoCuotaModel(this.estadocuotaLogic.getEstadoCuotas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoCuota.setModel(new EstadoCuotaModel(this.estadocuotas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoCuota!=null && this.jInternalFrameOrderByEstadoCuota.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoCuota();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuota,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoCuotaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO,estadocuotaConstantesFunciones.resaltarSeleccionarEstadoCuota,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO,estadocuotaConstantesFunciones.resaltarSeleccionarEstadoCuota,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuota,EstadoCuotaConstantesFunciones.LABEL_ID));

		if(this.estadocuotaConstantesFunciones.mostraridEstadoCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoCuotaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadocuotaConstantesFunciones.resaltaridEstadoCuota,this.estadocuotaConstantesFunciones.activaridEstadoCuota,this,true,"idEstadoCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadocuotaConstantesFunciones.resaltaridEstadoCuota,this.estadocuotaConstantesFunciones.activaridEstadoCuota,this,true,"idEstadoCuota","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuota,EstadoCuotaConstantesFunciones.LABEL_CODIGO));

		if(this.estadocuotaConstantesFunciones.mostrarcodigoEstadoCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoCuotaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadocuotaConstantesFunciones.resaltarcodigoEstadoCuota,this.estadocuotaConstantesFunciones.activarcodigoEstadoCuota,this,true,"codigoEstadoCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadocuotaConstantesFunciones.resaltarcodigoEstadoCuota,this.estadocuotaConstantesFunciones.activarcodigoEstadoCuota,this,true,"codigoEstadoCuota","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoCuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuota,EstadoCuotaConstantesFunciones.LABEL_NOMBRE));

		if(this.estadocuotaConstantesFunciones.mostrarnombreEstadoCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoCuotaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadocuotaConstantesFunciones.resaltarnombreEstadoCuota,this.estadocuotaConstantesFunciones.activarnombreEstadoCuota,this,true,"nombreEstadoCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadocuotaConstantesFunciones.resaltarnombreEstadoCuota,this.estadocuotaConstantesFunciones.activarnombreEstadoCuota,this,true,"nombreEstadoCuota","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoCuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCuota && this.estadocuotaConstantesFunciones.mostrarCuotaEstadoCuota && !EstadoCuotaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cuotas");
				tableColumn.setHeaderValue("Cuotas");
				tableColumn.setCellRenderer(new CuotaTableCell(estadocuotaConstantesFunciones.resaltarCuotaEstadoCuota,this,this.estadocuotaConstantesFunciones.activarCuotaEstadoCuota));
				tableColumn.setCellEditor(new CuotaTableCell(estadocuotaConstantesFunciones.resaltarCuotaEstadoCuota,this,this.estadocuotaConstantesFunciones.activarCuotaEstadoCuota));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoCuota.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadocuotaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadocuotaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoCuota.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadocuotaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadocuotaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoCuota.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoCuota && this.isPermisoGuardarCambiosEstadoCuota) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadocuotaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadocuotaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoCuota.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadocuotaSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosEstadoCuota.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoCuota.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoCuota && this.isPermisoGuardarCambiosEstadoCuota) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadocuotaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoCuota && this.isPermisoGuardarCambiosEstadoCuota) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoCuota.moveColumn(this.jTableDatosEstadoCuota.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoCuota.moveColumn(this.jTableDatosEstadoCuota.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadocuotaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoCuota.moveColumn(this.jTableDatosEstadoCuota.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoCuota.moveColumn(this.jTableDatosEstadoCuota.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoCuota.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoCuota.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoCuota,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoCuota.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoCuota.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoCuota.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoCuota.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoCuota.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadocuotaLogic.getEstadoCuotas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadocuotas.size()-1;
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
		//this.jTableDatosEstadoCuota.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoCuota();
			
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
				
				//this.isEsNuevoEstadoCuota=false;
					
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			
				if(this.estadocuotaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoCuota==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoCuota.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoCuota.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuota =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuota =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadocuota.getsType().equals("DUPLICADO")
				   || this.estadocuota.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoCuota=true;
				
				} else {
					this.isEsNuevoEstadoCuota=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
					if(this.estadocuota.getId()>=0 && !this.estadocuota.getIsNew()) {						
						this.isEsNuevoEstadoCuota=false;
						
					} else {
						this.isEsNuevoEstadoCuota=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoCuota(esRelaciones);						
				
				this.seleccionarEstadoCuota(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadocuota.getId()<0) {
					this.isEsNuevoEstadoCuota=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoCuota(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoCuota(evt,rowIndex);
				}	
				
				if(this.estadocuotaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoCuota: " + this.dDif); 
					}
				}								
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoCuota(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadocuota)) {
					if(this.estadocuota.getId()>0) {
						this.estadocuota.setIsDeleted(true);
						
						this.estadocuotasEliminados.add(this.estadocuota);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadocuotaLogic.getEstadoCuotas().remove(this.estadocuota);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadocuotas.remove(this.estadocuota);				
					}
					
					
					((EstadoCuotaModel) this.jTableDatosEstadoCuota.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoCuota(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoCuota(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoCuota) {
			
			if(this.jInternalFrameDetalleFormEstadoCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoCuota.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoCuota.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuota =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuota =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoCuota(this.estadocuota);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoCuota("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoCuota(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoCuota() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoCuota(EstadoCuota estadocuota) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoCuota(estadocuota,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoCuota(EstadoCuota estadocuota,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoCuota(estadocuota);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoCuota(estadocuota,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoCuota(estadocuota);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoCuota(EstadoCuota estadocuota) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoCuota.jTextFieldidEstadoCuota.setText(estadocuota.getId().toString());
			this.jInternalFrameDetalleFormEstadoCuota.jTextFieldcodigoEstadoCuota.setText(estadocuota.getcodigo());
			this.jInternalFrameDetalleFormEstadoCuota.jTextAreanombreEstadoCuota.setText(estadocuota.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoCuota estadocuotaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadocuotaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoCuota estadocuotaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadocuotaLocal=this.estadocuota;
			} else {
				estadocuotaLocal=this.estadocuotaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadocuotaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoCuota(estadocuotaLocal,true);
					
					if(estadocuotaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadocuotaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadocuotaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoCuota(EstadoCuota estadocuota,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoCuota(estadocuota,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(estadocuota);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoCuota(EstadoCuota estadocuota,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoCuota(estadocuota,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoCuota(EstadoCuota estadocuota,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoCuota.jTextFieldidEstadoCuota.getText()==null || this.jInternalFrameDetalleFormEstadoCuota.jTextFieldidEstadoCuota.getText()=="" || this.jInternalFrameDetalleFormEstadoCuota.jTextFieldidEstadoCuota.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoCuota.jTextFieldidEstadoCuota.setText("0");
			}

			if(conColumnasBase) {estadocuota.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoCuota.jTextFieldidEstadoCuota.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoCuotaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCuota.jLabelIdEstadoCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadocuota.setcodigo(this.jInternalFrameDetalleFormEstadoCuota.jTextFieldcodigoEstadoCuota.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoCuotaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCuota.jLabelcodigoEstadoCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadocuota.setnombre(this.jInternalFrameDetalleFormEstadoCuota.jTextAreanombreEstadoCuota.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoCuotaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCuota.jLabelnombreEstadoCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoCuota(EstadoCuota estadocuotaBean,EstadoCuota estadocuota,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoCuota(EstadoCuota estadocuotaOrigen,EstadoCuota estadocuota,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadocuotaOrigen.getId()!=null && !estadocuotaOrigen.getId().equals(0L))) {estadocuota.setId(estadocuotaOrigen.getId());}}
			if(conDefault || (!conDefault && estadocuotaOrigen.getcodigo()!=null && !estadocuotaOrigen.getcodigo().equals(""))) {estadocuota.setcodigo(estadocuotaOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadocuotaOrigen.getnombre()!=null && !estadocuotaOrigen.getnombre().equals(""))) {estadocuota.setnombre(estadocuotaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoCuota(EstadoCuota estadocuota) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoCuota.jTextFieldidEstadoCuota.setText(estadocuota.getId().toString());
			this.jInternalFrameDetalleFormEstadoCuota.jTextFieldcodigoEstadoCuota.setText(estadocuota.getcodigo());
			this.jInternalFrameDetalleFormEstadoCuota.jTextAreanombreEstadoCuota.setText(estadocuota.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoCuota(EstadoCuotaBean estadocuotaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoCuota.jTextFieldidEstadoCuota.setText(estadocuotaBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoCuota.jTextFieldcodigoEstadoCuota.setText(estadocuotaBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoCuota.jTextAreanombreEstadoCuota.setText(estadocuotaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoCuota(EstadoCuotaParameterReturnGeneral estadocuotaReturnGeneral,EstadoCuotaBean estadocuotaBean,Boolean conDefault) throws Exception { 
		try {
			EstadoCuota estadocuotaLocal=new EstadoCuota();
			
			estadocuotaLocal=estadocuotaReturnGeneral.getEstadoCuota();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadocuotaLocal.getId()!=null && !estadocuotaLocal.getId().equals(0L))) {estadocuotaBean.setId(estadocuotaLocal.getId());}}
			if(conDefault || (!conDefault && estadocuotaLocal.getcodigo()!=null && !estadocuotaLocal.getcodigo().equals(""))) {estadocuotaBean.setcodigo(estadocuotaLocal.getcodigo());}
			if(conDefault || (!conDefault && estadocuotaLocal.getnombre()!=null && !estadocuotaLocal.getnombre().equals(""))) {estadocuotaBean.setnombre(estadocuotaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoCuotaGenerico(Long idEstadoCuotaSeleccionado,JComboBox jComboBoxEstadoCuota,List<EstadoCuota> estadocuotasLocal)throws Exception {
		try {
			EstadoCuota  estadocuotaTemp=null;

			for(EstadoCuota estadocuotaAux:estadocuotasLocal) {
				if(estadocuotaAux.getId()!=null && estadocuotaAux.getId().equals(idEstadoCuotaSeleccionado)) {
					estadocuotaTemp=estadocuotaAux;
					break;
				}
			}

			jComboBoxEstadoCuota.setSelectedItem(estadocuotaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoCuotaGenerico(JComboBox jComboBoxEstadoCuota,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoCuota.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoCuota.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoCuota.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoCuota.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Cuota")) {
			jButtonCuotaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadocuota=(EstadoCuota) estadocuotaLogic.getEstadoCuotas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadocuota =(EstadoCuota) estadocuotas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoCuota estadocuotaRow=new EstadoCuota();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadocuotaRow=(EstadoCuota) estadocuotaLogic.getEstadoCuotas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadocuotaRow=(EstadoCuota) estadocuotas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCuotaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoCuota estadocuota) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoCuota==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocuota = (EstadoCuota)this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadocuota = (EstadoCuota)this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadocuota!=null) {
						this.estadocuota = estadocuota;
					} else {
						this.estadocuota = new EstadoCuota();
					}
				}

				if(this.isTienePermisosCuota && this.permiteMantenimiento(this.estadocuota)) {
					CuotaBeanSwingJInternalFrame cuotaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFramePopup=new CuotaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cuotaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFramePopup;
					} else {
						cuotaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame;
					}

					List<EstadoCuota> estadocuotas=new ArrayList<EstadoCuota>();
					estadocuotas.add(this.estadocuota);
					if(!esRelacionado) {
						//cuotaBeanSwingJInternalFrame.cuotaSessionBean.setConGuardarRelaciones(false);
						//cuotaBeanSwingJInternalFrame.cuotaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cuotaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoCuota.cargarCuotaBeanSwingJInternalFrame(estadocuotas,this.estadocuota,cuotaBeanSwingJInternalFrame,/*conInicializar,*/cuotaBeanSwingJInternalFrame.cuotaSessionBean.getConGuardarRelaciones(),cuotaBeanSwingJInternalFrame.cuotaSessionBean.getEsGuardarRelacionado());
					cuotaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cuotaBeanSwingJInternalFrame.actualizarEstadoPanelsCuota("no_relacionado");

						cuotaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CuotaConstantesFunciones.ITAMANIOFILATABLA + (CuotaConstantesFunciones.ITAMANIOFILATABLA/2));

						cuotaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoCuota=(TitledBorder)this.jScrollPanelDatosEstadoCuota.getBorder();
						TitledBorder titledBorderCuota=(TitledBorder)cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.getBorder();

						titledBorderCuota.setTitle(titledBorderEstadoCuota.getTitle() + " -> Cuota");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuotaBeanSwingJInternalFrame);
						}

						cuotaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cuotaBeanSwingJInternalFrame);

						cuotaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadocuotaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cuota",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoCuota(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoCuota.setVisible((this.isVisibilidadCeldaNuevoEstadoCuota && this.isPermisoNuevoEstadoCuota));			
			this.jButtonDuplicarEstadoCuota.setVisible((this.isVisibilidadCeldaDuplicarEstadoCuota && this.isPermisoDuplicarEstadoCuota));			
			this.jButtonCopiarEstadoCuota.setVisible((this.isVisibilidadCeldaCopiarEstadoCuota && this.isPermisoCopiarEstadoCuota));
			this.jButtonVerFormEstadoCuota.setVisible((this.isVisibilidadCeldaVerFormEstadoCuota && this.isPermisoVerFormEstadoCuota));
			
			this.jButtonAbrirOrderByEstadoCuota.setVisible((this.isVisibilidadCeldaOrdenEstadoCuota && this.isPermisoOrdenEstadoCuota));			
			
			this.jButtonNuevoRelacionesEstadoCuota.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoCuota && this.isPermisoNuevoEstadoCuota));			
			this.jButtonNuevoGuardarCambiosEstadoCuota.setVisible((this.isVisibilidadCeldaNuevoEstadoCuota && this.isPermisoNuevoEstadoCuota && this.isPermisoGuardarCambiosEstadoCuota));
			
			if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
			this.jInternalFrameDetalleFormEstadoCuota.jButtonModificarEstadoCuota.setVisible((this.isVisibilidadCeldaModificarEstadoCuota && this.isPermisoActualizarEstadoCuota));	
			this.jInternalFrameDetalleFormEstadoCuota.jButtonActualizarEstadoCuota.setVisible((this.isVisibilidadCeldaActualizarEstadoCuota && this.isPermisoActualizarEstadoCuota));	
			this.jInternalFrameDetalleFormEstadoCuota.jButtonEliminarEstadoCuota.setVisible((this.isVisibilidadCeldaEliminarEstadoCuota && this.isPermisoEliminarEstadoCuota));
			this.jInternalFrameDetalleFormEstadoCuota.jButtonCancelarEstadoCuota.setVisible(this.isVisibilidadCeldaCancelarEstadoCuota);							
			this.jInternalFrameDetalleFormEstadoCuota.jButtonGuardarCambiosEstadoCuota.setVisible((this.isVisibilidadCeldaGuardarEstadoCuota && this.isPermisoGuardarCambiosEstadoCuota));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoCuota.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoCuota && this.isPermisoGuardarCambiosEstadoCuota));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoCuota.setVisible((this.isVisibilidadCeldaNuevoEstadoCuota && this.isPermisoNuevoEstadoCuota));						
			this.jButtonDuplicarToolBarEstadoCuota.setVisible((this.isVisibilidadCeldaDuplicarEstadoCuota && this.isPermisoDuplicarEstadoCuota));						
			this.jButtonCopiarToolBarEstadoCuota.setVisible((this.isVisibilidadCeldaCopiarEstadoCuota && this.isPermisoCopiarEstadoCuota));			
			this.jButtonVerFormToolBarEstadoCuota.setVisible((this.isVisibilidadCeldaVerFormEstadoCuota && this.isPermisoVerFormEstadoCuota));			
			this.jButtonAbrirOrderByToolBarEstadoCuota.setVisible((this.isVisibilidadCeldaOrdenEstadoCuota && this.isPermisoOrdenEstadoCuota));
			this.jButtonNuevoRelacionesToolBarEstadoCuota.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoCuota && this.isPermisoNuevoEstadoCuota));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoCuota.setVisible((this.isVisibilidadCeldaNuevoEstadoCuota && this.isPermisoNuevoEstadoCuota && this.isPermisoGuardarCambiosEstadoCuota));			
			
			if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
			this.jInternalFrameDetalleFormEstadoCuota.jButtonModificarToolBarEstadoCuota.setVisible((this.isVisibilidadCeldaModificarEstadoCuota && this.isPermisoActualizarEstadoCuota));	
			this.jInternalFrameDetalleFormEstadoCuota.jButtonActualizarToolBarEstadoCuota.setVisible((this.isVisibilidadCeldaActualizarEstadoCuota  && this.isPermisoActualizarEstadoCuota));	
			this.jInternalFrameDetalleFormEstadoCuota.jButtonEliminarToolBarEstadoCuota.setVisible((this.isVisibilidadCeldaEliminarEstadoCuota && this.isPermisoEliminarEstadoCuota));
			this.jInternalFrameDetalleFormEstadoCuota.jButtonCancelarToolBarEstadoCuota.setVisible(this.isVisibilidadCeldaCancelarEstadoCuota);				
			this.jInternalFrameDetalleFormEstadoCuota.jButtonGuardarCambiosToolBarEstadoCuota.setVisible((this.isVisibilidadCeldaGuardarEstadoCuota && this.isPermisoGuardarCambiosEstadoCuota));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoCuota.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoCuota && this.isPermisoGuardarCambiosEstadoCuota));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoCuota.setVisible((this.isVisibilidadCeldaNuevoEstadoCuota && this.isPermisoNuevoEstadoCuota));			
			this.jMenuItemDuplicarEstadoCuota.setVisible((this.isVisibilidadCeldaDuplicarEstadoCuota && this.isPermisoDuplicarEstadoCuota));			
			this.jMenuItemCopiarEstadoCuota.setVisible((this.isVisibilidadCeldaCopiarEstadoCuota && this.isPermisoCopiarEstadoCuota));			
			this.jMenuItemVerFormEstadoCuota.setVisible((this.isVisibilidadCeldaVerFormEstadoCuota && this.isPermisoVerFormEstadoCuota));			
			this.jMenuItemAbrirOrderByEstadoCuota.setVisible((this.isVisibilidadCeldaOrdenEstadoCuota && this.isPermisoOrdenEstadoCuota));			
			//this.jMenuItemMostrarOcultarEstadoCuota.setVisible((this.isVisibilidadCeldaOrdenEstadoCuota && this.isPermisoOrdenEstadoCuota));
			this.jMenuItemDetalleAbrirOrderByEstadoCuota.setVisible((this.isVisibilidadCeldaOrdenEstadoCuota && this.isPermisoOrdenEstadoCuota));			
			//this.jMenuItemDetalleMostrarOcultarEstadoCuota.setVisible((this.isVisibilidadCeldaOrdenEstadoCuota && this.isPermisoOrdenEstadoCuota));			
			this.jMenuItemNuevoRelacionesEstadoCuota.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoCuota && this.isPermisoNuevoEstadoCuota));			
			this.jMenuItemNuevoGuardarCambiosEstadoCuota.setVisible((this.isVisibilidadCeldaNuevoEstadoCuota && this.isPermisoNuevoEstadoCuota && this.isPermisoGuardarCambiosEstadoCuota));									
			
			if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
			this.jInternalFrameDetalleFormEstadoCuota.jMenuItemModificarEstadoCuota.setVisible((this.isVisibilidadCeldaModificarEstadoCuota && this.isPermisoActualizarEstadoCuota));	
			this.jInternalFrameDetalleFormEstadoCuota.jMenuItemActualizarEstadoCuota.setVisible((this.isVisibilidadCeldaActualizarEstadoCuota && this.isPermisoActualizarEstadoCuota));	
			this.jInternalFrameDetalleFormEstadoCuota.jMenuItemEliminarEstadoCuota.setVisible((this.isVisibilidadCeldaEliminarEstadoCuota && this.isPermisoEliminarEstadoCuota));
			this.jInternalFrameDetalleFormEstadoCuota.jMenuItemCancelarEstadoCuota.setVisible(this.isVisibilidadCeldaCancelarEstadoCuota);				
			}
			
			this.jMenuItemGuardarCambiosEstadoCuota.setVisible((this.isVisibilidadCeldaGuardarEstadoCuota && this.isPermisoGuardarCambiosEstadoCuota));						
			this.jMenuItemGuardarCambiosTablaEstadoCuota.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoCuota && this.isPermisoGuardarCambiosEstadoCuota));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoCuota=this.jButtonNuevoEstadoCuota.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoCuota=this.jButtonDuplicarEstadoCuota.isVisible();
			this.isVisibilidadCeldaCopiarEstadoCuota=this.jButtonCopiarEstadoCuota.isVisible();
			this.isVisibilidadCeldaVerFormEstadoCuota=this.jButtonVerFormEstadoCuota.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoCuota=this.jButtonAbrirOrderByEstadoCuota.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=this.jButtonNuevoRelacionesEstadoCuota.isVisible();
			this.isVisibilidadCeldaModificarEstadoCuota=this.jButtonModificarEstadoCuota.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
			this.isVisibilidadCeldaActualizarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jButtonActualizarEstadoCuota.isVisible();
			this.isVisibilidadCeldaEliminarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jButtonEliminarEstadoCuota.isVisible();
			this.isVisibilidadCeldaCancelarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jButtonCancelarEstadoCuota.isVisible();
			this.isVisibilidadCeldaGuardarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jButtonGuardarCambiosEstadoCuota.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoCuota=this.jButtonGuardarCambiosTablaEstadoCuota.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoCuota=this.jButtonNuevoToolBarEstadoCuota.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=this.jButtonNuevoRelacionesToolBarEstadoCuota.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
			this.isVisibilidadCeldaModificarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jButtonModificarToolBarEstadoCuota.isVisible();
			this.isVisibilidadCeldaActualizarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jButtonActualizarToolBarEstadoCuota.isVisible();
			this.isVisibilidadCeldaEliminarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jButtonEliminarToolBarEstadoCuota.isVisible();
			this.isVisibilidadCeldaCancelarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jButtonCancelarToolBarEstadoCuota.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoCuota=this.jButtonGuardarCambiosToolBarEstadoCuota.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoCuota=this.jButtonGuardarCambiosTablaToolBarEstadoCuota.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoCuota=this.jMenuItemNuevoEstadoCuota.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=this.jMenuItemNuevoRelacionesEstadoCuota.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
			this.isVisibilidadCeldaModificarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jMenuItemModificarEstadoCuota.isVisible();
			this.isVisibilidadCeldaActualizarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jMenuItemActualizarEstadoCuota.isVisible();
			this.isVisibilidadCeldaEliminarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jMenuItemEliminarEstadoCuota.isVisible();
			this.isVisibilidadCeldaCancelarEstadoCuota=this.jInternalFrameDetalleFormEstadoCuota.jMenuItemCancelarEstadoCuota.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoCuota=this.jMenuItemGuardarCambiosEstadoCuota.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoCuota=this.jMenuItemGuardarCambiosTablaEstadoCuota.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoCuota(Boolean esInicializar) {
		if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadocuotaSessionBean.getConGuardarRelaciones()) {
				//if(this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoCuota();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoCuota(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoCuota() {
		this.jButtonNuevoEstadoCuota.setVisible(this.isPermisoNuevoEstadoCuota);			
		this.jButtonDuplicarEstadoCuota.setVisible(this.isPermisoDuplicarEstadoCuota);			
		this.jButtonCopiarEstadoCuota.setVisible(this.isPermisoCopiarEstadoCuota);			
		this.jButtonVerFormEstadoCuota.setVisible(this.isPermisoVerFormEstadoCuota);			
		
		this.jButtonAbrirOrderByEstadoCuota.setVisible(this.isPermisoOrdenEstadoCuota);					
		
		this.jButtonNuevoRelacionesEstadoCuota.setVisible(this.isPermisoNuevoEstadoCuota);			
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuota.jButtonModificarEstadoCuota.setVisible(this.isPermisoActualizarEstadoCuota);	
			this.jInternalFrameDetalleFormEstadoCuota.jButtonActualizarEstadoCuota.setVisible(this.isPermisoActualizarEstadoCuota);	
			this.jInternalFrameDetalleFormEstadoCuota.jButtonEliminarEstadoCuota.setVisible(this.isPermisoEliminarEstadoCuota);
			this.jInternalFrameDetalleFormEstadoCuota.jButtonCancelarEstadoCuota.setVisible(this.isVisibilidadCeldaCancelarEstadoCuota);						
			this.jInternalFrameDetalleFormEstadoCuota.jButtonGuardarCambiosEstadoCuota.setVisible(this.isPermisoGuardarCambiosEstadoCuota);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoCuota.setVisible(this.isPermisoActualizarEstadoCuota);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoCuota() {
		this.jInternalFrameDetalleFormEstadoCuota.jButtonModificarEstadoCuota.setVisible(this.isPermisoActualizarEstadoCuota);	
		this.jInternalFrameDetalleFormEstadoCuota.jButtonActualizarEstadoCuota.setVisible(this.isPermisoActualizarEstadoCuota);	
		this.jInternalFrameDetalleFormEstadoCuota.jButtonEliminarEstadoCuota.setVisible(this.isPermisoEliminarEstadoCuota);
		this.jInternalFrameDetalleFormEstadoCuota.jButtonCancelarEstadoCuota.setVisible(this.isVisibilidadCeldaCancelarEstadoCuota);							
		this.jInternalFrameDetalleFormEstadoCuota.jButtonGuardarCambiosEstadoCuota.setVisible((this.isVisibilidadCeldaGuardarEstadoCuota && this.isPermisoGuardarCambiosEstadoCuota));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoCuota() {
		if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoCuota();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoCuota() {
	}
	
	public void jTableDatosEstadoCuotaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoCuota(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoCuota(this.getestadocuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(this.estadocuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocuota =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocuota =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocuota==null) {
						this.estadocuota = new EstadoCuota();
					}

					this.setVariablesFormularioToObjetoActualEstadoCuota(this.estadocuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(this.estadocuota);
				}

				if(this.estadocuota.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadocuota.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoCuota(this.getestadocuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(this.estadocuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocuota =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocuota =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocuota==null) {
						this.estadocuota = new EstadoCuota();
					}

					this.setVariablesFormularioToObjetoActualEstadoCuota(this.estadocuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(this.estadocuota);
				}

				if(this.estadocuota.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadocuota.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoCuota(this.getestadocuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(this.estadocuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocuota =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocuota =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocuota==null) {
						this.estadocuota = new EstadoCuota();
					}

					this.setVariablesFormularioToObjetoActualEstadoCuota(this.estadocuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(this.estadocuota);
				}

				if(this.estadocuota.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadocuota.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoCuota() {
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
			this.jInternalFrameDetalleFormEstadoCuota.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoCuota.dispose();
			this.jInternalFrameDetalleFormEstadoCuota=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoCuota!=null) {
			this.jInternalFrameReporteDinamicoEstadoCuota.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoCuota.dispose();
			this.jInternalFrameReporteDinamicoEstadoCuota=null;
		}
		
		if(this.jInternalFrameImportacionEstadoCuota!=null) {
			this.jInternalFrameImportacionEstadoCuota.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoCuota.dispose();
			this.jInternalFrameImportacionEstadoCuota=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoCuota();
			
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoCuota")) {
				jButtonNuevoEstadoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoCuota")) {
				jButtonDuplicarEstadoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoCuota")) {
				jButtonCopiarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoCuota")) {
				jButtonVerFormEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoCuota")) {
				jButtonNuevoEstadoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoCuota")) {
				jButtonDuplicarEstadoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoCuota")) {
				jButtonNuevoEstadoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoCuota")) {
				jButtonDuplicarEstadoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoCuota")) {
				jButtonNuevoEstadoCuotaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoCuota")) {
				jButtonNuevoEstadoCuotaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoCuota")) {
				jButtonNuevoEstadoCuotaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoCuota")) {
				jButtonModificarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoCuota")) {
				jButtonModificarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoCuota")) {
				jButtonModificarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoCuota")) {
				jButtonActualizarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoCuota")) {
				jButtonActualizarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoCuota")) {
				jButtonActualizarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoCuota")) {
				jButtonEliminarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoCuota")) {
				jButtonEliminarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoCuota")) {
				jButtonEliminarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoCuota")) {
				jButtonCancelarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoCuota")) {
				jButtonCancelarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoCuota")) {
				jButtonCancelarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoCuota")) {
				jButtonCerrarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoCuota")) {
				jButtonCerrarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoCuota")) {
				jButtonCerrarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoCuota")) {
				jButtonMostrarOcultarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoCuota")) {
				jButtonCancelarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoCuota")) {
				jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoCuota")) {
				jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoCuota")) {
				jButtonCopiarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoCuota")) {
				jButtonVerFormEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoCuota")) {
				jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoCuota")) {
				jButtonCopiarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoCuota")) {
				jButtonVerFormEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoCuota")) {
				jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoCuota")) {
				jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoCuota")) {
				jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoCuota")) {
				jButtonRecargarInformacionEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoCuota")) {
				jButtonRecargarInformacionEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoCuota")) {
				jButtonRecargarInformacionEstadoCuotaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoCuota")) {
				jButtonAnterioresEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoCuota")) {
				jButtonAnterioresEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoCuota")) {
				jButtonAnterioresEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoCuota")) {
				jButtonSiguientesEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoCuota")) {
				jButtonSiguientesEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoCuota")) {
				jButtonSiguientesEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoCuota") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoCuota")) {
				jButtonAbrirOrderByEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoCuota") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoCuota")) {
				jButtonMostrarOcultarEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoCuota")) {
				jButtonNuevoGuardarCambiosEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoCuota")) {
				jButtonNuevoGuardarCambiosEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoCuota")) {
				jButtonNuevoGuardarCambiosEstadoCuotaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoCuota")) {
				jButtonCerrarReporteDinamicoEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoCuota")) {
				jButtonGenerarReporteDinamicoEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoCuota")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoCuota")) {
				jButtonCerrarImportacionEstadoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoCuota")) {
				
				jButtonGenerarImportacionEstadoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoCuota")) {
				
				jButtonAbrirImportacionEstadoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoCuota")) {
				jComboBoxTiposAccionesEstadoCuotaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoCuota")) {
				jComboBoxTiposRelacionesEstadoCuotaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoCuota")) {
				jComboBoxTiposAccionesEstadoCuotaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoCuota")) {
				
				jComboBoxTiposSeleccionarEstadoCuotaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoCuota")) {
				jTextFieldValorCampoGeneralEstadoCuotaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoCuota")) {
				jButtonAbrirOrderByEstadoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoCuota")) {
				jButtonAbrirOrderByEstadoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoCuota")) {
				jButtonCerrarOrderByEstadoCuotaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoCuotaBusqueda")) {
				this.jButtonidEstadoCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoCuotaBusqueda")) {
				this.jButtoncodigoEstadoCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoCuotaBusqueda")) {
				this.jButtonnombreEstadoCuotaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoCuota();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCuotaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
				


				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoCuota estadocuotaLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadocuotaLocal=this.estadocuota;
			} else {
				estadocuotaLocal=this.estadocuotaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
							
				
				


				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaAnterior =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuotaAnterior =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
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
			
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			
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
			
			


			
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCuotaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
								
						
				


				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuota.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
								
				
				


				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaAnterior =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuotaAnterior =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaAnterior =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuotaAnterior =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuotaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
							
				
				


				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuota.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCuotaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocuotaAnterior =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadocuotaAnterior =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
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
			
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			
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
			
			


			
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuotaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
								
				
				


				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaAnterior =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuotaAnterior =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuotaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCuotaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoCuota")) {
					jCheckBoxSeleccionarTodosEstadoCuotaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoCuota")) {
					jCheckBoxSeleccionadosEstadoCuotaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoCuota")) {
					
				}
				
				


				
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
												
				
				


				
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCuotaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocuotaAnterior =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadocuotaAnterior =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCuotaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
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
			
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
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
			
			


			
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCuotaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuota.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuota.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuota);
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
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
				
				


				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuota.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuotaAnterior =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuotaAnterior =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoCuota")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoCuotaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoCuota.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadocuota =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadocuota =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadocuota);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoCuota")) {
				
				}
				
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoCuota")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoCuota.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoCuota")) {
			
			}
			
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoCuota();
			
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoCuota")) {
				jButtonNuevoEstadoCuotaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoCuota")) {
				jButtonDuplicarEstadoCuotaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoCuota")) {
				jButtonCopiarEstadoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoCuota")) {
				jButtonVerFormEstadoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoCuota")) {
				jButtonNuevoEstadoCuotaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoCuota")) {
				jButtonModificarEstadoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoCuota")) {
				jButtonActualizarEstadoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoCuota")) {
				jButtonEliminarEstadoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoCuota")) {
				jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoCuota")) {
				jButtonCancelarEstadoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoCuota")) {
				jButtonCerrarEstadoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoCuota")) {
				jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoCuota")) {
				jButtonNuevoGuardarCambiosEstadoCuotaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoCuota")) {
				jButtonAbrirOrderByEstadoCuotaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoCuota")) {
				jButtonRecargarInformacionEstadoCuotaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoCuota")) {
				jButtonAnterioresEstadoCuotaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoCuota")) {
				jButtonSiguientesEstadoCuotaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoCuotaBusqueda")) {
				this.jButtonidEstadoCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoCuotaBusqueda")) {
				this.jButtoncodigoEstadoCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoCuotaBusqueda")) {
				this.jButtonnombreEstadoCuotaBusquedaActionPerformed(evt);
			}
			
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoCuota();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoCuota")) {
				closingInternalFrameEstadoCuota();
				
			} else if(sTipo.equals("jButtonCancelarEstadoCuota")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoCuota = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoCuotaBeanSwingJInternalFrame jInternalFrameParent=(EstadoCuotaBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoCuota.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoCuotaActionPerformed(null);
			}
			
			EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadocuota,new Object(),this.estadocuotaParameterGeneral,this.estadocuotaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoCuota(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoCuota(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoCuota(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadocuota)) {
			if(!esControlTabla) {
				if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoCuota(this.estadocuota,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(this.estadocuota);			
				}
				
				if(this.estadocuotaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoCuota(this.estadocuota,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadocuotaReturnGeneral=estadocuotaLogic.procesarEventosEstadoCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocuotaLogic.getEstadoCuotas(),this.estadocuota,this.estadocuotaParameterGeneral,this.isEsNuevoEstadoCuota,classes);//this.estadocuotaLogic.getEstadoCuota()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoCuota(this.estadocuotaReturnGeneral,this.estadocuotaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadocuotaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoCuota(classes,this.estadocuotaReturnGeneral,this.estadocuotaBean,false);
					}
						
					if(this.estadocuotaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoCuota(this.estadocuotaReturnGeneral.getEstadoCuota());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoCuota(this.estadocuotaReturnGeneral.getEstadoCuota());	
					}
						
					if(this.estadocuotaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoCuota(this.estadocuotaReturnGeneral.getEstadoCuota(),classes);//this.estadocuotaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoCuota(this.estadocuota,classes);//this.estadocuotaBean);									
				}
			
				if(EstadoCuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoCuota(this.estadocuota,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuota(this.estadocuota);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadocuotaAnterior!=null) {
						this.estadocuota=this.estadocuotaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadocuotaReturnGeneral=estadocuotaLogic.procesarEventosEstadoCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocuotaLogic.getEstadoCuotas(),this.estadocuota,this.estadocuotaParameterGeneral,this.isEsNuevoEstadoCuota,classes);//this.estadocuotaLogic.getEstadoCuota()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadocuotaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadocuotaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadocuotaReturnGeneral.getEstadoCuota(),estadocuotaLogic.getEstadoCuotas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadocuotaReturnGeneral.getEstadoCuota(),this.estadocuotas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoCuota.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoCuota.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoCuota();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoCuota() throws Exception {
		
		EstadoCuotaModel estadocuotaModel=(EstadoCuotaModel)this.jTableDatosEstadoCuota.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadocuotaModel.estadocuotas=this.estadocuotaLogic.getEstadoCuotas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadocuotaModel.estadocuotas=this.estadocuotas;
		}
		
		
		((EstadoCuotaModel) this.jTableDatosEstadoCuota.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoCuota() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadocuotaAnterior(),this.estadocuotaLogic.getEstadoCuotas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadocuotaAnterior(),this.estadocuotas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoCuota();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoCuota(EstadoCuota estadocuota,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cuota.class)) {
					this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(estadocuota.getCuotas());
					this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuota(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
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
										
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocuota,new Object(),generalEntityParameterGeneral,this.estadocuotaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadocuotaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoCuotaConstantesFunciones.getClassesRelationshipsOfEstadoCuota(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoCuotaConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoCuota(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoCuota(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoCuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocuota,new Object(),generalEntityParameterGeneral,this.estadocuotaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoCuota(EstadoCuotaBean estadocuotaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cuota.class)) {
					this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(estadocuota.getCuotas());
					this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuota(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoCuota(ArrayList<Classe> classes,EstadoCuotaReturnGeneral estadocuotaReturnGeneral,EstadoCuotaBean estadocuotaBean,Boolean conDefault) throws Exception {
		
			this.estadocuotaBean.setCuotas(estadocuotaReturnGeneral.getEstadoCuota().getCuotas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoCuota(EstadoCuota estadocuota,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cuota.class)) {
					estadocuota.setCuotas(this.jInternalFrameDetalleFormEstadoCuota.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadocuota)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoCuota = new EstadoCuotaDetalleFormJInternalFrame(jDesktopPane,this.estadocuotaSessionBean.getConGuardarRelaciones(),this.estadocuotaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoCuota);
		this.jInternalFrameDetalleFormEstadoCuota.setVisible(false);
		this.jInternalFrameDetalleFormEstadoCuota.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoCuota.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoCuota.estadocuotaLogic=this.estadocuotaLogic;
		
		this.cargarCombosFrameForeignKeyEstadoCuota("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoCuota();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoCuota();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoCuota("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoCuota();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoCuota.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoCuota"));
		
		this.jInternalFrameDetalleFormEstadoCuota.jButtonModificarEstadoCuota.addActionListener(new ButtonActionListener(this,"ModificarEstadoCuota"));

		
		this.jInternalFrameDetalleFormEstadoCuota.jButtonModificarToolBarEstadoCuota.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoCuota"));
					
		this.jInternalFrameDetalleFormEstadoCuota.jMenuItemModificarEstadoCuota.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoCuota"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCuota.jButtonActualizarEstadoCuota.addActionListener (new ButtonActionListener(this,"ActualizarEstadoCuota"));
		
		
		this.jInternalFrameDetalleFormEstadoCuota.jButtonActualizarToolBarEstadoCuota.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoCuota"));
						
		this.jInternalFrameDetalleFormEstadoCuota.jMenuItemActualizarEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoCuota"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCuota.jButtonEliminarEstadoCuota.addActionListener (new ButtonActionListener(this,"EliminarEstadoCuota"));
		
		
		this.jInternalFrameDetalleFormEstadoCuota.jButtonEliminarToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoCuota"));
								
		this.jInternalFrameDetalleFormEstadoCuota.jMenuItemEliminarEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoCuota"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCuota.jButtonCancelarEstadoCuota.addActionListener (new ButtonActionListener(this,"CancelarEstadoCuota"));
		
		
		this.jInternalFrameDetalleFormEstadoCuota.jButtonCancelarToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoCuota"));
					
		this.jInternalFrameDetalleFormEstadoCuota.jMenuItemCancelarEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoCuota"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoCuota.jMenuItemDetalleCerrarEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoCuota"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCuota.jButtonGuardarCambiosToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoCuota"));
		
		
		
		this.jInternalFrameDetalleFormEstadoCuota.jButtonGuardarCambiosToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoCuota"));
		
		
		
		this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoCuota"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuota.jButtonidEstadoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuota.jButtoncodigoEstadoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuota.jButtonnombreEstadoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoCuotaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoCuota.jTabbedPaneRelacionesEstadoCuota.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoCuota"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoCuota"));
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuota.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoCuota"));
		}
		
		this.jTableDatosEstadoCuota.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoCuota"));
		
		this.jTableDatosEstadoCuota.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoCuota"));
		
		this.jButtonNuevoEstadoCuota.addActionListener(new ButtonActionListener(this,"NuevoEstadoCuota"));
		
		this.jButtonDuplicarEstadoCuota.addActionListener(new ButtonActionListener(this,"DuplicarEstadoCuota"));
		
		this.jButtonCopiarEstadoCuota.addActionListener(new ButtonActionListener(this,"CopiarEstadoCuota"));
		
		this.jButtonVerFormEstadoCuota.addActionListener(new ButtonActionListener(this,"VerFormEstadoCuota"));
		
		
		this.jButtonNuevoToolBarEstadoCuota.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoCuota"));
			
		this.jButtonDuplicarToolBarEstadoCuota.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoCuota"));
			
		this.jMenuItemNuevoEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoCuota"));
			
		this.jMenuItemDuplicarEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoCuota"));		
		
		
		this.jButtonNuevoRelacionesEstadoCuota.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoCuota"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoCuota.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoCuota"));
			
		this.jMenuItemNuevoRelacionesEstadoCuota.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoCuota"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuota.jButtonModificarEstadoCuota.addActionListener(new ButtonActionListener(this,"ModificarEstadoCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuota.jButtonModificarToolBarEstadoCuota.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoCuota"));
			
			this.jInternalFrameDetalleFormEstadoCuota.jMenuItemModificarEstadoCuota.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoCuota"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoCuota.jButtonActualizarEstadoCuota.addActionListener (new ButtonActionListener(this,"ActualizarEstadoCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuota.jButtonActualizarToolBarEstadoCuota.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoCuota"));
				
			this.jInternalFrameDetalleFormEstadoCuota.jMenuItemActualizarEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoCuota"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuota.jButtonEliminarEstadoCuota.addActionListener (new ButtonActionListener(this,"EliminarEstadoCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuota.jButtonEliminarToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoCuota"));
						
			this.jInternalFrameDetalleFormEstadoCuota.jMenuItemEliminarEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoCuota"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuota.jButtonCancelarEstadoCuota.addActionListener (new ButtonActionListener(this,"CancelarEstadoCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuota.jButtonCancelarToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoCuota"));
			
			this.jInternalFrameDetalleFormEstadoCuota.jMenuItemCancelarEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoCuota"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoCuota"));		
		
		
		this.jButtonCerrarEstadoCuota.addActionListener (new ButtonActionListener(this,"CerrarEstadoCuota"));
		
		
		this.jButtonCerrarToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoCuota"));
			
		this.jMenuItemCerrarEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoCuota"));
			
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuota.jMenuItemDetalleCerrarEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoCuota"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuota.jButtonGuardarCambiosEstadoCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuota.jButtonGuardarCambiosToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoCuota"));
		}
		
		this.jButtonCopiarToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoCuota"));
			
		this.jButtonVerFormToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoCuota"));
		
		this.jMenuItemGuardarCambiosEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoCuota"));
			
		this.jMenuItemCopiarEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoCuota"));		
		
		this.jMenuItemVerFormEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoCuota"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoCuota"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoCuota"));
			
		this.jMenuItemGuardarCambiosTablaEstadoCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoCuota"));		
		
		
		
		this.jButtonRecargarInformacionEstadoCuota.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoCuota"));
					
		this.jButtonRecargarInformacionToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoCuota"));
		
		this.jMenuItemRecargarInformacionEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoCuota"));		
		
		
		
		this.jButtonAnterioresEstadoCuota.addActionListener (new ButtonActionListener(this,"AnterioresEstadoCuota"));
		
		
		this.jButtonAnterioresToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoCuota"));
		
		this.jMenuItemAnterioresEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoCuota"));		
		
		
		this.jButtonSiguientesEstadoCuota.addActionListener (new ButtonActionListener(this,"SiguientesEstadoCuota"));
		
		
		this.jButtonSiguientesToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoCuota"));
			
		this.jMenuItemSiguientesEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoCuota"));
			
		this.jMenuItemAbrirOrderByEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoCuota"));
			
		this.jMenuItemMostrarOcultarEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoCuota"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoCuota"));
			
		this.jMenuItemDetalleMostarOcultarEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoCuota"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoCuota.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoCuota"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoCuota"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoCuota.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoCuota"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoCuota.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoCuota"));

		this.jCheckBoxSeleccionadosEstadoCuota.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoCuota"));
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoCuota"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoCuota.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoCuota"));
			
		this.jComboBoxTiposAccionesEstadoCuota.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoCuota"));
					
		this.jComboBoxTiposSeleccionarEstadoCuota.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoCuota"));
			
		this.jTextFieldValorCampoGeneralEstadoCuota.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoCuota"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuota.jButtonidEstadoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuota.jButtoncodigoEstadoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuota.jButtonnombreEstadoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoCuotaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoCuota!=null) {
				this.jInternalFrameReporteDinamicoEstadoCuota.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoCuota"));
				this.jInternalFrameReporteDinamicoEstadoCuota.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoCuota"));
				this.jInternalFrameReporteDinamicoEstadoCuota.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoCuota"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoCuota.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoCuota"));				
			//this.jButtonGenerarReporteDinamicoEstadoCuota.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoCuota"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoCuota.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoCuota"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoCuota!=null) {
				this.jInternalFrameImportacionEstadoCuota.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoCuota"));
				this.jInternalFrameImportacionEstadoCuota.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoCuota"));
				this.jInternalFrameImportacionEstadoCuota.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoCuota"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoCuota.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoCuota"));
			
			this.jButtonAbrirOrderByToolBarEstadoCuota.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoCuota"));			
			
			if(this.jInternalFrameOrderByEstadoCuota!=null) {
				this.jInternalFrameOrderByEstadoCuota.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoCuota"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuota.jTabbedPaneRelacionesEstadoCuota.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoCuota"));
		
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
            		closingInternalFrameEstadoCuota();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoCuota.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoCuota = (JInternalFrameBase)event.getSource();
	            	
	            EstadoCuotaBeanSwingJInternalFrame jInternalFrameParent=(EstadoCuotaBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoCuota.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoCuotaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoCuota.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoCuotaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoCuota.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoCuota.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCuotaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCuotaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCuotaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoCuota";
		inputMap = this.jButtonNuevoEstadoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoCuotaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCuotaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCuotaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCuotaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoCuota";
		inputMap = this.jButtonNuevoRelacionesEstadoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoCuotaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoCuota";
		inputMap = this.jButtonModificarEstadoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoCuota";
		inputMap = this.jButtonActualizarEstadoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoCuota";
		inputMap = this.jButtonEliminarEstadoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoCuota";
		inputMap = this.jButtonCancelarEstadoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoCuota";
		inputMap = this.jButtonCerrarEstadoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoCuota.jButtonGuardarCambiosEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoCuota";
		inputMap = this.jInternalFrameDetalleFormEstadoCuota.jButtonGuardarCambiosEstadoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoCuota.jButtonGuardarCambiosEstadoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoCuota.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoCuotaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoCuota.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoCuotaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoCuota.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoCuotaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoCuota.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoCuotaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuota.jButtonidEstadoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuota.jButtoncodigoEstadoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuota.jButtonnombreEstadoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoCuotaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoCuotaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoCuota.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoCuota(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoCuota estadocuotaAux:this.estadocuotaLogic.getEstadoCuotas()) {
					estadocuotaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCuota estadocuotaAux:estadocuotas) {
					estadocuotaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoCuotaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoCuota(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoCuota estadocuotaAux:this.estadocuotaLogic.getEstadoCuotas()) {
						estadocuotaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoCuota estadocuotaAux:estadocuotas) {
						estadocuotaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoCuota estadocuotaAux:this.estadocuotaLogic.getEstadoCuotas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoCuota estadocuotaAux:estadocuotas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoCuota(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoCuota.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoCuota.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuota,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoCuotaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoCuota(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoCuota.getSelectedRows();
			
			EstadoCuota estadocuotaLocal=new EstadoCuota();
			
			//this.seleccionarTodosEstadoCuota(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocuotaLocal =(EstadoCuota) this.estadocuotaLogic.getEstadoCuotas().toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadocuotaLocal =(EstadoCuota) this.estadocuotas.toArray()[this.jTableDatosEstadoCuota.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadocuotaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoCuota estadocuotaAux:this.estadocuotaLogic.getEstadoCuotas()) {
						estadocuotaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoCuota estadocuotaAux:estadocuotas) {
						estadocuotaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoCuota(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoCuota.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoCuota.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuota,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoCuotaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoCuotaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoCuotaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoCuota(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoCuota.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoCuota estadocuotaAux:this.estadocuotaLogic.getEstadoCuotas()) {
				
						if(sTipoSeleccionar.equals(EstadoCuotaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadocuotaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoCuotaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadocuotaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCuota estadocuotaAux:estadocuotas) {
					
						if(sTipoSeleccionar.equals(EstadoCuotaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadocuotaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoCuotaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadocuotaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoCuota(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoCuotaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoCuota(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoCuota=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoCuota.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoCuota) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoCuota(conSplash);
				
					this.generarReporteEstadoCuotasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCuota.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoCuotasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoCuota.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoCuotasSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoCuota.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoCuotasSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoCuota.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoCuota();
				
				this.exportarEstadoCuotasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCuota.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoCuotas();
				//this.importarEstadoCuotas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCuota.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoCuota();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoCuotasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoCuota.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Cuota", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoCuota();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoCuota)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoCuota(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Cuota",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCuota.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoCuotaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoCuota) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoCuota(conSplash);
					
						//this.actualizarParametrosGeneralEstadoCuota();
						
						this.generarReporteProcesoAccionEstadoCuotasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoCuota.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoCuotaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado CuotaS SELECCIONADOS?", "MANTENIMIENTO DE Estado Cuota", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoCuota();
				
						this.actualizarParametrosGeneralEstadoCuota();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadocuotaReturnGeneral=estadocuotaLogic.procesarAccionEstadoCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadocuotaLogic.getEstadoCuotas(),this.estadocuotaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoCuotaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoCuota.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoCuota();
					
					EstadoCuotaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoCuotaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoCuota.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoCuota.jComboBoxTiposAccionesFormularioEstadoCuota.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoCuota(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoCuotaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoCuota();
			
			if(this.jInternalFrameDetalleFormEstadoCuota==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoCuota> estadocuotasSeleccionados=new ArrayList<EstadoCuota>();		
			EstadoCuota estadocuota=new EstadoCuota();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoCuota(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoCuota.getSelectedItem();
			
			
			
			
			estadocuotasSeleccionados=this.getEstadoCuotasSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadocuotasSeleccionados.size()==1) {
				for(EstadoCuota estadocuotaAux:estadocuotasSeleccionados) {
					estadocuota=estadocuotaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cuota")) {
					jButtonCuotaActionPerformed(null,rowIndex,true,false,estadocuota);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoCuota();
			
      		//this.finishProcessEstadoCuota(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoCuotaReturnGeneral() throws Exception {
		if(this.estadocuotaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadocuotaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadocuotaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadocuotaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadocuotaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadocuotaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoCuota(false);
		}
		
		if(this.estadocuotaReturnGeneral.getConRetornoLista() || this.estadocuotaReturnGeneral.getConRetornoObjeto()) {
			if(this.estadocuotaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadocuotaLogic.setEstadoCuotas(this.estadocuotaReturnGeneral.getEstadoCuotas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadocuotaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadocuotaLogic.setEstadoCuota(this.estadocuotaReturnGeneral.getEstadoCuota());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoCuota(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoCuota() throws Exception {
		
		
	}
	
	public ArrayList<EstadoCuota> getEstadoCuotasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoCuota> estadocuotasSeleccionados=new ArrayList<EstadoCuota>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoCuota) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoCuota estadocuotaAux:estadocuotaLogic.getEstadoCuotas()) {
					if(estadocuotaAux.getIsSelected()) {
						estadocuotasSeleccionados.add(estadocuotaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCuota estadocuotaAux:this.estadocuotas) {
					if(estadocuotaAux.getIsSelected()) {
						estadocuotasSeleccionados.add(estadocuotaAux);				
					}
				}
			}
			
			if(estadocuotasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadocuotasSeleccionados.addAll(this.estadocuotaLogic.getEstadoCuotas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadocuotasSeleccionados.addAll(this.estadocuotas);				
					}
				}
			}
		} else {
			estadocuotasSeleccionados.add(this.estadocuota);
		}
		
		return estadocuotasSeleccionados;
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
	
	public void generarReporteEstadoCuotasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoCuotasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoCuotasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoCuotasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoCuotasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoCuotasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Cuota",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoCuotasSeleccionados() throws Exception {
		ArrayList<EstadoCuota> estadocuotasSeleccionados=new ArrayList<EstadoCuota>();		
		
		estadocuotasSeleccionados=this.getEstadoCuotasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoCuotas("Todos",estadocuotasSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoCuotasSeleccionados() throws Exception {
		ArrayList<EstadoCuota> estadocuotasSeleccionados=new ArrayList<EstadoCuota>();		
		
		estadocuotasSeleccionados=this.getEstadoCuotasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoCuotas("Todos",estadocuotasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoCuotasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoCuota> estadocuotasSeleccionados=new ArrayList<EstadoCuota>();
		
		estadocuotasSeleccionados=this.getEstadoCuotasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoCuotas("Todos",estadocuotasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoCuotasSeleccionados() throws Exception {
		ArrayList<EstadoCuota> estadocuotasSeleccionados=new ArrayList<EstadoCuota>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoCuota();
		
		
		estadocuotasSeleccionados=this.getEstadoCuotasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoCuota();
		
		
		//this.generarReporteEstadoCuotas("Todos",estadocuotasSeleccionados ,estadocuotaImplementable,estadocuotaImplementableHome);
	}
	
	public void mostrarImportacionEstadoCuotas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoCuota();
		
		this.abrirFrameImportacionEstadoCuota();		
		
			
		//this.generarReporteEstadoCuotas("Todos",estadocuotasSeleccionados ,estadocuotaImplementable,estadocuotaImplementableHome);
	}
	
	public void importarEstadoCuotas() throws Exception {		
	
	}
	
	public void exportarEstadoCuotasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoCuotasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoCuotasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoCuotasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Cuota",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoCuotasSeleccionados() throws Exception {
		ArrayList<EstadoCuota> estadocuotasSeleccionados=new ArrayList<EstadoCuota>();		
		
		estadocuotasSeleccionados=this.getEstadoCuotasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocuota."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoCuota(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoCuota estadocuotaAux:estadocuotasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoCuota(estadocuotaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadocuotaAux.setsDetalleGeneralEntityReporte(estadocuotaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuota",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoCuota(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoCuotaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoCuotaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoCuotaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoCuotaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoCuota(EstadoCuota estadocuota,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadocuota.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocuota.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocuota.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocuota.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoCuotasSeleccionados() throws Exception {
		ArrayList<EstadoCuota> estadocuotasSeleccionados=new ArrayList<EstadoCuota>();		
		
		estadocuotasSeleccionados=this.getEstadoCuotasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocuota.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoCuotas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoCuota(row);				
				iRow++;
			}				
			
			for(EstadoCuota estadocuotaAux:estadocuotasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoCuota(estadocuotaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuota",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoCuotasSeleccionados() throws Exception {
		ArrayList<EstadoCuota> estadocuotasSeleccionados=new ArrayList<EstadoCuota>();		
		
		estadocuotasSeleccionados=this.getEstadoCuotasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocuota.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadocuotas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadocuota");
			//elementRoot.appendChild(element);
		
			for(EstadoCuota estadocuotaAux:estadocuotasSeleccionados) {
				element = document.createElement("estadocuota");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoCuota(estadocuotaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuota",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoCuota(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoCuotaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoCuotaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoCuotaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoCuotaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoCuota(EstadoCuota estadocuota,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadocuota.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadocuota.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadocuota.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoCuota(EstadoCuota estadocuota,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoCuotaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadocuota.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoCuotaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadocuota.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoCuotaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadocuota.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoCuotaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadocuota.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoCuotasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoCuota> estadocuotasSeleccionados=new ArrayList<EstadoCuota>();
		
		estadocuotasSeleccionados=this.getEstadoCuotasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoCuota(estadocuotasSeleccionados);
		
		this.generarReporteEstadoCuotas("Todos",estadocuotasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoCuota(ArrayList<EstadoCuota> estadocuotasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoCuota estadocuotaAux:estadocuotasSeleccionados) {
				estadocuotaAux.setsDetalleGeneralEntityReporte(estadocuotaAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoCuotaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadocuotaAux.setsDescripcionGeneralEntityReporte1(estadocuotaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoCuotaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadocuotaAux.setsDescripcionGeneralEntityReporte1(estadocuotaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoCuota(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoCuota=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoCuota=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoCuota=false;
			this.isVisibilidadCeldaActualizarEstadoCuota=false;
			this.isVisibilidadCeldaEliminarEstadoCuota=false;
			this.isVisibilidadCeldaCancelarEstadoCuota=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCuota=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCuota=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuota=false;
			this.isVisibilidadCeldaModificarEstadoCuota=false;
			this.isVisibilidadCeldaActualizarEstadoCuota=true;
			this.isVisibilidadCeldaEliminarEstadoCuota=false;
			this.isVisibilidadCeldaCancelarEstadoCuota=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCuota=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCuota=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuota=false;
			this.isVisibilidadCeldaModificarEstadoCuota=false;
			this.isVisibilidadCeldaActualizarEstadoCuota=true;
			this.isVisibilidadCeldaEliminarEstadoCuota=true;
			this.isVisibilidadCeldaCancelarEstadoCuota=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCuota=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCuota=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuota=false;
			this.isVisibilidadCeldaModificarEstadoCuota=false;
			this.isVisibilidadCeldaActualizarEstadoCuota=true;
			this.isVisibilidadCeldaEliminarEstadoCuota=false;
			this.isVisibilidadCeldaCancelarEstadoCuota=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCuota=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCuota=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoCuota=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuota=true;
			this.isVisibilidadCeldaModificarEstadoCuota=false;
			this.isVisibilidadCeldaActualizarEstadoCuota=false;
			this.isVisibilidadCeldaEliminarEstadoCuota=false;
			this.isVisibilidadCeldaCancelarEstadoCuota=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCuota=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCuota=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuota=false;
			this.isVisibilidadCeldaActualizarEstadoCuota=false;
			this.isVisibilidadCeldaEliminarEstadoCuota=false;
			this.isVisibilidadCeldaCancelarEstadoCuota=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCuota=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCuota=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuota=false;
			this.isVisibilidadCeldaModificarEstadoCuota=true;
			this.isVisibilidadCeldaActualizarEstadoCuota=false;
			this.isVisibilidadCeldaEliminarEstadoCuota=false;
			this.isVisibilidadCeldaCancelarEstadoCuota=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCuota=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCuota=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoCuotaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoCuota=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuota=true;
		} else {
			this.actualizarEstadoPanelsEstadoCuota(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoCuota=false;
			//this.isVisibilidadCeldaVerFormEstadoCuota=false;
			this.isVisibilidadCeldaDuplicarEstadoCuota=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadocuotaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuota=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadocuotaSessionBean.getEsGuardarRelacionado()) {
			if(!estadocuotaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=false;												
			}
			
			this.jButtonCerrarEstadoCuota.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuota=false;
		}
		
		if(!this.permiteMantenimiento(this.estadocuota)) {
			this.isVisibilidadCeldaActualizarEstadoCuota=false;
			this.isVisibilidadCeldaEliminarEstadoCuota=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoCuota() {
		this.isVisibilidadCeldaNuevoEstadoCuota=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoCuota=false;
	}
	
	public void actualizarEstadoPanelsEstadoCuota(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoCuota!=null) {
				this.jScrollPanelDatosEdicionEstadoCuota.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoCuota!=null) {
				this.jScrollPanelDatosEstadoCuota.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCuota!=null) {
				this.jPanelPaginacionEstadoCuota.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCuota!=null) {
				this.jPanelParametrosReportesEstadoCuota.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoCuota!=null) {
				this.jScrollPanelDatosEdicionEstadoCuota.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoCuota!=null) {
				this.jScrollPanelDatosEstadoCuota.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoCuota!=null) {
				this.jPanelPaginacionEstadoCuota.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoCuota!=null) {
				this.jPanelParametrosReportesEstadoCuota.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoCuota!=null) {
				this.jScrollPanelDatosEdicionEstadoCuota.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoCuota!=null) {
				this.jScrollPanelDatosEstadoCuota.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoCuota!=null) {
				this.jPanelPaginacionEstadoCuota.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoCuota!=null) {
				this.jPanelParametrosReportesEstadoCuota.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoCuota!=null) {
				this.jScrollPanelDatosEdicionEstadoCuota.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoCuota!=null) {
				this.jScrollPanelDatosEstadoCuota.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoCuota!=null) {
				this.jPanelPaginacionEstadoCuota.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoCuota!=null) {
				this.jPanelParametrosReportesEstadoCuota.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoCuota!=null) {
				this.jScrollPanelDatosEdicionEstadoCuota.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoCuota!=null) {
				this.jScrollPanelDatosEstadoCuota.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCuota!=null) {
				this.jPanelPaginacionEstadoCuota.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCuota!=null) {
				this.jPanelParametrosReportesEstadoCuota.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoCuota!=null) {
				this.jScrollPanelDatosEdicionEstadoCuota.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoCuota!=null) {
				this.jScrollPanelDatosEstadoCuota.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCuota!=null) {
				this.jPanelPaginacionEstadoCuota.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCuota!=null) {
				this.jPanelParametrosReportesEstadoCuota.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoCuota!=null) {
				this.jScrollPanelDatosEdicionEstadoCuota.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoCuota!=null) {
				this.jScrollPanelDatosEstadoCuota.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCuota!=null) {
				this.jPanelPaginacionEstadoCuota.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCuota!=null) {
				this.jPanelParametrosReportesEstadoCuota.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoCuotaParaCuotas() throws Exception {
		Boolean isPaginaPopupCuota=false;

		try {

			if(this.estadocuotaSessionBean==null) {
				this.estadocuotaSessionBean=new EstadoCuotaSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoCuota.cuotaSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoCuota.cuotaSessionBean=new CuotaSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoCuota.cuotaSessionBean.setsPathNavegacionActual(estadocuotaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuotaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoCuota.cuotaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCuota=this.jInternalFrameDetalleFormEstadoCuota.cuotaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoCuota.cuotaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuota(true);
			this.jInternalFrameDetalleFormEstadoCuota.cuotaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuota(EstadoCuotaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoCuota.cuotaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCuota(true);
			this.jInternalFrameDetalleFormEstadoCuota.cuotaSessionBean.setlidEstadoCuotaActual(this.idEstadoCuotaActual);

			estadocuotaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoCuota(true);
			estadocuotaSessionBean.setlIdEstadoCuotaActualForeignKey(this.idEstadoCuotaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoCuotaSessionBean estadocuotaSessionBean=new EstadoCuotaSessionBean();
		
		if(this.estadocuotaSessionBean==null) {
			this.estadocuotaSessionBean=new EstadoCuotaSessionBean();
		}
		
		this.estadocuotaSessionBean.setsUltimaBusquedaEstadoCuota(this.getsAccionBusqueda());
		this.estadocuotaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadocuotaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoCuotaSessionBean estadocuotaSessionBean=new EstadoCuotaSessionBean();
		
		if(this.estadocuotaSessionBean==null) {
			this.estadocuotaSessionBean=new EstadoCuotaSessionBean();
		}
		
		if(this.estadocuotaSessionBean.getsUltimaBusquedaEstadoCuota()!=null&&!this.estadocuotaSessionBean.getsUltimaBusquedaEstadoCuota().equals("")) {
			this.setsAccionBusqueda(estadocuotaSessionBean.getsUltimaBusquedaEstadoCuota());
			this.setiNumeroPaginacion(estadocuotaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadocuotaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadocuotaSessionBean.setsUltimaBusquedaEstadoCuota("");
		this.estadocuotaSessionBean.setiNumeroPaginacion(EstadoCuotaConstantesFunciones.INUMEROPAGINACION);
		this.estadocuotaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoCuota(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoCuota() {
		this.updateBorderResaltarBusquedasFormularioEstadoCuota();
		this.updateVisibilidadBusquedasFormularioEstadoCuota();
		this.updateHabilitarBusquedasFormularioEstadoCuota();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoCuota() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoCuota() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoCuota() {
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
	
	public void updateControlesFormularioEstadoCuota() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoCuota==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoCuota();
		this.updateVisibilidadResaltarControlesFormularioEstadoCuota();
		this.updateHabilitarResaltarControlesFormularioEstadoCuota();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoCuota() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoCuota==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadocuotaConstantesFunciones.resaltaridEstadoCuota!=null && this.jInternalFrameDetalleFormEstadoCuota!=null) {this.jInternalFrameDetalleFormEstadoCuota.jTextFieldidEstadoCuota.setBorder(this.estadocuotaConstantesFunciones.resaltaridEstadoCuota);}
		if(this.estadocuotaConstantesFunciones.resaltarcodigoEstadoCuota!=null && this.jInternalFrameDetalleFormEstadoCuota!=null) {this.jInternalFrameDetalleFormEstadoCuota.jTextFieldcodigoEstadoCuota.setBorder(this.estadocuotaConstantesFunciones.resaltarcodigoEstadoCuota);}
		if(this.estadocuotaConstantesFunciones.resaltarnombreEstadoCuota!=null && this.jInternalFrameDetalleFormEstadoCuota!=null) {this.jInternalFrameDetalleFormEstadoCuota.jTextAreanombreEstadoCuota.setBorder(this.estadocuotaConstantesFunciones.resaltarnombreEstadoCuota);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoCuota() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoCuota==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
	
		//this.jInternalFrameDetalleFormEstadoCuota.jTextFieldidEstadoCuota.setVisible(this.estadocuotaConstantesFunciones.mostraridEstadoCuota);
		this.jInternalFrameDetalleFormEstadoCuota.jPanelidEstadoCuota.setVisible(this.estadocuotaConstantesFunciones.mostraridEstadoCuota);
		//this.jInternalFrameDetalleFormEstadoCuota.jTextFieldcodigoEstadoCuota.setVisible(this.estadocuotaConstantesFunciones.mostrarcodigoEstadoCuota);
		this.jInternalFrameDetalleFormEstadoCuota.jPanelcodigoEstadoCuota.setVisible(this.estadocuotaConstantesFunciones.mostrarcodigoEstadoCuota);
		//this.jInternalFrameDetalleFormEstadoCuota.jTextAreanombreEstadoCuota.setVisible(this.estadocuotaConstantesFunciones.mostrarnombreEstadoCuota);
		this.jInternalFrameDetalleFormEstadoCuota.jPanelnombreEstadoCuota.setVisible(this.estadocuotaConstantesFunciones.mostrarnombreEstadoCuota);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoCuota() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoCuota==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoCuota!=null) {
	
		this.jInternalFrameDetalleFormEstadoCuota.jTextFieldidEstadoCuota.setEnabled(this.estadocuotaConstantesFunciones.activaridEstadoCuota);
		this.jInternalFrameDetalleFormEstadoCuota.jTextFieldcodigoEstadoCuota.setEnabled(this.estadocuotaConstantesFunciones.activarcodigoEstadoCuota);
		this.jInternalFrameDetalleFormEstadoCuota.jTextAreanombreEstadoCuota.setEnabled(this.estadocuotaConstantesFunciones.activarnombreEstadoCuota);
		}
	}
	
		
}