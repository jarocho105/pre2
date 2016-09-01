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
package com.bydan.erp.sris.presentation.swing.jinternalframes;




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

import com.bydan.erp.sris.util.PeriodoDeclaraConstantesFunciones;
import com.bydan.erp.sris.util.PeriodoDeclaraParameterReturnGeneral;
//import com.bydan.erp.sris.util.PeriodoDeclaraParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.PeriodoDeclaraBean;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.sris.resources.reportes.AuxiliarReportes;


import com.bydan.erp.sris.util.*;
import com.bydan.erp.sris.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

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
public class PeriodoDeclaraBeanSwingJInternalFrame extends PeriodoDeclaraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PeriodoDeclaraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PeriodoDeclara> periododeclaraValidator = new ClassValidator<PeriodoDeclara>(PeriodoDeclara.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PeriodoDeclara periododeclara;	
	public PeriodoDeclara periododeclaraAux;
	public PeriodoDeclara periododeclaraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PeriodoDeclara periododeclaraTotales;
	public Long idPeriodoDeclaraActual;
	public Long iIdNuevoPeriodoDeclara=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosTransaccionLocal=false;

	public Boolean getIsTienePermisosTransaccionLocal() {
		return isTienePermisosTransaccionLocal;
	}

	public void setIsTienePermisosTransaccionLocal(Boolean isTienePermisosTransaccionLocal) {
		this.isTienePermisosTransaccionLocal= isTienePermisosTransaccionLocal;
	}


	public Boolean isTienePermisosRetencionVenta=false;

	public Boolean getIsTienePermisosRetencionVenta() {
		return isTienePermisosRetencionVenta;
	}

	public void setIsTienePermisosRetencionVenta(Boolean isTienePermisosRetencionVenta) {
		this.isTienePermisosRetencionVenta= isTienePermisosRetencionVenta;
	}


	public Boolean isTienePermisosFacturaDiario=false;

	public Boolean getIsTienePermisosFacturaDiario() {
		return isTienePermisosFacturaDiario;
	}

	public void setIsTienePermisosFacturaDiario(Boolean isTienePermisosFacturaDiario) {
		this.isTienePermisosFacturaDiario= isTienePermisosFacturaDiario;
	}


	public Boolean isTienePermisosDocumentoAnulado=false;

	public Boolean getIsTienePermisosDocumentoAnulado() {
		return isTienePermisosDocumentoAnulado;
	}

	public void setIsTienePermisosDocumentoAnulado(Boolean isTienePermisosDocumentoAnulado) {
		this.isTienePermisosDocumentoAnulado= isTienePermisosDocumentoAnulado;
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
	
	public Boolean isPermisoTodoPeriodoDeclara;
	public Boolean isPermisoNuevoPeriodoDeclara;
	public Boolean isPermisoActualizarPeriodoDeclara;
	public Boolean isPermisoActualizarOriginalPeriodoDeclara;
	public Boolean isPermisoEliminarPeriodoDeclara;
	public Boolean isPermisoGuardarCambiosPeriodoDeclara;
	public Boolean isPermisoConsultaPeriodoDeclara;
	public Boolean isPermisoBusquedaPeriodoDeclara;
	public Boolean isPermisoReportePeriodoDeclara;
	public Boolean isPermisoPaginacionMedioPeriodoDeclara;
	public Boolean isPermisoPaginacionAltoPeriodoDeclara;
	public Boolean isPermisoPaginacionTodoPeriodoDeclara;
	public Boolean isPermisoCopiarPeriodoDeclara;
	public Boolean isPermisoVerFormPeriodoDeclara;
	public Boolean isPermisoDuplicarPeriodoDeclara;
	public Boolean isPermisoOrdenPeriodoDeclara;
	
	
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
	
	public PeriodoDeclaraParameterReturnGeneral periododeclaraReturnGeneral;
	public PeriodoDeclaraParameterReturnGeneral periododeclaraParameterGeneral;
	
	

	public TransaccionLocalLogic transaccionlocalLogic=null;

	public TransaccionLocalLogic getTransaccionLocalLogic() {
		return transaccionlocalLogic;
	}

	public void setTransaccionLocalLogic(TransaccionLocalLogic transaccionlocalLogic) {
		this.transaccionlocalLogic = transaccionlocalLogic;
	}


	public RetencionVentaLogic retencionventaLogic=null;

	public RetencionVentaLogic getRetencionVentaLogic() {
		return retencionventaLogic;
	}

	public void setRetencionVentaLogic(RetencionVentaLogic retencionventaLogic) {
		this.retencionventaLogic = retencionventaLogic;
	}


	public FacturaDiarioLogic facturadiarioLogic=null;

	public FacturaDiarioLogic getFacturaDiarioLogic() {
		return facturadiarioLogic;
	}

	public void setFacturaDiarioLogic(FacturaDiarioLogic facturadiarioLogic) {
		this.facturadiarioLogic = facturadiarioLogic;
	}


	public DocumentoAnuladoLogic documentoanuladoLogic=null;

	public DocumentoAnuladoLogic getDocumentoAnuladoLogic() {
		return documentoanuladoLogic;
	}

	public void setDocumentoAnuladoLogic(DocumentoAnuladoLogic documentoanuladoLogic) {
		this.documentoanuladoLogic = documentoanuladoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPeriodoDeclara=false;
	public Boolean esParaAccionDesdeFormularioPeriodoDeclara=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PeriodoDeclaraSessionBeanAdditional periododeclaraSessionBeanAdditional=null;
	
	public PeriodoDeclaraSessionBeanAdditional getPeriodoDeclaraSessionBeanAdditional() {
		return this.periododeclaraSessionBeanAdditional;
	}
	
	public void setPeriodoDeclaraSessionBeanAdditional(PeriodoDeclaraSessionBeanAdditional periododeclaraSessionBeanAdditional) {
		try {
			this.periododeclaraSessionBeanAdditional=periododeclaraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PeriodoDeclaraBeanSwingJInternalFrameAdditional periododeclaraBeanSwingJInternalFrameAdditional=null;
	//public class PeriodoDeclaraBeanSwingJInternalFrame
	
	public PeriodoDeclaraBeanSwingJInternalFrameAdditional getPeriodoDeclaraBeanSwingJInternalFrameAdditional() {
		return this.periododeclaraBeanSwingJInternalFrameAdditional;
	}
	
	public void setPeriodoDeclaraBeanSwingJInternalFrameAdditional(PeriodoDeclaraBeanSwingJInternalFrameAdditional periododeclaraBeanSwingJInternalFrameAdditional) {
		try {
			this.periododeclaraBeanSwingJInternalFrameAdditional=periododeclaraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PeriodoDeclaraLogic periododeclaraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PeriodoDeclara periododeclaraBean;
	public PeriodoDeclaraConstantesFunciones periododeclaraConstantesFunciones;
	//public PeriodoDeclaraParameterReturnGeneral periododeclaraReturnGeneral;
	
	//FK
	
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<PeriodoDeclara> periododeclaras;	
	//public List<PeriodoDeclara> periododeclarasEliminados;
	//public List<PeriodoDeclara> periododeclarasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPeriodoDeclara=false;
	public Boolean isVisibilidadCeldaDuplicarPeriodoDeclara=true;
	public Boolean isVisibilidadCeldaCopiarPeriodoDeclara=true;
	public Boolean isVisibilidadCeldaVerFormPeriodoDeclara=true;
	public Boolean isVisibilidadCeldaOrdenPeriodoDeclara=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=false;
	public Boolean isVisibilidadCeldaModificarPeriodoDeclara=false;
	public Boolean isVisibilidadCeldaActualizarPeriodoDeclara=false;
	public Boolean isVisibilidadCeldaEliminarPeriodoDeclara=false;
	public Boolean isVisibilidadCeldaCancelarPeriodoDeclara=false;
	public Boolean isVisibilidadCeldaGuardarPeriodoDeclara=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPeriodoDeclara=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdMes=false;
	
	public Long getiIdNuevoPeriodoDeclara() {
		return this.iIdNuevoPeriodoDeclara;
	}

	public void setiIdNuevoPeriodoDeclara(Long iIdNuevoPeriodoDeclara) {
		this.iIdNuevoPeriodoDeclara = iIdNuevoPeriodoDeclara;
	}
	
	public Long getidPeriodoDeclaraActual() {
		return this.idPeriodoDeclaraActual;
	}

	public void setidPeriodoDeclaraActual(Long idPeriodoDeclaraActual) {
		this.idPeriodoDeclaraActual = idPeriodoDeclaraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PeriodoDeclara getperiododeclara() {
		return this.periododeclara;
	}

	public void setperiododeclara(PeriodoDeclara periododeclara) {
		this.periododeclara = periododeclara;
	}
	
	public PeriodoDeclara getperiododeclaraAux() {
		return this.periododeclaraAux;
	}

	public void setperiododeclaraAux(PeriodoDeclara periododeclaraAux) {
		this.periododeclaraAux = periododeclaraAux;
	}				
	
	public PeriodoDeclara getperiododeclaraAnterior() {
		return this.periododeclaraAnterior;
	}

	public void setperiododeclaraAnterior(PeriodoDeclara periododeclaraAnterior) {
		this.periododeclaraAnterior = periododeclaraAnterior;
	}	
	
	public PeriodoDeclara getperiododeclaraTotales() {
		return this.periododeclaraTotales;
	}

	public void setperiododeclaraTotales(PeriodoDeclara periododeclaraTotales) {
		this.periododeclaraTotales = periododeclaraTotales;
	}	
	
	public PeriodoDeclara getperiododeclaraBean() {
		return this.periododeclaraBean;
	}

	public void setperiododeclaraBean(PeriodoDeclara periododeclaraBean) {
		this.periododeclaraBean = periododeclaraBean;
	}	
	
	public PeriodoDeclaraParameterReturnGeneral getperiododeclaraReturnGeneral() {
		return this.periododeclaraReturnGeneral;
	}

	public void setperiododeclaraReturnGeneral(PeriodoDeclaraParameterReturnGeneral periododeclaraReturnGeneral) {
		this.periododeclaraReturnGeneral = periododeclaraReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=-1L;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_mesFK_IdMes=-1L;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PeriodoDeclaraLogic getPeriodoDeclaraLogic()	{		
		return periododeclaraLogic;
	}

	public void setPeriodoDeclaraLogic(PeriodoDeclaraLogic periododeclaraLogic) {
		this.periododeclaraLogic = periododeclaraLogic;
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
	
	public Boolean getIsEsNuevoPeriodoDeclara() {
		return isEsNuevoPeriodoDeclara;
	}

	public void setIsEsNuevoPeriodoDeclara(Boolean isEsNuevoPeriodoDeclara) {
		this.isEsNuevoPeriodoDeclara = isEsNuevoPeriodoDeclara;
	}

	public Boolean getEsParaAccionDesdeFormularioPeriodoDeclara() {
		return esParaAccionDesdeFormularioPeriodoDeclara;
	}
	
	public void setEsParaAccionDesdeFormularioPeriodoDeclara(Boolean esParaAccionDesdeFormularioPeriodoDeclara) {
		this.esParaAccionDesdeFormularioPeriodoDeclara = esParaAccionDesdeFormularioPeriodoDeclara;
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
	
	
	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.periododeclaraSessionBean==null) {
				this.periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
			}

			if(!this.periododeclaraSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(periododeclaraSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.periododeclaraSessionBean==null) {
				this.periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
			}

			if(!this.periododeclaraSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(periododeclaraSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

	
	
	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.periododeclara!=null) {
						this.periododeclara.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
						this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioPeriodoDeclara.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
						if(this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara.getItemCount()>0) {
							this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioPeriodoDeclara!=null) {
						jComboBoxid_anioFK_IdAnioPeriodoDeclara.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioPeriodoDeclara!=null) {
							//jComboBoxid_anioFK_IdAnioPeriodoDeclara.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioPeriodoDeclara.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioPeriodoDeclara.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioPeriodoDeclaraGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioPeriodoDeclaraGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioPeriodoDeclaraGenerico!=null && jComboBoxid_anioPeriodoDeclaraGenerico.getItemCount()>0) {
					jComboBoxid_anioPeriodoDeclaraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.periododeclara!=null) {
						this.periododeclara.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
						this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesPeriodoDeclara.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
						if(this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara.getItemCount()>0) {
							this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesFK_IdMesPeriodoDeclara!=null) {
						jComboBoxid_mesFK_IdMesPeriodoDeclara.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesFK_IdMesPeriodoDeclara!=null) {
							//jComboBoxid_mesFK_IdMesPeriodoDeclara.setSelectedItem(mesTemp);
							if(jComboBoxid_mesFK_IdMesPeriodoDeclara.getItemCount()>0) {
								jComboBoxid_mesFK_IdMesPeriodoDeclara.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesPeriodoDeclaraGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesPeriodoDeclaraGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesPeriodoDeclaraGenerico!=null && jComboBoxid_mesPeriodoDeclaraGenerico.getItemCount()>0) {
					jComboBoxid_mesPeriodoDeclaraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(PeriodoDeclara periododeclara,JComboBox jComboBoxid_anioPeriodoDeclaraGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioPeriodoDeclaraGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioPeriodoDeclaraGenerico.getSelectedItem();
			}

			if(anioAux!=null && anioAux.getId()!=null) {
				periododeclara.setid_anio(anioAux.getId());
				periododeclara.setanio_descripcion(PeriodoDeclaraConstantesFunciones.getAnioDescripcion(anioAux));
				periododeclara.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(PeriodoDeclara periododeclara,JComboBox jComboBoxid_mesPeriodoDeclaraGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesPeriodoDeclaraGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesPeriodoDeclaraGenerico.getSelectedItem();
			}

			if(mesAux!=null && mesAux.getId()!=null) {
				periododeclara.setid_mes(mesAux.getId());
				periododeclara.setmes_descripcion(PeriodoDeclaraConstantesFunciones.getMesDescripcion(mesAux));
				periododeclara.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { 
							this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { 
					}

					if(!PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioPeriodoDeclara.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioPeriodoDeclara.addItem(anio);
							}
						}

						if(!PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { 
							this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { 
					}

					if(!PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesFK_IdMesPeriodoDeclara.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesFK_IdMesPeriodoDeclara.addItem(mes);
							}
						}

						if(!PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
							this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
							this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioPeriodoDeclara.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioPeriodoDeclara.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
							this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
							this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesFK_IdMesPeriodoDeclara.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesFK_IdMesPeriodoDeclara.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPeriodoDeclara() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PeriodoDeclaraConstantesFunciones.refrescarForeignKeysDescripcionesPeriodoDeclara(this.periododeclaraLogic.getPeriodoDeclaras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PeriodoDeclaraConstantesFunciones.refrescarForeignKeysDescripcionesPeriodoDeclara(this.periododeclaras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//periododeclaraLogic.setPeriodoDeclaras(this.periododeclaras);
			periododeclaraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PeriodoDeclaraParameterReturnGeneral getPeriodoDeclaraParameterGeneral() {
		return this.periododeclaraParameterGeneral;
	}
	
	public void setPeriodoDeclaraParameterGeneral(PeriodoDeclaraParameterReturnGeneral periododeclaraParameterGeneral) {
		this.periododeclaraParameterGeneral = periododeclaraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPeriodoDeclara() {
		return isPermisoTodoPeriodoDeclara;
	}

	public void setIsPermisoTodoPeriodoDeclara(Boolean isPermisoTodoPeriodoDeclara) {
		this.isPermisoTodoPeriodoDeclara = isPermisoTodoPeriodoDeclara;
	}

	public Boolean getIsPermisoNuevoPeriodoDeclara() {
		return isPermisoNuevoPeriodoDeclara;
	}

	public void setIsPermisoNuevoPeriodoDeclara(Boolean isPermisoNuevoPeriodoDeclara) {
		this.isPermisoNuevoPeriodoDeclara = isPermisoNuevoPeriodoDeclara;
	}

	public Boolean getIsPermisoActualizarPeriodoDeclara() {
		return isPermisoActualizarPeriodoDeclara;
	}

	public void setIsPermisoActualizarPeriodoDeclara(Boolean isPermisoActualizarPeriodoDeclara) {
		this.isPermisoActualizarPeriodoDeclara = isPermisoActualizarPeriodoDeclara;
	}

	public Boolean getIsPermisoEliminarPeriodoDeclara() {
		return isPermisoEliminarPeriodoDeclara;
	}

	public void setIsPermisoEliminarPeriodoDeclara(Boolean isPermisoEliminarPeriodoDeclara) {
		this.isPermisoEliminarPeriodoDeclara = isPermisoEliminarPeriodoDeclara;
	}

	public Boolean getIsPermisoGuardarCambiosPeriodoDeclara() {
		return isPermisoGuardarCambiosPeriodoDeclara;
	}

	public void setIsPermisoGuardarCambiosPeriodoDeclara(Boolean isPermisoGuardarCambiosPeriodoDeclara) {
		this.isPermisoGuardarCambiosPeriodoDeclara = isPermisoGuardarCambiosPeriodoDeclara;
	}
	
	public Boolean getIsPermisoConsultaPeriodoDeclara() {
		return isPermisoConsultaPeriodoDeclara;
	}

	public void setIsPermisoConsultaPeriodoDeclara(Boolean isPermisoConsultaPeriodoDeclara) {
		this.isPermisoConsultaPeriodoDeclara = isPermisoConsultaPeriodoDeclara;
	}

	public Boolean getIsPermisoBusquedaPeriodoDeclara() {
		return isPermisoBusquedaPeriodoDeclara;
	}

	public void setIsPermisoBusquedaPeriodoDeclara(Boolean isPermisoBusquedaPeriodoDeclara) {
		this.isPermisoBusquedaPeriodoDeclara = isPermisoBusquedaPeriodoDeclara;
	}

	public Boolean getIsPermisoReportePeriodoDeclara() {
		return isPermisoReportePeriodoDeclara;
	}

	public void setIsPermisoReportePeriodoDeclara(Boolean isPermisoReportePeriodoDeclara) {
		this.isPermisoReportePeriodoDeclara = isPermisoReportePeriodoDeclara;
	}
	
	public Boolean getIsPermisoPaginacionMedioPeriodoDeclara() {
		return isPermisoPaginacionMedioPeriodoDeclara;
	}

	public void setIsPermisoPaginacionMedioPeriodoDeclara(Boolean isPermisoPaginacionMedioPeriodoDeclara) {
		this.isPermisoPaginacionMedioPeriodoDeclara = isPermisoPaginacionMedioPeriodoDeclara;
	}
	
	public Boolean getIsPermisoPaginacionTodoPeriodoDeclara() {
		return isPermisoPaginacionTodoPeriodoDeclara;
	}

	public void setIsPermisoPaginacionTodoPeriodoDeclara(Boolean isPermisoPaginacionTodoPeriodoDeclara) {
		this.isPermisoPaginacionTodoPeriodoDeclara = isPermisoPaginacionTodoPeriodoDeclara;
	}
	
	public Boolean getIsPermisoPaginacionAltoPeriodoDeclara() {
		return isPermisoPaginacionAltoPeriodoDeclara;
	}

	public void setIsPermisoPaginacionAltoPeriodoDeclara(Boolean isPermisoPaginacionAltoPeriodoDeclara) {
		this.isPermisoPaginacionAltoPeriodoDeclara = isPermisoPaginacionAltoPeriodoDeclara;
	}
	
	public Boolean getIsPermisoCopiarPeriodoDeclara() {
		return isPermisoCopiarPeriodoDeclara;
	}

	public void setIsPermisoCopiarPeriodoDeclara(Boolean isPermisoCopiarPeriodoDeclara) {
		this.isPermisoCopiarPeriodoDeclara = isPermisoCopiarPeriodoDeclara;
	}
	
	public Boolean getIsPermisoVerFormPeriodoDeclara() {
		return isPermisoVerFormPeriodoDeclara;
	}

	public void setIsPermisoVerFormPeriodoDeclara(Boolean isPermisoVerFormPeriodoDeclara) {
		this.isPermisoVerFormPeriodoDeclara = isPermisoVerFormPeriodoDeclara;
	}
	
	public Boolean getIsPermisoDuplicarPeriodoDeclara() {
		return isPermisoDuplicarPeriodoDeclara;
	}

	public void setIsPermisoDuplicarPeriodoDeclara(Boolean isPermisoDuplicarPeriodoDeclara) {
		this.isPermisoDuplicarPeriodoDeclara = isPermisoDuplicarPeriodoDeclara;
	}
	
	public Boolean getIsPermisoOrdenPeriodoDeclara() {
		return isPermisoOrdenPeriodoDeclara;
	}

	public void setIsPermisoOrdenPeriodoDeclara(Boolean isPermisoOrdenPeriodoDeclara) {
		this.isPermisoOrdenPeriodoDeclara = isPermisoOrdenPeriodoDeclara;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPeriodoDeclara() {
		return isVisibilidadCeldaNuevoPeriodoDeclara;
	}

	public void setIsVisibilidadCeldaNuevoPeriodoDeclara(Boolean isVisibilidadCeldaNuevoPeriodoDeclara) {
		this.isVisibilidadCeldaNuevoPeriodoDeclara = isVisibilidadCeldaNuevoPeriodoDeclara;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPeriodoDeclara() {
		return isVisibilidadCeldaDuplicarPeriodoDeclara;
	}

	public void setIsVisibilidadCeldaDuplicarPeriodoDeclara(Boolean isVisibilidadCeldaDuplicarPeriodoDeclara) {
		this.isVisibilidadCeldaDuplicarPeriodoDeclara = isVisibilidadCeldaDuplicarPeriodoDeclara;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPeriodoDeclara() {
		return isVisibilidadCeldaCopiarPeriodoDeclara;
	}

	public void setIsVisibilidadCeldaCopiarPeriodoDeclara(Boolean isVisibilidadCeldaCopiarPeriodoDeclara) {
		this.isVisibilidadCeldaCopiarPeriodoDeclara = isVisibilidadCeldaCopiarPeriodoDeclara;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPeriodoDeclara() {
		return isVisibilidadCeldaVerFormPeriodoDeclara;
	}

	public void setIsVisibilidadCeldaVerFormPeriodoDeclara(Boolean isVisibilidadCeldaVerFormPeriodoDeclara) {
		this.isVisibilidadCeldaVerFormPeriodoDeclara = isVisibilidadCeldaVerFormPeriodoDeclara;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPeriodoDeclara() {
		return isVisibilidadCeldaOrdenPeriodoDeclara;
	}

	public void setIsVisibilidadCeldaOrdenPeriodoDeclara(Boolean isVisibilidadCeldaOrdenPeriodoDeclara) {
		this.isVisibilidadCeldaOrdenPeriodoDeclara = isVisibilidadCeldaOrdenPeriodoDeclara;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPeriodoDeclara() {
		return isVisibilidadCeldaNuevoRelacionesPeriodoDeclara;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPeriodoDeclara(Boolean isVisibilidadCeldaNuevoRelacionesPeriodoDeclara) {
		this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara = isVisibilidadCeldaNuevoRelacionesPeriodoDeclara;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPeriodoDeclara() {
		return isVisibilidadCeldaModificarPeriodoDeclara;
	}

	public void setIsVisibilidadCeldaModificarPeriodoDeclara(Boolean isVisibilidadCeldaModificarPeriodoDeclara) {
		this.isVisibilidadCeldaModificarPeriodoDeclara = isVisibilidadCeldaModificarPeriodoDeclara;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPeriodoDeclara() {
		return isVisibilidadCeldaActualizarPeriodoDeclara;
	}

	public void setIsVisibilidadCeldaActualizarPeriodoDeclara(Boolean isVisibilidadCeldaActualizarPeriodoDeclara) {
		this.isVisibilidadCeldaActualizarPeriodoDeclara = isVisibilidadCeldaActualizarPeriodoDeclara;
	}

	public Boolean getIsVisibilidadCeldaEliminarPeriodoDeclara() {
		return isVisibilidadCeldaEliminarPeriodoDeclara;
	}

	public void setIsVisibilidadCeldaEliminarPeriodoDeclara(Boolean isVisibilidadCeldaEliminarPeriodoDeclara) {
		this.isVisibilidadCeldaEliminarPeriodoDeclara = isVisibilidadCeldaEliminarPeriodoDeclara;
	}

	public Boolean getIsVisibilidadCeldaCancelarPeriodoDeclara() {
		return isVisibilidadCeldaCancelarPeriodoDeclara;
	}

	public void setIsVisibilidadCeldaCancelarPeriodoDeclara(Boolean isVisibilidadCeldaCancelarPeriodoDeclara) {
		this.isVisibilidadCeldaCancelarPeriodoDeclara = isVisibilidadCeldaCancelarPeriodoDeclara;
	}

	public Boolean getIsVisibilidadCeldaGuardarPeriodoDeclara() {
		return isVisibilidadCeldaGuardarPeriodoDeclara;
	}

	public void setIsVisibilidadCeldaGuardarPeriodoDeclara(Boolean isVisibilidadCeldaGuardarPeriodoDeclara) {
		this.isVisibilidadCeldaGuardarPeriodoDeclara = isVisibilidadCeldaGuardarPeriodoDeclara;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPeriodoDeclara() {
		return isVisibilidadCeldaGuardarCambiosPeriodoDeclara;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPeriodoDeclara(Boolean isVisibilidadCeldaGuardarCambiosPeriodoDeclara) {
		this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara = isVisibilidadCeldaGuardarCambiosPeriodoDeclara;
	}
		
	public PeriodoDeclaraSessionBean getperiododeclaraSessionBean() {
		return this.periododeclaraSessionBean;
	}
	
	public void setperiododeclaraSessionBean(PeriodoDeclaraSessionBean periododeclaraSessionBean) {
		this.periododeclaraSessionBean=periododeclaraSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(PeriodoDeclara periododeclara)throws Exception {
		try {
			
				this.setActualParaGuardarAnioForeignKey(periododeclara,null);
				this.setActualParaGuardarMesForeignKey(periododeclara,null);
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
	
	public void bugActualizarReferenciaActual(PeriodoDeclara periododeclara,PeriodoDeclara periododeclaraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPeriodoDeclara(periododeclara);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		periododeclaraAux.setId(periododeclara.getId());
		periododeclaraAux.setVersionRow(periododeclara.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPeriodoDeclara();
		
			int intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = periododeclaraValidator.getInvalidValues(this.periododeclara);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			periododeclaraLogic.setDatosCliente(datosCliente);
			periododeclaraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				periododeclaraAux=new  PeriodoDeclara();
				
				periododeclaraAux.setIsNew(true);
				periododeclaraAux.setIsChanged(true);
				
				periododeclaraAux.setPeriodoDeclaraOriginal(this.periododeclara);
				
				periododeclaraAux.setId(this.periododeclara.getId());	
				periododeclaraAux.setVersionRow(this.periododeclara.getVersionRow());	
				periododeclaraAux.setcodigo(this.periododeclara.getcodigo());	
				periododeclaraAux.setid_anio(this.periododeclara.getid_anio());	
				periododeclaraAux.setid_mes(this.periododeclara.getid_mes());	
				periododeclaraAux.setfecha(this.periododeclara.getfecha());	
				periododeclaraAux.setesta_activo(this.periododeclara.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.periododeclaraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.periododeclaraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(periododeclaraAux,periododeclaraLogic.getPeriodoDeclaras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periododeclaraAux,periododeclaras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.periododeclaraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.periododeclaraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periododeclaraLogic.savePeriodoDeclaras();//WithConnection
						//periododeclaraLogic.getSetVersionRowPeriodoDeclaras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.periododeclara,periododeclaraAux);
					
					this.refrescarForeignKeysDescripcionesPeriodoDeclara();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.periododeclaraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.getRetencionVentas().addAll(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventasEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios().addAll(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiariosEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.getDocumentoAnulados().addAll(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventas.addAll(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventasEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarios.addAll(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiariosEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanulados.addAll(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								periododeclaraLogic.savePeriodoDeclaraRelaciones(periododeclaraAux,this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals(),this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.getRetencionVentas(),this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios(),this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.getDocumentoAnulados());//WithConnection
								//periododeclaraLogic.getSetVersionRowPeriodoDeclaras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.periododeclara,periododeclaraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.setRetencionVentas(new ArrayList<RetencionVenta>());
							this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.setFacturaDiarios(new ArrayList<FacturaDiario>());
							this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.setDocumentoAnulados(new ArrayList<DocumentoAnulado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventas= new ArrayList<RetencionVenta>();
							this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarios= new ArrayList<FacturaDiario>();
							this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanulados= new ArrayList<DocumentoAnulado>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							periododeclaraAux.setTransaccionLocals(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());

							if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.quitarFilaTotales();}
							periododeclaraAux.setRetencionVentas(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.getRetencionVentas());

							if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();}
							periododeclaraAux.setFacturaDiarios(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios());

							if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.quitarFilaTotales();}
							periododeclaraAux.setDocumentoAnulados(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.getDocumentoAnulados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.periododeclaraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.periododeclaraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(periododeclaraAux,periododeclaraLogic.getPeriodoDeclaras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(periododeclaraAux,periododeclaras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.periododeclara,periododeclaraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				periododeclaraAux=new  PeriodoDeclara();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.periododeclaraSessionBean.getEsGuardarRelacionado() 
					|| (this.periododeclaraSessionBean.getEsGuardarRelacionado() && this.periododeclara.getId()>=0)) {
						
					periododeclaraAux.setIsNew(false);
				}
				
				periododeclaraAux.setIsDeleted(false);
			
				periododeclaraAux.setId(this.periododeclara.getId());	
				periododeclaraAux.setVersionRow(this.periododeclara.getVersionRow());	
				periododeclaraAux.setcodigo(this.periododeclara.getcodigo());	
				periododeclaraAux.setid_anio(this.periododeclara.getid_anio());	
				periododeclaraAux.setid_mes(this.periododeclara.getid_mes());	
				periododeclaraAux.setfecha(this.periododeclara.getfecha());	
				periododeclaraAux.setesta_activo(this.periododeclara.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(periododeclaraAux,periododeclaraLogic.getPeriodoDeclaras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periododeclaraAux,periododeclaras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.periododeclaraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.periododeclaraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periododeclaraLogic.savePeriodoDeclaras();//WithConnection
						//periododeclaraLogic.getSetVersionRowPeriodoDeclaras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.periododeclara,periododeclaraAux);
					
					this.refrescarForeignKeysDescripcionesPeriodoDeclara();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.periododeclaraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.getRetencionVentas().addAll(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventasEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios().addAll(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiariosEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.getDocumentoAnulados().addAll(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventas.addAll(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventasEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarios.addAll(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiariosEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanulados.addAll(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								periododeclaraLogic.savePeriodoDeclaraRelaciones(periododeclaraAux,this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals(),this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.getRetencionVentas(),this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios(),this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.getDocumentoAnulados());//WithConnection
								//periododeclaraLogic.getSetVersionRowPeriodoDeclaras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.periododeclara,periododeclaraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.setRetencionVentas(new ArrayList<RetencionVenta>());
							this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.setFacturaDiarios(new ArrayList<FacturaDiario>());
							this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.setDocumentoAnulados(new ArrayList<DocumentoAnulado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventas= new ArrayList<RetencionVenta>();
							this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarios= new ArrayList<FacturaDiario>();
							this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanulados= new ArrayList<DocumentoAnulado>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							periododeclaraAux.setTransaccionLocals(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());

							if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.quitarFilaTotales();}
							periododeclaraAux.setRetencionVentas(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.getRetencionVentas());

							if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();}
							periododeclaraAux.setFacturaDiarios(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios());

							if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.quitarFilaTotales();}
							periododeclaraAux.setDocumentoAnulados(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.getDocumentoAnulados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.periododeclaraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.periododeclaraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(periododeclaraAux,periododeclaraLogic.getPeriodoDeclaras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(periododeclaraAux,periododeclaras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.periododeclara,periododeclaraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				periododeclaraAux=new  PeriodoDeclara();
				
				periododeclaraAux.setIsNew(false);
				periododeclaraAux.setIsChanged(false);
				
				periododeclaraAux.setIsDeleted(true);
				
				periododeclaraAux.setId(this.periododeclara.getId());	
				periododeclaraAux.setVersionRow(this.periododeclara.getVersionRow());	
				periododeclaraAux.setcodigo(this.periododeclara.getcodigo());	
				periododeclaraAux.setid_anio(this.periododeclara.getid_anio());	
				periododeclaraAux.setid_mes(this.periododeclara.getid_mes());	
				periododeclaraAux.setfecha(this.periododeclara.getfecha());	
				periododeclaraAux.setesta_activo(this.periododeclara.getesta_activo());	
				
				if(this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.periododeclaraAux.getId()>=0) {	
						this.periododeclarasEliminados.add(periododeclaraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(periododeclaraAux,periododeclaraLogic.getPeriodoDeclaras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periododeclaraAux,periododeclaras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.periododeclaraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.periododeclaraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periododeclaraLogic.savePeriodoDeclaras();//WithConnection
						//periododeclaraLogic.getSetVersionRowPeriodoDeclaras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.periododeclaraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.getRetencionVentas().addAll(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventasEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios().addAll(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiariosEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.getDocumentoAnulados().addAll(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventas.addAll(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventasEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarios.addAll(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiariosEliminados);
							this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanulados.addAll(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								periododeclaraLogic.savePeriodoDeclaraRelaciones(periododeclaraAux,this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals(),this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.getRetencionVentas(),this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios(),this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.getDocumentoAnulados());//WithConnection
								//periododeclaraLogic.getSetVersionRowPeriodoDeclaras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.setRetencionVentas(new ArrayList<RetencionVenta>());
							this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.setFacturaDiarios(new ArrayList<FacturaDiario>());
							this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.setDocumentoAnulados(new ArrayList<DocumentoAnulado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventas= new ArrayList<RetencionVenta>();
							this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarios= new ArrayList<FacturaDiario>();
							this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanulados= new ArrayList<DocumentoAnulado>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							periododeclaraAux.setTransaccionLocals(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());

							if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.quitarFilaTotales();}
							periododeclaraAux.setRetencionVentas(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.getRetencionVentas());

							if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();}
							periododeclaraAux.setFacturaDiarios(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios());

							if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.quitarFilaTotales();}
							periododeclaraAux.setDocumentoAnulados(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.getDocumentoAnulados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.periododeclaraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.periododeclaraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(periododeclaraAux,periododeclaraLogic.getPeriodoDeclaras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(periododeclaraAux,periododeclaras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.getPeriodoDeclaras().addAll(this.periododeclarasEliminados);
					
					periododeclaraLogic.savePeriodoDeclaras();//WithConnection
					//periododeclaraLogic.getSetVersionRowPeriodoDeclaras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPeriodoDeclara();
				
				this.periododeclarasEliminados= new ArrayList<PeriodoDeclara>();		
			}
			
			if(this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periododeclaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Periodo Declara GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Periodo Declara",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.periododeclara=periododeclaraAux;
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
      		//this.finishProcessPeriodoDeclara();
      	}
		
	}	
	
	public void actualizarRelaciones(PeriodoDeclara periododeclaraLocal) throws Exception {
		
		if(this.periododeclaraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				periododeclaraLocal.setTransaccionLocals(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
				periododeclaraLocal.setRetencionVentas(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.getRetencionVentas());
				periododeclaraLocal.setFacturaDiarios(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios());
				periododeclaraLocal.setDocumentoAnulados(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.getDocumentoAnulados());
			
			} else {
			
				periododeclaraLocal.setTransaccionLocals(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocals);
				periododeclaraLocal.setRetencionVentas(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventas);
				periododeclaraLocal.setFacturaDiarios(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarios);
				periododeclaraLocal.setDocumentoAnulados(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanulados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PeriodoDeclara periododeclaraLocal) throws Exception {	
		if(this.periododeclaraSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				periododeclaraLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				periododeclaraLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPeriodoDeclaraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = periododeclaraValidator.getInvalidValues(this.periododeclara);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PeriodoDeclara periododeclara,List<PeriodoDeclara> periododeclaras) throws Exception {
		try	{		
			PeriodoDeclaraConstantesFunciones.actualizarLista(periododeclara,periododeclaras,this.periododeclaraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PeriodoDeclara periododeclara,List<PeriodoDeclara> periododeclaras) throws Exception {
		try	{			
			PeriodoDeclaraConstantesFunciones.actualizarSelectedLista(periododeclara,periododeclaras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PeriodoDeclara> periododeclarasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				periododeclarasLocal=this.periododeclaraLogic.getPeriodoDeclaras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				periododeclarasLocal=this.periododeclaras;
			}
			//ARCHITECTURE
		
			for(PeriodoDeclara periododeclaraLocal:periododeclarasLocal) {
				if(this.permiteMantenimiento(periododeclaraLocal) && periododeclaraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PeriodoDeclaraConstantesFunciones.getPeriodoDeclaraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PeriodoDeclaraConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoDeclara.jLabelcodigoPeriodoDeclara,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoDeclaraConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoDeclara.jLabelid_anioPeriodoDeclara,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoDeclaraConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoDeclara.jLabelid_mesPeriodoDeclara,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoDeclaraConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoDeclara.jLabelfechaPeriodoDeclara,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoDeclaraConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoDeclara.jLabelesta_activoPeriodoDeclara,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodoDeclara.jLabelcodigoPeriodoDeclara,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodoDeclara.jLabelid_anioPeriodoDeclara,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodoDeclara.jLabelid_mesPeriodoDeclara,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodoDeclara.jLabelfechaPeriodoDeclara,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodoDeclara.jLabelesta_activoPeriodoDeclara,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("TransaccionLocal")) {
			if(this.periododeclara==null) {
				this.periododeclara= new PeriodoDeclara();
			}

			if(this.periododeclaraSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPeriodoDeclara
				this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);

				this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.gettransaccionlocal().setPeriodoDeclara(this.periododeclara);
			}

			return;
		}
		 else  if(sTipo.equals("RetencionVenta")) {
			if(this.periododeclara==null) {
				this.periododeclara= new PeriodoDeclara();
			}

			if(this.periododeclaraSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPeriodoDeclara
				this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);

				this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.getretencionventa().setPeriodoDeclara(this.periododeclara);
			}

			return;
		}
		 else  if(sTipo.equals("FacturaDiario")) {
			if(this.periododeclara==null) {
				this.periododeclara= new PeriodoDeclara();
			}

			if(this.periododeclaraSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPeriodoDeclara
				this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);

				this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.getfacturadiario().setPeriodoDeclara(this.periododeclara);
			}

			return;
		}
		 else  if(sTipo.equals("DocumentoAnulado")) {
			if(this.periododeclara==null) {
				this.periododeclara= new PeriodoDeclara();
			}

			if(this.periododeclaraSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPeriodoDeclara
				this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);

				this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.getdocumentoanulado().setPeriodoDeclara(this.periododeclara);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPeriodoDeclara--;	
		
		
		this.periododeclaraAux=new PeriodoDeclara();
		
		this.periododeclaraAux.setId(this.iIdNuevoPeriodoDeclara);
		this.periododeclaraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.periododeclaraLogic.getPeriodoDeclaras().add(this.periododeclaraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.periododeclaras.add(this.periododeclaraAux);
		}
		//ARCHITECTURE
		
		this.periododeclara=this.periododeclaraAux;
		
		if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPeriodoDeclara(this.periododeclara);
			this.setVariablesObjetoActualToFormularioForeignKeyPeriodoDeclara(this.periododeclara);
		}
				
		//this.setDefaultControlesPeriodoDeclara();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPeriodoDeclara();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPeriodoDeclara();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPeriodoDeclara();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPeriodoDeclara(this.periododeclaraBean,this.periododeclara,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.periododeclaraSessionBean.getConGuardarRelaciones()) {
			classes=PeriodoDeclaraConstantesFunciones.getClassesRelationshipsOfPeriodoDeclara(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.periododeclaraReturnGeneral=periododeclaraLogic.procesarEventosPeriodoDeclarasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.periododeclaraLogic.getPeriodoDeclaras(),this.periododeclara,this.periododeclaraParameterGeneral,this.isEsNuevoPeriodoDeclara,classes);//this.periododeclaraLogic.getPeriodoDeclara()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPeriodoDeclara(this.periododeclaraReturnGeneral,this.periododeclaraBean,false);
		
		if(this.periododeclaraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPeriodoDeclara(this.periododeclaraReturnGeneral.getPeriodoDeclara());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPeriodoDeclara(this.periododeclaraReturnGeneral.getPeriodoDeclara());
		}
		
		if(this.periododeclaraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPeriodoDeclara(this.periododeclaraReturnGeneral.getPeriodoDeclara(),classes);//this.periododeclaraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPeriodoDeclara();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPeriodoDeclara();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.RecargarFormPeriodoDeclara(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPeriodoDeclara(false);
						
			if(periododeclaraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado() && TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionLocalActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaSessionBean.getEsGuardarRelacionado() && RetencionVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRetencionVentaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.getEsGuardarRelacionado() && FacturaDiarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaDiarioActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.getEsGuardarRelacionado() && DocumentoAnuladoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDocumentoAnuladoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPeriodoDeclara();
			}
			
			this.actualizarVisualTableDatosPeriodoDeclara();
			
			this.jTableDatosPeriodoDeclara.setRowSelectionInterval(this.getIndiceNuevoPeriodoDeclara(), this.getIndiceNuevoPeriodoDeclara());
			
			this.seleccionarFilaTablaPeriodoDeclaraActual();
						
			this.actualizarEstadoCeldasBotonesPeriodoDeclara("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPeriodoDeclara(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPeriodoDeclara.jTextFieldcodigoPeriodoDeclara.setEnabled(isHabilitar && this.periododeclaraConstantesFunciones.activarcodigoPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jDateChooserfechaPeriodoDeclara.setEnabled(isHabilitar && this.periododeclaraConstantesFunciones.activarfechaPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxesta_activoPeriodoDeclara.setEnabled(isHabilitar && this.periododeclaraConstantesFunciones.activaresta_activoPeriodoDeclara);	
		
		this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara.setEnabled(isHabilitar && this.periododeclaraConstantesFunciones.activarid_anioPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara.setEnabled(isHabilitar && this.periododeclaraConstantesFunciones.activarid_mesPeriodoDeclara);
	};
	
	public void setDefaultControlesPeriodoDeclara() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPeriodoDeclara(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.periododeclaraSessionBean.setConGuardarRelaciones(true);			
			this.periododeclaraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPeriodoDeclara.jTabbedPaneRelacionesPeriodoDeclara.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.periododeclaraSessionBean.setConGuardarRelaciones(false);			
			this.periododeclaraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPeriodoDeclara.jTabbedPaneRelacionesPeriodoDeclara.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoPeriodoDeclara() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoDeclara periododeclaraAux:this.periododeclaraLogic.getPeriodoDeclaras()) {
				if(periododeclaraAux.getId().equals(this.iIdNuevoPeriodoDeclara)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoDeclara periododeclaraAux:this.periododeclaras) {
				if(periododeclaraAux.getId().equals(this.iIdNuevoPeriodoDeclara)) {
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
	
	public int getIndiceActualPeriodoDeclara(PeriodoDeclara periododeclara,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoDeclara periododeclaraAux:this.periododeclaraLogic.getPeriodoDeclaras()) {
				if(periododeclaraAux.getId().equals(periododeclara.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoDeclara periododeclaraAux:this.periododeclaras) {
				if(periododeclaraAux.getId().equals(periododeclara.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPeriodoDeclara(PeriodoDeclara periododeclaraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoDeclara periododeclaraAux:this.periododeclaraLogic.getPeriodoDeclaras()) {
				if(periododeclaraAux.getPeriodoDeclaraOriginal().getId().equals(periododeclaraOriginal.getId())) {
					existe=true;
					periododeclaraOriginal.setId(periododeclaraAux.getId());
					periododeclaraOriginal.setVersionRow(periododeclaraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoDeclara periododeclaraAux:this.periododeclaras) {
				if(periododeclaraAux.getPeriodoDeclaraOriginal().getId().equals(periododeclaraOriginal.getId())) {
					existe=true;
					periododeclaraOriginal.setId(periododeclaraAux.getId());
					periododeclaraOriginal.setVersionRow(periododeclaraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPeriodoDeclara(Boolean esParaCancelar) throws Exception {
		periododeclarasAux=new ArrayList<PeriodoDeclara>();
		periododeclaraAux=new PeriodoDeclara();
		
		if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PeriodoDeclara periododeclaraAux:this.periododeclaraLogic.getPeriodoDeclaras()) {
					if(periododeclaraAux.getId()<0) {
						periododeclarasAux.add(periododeclaraAux);
					}		
				}
				this.iIdNuevoPeriodoDeclara=0L;
				this.periododeclaraLogic.getPeriodoDeclaras().removeAll(periododeclarasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PeriodoDeclara periododeclaraAux:this.periododeclaras) {
					if(periododeclaraAux.getId()<0) {
						periododeclarasAux.add(periododeclaraAux);
					}		
				}
				this.iIdNuevoPeriodoDeclara=0L;
				this.periododeclaras.removeAll(periododeclarasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPeriodoDeclara 
					&& this.periododeclaraLogic.getPeriodoDeclaras().size()>0
					) {
					periododeclaraAux=this.periododeclaraLogic.getPeriodoDeclaras().get(this.periododeclaraLogic.getPeriodoDeclaras().size() - 1);
				
					if(periododeclaraAux.getId()<0) {
						this.periododeclaraLogic.getPeriodoDeclaras().remove(periododeclaraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPeriodoDeclara && this.periododeclaras.size()>0) {
					periododeclaraAux=this.periododeclaras.get(this.periododeclaras.size() - 1);
				
					if(periododeclaraAux.getId()<0) {
						this.periododeclaras.remove(periododeclaraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPeriodoDeclara(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(periododeclara.getId()<0) {
				this.periododeclaraLogic.getPeriodoDeclaras().remove(this.periododeclara);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(periododeclara.getId()<0) {
				this.periododeclaras.remove(this.periododeclara);
			}
		}			
	}
	
	public void setEstadosInicialesPeriodoDeclara(List<PeriodoDeclara> periododeclarasAux) throws Exception {
		PeriodoDeclaraConstantesFunciones.setEstadosInicialesPeriodoDeclara(periododeclarasAux);
	}
	
	public void setEstadosInicialesPeriodoDeclara(PeriodoDeclara periododeclaraAux) throws Exception {
		PeriodoDeclaraConstantesFunciones.setEstadosInicialesPeriodoDeclara(periododeclaraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPeriodoDeclaraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPeriodoDeclara("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPeriodoDeclaraActual()) {
				if(!this.isEsNuevoPeriodoDeclara) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPeriodoDeclara("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPeriodoDeclara=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPeriodoDeclaraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Periodo Declara ?", "MANTENIMIENTO DE Periodo Declara", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPeriodoDeclara("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PeriodoDeclara periododeclara) throws Exception {
		PeriodoDeclaraConstantesFunciones.seleccionarAsignar(this.periododeclara,periododeclara);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPeriodoDeclara=this.isPermisoActualizarOriginalPeriodoDeclara;
			
			
			this.seleccionarAsignar(periododeclara);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PeriodoDeclaraConstantesFunciones.quitarEspaciosPeriodoDeclara(this.periododeclara,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPeriodoDeclara("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.periododeclaraSessionBean.setsFuncionBusquedaRapida(this.periododeclaraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPeriodoDeclara) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPeriodoDeclara(esParaCancelar);				
				this.cancelarNuevoPeriodoDeclara(esParaCancelar);								
			}
			
			this.periododeclara=new PeriodoDeclara();
			
			this.inicializarPeriodoDeclara();
			
			this.actualizarEstadoCeldasBotonesPeriodoDeclara("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPeriodoDeclara() throws Exception {
		try {
			PeriodoDeclaraConstantesFunciones.inicializarPeriodoDeclara(this.periododeclara);
			
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
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.periododeclaraLogic.getPeriodoDeclaras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePeriodoDeclaras(String sAccionBusqueda,List<PeriodoDeclara> periododeclarasParaReportes) throws Exception {
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
					sPathReporteFinal="PeriodoDeclara"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PeriodoDeclaraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PeriodoDeclaraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PeriodoDeclara"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Periodo Declaras");		
		parameters.put("busquedapor", PeriodoDeclaraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(TransaccionLocal.class));
			classes.add(new Classe(RetencionVenta.class));
			classes.add(new Classe(FacturaDiario.class));
			classes.add(new Classe(DocumentoAnulado.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					PeriodoDeclaraLogic periododeclaraLogicAuxiliar=new PeriodoDeclaraLogic();
					periododeclaraLogicAuxiliar.setDatosCliente(periododeclaraLogic.getDatosCliente());				
					periododeclaraLogicAuxiliar.setPeriodoDeclaras(periododeclarasParaReportes);
					
					periododeclaraLogicAuxiliar.cargarRelacionesLoteForeignKeyPeriodoDeclaraWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					periododeclarasParaReportes=periododeclaraLogicAuxiliar.getPeriodoDeclaras();
					
					//periododeclaraLogic.getNewConnexionToDeep();
					
					//for (PeriodoDeclara periododeclara:periododeclarasParaReportes) {
					//	periododeclaraLogic.deepLoad(periododeclara, false, DeepLoadType.INCLUDE, classes);
					//}						
					//periododeclaraLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//periododeclaraLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileTransaccionLocal = AuxiliarReportes.class.getResourceAsStream("TransaccionLocalDetalleRelacionesDesign.jasper");
			parameters.put("subreport_transaccionlocal", reportFileTransaccionLocal);

			InputStream reportFileRetencionVenta = AuxiliarReportes.class.getResourceAsStream("RetencionVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_retencionventa", reportFileRetencionVenta);

			InputStream reportFileFacturaDiario = AuxiliarReportes.class.getResourceAsStream("FacturaDiarioDetalleRelacionesDesign.jasper");
			parameters.put("subreport_facturadiario", reportFileFacturaDiario);

			InputStream reportFileDocumentoAnulado = AuxiliarReportes.class.getResourceAsStream("DocumentoAnuladoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_documentoanulado", reportFileDocumentoAnulado);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePeriodoDeclara=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PeriodoDeclaraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PeriodoDeclaraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePeriodoDeclara=new JRBeanArrayDataSource(PeriodoDeclaraJInternalFrame.TraerPeriodoDeclaraBeans(periododeclarasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePeriodoDeclara);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PeriodoDeclaraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PeriodoDeclaraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PeriodoDeclaraBean.TraerPeriodoDeclaraBeans(periododeclarasParaReportes).toArray()));
							
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
				this.generarExcelReportePeriodoDeclaras(sAccionBusqueda,sTipoArchivoReporte,periododeclarasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPeriodoDeclaras(sAccionBusqueda,sTipoArchivoReporte,periododeclarasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPeriodoDeclaraActionPerformed(null);
					//this.generarExcelReportePeriodoDeclaras(sAccionBusqueda,sTipoArchivoReporte,periododeclarasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPeriodoDeclaras(sAccionBusqueda,sTipoArchivoReporte,periododeclarasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPeriodoDeclaras(sAccionBusqueda,sTipoArchivoReporte,periododeclarasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPeriodoDeclaras(sAccionBusqueda,sTipoArchivoReporte,periododeclarasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePeriodoDeclaras(String sAccionBusqueda,String sTipoArchivoReporte,List<PeriodoDeclara> periododeclarasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periododeclara";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PeriodoDeclaras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPeriodoDeclara("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PeriodoDeclara periododeclara : periododeclarasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PeriodoDeclaraConstantesFunciones.generarExcelReporteDataPeriodoDeclara("NORMAL",row,workbook,periododeclara,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periododeclaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Declara",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPeriodoDeclara(String sTipo,Row row,Workbook workbook) {
		
		PeriodoDeclaraConstantesFunciones.generarExcelReporteHeaderPeriodoDeclara(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPeriodoDeclaras(String sAccionBusqueda,String sTipoArchivoReporte,List<PeriodoDeclara> periododeclarasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periododeclara_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PeriodoDeclaras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PeriodoDeclara periododeclara : periododeclarasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PeriodoDeclaraConstantesFunciones.getPeriodoDeclaraDescripcion(periododeclara));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoDeclaraConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periododeclara.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoDeclaraConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periododeclara.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoDeclaraConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periododeclara.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoDeclaraConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periododeclara.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(periododeclara.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periododeclaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Declara",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPeriodoDeclaras(String sAccionBusqueda,String sTipoArchivoReporte,List<PeriodoDeclara> periododeclarasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PeriodoDeclara> periododeclarasRespaldo=null;
		
		classes=PeriodoDeclaraConstantesFunciones.getClassesRelationshipsOfPeriodoDeclara(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.periododeclaraLogic.setDatosCliente(this.datosCliente);
		this.periododeclaraLogic.setDatosDeep(this.datosDeep);
		this.periododeclaraLogic.setIsConDeep(true);
		
		periododeclarasRespaldo=this.periododeclaraLogic.getPeriodoDeclaras();
		
		this.periododeclaraLogic.setPeriodoDeclaras(periododeclarasParaReportes);	
		this.periododeclaraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		periododeclarasParaReportes=this.periododeclaraLogic.getPeriodoDeclaras();
		this.periododeclaraLogic.setPeriodoDeclaras(periododeclarasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periododeclara_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PeriodoDeclaras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPeriodoDeclara("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PeriodoDeclara periododeclara : periododeclarasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPeriodoDeclara("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PeriodoDeclaraConstantesFunciones.generarExcelReporteDataPeriodoDeclara("NORMAL",row,workbook,periododeclara,cellStyleDataAux);
		
			
			


				//TransaccionLocal
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO))) {

				if(periododeclara.getTransaccionLocals()!=null && periododeclara.getTransaccionLocals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TransaccionLocalConstantesFunciones.generarExcelReporteHeaderTransaccionLocal("RELACIONADO",row,workbook);
				}

				if(periododeclara.getTransaccionLocals()!=null) {
					i2=0;
					for(TransaccionLocal transaccionlocal : periododeclara.getTransaccionLocals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TransaccionLocalConstantesFunciones.generarExcelReporteDataTransaccionLocal("RELACIONADO",row,workbook,transaccionlocal,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//RetencionVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(RetencionVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(periododeclara.getRetencionVentas()!=null && periododeclara.getRetencionVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(RetencionVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					RetencionVentaConstantesFunciones.generarExcelReporteHeaderRetencionVenta("RELACIONADO",row,workbook);
				}

				if(periododeclara.getRetencionVentas()!=null) {
					i2=0;
					for(RetencionVenta retencionventa : periododeclara.getRetencionVentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						RetencionVentaConstantesFunciones.generarExcelReporteDataRetencionVenta("RELACIONADO",row,workbook,retencionventa,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//FacturaDiario
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FacturaDiarioConstantesFunciones.SCLASSWEBTITULO))) {

				if(periododeclara.getFacturaDiarios()!=null && periododeclara.getFacturaDiarios().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FacturaDiarioConstantesFunciones.generarExcelReporteHeaderFacturaDiario("RELACIONADO",row,workbook);
				}

				if(periododeclara.getFacturaDiarios()!=null) {
					i2=0;
					for(FacturaDiario facturadiario : periododeclara.getFacturaDiarios()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FacturaDiarioConstantesFunciones.generarExcelReporteDataFacturaDiario("RELACIONADO",row,workbook,facturadiario,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DocumentoAnulado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO))) {

				if(periododeclara.getDocumentoAnulados()!=null && periododeclara.getDocumentoAnulados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DocumentoAnuladoConstantesFunciones.generarExcelReporteHeaderDocumentoAnulado("RELACIONADO",row,workbook);
				}

				if(periododeclara.getDocumentoAnulados()!=null) {
					i2=0;
					for(DocumentoAnulado documentoanulado : periododeclara.getDocumentoAnulados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DocumentoAnuladoConstantesFunciones.generarExcelReporteDataDocumentoAnulado("RELACIONADO",row,workbook,documentoanulado,cellStyleDataAuxHijo);
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
		cell.setCellValue(PeriodoDeclaraConstantesFunciones.getPeriodoDeclaraDescripcion(periododeclara));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periododeclaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Declara",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPeriodoDeclara() throws Exception {		
		this.startProcessPeriodoDeclara(true);
	}
	
	public void startProcessPeriodoDeclara(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPeriodoDeclara ,this.jPanelParametrosReportesPeriodoDeclara, this.jScrollPanelDatosPeriodoDeclara,this.jPanelPaginacionPeriodoDeclara, this.jScrollPanelDatosEdicionPeriodoDeclara, this.jPanelAccionesPeriodoDeclara,this.jPanelAccionesFormularioPeriodoDeclara,this.jmenuBarPeriodoDeclara,this.jmenuBarDetallePeriodoDeclara,this.jTtoolBarPeriodoDeclara,this.jTtoolBarDetallePeriodoDeclara);		
		
		final JTabbedPane jTabbedPaneBusquedasPeriodoDeclara=this.jTabbedPaneBusquedasPeriodoDeclara; 
		
		final JPanel jPanelParametrosReportesPeriodoDeclara=this.jPanelParametrosReportesPeriodoDeclara;
		//final JScrollPane jScrollPanelDatosPeriodoDeclara=this.jScrollPanelDatosPeriodoDeclara;
		final JTable jTableDatosPeriodoDeclara=this.jTableDatosPeriodoDeclara;		
		final JPanel jPanelPaginacionPeriodoDeclara=this.jPanelPaginacionPeriodoDeclara;
		//final JScrollPane jScrollPanelDatosEdicionPeriodoDeclara=this.jScrollPanelDatosEdicionPeriodoDeclara;
		final JPanel jPanelAccionesPeriodoDeclara=this.jPanelAccionesPeriodoDeclara;
		
		JPanel jPanelCamposAuxiliarPeriodoDeclara=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPeriodoDeclara=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
			jPanelCamposAuxiliarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jPanelCamposPeriodoDeclara;
			jPanelAccionesFormularioAuxiliarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jPanelAccionesFormularioPeriodoDeclara;
		}
		
		final JPanel jPanelCamposPeriodoDeclara=jPanelCamposAuxiliarPeriodoDeclara;
		final JPanel jPanelAccionesFormularioPeriodoDeclara=jPanelAccionesFormularioAuxiliarPeriodoDeclara;
		
		
		final JMenuBar jmenuBarPeriodoDeclara=this.jmenuBarPeriodoDeclara;
		final JToolBar jTtoolBarPeriodoDeclara=this.jTtoolBarPeriodoDeclara;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPeriodoDeclara=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPeriodoDeclara=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
			jmenuBarDetalleAuxiliarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jmenuBarDetallePeriodoDeclara;
			jTtoolBarDetalleAuxiliarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jTtoolBarDetallePeriodoDeclara;
		}
		
		final JMenuBar jmenuBarDetallePeriodoDeclara=jmenuBarDetalleAuxiliarPeriodoDeclara;
		final JToolBar jTtoolBarDetallePeriodoDeclara=jTtoolBarDetalleAuxiliarPeriodoDeclara;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPeriodoDeclara;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPeriodoDeclara;
			processRunnable.jTableDatos=jTableDatosPeriodoDeclara;
			processRunnable.jPanelCampos=jPanelCamposPeriodoDeclara;
			processRunnable.jPanelPaginacion=jPanelPaginacionPeriodoDeclara;
			processRunnable.jPanelAcciones=jPanelAccionesPeriodoDeclara;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPeriodoDeclara;
			
			
			processRunnable.jmenuBar=jmenuBarPeriodoDeclara;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePeriodoDeclara;
			processRunnable.jTtoolBar=jTtoolBarPeriodoDeclara;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePeriodoDeclara;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPeriodoDeclara ,jPanelParametrosReportesPeriodoDeclara,jTableDatosPeriodoDeclara, /*jScrollPanelDatosPeriodoDeclara,*/jPanelCamposPeriodoDeclara,jPanelPaginacionPeriodoDeclara, /*jScrollPanelDatosEdicionPeriodoDeclara,*/ jPanelAccionesPeriodoDeclara,jPanelAccionesFormularioPeriodoDeclara,jmenuBarPeriodoDeclara,jmenuBarDetallePeriodoDeclara,jTtoolBarPeriodoDeclara,jTtoolBarDetallePeriodoDeclara);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPeriodoDeclara ,jPanelParametrosReportesPeriodoDeclara, jScrollPanelDatosPeriodoDeclara,jPanelPaginacionPeriodoDeclara, jScrollPanelDatosEdicionPeriodoDeclara, jPanelAccionesPeriodoDeclara,jPanelAccionesFormularioPeriodoDeclara,jmenuBarPeriodoDeclara,jmenuBarDetallePeriodoDeclara,jTtoolBarPeriodoDeclara,jTtoolBarDetallePeriodoDeclara);
						
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
	
	public void finishProcessPeriodoDeclara() {// throws Exception 
		this.finishProcessPeriodoDeclara(true);
	}
	
	public void finishProcessPeriodoDeclara(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPeriodoDeclara ,this.jPanelParametrosReportesPeriodoDeclara, this.jScrollPanelDatosPeriodoDeclara,this.jPanelPaginacionPeriodoDeclara, this.jScrollPanelDatosEdicionPeriodoDeclara, this.jPanelAccionesPeriodoDeclara,this.jPanelAccionesFormularioPeriodoDeclara,this.jmenuBarPeriodoDeclara,this.jmenuBarDetallePeriodoDeclara,this.jTtoolBarPeriodoDeclara,this.jTtoolBarDetallePeriodoDeclara);		
		
		final JTabbedPane jTabbedPaneBusquedasPeriodoDeclara=this.jTabbedPaneBusquedasPeriodoDeclara; 
		
		final JPanel jPanelParametrosReportesPeriodoDeclara=this.jPanelParametrosReportesPeriodoDeclara;
		//final JScrollPane jScrollPanelDatosPeriodoDeclara=this.jScrollPanelDatosPeriodoDeclara;
		final JTable jTableDatosPeriodoDeclara=this.jTableDatosPeriodoDeclara;		
		final JPanel jPanelPaginacionPeriodoDeclara=this.jPanelPaginacionPeriodoDeclara;
		//final JScrollPane jScrollPanelDatosEdicionPeriodoDeclara=this.jScrollPanelDatosEdicionPeriodoDeclara;
		final JPanel jPanelAccionesPeriodoDeclara=this.jPanelAccionesPeriodoDeclara;
		
		JPanel jPanelCamposAuxiliarPeriodoDeclara=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPeriodoDeclara=new JPanel();
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
			jPanelCamposAuxiliarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jPanelCamposPeriodoDeclara;
			jPanelAccionesFormularioAuxiliarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jPanelAccionesFormularioPeriodoDeclara;
		}
		
		final JPanel jPanelCamposPeriodoDeclara=jPanelCamposAuxiliarPeriodoDeclara;
		final JPanel jPanelAccionesFormularioPeriodoDeclara=jPanelAccionesFormularioAuxiliarPeriodoDeclara;
		
		
		final JMenuBar jmenuBarPeriodoDeclara=this.jmenuBarPeriodoDeclara;		
		final JToolBar jTtoolBarPeriodoDeclara=this.jTtoolBarPeriodoDeclara;
				
		JMenuBar jmenuBarDetalleAuxiliarPeriodoDeclara=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPeriodoDeclara=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
			jmenuBarDetalleAuxiliarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jmenuBarDetallePeriodoDeclara;
			jTtoolBarDetalleAuxiliarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jTtoolBarDetallePeriodoDeclara;		
		}
		
		final JMenuBar jmenuBarDetallePeriodoDeclara=jmenuBarDetalleAuxiliarPeriodoDeclara;
		final JToolBar jTtoolBarDetallePeriodoDeclara=jTtoolBarDetalleAuxiliarPeriodoDeclara;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPeriodoDeclara;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPeriodoDeclara;
			processRunnable.jTableDatos=jTableDatosPeriodoDeclara;
			processRunnable.jPanelCampos=jPanelCamposPeriodoDeclara;
			processRunnable.jPanelPaginacion=jPanelPaginacionPeriodoDeclara;
			processRunnable.jPanelAcciones=jPanelAccionesPeriodoDeclara;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPeriodoDeclara;
			
			
			processRunnable.jmenuBar=jmenuBarPeriodoDeclara;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePeriodoDeclara;
			processRunnable.jTtoolBar=jTtoolBarPeriodoDeclara;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePeriodoDeclara;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPeriodoDeclara ,jPanelParametrosReportesPeriodoDeclara, jTableDatosPeriodoDeclara,/*jScrollPanelDatosPeriodoDeclara,*/jPanelCamposPeriodoDeclara,jPanelPaginacionPeriodoDeclara, /*jScrollPanelDatosEdicionPeriodoDeclara,*/ jPanelAccionesPeriodoDeclara,jPanelAccionesFormularioPeriodoDeclara,jmenuBarPeriodoDeclara,jmenuBarDetallePeriodoDeclara,jTtoolBarPeriodoDeclara,jTtoolBarDetallePeriodoDeclara));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPeriodoDeclara(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPeriodoDeclara(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPeriodoDeclara(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPeriodoDeclara(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPeriodoDeclara,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePeriodoDeclara,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPeriodoDeclara(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPeriodoDeclara,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePeriodoDeclara,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.periododeclaraConstantesFunciones.getsFinalQueryPeriodoDeclara();
		String  finalQueryPaginacionTodos=this.periododeclaraConstantesFunciones.getsFinalQueryPeriodoDeclara();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PeriodoDeclaraConstantesFunciones.getArrayColumnasGlobalesNoPeriodoDeclara(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PeriodoDeclaraConstantesFunciones.getArrayColumnasGlobalesPeriodoDeclara(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PeriodoDeclaraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.periododeclarasEliminados= new ArrayList<PeriodoDeclara>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPeriodoDeclara();
		
				///*PeriodoDeclaraSessionBean*/this.periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
			
			if(this.periododeclaraSessionBean==null) {
				this.periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
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
					this.iNumeroPaginacion=PeriodoDeclaraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PeriodoDeclaraConstantesFunciones.getClassesForeignKeysOfPeriodoDeclara(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/periododeclara."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			periododeclarasAux= new ArrayList<PeriodoDeclara>();
			
				
			periododeclaraLogic.setDatosCliente(this.datosCliente);
			periododeclaraLogic.setDatosDeep(this.datosDeep);
			periododeclaraLogic.setIsConDeep(true);
			
			
			periododeclaraLogic.getPeriodoDeclaraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					periododeclaraLogic.getTodosPeriodoDeclaras(finalQueryGlobal,pagination);
					
					//periododeclaraLogic.getTodosPeriodoDeclarasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(periododeclaraLogic.getPeriodoDeclaras()==null|| periododeclaraLogic.getPeriodoDeclaras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							periododeclarasAux= new ArrayList<PeriodoDeclara>();
							periododeclarasAux.addAll(periododeclaraLogic.getPeriodoDeclaras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periododeclarasAux= new ArrayList<PeriodoDeclara>();
							periododeclarasAux.addAll(periododeclaras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							periododeclaraLogic.getTodosPeriodoDeclaras(finalQueryGlobal+"",this.pagination);												
							
							//periododeclaraLogic.getTodosPeriodoDeclarasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePeriodoDeclaras("Todos",periododeclaraLogic.getPeriodoDeclaras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							periododeclaraLogic.setPeriodoDeclaras(new ArrayList<PeriodoDeclara>());					
							periododeclaraLogic.getPeriodoDeclaras().addAll(periododeclarasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periododeclaras=new ArrayList<PeriodoDeclara>();
							periododeclaras.addAll(periododeclarasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPeriodoDeclara=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPeriodoDeclara=this.idActual;
				
				} else if(this.idPeriodoDeclaraActual!=null && this.idPeriodoDeclaraActual!=0L) {
					idPeriodoDeclara=idPeriodoDeclaraActual;
				}
				
					
				this.sDetalleReporte=PeriodoDeclaraConstantesFunciones.getDetalleIndicePorId(idPeriodoDeclara);
				
				this.periododeclaras=new ArrayList<PeriodoDeclara>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					periododeclaraLogic.getEntity(idPeriodoDeclara);
					
					//periododeclaraLogic.getEntityWithConnection(idPeriodoDeclara);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periododeclaraLogic.setPeriodoDeclaras(new ArrayList<PeriodoDeclara>());
					periododeclaraLogic.getPeriodoDeclaras().add(periododeclaraLogic.getPeriodoDeclara());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periododeclaras=new ArrayList<PeriodoDeclara>();
					this.periododeclaras.add(periododeclara);
				}
				
				if(periododeclaraLogic.getPeriodoDeclara()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=PeriodoDeclaraConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					periododeclaraLogic.getPeriodoDeclarasFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoDeclaraConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoDeclaraConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=periododeclaraLogic.getPeriodoDeclaras()==null||periododeclaraLogic.getPeriodoDeclaras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=periododeclaras==null|| periododeclaras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						periododeclarasAux=new ArrayList<PeriodoDeclara>();
						periododeclarasAux.addAll(periododeclaraLogic.getPeriodoDeclaras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periododeclarasAux=new ArrayList<PeriodoDeclara>();
							periododeclarasAux.addAll(periododeclaras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							periododeclaraLogic.getPeriodoDeclarasFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoDeclaraConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoDeclaraConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePeriodoDeclaras("FK_IdAnio",periododeclaraLogic.getPeriodoDeclaras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePeriodoDeclaras("FK_IdAnio",periododeclaras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						periododeclaraLogic.setPeriodoDeclaras(new ArrayList<PeriodoDeclara>());
						periododeclaraLogic.getPeriodoDeclaras().addAll(periododeclarasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periododeclaras=new ArrayList<PeriodoDeclara>();
							periododeclaras.addAll(periododeclarasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMes")) {
				this.sDetalleReporte=PeriodoDeclaraConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					periododeclaraLogic.getPeriodoDeclarasFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoDeclaraConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoDeclaraConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=periododeclaraLogic.getPeriodoDeclaras()==null||periododeclaraLogic.getPeriodoDeclaras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=periododeclaras==null|| periododeclaras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						periododeclarasAux=new ArrayList<PeriodoDeclara>();
						periododeclarasAux.addAll(periododeclaraLogic.getPeriodoDeclaras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periododeclarasAux=new ArrayList<PeriodoDeclara>();
							periododeclarasAux.addAll(periododeclaras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							periododeclaraLogic.getPeriodoDeclarasFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoDeclaraConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoDeclaraConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePeriodoDeclaras("FK_IdMes",periododeclaraLogic.getPeriodoDeclaras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePeriodoDeclaras("FK_IdMes",periododeclaras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						periododeclaraLogic.setPeriodoDeclaras(new ArrayList<PeriodoDeclara>());
						periododeclaraLogic.getPeriodoDeclaras().addAll(periododeclarasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periododeclaras=new ArrayList<PeriodoDeclara>();
							periododeclaras.addAll(periododeclarasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPeriodoDeclara();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPeriodoDeclara();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=periododeclaraLogic.getPeriodoDeclaras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=periododeclaras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=periododeclaraLogic.getPeriodoDeclaras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=periododeclaras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PeriodoDeclara periododeclara) {
		Boolean permite=true;
		
		if(this.periododeclara.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PeriodoDeclaraConstantesFunciones.getOrderByListaPeriodoDeclara();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PeriodoDeclaraConstantesFunciones.getOrderByListaPeriodoDeclara();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoDeclara periododeclara:periododeclaraLogic.getPeriodoDeclaras()) {
				if(periododeclara.getsType().equals(Constantes2.S_TOTALES)) {
					periododeclaraTotales=periododeclara;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoDeclara periododeclara:this.periododeclaras) {
				if(periododeclara.getsType().equals(Constantes2.S_TOTALES)) {
					periododeclaraTotales=periododeclara;
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
			this.periododeclaraAux=new PeriodoDeclara();
			this.periododeclaraAux.setsType(Constantes2.S_TOTALES);
			this.periododeclaraAux.setIsNew(false);
			this.periododeclaraAux.setIsChanged(false);
			this.periododeclaraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PeriodoDeclaraConstantesFunciones.TotalizarValoresFilaPeriodoDeclara(this.periododeclaraLogic.getPeriodoDeclaras(),this.periododeclaraAux);
				
				this.periododeclaraLogic.getPeriodoDeclaras().add(this.periododeclaraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PeriodoDeclaraConstantesFunciones.TotalizarValoresFilaPeriodoDeclara(this.periododeclaras,this.periododeclaraAux);
				
				this.periododeclaras.add(this.periododeclaraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		periododeclaraTotales=new PeriodoDeclara();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.periododeclaraLogic.getPeriodoDeclaras().remove(periododeclaraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.periododeclaras.remove(periododeclaraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		periododeclaraTotales=new PeriodoDeclara();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoDeclara periododeclara:periododeclaraLogic.getPeriodoDeclaras()) {
				if(periododeclara.getsType().equals(Constantes2.S_TOTALES)) {
					periododeclaraTotales=periododeclara;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PeriodoDeclaraConstantesFunciones.TotalizarValoresFilaPeriodoDeclara(this.periododeclaraLogic.getPeriodoDeclaras(),periododeclaraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoDeclara periododeclara:this.periododeclaras) {
				if(periododeclara.getsType().equals(Constantes2.S_TOTALES)) {
					periododeclaraTotales=periododeclara;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PeriodoDeclaraConstantesFunciones.TotalizarValoresFilaPeriodoDeclara(this.periododeclaras,periododeclaraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPeriodoDeclarasFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPeriodoDeclarasFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPeriodoDeclarasFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periododeclaraLogic.getPeriodoDeclarasFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPeriodoDeclarasFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periododeclaraLogic.getPeriodoDeclarasFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
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
	
	public void inicializarPermisosPeriodoDeclara() {
		this.isPermisoTodoPeriodoDeclara=false;
		this.isPermisoNuevoPeriodoDeclara=false;
		this.isPermisoActualizarPeriodoDeclara=false;
		this.isPermisoActualizarOriginalPeriodoDeclara=false;
		this.isPermisoEliminarPeriodoDeclara=false;
		this.isPermisoGuardarCambiosPeriodoDeclara=false;
		this.isPermisoConsultaPeriodoDeclara=false;
		this.isPermisoBusquedaPeriodoDeclara=false;
		this.isPermisoReportePeriodoDeclara=false;		
		this.isPermisoOrdenPeriodoDeclara=false;		
		this.isPermisoPaginacionMedioPeriodoDeclara=false;		
		this.isPermisoPaginacionAltoPeriodoDeclara=false;
		this.isPermisoPaginacionTodoPeriodoDeclara=false;
		this.isPermisoCopiarPeriodoDeclara=false;		
		this.isPermisoVerFormPeriodoDeclara=false;		
		this.isPermisoDuplicarPeriodoDeclara=false;		
		this.isPermisoOrdenPeriodoDeclara=false;		
	}
	
	public void setPermisosUsuarioPeriodoDeclara(Boolean isPermiso) {
		this.isPermisoTodoPeriodoDeclara=isPermiso;
		this.isPermisoNuevoPeriodoDeclara=isPermiso;
		this.isPermisoActualizarPeriodoDeclara=isPermiso;
		this.isPermisoActualizarOriginalPeriodoDeclara=isPermiso;
		this.isPermisoEliminarPeriodoDeclara=isPermiso;
		this.isPermisoGuardarCambiosPeriodoDeclara=isPermiso;
		this.isPermisoConsultaPeriodoDeclara=isPermiso;
		this.isPermisoBusquedaPeriodoDeclara=isPermiso;
		this.isPermisoReportePeriodoDeclara=isPermiso;
		this.isPermisoOrdenPeriodoDeclara=isPermiso;		
		this.isPermisoPaginacionMedioPeriodoDeclara=isPermiso;		
		this.isPermisoPaginacionAltoPeriodoDeclara=isPermiso;		
		this.isPermisoPaginacionTodoPeriodoDeclara=isPermiso;		
		this.isPermisoCopiarPeriodoDeclara=isPermiso;		
		this.isPermisoVerFormPeriodoDeclara=isPermiso;		
		this.isPermisoDuplicarPeriodoDeclara=isPermiso;
		this.isPermisoOrdenPeriodoDeclara=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPeriodoDeclara(Boolean isPermiso) {
		//this.isPermisoTodoPeriodoDeclara=isPermiso;
		this.isPermisoNuevoPeriodoDeclara=isPermiso;
		this.isPermisoActualizarPeriodoDeclara=isPermiso;
		this.isPermisoActualizarOriginalPeriodoDeclara=isPermiso;
		this.isPermisoEliminarPeriodoDeclara=isPermiso;
		this.isPermisoGuardarCambiosPeriodoDeclara=isPermiso;
		//this.isPermisoConsultaPeriodoDeclara=isPermiso;
		//this.isPermisoBusquedaPeriodoDeclara=isPermiso;
		//this.isPermisoReportePeriodoDeclara=isPermiso;
		//this.isPermisoOrdenPeriodoDeclara=isPermiso;		
		//this.isPermisoPaginacionMedioPeriodoDeclara=isPermiso;		
		//this.isPermisoPaginacionAltoPeriodoDeclara=isPermiso;		
		//this.isPermisoPaginacionTodoPeriodoDeclara=isPermiso;		
		//this.isPermisoCopiarPeriodoDeclara=isPermiso;		
		//this.isPermisoDuplicarPeriodoDeclara=isPermiso;
		//this.isPermisoOrdenPeriodoDeclara=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPeriodoDeclaraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(TransaccionLocalConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(RetencionVentaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(FacturaDiarioConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DocumentoAnuladoConstantesFunciones.SNOMBREOPCION);
		
		if(PeriodoDeclaraJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosTransaccionLocal=false;
		this.isTienePermisosTransaccionLocal=this.verificarGetPermisosUsuarioOpcionPeriodoDeclaraClaseRelacionada(this.opcionsRelacionadas,TransaccionLocalConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosRetencionVenta=false;
		this.isTienePermisosRetencionVenta=this.verificarGetPermisosUsuarioOpcionPeriodoDeclaraClaseRelacionada(this.opcionsRelacionadas,RetencionVentaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosFacturaDiario=false;
		this.isTienePermisosFacturaDiario=this.verificarGetPermisosUsuarioOpcionPeriodoDeclaraClaseRelacionada(this.opcionsRelacionadas,FacturaDiarioConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDocumentoAnulado=false;
		this.isTienePermisosDocumentoAnulado=this.verificarGetPermisosUsuarioOpcionPeriodoDeclaraClaseRelacionada(this.opcionsRelacionadas,DocumentoAnuladoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPeriodoDeclara(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPeriodoDeclaraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosTransaccionLocal=conPermiso;
		this.isTienePermisosRetencionVenta=conPermiso;
		this.isTienePermisosFacturaDiario=conPermiso;
		this.isTienePermisosDocumentoAnulado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioPeriodoDeclaraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPeriodoDeclaraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPeriodoDeclaraClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosTransaccionLocal && this.jInternalFrameDetalleFormPeriodoDeclara!=null && this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jTabbedPaneRelacionesPeriodoDeclara.remove(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosRetencionVenta && this.jInternalFrameDetalleFormPeriodoDeclara!=null && this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jTabbedPaneRelacionesPeriodoDeclara.remove(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosFacturaDiario && this.jInternalFrameDetalleFormPeriodoDeclara!=null && this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jTabbedPaneRelacionesPeriodoDeclara.remove(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDocumentoAnulado && this.jInternalFrameDetalleFormPeriodoDeclara!=null && this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jTabbedPaneRelacionesPeriodoDeclara.remove(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioPeriodoDeclara() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PeriodoDeclaraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PeriodoDeclaraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPeriodoDeclara=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPeriodoDeclara=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPeriodoDeclara=this.isPermisoActualizarPeriodoDeclara;
			this.isPermisoEliminarPeriodoDeclara=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPeriodoDeclara=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPeriodoDeclara=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPeriodoDeclara=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPeriodoDeclara=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePeriodoDeclara=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPeriodoDeclara=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPeriodoDeclara=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPeriodoDeclara=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPeriodoDeclara=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPeriodoDeclara=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPeriodoDeclara=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPeriodoDeclara=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPeriodoDeclara=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPeriodoDeclara.setToolTipText(this.jTableDatosPeriodoDeclara.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPeriodoDeclara(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPeriodoDeclara(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PeriodoDeclaraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PeriodoDeclaraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPeriodoDeclara() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosTransaccionLocal && this.periododeclaraConstantesFunciones.mostrarTransaccionLocalPeriodoDeclara && !PeriodoDeclaraConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Transaccion Local");
			reporte.setsDescripcion("Transaccion Local");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosRetencionVenta && this.periododeclaraConstantesFunciones.mostrarRetencionVentaPeriodoDeclara && !PeriodoDeclaraConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Retencion Venta");
			reporte.setsDescripcion("Retencion Venta");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosFacturaDiario && this.periododeclaraConstantesFunciones.mostrarFacturaDiarioPeriodoDeclara && !PeriodoDeclaraConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Factura Diario");
			reporte.setsDescripcion("Factura Diario");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDocumentoAnulado && this.periododeclaraConstantesFunciones.mostrarDocumentoAnuladoPeriodoDeclara && !PeriodoDeclaraConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Documento Anulado");
			reporte.setsDescripcion("Documento Anulado");
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyPeriodoDeclaraListas()throws Exception {
		try	{						
			
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPeriodoDeclaraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PeriodoDeclaraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPeriodoDeclaraListas(false);
			} else {
			
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPeriodoDeclaraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PeriodoDeclaraParameterReturnGeneral periododeclaraReturnGeneral=new PeriodoDeclaraParameterReturnGeneral();
						
			


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.periododeclaraConstantesFunciones.cargarid_anioPeriodoDeclara)
					 || (this.esRecargarFks && this.periododeclaraConstantesFunciones.cargarid_anioPeriodoDeclara)) {

					if(!this.periododeclaraSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+periododeclaraSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.periododeclaraConstantesFunciones.cargarid_mesPeriodoDeclara)
					 || (this.esRecargarFks && this.periododeclaraConstantesFunciones.cargarid_mesPeriodoDeclara)) {

					if(!this.periododeclaraSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+periododeclaraSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				periododeclaraReturnGeneral=periododeclaraLogic.cargarCombosLoteForeignKeyPeriodoDeclara(finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=periododeclaraReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=periododeclaraReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPeriodoDeclara()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {
			if(this.periododeclaraSessionBean==null) {
				this.periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
			}

			if(!this.periododeclaraSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.periododeclaraSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPeriodoDeclara()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPeriodoDeclara(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPeriodoDeclara()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
				this.periododeclara.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPeriodoDeclara();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPeriodoDeclara(PeriodoDeclara periododeclara)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPeriodoDeclara(PeriodoDeclara periododeclara,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPeriodoDeclara()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPeriodoDeclara()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPeriodoDeclara()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPeriodoDeclara()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPeriodoDeclara()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPeriodoDeclara()throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPeriodoDeclara(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPeriodoDeclara()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara!=null && this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara.getItemCount()>0) {
				this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara!=null && this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara.getItemCount()>0) {
				this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public PeriodoDeclaraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PeriodoDeclaraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PeriodoDeclaraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.periododeclaraSessionBean=new PeriodoDeclaraSessionBean(); 
		this.periododeclaraConstantesFunciones=new PeriodoDeclaraConstantesFunciones(); 
		this.periododeclaraBean=new PeriodoDeclara();//(this.periododeclaraConstantesFunciones); 		
		this.periododeclaraReturnGeneral=new PeriodoDeclaraParameterReturnGeneral(); 
		
		this.periododeclaraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.periododeclaraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PeriodoDeclaraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PeriodoDeclaraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PeriodoDeclaraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPeriodoDeclara(true);
			
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
			
			this.periododeclaraConstantesFunciones=new PeriodoDeclaraConstantesFunciones(); 
			this.periododeclaraBean=new PeriodoDeclara();//this.periododeclaraConstantesFunciones); 			
			this.periododeclaraReturnGeneral=new PeriodoDeclaraParameterReturnGeneral(); 
		
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Periodo Declara Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.periododeclara=new PeriodoDeclara();
			this.periododeclaras = new ArrayList<PeriodoDeclara>();
			this.periododeclarasAux = new ArrayList<PeriodoDeclara>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic=new PeriodoDeclaraLogic();
				this.periododeclaraLogic.getNewConnexionToDeep("");
			}
			
			//this.periododeclaraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.periododeclaraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPeriodoDeclara);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPeriodoDeclara!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPeriodoDeclara);	
					}
					
					if(this.jInternalFrameImportacionPeriodoDeclara!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPeriodoDeclara);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPeriodoDeclara!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPeriodoDeclara);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPeriodoDeclara);
				this.jInternalFrameDetalleFormPeriodoDeclara.setVisible(false);
				this.jInternalFrameDetalleFormPeriodoDeclara.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPeriodoDeclara!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPeriodoDeclara);
					this.jInternalFrameReporteDinamicoPeriodoDeclara.setVisible(false);
					this.jInternalFrameReporteDinamicoPeriodoDeclara.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPeriodoDeclara!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPeriodoDeclara);
					this.jInternalFrameImportacionPeriodoDeclara.setVisible(false);
					this.jInternalFrameImportacionPeriodoDeclara.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPeriodoDeclara!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPeriodoDeclara);
					this.jInternalFrameOrderByPeriodoDeclara.setVisible(false);
					this.jInternalFrameOrderByPeriodoDeclara.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPeriodoDeclaraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PeriodoDeclaraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.periododeclaraReturnGeneral=new PeriodoDeclaraParameterReturnGeneral();
			
			this.periododeclaraParameterGeneral=new PeriodoDeclaraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.periododeclaraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PeriodoDeclaraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(TransaccionLocalConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(RetencionVentaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(FacturaDiarioConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DocumentoAnuladoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PeriodoDeclaraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.periododeclaraSessionBean.getEsGuardarRelacionado(),this.periododeclaraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PeriodoDeclaraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.periododeclaraSessionBean.getEsGuardarRelacionado(),this.periododeclaraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPeriodoDeclara=false;
			this.isVisibilidadCeldaDuplicarPeriodoDeclara=true;
			this.isVisibilidadCeldaCopiarPeriodoDeclara=true;
			this.isVisibilidadCeldaVerFormPeriodoDeclara=true;
			this.isVisibilidadCeldaOrdenPeriodoDeclara=true;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=false;
			this.isVisibilidadCeldaModificarPeriodoDeclara=false;
			this.isVisibilidadCeldaActualizarPeriodoDeclara=false;
			this.isVisibilidadCeldaEliminarPeriodoDeclara=false;
			this.isVisibilidadCeldaCancelarPeriodoDeclara=false;
			this.isVisibilidadCeldaGuardarPeriodoDeclara=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdMes=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPeriodoDeclara("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPeriodoDeclara();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPeriodoDeclara(false);
			
			this.setPermisosUsuarioPeriodoDeclara();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.periododeclaraSessionBean.getEsGuardarRelacionado() 
				|| (this.periododeclaraSessionBean.getEsGuardarRelacionado() && this.periododeclaraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPeriodoDeclaraClasesRelacionadas();
			}
			
			if(this.periododeclaraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPeriodoDeclaraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPeriodoDeclara();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPeriodoDeclara();
			}
			
			if(!this.isPermisoBusquedaPeriodoDeclara) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPeriodoDeclara.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPeriodoDeclara,this.isPermisoPaginacionMedioPeriodoDeclara,this.isPermisoPaginacionTodoPeriodoDeclara);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PeriodoDeclaraConstantesFunciones.getTiposSeleccionarPeriodoDeclara());
				
				this.tiposColumnasSelect=PeriodoDeclaraConstantesFunciones.getTiposSeleccionarPeriodoDeclara(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectPeriodoDeclara();				
				//this.tiposRelacionesSelect=PeriodoDeclaraConstantesFunciones.getTiposRelacionesPeriodoDeclara(true);
				
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
			//if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPeriodoDeclara();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPeriodoDeclara(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPeriodoDeclara(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPeriodoDeclara() ;
			
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
			
			
			this.transaccionlocalLogic=new TransaccionLocalLogic();
			this.retencionventaLogic=new RetencionVentaLogic();
			this.facturadiarioLogic=new FacturaDiarioLogic();
			this.documentoanuladoLogic=new DocumentoAnuladoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				periododeclaraImplementable= (PeriodoDeclaraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PeriodoDeclaraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				periododeclaraImplementableHome= (PeriodoDeclaraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PeriodoDeclaraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.periododeclaras= new ArrayList<PeriodoDeclara>();
			this.periododeclarasEliminados= new ArrayList<PeriodoDeclara>();
						
			this.isEsNuevoPeriodoDeclara=false;
			this.esParaAccionDesdeFormularioPeriodoDeclara=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPeriodoDeclara(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPeriodoDeclara();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PeriodoDeclaraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPeriodoDeclara("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPeriodoDeclara(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPeriodoDeclara();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPeriodoDeclara();
			}
			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPeriodoDeclara.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPeriodoDeclara.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPeriodoDeclara.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPeriodoDeclara(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PeriodoDeclara: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPeriodoDeclara() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(RetencionVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(RetencionVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPeriodoDeclara")) {
				iIndex=this.jInternalFrameDetalleFormPeriodoDeclara.jTabbedPaneRelacionesPeriodoDeclara.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPeriodoDeclara.jTabbedPaneRelacionesPeriodoDeclara.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();	
				
				

				if(sTitle.equals("Documento Anulados")) {
					if(!DocumentoAnuladoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPeriodoDeclara();

						this.cargarParteTabPanelRelacionadaDocumentoAnulado(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Factura Diarios")) {
					if(!FacturaDiarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPeriodoDeclara();

						this.cargarParteTabPanelRelacionadaFacturaDiario(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Retencion Ventas")) {
					if(!RetencionVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPeriodoDeclara();

						this.cargarParteTabPanelRelacionadaRetencionVenta(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Transaccion Locales")) {
					if(!TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPeriodoDeclara();

						this.cargarParteTabPanelRelacionadaTransaccionLocal(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPeriodoDeclara();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDocumentoAnulado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPeriodoDeclara.cargarSessionConBeanSwingJInternalFrameDocumentoAnulado(false,true,iIndex);
		this.jButtonDocumentoAnuladoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDocumentoAnulado();

		//this.jTabbedPaneRelacionesPeriodoDeclara.updateUI();
		//this.jTabbedPaneRelacionesPeriodoDeclara.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPeriodoDeclara.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaFacturaDiario(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPeriodoDeclara.cargarSessionConBeanSwingJInternalFrameFacturaDiario(false,true,iIndex);
		this.jButtonFacturaDiarioActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFacturaDiario();

		//this.jTabbedPaneRelacionesPeriodoDeclara.updateUI();
		//this.jTabbedPaneRelacionesPeriodoDeclara.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPeriodoDeclara.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaRetencionVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPeriodoDeclara.cargarSessionConBeanSwingJInternalFrameRetencionVenta(false,true,iIndex);
		this.jButtonRetencionVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaRetencionVenta();

		//this.jTabbedPaneRelacionesPeriodoDeclara.updateUI();
		//this.jTabbedPaneRelacionesPeriodoDeclara.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPeriodoDeclara.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTransaccionLocal(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPeriodoDeclara.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(false,true,iIndex);
		this.jButtonTransaccionLocalActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTransaccionLocal();

		//this.jTabbedPaneRelacionesPeriodoDeclara.updateUI();
		//this.jTabbedPaneRelacionesPeriodoDeclara.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPeriodoDeclara.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("TransaccionLocal")) {
				int row=this.jTableDatosPeriodoDeclara.getSelectedRow();
				jButtonTransaccionLocalActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("RetencionVenta")) {
				int row=this.jTableDatosPeriodoDeclara.getSelectedRow();
				jButtonRetencionVentaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("FacturaDiario")) {
				int row=this.jTableDatosPeriodoDeclara.getSelectedRow();
				jButtonFacturaDiarioActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DocumentoAnulado")) {
				int row=this.jTableDatosPeriodoDeclara.getSelectedRow();
				jButtonDocumentoAnuladoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Transaccion Local")) {

					if(this.isTienePermisosTransaccionLocal && this.periododeclaraConstantesFunciones.mostrarTransaccionLocalPeriodoDeclara && !PeriodoDeclaraConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Transaccion Locales"+"("+TransaccionLocalConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Transaccion Locales");

						if(periododeclaraConstantesFunciones.resaltarTransaccionLocalPeriodoDeclara!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(periododeclaraConstantesFunciones.resaltarTransaccionLocalPeriodoDeclara);
						}

						jmenuItem.setEnabled(this.periododeclaraConstantesFunciones.activarTransaccionLocalPeriodoDeclara);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TransaccionLocal"));

						

						this.jInternalFrameDetalleFormPeriodoDeclara.jmenuDetallePeriodoDeclara.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Retencion Venta")) {

					if(this.isTienePermisosRetencionVenta && this.periododeclaraConstantesFunciones.mostrarRetencionVentaPeriodoDeclara && !PeriodoDeclaraConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Retencion Ventas"+"("+RetencionVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Retencion Ventas");

						if(periododeclaraConstantesFunciones.resaltarRetencionVentaPeriodoDeclara!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(periododeclaraConstantesFunciones.resaltarRetencionVentaPeriodoDeclara);
						}

						jmenuItem.setEnabled(this.periododeclaraConstantesFunciones.activarRetencionVentaPeriodoDeclara);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"RetencionVenta"));

						

						this.jInternalFrameDetalleFormPeriodoDeclara.jmenuDetallePeriodoDeclara.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Factura Diario")) {

					if(this.isTienePermisosFacturaDiario && this.periododeclaraConstantesFunciones.mostrarFacturaDiarioPeriodoDeclara && !PeriodoDeclaraConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Factura Diarios"+"("+FacturaDiarioConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Factura Diarios");

						if(periododeclaraConstantesFunciones.resaltarFacturaDiarioPeriodoDeclara!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(periododeclaraConstantesFunciones.resaltarFacturaDiarioPeriodoDeclara);
						}

						jmenuItem.setEnabled(this.periododeclaraConstantesFunciones.activarFacturaDiarioPeriodoDeclara);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FacturaDiario"));

						

						this.jInternalFrameDetalleFormPeriodoDeclara.jmenuDetallePeriodoDeclara.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Documento Anulado")) {

					if(this.isTienePermisosDocumentoAnulado && this.periododeclaraConstantesFunciones.mostrarDocumentoAnuladoPeriodoDeclara && !PeriodoDeclaraConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Documento Anulados"+"("+DocumentoAnuladoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Documento Anulados");

						if(periododeclaraConstantesFunciones.resaltarDocumentoAnuladoPeriodoDeclara!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(periododeclaraConstantesFunciones.resaltarDocumentoAnuladoPeriodoDeclara);
						}

						jmenuItem.setEnabled(this.periododeclaraConstantesFunciones.activarDocumentoAnuladoPeriodoDeclara);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DocumentoAnulado"));

						

						this.jInternalFrameDetalleFormPeriodoDeclara.jmenuDetallePeriodoDeclara.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyPeriodoDeclara(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPeriodoDeclara(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPeriodoDeclara(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPeriodoDeclaraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPeriodoDeclara();
		
		this.cargarCombosFrameForeignKeyPeriodoDeclara();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPeriodoDeclara();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPeriodoDeclara();
		}
	}
	
	

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPeriodoDeclaraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.periododeclaraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPeriodoDeclara==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			
			
			if(jTableDatosPeriodoDeclara.getRowCount()>=1) {
				jTableDatosPeriodoDeclara.removeRowSelectionInterval(0, jTableDatosPeriodoDeclara.getRowCount()-1);						
			}
			
			this.isEsNuevoPeriodoDeclara=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPeriodoDeclara(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPeriodoDeclara(true);			
			//this.periododeclara=new PeriodoDeclara();
			//this.periododeclara.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPeriodoDeclara(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodoDeclara() ;
			
			if(PeriodoDeclaraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePeriodoDeclara(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.periododeclara);	
			this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);				
			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			
			if(this.periododeclaraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PeriodoDeclara: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPeriodoDeclaraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PeriodoDeclara> periododeclarasSeleccionados=new ArrayList<PeriodoDeclara>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPeriodoDeclara.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPeriodoDeclara.getSelectedRows().length;			
			}
			
			periododeclarasSeleccionados=this.getPeriodoDeclarasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPeriodoDeclara--;			
				//PeriodoDeclara periododeclaraAux= new PeriodoDeclara();			
				//periododeclaraAux.setId(this.iIdNuevoPeriodoDeclara);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PeriodoDeclara periododeclaraOrigen=new PeriodoDeclara();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PeriodoDeclara periododeclaraOrigen : periododeclarasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							periododeclaraOrigen =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periododeclaraOrigen =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPeriodoDeclara();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.periododeclara.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPeriodoDeclara(periododeclaraOrigen,this.periododeclara,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.periododeclaraLogic.getPeriodoDeclaras().add(this.periododeclaraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.periododeclaras.add(this.periododeclaraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPeriodoDeclara(false);
				
				this.jTableDatosPeriodoDeclara.setRowSelectionInterval(this.getIndiceNuevoPeriodoDeclara(), this.getIndiceNuevoPeriodoDeclara());
				
				int iLastRow =  this.jTableDatosPeriodoDeclara.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPeriodoDeclara.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPeriodoDeclara.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPeriodoDeclara(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PeriodoDeclara> periododeclarasSeleccionados=new ArrayList<PeriodoDeclara>();									
		
			PeriodoDeclara periododeclaraOrigen=new PeriodoDeclara();
			PeriodoDeclara periododeclaraDestino=new PeriodoDeclara();
				
			periododeclarasSeleccionados=this.getPeriodoDeclarasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPeriodoDeclara.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || periododeclarasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPeriodoDeclara.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periododeclaraOrigen =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						periododeclaraOrigen =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periododeclaraDestino =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						periododeclaraDestino =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				periododeclaraOrigen =periododeclarasSeleccionados.get(0);
				periododeclaraDestino =periododeclarasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPeriodoDeclara(periododeclaraOrigen,periododeclaraDestino,true,false);
				
				periododeclaraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(periododeclaraDestino,periododeclaraLogic.getPeriodoDeclaras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periododeclaraDestino,periododeclaras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPeriodoDeclara(false);
				
				//this.jTableDatosPeriodoDeclara.setRowSelectionInterval(this.getIndiceNuevoPeriodoDeclara(), this.getIndiceNuevoPeriodoDeclara());
				
				int iLastRow =  this.jTableDatosPeriodoDeclara.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPeriodoDeclara.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPeriodoDeclara.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPeriodoDeclara(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPeriodoDeclara==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPeriodoDeclara.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPeriodoDeclara.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPeriodoDeclara.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPeriodoDeclara.setVisible(!isVisible);
			this.jPanelPaginacionPeriodoDeclara.setVisible(!isVisible);
			this.jPanelAccionesPeriodoDeclara.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePeriodoDeclara();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPeriodoDeclara();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPeriodoDeclara();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPeriodoDeclara();
			
			this.abrirFrameOrderByPeriodoDeclara();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPeriodoDeclara();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePeriodoDeclara(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPeriodoDeclara);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPeriodoDeclara.isMaximum()) {
					this.jInternalFrameDetalleFormPeriodoDeclara.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPeriodoDeclara.setSize(this.jInternalFrameDetalleFormPeriodoDeclara.iWidthFormulario,this.jInternalFrameDetalleFormPeriodoDeclara.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPeriodoDeclara.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPeriodoDeclara.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPeriodoDeclara.isMaximum()) {
						this.jInternalFrameDetalleFormPeriodoDeclara.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPeriodoDeclara.jContentPaneDetallePeriodoDeclara.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPeriodoDeclara.jTabbedPaneRelacionesPeriodoDeclara.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPeriodoDeclara.jContentPaneDetallePeriodoDeclara.getWidth(),PeriodoDeclaraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPeriodoDeclara.jTabbedPaneRelacionesPeriodoDeclara.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPeriodoDeclara.jContentPaneDetallePeriodoDeclara.getWidth(),PeriodoDeclaraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPeriodoDeclara.jTabbedPaneRelacionesPeriodoDeclara.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPeriodoDeclara.jContentPaneDetallePeriodoDeclara.getWidth(),PeriodoDeclaraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DocumentoAnuladoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDocumentoAnulado();
					}

					if(FacturaDiarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFacturaDiario();
					}

					if(RetencionVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaRetencionVenta();
					}

					if(TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTransaccionLocal();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPeriodoDeclara.setVisible(true);
	        this.jInternalFrameDetalleFormPeriodoDeclara.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPeriodoDeclara() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPeriodoDeclara==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPeriodoDeclara=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodoDeclara,false,this);
				} else {
					this.jInternalFrameOrderByPeriodoDeclara=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodoDeclara,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPeriodoDeclara);
				this.jInternalFrameOrderByPeriodoDeclara.setVisible(false);
				this.jInternalFrameOrderByPeriodoDeclara.setSelected(false);
				
				this.jInternalFrameOrderByPeriodoDeclara.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPeriodoDeclara"));
				
				this.inicializarActualizarBindingTablaOrderByPeriodoDeclara();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPeriodoDeclara() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPeriodoDeclara==null) {
				
				this.jInternalFrameImportacionPeriodoDeclara=new ImportacionJInternalFrame(PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPeriodoDeclara);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPeriodoDeclara);
				this.jInternalFrameImportacionPeriodoDeclara.setVisible(false);
				this.jInternalFrameImportacionPeriodoDeclara.setSelected(false);


				this.jInternalFrameImportacionPeriodoDeclara.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPeriodoDeclara"));
				this.jInternalFrameImportacionPeriodoDeclara.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPeriodoDeclara"));
				this.jInternalFrameImportacionPeriodoDeclara.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPeriodoDeclara"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPeriodoDeclara() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPeriodoDeclara==null) {
				this.jInternalFrameReporteDinamicoPeriodoDeclara=new ReporteDinamicoJInternalFrame(PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPeriodoDeclara);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPeriodoDeclara);
				this.jInternalFrameReporteDinamicoPeriodoDeclara.setVisible(false);
				this.jInternalFrameReporteDinamicoPeriodoDeclara.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPeriodoDeclara.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPeriodoDeclara"));
				this.jInternalFrameReporteDinamicoPeriodoDeclara.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPeriodoDeclara"));
				this.jInternalFrameReporteDinamicoPeriodoDeclara.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPeriodoDeclara"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPeriodoDeclara();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDocumentoAnulado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.jScrollPanelDatosDocumentoAnulado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPeriodoDeclara.jContentPaneDetallePeriodoDeclara.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.jScrollPanelDatosDocumentoAnulado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.jScrollPanelDatosDocumentoAnulado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.jScrollPanelDatosDocumentoAnulado.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaFacturaDiario() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.jScrollPanelDatosFacturaDiario.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPeriodoDeclara.jContentPaneDetallePeriodoDeclara.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.jScrollPanelDatosFacturaDiario.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.jScrollPanelDatosFacturaDiario.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.jScrollPanelDatosFacturaDiario.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaRetencionVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.jScrollPanelDatosRetencionVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPeriodoDeclara.jContentPaneDetallePeriodoDeclara.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.jScrollPanelDatosRetencionVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.jScrollPanelDatosRetencionVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.jScrollPanelDatosRetencionVenta.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTransaccionLocal() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPeriodoDeclara.jContentPaneDetallePeriodoDeclara.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetallePeriodoDeclara() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPeriodoDeclara);
			
	       	this.jInternalFrameDetalleFormPeriodoDeclara.setVisible(false);
	        this.jInternalFrameDetalleFormPeriodoDeclara.setSelected(false);
			
			//this.jInternalFrameDetalleFormPeriodoDeclara.dispose();
			//this.jInternalFrameDetalleFormPeriodoDeclara=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPeriodoDeclara() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPeriodoDeclara.setVisible(true);
	        this.jInternalFrameReporteDinamicoPeriodoDeclara.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPeriodoDeclara() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPeriodoDeclara.setVisible(true);
	        this.jInternalFrameImportacionPeriodoDeclara.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPeriodoDeclara() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPeriodoDeclara.setVisible(true);
	        this.jInternalFrameOrderByPeriodoDeclara.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPeriodoDeclara() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPeriodoDeclara.setVisible(false);
	        this.jInternalFrameOrderByPeriodoDeclara.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPeriodoDeclara() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPeriodoDeclara.setVisible(false);
	        this.jInternalFrameReporteDinamicoPeriodoDeclara.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPeriodoDeclara() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPeriodoDeclara.setVisible(false);
	        this.jInternalFrameImportacionPeriodoDeclara.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPeriodoDeclara(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPeriodoDeclara(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPeriodoDeclara(true);
			//this.isEsNuevoPeriodoDeclara=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPeriodoDeclara("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPeriodoDeclara(false) ;
			
			if(periododeclaraSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado() && TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionLocalActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaSessionBean.getEsGuardarRelacionado() && RetencionVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRetencionVentaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.getEsGuardarRelacionado() && FacturaDiarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaDiarioActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.getEsGuardarRelacionado() && DocumentoAnuladoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDocumentoAnuladoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(PeriodoDeclaraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePeriodoDeclara(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodoDeclara(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPeriodoDeclaraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPeriodoDeclara(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPeriodoDeclara==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPeriodoDeclara(true);
			//this.isEsNuevoPeriodoDeclara=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.periododeclara.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPeriodoDeclara("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPeriodoDeclara(false) ;
			
			if(PeriodoDeclaraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePeriodoDeclara(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodoDeclara(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosPeriodoDeclara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoDeclara,PeriodoDeclaraConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPeriodoDeclara.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosPeriodoDeclara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoDeclara,PeriodoDeclaraConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPeriodoDeclara.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPeriodoDeclara(false);
			
			//if(!this.isEsNuevoPeriodoDeclara) {								
				int intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
				
			}
			
			if(this.permiteMantenimiento(this.periododeclara)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPeriodoDeclara=true;
					this.inicializarActualizarBindingTablaPeriodoDeclara(false);
					this.isEsNuevoPeriodoDeclara=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPeriodoDeclara=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPeriodoDeclara=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPeriodoDeclara(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPeriodoDeclara(false);
				
				this.habilitarDeshabilitarControlesPeriodoDeclara(false);
			
												
				
				if(PeriodoDeclaraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePeriodoDeclara();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPeriodoDeclaraActionPerformed(evt,periododeclaraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPeriodoDeclara(this.periododeclara,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPeriodoDeclara.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,periododeclaraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.periododeclara.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PeriodoDeclara.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoDeclara.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				this.periododeclara.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				this.periododeclara.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.periododeclara)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PeriodoDeclaraModel) this.jTableDatosPeriodoDeclara.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPeriodoDeclara=true;
				this.inicializarActualizarBindingTablaPeriodoDeclara(false);
				this.isEsNuevoPeriodoDeclara=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPeriodoDeclara(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPeriodoDeclara(false);
				
				this.habilitarDeshabilitarControlesPeriodoDeclara(false);
				
				
				
				if(PeriodoDeclaraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePeriodoDeclara();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPeriodoDeclara.getRowCount()>=1) {
				jTableDatosPeriodoDeclara.removeRowSelectionInterval(0, jTableDatosPeriodoDeclara.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPeriodoDeclara(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPeriodoDeclara(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPeriodoDeclara(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodoDeclara(false) ;
			
			this.isEsNuevoPeriodoDeclara=false;
			
			if(PeriodoDeclaraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePeriodoDeclara();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPeriodoDeclara(false);
				
				//SI ES MANUAL
				if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPeriodoDeclara();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPeriodoDeclara--;			
			//PeriodoDeclara periododeclaraAux= new PeriodoDeclara();			
			//periododeclaraAux.setId(this.iIdNuevoPeriodoDeclara);
			
			if(this.jInternalFrameDetalleFormPeriodoDeclara==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPeriodoDeclara();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
			
			this.periododeclara.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.periododeclaraLogic.getPeriodoDeclaras().add(this.periododeclaraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.periododeclaras.add(this.periododeclaraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPeriodoDeclara(false);
			
			this.jTableDatosPeriodoDeclara.setRowSelectionInterval(this.getIndiceNuevoPeriodoDeclara(), this.getIndiceNuevoPeriodoDeclara());
			
			int iLastRow =  this.jTableDatosPeriodoDeclara.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPeriodoDeclara.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPeriodoDeclara.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPeriodoDeclara(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPeriodoDeclara(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodoDeclara(false);
			
			//SI ES MANUAL
			if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPeriodoDeclara();
			}
			
			//this.abrirFrameTreePeriodoDeclara();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Periodo DeclaraS ?", "MANTENIMIENTO DE Periodo Declara", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPeriodoDeclara.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPeriodoDeclara();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.periododeclaraReturnGeneral=periododeclaraLogic.procesarImportacionPeriodoDeclarasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.periododeclaraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPeriodoDeclaraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPeriodoDeclara.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPeriodoDeclara.setFileImportacion(this.jInternalFrameImportacionPeriodoDeclara.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPeriodoDeclara.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPeriodoDeclara.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPeriodoDeclara.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPeriodoDeclara.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PeriodoDeclara> periododeclarasSeleccionados=new ArrayList<PeriodoDeclara>();		

		periododeclarasSeleccionados=this.getPeriodoDeclarasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodoDeclara.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodoDeclara.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PeriodoDeclaraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PeriodoDeclaraBaseDesign.jrxml";
			
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
			
			this.generarReportePeriodoDeclaras("Todos",periododeclarasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periododeclaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Declara",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PeriodoDeclaraConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPeriodoDeclara.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPeriodoDeclara.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPeriodoDeclara.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PeriodoDeclaraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPeriodoDeclara.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PeriodoDeclaraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PeriodoDeclaraConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PeriodoDeclara> periododeclarasSeleccionados=new ArrayList<PeriodoDeclara>();		
		
		periododeclarasSeleccionados=this.getPeriodoDeclarasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periododeclara";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PeriodoDeclaras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PeriodoDeclaraConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(PeriodoDeclara periododeclara:periododeclarasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periododeclara.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(PeriodoDeclara periododeclara:periododeclarasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periododeclara.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(PeriodoDeclara periododeclara:periododeclarasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periododeclara.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(PeriodoDeclara periododeclara:periododeclarasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periododeclara.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(PeriodoDeclara periododeclara:periododeclarasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periododeclara.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelPeriodoDeclara(row);				
			//	iRow++;
			//}				
			
			//for(PeriodoDeclara periododeclaraAux:periododeclarasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPeriodoDeclara(periododeclaraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periododeclaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Declara",JOptionPane.INFORMATION_MESSAGE);
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
				this.periododeclaraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodoDeclara(false);
			
			//SI ES MANUAL
			if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPeriodoDeclara();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodoDeclara(false);
			
			//SI ES MANUAL
			if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPeriodoDeclara();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodoDeclara(false);
			
			//SI ES MANUAL
			if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPeriodoDeclara();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPeriodoDeclara() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPeriodoDeclara.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPeriodoDeclara.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPeriodoDeclara.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPeriodoDeclara.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPeriodoDeclara.setMinimumSize(dimensionMinimum);
		this.jTableDatosPeriodoDeclara.setMaximumSize(dimensionMaximum);
		this.jTableDatosPeriodoDeclara.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPeriodoDeclara(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPeriodoDeclara(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPeriodoDeclara(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPeriodoDeclara(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPeriodoDeclara(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPeriodoDeclara(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPeriodoDeclara(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPeriodoDeclara(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPeriodoDeclara() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPeriodoDeclara();
		
		this.inicializarActualizarBindingBotonesManualPeriodoDeclara(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPeriodoDeclara();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPeriodoDeclara() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPeriodoDeclara(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPeriodoDeclara(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPeriodoDeclara.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPeriodoDeclara.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePeriodoDeclara.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxPostAccionNuevoPeriodoDeclara.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxPostAccionSinCerrarPeriodoDeclara.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxPostAccionSinMensajePeriodoDeclara.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPeriodoDeclara.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPeriodoDeclara.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePeriodoDeclara.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
				this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxPostAccionNuevoPeriodoDeclara.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxPostAccionSinCerrarPeriodoDeclara.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxPostAccionSinMensajePeriodoDeclara.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPeriodoDeclara.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPeriodoDeclara.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPeriodoDeclara.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPeriodoDeclara!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodoDeclara.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPeriodoDeclara.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPeriodoDeclara.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPeriodoDeclara.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPeriodoDeclara.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPeriodoDeclara!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodoDeclara.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPeriodoDeclara.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPeriodoDeclara.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPeriodoDeclara(Boolean esInicializar) throws Exception {
		try	{	
			if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPeriodoDeclara(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPeriodoDeclara() throws Exception {
		try	{
			if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPeriodoDeclara();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePeriodoDeclara() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPeriodoDeclara() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPeriodoDeclara.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPeriodoDeclara.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPeriodoDeclara.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPeriodoDeclara.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPeriodoDeclara.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPeriodoDeclara.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPeriodoDeclara.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPeriodoDeclara.addItem(reporte);
			}
			
			
			if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPeriodoDeclara.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPeriodoDeclara.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPeriodoDeclara.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPeriodoDeclara.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPeriodoDeclara.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPeriodoDeclara.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPeriodoDeclara.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPeriodoDeclara.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPeriodoDeclara.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPeriodoDeclara();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPeriodoDeclara() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPeriodoDeclara!=null) {
				this.jInternalFrameReporteDinamicoPeriodoDeclara.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPeriodoDeclara.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPeriodoDeclara!=null) {
				this.jInternalFrameReporteDinamicoPeriodoDeclara.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPeriodoDeclara.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPeriodoDeclara!=null) {
				
				if(this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPeriodoDeclara.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPeriodoDeclara()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioFK_IdAnioPeriodoDeclara.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioPeriodoDeclara.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesFK_IdMesPeriodoDeclara.getSelectedItem()!=null){this.id_mesFK_IdMes=((Mes)this.jComboBoxid_mesFK_IdMesPeriodoDeclara.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPeriodoDeclara(Boolean esInicializar) throws Exception {				
		if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPeriodoDeclara();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPeriodoDeclara() throws Exception {
		this.inicializarActualizarBindingTablaPeriodoDeclara(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPeriodoDeclara() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPeriodoDeclara.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPeriodoDeclara.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPeriodoDeclara.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PeriodoDeclaraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPeriodoDeclara.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPeriodoDeclara.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PeriodoDeclaraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPeriodoDeclaraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoDeclaraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PeriodoDeclaraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPeriodoDeclara.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPeriodoDeclara.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PeriodoDeclaraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPeriodoDeclara.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPeriodoDeclara(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=periododeclaraLogic.getPeriodoDeclaras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=periododeclaras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPeriodoDeclara.setModel(new PeriodoDeclaraModel(this.periododeclaraLogic.getPeriodoDeclaras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPeriodoDeclara.setModel(new PeriodoDeclaraModel(this.periododeclaras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPeriodoDeclara!=null && this.jInternalFrameOrderByPeriodoDeclara.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPeriodoDeclara();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPeriodoDeclara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoDeclara,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PeriodoDeclaraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO,periododeclaraConstantesFunciones.resaltarSeleccionarPeriodoDeclara,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PeriodoDeclaraConstantesFunciones.SCLASSWEBTITULO,periododeclaraConstantesFunciones.resaltarSeleccionarPeriodoDeclara,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPeriodoDeclara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoDeclara,PeriodoDeclaraConstantesFunciones.LABEL_ID));

		if(this.periododeclaraConstantesFunciones.mostraridPeriodoDeclara && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoDeclaraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.periododeclaraConstantesFunciones.resaltaridPeriodoDeclara,this.periododeclaraConstantesFunciones.activaridPeriodoDeclara,this,true,"idPeriodoDeclara","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.periododeclaraConstantesFunciones.resaltaridPeriodoDeclara,this.periododeclaraConstantesFunciones.activaridPeriodoDeclara,this,true,"idPeriodoDeclara","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodoDeclara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoDeclara,PeriodoDeclaraConstantesFunciones.LABEL_CODIGO));

		if(this.periododeclaraConstantesFunciones.mostrarcodigoPeriodoDeclara && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoDeclaraConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.periododeclaraConstantesFunciones.resaltarcodigoPeriodoDeclara,this.periododeclaraConstantesFunciones.activarcodigoPeriodoDeclara,this,true,"codigoPeriodoDeclara","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.periododeclaraConstantesFunciones.resaltarcodigoPeriodoDeclara,this.periododeclaraConstantesFunciones.activarcodigoPeriodoDeclara,this,true,"codigoPeriodoDeclara","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoDeclaraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodoDeclara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoDeclara,PeriodoDeclaraConstantesFunciones.LABEL_IDANIO));

		if(this.periododeclaraConstantesFunciones.mostrarid_anioPeriodoDeclara && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoDeclaraConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.periododeclaraConstantesFunciones.resaltarid_anioPeriodoDeclara,this,this.periododeclaraConstantesFunciones.activarid_anioPeriodoDeclara));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.periododeclaraConstantesFunciones.resaltarid_anioPeriodoDeclara,this,this.periododeclaraConstantesFunciones.activarid_anioPeriodoDeclara,true,"id_anioPeriodoDeclara","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoDeclaraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodoDeclara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoDeclara,PeriodoDeclaraConstantesFunciones.LABEL_IDMES));

		if(this.periododeclaraConstantesFunciones.mostrarid_mesPeriodoDeclara && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoDeclaraConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.periododeclaraConstantesFunciones.resaltarid_mesPeriodoDeclara,this,this.periododeclaraConstantesFunciones.activarid_mesPeriodoDeclara));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.periododeclaraConstantesFunciones.resaltarid_mesPeriodoDeclara,this,this.periododeclaraConstantesFunciones.activarid_mesPeriodoDeclara,true,"id_mesPeriodoDeclara","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoDeclaraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodoDeclara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoDeclara,PeriodoDeclaraConstantesFunciones.LABEL_FECHA));

		if(this.periododeclaraConstantesFunciones.mostrarfechaPeriodoDeclara && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoDeclaraConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.periododeclaraConstantesFunciones.resaltarfechaPeriodoDeclara,this.periododeclaraConstantesFunciones.activarfechaPeriodoDeclara,this,true,"fechaPeriodoDeclara","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.periododeclaraConstantesFunciones.resaltarfechaPeriodoDeclara,this.periododeclaraConstantesFunciones.activarfechaPeriodoDeclara,this,true,"fechaPeriodoDeclara","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PeriodoDeclaraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodoDeclara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoDeclara,PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.periododeclaraConstantesFunciones.mostraresta_activoPeriodoDeclara && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.periododeclaraConstantesFunciones.resaltaresta_activoPeriodoDeclara,this.periododeclaraConstantesFunciones.activaresta_activoPeriodoDeclara));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.periododeclaraConstantesFunciones.resaltaresta_activoPeriodoDeclara,this.periododeclaraConstantesFunciones.activaresta_activoPeriodoDeclara,this,true,"esta_activoPeriodoDeclara","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PeriodoDeclaraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosTransaccionLocal && this.periododeclaraConstantesFunciones.mostrarTransaccionLocalPeriodoDeclara && !PeriodoDeclaraConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Transaccion Locales");
				tableColumn.setHeaderValue("Transaccion Locales");
				tableColumn.setCellRenderer(new TransaccionLocalTableCell(periododeclaraConstantesFunciones.resaltarTransaccionLocalPeriodoDeclara,this,this.periododeclaraConstantesFunciones.activarTransaccionLocalPeriodoDeclara));
				tableColumn.setCellEditor(new TransaccionLocalTableCell(periododeclaraConstantesFunciones.resaltarTransaccionLocalPeriodoDeclara,this,this.periododeclaraConstantesFunciones.activarTransaccionLocalPeriodoDeclara));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPeriodoDeclara.addColumn(tableColumn);
			}

			if(this.isTienePermisosRetencionVenta && this.periododeclaraConstantesFunciones.mostrarRetencionVentaPeriodoDeclara && !PeriodoDeclaraConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Retencion Ventas");
				tableColumn.setHeaderValue("Retencion Ventas");
				tableColumn.setCellRenderer(new RetencionVentaTableCell(periododeclaraConstantesFunciones.resaltarRetencionVentaPeriodoDeclara,this,this.periododeclaraConstantesFunciones.activarRetencionVentaPeriodoDeclara));
				tableColumn.setCellEditor(new RetencionVentaTableCell(periododeclaraConstantesFunciones.resaltarRetencionVentaPeriodoDeclara,this,this.periododeclaraConstantesFunciones.activarRetencionVentaPeriodoDeclara));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPeriodoDeclara.addColumn(tableColumn);
			}

			if(this.isTienePermisosFacturaDiario && this.periododeclaraConstantesFunciones.mostrarFacturaDiarioPeriodoDeclara && !PeriodoDeclaraConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Factura Diarios");
				tableColumn.setHeaderValue("Factura Diarios");
				tableColumn.setCellRenderer(new FacturaDiarioTableCell(periododeclaraConstantesFunciones.resaltarFacturaDiarioPeriodoDeclara,this,this.periododeclaraConstantesFunciones.activarFacturaDiarioPeriodoDeclara));
				tableColumn.setCellEditor(new FacturaDiarioTableCell(periododeclaraConstantesFunciones.resaltarFacturaDiarioPeriodoDeclara,this,this.periododeclaraConstantesFunciones.activarFacturaDiarioPeriodoDeclara));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPeriodoDeclara.addColumn(tableColumn);
			}

			if(this.isTienePermisosDocumentoAnulado && this.periododeclaraConstantesFunciones.mostrarDocumentoAnuladoPeriodoDeclara && !PeriodoDeclaraConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Documento Anulados");
				tableColumn.setHeaderValue("Documento Anulados");
				tableColumn.setCellRenderer(new DocumentoAnuladoTableCell(periododeclaraConstantesFunciones.resaltarDocumentoAnuladoPeriodoDeclara,this,this.periododeclaraConstantesFunciones.activarDocumentoAnuladoPeriodoDeclara));
				tableColumn.setCellEditor(new DocumentoAnuladoTableCell(periododeclaraConstantesFunciones.resaltarDocumentoAnuladoPeriodoDeclara,this,this.periododeclaraConstantesFunciones.activarDocumentoAnuladoPeriodoDeclara));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPeriodoDeclara.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.periododeclaraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.periododeclaraSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPeriodoDeclara.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.periododeclaraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.periododeclaraSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPeriodoDeclara.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPeriodoDeclara && this.isPermisoGuardarCambiosPeriodoDeclara) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.periododeclaraSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.periododeclaraSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPeriodoDeclara.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.periododeclaraSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosPeriodoDeclara.addColumn(tableColumn);
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
			
			this.jTableDatosPeriodoDeclara.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPeriodoDeclara && this.isPermisoGuardarCambiosPeriodoDeclara) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.periododeclaraSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPeriodoDeclara && this.isPermisoGuardarCambiosPeriodoDeclara) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPeriodoDeclara.moveColumn(this.jTableDatosPeriodoDeclara.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPeriodoDeclara.moveColumn(this.jTableDatosPeriodoDeclara.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.periododeclaraSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosPeriodoDeclara.moveColumn(this.jTableDatosPeriodoDeclara.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPeriodoDeclara.moveColumn(this.jTableDatosPeriodoDeclara.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPeriodoDeclara.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPeriodoDeclara.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPeriodoDeclara,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPeriodoDeclara.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPeriodoDeclara.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPeriodoDeclara.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPeriodoDeclara.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPeriodoDeclara.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=periododeclaraLogic.getPeriodoDeclaras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=periododeclaras.size()-1;
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
		//this.jTableDatosPeriodoDeclara.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPeriodoDeclara.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPeriodoDeclara();
			
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
				
				//this.isEsNuevoPeriodoDeclara=false;
					
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			
				if(this.periododeclaraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPeriodoDeclara==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPeriodoDeclara.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPeriodoDeclara.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.periododeclara.getsType().equals("DUPLICADO")
				   || this.periododeclara.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPeriodoDeclara=true;
				
				} else {
					this.isEsNuevoPeriodoDeclara=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
					if(this.periododeclara.getId()>=0 && !this.periododeclara.getIsNew()) {						
						this.isEsNuevoPeriodoDeclara=false;
						
					} else {
						this.isEsNuevoPeriodoDeclara=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPeriodoDeclara(esRelaciones);						
				
				this.seleccionarPeriodoDeclara(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.periododeclara.getId()<0) {
					this.isEsNuevoPeriodoDeclara=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPeriodoDeclara(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPeriodoDeclara(evt,rowIndex);
				}	
				
				if(this.periododeclaraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PeriodoDeclara: " + this.dDif); 
					}
				}								
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPeriodoDeclara(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.periododeclara)) {
					if(this.periododeclara.getId()>0) {
						this.periododeclara.setIsDeleted(true);
						
						this.periododeclarasEliminados.add(this.periododeclara);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.periododeclaraLogic.getPeriodoDeclaras().remove(this.periododeclara);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.periododeclaras.remove(this.periododeclara);				
					}
					
					
					((PeriodoDeclaraModel) this.jTableDatosPeriodoDeclara.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPeriodoDeclara(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPeriodoDeclara(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPeriodoDeclara) {
			
			if(this.jInternalFrameDetalleFormPeriodoDeclara==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPeriodoDeclara.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPeriodoDeclara.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPeriodoDeclara(this.periododeclara);
				}
				
				//ARCHITECTURE
				try {
					

					//Anio
					if(!this.periododeclaraConstantesFunciones.cargarid_anioPeriodoDeclara || this.periododeclaraConstantesFunciones.event_dependid_anioPeriodoDeclara) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.periododeclara.getid_anio());
									//this.inicializarActualizarBindingPeriodoDeclara(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(periododeclara.getAnio()!=null) {
							this.aniosForeignKey.add(periododeclara.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.periododeclara.getid_anio(),false,"Formulario");

					//Mes
					if(!this.periododeclaraConstantesFunciones.cargarid_mesPeriodoDeclara || this.periododeclaraConstantesFunciones.event_dependid_mesPeriodoDeclara) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.periododeclara.getid_mes());
									//this.inicializarActualizarBindingPeriodoDeclara(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(periododeclara.getMes()!=null) {
							this.messForeignKey.add(periododeclara.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.periododeclara.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPeriodoDeclara("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPeriodoDeclara(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPeriodoDeclara() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPeriodoDeclara(PeriodoDeclara periododeclara) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPeriodoDeclara(periododeclara,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPeriodoDeclara(PeriodoDeclara periododeclara,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPeriodoDeclara(periododeclara);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPeriodoDeclara(periododeclara,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPeriodoDeclara(periododeclara);
	}
	
	public void setVariablesObjetoActualToFormularioPeriodoDeclara(PeriodoDeclara periododeclara) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPeriodoDeclara==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPeriodoDeclara.jLabelidPeriodoDeclara.setText(periododeclara.getId().toString());
			this.jInternalFrameDetalleFormPeriodoDeclara.jTextFieldcodigoPeriodoDeclara.setText(periododeclara.getcodigo());
			this.jInternalFrameDetalleFormPeriodoDeclara.jDateChooserfechaPeriodoDeclara.setDate(periododeclara.getfecha());
			this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxesta_activoPeriodoDeclara.setSelected(periododeclara.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PeriodoDeclara periododeclaraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,periododeclaraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PeriodoDeclara periododeclaraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				periododeclaraLocal=this.periododeclara;
			} else {
				periododeclaraLocal=this.periododeclaraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(periododeclaraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPeriodoDeclara(periododeclaraLocal,true);
					
					if(periododeclaraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(periododeclaraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(periododeclaraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPeriodoDeclara(PeriodoDeclara periododeclara,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPeriodoDeclara(periododeclara,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(periododeclara);
	}
	
	public void setVariablesFormularioToObjetoActualPeriodoDeclara(PeriodoDeclara periododeclara,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPeriodoDeclara(periododeclara,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPeriodoDeclara(PeriodoDeclara periododeclara,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPeriodoDeclara==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPeriodoDeclara.jLabelidPeriodoDeclara.getText()==null || this.jInternalFrameDetalleFormPeriodoDeclara.jLabelidPeriodoDeclara.getText()=="" || this.jInternalFrameDetalleFormPeriodoDeclara.jLabelidPeriodoDeclara.getText()=="Id") {
				this.jInternalFrameDetalleFormPeriodoDeclara.jLabelidPeriodoDeclara.setText("0");
			}

			if(conColumnasBase) {periododeclara.setId(Long.parseLong(this.jInternalFrameDetalleFormPeriodoDeclara.jLabelidPeriodoDeclara.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PeriodoDeclaraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoDeclara.jLabelIdPeriodoDeclara,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			periododeclara.setcodigo(this.jInternalFrameDetalleFormPeriodoDeclara.jTextFieldcodigoPeriodoDeclara.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PeriodoDeclaraConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoDeclara.jLabelcodigoPeriodoDeclara,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			periododeclara.setfecha(this.jInternalFrameDetalleFormPeriodoDeclara.jDateChooserfechaPeriodoDeclara.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PeriodoDeclaraConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoDeclara.jLabelfechaPeriodoDeclara,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			periododeclara.setesta_activo(this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxesta_activoPeriodoDeclara.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoDeclara.jLabelesta_activoPeriodoDeclara,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPeriodoDeclara(PeriodoDeclara periododeclaraBean,PeriodoDeclara periododeclara,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPeriodoDeclara(PeriodoDeclara periododeclaraOrigen,PeriodoDeclara periododeclara,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && periododeclaraOrigen.getId()!=null && !periododeclaraOrigen.getId().equals(0L))) {periododeclara.setId(periododeclaraOrigen.getId());}}
			if(conDefault || (!conDefault && periododeclaraOrigen.getcodigo()!=null && !periododeclaraOrigen.getcodigo().equals(""))) {periododeclara.setcodigo(periododeclaraOrigen.getcodigo());}
			if(conDefault || (!conDefault && periododeclaraOrigen.getfecha()!=null && !periododeclaraOrigen.getfecha().equals(new Date()))) {periododeclara.setfecha(periododeclaraOrigen.getfecha());}
			if(conDefault || (!conDefault && periododeclaraOrigen.getesta_activo()!=null && !periododeclaraOrigen.getesta_activo().equals(false))) {periododeclara.setesta_activo(periododeclaraOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPeriodoDeclara(PeriodoDeclara periododeclara) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPeriodoDeclara.jLabelidPeriodoDeclara.setText(periododeclara.getId().toString());
			this.jInternalFrameDetalleFormPeriodoDeclara.jTextFieldcodigoPeriodoDeclara.setText(periododeclara.getcodigo());
			this.jInternalFrameDetalleFormPeriodoDeclara.jDateChooserfechaPeriodoDeclara.setDate(periododeclara.getfecha());
			this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxesta_activoPeriodoDeclara.setSelected(periododeclara.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPeriodoDeclara(PeriodoDeclaraBean periododeclaraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPeriodoDeclara.jLabelidPeriodoDeclara.setText(periododeclaraBean.getId().toString());
			this.jInternalFrameDetalleFormPeriodoDeclara.jTextFieldcodigoPeriodoDeclara.setText(periododeclaraBean.getcodigo());
			this.jInternalFrameDetalleFormPeriodoDeclara.jDateChooserfechaPeriodoDeclara.setDate(periododeclaraBean.getfecha());
			this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxesta_activoPeriodoDeclara.setSelected(periododeclaraBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPeriodoDeclara(PeriodoDeclaraParameterReturnGeneral periododeclaraReturnGeneral,PeriodoDeclaraBean periododeclaraBean,Boolean conDefault) throws Exception { 
		try {
			PeriodoDeclara periododeclaraLocal=new PeriodoDeclara();
			
			periododeclaraLocal=periododeclaraReturnGeneral.getPeriodoDeclara();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && periododeclaraLocal.getId()!=null && !periododeclaraLocal.getId().equals(0L))) {periododeclaraBean.setId(periododeclaraLocal.getId());}}
			if(conDefault || (!conDefault && periododeclaraLocal.getcodigo()!=null && !periododeclaraLocal.getcodigo().equals(""))) {periododeclaraBean.setcodigo(periododeclaraLocal.getcodigo());}
			if(conDefault || (!conDefault && periododeclaraLocal.getfecha()!=null && !periododeclaraLocal.getfecha().equals(new Date()))) {periododeclaraBean.setfecha(periododeclaraLocal.getfecha());}
			if(conDefault || (!conDefault && periododeclaraLocal.getesta_activo()!=null && !periododeclaraLocal.getesta_activo().equals(false))) {periododeclaraBean.setesta_activo(periododeclaraLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPeriodoDeclaraGenerico(Long idPeriodoDeclaraSeleccionado,JComboBox jComboBoxPeriodoDeclara,List<PeriodoDeclara> periododeclarasLocal)throws Exception {
		try {
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasLocal) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}

			jComboBoxPeriodoDeclara.setSelectedItem(periododeclaraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPeriodoDeclaraGenerico(JComboBox jComboBoxPeriodoDeclara,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPeriodoDeclara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPeriodoDeclara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPeriodoDeclara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPeriodoDeclara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPeriodoDeclara.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPeriodoDeclara.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPeriodoDeclara.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPeriodoDeclara.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPeriodoDeclara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPeriodoDeclara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("TransaccionLocal")) {
			jButtonTransaccionLocalActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("RetencionVenta")) {
			jButtonRetencionVentaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("FacturaDiario")) {
			jButtonFacturaDiarioActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DocumentoAnulado")) {
			jButtonDocumentoAnuladoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			periododeclara=(PeriodoDeclara) periododeclaraLogic.getPeriodoDeclaras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			periododeclara =(PeriodoDeclara) periododeclaras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!periododeclara.getIsNew() && !periododeclara.getIsChanged() && !periododeclara.getIsDeleted()) {
				sDescripcion=periododeclara.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=periododeclara.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!periododeclara.getIsNew() && !periododeclara.getIsChanged() && !periododeclara.getIsDeleted()) {
				sDescripcion=periododeclara.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=periododeclara.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PeriodoDeclara periododeclaraRow=new PeriodoDeclara();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			periododeclaraRow=(PeriodoDeclara) periododeclaraLogic.getPeriodoDeclaras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			periododeclaraRow=(PeriodoDeclara) periododeclaras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonTransaccionLocalActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PeriodoDeclara periododeclara) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPeriodoDeclara==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periododeclara = (PeriodoDeclara)this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.periododeclara = (PeriodoDeclara)this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(periododeclara!=null) {
						this.periododeclara = periododeclara;
					} else {
						this.periododeclara = new PeriodoDeclara();
					}
				}

				if(this.isTienePermisosTransaccionLocal && this.permiteMantenimiento(this.periododeclara)) {
					TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFramePopup=new TransaccionLocalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						transaccionlocalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFramePopup;
					} else {
						transaccionlocalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame;
					}

					List<PeriodoDeclara> periododeclaras=new ArrayList<PeriodoDeclara>();
					periododeclaras.add(this.periododeclara);
					if(!esRelacionado) {
						//transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setConGuardarRelaciones(false);
						//transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					transaccionlocalBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPeriodoDeclara.cargarTransaccionLocalBeanSwingJInternalFrame(periododeclaras,this.periododeclara,transaccionlocalBeanSwingJInternalFrame,/*conInicializar,*/transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getConGuardarRelaciones(),transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado());
					transaccionlocalBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("no_relacionado");

						transaccionlocalBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TransaccionLocalConstantesFunciones.ITAMANIOFILATABLA + (TransaccionLocalConstantesFunciones.ITAMANIOFILATABLA/2));

						transaccionlocalBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPeriodoDeclara=(TitledBorder)this.jScrollPanelDatosPeriodoDeclara.getBorder();
						TitledBorder titledBorderTransaccionLocal=(TitledBorder)transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.getBorder();

						titledBorderTransaccionLocal.setTitle(titledBorderPeriodoDeclara.getTitle() + " -> Transaccion Local");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,transaccionlocalBeanSwingJInternalFrame);
						}

						transaccionlocalBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(transaccionlocalBeanSwingJInternalFrame);

						transaccionlocalBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.periododeclaraSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Transaccion Local",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonRetencionVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PeriodoDeclara periododeclara) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPeriodoDeclara==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periododeclara = (PeriodoDeclara)this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.periododeclara = (PeriodoDeclara)this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(periododeclara!=null) {
						this.periododeclara = periododeclara;
					} else {
						this.periododeclara = new PeriodoDeclara();
					}
				}

				if(this.isTienePermisosRetencionVenta && this.permiteMantenimiento(this.periododeclara)) {
					RetencionVentaBeanSwingJInternalFrame retencionventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFramePopup=new RetencionVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						retencionventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFramePopup;
					} else {
						retencionventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame;
					}

					List<PeriodoDeclara> periododeclaras=new ArrayList<PeriodoDeclara>();
					periododeclaras.add(this.periododeclara);
					if(!esRelacionado) {
						//retencionventaBeanSwingJInternalFrame.retencionventaSessionBean.setConGuardarRelaciones(false);
						//retencionventaBeanSwingJInternalFrame.retencionventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					retencionventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPeriodoDeclara.cargarRetencionVentaBeanSwingJInternalFrame(periododeclaras,this.periododeclara,retencionventaBeanSwingJInternalFrame,/*conInicializar,*/retencionventaBeanSwingJInternalFrame.retencionventaSessionBean.getConGuardarRelaciones(),retencionventaBeanSwingJInternalFrame.retencionventaSessionBean.getEsGuardarRelacionado());
					retencionventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						retencionventaBeanSwingJInternalFrame.actualizarEstadoPanelsRetencionVenta("no_relacionado");

						retencionventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(RetencionVentaConstantesFunciones.ITAMANIOFILATABLA + (RetencionVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						retencionventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPeriodoDeclara=(TitledBorder)this.jScrollPanelDatosPeriodoDeclara.getBorder();
						TitledBorder titledBorderRetencionVenta=(TitledBorder)retencionventaBeanSwingJInternalFrame.jScrollPanelDatosRetencionVenta.getBorder();

						titledBorderRetencionVenta.setTitle(titledBorderPeriodoDeclara.getTitle() + " -> Retencion Venta");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,retencionventaBeanSwingJInternalFrame);
						}

						retencionventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(retencionventaBeanSwingJInternalFrame);

						retencionventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.periododeclaraSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Retencion Venta",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonFacturaDiarioActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PeriodoDeclara periododeclara) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPeriodoDeclara==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periododeclara = (PeriodoDeclara)this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.periododeclara = (PeriodoDeclara)this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(periododeclara!=null) {
						this.periododeclara = periododeclara;
					} else {
						this.periododeclara = new PeriodoDeclara();
					}
				}

				if(this.isTienePermisosFacturaDiario && this.permiteMantenimiento(this.periododeclara)) {
					FacturaDiarioBeanSwingJInternalFrame facturadiarioBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFramePopup=new FacturaDiarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						facturadiarioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFramePopup;
					} else {
						facturadiarioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame;
					}

					List<PeriodoDeclara> periododeclaras=new ArrayList<PeriodoDeclara>();
					periododeclaras.add(this.periododeclara);
					if(!esRelacionado) {
						//facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.setConGuardarRelaciones(false);
						//facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					facturadiarioBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPeriodoDeclara.cargarFacturaDiarioBeanSwingJInternalFrame(periododeclaras,this.periododeclara,facturadiarioBeanSwingJInternalFrame,/*conInicializar,*/facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.getConGuardarRelaciones(),facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.getEsGuardarRelacionado());
					facturadiarioBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						facturadiarioBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaDiario("no_relacionado");

						facturadiarioBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FacturaDiarioConstantesFunciones.ITAMANIOFILATABLA + (FacturaDiarioConstantesFunciones.ITAMANIOFILATABLA/2));

						facturadiarioBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPeriodoDeclara=(TitledBorder)this.jScrollPanelDatosPeriodoDeclara.getBorder();
						TitledBorder titledBorderFacturaDiario=(TitledBorder)facturadiarioBeanSwingJInternalFrame.jScrollPanelDatosFacturaDiario.getBorder();

						titledBorderFacturaDiario.setTitle(titledBorderPeriodoDeclara.getTitle() + " -> Factura Diario");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,facturadiarioBeanSwingJInternalFrame);
						}

						facturadiarioBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(facturadiarioBeanSwingJInternalFrame);

						facturadiarioBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.periododeclaraSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Factura Diario",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDocumentoAnuladoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PeriodoDeclara periododeclara) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPeriodoDeclara==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periododeclara = (PeriodoDeclara)this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.periododeclara = (PeriodoDeclara)this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(periododeclara!=null) {
						this.periododeclara = periododeclara;
					} else {
						this.periododeclara = new PeriodoDeclara();
					}
				}

				if(this.isTienePermisosDocumentoAnulado && this.permiteMantenimiento(this.periododeclara)) {
					DocumentoAnuladoBeanSwingJInternalFrame documentoanuladoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFramePopup=new DocumentoAnuladoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						documentoanuladoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFramePopup;
					} else {
						documentoanuladoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame;
					}

					List<PeriodoDeclara> periododeclaras=new ArrayList<PeriodoDeclara>();
					periododeclaras.add(this.periododeclara);
					if(!esRelacionado) {
						//documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.setConGuardarRelaciones(false);
						//documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					documentoanuladoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPeriodoDeclara.cargarDocumentoAnuladoBeanSwingJInternalFrame(periododeclaras,this.periododeclara,documentoanuladoBeanSwingJInternalFrame,/*conInicializar,*/documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.getConGuardarRelaciones(),documentoanuladoBeanSwingJInternalFrame.documentoanuladoSessionBean.getEsGuardarRelacionado());
					documentoanuladoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						documentoanuladoBeanSwingJInternalFrame.actualizarEstadoPanelsDocumentoAnulado("no_relacionado");

						documentoanuladoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DocumentoAnuladoConstantesFunciones.ITAMANIOFILATABLA + (DocumentoAnuladoConstantesFunciones.ITAMANIOFILATABLA/2));

						documentoanuladoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPeriodoDeclara=(TitledBorder)this.jScrollPanelDatosPeriodoDeclara.getBorder();
						TitledBorder titledBorderDocumentoAnulado=(TitledBorder)documentoanuladoBeanSwingJInternalFrame.jScrollPanelDatosDocumentoAnulado.getBorder();

						titledBorderDocumentoAnulado.setTitle(titledBorderPeriodoDeclara.getTitle() + " -> Documento Anulado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,documentoanuladoBeanSwingJInternalFrame);
						}

						documentoanuladoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(documentoanuladoBeanSwingJInternalFrame);

						documentoanuladoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.periododeclaraSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Documento Anulado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPeriodoDeclara(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPeriodoDeclara.setVisible((this.isVisibilidadCeldaNuevoPeriodoDeclara && this.isPermisoNuevoPeriodoDeclara));			
			this.jButtonDuplicarPeriodoDeclara.setVisible((this.isVisibilidadCeldaDuplicarPeriodoDeclara && this.isPermisoDuplicarPeriodoDeclara));			
			this.jButtonCopiarPeriodoDeclara.setVisible((this.isVisibilidadCeldaCopiarPeriodoDeclara && this.isPermisoCopiarPeriodoDeclara));
			this.jButtonVerFormPeriodoDeclara.setVisible((this.isVisibilidadCeldaVerFormPeriodoDeclara && this.isPermisoVerFormPeriodoDeclara));
			
			this.jButtonAbrirOrderByPeriodoDeclara.setVisible((this.isVisibilidadCeldaOrdenPeriodoDeclara && this.isPermisoOrdenPeriodoDeclara));			
			
			this.jButtonNuevoRelacionesPeriodoDeclara.setVisible((this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara && this.isPermisoNuevoPeriodoDeclara));			
			this.jButtonNuevoGuardarCambiosPeriodoDeclara.setVisible((this.isVisibilidadCeldaNuevoPeriodoDeclara && this.isPermisoNuevoPeriodoDeclara && this.isPermisoGuardarCambiosPeriodoDeclara));
			
			if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonModificarPeriodoDeclara.setVisible((this.isVisibilidadCeldaModificarPeriodoDeclara && this.isPermisoActualizarPeriodoDeclara));	
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonActualizarPeriodoDeclara.setVisible((this.isVisibilidadCeldaActualizarPeriodoDeclara && this.isPermisoActualizarPeriodoDeclara));	
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonEliminarPeriodoDeclara.setVisible((this.isVisibilidadCeldaEliminarPeriodoDeclara && this.isPermisoEliminarPeriodoDeclara));
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonCancelarPeriodoDeclara.setVisible(this.isVisibilidadCeldaCancelarPeriodoDeclara);							
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonGuardarCambiosPeriodoDeclara.setVisible((this.isVisibilidadCeldaGuardarPeriodoDeclara && this.isPermisoGuardarCambiosPeriodoDeclara));			
			
			}
						
			this.jButtonGuardarCambiosTablaPeriodoDeclara.setVisible((this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara && this.isPermisoGuardarCambiosPeriodoDeclara));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPeriodoDeclara.setVisible((this.isVisibilidadCeldaNuevoPeriodoDeclara && this.isPermisoNuevoPeriodoDeclara));						
			this.jButtonDuplicarToolBarPeriodoDeclara.setVisible((this.isVisibilidadCeldaDuplicarPeriodoDeclara && this.isPermisoDuplicarPeriodoDeclara));						
			this.jButtonCopiarToolBarPeriodoDeclara.setVisible((this.isVisibilidadCeldaCopiarPeriodoDeclara && this.isPermisoCopiarPeriodoDeclara));			
			this.jButtonVerFormToolBarPeriodoDeclara.setVisible((this.isVisibilidadCeldaVerFormPeriodoDeclara && this.isPermisoVerFormPeriodoDeclara));			
			this.jButtonAbrirOrderByToolBarPeriodoDeclara.setVisible((this.isVisibilidadCeldaOrdenPeriodoDeclara && this.isPermisoOrdenPeriodoDeclara));
			this.jButtonNuevoRelacionesToolBarPeriodoDeclara.setVisible((this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara && this.isPermisoNuevoPeriodoDeclara));			
			this.jButtonNuevoGuardarCambiosToolBarPeriodoDeclara.setVisible((this.isVisibilidadCeldaNuevoPeriodoDeclara && this.isPermisoNuevoPeriodoDeclara && this.isPermisoGuardarCambiosPeriodoDeclara));			
			
			if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonModificarToolBarPeriodoDeclara.setVisible((this.isVisibilidadCeldaModificarPeriodoDeclara && this.isPermisoActualizarPeriodoDeclara));	
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonActualizarToolBarPeriodoDeclara.setVisible((this.isVisibilidadCeldaActualizarPeriodoDeclara  && this.isPermisoActualizarPeriodoDeclara));	
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonEliminarToolBarPeriodoDeclara.setVisible((this.isVisibilidadCeldaEliminarPeriodoDeclara && this.isPermisoEliminarPeriodoDeclara));
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonCancelarToolBarPeriodoDeclara.setVisible(this.isVisibilidadCeldaCancelarPeriodoDeclara);				
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonGuardarCambiosToolBarPeriodoDeclara.setVisible((this.isVisibilidadCeldaGuardarPeriodoDeclara && this.isPermisoGuardarCambiosPeriodoDeclara));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPeriodoDeclara.setVisible((this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara && this.isPermisoGuardarCambiosPeriodoDeclara));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPeriodoDeclara.setVisible((this.isVisibilidadCeldaNuevoPeriodoDeclara && this.isPermisoNuevoPeriodoDeclara));			
			this.jMenuItemDuplicarPeriodoDeclara.setVisible((this.isVisibilidadCeldaDuplicarPeriodoDeclara && this.isPermisoDuplicarPeriodoDeclara));			
			this.jMenuItemCopiarPeriodoDeclara.setVisible((this.isVisibilidadCeldaCopiarPeriodoDeclara && this.isPermisoCopiarPeriodoDeclara));			
			this.jMenuItemVerFormPeriodoDeclara.setVisible((this.isVisibilidadCeldaVerFormPeriodoDeclara && this.isPermisoVerFormPeriodoDeclara));			
			this.jMenuItemAbrirOrderByPeriodoDeclara.setVisible((this.isVisibilidadCeldaOrdenPeriodoDeclara && this.isPermisoOrdenPeriodoDeclara));			
			//this.jMenuItemMostrarOcultarPeriodoDeclara.setVisible((this.isVisibilidadCeldaOrdenPeriodoDeclara && this.isPermisoOrdenPeriodoDeclara));
			this.jMenuItemDetalleAbrirOrderByPeriodoDeclara.setVisible((this.isVisibilidadCeldaOrdenPeriodoDeclara && this.isPermisoOrdenPeriodoDeclara));			
			//this.jMenuItemDetalleMostrarOcultarPeriodoDeclara.setVisible((this.isVisibilidadCeldaOrdenPeriodoDeclara && this.isPermisoOrdenPeriodoDeclara));			
			this.jMenuItemNuevoRelacionesPeriodoDeclara.setVisible((this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara && this.isPermisoNuevoPeriodoDeclara));			
			this.jMenuItemNuevoGuardarCambiosPeriodoDeclara.setVisible((this.isVisibilidadCeldaNuevoPeriodoDeclara && this.isPermisoNuevoPeriodoDeclara && this.isPermisoGuardarCambiosPeriodoDeclara));									
			
			if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemModificarPeriodoDeclara.setVisible((this.isVisibilidadCeldaModificarPeriodoDeclara && this.isPermisoActualizarPeriodoDeclara));	
			this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemActualizarPeriodoDeclara.setVisible((this.isVisibilidadCeldaActualizarPeriodoDeclara && this.isPermisoActualizarPeriodoDeclara));	
			this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemEliminarPeriodoDeclara.setVisible((this.isVisibilidadCeldaEliminarPeriodoDeclara && this.isPermisoEliminarPeriodoDeclara));
			this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemCancelarPeriodoDeclara.setVisible(this.isVisibilidadCeldaCancelarPeriodoDeclara);				
			}
			
			this.jMenuItemGuardarCambiosPeriodoDeclara.setVisible((this.isVisibilidadCeldaGuardarPeriodoDeclara && this.isPermisoGuardarCambiosPeriodoDeclara));						
			this.jMenuItemGuardarCambiosTablaPeriodoDeclara.setVisible((this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara && this.isPermisoGuardarCambiosPeriodoDeclara));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPeriodoDeclara=this.jButtonNuevoPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaDuplicarPeriodoDeclara=this.jButtonDuplicarPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaCopiarPeriodoDeclara=this.jButtonCopiarPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaVerFormPeriodoDeclara=this.jButtonVerFormPeriodoDeclara.isVisible();
			
			this.isVisibilidadCeldaOrdenPeriodoDeclara=this.jButtonAbrirOrderByPeriodoDeclara.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=this.jButtonNuevoRelacionesPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaModificarPeriodoDeclara=this.jButtonModificarPeriodoDeclara.isVisible();
			
			if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
			this.isVisibilidadCeldaActualizarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jButtonActualizarPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaEliminarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jButtonEliminarPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaCancelarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jButtonCancelarPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaGuardarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jButtonGuardarCambiosPeriodoDeclara.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara=this.jButtonGuardarCambiosTablaPeriodoDeclara.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPeriodoDeclara=this.jButtonNuevoToolBarPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=this.jButtonNuevoRelacionesToolBarPeriodoDeclara.isVisible();
			
			if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
			this.isVisibilidadCeldaModificarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jButtonModificarToolBarPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaActualizarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jButtonActualizarToolBarPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaEliminarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jButtonEliminarToolBarPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaCancelarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jButtonCancelarToolBarPeriodoDeclara.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPeriodoDeclara=this.jButtonGuardarCambiosToolBarPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara=this.jButtonGuardarCambiosTablaToolBarPeriodoDeclara.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPeriodoDeclara=this.jMenuItemNuevoPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=this.jMenuItemNuevoRelacionesPeriodoDeclara.isVisible();
			
			if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
			this.isVisibilidadCeldaModificarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemModificarPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaActualizarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemActualizarPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaEliminarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemEliminarPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaCancelarPeriodoDeclara=this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemCancelarPeriodoDeclara.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPeriodoDeclara=this.jMenuItemGuardarCambiosPeriodoDeclara.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara=this.jMenuItemGuardarCambiosTablaPeriodoDeclara.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPeriodoDeclara(Boolean esInicializar) {
		if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.periododeclaraSessionBean.getConGuardarRelaciones()) {
				//if(this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPeriodoDeclara();
			}
			
			this.inicializarActualizarBindingBotonesManualPeriodoDeclara(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPeriodoDeclara() {
		this.jButtonNuevoPeriodoDeclara.setVisible(this.isPermisoNuevoPeriodoDeclara);			
		this.jButtonDuplicarPeriodoDeclara.setVisible(this.isPermisoDuplicarPeriodoDeclara);			
		this.jButtonCopiarPeriodoDeclara.setVisible(this.isPermisoCopiarPeriodoDeclara);			
		this.jButtonVerFormPeriodoDeclara.setVisible(this.isPermisoVerFormPeriodoDeclara);			
		
		this.jButtonAbrirOrderByPeriodoDeclara.setVisible(this.isPermisoOrdenPeriodoDeclara);					
		
		this.jButtonNuevoRelacionesPeriodoDeclara.setVisible(this.isPermisoNuevoPeriodoDeclara);			
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonModificarPeriodoDeclara.setVisible(this.isPermisoActualizarPeriodoDeclara);	
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonActualizarPeriodoDeclara.setVisible(this.isPermisoActualizarPeriodoDeclara);	
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonEliminarPeriodoDeclara.setVisible(this.isPermisoEliminarPeriodoDeclara);
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonCancelarPeriodoDeclara.setVisible(this.isVisibilidadCeldaCancelarPeriodoDeclara);						
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonGuardarCambiosPeriodoDeclara.setVisible(this.isPermisoGuardarCambiosPeriodoDeclara);							
		}
		
		this.jButtonGuardarCambiosTablaPeriodoDeclara.setVisible(this.isPermisoActualizarPeriodoDeclara);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePeriodoDeclara() {
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonModificarPeriodoDeclara.setVisible(this.isPermisoActualizarPeriodoDeclara);	
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonActualizarPeriodoDeclara.setVisible(this.isPermisoActualizarPeriodoDeclara);	
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonEliminarPeriodoDeclara.setVisible(this.isPermisoEliminarPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonCancelarPeriodoDeclara.setVisible(this.isVisibilidadCeldaCancelarPeriodoDeclara);							
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonGuardarCambiosPeriodoDeclara.setVisible((this.isVisibilidadCeldaGuardarPeriodoDeclara && this.isPermisoGuardarCambiosPeriodoDeclara));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPeriodoDeclara() {
		if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPeriodoDeclara();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPeriodoDeclara() {
	}
	
	public void jTableDatosPeriodoDeclaraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPeriodoDeclara(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPeriodoDeclaraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.getperiododeclara(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periododeclara==null) {
						this.periododeclara = new PeriodoDeclara();
					}

					this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
				}

				if(this.periododeclara.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.periododeclara.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoDeclara(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoPeriodoDeclaraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.getperiododeclara(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periododeclara==null) {
						this.periododeclara = new PeriodoDeclara();
					}

					this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
				}

				if(this.periododeclara.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.periododeclara.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoDeclara(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioPeriodoDeclaraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebPeriodoDeclara(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPeriodoDeclara.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPeriodoDeclara.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.getperiododeclara(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.periododeclaraLogic.getConnexion());

				if(this.periododeclara.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.periododeclara.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPeriodoDeclara=(TitledBorder)this.jScrollPanelDatosPeriodoDeclara.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderPeriodoDeclara.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioPeriodoDeclaraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.getperiododeclara(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periododeclara==null) {
						this.periododeclara = new PeriodoDeclara();
					}

					this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
				}

				if(this.periododeclara.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.periododeclara.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoDeclara(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesPeriodoDeclaraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebPeriodoDeclara(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPeriodoDeclara.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPeriodoDeclara.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.getperiododeclara(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.periododeclaraLogic.getConnexion());

				if(this.periododeclara.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.periododeclara.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPeriodoDeclara=(TitledBorder)this.jScrollPanelDatosPeriodoDeclara.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderPeriodoDeclara.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesPeriodoDeclaraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.getperiododeclara(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periododeclara==null) {
						this.periododeclara = new PeriodoDeclara();
					}

					this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
				}

				if(this.periododeclara.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.periododeclara.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoDeclara(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaPeriodoDeclaraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.getperiododeclara(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periododeclara==null) {
						this.periododeclara = new PeriodoDeclara();
					}

					this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
				}

				if(this.periododeclara.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.periododeclara.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoDeclara(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoPeriodoDeclaraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.getperiododeclara(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periododeclara==null) {
						this.periododeclara = new PeriodoDeclara();
					}

					this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);
				}

				if(this.periododeclara.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.periododeclara.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoDeclara(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPeriodoDeclara(false,false);

			this.getPeriodoDeclarasFK_IdAnio();

			this.inicializarActualizarBindingPeriodoDeclara(false);

			//if(PeriodoDeclaraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPeriodoDeclara(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesPeriodoDeclaraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPeriodoDeclara(false,false);

			this.getPeriodoDeclarasFK_IdMes();

			this.inicializarActualizarBindingPeriodoDeclara(false);

			//if(PeriodoDeclaraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPeriodoDeclara(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periododeclaraLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePeriodoDeclara() {
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
		

		if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
			this.jInternalFrameDetalleFormPeriodoDeclara.setVisible(false);	    			
			this.jInternalFrameDetalleFormPeriodoDeclara.dispose();
			this.jInternalFrameDetalleFormPeriodoDeclara=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPeriodoDeclara!=null) {
			this.jInternalFrameReporteDinamicoPeriodoDeclara.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPeriodoDeclara.dispose();
			this.jInternalFrameReporteDinamicoPeriodoDeclara=null;
		}
		
		if(this.jInternalFrameImportacionPeriodoDeclara!=null) {
			this.jInternalFrameImportacionPeriodoDeclara.setVisible(false);	    			
			this.jInternalFrameImportacionPeriodoDeclara.dispose();
			this.jInternalFrameImportacionPeriodoDeclara=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPeriodoDeclara();
			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			
			
			if(sTipo.equals("NuevoPeriodoDeclara")) {
				jButtonNuevoPeriodoDeclaraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPeriodoDeclara")) {
				jButtonDuplicarPeriodoDeclaraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPeriodoDeclara")) {
				jButtonCopiarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("VerFormPeriodoDeclara")) {
				jButtonVerFormPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPeriodoDeclara")) {
				jButtonNuevoPeriodoDeclaraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPeriodoDeclara")) {
				jButtonDuplicarPeriodoDeclaraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPeriodoDeclara")) {
				jButtonNuevoPeriodoDeclaraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPeriodoDeclara")) {
				jButtonDuplicarPeriodoDeclaraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPeriodoDeclara")) {
				jButtonNuevoPeriodoDeclaraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPeriodoDeclara")) {
				jButtonNuevoPeriodoDeclaraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPeriodoDeclara")) {
				jButtonNuevoPeriodoDeclaraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPeriodoDeclara")) {
				jButtonModificarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPeriodoDeclara")) {
				jButtonModificarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPeriodoDeclara")) {
				jButtonModificarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPeriodoDeclara")) {
				jButtonActualizarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPeriodoDeclara")) {
				jButtonActualizarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPeriodoDeclara")) {
				jButtonActualizarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("EliminarPeriodoDeclara")) {
				jButtonEliminarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPeriodoDeclara")) {
				jButtonEliminarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPeriodoDeclara")) {
				jButtonEliminarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("CancelarPeriodoDeclara")) {
				jButtonCancelarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPeriodoDeclara")) {
				jButtonCancelarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPeriodoDeclara")) {
				jButtonCancelarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("CerrarPeriodoDeclara")) {
				jButtonCerrarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPeriodoDeclara")) {
				jButtonCerrarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPeriodoDeclara")) {
				jButtonCerrarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPeriodoDeclara")) {
				jButtonMostrarOcultarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPeriodoDeclara")) {
				jButtonCancelarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPeriodoDeclara")) {
				jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPeriodoDeclara")) {
				jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPeriodoDeclara")) {
				jButtonCopiarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPeriodoDeclara")) {
				jButtonVerFormPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPeriodoDeclara")) {
				jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPeriodoDeclara")) {
				jButtonCopiarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPeriodoDeclara")) {
				jButtonVerFormPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPeriodoDeclara")) {
				jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPeriodoDeclara")) {
				jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPeriodoDeclara")) {
				jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPeriodoDeclara")) {
				jButtonRecargarInformacionPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPeriodoDeclara")) {
				jButtonRecargarInformacionPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPeriodoDeclara")) {
				jButtonRecargarInformacionPeriodoDeclaraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPeriodoDeclara")) {
				jButtonAnterioresPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPeriodoDeclara")) {
				jButtonAnterioresPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePeriodoDeclara")) {
				jButtonAnterioresPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPeriodoDeclara")) {
				jButtonSiguientesPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPeriodoDeclara")) {
				jButtonSiguientesPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPeriodoDeclara")) {
				jButtonSiguientesPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPeriodoDeclara") || sTipo.equals("MenuItemDetalleAbrirOrderByPeriodoDeclara")) {
				jButtonAbrirOrderByPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPeriodoDeclara") || sTipo.equals("MenuItemDetalleMostrarOcultarPeriodoDeclara")) {
				jButtonMostrarOcultarPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPeriodoDeclara")) {
				jButtonNuevoGuardarCambiosPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPeriodoDeclara")) {
				jButtonNuevoGuardarCambiosPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPeriodoDeclara")) {
				jButtonNuevoGuardarCambiosPeriodoDeclaraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPeriodoDeclara")) {
				jButtonCerrarReporteDinamicoPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPeriodoDeclara")) {
				jButtonGenerarReporteDinamicoPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPeriodoDeclara")) {
				
				jButtonGenerarExcelReporteDinamicoPeriodoDeclaraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPeriodoDeclara")) {
				jButtonCerrarImportacionPeriodoDeclaraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPeriodoDeclara")) {
				
				jButtonGenerarImportacionPeriodoDeclaraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPeriodoDeclara")) {
				
				jButtonAbrirImportacionPeriodoDeclaraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPeriodoDeclara")) {
				jComboBoxTiposAccionesPeriodoDeclaraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPeriodoDeclara")) {
				jComboBoxTiposRelacionesPeriodoDeclaraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPeriodoDeclara")) {
				jComboBoxTiposAccionesPeriodoDeclaraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPeriodoDeclara")) {
				
				jComboBoxTiposSeleccionarPeriodoDeclaraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPeriodoDeclara")) {
				jTextFieldValorCampoGeneralPeriodoDeclaraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPeriodoDeclara")) {
				jButtonAbrirOrderByPeriodoDeclaraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPeriodoDeclara")) {
				jButtonAbrirOrderByPeriodoDeclaraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPeriodoDeclara")) {
				jButtonCerrarOrderByPeriodoDeclaraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPeriodoDeclaraBusqueda")) {
				this.jButtonidPeriodoDeclaraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPeriodoDeclaraBusqueda")) {
				this.jButtoncodigoPeriodoDeclaraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioPeriodoDeclaraUpdate")) {
				this.jButtonid_anioPeriodoDeclaraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioPeriodoDeclaraBusqueda")) {
				this.jButtonid_anioPeriodoDeclaraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesPeriodoDeclaraUpdate")) {
				this.jButtonid_mesPeriodoDeclaraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesPeriodoDeclaraBusqueda")) {
				this.jButtonid_mesPeriodoDeclaraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPeriodoDeclaraBusqueda")) {
				this.jButtonfechaPeriodoDeclaraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoPeriodoDeclaraBusqueda")) {
				this.jButtonesta_activoPeriodoDeclaraBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdAnioPeriodoDeclara")) {
				this.jButtonFK_IdAnioPeriodoDeclaraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesPeriodoDeclara")) {
				this.jButtonFK_IdMesPeriodoDeclaraActionPerformed(evt);
			}
			
			;
			
			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPeriodoDeclara();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoDeclaraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
				


				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoDeclara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoDeclara.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PeriodoDeclara periododeclaraLocal=null;
			
			if(!this.getEsControlTabla()) {
				periododeclaraLocal=this.periododeclara;
			} else {
				periododeclaraLocal=this.periododeclaraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
							
				
				


				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoDeclara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoDeclara.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoDeclaraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraAnterior =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periododeclaraAnterior =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
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
			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			
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
			
			


			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoDeclaraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
								
						
				


				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoDeclara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoDeclara.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
								
				
				


				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoDeclara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoDeclara.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoDeclaraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraAnterior =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periododeclaraAnterior =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoDeclaraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraAnterior =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periododeclaraAnterior =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoDeclaraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
			
			this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
							
				
				


				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoDeclara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoDeclara.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoDeclaraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periododeclaraAnterior =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.periododeclaraAnterior =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
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
			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			
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
			
			


			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoDeclaraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
			
			this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
								
				
				


				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoDeclara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoDeclara.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoDeclaraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraAnterior =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periododeclaraAnterior =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoDeclaraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
			
			this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoDeclaraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPeriodoDeclara")) {
					jCheckBoxSeleccionarTodosPeriodoDeclaraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPeriodoDeclara")) {
					jCheckBoxSeleccionadosPeriodoDeclaraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPeriodoDeclara")) {
					
				}
				
				


				
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoDeclara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoDeclara.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
												
				
				


				
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoDeclara.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoDeclara.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoDeclaraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periododeclaraAnterior =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.periododeclaraAnterior =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoDeclaraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
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
			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
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
			
			


			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoDeclaraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoDeclara.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoDeclara.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periododeclara);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periododeclara);
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
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
				
				


				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoDeclara.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoDeclara.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoDeclaraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periododeclaraAnterior =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periododeclaraAnterior =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPeriodoDeclara")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPeriodoDeclaraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPeriodoDeclara.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.periododeclara =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.periododeclara =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.periododeclara);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPeriodoDeclara")) {
				
				}
				
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPeriodoDeclara")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPeriodoDeclara.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPeriodoDeclara")) {
			
			}
			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPeriodoDeclara();
			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			
			if(sTipo.equals("NuevoPeriodoDeclara")) {
				jButtonNuevoPeriodoDeclaraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPeriodoDeclara")) {
				jButtonDuplicarPeriodoDeclaraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPeriodoDeclara")) {
				jButtonCopiarPeriodoDeclaraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPeriodoDeclara")) {
				jButtonVerFormPeriodoDeclaraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPeriodoDeclara")) {
				jButtonNuevoPeriodoDeclaraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPeriodoDeclara")) {
				jButtonModificarPeriodoDeclaraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPeriodoDeclara")) {
				jButtonActualizarPeriodoDeclaraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPeriodoDeclara")) {
				jButtonEliminarPeriodoDeclaraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPeriodoDeclara")) {
				jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPeriodoDeclara")) {
				jButtonCancelarPeriodoDeclaraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPeriodoDeclara")) {
				jButtonCerrarPeriodoDeclaraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPeriodoDeclara")) {
				jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPeriodoDeclara")) {
				jButtonNuevoGuardarCambiosPeriodoDeclaraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPeriodoDeclara")) {
				jButtonAbrirOrderByPeriodoDeclaraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPeriodoDeclara")) {
				jButtonRecargarInformacionPeriodoDeclaraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPeriodoDeclara")) {
				jButtonAnterioresPeriodoDeclaraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPeriodoDeclara")) {
				jButtonSiguientesPeriodoDeclaraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPeriodoDeclaraBusqueda")) {
				this.jButtonidPeriodoDeclaraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPeriodoDeclaraBusqueda")) {
				this.jButtoncodigoPeriodoDeclaraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioPeriodoDeclaraUpdate")) {
				this.jButtonid_anioPeriodoDeclaraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioPeriodoDeclaraBusqueda")) {
				this.jButtonid_anioPeriodoDeclaraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesPeriodoDeclaraUpdate")) {
				this.jButtonid_mesPeriodoDeclaraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesPeriodoDeclaraBusqueda")) {
				this.jButtonid_mesPeriodoDeclaraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPeriodoDeclaraBusqueda")) {
				this.jButtonfechaPeriodoDeclaraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoPeriodoDeclaraBusqueda")) {
				this.jButtonesta_activoPeriodoDeclaraBusquedaActionPerformed(evt);
			}
			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPeriodoDeclara();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePeriodoDeclara")) {
				closingInternalFramePeriodoDeclara();
				
			} else if(sTipo.equals("jButtonCancelarPeriodoDeclara")) {
				JInternalFrameBase jInternalFrameDetalleFormPeriodoDeclara = (JInternalFrameBase)evt.getSource();
	            	
	            PeriodoDeclaraBeanSwingJInternalFrame jInternalFrameParent=(PeriodoDeclaraBeanSwingJInternalFrame)jInternalFrameDetalleFormPeriodoDeclara.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPeriodoDeclaraActionPerformed(null);
			}
			
			PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.periododeclara,new Object(),this.periododeclaraParameterGeneral,this.periododeclaraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPeriodoDeclara(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPeriodoDeclara(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPeriodoDeclara(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.periododeclara)) {
			if(!esControlTabla) {
				if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);			
				}
				
				if(this.periododeclaraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPeriodoDeclara(this.periododeclara,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.periododeclaraReturnGeneral=periododeclaraLogic.procesarEventosPeriodoDeclarasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periododeclaraLogic.getPeriodoDeclaras(),this.periododeclara,this.periododeclaraParameterGeneral,this.isEsNuevoPeriodoDeclara,classes);//this.periododeclaraLogic.getPeriodoDeclara()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPeriodoDeclara(this.periododeclaraReturnGeneral,this.periododeclaraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.periododeclaraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPeriodoDeclara(classes,this.periododeclaraReturnGeneral,this.periododeclaraBean,false);
					}
						
					if(this.periododeclaraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPeriodoDeclara(this.periododeclaraReturnGeneral.getPeriodoDeclara());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPeriodoDeclara(this.periododeclaraReturnGeneral.getPeriodoDeclara());	
					}
						
					if(this.periododeclaraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPeriodoDeclara(this.periododeclaraReturnGeneral.getPeriodoDeclara(),classes);//this.periododeclaraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPeriodoDeclara(this.periododeclara,classes);//this.periododeclaraBean);									
				}
			
				if(PeriodoDeclaraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPeriodoDeclara(this.periododeclara,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoDeclara(this.periododeclara);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.periododeclaraAnterior!=null) {
						this.periododeclara=this.periododeclaraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.periododeclaraReturnGeneral=periododeclaraLogic.procesarEventosPeriodoDeclarasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periododeclaraLogic.getPeriodoDeclaras(),this.periododeclara,this.periododeclaraParameterGeneral,this.isEsNuevoPeriodoDeclara,classes);//this.periododeclaraLogic.getPeriodoDeclara()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.periododeclaraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.periododeclaraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.periododeclaraReturnGeneral.getPeriodoDeclara(),periododeclaraLogic.getPeriodoDeclaras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.periododeclaraReturnGeneral.getPeriodoDeclara(),this.periododeclaras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPeriodoDeclara.repaint();
				
				//((AbstractTableModel) this.jTableDatosPeriodoDeclara.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPeriodoDeclara();
			}
		}
	}
	
	public void actualizarVisualTableDatosPeriodoDeclara() throws Exception {
		
		PeriodoDeclaraModel periododeclaraModel=(PeriodoDeclaraModel)this.jTableDatosPeriodoDeclara.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			periododeclaraModel.periododeclaras=this.periododeclaraLogic.getPeriodoDeclaras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			periododeclaraModel.periododeclaras=this.periododeclaras;
		}
		
		
		((PeriodoDeclaraModel) this.jTableDatosPeriodoDeclara.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPeriodoDeclara() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getperiododeclaraAnterior(),this.periododeclaraLogic.getPeriodoDeclaras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getperiododeclaraAnterior(),this.periododeclaras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPeriodoDeclara();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPeriodoDeclara(PeriodoDeclara periododeclara,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(periododeclara.getTransaccionLocals());
					this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(RetencionVenta.class)) {
					this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.setRetencionVentas(periododeclara.getRetencionVentas());
					this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRetencionVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaDiario.class)) {
					this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.setFacturaDiarios(periododeclara.getFacturaDiarios());
					this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaDiario(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DocumentoAnulado.class)) {
					this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.setDocumentoAnulados(periododeclara.getDocumentoAnulados());
					this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDocumentoAnulado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
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
										
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periododeclara,new Object(),generalEntityParameterGeneral,this.periododeclaraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.periododeclaraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PeriodoDeclaraConstantesFunciones.getClassesRelationshipsOfPeriodoDeclara(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PeriodoDeclaraConstantesFunciones.getClassesRelationshipsFromStringsOfPeriodoDeclara(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPeriodoDeclara(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PeriodoDeclaraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periododeclara,new Object(),generalEntityParameterGeneral,this.periododeclaraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPeriodoDeclara(PeriodoDeclaraBean periododeclaraBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(periododeclara.getTransaccionLocals());
					this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(RetencionVenta.class)) {
					this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.setRetencionVentas(periododeclara.getRetencionVentas());
					this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRetencionVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaDiario.class)) {
					this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.setFacturaDiarios(periododeclara.getFacturaDiarios());
					this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaDiario(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DocumentoAnulado.class)) {
					this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.setDocumentoAnulados(periododeclara.getDocumentoAnulados());
					this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDocumentoAnulado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPeriodoDeclara(ArrayList<Classe> classes,PeriodoDeclaraReturnGeneral periododeclaraReturnGeneral,PeriodoDeclaraBean periododeclaraBean,Boolean conDefault) throws Exception {
		
			this.periododeclaraBean.setTransaccionLocals(periododeclaraReturnGeneral.getPeriodoDeclara().getTransaccionLocals());
			this.periododeclaraBean.setRetencionVentas(periododeclaraReturnGeneral.getPeriodoDeclara().getRetencionVentas());
			this.periododeclaraBean.setFacturaDiarios(periododeclaraReturnGeneral.getPeriodoDeclara().getFacturaDiarios());
			this.periododeclaraBean.setDocumentoAnulados(periododeclaraReturnGeneral.getPeriodoDeclara().getDocumentoAnulados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPeriodoDeclara(PeriodoDeclara periododeclara,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					periododeclara.setTransaccionLocals(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(RetencionVenta.class)) {
					periododeclara.setRetencionVentas(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaBeanSwingJInternalFrame.retencionventaLogic.getRetencionVentas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaDiario.class)) {
					periododeclara.setFacturaDiarios(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DocumentoAnulado.class)) {
					periododeclara.setDocumentoAnulados(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoBeanSwingJInternalFrame.documentoanuladoLogic.getDocumentoAnulados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.periododeclara)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPeriodoDeclara = new PeriodoDeclaraDetalleFormJInternalFrame(jDesktopPane,this.periododeclaraSessionBean.getConGuardarRelaciones(),this.periododeclaraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.setVisible(false);
		this.jInternalFrameDetalleFormPeriodoDeclara.setSelected(false);						
		
		this.jInternalFrameDetalleFormPeriodoDeclara.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPeriodoDeclara.periododeclaraLogic=this.periododeclaraLogic;
		
		this.cargarCombosFrameForeignKeyPeriodoDeclara("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePeriodoDeclara();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePeriodoDeclara();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPeriodoDeclara("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPeriodoDeclara();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPeriodoDeclara.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPeriodoDeclara"));
		
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonModificarPeriodoDeclara.addActionListener(new ButtonActionListener(this,"ModificarPeriodoDeclara"));

		
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonModificarToolBarPeriodoDeclara.addActionListener(new ButtonActionListener(this,"ModificarToolBarPeriodoDeclara"));
					
		this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemModificarPeriodoDeclara.addActionListener(new ButtonActionListener(this,"MenuItemModificarPeriodoDeclara"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonActualizarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"ActualizarPeriodoDeclara"));
		
		
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonActualizarToolBarPeriodoDeclara.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPeriodoDeclara"));
						
		this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemActualizarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPeriodoDeclara"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonEliminarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"EliminarPeriodoDeclara"));
		
		
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonEliminarToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"EliminarToolBarPeriodoDeclara"));
								
		this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemEliminarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPeriodoDeclara"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonCancelarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"CancelarPeriodoDeclara"));
		
		
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonCancelarToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"CancelarToolBarPeriodoDeclara"));
					
		this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemCancelarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPeriodoDeclara"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemDetalleCerrarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPeriodoDeclara"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonGuardarCambiosToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPeriodoDeclara"));
		
		
		
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonGuardarCambiosToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPeriodoDeclara"));
		
		
		
		this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPeriodoDeclara"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonidPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"idPeriodoDeclaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtoncodigoPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"codigoPeriodoDeclaraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonid_anioPeriodoDeclaraUpdate.addActionListener(new ButtonActionListener(this,"id_anioPeriodoDeclaraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonid_anioPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPeriodoDeclaraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonid_mesPeriodoDeclaraUpdate.addActionListener(new ButtonActionListener(this,"id_mesPeriodoDeclaraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonid_mesPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPeriodoDeclaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonfechaPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"fechaPeriodoDeclaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonesta_activoPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoPeriodoDeclaraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPeriodoDeclara.jTabbedPaneRelacionesPeriodoDeclara.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPeriodoDeclara"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePeriodoDeclara"));
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoDeclara.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPeriodoDeclara"));
		}
		
		this.jTableDatosPeriodoDeclara.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPeriodoDeclara"));
		
		this.jTableDatosPeriodoDeclara.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPeriodoDeclara"));
		
		this.jButtonNuevoPeriodoDeclara.addActionListener(new ButtonActionListener(this,"NuevoPeriodoDeclara"));
		
		this.jButtonDuplicarPeriodoDeclara.addActionListener(new ButtonActionListener(this,"DuplicarPeriodoDeclara"));
		
		this.jButtonCopiarPeriodoDeclara.addActionListener(new ButtonActionListener(this,"CopiarPeriodoDeclara"));
		
		this.jButtonVerFormPeriodoDeclara.addActionListener(new ButtonActionListener(this,"VerFormPeriodoDeclara"));
		
		
		this.jButtonNuevoToolBarPeriodoDeclara.addActionListener(new ButtonActionListener(this,"NuevoToolBarPeriodoDeclara"));
			
		this.jButtonDuplicarToolBarPeriodoDeclara.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPeriodoDeclara"));
			
		this.jMenuItemNuevoPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPeriodoDeclara"));
			
		this.jMenuItemDuplicarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPeriodoDeclara"));		
		
		
		this.jButtonNuevoRelacionesPeriodoDeclara.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPeriodoDeclara"));
		
		
		this.jButtonNuevoRelacionesToolBarPeriodoDeclara.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPeriodoDeclara"));
			
		this.jMenuItemNuevoRelacionesPeriodoDeclara.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPeriodoDeclara"));		
		
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonModificarPeriodoDeclara.addActionListener(new ButtonActionListener(this,"ModificarPeriodoDeclara"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonModificarToolBarPeriodoDeclara.addActionListener(new ButtonActionListener(this,"ModificarToolBarPeriodoDeclara"));
			
			this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemModificarPeriodoDeclara.addActionListener(new ButtonActionListener(this,"MenuItemModificarPeriodoDeclara"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonActualizarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"ActualizarPeriodoDeclara"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonActualizarToolBarPeriodoDeclara.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPeriodoDeclara"));
				
			this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemActualizarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPeriodoDeclara"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonEliminarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"EliminarPeriodoDeclara"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonEliminarToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"EliminarToolBarPeriodoDeclara"));
						
			this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemEliminarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPeriodoDeclara"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonCancelarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"CancelarPeriodoDeclara"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonCancelarToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"CancelarToolBarPeriodoDeclara"));
			
			this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemCancelarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPeriodoDeclara"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPeriodoDeclara"));		
		
		
		this.jButtonCerrarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"CerrarPeriodoDeclara"));
		
		
		this.jButtonCerrarToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"CerrarToolBarPeriodoDeclara"));
			
		this.jMenuItemCerrarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPeriodoDeclara"));
			
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jMenuItemDetalleCerrarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPeriodoDeclara"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonGuardarCambiosPeriodoDeclara.addActionListener (new ButtonActionListener(this,"GuardarCambiosPeriodoDeclara"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jButtonGuardarCambiosToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPeriodoDeclara"));
		}
		
		this.jButtonCopiarToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"CopiarToolBarPeriodoDeclara"));
			
		this.jButtonVerFormToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"VerFormToolBarPeriodoDeclara"));
		
		this.jMenuItemGuardarCambiosPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPeriodoDeclara"));
			
		this.jMenuItemCopiarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPeriodoDeclara"));		
		
		this.jMenuItemVerFormPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPeriodoDeclara"));		
		
		
		this.jButtonGuardarCambiosTablaPeriodoDeclara.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPeriodoDeclara"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPeriodoDeclara"));
			
		this.jMenuItemGuardarCambiosTablaPeriodoDeclara.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPeriodoDeclara"));		
		
		
		
		this.jButtonRecargarInformacionPeriodoDeclara.addActionListener (new ButtonActionListener(this,"RecargarInformacionPeriodoDeclara"));
					
		this.jButtonRecargarInformacionToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPeriodoDeclara"));
		
		this.jMenuItemRecargarInformacionPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPeriodoDeclara"));		
		
		
		
		this.jButtonAnterioresPeriodoDeclara.addActionListener (new ButtonActionListener(this,"AnterioresPeriodoDeclara"));
		
		
		this.jButtonAnterioresToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPeriodoDeclara"));
		
		this.jMenuItemAnterioresPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPeriodoDeclara"));		
		
		
		this.jButtonSiguientesPeriodoDeclara.addActionListener (new ButtonActionListener(this,"SiguientesPeriodoDeclara"));
		
		
		this.jButtonSiguientesToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPeriodoDeclara"));
			
		this.jMenuItemSiguientesPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPeriodoDeclara"));
			
		this.jMenuItemAbrirOrderByPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPeriodoDeclara"));
			
		this.jMenuItemMostrarOcultarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPeriodoDeclara"));
			
		this.jMenuItemDetalleAbrirOrderByPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPeriodoDeclara"));
			
		this.jMenuItemDetalleMostarOcultarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPeriodoDeclara"));		
		
		
		this.jButtonNuevoGuardarCambiosPeriodoDeclara.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPeriodoDeclara"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPeriodoDeclara"));
			
		this.jMenuItemNuevoGuardarCambiosPeriodoDeclara.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPeriodoDeclara"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPeriodoDeclara.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPeriodoDeclara"));

		this.jCheckBoxSeleccionadosPeriodoDeclara.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPeriodoDeclara"));
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPeriodoDeclara"));
		}
		
		
		this.jComboBoxTiposRelacionesPeriodoDeclara.addActionListener (new ButtonActionListener(this,"TiposRelacionesPeriodoDeclara"));
			
		this.jComboBoxTiposAccionesPeriodoDeclara.addActionListener (new ButtonActionListener(this,"TiposAccionesPeriodoDeclara"));
					
		this.jComboBoxTiposSeleccionarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPeriodoDeclara"));
			
		this.jTextFieldValorCampoGeneralPeriodoDeclara.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPeriodoDeclara"));		
		
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonidPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"idPeriodoDeclaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtoncodigoPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"codigoPeriodoDeclaraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonid_anioPeriodoDeclaraUpdate.addActionListener(new ButtonActionListener(this,"id_anioPeriodoDeclaraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonid_anioPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPeriodoDeclaraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonid_mesPeriodoDeclaraUpdate.addActionListener(new ButtonActionListener(this,"id_mesPeriodoDeclaraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonid_mesPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPeriodoDeclaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonfechaPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"fechaPeriodoDeclaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonesta_activoPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoPeriodoDeclaraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioPeriodoDeclara.addActionListener(new ButtonActionListener(this,"FK_IdAnioPeriodoDeclara"));

			this.jButtonFK_IdMesPeriodoDeclara.addActionListener(new ButtonActionListener(this,"FK_IdMesPeriodoDeclara"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPeriodoDeclara!=null) {
				this.jInternalFrameReporteDinamicoPeriodoDeclara.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPeriodoDeclara"));
				this.jInternalFrameReporteDinamicoPeriodoDeclara.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPeriodoDeclara"));
				this.jInternalFrameReporteDinamicoPeriodoDeclara.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPeriodoDeclara"));
			}
			
			//this.jButtonCerrarReporteDinamicoPeriodoDeclara.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPeriodoDeclara"));				
			//this.jButtonGenerarReporteDinamicoPeriodoDeclara.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPeriodoDeclara"));
			//this.jButtonGenerarExcelReporteDinamicoPeriodoDeclara.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPeriodoDeclara"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPeriodoDeclara!=null) {
				this.jInternalFrameImportacionPeriodoDeclara.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPeriodoDeclara"));
				this.jInternalFrameImportacionPeriodoDeclara.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPeriodoDeclara"));
				this.jInternalFrameImportacionPeriodoDeclara.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPeriodoDeclara"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPeriodoDeclara.addActionListener (new ButtonActionListener(this,"AbrirOrderByPeriodoDeclara"));
			
			this.jButtonAbrirOrderByToolBarPeriodoDeclara.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPeriodoDeclara"));			
			
			if(this.jInternalFrameOrderByPeriodoDeclara!=null) {
				this.jInternalFrameOrderByPeriodoDeclara.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPeriodoDeclara"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoDeclara.jTabbedPaneRelacionesPeriodoDeclara.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPeriodoDeclara"));
		
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
            		closingInternalFramePeriodoDeclara();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPeriodoDeclara.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPeriodoDeclara = (JInternalFrameBase)event.getSource();
	            	
	            PeriodoDeclaraBeanSwingJInternalFrame jInternalFrameParent=(PeriodoDeclaraBeanSwingJInternalFrame)jInternalFrameDetalleFormPeriodoDeclara.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPeriodoDeclaraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPeriodoDeclara.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPeriodoDeclaraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPeriodoDeclara.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPeriodoDeclara.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoDeclaraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoDeclaraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoDeclaraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPeriodoDeclara";
		inputMap = this.jButtonNuevoPeriodoDeclara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPeriodoDeclara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPeriodoDeclaraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoDeclaraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoDeclaraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoDeclaraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPeriodoDeclara";
		inputMap = this.jButtonNuevoRelacionesPeriodoDeclara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPeriodoDeclara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPeriodoDeclaraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPeriodoDeclara";
		inputMap = this.jButtonModificarPeriodoDeclara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPeriodoDeclara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPeriodoDeclaraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPeriodoDeclara";
		inputMap = this.jButtonActualizarPeriodoDeclara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPeriodoDeclara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPeriodoDeclaraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPeriodoDeclara";
		inputMap = this.jButtonEliminarPeriodoDeclara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPeriodoDeclara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPeriodoDeclaraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPeriodoDeclara";
		inputMap = this.jButtonCancelarPeriodoDeclara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPeriodoDeclara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPeriodoDeclaraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPeriodoDeclara";
		inputMap = this.jButtonCerrarPeriodoDeclara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPeriodoDeclara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPeriodoDeclaraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonGuardarCambiosPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPeriodoDeclara";
		inputMap = this.jInternalFrameDetalleFormPeriodoDeclara.jButtonGuardarCambiosPeriodoDeclara.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonGuardarCambiosPeriodoDeclara.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPeriodoDeclaraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPeriodoDeclara.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPeriodoDeclaraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPeriodoDeclara.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPeriodoDeclaraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPeriodoDeclara.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPeriodoDeclaraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPeriodoDeclara.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPeriodoDeclaraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonidPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"idPeriodoDeclaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtoncodigoPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"codigoPeriodoDeclaraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonid_anioPeriodoDeclaraUpdate.addActionListener(new ButtonActionListener(this,"id_anioPeriodoDeclaraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonid_anioPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPeriodoDeclaraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonid_mesPeriodoDeclaraUpdate.addActionListener(new ButtonActionListener(this,"id_mesPeriodoDeclaraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonid_mesPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPeriodoDeclaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonfechaPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"fechaPeriodoDeclaraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoDeclara.jButtonesta_activoPeriodoDeclaraBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoPeriodoDeclaraBusqueda"));
		
		
		this.jButtonFK_IdAnioPeriodoDeclara.addActionListener(new ButtonActionListener(this,"FK_IdAnioPeriodoDeclara"));

		this.jButtonFK_IdMesPeriodoDeclara.addActionListener(new ButtonActionListener(this,"FK_IdMesPeriodoDeclara"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPeriodoDeclara.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPeriodoDeclaraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPeriodoDeclaraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPeriodoDeclara.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPeriodoDeclara(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PeriodoDeclara periododeclaraAux:this.periododeclaraLogic.getPeriodoDeclaras()) {
					periododeclaraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PeriodoDeclara periododeclaraAux:periododeclaras) {
					periododeclaraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPeriodoDeclaraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPeriodoDeclara(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PeriodoDeclara periododeclaraAux:this.periododeclaraLogic.getPeriodoDeclaras()) {
						periododeclaraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PeriodoDeclara periododeclaraAux:periododeclaras) {
						periododeclaraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PeriodoDeclara periododeclaraAux:this.periododeclaraLogic.getPeriodoDeclaras()) {
					
						if(sTipoSeleccionar.equals(PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							periododeclaraAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PeriodoDeclara periododeclaraAux:periododeclaras) {
						
						if(sTipoSeleccionar.equals(PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							periododeclaraAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPeriodoDeclara(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPeriodoDeclara.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPeriodoDeclara.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPeriodoDeclara,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPeriodoDeclaraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPeriodoDeclara(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPeriodoDeclara.getSelectedRows();
			
			PeriodoDeclara periododeclaraLocal=new PeriodoDeclara();
			
			//this.seleccionarTodosPeriodoDeclara(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periododeclaraLocal =(PeriodoDeclara) this.periododeclaraLogic.getPeriodoDeclaras().toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					periododeclaraLocal =(PeriodoDeclara) this.periododeclaras.toArray()[this.jTableDatosPeriodoDeclara.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				periododeclaraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PeriodoDeclara periododeclaraAux:this.periododeclaraLogic.getPeriodoDeclaras()) {
						periododeclaraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PeriodoDeclara periododeclaraAux:periododeclaras) {
						periododeclaraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPeriodoDeclara(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPeriodoDeclara.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPeriodoDeclara.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPeriodoDeclara,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPeriodoDeclaraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPeriodoDeclaraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPeriodoDeclaraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPeriodoDeclara(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPeriodoDeclara.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PeriodoDeclara periododeclaraAux:this.periododeclaraLogic.getPeriodoDeclaras()) {
				
						if(sTipoSeleccionar.equals(PeriodoDeclaraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							periododeclaraAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PeriodoDeclaraConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							periododeclaraAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PeriodoDeclara periododeclaraAux:periododeclaras) {
					
						if(sTipoSeleccionar.equals(PeriodoDeclaraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							periododeclaraAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PeriodoDeclaraConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							periododeclaraAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPeriodoDeclara(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPeriodoDeclaraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPeriodoDeclara(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPeriodoDeclara=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPeriodoDeclara.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePeriodoDeclara) {				
					conSplash=true;//false;										
					
					//this.startProcessPeriodoDeclara(conSplash);
				
					this.generarReportePeriodoDeclarasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodoDeclara.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPeriodoDeclarasSeleccionados();
				//this.jComboBoxTiposAccionesPeriodoDeclara.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPeriodoDeclarasSeleccionados(false);
				//this.jComboBoxTiposAccionesPeriodoDeclara.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPeriodoDeclarasSeleccionados(true);
				//this.jComboBoxTiposAccionesPeriodoDeclara.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPeriodoDeclara();
				
				this.exportarPeriodoDeclarasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodoDeclara.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPeriodoDeclaras();
				//this.importarPeriodoDeclaras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodoDeclara.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPeriodoDeclara();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPeriodoDeclarasSeleccionados();
				//this.jComboBoxTiposAccionesPeriodoDeclara.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Periodo Declara", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPeriodoDeclara();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPeriodoDeclara)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPeriodoDeclara(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Periodo Declara",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodoDeclara.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.setSelectedIndex(0);					
				}	
			} 			
			else if(PeriodoDeclaraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePeriodoDeclara) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPeriodoDeclara(conSplash);
					
						//this.actualizarParametrosGeneralPeriodoDeclara();
						
						this.generarReporteProcesoAccionPeriodoDeclarasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPeriodoDeclara.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PeriodoDeclaraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Periodo DeclaraS SELECCIONADOS?", "MANTENIMIENTO DE Periodo Declara", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPeriodoDeclara();
				
						this.actualizarParametrosGeneralPeriodoDeclara();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.periododeclaraReturnGeneral=periododeclaraLogic.procesarAccionPeriodoDeclarasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.periododeclaraLogic.getPeriodoDeclaras(),this.periododeclaraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPeriodoDeclaraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPeriodoDeclara.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPeriodoDeclara();
					
					PeriodoDeclaraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPeriodoDeclaraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPeriodoDeclara.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxTiposAccionesFormularioPeriodoDeclara.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPeriodoDeclara(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPeriodoDeclaraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPeriodoDeclara();
			
			if(this.jInternalFrameDetalleFormPeriodoDeclara==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PeriodoDeclara> periododeclarasSeleccionados=new ArrayList<PeriodoDeclara>();		
			PeriodoDeclara periododeclara=new PeriodoDeclara();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPeriodoDeclara(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPeriodoDeclara.getSelectedItem();
			
			
			
			
			periododeclarasSeleccionados=this.getPeriodoDeclarasSeleccionados(true);
			//this.sTipoAccion;
			
			if(periododeclarasSeleccionados.size()==1) {
				for(PeriodoDeclara periododeclaraAux:periododeclarasSeleccionados) {
					periododeclara=periododeclaraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Transaccion Local")) {
					jButtonTransaccionLocalActionPerformed(null,rowIndex,true,false,periododeclara);
				}
				else if(this.sTipoRelacion.equals("Retencion Venta")) {
					jButtonRetencionVentaActionPerformed(null,rowIndex,true,false,periododeclara);
				}
				else if(this.sTipoRelacion.equals("Factura Diario")) {
					jButtonFacturaDiarioActionPerformed(null,rowIndex,true,false,periododeclara);
				}
				else if(this.sTipoRelacion.equals("Documento Anulado")) {
					jButtonDocumentoAnuladoActionPerformed(null,rowIndex,true,false,periododeclara);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPeriodoDeclara();
			
      		//this.finishProcessPeriodoDeclara(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPeriodoDeclaraReturnGeneral() throws Exception {
		if(this.periododeclaraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.periododeclaraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.periododeclaraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.periododeclaraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.periododeclaraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.periododeclaraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPeriodoDeclara(false);
		}
		
		if(this.periododeclaraReturnGeneral.getConRetornoLista() || this.periododeclaraReturnGeneral.getConRetornoObjeto()) {
			if(this.periododeclaraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.periododeclaraLogic.setPeriodoDeclaras(this.periododeclaraReturnGeneral.getPeriodoDeclaras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.periododeclaraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.periododeclaraLogic.setPeriodoDeclara(this.periododeclaraReturnGeneral.getPeriodoDeclara());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPeriodoDeclara(false);
		}
	}
	
	public void actualizarParametrosGeneralPeriodoDeclara() throws Exception {
		
		
	}
	
	public ArrayList<PeriodoDeclara> getPeriodoDeclarasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PeriodoDeclara> periododeclarasSeleccionados=new ArrayList<PeriodoDeclara>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPeriodoDeclara) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PeriodoDeclara periododeclaraAux:periododeclaraLogic.getPeriodoDeclaras()) {
					if(periododeclaraAux.getIsSelected()) {
						periododeclarasSeleccionados.add(periododeclaraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PeriodoDeclara periododeclaraAux:this.periododeclaras) {
					if(periododeclaraAux.getIsSelected()) {
						periododeclarasSeleccionados.add(periododeclaraAux);				
					}
				}
			}
			
			if(periododeclarasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						periododeclarasSeleccionados.addAll(this.periododeclaraLogic.getPeriodoDeclaras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						periododeclarasSeleccionados.addAll(this.periododeclaras);				
					}
				}
			}
		} else {
			periododeclarasSeleccionados.add(this.periododeclara);
		}
		
		return periododeclarasSeleccionados;
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
	
	public void generarReportePeriodoDeclarasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPeriodoDeclarasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPeriodoDeclarasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPeriodoDeclarasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPeriodoDeclarasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesPeriodoDeclarasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Periodo Declara",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPeriodoDeclarasSeleccionados() throws Exception {
		ArrayList<PeriodoDeclara> periododeclarasSeleccionados=new ArrayList<PeriodoDeclara>();		
		
		periododeclarasSeleccionados=this.getPeriodoDeclarasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePeriodoDeclaras("Todos",periododeclarasSeleccionados);
		
	}	
	
	public void generarReporteNormalPeriodoDeclarasSeleccionados() throws Exception {
		ArrayList<PeriodoDeclara> periododeclarasSeleccionados=new ArrayList<PeriodoDeclara>();		
		
		periododeclarasSeleccionados=this.getPeriodoDeclarasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePeriodoDeclaras("Todos",periododeclarasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPeriodoDeclarasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PeriodoDeclara> periododeclarasSeleccionados=new ArrayList<PeriodoDeclara>();
		
		periododeclarasSeleccionados=this.getPeriodoDeclarasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePeriodoDeclaras("Todos",periododeclarasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPeriodoDeclarasSeleccionados() throws Exception {
		ArrayList<PeriodoDeclara> periododeclarasSeleccionados=new ArrayList<PeriodoDeclara>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPeriodoDeclara();
		
		
		periododeclarasSeleccionados=this.getPeriodoDeclarasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPeriodoDeclara();
		
		
		//this.generarReportePeriodoDeclaras("Todos",periododeclarasSeleccionados ,periododeclaraImplementable,periododeclaraImplementableHome);
	}
	
	public void mostrarImportacionPeriodoDeclaras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPeriodoDeclara();
		
		this.abrirFrameImportacionPeriodoDeclara();		
		
			
		//this.generarReportePeriodoDeclaras("Todos",periododeclarasSeleccionados ,periododeclaraImplementable,periododeclaraImplementableHome);
	}
	
	public void importarPeriodoDeclaras() throws Exception {		
	
	}
	
	public void exportarPeriodoDeclarasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPeriodoDeclarasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPeriodoDeclarasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPeriodoDeclarasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Periodo Declara",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPeriodoDeclarasSeleccionados() throws Exception {
		ArrayList<PeriodoDeclara> periododeclarasSeleccionados=new ArrayList<PeriodoDeclara>();		
		
		periododeclarasSeleccionados=this.getPeriodoDeclarasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periododeclara."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPeriodoDeclara(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PeriodoDeclara periododeclaraAux:periododeclarasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPeriodoDeclara(periododeclaraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//periododeclaraAux.setsDetalleGeneralEntityReporte(periododeclaraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periododeclaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Declara",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPeriodoDeclara(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PeriodoDeclaraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoDeclaraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoDeclaraConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoDeclaraConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoDeclaraConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoDeclaraConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPeriodoDeclara(PeriodoDeclara periododeclara,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=periododeclara.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=periododeclara.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=periododeclara.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periododeclara.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periododeclara.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periododeclara.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periododeclara.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPeriodoDeclarasSeleccionados() throws Exception {
		ArrayList<PeriodoDeclara> periododeclarasSeleccionados=new ArrayList<PeriodoDeclara>();		
		
		periododeclarasSeleccionados=this.getPeriodoDeclarasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periododeclara.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PeriodoDeclaras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPeriodoDeclara(row);				
				iRow++;
			}				
			
			for(PeriodoDeclara periododeclaraAux:periododeclarasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPeriodoDeclara(periododeclaraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periododeclaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Declara",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPeriodoDeclarasSeleccionados() throws Exception {
		ArrayList<PeriodoDeclara> periododeclarasSeleccionados=new ArrayList<PeriodoDeclara>();		
		
		periododeclarasSeleccionados=this.getPeriodoDeclarasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periododeclara.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("periododeclaras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("periododeclara");
			//elementRoot.appendChild(element);
		
			for(PeriodoDeclara periododeclaraAux:periododeclarasSeleccionados) {
				element = document.createElement("periododeclara");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPeriodoDeclara(periododeclaraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periododeclaraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Declara",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPeriodoDeclara(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPeriodoDeclara(PeriodoDeclara periododeclara,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(periododeclara.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(periododeclara.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(periododeclara.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(periododeclara.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(periododeclara.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(periododeclara.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlPeriodoDeclara(PeriodoDeclara periododeclara,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PeriodoDeclaraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(periododeclara.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PeriodoDeclaraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(periododeclara.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(PeriodoDeclaraConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(periododeclara.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementanio_descripcion = document.createElement(PeriodoDeclaraConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(periododeclara.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(PeriodoDeclaraConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(periododeclara.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementfecha = document.createElement(PeriodoDeclaraConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(periododeclara.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementesta_activo = document.createElement(PeriodoDeclaraConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(periododeclara.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoPeriodoDeclarasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PeriodoDeclara> periododeclarasSeleccionados=new ArrayList<PeriodoDeclara>();
		
		periododeclarasSeleccionados=this.getPeriodoDeclarasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPeriodoDeclara(periododeclarasSeleccionados);
		
		this.generarReportePeriodoDeclaras("Todos",periododeclarasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPeriodoDeclara(ArrayList<PeriodoDeclara> periododeclarasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PeriodoDeclara periododeclaraAux:periododeclarasSeleccionados) {
				periododeclaraAux.setsDetalleGeneralEntityReporte(periododeclaraAux.toString());
			
				if(sTipoSeleccionar.equals(PeriodoDeclaraConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					periododeclaraAux.setsDescripcionGeneralEntityReporte1(periododeclaraAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(PeriodoDeclaraConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					periododeclaraAux.setsDescripcionGeneralEntityReporte1(periododeclaraAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PeriodoDeclaraConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					periododeclaraAux.setsDescripcionGeneralEntityReporte1(periododeclaraAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PeriodoDeclaraConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					periododeclaraAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(periododeclaraAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(PeriodoDeclaraConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					periododeclaraAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(periododeclaraAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoDeclaraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPeriodoDeclara(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPeriodoDeclara=true;
				this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=true;
				this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara=true;
			}
			
			this.isVisibilidadCeldaModificarPeriodoDeclara=false;
			this.isVisibilidadCeldaActualizarPeriodoDeclara=false;
			this.isVisibilidadCeldaEliminarPeriodoDeclara=false;
			this.isVisibilidadCeldaCancelarPeriodoDeclara=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoDeclara=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoDeclara=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPeriodoDeclara=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara=false;
			this.isVisibilidadCeldaModificarPeriodoDeclara=false;
			this.isVisibilidadCeldaActualizarPeriodoDeclara=true;
			this.isVisibilidadCeldaEliminarPeriodoDeclara=false;
			this.isVisibilidadCeldaCancelarPeriodoDeclara=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoDeclara=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoDeclara=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPeriodoDeclara=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara=false;
			this.isVisibilidadCeldaModificarPeriodoDeclara=false;
			this.isVisibilidadCeldaActualizarPeriodoDeclara=true;
			this.isVisibilidadCeldaEliminarPeriodoDeclara=true;
			this.isVisibilidadCeldaCancelarPeriodoDeclara=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoDeclara=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoDeclara=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPeriodoDeclara=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara=false;
			this.isVisibilidadCeldaModificarPeriodoDeclara=false;
			this.isVisibilidadCeldaActualizarPeriodoDeclara=true;
			this.isVisibilidadCeldaEliminarPeriodoDeclara=false;
			this.isVisibilidadCeldaCancelarPeriodoDeclara=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoDeclara=false;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoDeclara=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPeriodoDeclara=true;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=true;
			this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara=true;
			this.isVisibilidadCeldaModificarPeriodoDeclara=false;
			this.isVisibilidadCeldaActualizarPeriodoDeclara=false;
			this.isVisibilidadCeldaEliminarPeriodoDeclara=false;
			this.isVisibilidadCeldaCancelarPeriodoDeclara=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoDeclara=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoDeclara=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPeriodoDeclara=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara=false;
			this.isVisibilidadCeldaActualizarPeriodoDeclara=false;
			this.isVisibilidadCeldaEliminarPeriodoDeclara=false;
			this.isVisibilidadCeldaCancelarPeriodoDeclara=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoDeclara=false;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoDeclara=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPeriodoDeclara=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara=false;
			this.isVisibilidadCeldaModificarPeriodoDeclara=true;
			this.isVisibilidadCeldaActualizarPeriodoDeclara=false;
			this.isVisibilidadCeldaEliminarPeriodoDeclara=false;
			this.isVisibilidadCeldaCancelarPeriodoDeclara=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoDeclara=false;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoDeclara=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PeriodoDeclaraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPeriodoDeclara=true;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=true;
			this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara=true;
		} else {
			this.actualizarEstadoPanelsPeriodoDeclara(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPeriodoDeclara=false;
			//this.isVisibilidadCeldaVerFormPeriodoDeclara=false;
			this.isVisibilidadCeldaDuplicarPeriodoDeclara=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!periododeclaraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=false;
		} else {
			this.isVisibilidadCeldaNuevoPeriodoDeclara=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(periododeclaraSessionBean.getEsGuardarRelacionado()) {
			if(!periododeclaraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=false;												
			}
			
			this.jButtonCerrarPeriodoDeclara.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPeriodoDeclara=false;
		}
		
		if(!this.permiteMantenimiento(this.periododeclara)) {
			this.isVisibilidadCeldaActualizarPeriodoDeclara=false;
			this.isVisibilidadCeldaEliminarPeriodoDeclara=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPeriodoDeclara() {
		this.isVisibilidadCeldaNuevoPeriodoDeclara=false;
		this.isVisibilidadCeldaGuardarCambiosPeriodoDeclara=false;
	}
	
	public void actualizarEstadoPanelsPeriodoDeclara(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPeriodoDeclara!=null) {
				this.jScrollPanelDatosEdicionPeriodoDeclara.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoDeclara!=null) {
				this.jTabbedPaneBusquedasPeriodoDeclara.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoDeclara!=null) {
				this.jScrollPanelDatosPeriodoDeclara.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodoDeclara!=null) {
				this.jPanelPaginacionPeriodoDeclara.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodoDeclara!=null) {
				this.jPanelParametrosReportesPeriodoDeclara.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPeriodoDeclara!=null) {
				this.jScrollPanelDatosEdicionPeriodoDeclara.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoDeclara!=null) {
				this.jTabbedPaneBusquedasPeriodoDeclara.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPeriodoDeclara!=null) {
				this.jScrollPanelDatosPeriodoDeclara.setVisible(false);
			}
			
			if(this.jPanelPaginacionPeriodoDeclara!=null) {
				this.jPanelPaginacionPeriodoDeclara.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPeriodoDeclara!=null) {
				this.jPanelParametrosReportesPeriodoDeclara.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPeriodoDeclara!=null) {
				this.jScrollPanelDatosEdicionPeriodoDeclara.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoDeclara!=null) {
				this.jTabbedPaneBusquedasPeriodoDeclara.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoDeclara!=null) {
				this.jScrollPanelDatosPeriodoDeclara.setVisible(false);
			}
			
			if(this.jPanelPaginacionPeriodoDeclara!=null) {
				this.jPanelPaginacionPeriodoDeclara.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPeriodoDeclara!=null) {
				this.jPanelParametrosReportesPeriodoDeclara.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPeriodoDeclara!=null) {
				this.jScrollPanelDatosEdicionPeriodoDeclara.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoDeclara!=null) {
				this.jTabbedPaneBusquedasPeriodoDeclara.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoDeclara!=null) {
				this.jScrollPanelDatosPeriodoDeclara.setVisible(false);
			}
			
			if(this.jPanelPaginacionPeriodoDeclara!=null) {
				this.jPanelPaginacionPeriodoDeclara.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPeriodoDeclara!=null) {
				this.jPanelParametrosReportesPeriodoDeclara.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPeriodoDeclara!=null) {
				this.jScrollPanelDatosEdicionPeriodoDeclara.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoDeclara!=null) {
				this.jTabbedPaneBusquedasPeriodoDeclara.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoDeclara!=null) {
				this.jScrollPanelDatosPeriodoDeclara.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodoDeclara!=null) {
				this.jPanelPaginacionPeriodoDeclara.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodoDeclara!=null) {
				this.jPanelParametrosReportesPeriodoDeclara.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPeriodoDeclara!=null) {
				this.jScrollPanelDatosEdicionPeriodoDeclara.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoDeclara!=null) {
				this.jTabbedPaneBusquedasPeriodoDeclara.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoDeclara!=null) {
				this.jScrollPanelDatosPeriodoDeclara.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodoDeclara!=null) {
				this.jPanelPaginacionPeriodoDeclara.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodoDeclara!=null) {
				this.jPanelParametrosReportesPeriodoDeclara.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPeriodoDeclara!=null) {
				this.jScrollPanelDatosEdicionPeriodoDeclara.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoDeclara!=null) {
				this.jTabbedPaneBusquedasPeriodoDeclara.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoDeclara!=null) {
				this.jScrollPanelDatosPeriodoDeclara.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodoDeclara!=null) {
				this.jPanelPaginacionPeriodoDeclara.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodoDeclara!=null) {
				this.jPanelParametrosReportesPeriodoDeclara.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPeriodoDeclara!=null) {
					this.jTabbedPaneBusquedasPeriodoDeclara.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPeriodoDeclara!=null) {
				this.jPanelParametrosReportesPeriodoDeclara.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.periododeclaraSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoDeclara!=null) {
				this.jTabbedPaneBusquedasPeriodoDeclara.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPeriodoDeclara!=null) {
				this.jPanelParametrosReportesPeriodoDeclara.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasPeriodoDeclara.remove(jPanelFK_IdAnioPeriodoDeclara);}

			this.isVisibilidadFK_IdMes=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasPeriodoDeclara.remove(jPanelFK_IdMesPeriodoDeclara);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasPeriodoDeclara.remove(jPanelFK_IdAnioPeriodoDeclara);}

			this.isVisibilidadFK_IdMes=isParaMes;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasPeriodoDeclara.remove(jPanelFK_IdMesPeriodoDeclara);}
		}
		
	}
	
	

	public String registrarSesionPeriodoDeclaraParaTransaccionLocales() throws Exception {
		Boolean isPaginaPopupTransaccionLocal=false;

		try {

			if(this.periododeclaraSessionBean==null) {
				this.periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
			}

			if(this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalSessionBean==null) {
				this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
			}

			this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalSessionBean.setsPathNavegacionActual(periododeclaraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTransaccionLocal=this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTransaccionLocal(true);
			this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionLocal(PeriodoDeclaraConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalSessionBean.setisBusquedaDesdeForeignKeySesionPeriodoDeclara(true);
			this.jInternalFrameDetalleFormPeriodoDeclara.transaccionlocalSessionBean.setlidPeriodoDeclaraActual(this.idPeriodoDeclaraActual);

			periododeclaraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPeriodoDeclara(true);
			periododeclaraSessionBean.setlIdPeriodoDeclaraActualForeignKey(this.idPeriodoDeclaraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionPeriodoDeclaraParaRetencionVentas() throws Exception {
		Boolean isPaginaPopupRetencionVenta=false;

		try {

			if(this.periododeclaraSessionBean==null) {
				this.periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
			}

			if(this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaSessionBean==null) {
				this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaSessionBean=new RetencionVentaSessionBean();
			}

			this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaSessionBean.setsPathNavegacionActual(periododeclaraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+RetencionVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupRetencionVenta=this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeRetencionVenta(true);
			this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeRetencionVenta(PeriodoDeclaraConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaSessionBean.setisBusquedaDesdeForeignKeySesionPeriodoDeclara(true);
			this.jInternalFrameDetalleFormPeriodoDeclara.retencionventaSessionBean.setlidPeriodoDeclaraActual(this.idPeriodoDeclaraActual);

			periododeclaraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPeriodoDeclara(true);
			periododeclaraSessionBean.setlIdPeriodoDeclaraActualForeignKey(this.idPeriodoDeclaraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionPeriodoDeclaraParaFacturaDiarios() throws Exception {
		Boolean isPaginaPopupFacturaDiario=false;

		try {

			if(this.periododeclaraSessionBean==null) {
				this.periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
			}

			if(this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioSessionBean==null) {
				this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioSessionBean=new FacturaDiarioSessionBean();
			}

			this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioSessionBean.setsPathNavegacionActual(periododeclaraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFacturaDiario=this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFacturaDiario(true);
			this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaDiario(PeriodoDeclaraConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioSessionBean.setisBusquedaDesdeForeignKeySesionPeriodoDeclara(true);
			this.jInternalFrameDetalleFormPeriodoDeclara.facturadiarioSessionBean.setlidPeriodoDeclaraActual(this.idPeriodoDeclaraActual);

			periododeclaraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPeriodoDeclara(true);
			periododeclaraSessionBean.setlIdPeriodoDeclaraActualForeignKey(this.idPeriodoDeclaraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionPeriodoDeclaraParaDocumentoAnulados() throws Exception {
		Boolean isPaginaPopupDocumentoAnulado=false;

		try {

			if(this.periododeclaraSessionBean==null) {
				this.periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
			}

			if(this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoSessionBean==null) {
				this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
			}

			this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoSessionBean.setsPathNavegacionActual(periododeclaraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDocumentoAnulado=this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDocumentoAnulado(true);
			this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDocumentoAnulado(PeriodoDeclaraConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoSessionBean.setisBusquedaDesdeForeignKeySesionPeriodoDeclara(true);
			this.jInternalFrameDetalleFormPeriodoDeclara.documentoanuladoSessionBean.setlidPeriodoDeclaraActual(this.idPeriodoDeclaraActual);

			periododeclaraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPeriodoDeclara(true);
			periododeclaraSessionBean.setlIdPeriodoDeclaraActualForeignKey(this.idPeriodoDeclaraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PeriodoDeclaraSessionBean periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
		
		if(this.periododeclaraSessionBean==null) {
			this.periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
		}
		
		this.periododeclaraSessionBean.setsUltimaBusquedaPeriodoDeclara(this.getsAccionBusqueda());
		this.periododeclaraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.periododeclaraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			periododeclaraSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
			periododeclaraSessionBean.setid_mes(this.getid_mesFK_IdMes());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PeriodoDeclaraSessionBean periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
		
		if(this.periododeclaraSessionBean==null) {
			this.periododeclaraSessionBean=new PeriodoDeclaraSessionBean();
		}
		
		if(this.periododeclaraSessionBean.getsUltimaBusquedaPeriodoDeclara()!=null&&!this.periododeclaraSessionBean.getsUltimaBusquedaPeriodoDeclara().equals("")) {
			this.setsAccionBusqueda(periododeclaraSessionBean.getsUltimaBusquedaPeriodoDeclara());
			this.setiNumeroPaginacion(periododeclaraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(periododeclaraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(periododeclaraSessionBean.getid_anio());
				periododeclaraSessionBean.setid_anio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
				this.setid_mesFK_IdMes(periododeclaraSessionBean.getid_mes());
				periododeclaraSessionBean.setid_mes(-1L);
			}
		}
		
		this.periododeclaraSessionBean.setsUltimaBusquedaPeriodoDeclara("");
		this.periododeclaraSessionBean.setiNumeroPaginacion(PeriodoDeclaraConstantesFunciones.INUMEROPAGINACION);
		this.periododeclaraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPeriodoDeclara(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPeriodoDeclara() {
		this.updateBorderResaltarBusquedasFormularioPeriodoDeclara();
		this.updateVisibilidadBusquedasFormularioPeriodoDeclara();
		this.updateHabilitarBusquedasFormularioPeriodoDeclara();
	}
	
	public void updateBorderResaltarBusquedasFormularioPeriodoDeclara() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPeriodoDeclara.getComponents().length>0) {
	

		if(this.periododeclaraConstantesFunciones.resaltarFK_IdAnioPeriodoDeclara!=null) {
			index= this.jTabbedPaneBusquedasPeriodoDeclara.indexOfComponent(this.jPanelFK_IdAnioPeriodoDeclara);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoDeclara.getComponent(index);
				jPanel.setBorder(this.periododeclaraConstantesFunciones.resaltarFK_IdAnioPeriodoDeclara);
			}
		}

		if(this.periododeclaraConstantesFunciones.resaltarFK_IdMesPeriodoDeclara!=null) {
			index= this.jTabbedPaneBusquedasPeriodoDeclara.indexOfComponent(this.jPanelFK_IdMesPeriodoDeclara);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoDeclara.getComponent(index);
				jPanel.setBorder(this.periododeclaraConstantesFunciones.resaltarFK_IdMesPeriodoDeclara);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPeriodoDeclara() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPeriodoDeclara.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPeriodoDeclara.indexOfComponent(this.jPanelFK_IdAnioPeriodoDeclara);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoDeclara.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.periododeclaraConstantesFunciones.mostrarFK_IdAnioPeriodoDeclara);
			if(!this.periododeclaraConstantesFunciones.mostrarFK_IdAnioPeriodoDeclara && index>-1) {
				this.jTabbedPaneBusquedasPeriodoDeclara.remove(index);
			}

			index= this.jTabbedPaneBusquedasPeriodoDeclara.indexOfComponent(this.jPanelFK_IdMesPeriodoDeclara);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoDeclara.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.periododeclaraConstantesFunciones.mostrarFK_IdMesPeriodoDeclara);
			if(!this.periododeclaraConstantesFunciones.mostrarFK_IdMesPeriodoDeclara && index>-1) {
				this.jTabbedPaneBusquedasPeriodoDeclara.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPeriodoDeclara() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPeriodoDeclara.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPeriodoDeclara.indexOfComponent(this.jPanelFK_IdAnioPeriodoDeclara);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoDeclara.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.periododeclaraConstantesFunciones.activarFK_IdAnioPeriodoDeclara);
				this.jTabbedPaneBusquedasPeriodoDeclara.setEnabledAt(index,this.periododeclaraConstantesFunciones.activarFK_IdAnioPeriodoDeclara);
			}

			index= this.jTabbedPaneBusquedasPeriodoDeclara.indexOfComponent(this.jPanelFK_IdMesPeriodoDeclara);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoDeclara.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.periododeclaraConstantesFunciones.activarFK_IdMesPeriodoDeclara);
				this.jTabbedPaneBusquedasPeriodoDeclara.setEnabledAt(index,this.periododeclaraConstantesFunciones.activarFK_IdMesPeriodoDeclara);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPeriodoDeclara(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasPeriodoDeclara.indexOfComponent(this.jPanelFK_IdAnioPeriodoDeclara);

			this.jTabbedPaneBusquedasPeriodoDeclara.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoDeclara.getComponent(index);

			this.periododeclaraConstantesFunciones.setResaltarFK_IdAnioPeriodoDeclara(resaltar);

			jPanel.setBorder(this.periododeclaraConstantesFunciones.resaltarFK_IdAnioPeriodoDeclara);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMes")) {
			index= this.jTabbedPaneBusquedasPeriodoDeclara.indexOfComponent(this.jPanelFK_IdMesPeriodoDeclara);

			this.jTabbedPaneBusquedasPeriodoDeclara.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoDeclara.getComponent(index);

			this.periododeclaraConstantesFunciones.setResaltarFK_IdMesPeriodoDeclara(resaltar);

			jPanel.setBorder(this.periododeclaraConstantesFunciones.resaltarFK_IdMesPeriodoDeclara);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPeriodoDeclara.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPeriodoDeclara() throws Exception {

		if(this.jInternalFrameDetalleFormPeriodoDeclara==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPeriodoDeclara();
		this.updateVisibilidadResaltarControlesFormularioPeriodoDeclara();
		this.updateHabilitarResaltarControlesFormularioPeriodoDeclara();
		
	}
	
	public void updateBorderResaltarControlesFormularioPeriodoDeclara() throws Exception {
		if(this.jInternalFrameDetalleFormPeriodoDeclara==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.periododeclaraConstantesFunciones.resaltaridPeriodoDeclara!=null && this.jInternalFrameDetalleFormPeriodoDeclara!=null) {this.jInternalFrameDetalleFormPeriodoDeclara.jLabelidPeriodoDeclara.setBorder(this.periododeclaraConstantesFunciones.resaltaridPeriodoDeclara);}
		if(this.periododeclaraConstantesFunciones.resaltarcodigoPeriodoDeclara!=null && this.jInternalFrameDetalleFormPeriodoDeclara!=null) {this.jInternalFrameDetalleFormPeriodoDeclara.jTextFieldcodigoPeriodoDeclara.setBorder(this.periododeclaraConstantesFunciones.resaltarcodigoPeriodoDeclara);}
		if(this.periododeclaraConstantesFunciones.resaltarid_anioPeriodoDeclara!=null && this.jInternalFrameDetalleFormPeriodoDeclara!=null) {this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara.setBorder(this.periododeclaraConstantesFunciones.resaltarid_anioPeriodoDeclara);}
		if(this.periododeclaraConstantesFunciones.resaltarid_mesPeriodoDeclara!=null && this.jInternalFrameDetalleFormPeriodoDeclara!=null) {this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara.setBorder(this.periododeclaraConstantesFunciones.resaltarid_mesPeriodoDeclara);}
		if(this.periododeclaraConstantesFunciones.resaltarfechaPeriodoDeclara!=null && this.jInternalFrameDetalleFormPeriodoDeclara!=null) {this.jInternalFrameDetalleFormPeriodoDeclara.jDateChooserfechaPeriodoDeclara.setBorder(this.periododeclaraConstantesFunciones.resaltarfechaPeriodoDeclara);}
		if(this.periododeclaraConstantesFunciones.resaltaresta_activoPeriodoDeclara!=null && this.jInternalFrameDetalleFormPeriodoDeclara!=null) {this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxesta_activoPeriodoDeclara.setBorderPainted(true);this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxesta_activoPeriodoDeclara.setBorder(this.periododeclaraConstantesFunciones.resaltaresta_activoPeriodoDeclara);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPeriodoDeclara() throws Exception {		
		if(this.jInternalFrameDetalleFormPeriodoDeclara==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
	
		//this.jInternalFrameDetalleFormPeriodoDeclara.jLabelidPeriodoDeclara.setVisible(this.periododeclaraConstantesFunciones.mostraridPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jPanelidPeriodoDeclara.setVisible(this.periododeclaraConstantesFunciones.mostraridPeriodoDeclara);
		//this.jInternalFrameDetalleFormPeriodoDeclara.jTextFieldcodigoPeriodoDeclara.setVisible(this.periododeclaraConstantesFunciones.mostrarcodigoPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jPanelcodigoPeriodoDeclara.setVisible(this.periododeclaraConstantesFunciones.mostrarcodigoPeriodoDeclara);
		//this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara.setVisible(this.periododeclaraConstantesFunciones.mostrarid_anioPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jPanelid_anioPeriodoDeclara.setVisible(this.periododeclaraConstantesFunciones.mostrarid_anioPeriodoDeclara);
		//this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara.setVisible(this.periododeclaraConstantesFunciones.mostrarid_mesPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jPanelid_mesPeriodoDeclara.setVisible(this.periododeclaraConstantesFunciones.mostrarid_mesPeriodoDeclara);
		//this.jInternalFrameDetalleFormPeriodoDeclara.jDateChooserfechaPeriodoDeclara.setVisible(this.periododeclaraConstantesFunciones.mostrarfechaPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jPanelfechaPeriodoDeclara.setVisible(this.periododeclaraConstantesFunciones.mostrarfechaPeriodoDeclara);
		//this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxesta_activoPeriodoDeclara.setVisible(this.periododeclaraConstantesFunciones.mostraresta_activoPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jPanelesta_activoPeriodoDeclara.setVisible(this.periododeclaraConstantesFunciones.mostraresta_activoPeriodoDeclara);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPeriodoDeclara() throws Exception {
		if(this.jInternalFrameDetalleFormPeriodoDeclara==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPeriodoDeclara!=null) {
	
		this.jInternalFrameDetalleFormPeriodoDeclara.jLabelidPeriodoDeclara.setEnabled(this.periododeclaraConstantesFunciones.activaridPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jTextFieldcodigoPeriodoDeclara.setEnabled(this.periododeclaraConstantesFunciones.activarcodigoPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_anioPeriodoDeclara.setEnabled(this.periododeclaraConstantesFunciones.activarid_anioPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jComboBoxid_mesPeriodoDeclara.setEnabled(this.periododeclaraConstantesFunciones.activarid_mesPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jDateChooserfechaPeriodoDeclara.setEnabled(this.periododeclaraConstantesFunciones.activarfechaPeriodoDeclara);
		this.jInternalFrameDetalleFormPeriodoDeclara.jCheckBoxesta_activoPeriodoDeclara.setEnabled(this.periododeclaraConstantesFunciones.activaresta_activoPeriodoDeclara);
		}
	}
	
		
}