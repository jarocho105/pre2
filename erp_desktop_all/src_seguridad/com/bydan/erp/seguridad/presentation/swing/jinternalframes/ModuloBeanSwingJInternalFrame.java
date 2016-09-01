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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.ModuloConstantesFunciones;
import com.bydan.erp.seguridad.util.ModuloParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.ModuloParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.ModuloBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
public class ModuloBeanSwingJInternalFrame extends ModuloJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ModuloBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Modulo> moduloValidator = new ClassValidator<Modulo>(Modulo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Modulo modulo;	
	public Modulo moduloAux;
	public Modulo moduloAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Modulo moduloTotales;
	public Long idModuloActual;
	public Long iIdNuevoModulo=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboSistema="";

	public List<Sistema> sistemasForeignKey;

	public List<Sistema> getsistemasForeignKey() {
		return sistemasForeignKey;
	}

	public void setsistemasForeignKey(List<Sistema> sistemasForeignKey) {
		this.sistemasForeignKey = sistemasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sistema sistemaForeignKey;

	public Sistema getsistemaForeignKey() {
		return sistemaForeignKey;
	}

	public void setsistemaForeignKey(Sistema sistemaForeignKey) {
		this.sistemaForeignKey = sistemaForeignKey;
	}

	public String sFinalQueryComboPaquete="";

	public List<Paquete> paquetesForeignKey;

	public List<Paquete> getpaquetesForeignKey() {
		return paquetesForeignKey;
	}

	public void setpaquetesForeignKey(List<Paquete> paquetesForeignKey) {
		this.paquetesForeignKey = paquetesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Paquete paqueteForeignKey;

	public Paquete getpaqueteForeignKey() {
		return paqueteForeignKey;
	}

	public void setpaqueteForeignKey(Paquete paqueteForeignKey) {
		this.paqueteForeignKey = paqueteForeignKey;
	}

	public String sFinalQueryComboTipoTeclaMascara="";

	public List<TipoTeclaMascara> tipoteclamascarasForeignKey;

	public List<TipoTeclaMascara> gettipoteclamascarasForeignKey() {
		return tipoteclamascarasForeignKey;
	}

	public void settipoteclamascarasForeignKey(List<TipoTeclaMascara> tipoteclamascarasForeignKey) {
		this.tipoteclamascarasForeignKey = tipoteclamascarasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoTeclaMascara tipoteclamascaraForeignKey;

	public TipoTeclaMascara gettipoteclamascaraForeignKey() {
		return tipoteclamascaraForeignKey;
	}

	public void settipoteclamascaraForeignKey(TipoTeclaMascara tipoteclamascaraForeignKey) {
		this.tipoteclamascaraForeignKey = tipoteclamascaraForeignKey;
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
	
	public Boolean isPermisoTodoModulo;
	public Boolean isPermisoNuevoModulo;
	public Boolean isPermisoActualizarModulo;
	public Boolean isPermisoActualizarOriginalModulo;
	public Boolean isPermisoEliminarModulo;
	public Boolean isPermisoGuardarCambiosModulo;
	public Boolean isPermisoConsultaModulo;
	public Boolean isPermisoBusquedaModulo;
	public Boolean isPermisoReporteModulo;
	public Boolean isPermisoPaginacionMedioModulo;
	public Boolean isPermisoPaginacionAltoModulo;
	public Boolean isPermisoPaginacionTodoModulo;
	public Boolean isPermisoCopiarModulo;
	public Boolean isPermisoVerFormModulo;
	public Boolean isPermisoDuplicarModulo;
	public Boolean isPermisoOrdenModulo;
	
	
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
	
	public ModuloParameterReturnGeneral moduloReturnGeneral;
	public ModuloParameterReturnGeneral moduloParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoModulo=false;
	public Boolean esParaAccionDesdeFormularioModulo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ModuloSessionBeanAdditional moduloSessionBeanAdditional=null;
	
	public ModuloSessionBeanAdditional getModuloSessionBeanAdditional() {
		return this.moduloSessionBeanAdditional;
	}
	
	public void setModuloSessionBeanAdditional(ModuloSessionBeanAdditional moduloSessionBeanAdditional) {
		try {
			this.moduloSessionBeanAdditional=moduloSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ModuloBeanSwingJInternalFrameAdditional moduloBeanSwingJInternalFrameAdditional=null;
	//public class ModuloBeanSwingJInternalFrame
	
	public ModuloBeanSwingJInternalFrameAdditional getModuloBeanSwingJInternalFrameAdditional() {
		return this.moduloBeanSwingJInternalFrameAdditional;
	}
	
	public void setModuloBeanSwingJInternalFrameAdditional(ModuloBeanSwingJInternalFrameAdditional moduloBeanSwingJInternalFrameAdditional) {
		try {
			this.moduloBeanSwingJInternalFrameAdditional=moduloBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ModuloLogic moduloLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Modulo moduloBean;
	public ModuloConstantesFunciones moduloConstantesFunciones;
	//public ModuloParameterReturnGeneral moduloReturnGeneral;
	
	//FK
	
	public SistemaLogic sistemaLogic;
	public PaqueteLogic paqueteLogic;
	public TipoTeclaMascaraLogic tipoteclamascaraLogic;
	
	//PARAMETROS
	
	
	//public List<Modulo> modulos;	
	//public List<Modulo> modulosEliminados;
	//public List<Modulo> modulosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoModulo=false;
	public Boolean isVisibilidadCeldaDuplicarModulo=true;
	public Boolean isVisibilidadCeldaCopiarModulo=true;
	public Boolean isVisibilidadCeldaVerFormModulo=true;
	public Boolean isVisibilidadCeldaOrdenModulo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesModulo=false;
	public Boolean isVisibilidadCeldaModificarModulo=false;
	public Boolean isVisibilidadCeldaActualizarModulo=false;
	public Boolean isVisibilidadCeldaEliminarModulo=false;
	public Boolean isVisibilidadCeldaCancelarModulo=false;
	public Boolean isVisibilidadCeldaGuardarModulo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosModulo=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdSistemaPorNombre=false;
	public Boolean isVisibilidadFK_IdPaquete=false;
	public Boolean isVisibilidadFK_IdSistema=false;
	public Boolean isVisibilidadFK_IdTipoTeclaMascara=false;
	
	public Long getiIdNuevoModulo() {
		return this.iIdNuevoModulo;
	}

	public void setiIdNuevoModulo(Long iIdNuevoModulo) {
		this.iIdNuevoModulo = iIdNuevoModulo;
	}
	
	public Long getidModuloActual() {
		return this.idModuloActual;
	}

	public void setidModuloActual(Long idModuloActual) {
		this.idModuloActual = idModuloActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Modulo getmodulo() {
		return this.modulo;
	}

	public void setmodulo(Modulo modulo) {
		this.modulo = modulo;
	}
	
	public Modulo getmoduloAux() {
		return this.moduloAux;
	}

	public void setmoduloAux(Modulo moduloAux) {
		this.moduloAux = moduloAux;
	}				
	
	public Modulo getmoduloAnterior() {
		return this.moduloAnterior;
	}

	public void setmoduloAnterior(Modulo moduloAnterior) {
		this.moduloAnterior = moduloAnterior;
	}	
	
	public Modulo getmoduloTotales() {
		return this.moduloTotales;
	}

	public void setmoduloTotales(Modulo moduloTotales) {
		this.moduloTotales = moduloTotales;
	}	
	
	public Modulo getmoduloBean() {
		return this.moduloBean;
	}

	public void setmoduloBean(Modulo moduloBean) {
		this.moduloBean = moduloBean;
	}	
	
	public ModuloParameterReturnGeneral getmoduloReturnGeneral() {
		return this.moduloReturnGeneral;
	}

	public void setmoduloReturnGeneral(ModuloParameterReturnGeneral moduloReturnGeneral) {
		this.moduloReturnGeneral = moduloReturnGeneral;
	}	
	
	
	public Long id_sistemaBusquedaPorIdSistemaPorNombre=-1L;

	public Long getid_sistemaBusquedaPorIdSistemaPorNombre() {
		return this.id_sistemaBusquedaPorIdSistemaPorNombre;
	}

	public void setid_sistemaBusquedaPorIdSistemaPorNombre(Long id_sistemaBusquedaPorIdSistemaPorNombre) {
		this.id_sistemaBusquedaPorIdSistemaPorNombre = id_sistemaBusquedaPorIdSistemaPorNombre;
	}

;
	public String nombreBusquedaPorIdSistemaPorNombre="";

	public String getnombreBusquedaPorIdSistemaPorNombre() {
		return this.nombreBusquedaPorIdSistemaPorNombre;
	}

	public void setnombreBusquedaPorIdSistemaPorNombre(String nombreBusquedaPorIdSistemaPorNombre) {
		this.nombreBusquedaPorIdSistemaPorNombre = nombreBusquedaPorIdSistemaPorNombre;
	}

	public Long id_paqueteFK_IdPaquete=-1L;

	public Long getid_paqueteFK_IdPaquete() {
		return this.id_paqueteFK_IdPaquete;
	}

	public void setid_paqueteFK_IdPaquete(Long id_paqueteFK_IdPaquete) {
		this.id_paqueteFK_IdPaquete = id_paqueteFK_IdPaquete;
	}

	public Long id_sistemaFK_IdSistema=-1L;

	public Long getid_sistemaFK_IdSistema() {
		return this.id_sistemaFK_IdSistema;
	}

	public void setid_sistemaFK_IdSistema(Long id_sistemaFK_IdSistema) {
		this.id_sistemaFK_IdSistema = id_sistemaFK_IdSistema;
	}

	public Long id_tipo_tecla_mascaraFK_IdTipoTeclaMascara=-1L;

	public Long getid_tipo_tecla_mascaraFK_IdTipoTeclaMascara() {
		return this.id_tipo_tecla_mascaraFK_IdTipoTeclaMascara;
	}

	public void setid_tipo_tecla_mascaraFK_IdTipoTeclaMascara(Long id_tipo_tecla_mascaraFK_IdTipoTeclaMascara) {
		this.id_tipo_tecla_mascaraFK_IdTipoTeclaMascara = id_tipo_tecla_mascaraFK_IdTipoTeclaMascara;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ModuloLogic getModuloLogic()	{		
		return moduloLogic;
	}

	public void setModuloLogic(ModuloLogic moduloLogic) {
		this.moduloLogic = moduloLogic;
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
	
	public Boolean getIsEsNuevoModulo() {
		return isEsNuevoModulo;
	}

	public void setIsEsNuevoModulo(Boolean isEsNuevoModulo) {
		this.isEsNuevoModulo = isEsNuevoModulo;
	}

	public Boolean getEsParaAccionDesdeFormularioModulo() {
		return esParaAccionDesdeFormularioModulo;
	}
	
	public void setEsParaAccionDesdeFormularioModulo(Boolean esParaAccionDesdeFormularioModulo) {
		this.esParaAccionDesdeFormularioModulo = esParaAccionDesdeFormularioModulo;
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
	
	
	public void cargarCombosSistemasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sistemasForeignKey=new ArrayList<Sistema>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SistemaLogic sistemaLogic=new SistemaLogic();

			sistemaLogic.getSistemaDataAccess().setIsForForeingKeyData(true);

			if(this.moduloSessionBean==null) {
				this.moduloSessionBean=new ModuloSessionBean();
			}

			if(!this.moduloSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sistemaLogic.getSistemaDataAccess().setIsForForeingKeyData(true);

					sistemaLogic.getTodosSistemasWithConnection(sFinalQuery,new Pagination());

					this.sistemasForeignKey=sistemaLogic.getSistemas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSistema(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sistemaLogic.getEntityWithConnection(moduloSessionBean.getlidSistemaActual());
					this.sistemasForeignKey.add(sistemaLogic.getSistema());
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

	public void cargarCombosPaquetesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paquetesForeignKey=new ArrayList<Paquete>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaqueteLogic paqueteLogic=new PaqueteLogic();

			paqueteLogic.getPaqueteDataAccess().setIsForForeingKeyData(true);

			if(this.moduloSessionBean==null) {
				this.moduloSessionBean=new ModuloSessionBean();
			}

			if(!this.moduloSessionBean.getisBusquedaDesdeForeignKeySesionPaquete()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paqueteLogic.getPaqueteDataAccess().setIsForForeingKeyData(true);

					paqueteLogic.getTodosPaquetesWithConnection(sFinalQuery,new Pagination());

					this.paquetesForeignKey=paqueteLogic.getPaquetes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPaquete(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paqueteLogic.getEntityWithConnection(moduloSessionBean.getlidPaqueteActual());
					this.paquetesForeignKey.add(paqueteLogic.getPaquete());
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

	public void cargarCombosTipoTeclaMascarasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoteclamascarasForeignKey=new ArrayList<TipoTeclaMascara>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoTeclaMascaraLogic tipoteclamascaraLogic=new TipoTeclaMascaraLogic();

			tipoteclamascaraLogic.getTipoTeclaMascaraDataAccess().setIsForForeingKeyData(true);

			if(this.moduloSessionBean==null) {
				this.moduloSessionBean=new ModuloSessionBean();
			}

			if(!this.moduloSessionBean.getisBusquedaDesdeForeignKeySesionTipoTeclaMascara()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoteclamascaraLogic.getTipoTeclaMascaraDataAccess().setIsForForeingKeyData(true);

					tipoteclamascaraLogic.getTodosTipoTeclaMascarasWithConnection(sFinalQuery,new Pagination());

					this.tipoteclamascarasForeignKey=tipoteclamascaraLogic.getTipoTeclaMascaras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoTeclaMascara(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoteclamascaraLogic.getEntityWithConnection(moduloSessionBean.getlidTipoTeclaMascaraActual());
					this.tipoteclamascarasForeignKey.add(tipoteclamascaraLogic.getTipoTeclaMascara());
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

	
	
	public void setActualSistemaForeignKey(Long idSistemaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sistema  sistemaTemp=null;

			for(Sistema sistemaAux:sistemasForeignKey) {
				if(sistemaAux.getId()!=null && sistemaAux.getId().equals(idSistemaSeleccionado)) {
					sistemaTemp=sistemaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sistemaTemp!=null) {

					if(this.modulo!=null) {
						this.modulo.setSistema(sistemaTemp);
					}

					if(this.jInternalFrameDetalleFormModulo!=null) {
						this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.setSelectedItem(sistemaTemp);
					}
				} else {
					//jComboBoxid_sistemaModulo.setSelectedItem(sistemaTemp);
					if(this.jInternalFrameDetalleFormModulo!=null) {
						if(this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.getItemCount()>0) {
							this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdSistemaPorNombre") || sFormularioTipoBusqueda.equals("Todos")){
					if(sistemaTemp!=null && jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo!=null) {
						jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.setSelectedItem(sistemaTemp);
					} else {
						if(jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo!=null) {
							//jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.setSelectedItem(sistemaTemp);
							if(jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.getItemCount()>0) {
								jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdSistema") || sFormularioTipoBusqueda.equals("Todos")){
					if(sistemaTemp!=null && jComboBoxid_sistemaFK_IdSistemaModulo!=null) {
						jComboBoxid_sistemaFK_IdSistemaModulo.setSelectedItem(sistemaTemp);
					} else {
						if(jComboBoxid_sistemaFK_IdSistemaModulo!=null) {
							//jComboBoxid_sistemaFK_IdSistemaModulo.setSelectedItem(sistemaTemp);
							if(jComboBoxid_sistemaFK_IdSistemaModulo.getItemCount()>0) {
								jComboBoxid_sistemaFK_IdSistemaModulo.setSelectedIndex(0);
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

	public String getActualSistemaForeignKeyDescripcion(Long idSistemaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sistema  sistemaTemp=null;

			for(Sistema sistemaAux:sistemasForeignKey) {
				if(sistemaAux.getId()!=null && sistemaAux.getId().equals(idSistemaSeleccionado)) {
					sistemaTemp=sistemaAux;
					break;
				}
			}


			sDescripcion=SistemaConstantesFunciones.getSistemaDescripcion(sistemaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSistemaForeignKeyGenerico(Long idSistemaSeleccionado,JComboBox jComboBoxid_sistemaModuloGenerico)throws Exception
	{
		try
		{
			Sistema  sistemaTemp=null;

			for(Sistema sistemaAux:sistemasForeignKey) {
				if(sistemaAux.getId()!=null && sistemaAux.getId().equals(idSistemaSeleccionado)) {
					sistemaTemp=sistemaAux;
					break;
				}
			}

			if(sistemaTemp!=null) {
				jComboBoxid_sistemaModuloGenerico.setSelectedItem(sistemaTemp);
			} else {
				if(jComboBoxid_sistemaModuloGenerico!=null && jComboBoxid_sistemaModuloGenerico.getItemCount()>0) {
					jComboBoxid_sistemaModuloGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPaqueteForeignKey(Long idPaqueteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Paquete  paqueteTemp=null;

			for(Paquete paqueteAux:paquetesForeignKey) {
				if(paqueteAux.getId()!=null && paqueteAux.getId().equals(idPaqueteSeleccionado)) {
					paqueteTemp=paqueteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paqueteTemp!=null) {

					if(this.modulo!=null) {
						this.modulo.setPaquete(paqueteTemp);
					}

					if(this.jInternalFrameDetalleFormModulo!=null) {
						this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo.setSelectedItem(paqueteTemp);
					}
				} else {
					//jComboBoxid_paqueteModulo.setSelectedItem(paqueteTemp);
					if(this.jInternalFrameDetalleFormModulo!=null) {
						if(this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo.getItemCount()>0) {
							this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo.setSelectedIndex(0);
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

	public String getActualPaqueteForeignKeyDescripcion(Long idPaqueteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Paquete  paqueteTemp=null;

			for(Paquete paqueteAux:paquetesForeignKey) {
				if(paqueteAux.getId()!=null && paqueteAux.getId().equals(idPaqueteSeleccionado)) {
					paqueteTemp=paqueteAux;
					break;
				}
			}


			sDescripcion=PaqueteConstantesFunciones.getPaqueteDescripcion(paqueteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaqueteForeignKeyGenerico(Long idPaqueteSeleccionado,JComboBox jComboBoxid_paqueteModuloGenerico)throws Exception
	{
		try
		{
			Paquete  paqueteTemp=null;

			for(Paquete paqueteAux:paquetesForeignKey) {
				if(paqueteAux.getId()!=null && paqueteAux.getId().equals(idPaqueteSeleccionado)) {
					paqueteTemp=paqueteAux;
					break;
				}
			}

			if(paqueteTemp!=null) {
				jComboBoxid_paqueteModuloGenerico.setSelectedItem(paqueteTemp);
			} else {
				if(jComboBoxid_paqueteModuloGenerico!=null && jComboBoxid_paqueteModuloGenerico.getItemCount()>0) {
					jComboBoxid_paqueteModuloGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoTeclaMascaraForeignKey(Long idTipoTeclaMascaraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoTeclaMascara  tipoteclamascaraTemp=null;

			for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasForeignKey) {
				if(tipoteclamascaraAux.getId()!=null && tipoteclamascaraAux.getId().equals(idTipoTeclaMascaraSeleccionado)) {
					tipoteclamascaraTemp=tipoteclamascaraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoteclamascaraTemp!=null) {

					if(this.modulo!=null) {
						this.modulo.setTipoTeclaMascara(tipoteclamascaraTemp);
					}

					if(this.jInternalFrameDetalleFormModulo!=null) {
						this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo.setSelectedItem(tipoteclamascaraTemp);
					}
				} else {
					//jComboBoxid_tipo_tecla_mascaraModulo.setSelectedItem(tipoteclamascaraTemp);
					if(this.jInternalFrameDetalleFormModulo!=null) {
						if(this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo.getItemCount()>0) {
							this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoTeclaMascara") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoteclamascaraTemp!=null && jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo!=null) {
						jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.setSelectedItem(tipoteclamascaraTemp);
					} else {
						if(jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo!=null) {
							//jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.setSelectedItem(tipoteclamascaraTemp);
							if(jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.getItemCount()>0) {
								jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.setSelectedIndex(0);
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

	public String getActualTipoTeclaMascaraForeignKeyDescripcion(Long idTipoTeclaMascaraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoTeclaMascara  tipoteclamascaraTemp=null;

			for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasForeignKey) {
				if(tipoteclamascaraAux.getId()!=null && tipoteclamascaraAux.getId().equals(idTipoTeclaMascaraSeleccionado)) {
					tipoteclamascaraTemp=tipoteclamascaraAux;
					break;
				}
			}


			sDescripcion=TipoTeclaMascaraConstantesFunciones.getTipoTeclaMascaraDescripcion(tipoteclamascaraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoTeclaMascaraForeignKeyGenerico(Long idTipoTeclaMascaraSeleccionado,JComboBox jComboBoxid_tipo_tecla_mascaraModuloGenerico)throws Exception
	{
		try
		{
			TipoTeclaMascara  tipoteclamascaraTemp=null;

			for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasForeignKey) {
				if(tipoteclamascaraAux.getId()!=null && tipoteclamascaraAux.getId().equals(idTipoTeclaMascaraSeleccionado)) {
					tipoteclamascaraTemp=tipoteclamascaraAux;
					break;
				}
			}

			if(tipoteclamascaraTemp!=null) {
				jComboBoxid_tipo_tecla_mascaraModuloGenerico.setSelectedItem(tipoteclamascaraTemp);
			} else {
				if(jComboBoxid_tipo_tecla_mascaraModuloGenerico!=null && jComboBoxid_tipo_tecla_mascaraModuloGenerico.getItemCount()>0) {
					jComboBoxid_tipo_tecla_mascaraModuloGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSistemaForeignKey(Modulo modulo,JComboBox jComboBoxid_sistemaModuloGenerico)throws Exception
	{
		try
		{
			Sistema  sistemaAux=new Sistema();

			if(jComboBoxid_sistemaModuloGenerico==null) {
				sistemaAux=(Sistema)this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.getSelectedItem();
			} else {
				sistemaAux=(Sistema)jComboBoxid_sistemaModuloGenerico.getSelectedItem();
			}

			if(sistemaAux!=null && sistemaAux.getId()!=null) {
				modulo.setid_sistema(sistemaAux.getId());
				modulo.setsistema_descripcion(ModuloConstantesFunciones.getSistemaDescripcion(sistemaAux));
				modulo.setSistema(sistemaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaqueteForeignKey(Modulo modulo,JComboBox jComboBoxid_paqueteModuloGenerico)throws Exception
	{
		try
		{
			Paquete  paqueteAux=new Paquete();

			if(jComboBoxid_paqueteModuloGenerico==null) {
				paqueteAux=(Paquete)this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo.getSelectedItem();
			} else {
				paqueteAux=(Paquete)jComboBoxid_paqueteModuloGenerico.getSelectedItem();
			}

			if(paqueteAux!=null && paqueteAux.getId()!=null) {
				modulo.setid_paquete(paqueteAux.getId());
				modulo.setpaquete_descripcion(ModuloConstantesFunciones.getPaqueteDescripcion(paqueteAux));
				modulo.setPaquete(paqueteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoTeclaMascaraForeignKey(Modulo modulo,JComboBox jComboBoxid_tipo_tecla_mascaraModuloGenerico)throws Exception
	{
		try
		{
			TipoTeclaMascara  tipoteclamascaraAux=new TipoTeclaMascara();

			if(jComboBoxid_tipo_tecla_mascaraModuloGenerico==null) {
				tipoteclamascaraAux=(TipoTeclaMascara)this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo.getSelectedItem();
			} else {
				tipoteclamascaraAux=(TipoTeclaMascara)jComboBoxid_tipo_tecla_mascaraModuloGenerico.getSelectedItem();
			}

			if(tipoteclamascaraAux!=null && tipoteclamascaraAux.getId()!=null) {
				modulo.setid_tipo_tecla_mascara(tipoteclamascaraAux.getId());
				modulo.settipoteclamascara_descripcion(ModuloConstantesFunciones.getTipoTeclaMascaraDescripcion(tipoteclamascaraAux));
				modulo.setTipoTeclaMascara(tipoteclamascaraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSistemasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSistema=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ModuloJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormModulo!=null) { 
							this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.addItem(sistema);
							}
						}
					}

					if(this.jInternalFrameDetalleFormModulo!=null) { 
					}

					if(!ModuloJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdSistemaPorNombre") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ModuloJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.addItem(sistema);
							}
						}

						if(!ModuloJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdSistema") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ModuloJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sistemaFK_IdSistemaModulo.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jComboBoxid_sistemaFK_IdSistemaModulo.addItem(sistema);
							}
						}

						if(!ModuloJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaquetesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPaquete=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ModuloJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormModulo!=null) { 
							this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo.removeAllItems();

							for(Paquete paquete:this.paquetesForeignKey) {
								this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo.addItem(paquete);
							}
						}
					}

					if(this.jInternalFrameDetalleFormModulo!=null) { 
					}

					if(!ModuloJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoTeclaMascarasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoTeclaMascara=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ModuloJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormModulo!=null) { 
							this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo.removeAllItems();

							for(TipoTeclaMascara tipoteclamascara:this.tipoteclamascarasForeignKey) {
								this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo.addItem(tipoteclamascara);
							}
						}
					}

					if(this.jInternalFrameDetalleFormModulo!=null) { 
					}

					if(!ModuloJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoTeclaMascara") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ModuloJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.removeAllItems();

							for(TipoTeclaMascara tipoteclamascara:this.tipoteclamascarasForeignKey) {
								this.jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.addItem(tipoteclamascara);
							}
						}

						if(!ModuloJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameSistemaForeignKey(Sistema sistema,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormModulo!=null) {
							this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.setSelectedItem(sistema);
						}
					} else {
						if(this.jInternalFrameDetalleFormModulo!=null) {
							this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.setSelectedItem(sistema);
						} else {
							this.jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_sistemaFK_IdSistemaModulo.setSelectedItem(sistema);
						} else {
							this.jComboBoxid_sistemaFK_IdSistemaModulo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePaqueteForeignKey(Paquete paquete,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormModulo!=null) {
							this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo.setSelectedItem(paquete);
						}
					} else {
						if(this.jInternalFrameDetalleFormModulo!=null) {
							this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoTeclaMascaraForeignKey(TipoTeclaMascara tipoteclamascara,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormModulo!=null) {
							this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo.setSelectedItem(tipoteclamascara);
						}
					} else {
						if(this.jInternalFrameDetalleFormModulo!=null) {
							this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.setSelectedItem(tipoteclamascara);
						} else {
							this.jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesModulo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ModuloConstantesFunciones.refrescarForeignKeysDescripcionesModulo(this.moduloLogic.getModulos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ModuloConstantesFunciones.refrescarForeignKeysDescripcionesModulo(this.modulos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Sistema.class));
		classes.add(new Classe(Paquete.class));
		classes.add(new Classe(TipoTeclaMascara.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//moduloLogic.setModulos(this.modulos);
			moduloLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ModuloParameterReturnGeneral getModuloParameterGeneral() {
		return this.moduloParameterGeneral;
	}
	
	public void setModuloParameterGeneral(ModuloParameterReturnGeneral moduloParameterGeneral) {
		this.moduloParameterGeneral = moduloParameterGeneral;
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
	
	public Boolean getIsPermisoTodoModulo() {
		return isPermisoTodoModulo;
	}

	public void setIsPermisoTodoModulo(Boolean isPermisoTodoModulo) {
		this.isPermisoTodoModulo = isPermisoTodoModulo;
	}

	public Boolean getIsPermisoNuevoModulo() {
		return isPermisoNuevoModulo;
	}

	public void setIsPermisoNuevoModulo(Boolean isPermisoNuevoModulo) {
		this.isPermisoNuevoModulo = isPermisoNuevoModulo;
	}

	public Boolean getIsPermisoActualizarModulo() {
		return isPermisoActualizarModulo;
	}

	public void setIsPermisoActualizarModulo(Boolean isPermisoActualizarModulo) {
		this.isPermisoActualizarModulo = isPermisoActualizarModulo;
	}

	public Boolean getIsPermisoEliminarModulo() {
		return isPermisoEliminarModulo;
	}

	public void setIsPermisoEliminarModulo(Boolean isPermisoEliminarModulo) {
		this.isPermisoEliminarModulo = isPermisoEliminarModulo;
	}

	public Boolean getIsPermisoGuardarCambiosModulo() {
		return isPermisoGuardarCambiosModulo;
	}

	public void setIsPermisoGuardarCambiosModulo(Boolean isPermisoGuardarCambiosModulo) {
		this.isPermisoGuardarCambiosModulo = isPermisoGuardarCambiosModulo;
	}
	
	public Boolean getIsPermisoConsultaModulo() {
		return isPermisoConsultaModulo;
	}

	public void setIsPermisoConsultaModulo(Boolean isPermisoConsultaModulo) {
		this.isPermisoConsultaModulo = isPermisoConsultaModulo;
	}

	public Boolean getIsPermisoBusquedaModulo() {
		return isPermisoBusquedaModulo;
	}

	public void setIsPermisoBusquedaModulo(Boolean isPermisoBusquedaModulo) {
		this.isPermisoBusquedaModulo = isPermisoBusquedaModulo;
	}

	public Boolean getIsPermisoReporteModulo() {
		return isPermisoReporteModulo;
	}

	public void setIsPermisoReporteModulo(Boolean isPermisoReporteModulo) {
		this.isPermisoReporteModulo = isPermisoReporteModulo;
	}
	
	public Boolean getIsPermisoPaginacionMedioModulo() {
		return isPermisoPaginacionMedioModulo;
	}

	public void setIsPermisoPaginacionMedioModulo(Boolean isPermisoPaginacionMedioModulo) {
		this.isPermisoPaginacionMedioModulo = isPermisoPaginacionMedioModulo;
	}
	
	public Boolean getIsPermisoPaginacionTodoModulo() {
		return isPermisoPaginacionTodoModulo;
	}

	public void setIsPermisoPaginacionTodoModulo(Boolean isPermisoPaginacionTodoModulo) {
		this.isPermisoPaginacionTodoModulo = isPermisoPaginacionTodoModulo;
	}
	
	public Boolean getIsPermisoPaginacionAltoModulo() {
		return isPermisoPaginacionAltoModulo;
	}

	public void setIsPermisoPaginacionAltoModulo(Boolean isPermisoPaginacionAltoModulo) {
		this.isPermisoPaginacionAltoModulo = isPermisoPaginacionAltoModulo;
	}
	
	public Boolean getIsPermisoCopiarModulo() {
		return isPermisoCopiarModulo;
	}

	public void setIsPermisoCopiarModulo(Boolean isPermisoCopiarModulo) {
		this.isPermisoCopiarModulo = isPermisoCopiarModulo;
	}
	
	public Boolean getIsPermisoVerFormModulo() {
		return isPermisoVerFormModulo;
	}

	public void setIsPermisoVerFormModulo(Boolean isPermisoVerFormModulo) {
		this.isPermisoVerFormModulo = isPermisoVerFormModulo;
	}
	
	public Boolean getIsPermisoDuplicarModulo() {
		return isPermisoDuplicarModulo;
	}

	public void setIsPermisoDuplicarModulo(Boolean isPermisoDuplicarModulo) {
		this.isPermisoDuplicarModulo = isPermisoDuplicarModulo;
	}
	
	public Boolean getIsPermisoOrdenModulo() {
		return isPermisoOrdenModulo;
	}

	public void setIsPermisoOrdenModulo(Boolean isPermisoOrdenModulo) {
		this.isPermisoOrdenModulo = isPermisoOrdenModulo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoModulo() {
		return isVisibilidadCeldaNuevoModulo;
	}

	public void setIsVisibilidadCeldaNuevoModulo(Boolean isVisibilidadCeldaNuevoModulo) {
		this.isVisibilidadCeldaNuevoModulo = isVisibilidadCeldaNuevoModulo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarModulo() {
		return isVisibilidadCeldaDuplicarModulo;
	}

	public void setIsVisibilidadCeldaDuplicarModulo(Boolean isVisibilidadCeldaDuplicarModulo) {
		this.isVisibilidadCeldaDuplicarModulo = isVisibilidadCeldaDuplicarModulo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarModulo() {
		return isVisibilidadCeldaCopiarModulo;
	}

	public void setIsVisibilidadCeldaCopiarModulo(Boolean isVisibilidadCeldaCopiarModulo) {
		this.isVisibilidadCeldaCopiarModulo = isVisibilidadCeldaCopiarModulo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormModulo() {
		return isVisibilidadCeldaVerFormModulo;
	}

	public void setIsVisibilidadCeldaVerFormModulo(Boolean isVisibilidadCeldaVerFormModulo) {
		this.isVisibilidadCeldaVerFormModulo = isVisibilidadCeldaVerFormModulo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenModulo() {
		return isVisibilidadCeldaOrdenModulo;
	}

	public void setIsVisibilidadCeldaOrdenModulo(Boolean isVisibilidadCeldaOrdenModulo) {
		this.isVisibilidadCeldaOrdenModulo = isVisibilidadCeldaOrdenModulo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesModulo() {
		return isVisibilidadCeldaNuevoRelacionesModulo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesModulo(Boolean isVisibilidadCeldaNuevoRelacionesModulo) {
		this.isVisibilidadCeldaNuevoRelacionesModulo = isVisibilidadCeldaNuevoRelacionesModulo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarModulo() {
		return isVisibilidadCeldaModificarModulo;
	}

	public void setIsVisibilidadCeldaModificarModulo(Boolean isVisibilidadCeldaModificarModulo) {
		this.isVisibilidadCeldaModificarModulo = isVisibilidadCeldaModificarModulo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarModulo() {
		return isVisibilidadCeldaActualizarModulo;
	}

	public void setIsVisibilidadCeldaActualizarModulo(Boolean isVisibilidadCeldaActualizarModulo) {
		this.isVisibilidadCeldaActualizarModulo = isVisibilidadCeldaActualizarModulo;
	}

	public Boolean getIsVisibilidadCeldaEliminarModulo() {
		return isVisibilidadCeldaEliminarModulo;
	}

	public void setIsVisibilidadCeldaEliminarModulo(Boolean isVisibilidadCeldaEliminarModulo) {
		this.isVisibilidadCeldaEliminarModulo = isVisibilidadCeldaEliminarModulo;
	}

	public Boolean getIsVisibilidadCeldaCancelarModulo() {
		return isVisibilidadCeldaCancelarModulo;
	}

	public void setIsVisibilidadCeldaCancelarModulo(Boolean isVisibilidadCeldaCancelarModulo) {
		this.isVisibilidadCeldaCancelarModulo = isVisibilidadCeldaCancelarModulo;
	}

	public Boolean getIsVisibilidadCeldaGuardarModulo() {
		return isVisibilidadCeldaGuardarModulo;
	}

	public void setIsVisibilidadCeldaGuardarModulo(Boolean isVisibilidadCeldaGuardarModulo) {
		this.isVisibilidadCeldaGuardarModulo = isVisibilidadCeldaGuardarModulo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosModulo() {
		return isVisibilidadCeldaGuardarCambiosModulo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosModulo(Boolean isVisibilidadCeldaGuardarCambiosModulo) {
		this.isVisibilidadCeldaGuardarCambiosModulo = isVisibilidadCeldaGuardarCambiosModulo;
	}
		
	public ModuloSessionBean getmoduloSessionBean() {
		return this.moduloSessionBean;
	}
	
	public void setmoduloSessionBean(ModuloSessionBean moduloSessionBean) {
		this.moduloSessionBean=moduloSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdSistemaPorNombre() {
		return this.isVisibilidadBusquedaPorIdSistemaPorNombre;
	}

	public void setisVisibilidadBusquedaPorIdSistemaPorNombre(Boolean isVisibilidadBusquedaPorIdSistemaPorNombre) {
		this.isVisibilidadBusquedaPorIdSistemaPorNombre=isVisibilidadBusquedaPorIdSistemaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdPaquete() {
		return this.isVisibilidadFK_IdPaquete;
	}

	public void setisVisibilidadFK_IdPaquete(Boolean isVisibilidadFK_IdPaquete) {
		this.isVisibilidadFK_IdPaquete=isVisibilidadFK_IdPaquete;
	}

	public Boolean getisVisibilidadFK_IdSistema() {
		return this.isVisibilidadFK_IdSistema;
	}

	public void setisVisibilidadFK_IdSistema(Boolean isVisibilidadFK_IdSistema) {
		this.isVisibilidadFK_IdSistema=isVisibilidadFK_IdSistema;
	}

	public Boolean getisVisibilidadFK_IdTipoTeclaMascara() {
		return this.isVisibilidadFK_IdTipoTeclaMascara;
	}

	public void setisVisibilidadFK_IdTipoTeclaMascara(Boolean isVisibilidadFK_IdTipoTeclaMascara) {
		this.isVisibilidadFK_IdTipoTeclaMascara=isVisibilidadFK_IdTipoTeclaMascara;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysModulo(Modulo modulo)throws Exception {
		try {
			
				this.setActualParaGuardarSistemaForeignKey(modulo,null);
				this.setActualParaGuardarPaqueteForeignKey(modulo,null);
				this.setActualParaGuardarTipoTeclaMascaraForeignKey(modulo,null);
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
	
	public void bugActualizarReferenciaActual(Modulo modulo,Modulo moduloAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalModulo(modulo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		moduloAux.setId(modulo.getId());
		moduloAux.setVersionRow(modulo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessModulo();
		
			int intSelectedRow = this.jTableDatosModulo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualModulo(this.modulo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = moduloValidator.getInvalidValues(this.modulo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			moduloLogic.setDatosCliente(datosCliente);
			moduloLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				moduloAux=new  Modulo();
				
				moduloAux.setIsNew(true);
				moduloAux.setIsChanged(true);
				
				moduloAux.setModuloOriginal(this.modulo);
				
				moduloAux.setId(this.modulo.getId());	
				moduloAux.setVersionRow(this.modulo.getVersionRow());	
				moduloAux.setid_sistema(this.modulo.getid_sistema());	
				moduloAux.setid_paquete(this.modulo.getid_paquete());	
				moduloAux.setcodigo(this.modulo.getcodigo());	
				moduloAux.setnombre(this.modulo.getnombre());	
				moduloAux.setid_tipo_tecla_mascara(this.modulo.getid_tipo_tecla_mascara());	
				moduloAux.settecla(this.modulo.gettecla());	
				moduloAux.setestado(this.modulo.getestado());	
				moduloAux.setorden(this.modulo.getorden());	
				moduloAux.setdescripcion(this.modulo.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.moduloSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.moduloSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(moduloAux,moduloLogic.getModulos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(moduloAux,modulos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.moduloSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.moduloSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						moduloLogic.saveModulos();//WithConnection
						//moduloLogic.getSetVersionRowModulos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.modulo,moduloAux);
					
					this.refrescarForeignKeysDescripcionesModulo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				moduloAux=new  Modulo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.moduloSessionBean.getEsGuardarRelacionado() 
					|| (this.moduloSessionBean.getEsGuardarRelacionado() && this.modulo.getId()>=0)) {
						
					moduloAux.setIsNew(false);
				}
				
				moduloAux.setIsDeleted(false);
			
				moduloAux.setId(this.modulo.getId());	
				moduloAux.setVersionRow(this.modulo.getVersionRow());	
				moduloAux.setid_sistema(this.modulo.getid_sistema());	
				moduloAux.setid_paquete(this.modulo.getid_paquete());	
				moduloAux.setcodigo(this.modulo.getcodigo());	
				moduloAux.setnombre(this.modulo.getnombre());	
				moduloAux.setid_tipo_tecla_mascara(this.modulo.getid_tipo_tecla_mascara());	
				moduloAux.settecla(this.modulo.gettecla());	
				moduloAux.setestado(this.modulo.getestado());	
				moduloAux.setorden(this.modulo.getorden());	
				moduloAux.setdescripcion(this.modulo.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(moduloAux,moduloLogic.getModulos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(moduloAux,modulos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.moduloSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.moduloSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						moduloLogic.saveModulos();//WithConnection
						//moduloLogic.getSetVersionRowModulos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.modulo,moduloAux);
					
					this.refrescarForeignKeysDescripcionesModulo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				moduloAux=new  Modulo();
				
				moduloAux.setIsNew(false);
				moduloAux.setIsChanged(false);
				
				moduloAux.setIsDeleted(true);
				
				moduloAux.setId(this.modulo.getId());	
				moduloAux.setVersionRow(this.modulo.getVersionRow());	
				moduloAux.setid_sistema(this.modulo.getid_sistema());	
				moduloAux.setid_paquete(this.modulo.getid_paquete());	
				moduloAux.setcodigo(this.modulo.getcodigo());	
				moduloAux.setnombre(this.modulo.getnombre());	
				moduloAux.setid_tipo_tecla_mascara(this.modulo.getid_tipo_tecla_mascara());	
				moduloAux.settecla(this.modulo.gettecla());	
				moduloAux.setestado(this.modulo.getestado());	
				moduloAux.setorden(this.modulo.getorden());	
				moduloAux.setdescripcion(this.modulo.getdescripcion());	
				
				if(this.moduloSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.moduloAux.getId()>=0) {	
						this.modulosEliminados.add(moduloAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(moduloAux,moduloLogic.getModulos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(moduloAux,modulos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.moduloSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.moduloSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						moduloLogic.saveModulos();//WithConnection
						//moduloLogic.getSetVersionRowModulos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.getModulos().addAll(this.modulosEliminados);
					
					moduloLogic.saveModulos();//WithConnection
					//moduloLogic.getSetVersionRowModulos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesModulo();
				
				this.modulosEliminados= new ArrayList<Modulo>();		
			}
			
			if(this.moduloSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.moduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Modulo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Modulo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.modulo=moduloAux;
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
      		//this.finishProcessModulo();
      	}
		
	}	
	
	public void actualizarRelaciones(Modulo moduloLocal) throws Exception {
		
		if(this.moduloSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Modulo moduloLocal) throws Exception {	
		if(this.moduloSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(SistemaDetalleFormJInternalFrame.class)) {
				SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrameLocal=(SistemaBeanSwingJInternalFrame) ((SistemaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sistemaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSistema(sistemaBeanSwingJInternalFrameLocal.getsistema(),true);
				sistemaBeanSwingJInternalFrameLocal.actualizarLista(sistemaBeanSwingJInternalFrameLocal.sistema,this.sistemasForeignKey);

				sistemaBeanSwingJInternalFrameLocal.actualizarRelaciones(sistemaBeanSwingJInternalFrameLocal.sistema);

				moduloLocal.setSistema(sistemaBeanSwingJInternalFrameLocal.sistema);

				this.addItemDefectoCombosForeignKeySistema();
				this.cargarCombosFrameSistemasForeignKey("Formulario");
				this.setActualSistemaForeignKey(sistemaBeanSwingJInternalFrameLocal.sistema.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaqueteDetalleFormJInternalFrame.class)) {
				PaqueteBeanSwingJInternalFrame paqueteBeanSwingJInternalFrameLocal=(PaqueteBeanSwingJInternalFrame) ((PaqueteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paqueteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPaquete(paqueteBeanSwingJInternalFrameLocal.getpaquete(),true);
				paqueteBeanSwingJInternalFrameLocal.actualizarLista(paqueteBeanSwingJInternalFrameLocal.paquete,this.paquetesForeignKey);

				paqueteBeanSwingJInternalFrameLocal.actualizarRelaciones(paqueteBeanSwingJInternalFrameLocal.paquete);

				moduloLocal.setPaquete(paqueteBeanSwingJInternalFrameLocal.paquete);

				this.addItemDefectoCombosForeignKeyPaquete();
				this.cargarCombosFramePaquetesForeignKey("Formulario");
				this.setActualPaqueteForeignKey(paqueteBeanSwingJInternalFrameLocal.paquete.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoTeclaMascaraDetalleFormJInternalFrame.class)) {
				TipoTeclaMascaraBeanSwingJInternalFrame tipoteclamascaraBeanSwingJInternalFrameLocal=(TipoTeclaMascaraBeanSwingJInternalFrame) ((TipoTeclaMascaraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoteclamascaraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoTeclaMascara(tipoteclamascaraBeanSwingJInternalFrameLocal.gettipoteclamascara(),true);
				tipoteclamascaraBeanSwingJInternalFrameLocal.actualizarLista(tipoteclamascaraBeanSwingJInternalFrameLocal.tipoteclamascara,this.tipoteclamascarasForeignKey);

				tipoteclamascaraBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoteclamascaraBeanSwingJInternalFrameLocal.tipoteclamascara);

				moduloLocal.setTipoTeclaMascara(tipoteclamascaraBeanSwingJInternalFrameLocal.tipoteclamascara);

				this.addItemDefectoCombosForeignKeyTipoTeclaMascara();
				this.cargarCombosFrameTipoTeclaMascarasForeignKey("Formulario");
				this.setActualTipoTeclaMascaraForeignKey(tipoteclamascaraBeanSwingJInternalFrameLocal.tipoteclamascara.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarModuloActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosModulo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = moduloValidator.getInvalidValues(this.modulo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Modulo modulo,List<Modulo> modulos) throws Exception {
		try	{		
			ModuloConstantesFunciones.actualizarLista(modulo,modulos,this.moduloSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Modulo modulo,List<Modulo> modulos) throws Exception {
		try	{			
			ModuloConstantesFunciones.actualizarSelectedLista(modulo,modulos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Modulo> modulosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				modulosLocal=this.moduloLogic.getModulos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				modulosLocal=this.modulos;
			}
			//ARCHITECTURE
		
			for(Modulo moduloLocal:modulosLocal) {
				if(this.permiteMantenimiento(moduloLocal) && moduloLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ModuloConstantesFunciones.getModuloLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ModuloConstantesFunciones.IDSISTEMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabelid_sistemaModulo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModuloConstantesFunciones.IDPAQUETE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabelid_paqueteModulo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModuloConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabelcodigoModulo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModuloConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabelnombreModulo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModuloConstantesFunciones.IDTIPOTECLAMASCARA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabelid_tipo_tecla_mascaraModulo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModuloConstantesFunciones.TECLA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabelteclaModulo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModuloConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabelestadoModulo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModuloConstantesFunciones.ORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabelordenModulo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModuloConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabeldescripcionModulo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormModulo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModulo.jLabelid_sistemaModulo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModulo.jLabelid_paqueteModulo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModulo.jLabelcodigoModulo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModulo.jLabelnombreModulo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModulo.jLabelid_tipo_tecla_mascaraModulo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModulo.jLabelteclaModulo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModulo.jLabelestadoModulo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModulo.jLabelordenModulo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModulo.jLabeldescripcionModulo,"");
		
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
		this.iIdNuevoModulo--;	
		
		
		this.moduloAux=new Modulo();
		
		this.moduloAux.setId(this.iIdNuevoModulo);
		this.moduloAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.moduloLogic.getModulos().add(this.moduloAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.modulos.add(this.moduloAux);
		}
		//ARCHITECTURE
		
		this.modulo=this.moduloAux;
		
		if(ModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioModulo(this.modulo);
			this.setVariablesObjetoActualToFormularioForeignKeyModulo(this.modulo);
		}
				
		//this.setDefaultControlesModulo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyModulo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyModulo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyModulo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualModulo(this.moduloBean,this.modulo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ModuloConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.moduloSessionBean.getConGuardarRelaciones()) {
			classes=ModuloConstantesFunciones.getClassesRelationshipsOfModulo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.moduloReturnGeneral=moduloLogic.procesarEventosModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.moduloLogic.getModulos(),this.modulo,this.moduloParameterGeneral,this.isEsNuevoModulo,classes);//this.moduloLogic.getModulo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanModulo(this.moduloReturnGeneral,this.moduloBean,false);
		
		if(this.moduloReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyModulo(this.moduloReturnGeneral.getModulo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioModulo(this.moduloReturnGeneral.getModulo());
		}
		
		if(this.moduloReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioModulo(this.moduloReturnGeneral.getModulo(),classes);//this.moduloBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualModulo(this.modulo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyModulo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyModulo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ModuloBeanSwingJInternalFrameAdditional.RecargarFormModulo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingModulo(false);
						
			if(moduloSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ModuloJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualModulo();
			}
			
			this.actualizarVisualTableDatosModulo();
			
			this.jTableDatosModulo.setRowSelectionInterval(this.getIndiceNuevoModulo(), this.getIndiceNuevoModulo());
			
			this.seleccionarFilaTablaModuloActual();
						
			this.actualizarEstadoCeldasBotonesModulo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesModulo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormModulo.jTextFieldcodigoModulo.setEnabled(isHabilitar && this.moduloConstantesFunciones.activarcodigoModulo);
		this.jInternalFrameDetalleFormModulo.jTextAreanombreModulo.setEnabled(isHabilitar && this.moduloConstantesFunciones.activarnombreModulo);
		this.jInternalFrameDetalleFormModulo.jTextFieldteclaModulo.setEnabled(isHabilitar && this.moduloConstantesFunciones.activarteclaModulo);
		this.jInternalFrameDetalleFormModulo.jCheckBoxestadoModulo.setEnabled(isHabilitar && this.moduloConstantesFunciones.activarestadoModulo);
		this.jInternalFrameDetalleFormModulo.jTextFieldordenModulo.setEnabled(isHabilitar && this.moduloConstantesFunciones.activarordenModulo);
		this.jInternalFrameDetalleFormModulo.jTextAreadescripcionModulo.setEnabled(isHabilitar && this.moduloConstantesFunciones.activardescripcionModulo);	
		
		this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.setEnabled(isHabilitar && this.moduloConstantesFunciones.activarid_sistemaModulo);
		this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo.setEnabled(isHabilitar && this.moduloConstantesFunciones.activarid_paqueteModulo);
		this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo.setEnabled(isHabilitar && this.moduloConstantesFunciones.activarid_tipo_tecla_mascaraModulo);
	};
	
	public void setDefaultControlesModulo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoModulo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.moduloSessionBean.setConGuardarRelaciones(true);			
			this.moduloSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormModulo.jTabbedPaneRelacionesModulo.setVisible(true);
			
					
		} else {
			//this.moduloSessionBean.setConGuardarRelaciones(false);			
			this.moduloSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormModulo.jTabbedPaneRelacionesModulo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoModulo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Modulo moduloAux:this.moduloLogic.getModulos()) {
				if(moduloAux.getId().equals(this.iIdNuevoModulo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Modulo moduloAux:this.modulos) {
				if(moduloAux.getId().equals(this.iIdNuevoModulo)) {
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
	
	public int getIndiceActualModulo(Modulo modulo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Modulo moduloAux:this.moduloLogic.getModulos()) {
				if(moduloAux.getId().equals(modulo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Modulo moduloAux:this.modulos) {
				if(moduloAux.getId().equals(modulo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalModulo(Modulo moduloOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Modulo moduloAux:this.moduloLogic.getModulos()) {
				if(moduloAux.getModuloOriginal().getId().equals(moduloOriginal.getId())) {
					existe=true;
					moduloOriginal.setId(moduloAux.getId());
					moduloOriginal.setVersionRow(moduloAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Modulo moduloAux:this.modulos) {
				if(moduloAux.getModuloOriginal().getId().equals(moduloOriginal.getId())) {
					existe=true;
					moduloOriginal.setId(moduloAux.getId());
					moduloOriginal.setVersionRow(moduloAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosModulo(Boolean esParaCancelar) throws Exception {
		modulosAux=new ArrayList<Modulo>();
		moduloAux=new Modulo();
		
		if(!this.moduloSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Modulo moduloAux:this.moduloLogic.getModulos()) {
					if(moduloAux.getId()<0) {
						modulosAux.add(moduloAux);
					}		
				}
				this.iIdNuevoModulo=0L;
				this.moduloLogic.getModulos().removeAll(modulosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Modulo moduloAux:this.modulos) {
					if(moduloAux.getId()<0) {
						modulosAux.add(moduloAux);
					}		
				}
				this.iIdNuevoModulo=0L;
				this.modulos.removeAll(modulosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoModulo 
					&& this.moduloLogic.getModulos().size()>0
					) {
					moduloAux=this.moduloLogic.getModulos().get(this.moduloLogic.getModulos().size() - 1);
				
					if(moduloAux.getId()<0) {
						this.moduloLogic.getModulos().remove(moduloAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoModulo && this.modulos.size()>0) {
					moduloAux=this.modulos.get(this.modulos.size() - 1);
				
					if(moduloAux.getId()<0) {
						this.modulos.remove(moduloAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoModulo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(modulo.getId()<0) {
				this.moduloLogic.getModulos().remove(this.modulo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(modulo.getId()<0) {
				this.modulos.remove(this.modulo);
			}
		}			
	}
	
	public void setEstadosInicialesModulo(List<Modulo> modulosAux) throws Exception {
		ModuloConstantesFunciones.setEstadosInicialesModulo(modulosAux);
	}
	
	public void setEstadosInicialesModulo(Modulo moduloAux) throws Exception {
		ModuloConstantesFunciones.setEstadosInicialesModulo(moduloAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarModuloActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarModuloActual()) {
				if(!this.isEsNuevoModulo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoModulo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarModuloActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Modulo ?", "MANTENIMIENTO DE Modulo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Modulo modulo) throws Exception {
		ModuloConstantesFunciones.seleccionarAsignar(this.modulo,modulo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarModulo=this.isPermisoActualizarOriginalModulo;
			
			
			this.seleccionarAsignar(modulo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ModuloConstantesFunciones.quitarEspaciosModulo(this.modulo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesModulo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.moduloSessionBean.setsFuncionBusquedaRapida(this.moduloSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoModulo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosModulo(esParaCancelar);				
				this.cancelarNuevoModulo(esParaCancelar);								
			}
			
			this.modulo=new Modulo();
			
			this.inicializarModulo();
			
			this.actualizarEstadoCeldasBotonesModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarModulo() throws Exception {
		try {
			ModuloConstantesFunciones.inicializarModulo(this.modulo);
			
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
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.moduloLogic.getModulos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteModulos(String sAccionBusqueda,List<Modulo> modulosParaReportes) throws Exception {
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
					sPathReporteFinal="Modulo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ModuloMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ModuloMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Modulo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Modulos");		
		parameters.put("busquedapor", ModuloConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceModulo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ModuloConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ModuloConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceModulo=new JRBeanArrayDataSource(ModuloJInternalFrame.TraerModuloBeans(modulosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceModulo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ModuloConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ModuloConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ModuloBean.TraerModuloBeans(modulosParaReportes).toArray()));
							
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
				this.generarExcelReporteModulos(sAccionBusqueda,sTipoArchivoReporte,modulosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalModulos(sAccionBusqueda,sTipoArchivoReporte,modulosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoModuloActionPerformed(null);
					//this.generarExcelReporteModulos(sAccionBusqueda,sTipoArchivoReporte,modulosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalModulos(sAccionBusqueda,sTipoArchivoReporte,modulosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesModulos(sAccionBusqueda,sTipoArchivoReporte,modulosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesModulos(sAccionBusqueda,sTipoArchivoReporte,modulosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteModulos(String sAccionBusqueda,String sTipoArchivoReporte,List<Modulo> modulosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modulo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Modulos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderModulo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Modulo modulo : modulosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ModuloConstantesFunciones.generarExcelReporteDataModulo("NORMAL",row,workbook,modulo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.moduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modulo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderModulo(String sTipo,Row row,Workbook workbook) {
		
		ModuloConstantesFunciones.generarExcelReporteHeaderModulo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalModulos(String sAccionBusqueda,String sTipoArchivoReporte,List<Modulo> modulosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modulo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Modulos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Modulo modulo : modulosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ModuloConstantesFunciones.getModuloDescripcion(modulo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModuloConstantesFunciones.LABEL_IDSISTEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModuloConstantesFunciones.LABEL_IDSISTEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modulo.getsistema_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModuloConstantesFunciones.LABEL_IDPAQUETE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModuloConstantesFunciones.LABEL_IDPAQUETE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modulo.getpaquete_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModuloConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModuloConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modulo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModuloConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModuloConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modulo.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modulo.gettipoteclamascara_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModuloConstantesFunciones.LABEL_TECLA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModuloConstantesFunciones.LABEL_TECLA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modulo.gettecla());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModuloConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModuloConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(modulo.getestado()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModuloConstantesFunciones.LABEL_ORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModuloConstantesFunciones.LABEL_ORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modulo.getorden());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModuloConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModuloConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modulo.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.moduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modulo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesModulos(String sAccionBusqueda,String sTipoArchivoReporte,List<Modulo> modulosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Modulo> modulosRespaldo=null;
		
		classes=ModuloConstantesFunciones.getClassesRelationshipsOfModulo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.moduloLogic.setDatosCliente(this.datosCliente);
		this.moduloLogic.setDatosDeep(this.datosDeep);
		this.moduloLogic.setIsConDeep(true);
		
		modulosRespaldo=this.moduloLogic.getModulos();
		
		this.moduloLogic.setModulos(modulosParaReportes);	
		this.moduloLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		modulosParaReportes=this.moduloLogic.getModulos();
		this.moduloLogic.setModulos(modulosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modulo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Modulos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderModulo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Modulo modulo : modulosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderModulo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ModuloConstantesFunciones.generarExcelReporteDataModulo("NORMAL",row,workbook,modulo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ModuloConstantesFunciones.getModuloDescripcion(modulo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.moduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modulo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoModulo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoModulo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoModulo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoModulo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessModulo() throws Exception {		
		this.startProcessModulo(true);
	}
	
	public void startProcessModulo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasModulo ,this.jPanelParametrosReportesModulo, this.jScrollPanelDatosModulo,this.jPanelPaginacionModulo, this.jScrollPanelDatosEdicionModulo, this.jPanelAccionesModulo,this.jPanelAccionesFormularioModulo,this.jmenuBarModulo,this.jmenuBarDetalleModulo,this.jTtoolBarModulo,this.jTtoolBarDetalleModulo);		
		
		final JTabbedPane jTabbedPaneBusquedasModulo=this.jTabbedPaneBusquedasModulo; 
		
		final JPanel jPanelParametrosReportesModulo=this.jPanelParametrosReportesModulo;
		//final JScrollPane jScrollPanelDatosModulo=this.jScrollPanelDatosModulo;
		final JTable jTableDatosModulo=this.jTableDatosModulo;		
		final JPanel jPanelPaginacionModulo=this.jPanelPaginacionModulo;
		//final JScrollPane jScrollPanelDatosEdicionModulo=this.jScrollPanelDatosEdicionModulo;
		final JPanel jPanelAccionesModulo=this.jPanelAccionesModulo;
		
		JPanel jPanelCamposAuxiliarModulo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarModulo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormModulo!=null) {
			jPanelCamposAuxiliarModulo=this.jInternalFrameDetalleFormModulo.jPanelCamposModulo;
			jPanelAccionesFormularioAuxiliarModulo=this.jInternalFrameDetalleFormModulo.jPanelAccionesFormularioModulo;
		}
		
		final JPanel jPanelCamposModulo=jPanelCamposAuxiliarModulo;
		final JPanel jPanelAccionesFormularioModulo=jPanelAccionesFormularioAuxiliarModulo;
		
		
		final JMenuBar jmenuBarModulo=this.jmenuBarModulo;
		final JToolBar jTtoolBarModulo=this.jTtoolBarModulo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarModulo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarModulo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormModulo!=null) {
			jmenuBarDetalleAuxiliarModulo=this.jInternalFrameDetalleFormModulo.jmenuBarDetalleModulo;
			jTtoolBarDetalleAuxiliarModulo=this.jInternalFrameDetalleFormModulo.jTtoolBarDetalleModulo;
		}
		
		final JMenuBar jmenuBarDetalleModulo=jmenuBarDetalleAuxiliarModulo;
		final JToolBar jTtoolBarDetalleModulo=jTtoolBarDetalleAuxiliarModulo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasModulo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesModulo;
			processRunnable.jTableDatos=jTableDatosModulo;
			processRunnable.jPanelCampos=jPanelCamposModulo;
			processRunnable.jPanelPaginacion=jPanelPaginacionModulo;
			processRunnable.jPanelAcciones=jPanelAccionesModulo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioModulo;
			
			
			processRunnable.jmenuBar=jmenuBarModulo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleModulo;
			processRunnable.jTtoolBar=jTtoolBarModulo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleModulo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasModulo ,jPanelParametrosReportesModulo,jTableDatosModulo, /*jScrollPanelDatosModulo,*/jPanelCamposModulo,jPanelPaginacionModulo, /*jScrollPanelDatosEdicionModulo,*/ jPanelAccionesModulo,jPanelAccionesFormularioModulo,jmenuBarModulo,jmenuBarDetalleModulo,jTtoolBarModulo,jTtoolBarDetalleModulo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasModulo ,jPanelParametrosReportesModulo, jScrollPanelDatosModulo,jPanelPaginacionModulo, jScrollPanelDatosEdicionModulo, jPanelAccionesModulo,jPanelAccionesFormularioModulo,jmenuBarModulo,jmenuBarDetalleModulo,jTtoolBarModulo,jTtoolBarDetalleModulo);
						
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
	
	public void finishProcessModulo() {// throws Exception 
		this.finishProcessModulo(true);
	}
	
	public void finishProcessModulo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasModulo ,this.jPanelParametrosReportesModulo, this.jScrollPanelDatosModulo,this.jPanelPaginacionModulo, this.jScrollPanelDatosEdicionModulo, this.jPanelAccionesModulo,this.jPanelAccionesFormularioModulo,this.jmenuBarModulo,this.jmenuBarDetalleModulo,this.jTtoolBarModulo,this.jTtoolBarDetalleModulo);		
		
		final JTabbedPane jTabbedPaneBusquedasModulo=this.jTabbedPaneBusquedasModulo; 
		
		final JPanel jPanelParametrosReportesModulo=this.jPanelParametrosReportesModulo;
		//final JScrollPane jScrollPanelDatosModulo=this.jScrollPanelDatosModulo;
		final JTable jTableDatosModulo=this.jTableDatosModulo;		
		final JPanel jPanelPaginacionModulo=this.jPanelPaginacionModulo;
		//final JScrollPane jScrollPanelDatosEdicionModulo=this.jScrollPanelDatosEdicionModulo;
		final JPanel jPanelAccionesModulo=this.jPanelAccionesModulo;
		
		JPanel jPanelCamposAuxiliarModulo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarModulo=new JPanel();
		
		if(this.jInternalFrameDetalleFormModulo!=null) {
			jPanelCamposAuxiliarModulo=this.jInternalFrameDetalleFormModulo.jPanelCamposModulo;
			jPanelAccionesFormularioAuxiliarModulo=this.jInternalFrameDetalleFormModulo.jPanelAccionesFormularioModulo;
		}
		
		final JPanel jPanelCamposModulo=jPanelCamposAuxiliarModulo;
		final JPanel jPanelAccionesFormularioModulo=jPanelAccionesFormularioAuxiliarModulo;
		
		
		final JMenuBar jmenuBarModulo=this.jmenuBarModulo;		
		final JToolBar jTtoolBarModulo=this.jTtoolBarModulo;
				
		JMenuBar jmenuBarDetalleAuxiliarModulo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarModulo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormModulo!=null) {
			jmenuBarDetalleAuxiliarModulo=this.jInternalFrameDetalleFormModulo.jmenuBarDetalleModulo;
			jTtoolBarDetalleAuxiliarModulo=this.jInternalFrameDetalleFormModulo.jTtoolBarDetalleModulo;		
		}
		
		final JMenuBar jmenuBarDetalleModulo=jmenuBarDetalleAuxiliarModulo;
		final JToolBar jTtoolBarDetalleModulo=jTtoolBarDetalleAuxiliarModulo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasModulo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesModulo;
			processRunnable.jTableDatos=jTableDatosModulo;
			processRunnable.jPanelCampos=jPanelCamposModulo;
			processRunnable.jPanelPaginacion=jPanelPaginacionModulo;
			processRunnable.jPanelAcciones=jPanelAccionesModulo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioModulo;
			
			
			processRunnable.jmenuBar=jmenuBarModulo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleModulo;
			processRunnable.jTtoolBar=jTtoolBarModulo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleModulo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasModulo ,jPanelParametrosReportesModulo, jTableDatosModulo,/*jScrollPanelDatosModulo,*/jPanelCamposModulo,jPanelPaginacionModulo, /*jScrollPanelDatosEdicionModulo,*/ jPanelAccionesModulo,jPanelAccionesFormularioModulo,jmenuBarModulo,jmenuBarDetalleModulo,jTtoolBarModulo,jTtoolBarDetalleModulo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesModulo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarModulo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuModulo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarModulo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarModulo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleModulo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuModulo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarModulo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleModulo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.moduloConstantesFunciones.getsFinalQueryModulo();
		String  finalQueryPaginacionTodos=this.moduloConstantesFunciones.getsFinalQueryModulo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ModuloConstantesFunciones.getArrayColumnasGlobalesNoModulo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.modulosEliminados= new ArrayList<Modulo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessModulo();
		
				///*ModuloSessionBean*/this.moduloSessionBean=new ModuloSessionBean();
			
			if(this.moduloSessionBean==null) {
				this.moduloSessionBean=new ModuloSessionBean();
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
					this.iNumeroPaginacion=ModuloConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ModuloConstantesFunciones.getClassesForeignKeysOfModulo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/modulo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			modulosAux= new ArrayList<Modulo>();
			
				
			moduloLogic.setDatosCliente(this.datosCliente);
			moduloLogic.setDatosDeep(this.datosDeep);
			moduloLogic.setIsConDeep(true);
			
			
			moduloLogic.getModuloDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					moduloLogic.getTodosModulos(finalQueryGlobal,pagination);
					
					//moduloLogic.getTodosModulosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(moduloLogic.getModulos()==null|| moduloLogic.getModulos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							modulosAux= new ArrayList<Modulo>();
							modulosAux.addAll(moduloLogic.getModulos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modulosAux= new ArrayList<Modulo>();
							modulosAux.addAll(modulos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							moduloLogic.getTodosModulos(finalQueryGlobal+"",this.pagination);												
							
							//moduloLogic.getTodosModulosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteModulos("Todos",moduloLogic.getModulos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							moduloLogic.setModulos(new ArrayList<Modulo>());					
							moduloLogic.getModulos().addAll(modulosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modulos=new ArrayList<Modulo>();
							modulos.addAll(modulosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idModulo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idModulo=this.idActual;
				
				} else if(this.idModuloActual!=null && this.idModuloActual!=0L) {
					idModulo=idModuloActual;
				}
				
					
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndicePorId(idModulo);
				
				this.modulos=new ArrayList<Modulo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					moduloLogic.getEntity(idModulo);
					
					//moduloLogic.getEntityWithConnection(idModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.setModulos(new ArrayList<Modulo>());
					moduloLogic.getModulos().add(moduloLogic.getModulo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modulos=new ArrayList<Modulo>();
					this.modulos.add(modulo);
				}
				
				if(moduloLogic.getModulo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdSistemaPorNombre")) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceBusquedaPorIdSistemaPorNombre(id_sistemaBusquedaPorIdSistemaPorNombre,nombreBusquedaPorIdSistemaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					moduloLogic.getModulosBusquedaPorIdSistemaPorNombre(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdSistemaPorNombre,nombreBusquedaPorIdSistemaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceBusquedaPorIdSistemaPorNombre(id_sistemaBusquedaPorIdSistemaPorNombre,nombreBusquedaPorIdSistemaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceBusquedaPorIdSistemaPorNombre(id_sistemaBusquedaPorIdSistemaPorNombre,nombreBusquedaPorIdSistemaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=moduloLogic.getModulos()==null||moduloLogic.getModulos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=modulos==null|| modulos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						modulosAux=new ArrayList<Modulo>();
						modulosAux.addAll(moduloLogic.getModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modulosAux=new ArrayList<Modulo>();
							modulosAux.addAll(modulos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							moduloLogic.getModulosBusquedaPorIdSistemaPorNombre(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdSistemaPorNombre,nombreBusquedaPorIdSistemaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceBusquedaPorIdSistemaPorNombre(id_sistemaBusquedaPorIdSistemaPorNombre,nombreBusquedaPorIdSistemaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceBusquedaPorIdSistemaPorNombre(id_sistemaBusquedaPorIdSistemaPorNombre,nombreBusquedaPorIdSistemaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteModulos("BusquedaPorIdSistemaPorNombre",moduloLogic.getModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteModulos("BusquedaPorIdSistemaPorNombre",modulos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						moduloLogic.setModulos(new ArrayList<Modulo>());
						moduloLogic.getModulos().addAll(modulosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modulos=new ArrayList<Modulo>();
							modulos.addAll(modulosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSistema")) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					moduloLogic.getModulosFK_IdSistema(finalQueryGlobal,pagination,id_sistemaFK_IdSistema);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=moduloLogic.getModulos()==null||moduloLogic.getModulos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=modulos==null|| modulos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						modulosAux=new ArrayList<Modulo>();
						modulosAux.addAll(moduloLogic.getModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modulosAux=new ArrayList<Modulo>();
							modulosAux.addAll(modulos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							moduloLogic.getModulosFK_IdSistema(finalQueryGlobal,pagination,id_sistemaFK_IdSistema);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteModulos("FK_IdSistema",moduloLogic.getModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteModulos("FK_IdSistema",modulos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						moduloLogic.setModulos(new ArrayList<Modulo>());
						moduloLogic.getModulos().addAll(modulosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modulos=new ArrayList<Modulo>();
							modulos.addAll(modulosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoTeclaMascara")) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceFK_IdTipoTeclaMascara(id_tipo_tecla_mascaraFK_IdTipoTeclaMascara);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					moduloLogic.getModulosFK_IdTipoTeclaMascara(finalQueryGlobal,pagination,id_tipo_tecla_mascaraFK_IdTipoTeclaMascara);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceFK_IdTipoTeclaMascara(id_tipo_tecla_mascaraFK_IdTipoTeclaMascara);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceFK_IdTipoTeclaMascara(id_tipo_tecla_mascaraFK_IdTipoTeclaMascara);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=moduloLogic.getModulos()==null||moduloLogic.getModulos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=modulos==null|| modulos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						modulosAux=new ArrayList<Modulo>();
						modulosAux.addAll(moduloLogic.getModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modulosAux=new ArrayList<Modulo>();
							modulosAux.addAll(modulos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							moduloLogic.getModulosFK_IdTipoTeclaMascara(finalQueryGlobal,pagination,id_tipo_tecla_mascaraFK_IdTipoTeclaMascara);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceFK_IdTipoTeclaMascara(id_tipo_tecla_mascaraFK_IdTipoTeclaMascara);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModuloConstantesFunciones.getDetalleIndiceFK_IdTipoTeclaMascara(id_tipo_tecla_mascaraFK_IdTipoTeclaMascara);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteModulos("FK_IdTipoTeclaMascara",moduloLogic.getModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteModulos("FK_IdTipoTeclaMascara",modulos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						moduloLogic.setModulos(new ArrayList<Modulo>());
						moduloLogic.getModulos().addAll(modulosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modulos=new ArrayList<Modulo>();
							modulos.addAll(modulosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesModulo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessModulo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=moduloLogic.getModulos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=modulos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=moduloLogic.getModulos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=modulos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Modulo modulo) {
		Boolean permite=true;
		
		if(this.modulo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ModuloConstantesFunciones.getOrderByListaModulo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ModuloConstantesFunciones.getOrderByListaModulo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Modulo modulo:moduloLogic.getModulos()) {
				if(modulo.getsType().equals(Constantes2.S_TOTALES)) {
					moduloTotales=modulo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Modulo modulo:this.modulos) {
				if(modulo.getsType().equals(Constantes2.S_TOTALES)) {
					moduloTotales=modulo;
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
			this.moduloAux=new Modulo();
			this.moduloAux.setsType(Constantes2.S_TOTALES);
			this.moduloAux.setIsNew(false);
			this.moduloAux.setIsChanged(false);
			this.moduloAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ModuloConstantesFunciones.TotalizarValoresFilaModulo(this.moduloLogic.getModulos(),this.moduloAux);
				
				this.moduloLogic.getModulos().add(this.moduloAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ModuloConstantesFunciones.TotalizarValoresFilaModulo(this.modulos,this.moduloAux);
				
				this.modulos.add(this.moduloAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		moduloTotales=new Modulo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.moduloLogic.getModulos().remove(moduloTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.modulos.remove(moduloTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		moduloTotales=new Modulo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Modulo modulo:moduloLogic.getModulos()) {
				if(modulo.getsType().equals(Constantes2.S_TOTALES)) {
					moduloTotales=modulo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ModuloConstantesFunciones.TotalizarValoresFilaModulo(this.moduloLogic.getModulos(),moduloTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Modulo modulo:this.modulos) {
				if(modulo.getsType().equals(Constantes2.S_TOTALES)) {
					moduloTotales=modulo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ModuloConstantesFunciones.TotalizarValoresFilaModulo(this.modulos,moduloTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getModulosBusquedaPorIdSistemaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdSistemaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModulosFK_IdPaquete()throws Exception {
		try {
			sAccionBusqueda="FK_IdPaquete";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModulosFK_IdSistema()throws Exception {
		try {
			sAccionBusqueda="FK_IdSistema";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModulosFK_IdTipoTeclaMascara()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoTeclaMascara";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getModulosBusquedaPorIdSistemaPorNombre(String sFinalQuery,Long id_sistema,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getModulosBusquedaPorIdSistemaPorNombre(sFinalQuery,this.pagination,id_sistema,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModulosFK_IdPaquete(String sFinalQuery,Long id_paquete)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getModulosFK_IdPaquete(sFinalQuery,this.pagination,id_paquete);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModulosFK_IdSistema(String sFinalQuery,Long id_sistema)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getModulosFK_IdSistema(sFinalQuery,this.pagination,id_sistema);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModulosFK_IdTipoTeclaMascara(String sFinalQuery,Long id_tipo_tecla_mascara)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getModulosFK_IdTipoTeclaMascara(sFinalQuery,this.pagination,id_tipo_tecla_mascara);
				
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
	
	public void inicializarPermisosModulo() {
		this.isPermisoTodoModulo=false;
		this.isPermisoNuevoModulo=false;
		this.isPermisoActualizarModulo=false;
		this.isPermisoActualizarOriginalModulo=false;
		this.isPermisoEliminarModulo=false;
		this.isPermisoGuardarCambiosModulo=false;
		this.isPermisoConsultaModulo=false;
		this.isPermisoBusquedaModulo=false;
		this.isPermisoReporteModulo=false;		
		this.isPermisoOrdenModulo=false;		
		this.isPermisoPaginacionMedioModulo=false;		
		this.isPermisoPaginacionAltoModulo=false;
		this.isPermisoPaginacionTodoModulo=false;
		this.isPermisoCopiarModulo=false;		
		this.isPermisoVerFormModulo=false;		
		this.isPermisoDuplicarModulo=false;		
		this.isPermisoOrdenModulo=false;		
	}
	
	public void setPermisosUsuarioModulo(Boolean isPermiso) {
		this.isPermisoTodoModulo=isPermiso;
		this.isPermisoNuevoModulo=isPermiso;
		this.isPermisoActualizarModulo=isPermiso;
		this.isPermisoActualizarOriginalModulo=isPermiso;
		this.isPermisoEliminarModulo=isPermiso;
		this.isPermisoGuardarCambiosModulo=isPermiso;
		this.isPermisoConsultaModulo=isPermiso;
		this.isPermisoBusquedaModulo=isPermiso;
		this.isPermisoReporteModulo=isPermiso;
		this.isPermisoOrdenModulo=isPermiso;		
		this.isPermisoPaginacionMedioModulo=isPermiso;		
		this.isPermisoPaginacionAltoModulo=isPermiso;		
		this.isPermisoPaginacionTodoModulo=isPermiso;		
		this.isPermisoCopiarModulo=isPermiso;		
		this.isPermisoVerFormModulo=isPermiso;		
		this.isPermisoDuplicarModulo=isPermiso;
		this.isPermisoOrdenModulo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioModulo(Boolean isPermiso) {
		//this.isPermisoTodoModulo=isPermiso;
		this.isPermisoNuevoModulo=isPermiso;
		this.isPermisoActualizarModulo=isPermiso;
		this.isPermisoActualizarOriginalModulo=isPermiso;
		this.isPermisoEliminarModulo=isPermiso;
		this.isPermisoGuardarCambiosModulo=isPermiso;
		//this.isPermisoConsultaModulo=isPermiso;
		//this.isPermisoBusquedaModulo=isPermiso;
		//this.isPermisoReporteModulo=isPermiso;
		//this.isPermisoOrdenModulo=isPermiso;		
		//this.isPermisoPaginacionMedioModulo=isPermiso;		
		//this.isPermisoPaginacionAltoModulo=isPermiso;		
		//this.isPermisoPaginacionTodoModulo=isPermiso;		
		//this.isPermisoCopiarModulo=isPermiso;		
		//this.isPermisoDuplicarModulo=isPermiso;
		//this.isPermisoOrdenModulo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioModuloClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebModulo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioModuloClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioModuloClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionModuloClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioModuloClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioModulo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.moduloSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ModuloConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoModulo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarModulo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalModulo=this.isPermisoActualizarModulo;
			this.isPermisoEliminarModulo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosModulo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaModulo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaModulo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoModulo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteModulo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenModulo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioModulo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoModulo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoModulo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarModulo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormModulo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarModulo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenModulo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.moduloSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosModulo.setToolTipText(this.jTableDatosModulo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioModulo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioModulo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioModulo() throws Exception {
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
	public void inicializarCombosForeignKeyModuloListas()throws Exception {
		try	{						
			
				this.sistemasForeignKey=new ArrayList();
				this.paquetesForeignKey=new ArrayList();
				this.tipoteclamascarasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyModuloListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ModuloJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyModuloListas(false);
			} else {
			
				this.cargarCombosForeignKeySistemaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaqueteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoTeclaMascaraListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeySistemaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sistemasForeignKey==null||this.sistemasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SistemaConstantesFunciones.getArrayColumnasGlobalesSistema(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SistemaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SistemaConstantesFunciones.SFINALQUERY;

				this.cargarCombosSistemasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPaqueteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.paquetesForeignKey==null||this.paquetesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaqueteConstantesFunciones.getArrayColumnasGlobalesPaquete(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaqueteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaqueteConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaquetesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoTeclaMascaraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoteclamascarasForeignKey==null||this.tipoteclamascarasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoTeclaMascaraConstantesFunciones.getArrayColumnasGlobalesTipoTeclaMascara(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTeclaMascaraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoTeclaMascaraConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoTeclaMascarasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyModuloListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ModuloParameterReturnGeneral moduloReturnGeneral=new ModuloParameterReturnGeneral();
						
			


				String finalQueryGlobalSistema="";

				if(((this.sistemasForeignKey==null||this.sistemasForeignKey.size()<=0) && this.moduloConstantesFunciones.cargarid_sistemaModulo)
					 || (this.esRecargarFks && this.moduloConstantesFunciones.cargarid_sistemaModulo)) {

					if(!this.moduloSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SistemaConstantesFunciones.getArrayColumnasGlobalesSistema(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSistema=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SistemaConstantesFunciones.TABLENAME);

						finalQueryGlobalSistema=Funciones.GetFinalQueryAppend(finalQueryGlobalSistema, "");
						finalQueryGlobalSistema+=SistemaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSistemasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSistema=" WHERE " + ConstantesSql.ID + "="+moduloSessionBean.getlidSistemaActual();
					}
				} else {
					finalQueryGlobalSistema="NONE";
				}


				String finalQueryGlobalPaquete="";

				if(cargarCombosDependencia && ((this.paquetesForeignKey==null||this.paquetesForeignKey.size()<=0) && this.moduloConstantesFunciones.cargarid_paqueteModulo)
					 || (this.esRecargarFks && this.moduloConstantesFunciones.cargarid_paqueteModulo)) {

					if(!this.moduloSessionBean.getisBusquedaDesdeForeignKeySesionPaquete()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaqueteConstantesFunciones.getArrayColumnasGlobalesPaquete(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPaquete=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaqueteConstantesFunciones.TABLENAME);

						finalQueryGlobalPaquete=Funciones.GetFinalQueryAppend(finalQueryGlobalPaquete, "");
						finalQueryGlobalPaquete+=PaqueteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaquetesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPaquete=" WHERE " + ConstantesSql.ID + "="+moduloSessionBean.getlidPaqueteActual();
					}
				} else {
					finalQueryGlobalPaquete="NONE";
				}


				String finalQueryGlobalTipoTeclaMascara="";

				if(((this.tipoteclamascarasForeignKey==null||this.tipoteclamascarasForeignKey.size()<=0) && this.moduloConstantesFunciones.cargarid_tipo_tecla_mascaraModulo)
					 || (this.esRecargarFks && this.moduloConstantesFunciones.cargarid_tipo_tecla_mascaraModulo)) {

					if(!this.moduloSessionBean.getisBusquedaDesdeForeignKeySesionTipoTeclaMascara()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoTeclaMascaraConstantesFunciones.getArrayColumnasGlobalesTipoTeclaMascara(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoTeclaMascara=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTeclaMascaraConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoTeclaMascara=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoTeclaMascara, "");
						finalQueryGlobalTipoTeclaMascara+=TipoTeclaMascaraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoTeclaMascarasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoTeclaMascara=" WHERE " + ConstantesSql.ID + "="+moduloSessionBean.getlidTipoTeclaMascaraActual();
					}
				} else {
					finalQueryGlobalTipoTeclaMascara="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				moduloReturnGeneral=moduloLogic.cargarCombosLoteForeignKeyModulo(finalQueryGlobalSistema,finalQueryGlobalPaquete,finalQueryGlobalTipoTeclaMascara);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalSistema.equals("NONE")) {
				this.sistemasForeignKey=moduloReturnGeneral.getsistemasForeignKey();
			}

			if(!finalQueryGlobalPaquete.equals("NONE")) {
				this.paquetesForeignKey=moduloReturnGeneral.getpaquetesForeignKey();
			}

			if(!finalQueryGlobalTipoTeclaMascara.equals("NONE")) {
				this.tipoteclamascarasForeignKey=moduloReturnGeneral.gettipoteclamascarasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyModulo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeySistema();
			this.addItemDefectoCombosForeignKeyPaquete();
			this.addItemDefectoCombosForeignKeyTipoTeclaMascara();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeySistema()throws Exception {
		try {
			if(this.moduloSessionBean==null) {
				this.moduloSessionBean=new ModuloSessionBean();
			}

			if(!this.moduloSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {
				Sistema sistema=new Sistema();
				SistemaConstantesFunciones.setSistemaDescripcion(sistema,Constantes.SMENSAJE_ESCOJA_OPCION);
				sistema.setId(null);

				if(!SistemaConstantesFunciones.ExisteEnLista(this.sistemasForeignKey,sistema,true)) {

					this.sistemasForeignKey.add(0,sistema);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPaquete()throws Exception {
		try {

			if(!this.moduloSessionBean.getisBusquedaDesdeForeignKeySesionPaquete()) {
				Paquete paquete=new Paquete();
				PaqueteConstantesFunciones.setPaqueteDescripcion(paquete,Constantes.SMENSAJE_ESCOJA_OPCION);
				paquete.setId(null);

				if(!PaqueteConstantesFunciones.ExisteEnLista(this.paquetesForeignKey,paquete,true)) {

					this.paquetesForeignKey.add(0,paquete);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoTeclaMascara()throws Exception {
		try {

			if(!this.moduloSessionBean.getisBusquedaDesdeForeignKeySesionTipoTeclaMascara()) {
				TipoTeclaMascara tipoteclamascara=new TipoTeclaMascara();
				TipoTeclaMascaraConstantesFunciones.setTipoTeclaMascaraDescripcion(tipoteclamascara,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoteclamascara.setId(null);

				if(!TipoTeclaMascaraConstantesFunciones.ExisteEnLista(this.tipoteclamascarasForeignKey,tipoteclamascara,true)) {

					this.tipoteclamascarasForeignKey.add(0,tipoteclamascara);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyModulo()throws Exception {
		try {
			
			this.initActionsCombosForeignKeySistema("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyModulo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeySistema(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeySistema(JComboBox jComboBoxSistemaGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Sistema sistemaLocal=(Sistema)jComboBoxSistemaGenerico.getSelectedItem();

			if(sistemaLocal!=null  && sistemaLocal.getId()!=null  && sistemaLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_sistema="+sistemaLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboPaquete=sFinalQueryCombo;

			this.paquetesForeignKey=new ArrayList<Paquete>();
			this.cargarCombosForeignKeyPaquete(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeySistema(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormModulo!=null) {
						this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.addItemListener(new ComboBoxItemListener(this,"id_sistemaModulo"));
						this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.addFocusListener(new ComboBoxFocusListener(this,"id_sistemaModulo"));
					}
				} else {
					if(this.jInternalFrameDetalleFormModulo!=null) {
						this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.addActionListener(new ComboBoxActionListener(this,"id_sistemaModulo"));
						this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.addFocusListener(new ComboBoxFocusListener(this,"id_sistemaModulo"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo"));

						this.jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo"));

					} else {
						this.jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo"));

						this.jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo"));

					}
			
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_sistemaFK_IdSistemaModulo.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_sistemaFK_IdSistemaModulo"));

						this.jComboBoxid_sistemaFK_IdSistemaModulo.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaFK_IdSistemaModulo"));

					} else {
						this.jComboBoxid_sistemaFK_IdSistemaModulo.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_sistemaFK_IdSistemaModulo"));

						this.jComboBoxid_sistemaFK_IdSistemaModulo.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaFK_IdSistemaModulo"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyModulo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyModulo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyModulo(Modulo modulo)throws Exception {	
		try {
			
			this.setActualSistemaForeignKey(modulo.getid_sistema(),false,"Formulario");
			this.setActualPaqueteForeignKey(modulo.getid_paquete(),false,"Formulario");
			this.setActualTipoTeclaMascaraForeignKey(modulo.getid_tipo_tecla_mascara(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyModulo(Modulo modulo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyModulo()throws Exception {	
		try {
			
			this.setActualSistemaForeignKey(this.moduloConstantesFunciones.getid_sistema(),false,"Formulario");
			this.setActualPaqueteForeignKey(this.moduloConstantesFunciones.getid_paquete(),false,"Formulario");
			this.setActualTipoTeclaMascaraForeignKey(this.moduloConstantesFunciones.getid_tipo_tecla_mascara(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyModulo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyModulo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyModulo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroModulo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyModulo()throws Exception {
		try {
			

			this.cargarCombosFrameSistemasForeignKey("Todos");
			this.cargarCombosFramePaquetesForeignKey("Todos");
			this.cargarCombosFrameTipoTeclaMascarasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyModulo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameSistemasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaquetesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoTeclaMascarasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyModulo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo!=null && this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.getItemCount()>0) {
				this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo!=null && this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo.getItemCount()>0) {
				this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo!=null && this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo.getItemCount()>0) {
				this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void recargarFormModuloSistema(JComboBox<?> jComboBoxGenericoSistema,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormModuloid_paquete(jComboBoxGenericoSistema,sFormularioTipoBusqueda,"Sistema",false);
	}




	
	



	public void recargarFormModuloid_paquete(JComboBox<?> jComboBoxGenericoPaquete,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Sistema")){
				this.setActualParaGuardarSistemaForeignKey(this.modulo,jComboBoxGenericoPaquete);
			}

			if(this.modulo.getid_sistema()!=null && this.modulo.getid_sistema()!=0L) {
				sFinalQuery+="  WHERE  id_sistema="+this.modulo.getid_sistema();
			} else {
				sFinalQuery+="  WHERE  id_sistema=-1";
			}



			//BUCLE RECURSIVO
			this.setActualPaqueteForeignKey(this.modulo.getid_sistema(),true,sFormularioTipoBusqueda);

			this.cargarCombosPaquetesForeignKeyLista(sFinalQuery);

			this.cargarCombosFramePaquetesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ModuloBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ModuloBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ModuloBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.moduloSessionBean=new ModuloSessionBean(); 
		this.moduloConstantesFunciones=new ModuloConstantesFunciones(); 
		this.moduloBean=new Modulo();//(this.moduloConstantesFunciones); 		
		this.moduloReturnGeneral=new ModuloParameterReturnGeneral(); 
		
		this.moduloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.moduloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ModuloBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ModuloBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ModuloBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessModulo(true);
			
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
			
			this.moduloConstantesFunciones=new ModuloConstantesFunciones(); 
			this.moduloBean=new Modulo();//this.moduloConstantesFunciones); 			
			this.moduloReturnGeneral=new ModuloParameterReturnGeneral(); 
		
			ModuloBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Modulo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.modulo=new Modulo();
			this.modulos = new ArrayList<Modulo>();
			this.modulosAux = new ArrayList<Modulo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic=new ModuloLogic();
				this.moduloLogic.getNewConnexionToDeep("");
			}
			
			//this.moduloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.moduloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormModulo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoModulo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoModulo);	
					}
					
					if(this.jInternalFrameImportacionModulo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionModulo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByModulo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByModulo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormModulo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormModulo);
				this.jInternalFrameDetalleFormModulo.setVisible(false);
				this.jInternalFrameDetalleFormModulo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoModulo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoModulo);
					this.jInternalFrameReporteDinamicoModulo.setVisible(false);
					this.jInternalFrameReporteDinamicoModulo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionModulo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionModulo);
					this.jInternalFrameImportacionModulo.setVisible(false);
					this.jInternalFrameImportacionModulo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByModulo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByModulo);
					this.jInternalFrameOrderByModulo.setVisible(false);
					this.jInternalFrameOrderByModulo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idModuloActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ModuloConstantesFunciones.INUMEROPAGINACION;
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
			
			this.moduloReturnGeneral=new ModuloParameterReturnGeneral();
			
			this.moduloParameterGeneral=new ModuloParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.moduloLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.moduloSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.moduloSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ModuloConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.moduloSessionBean.getEsGuardarRelacionado(),this.moduloSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ModuloConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.moduloSessionBean.getEsGuardarRelacionado(),this.moduloSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoModulo=false;
			this.isVisibilidadCeldaDuplicarModulo=true;
			this.isVisibilidadCeldaCopiarModulo=true;
			this.isVisibilidadCeldaVerFormModulo=true;
			this.isVisibilidadCeldaOrdenModulo=true;
			this.isVisibilidadCeldaNuevoRelacionesModulo=false;
			this.isVisibilidadCeldaModificarModulo=false;
			this.isVisibilidadCeldaActualizarModulo=false;
			this.isVisibilidadCeldaEliminarModulo=false;
			this.isVisibilidadCeldaCancelarModulo=false;
			this.isVisibilidadCeldaGuardarModulo=false;
			this.isVisibilidadCeldaGuardarCambiosModulo=false;
			
			
			this.isVisibilidadBusquedaPorIdSistemaPorNombre=true;
			this.isVisibilidadFK_IdPaquete=true;
			this.isVisibilidadFK_IdSistema=true;
			this.isVisibilidadFK_IdTipoTeclaMascara=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosModulo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioModulo(false);
			
			this.setPermisosUsuarioModulo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.moduloSessionBean.getEsGuardarRelacionado() 
				|| (this.moduloSessionBean.getEsGuardarRelacionado() && this.moduloSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioModuloClasesRelacionadas();
			}
			
			if(this.moduloSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioModuloClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ModuloJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosModulo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualModulo();
			}
			
			if(!this.isPermisoBusquedaModulo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasModulo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.moduloSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioModulo,this.isPermisoPaginacionMedioModulo,this.isPermisoPaginacionTodoModulo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ModuloConstantesFunciones.getTiposSeleccionarModulo());
				
				this.tiposColumnasSelect=ModuloConstantesFunciones.getTiposSeleccionarModulo(true);
				
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
			//if(!this.moduloSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioModulo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioModulo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioModulo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesModulo() ;
			
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
			
			this.sistemaLogic=new SistemaLogic();
			this.paqueteLogic=new PaqueteLogic();
			this.tipoteclamascaraLogic=new TipoTeclaMascaraLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				moduloImplementable= (ModuloImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ModuloConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				moduloImplementableHome= (ModuloImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ModuloConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.modulos= new ArrayList<Modulo>();
			this.modulosEliminados= new ArrayList<Modulo>();
						
			this.isEsNuevoModulo=false;
			this.esParaAccionDesdeFormularioModulo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.sistemasForeignKey=new ArrayList<Sistema>() ;
			this.paquetesForeignKey=new ArrayList<Paquete>() ;
			this.tipoteclamascarasForeignKey=new ArrayList<TipoTeclaMascara>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyModulo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroModulo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.moduloSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ModuloBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ModuloConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingModulo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormModulo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioModulo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioModulo();
			}
			
			ModuloBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasModulo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasModulo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasModulo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessModulo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Modulo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectModulo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesModulo")) {
				iIndex=this.jInternalFrameDetalleFormModulo.jTabbedPaneRelacionesModulo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormModulo.jTabbedPaneRelacionesModulo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosModulo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessModulo();	
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
	
	public void cargarCombosForeignKeyModulo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyModulo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyModuloListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyModulo();
		
		this.cargarCombosFrameForeignKeyModulo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyModulo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyModulo();
		}
	}
	
	

	public void cargarCombosForeignKeySistema(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeySistemaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeySistema();
				this.cargarCombosFrameSistemasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeySistema("Todos");
				}

			this.recargarComboTablaSistema(this.sistemasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPaquete(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaqueteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPaquete();
				this.cargarCombosFramePaquetesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeySistema("Todos");
				}

			this.recargarComboTablaPaquete(this.paquetesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoTeclaMascara(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoTeclaMascaraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoTeclaMascara();
				this.cargarCombosFrameTipoTeclaMascarasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeySistema("Todos");
				}

			this.recargarComboTablaTipoTeclaMascara(this.tipoteclamascarasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoModuloActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.moduloSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			
			
			if(jTableDatosModulo.getRowCount()>=1) {
				jTableDatosModulo.removeRowSelectionInterval(0, jTableDatosModulo.getRowCount()-1);						
			}
			
			this.isEsNuevoModulo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoModulo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesModulo(true);			
			//this.modulo=new Modulo();
			//this.modulo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesModulo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualModulo() ;
			
			if(ModuloJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleModulo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.modulo);	
			this.actualizarInformacion("INFO_PADRE",false,this.modulo);				
			
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			
			if(this.moduloSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Modulo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarModuloActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosModulo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosModulo.getSelectedRows().length;			
			}
			
			modulosSeleccionados=this.getModulosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoModulo--;			
				//Modulo moduloAux= new Modulo();			
				//moduloAux.setId(this.iIdNuevoModulo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Modulo moduloOrigen=new Modulo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Modulo moduloOrigen : modulosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosModulo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							moduloOrigen =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							moduloOrigen =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaModulo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.modulo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosModulo(moduloOrigen,this.modulo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.moduloLogic.getModulos().add(this.moduloAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.modulos.add(this.moduloAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaModulo(false);
				
				this.jTableDatosModulo.setRowSelectionInterval(this.getIndiceNuevoModulo(), this.getIndiceNuevoModulo());
				
				int iLastRow =  this.jTableDatosModulo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosModulo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosModulo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaModulo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();									
		
			Modulo moduloOrigen=new Modulo();
			Modulo moduloDestino=new Modulo();
				
			modulosSeleccionados=this.getModulosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosModulo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || modulosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosModulo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						moduloOrigen =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						moduloOrigen =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						moduloDestino =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						moduloDestino =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				moduloOrigen =modulosSeleccionados.get(0);
				moduloDestino =modulosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosModulo(moduloOrigen,moduloDestino,true,false);
				
				moduloDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(moduloDestino,moduloLogic.getModulos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(moduloDestino,modulos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaModulo(false);
				
				//this.jTableDatosModulo.setRowSelectionInterval(this.getIndiceNuevoModulo(), this.getIndiceNuevoModulo());
				
				int iLastRow =  this.jTableDatosModulo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosModulo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosModulo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaModulo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormModulo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesModulo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasModulo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesModulo.setVisible(!isVisible);
			this.jPanelPaginacionModulo.setVisible(!isVisible);
			this.jPanelAccionesModulo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameModulo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoModulo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionModulo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByModulo();
			
			this.abrirFrameOrderByModulo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByModulo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleModulo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormModulo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormModulo.isMaximum()) {
					this.jInternalFrameDetalleFormModulo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormModulo.setSize(this.jInternalFrameDetalleFormModulo.iWidthFormulario,this.jInternalFrameDetalleFormModulo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormModulo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormModulo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormModulo.isMaximum()) {
						this.jInternalFrameDetalleFormModulo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormModulo.jContentPaneDetalleModulo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormModulo.jTabbedPaneRelacionesModulo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormModulo.jContentPaneDetalleModulo.getWidth(),ModuloConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormModulo.jTabbedPaneRelacionesModulo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormModulo.jContentPaneDetalleModulo.getWidth(),ModuloConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormModulo.jTabbedPaneRelacionesModulo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormModulo.jContentPaneDetalleModulo.getWidth(),ModuloConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormModulo.setVisible(true);
	        this.jInternalFrameDetalleFormModulo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByModulo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByModulo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByModulo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByModulo,false,this);
				} else {
					this.jInternalFrameOrderByModulo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByModulo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByModulo);
				this.jInternalFrameOrderByModulo.setVisible(false);
				this.jInternalFrameOrderByModulo.setSelected(false);
				
				this.jInternalFrameOrderByModulo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByModulo"));
				
				this.inicializarActualizarBindingTablaOrderByModulo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionModulo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionModulo==null) {
				
				this.jInternalFrameImportacionModulo=new ImportacionJInternalFrame(ModuloConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionModulo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionModulo);
				this.jInternalFrameImportacionModulo.setVisible(false);
				this.jInternalFrameImportacionModulo.setSelected(false);


				this.jInternalFrameImportacionModulo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionModulo"));
				this.jInternalFrameImportacionModulo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionModulo"));
				this.jInternalFrameImportacionModulo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionModulo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoModulo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoModulo==null) {
				this.jInternalFrameReporteDinamicoModulo=new ReporteDinamicoJInternalFrame(ModuloConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoModulo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoModulo);
				this.jInternalFrameReporteDinamicoModulo.setVisible(false);
				this.jInternalFrameReporteDinamicoModulo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoModulo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoModulo"));
				this.jInternalFrameReporteDinamicoModulo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoModulo"));
				this.jInternalFrameReporteDinamicoModulo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoModulo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualModulo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleModulo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormModulo);
			
	       	this.jInternalFrameDetalleFormModulo.setVisible(false);
	        this.jInternalFrameDetalleFormModulo.setSelected(false);
			
			//this.jInternalFrameDetalleFormModulo.dispose();
			//this.jInternalFrameDetalleFormModulo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoModulo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoModulo.setVisible(true);
	        this.jInternalFrameReporteDinamicoModulo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionModulo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionModulo.setVisible(true);
	        this.jInternalFrameImportacionModulo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByModulo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByModulo.setVisible(true);
	        this.jInternalFrameOrderByModulo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByModulo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByModulo.setVisible(false);
	        this.jInternalFrameOrderByModulo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoModulo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoModulo.setVisible(false);
	        this.jInternalFrameReporteDinamicoModulo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionModulo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionModulo.setVisible(false);
	        this.jInternalFrameImportacionModulo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarModulo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarModulo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosModulo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesModulo(true);
			//this.isEsNuevoModulo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesModulo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesModulo(false) ;
			
			if(moduloSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ModuloJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleModulo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualModulo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaModuloActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarModulo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosModulo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesModulo(true);
			//this.isEsNuevoModulo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.modulo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesModulo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesModulo(false) ;
			
			if(ModuloJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleModulo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualModulo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaSistema(List<Sistema> sistemasForeignKey)throws Exception{
		TableColumn tableColumnSistema=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModulo,ModuloConstantesFunciones.LABEL_IDSISTEMA));
		TableCellEditor tableCellEditorSistema =tableColumnSistema.getCellEditor();

		SistemaTableCell sistemaTableCellFk=(SistemaTableCell)tableCellEditorSistema;

		if(sistemaTableCellFk!=null) {
			sistemaTableCellFk.setsistemasForeignKey(sistemasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosModulo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//sistemaTableCellFk.setRowActual(intSelectedRow);
			//sistemaTableCellFk.setsistemasForeignKeyActual(sistemasForeignKey);
		//}


		if(sistemaTableCellFk!=null) {
			sistemaTableCellFk.RecargarSistemasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPaquete(List<Paquete> paquetesForeignKey)throws Exception{
		TableColumn tableColumnPaquete=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModulo,ModuloConstantesFunciones.LABEL_IDPAQUETE));
		TableCellEditor tableCellEditorPaquete =tableColumnPaquete.getCellEditor();

		PaqueteTableCell paqueteTableCellFk=(PaqueteTableCell)tableCellEditorPaquete;

		if(paqueteTableCellFk!=null) {
			paqueteTableCellFk.setpaquetesForeignKey(paquetesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosModulo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paqueteTableCellFk.setRowActual(intSelectedRow);
			//paqueteTableCellFk.setpaquetesForeignKeyActual(paquetesForeignKey);
		//}


		if(paqueteTableCellFk!=null) {
			paqueteTableCellFk.RecargarPaquetesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoTeclaMascara(List<TipoTeclaMascara> tipoteclamascarasForeignKey)throws Exception{
		TableColumn tableColumnTipoTeclaMascara=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModulo,ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA));
		TableCellEditor tableCellEditorTipoTeclaMascara =tableColumnTipoTeclaMascara.getCellEditor();

		TipoTeclaMascaraTableCell tipoteclamascaraTableCellFk=(TipoTeclaMascaraTableCell)tableCellEditorTipoTeclaMascara;

		if(tipoteclamascaraTableCellFk!=null) {
			tipoteclamascaraTableCellFk.settipoteclamascarasForeignKey(tipoteclamascarasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosModulo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoteclamascaraTableCellFk.setRowActual(intSelectedRow);
			//tipoteclamascaraTableCellFk.settipoteclamascarasForeignKeyActual(tipoteclamascarasForeignKey);
		//}


		if(tipoteclamascaraTableCellFk!=null) {
			tipoteclamascaraTableCellFk.RecargarTipoTeclaMascarasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarModuloActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesModulo(false);
			
			//if(!this.isEsNuevoModulo) {								
				int intSelectedRow = this.jTableDatosModulo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualModulo(this.modulo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
				
			}
			
			if(this.permiteMantenimiento(this.modulo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.moduloSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoModulo=true;
					this.inicializarActualizarBindingTablaModulo(false);
					this.isEsNuevoModulo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoModulo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoModulo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesModulo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualModulo(false);
				
				this.habilitarDeshabilitarControlesModulo(false);
			
												
				
				if(ModuloJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleModulo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoModuloActionPerformed(evt,moduloSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualModulo(this.modulo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosModulo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,moduloSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.modulo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Modulo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Modulo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarModuloActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosModulo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				this.modulo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				this.modulo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.modulo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.moduloSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ModuloModel) this.jTableDatosModulo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoModulo=true;
				this.inicializarActualizarBindingTablaModulo(false);
				this.isEsNuevoModulo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesModulo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualModulo(false);
				
				this.habilitarDeshabilitarControlesModulo(false);
				
				
				
				if(ModuloJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleModulo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarModuloActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosModulo.getRowCount()>=1) {
				jTableDatosModulo.removeRowSelectionInterval(0, jTableDatosModulo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesModulo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaModulo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesModulo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualModulo(false) ;
			
			this.isEsNuevoModulo=false;
			
			if(ModuloJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleModulo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingModulo(false);
				
				//SI ES MANUAL
				if(ModuloJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualModulo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoModulo--;			
			//Modulo moduloAux= new Modulo();			
			//moduloAux.setId(this.iIdNuevoModulo);
			
			if(this.jInternalFrameDetalleFormModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaModulo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
			
			this.modulo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.moduloLogic.getModulos().add(this.moduloAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.modulos.add(this.moduloAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaModulo(false);
			
			this.jTableDatosModulo.setRowSelectionInterval(this.getIndiceNuevoModulo(), this.getIndiceNuevoModulo());
			
			int iLastRow =  this.jTableDatosModulo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosModulo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosModulo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaModulo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingModulo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingModulo(false);
			
			//SI ES MANUAL
			if(ModuloJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualModulo();
			}
			
			//this.abrirFrameTreeModulo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionModuloActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ModuloS ?", "MANTENIMIENTO DE Modulo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionModulo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralModulo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.moduloReturnGeneral=moduloLogic.procesarImportacionModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.moduloParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarModuloReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionModuloActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionModulo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionModulo.setFileImportacion(this.jInternalFrameImportacionModulo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionModulo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionModulo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionModulo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionModulo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoModuloActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();		

		modulosSeleccionados=this.getModulosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoModulo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoModulo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ModuloBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ModuloBaseDesign.jrxml";
			
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
			
			this.generarReporteModulos("Todos",modulosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.moduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modulo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoModulo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoModulo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ModuloConstantesFunciones.LABEL_IDSISTEMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sistema_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sistema_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sistema_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sistema_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModuloConstantesFunciones.LABEL_IDPAQUETE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Paquete_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Paquete_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Paquete_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Paquete_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModuloConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModuloConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoTeclaMascara_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoTeclaMascara_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoTeclaMascara_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoTeclaMascara_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModuloConstantesFunciones.LABEL_TECLA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cla_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cla_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cla_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cla_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModuloConstantesFunciones.LABEL_ESTADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModuloConstantesFunciones.LABEL_ORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_den_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_den_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_den_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_den_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModuloConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoModulo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoModulo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoModulo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ModuloConstantesFunciones.LABEL_IDSISTEMA:
					sNombreCampoCategoria="id_sistema";
					break;

				case ModuloConstantesFunciones.LABEL_IDPAQUETE:
					sNombreCampoCategoria="id_paquete";
					break;

				case ModuloConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ModuloConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA:
					sNombreCampoCategoria="id_tipo_tecla_mascara";
					break;

				case ModuloConstantesFunciones.LABEL_TECLA:
					sNombreCampoCategoria="tecla";
					break;

				case ModuloConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;

				case ModuloConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoria="orden";
					break;

				case ModuloConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoModulo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ModuloConstantesFunciones.LABEL_IDSISTEMA:
					sNombreCampoCategoriaValor="id_sistema";
					break;

				case ModuloConstantesFunciones.LABEL_IDPAQUETE:
					sNombreCampoCategoriaValor="id_paquete";
					break;

				case ModuloConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ModuloConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA:
					sNombreCampoCategoriaValor="id_tipo_tecla_mascara";
					break;

				case ModuloConstantesFunciones.LABEL_TECLA:
					sNombreCampoCategoriaValor="tecla";
					break;

				case ModuloConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;

				case ModuloConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoriaValor="orden";
					break;

				case ModuloConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoModulo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoModulo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ModuloConstantesFunciones.LABEL_IDSISTEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sistema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sistema");
					break;

				case ModuloConstantesFunciones.LABEL_IDPAQUETE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Paquete",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_paquete");
					break;

				case ModuloConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ModuloConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Tecla Mascara",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_tecla_mascara");
					break;

				case ModuloConstantesFunciones.LABEL_TECLA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tecla",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tecla");
					break;

				case ModuloConstantesFunciones.LABEL_ESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"estado");
					break;

				case ModuloConstantesFunciones.LABEL_ORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"orden");
					break;

				case ModuloConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoModuloActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();		
		
		modulosSeleccionados=this.getModulosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modulo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Modulos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoModulo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoModulo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ModuloConstantesFunciones.LABEL_IDSISTEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModuloConstantesFunciones.LABEL_IDSISTEMA);
					iRow++;

					for(Modulo modulo:modulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modulo.getsistema_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModuloConstantesFunciones.LABEL_IDPAQUETE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModuloConstantesFunciones.LABEL_IDPAQUETE);
					iRow++;

					for(Modulo modulo:modulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modulo.getpaquete_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModuloConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModuloConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Modulo modulo:modulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modulo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModuloConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModuloConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Modulo modulo:modulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modulo.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA);
					iRow++;

					for(Modulo modulo:modulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modulo.gettipoteclamascara_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModuloConstantesFunciones.LABEL_TECLA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModuloConstantesFunciones.LABEL_TECLA);
					iRow++;

					for(Modulo modulo:modulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modulo.gettecla());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModuloConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModuloConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(Modulo modulo:modulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modulo.getestado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModuloConstantesFunciones.LABEL_ORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModuloConstantesFunciones.LABEL_ORDEN);
					iRow++;

					for(Modulo modulo:modulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modulo.getorden());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModuloConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModuloConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Modulo modulo:modulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modulo.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelModulo(row);				
			//	iRow++;
			//}				
			
			//for(Modulo moduloAux:modulosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelModulo(moduloAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.moduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modulo",JOptionPane.INFORMATION_MESSAGE);
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
				this.moduloLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingModulo(false);
			
			//SI ES MANUAL
			if(ModuloJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualModulo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingModulo(false);
			
			//SI ES MANUAL
			if(ModuloJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualModulo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingModulo(false);
			
			//SI ES MANUAL
			if(ModuloJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualModulo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaModulo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosModulo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosModulo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosModulo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosModulo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosModulo.setMinimumSize(dimensionMinimum);
		this.jTableDatosModulo.setMaximumSize(dimensionMaximum);
		this.jTableDatosModulo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingModulo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingModulo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingModulo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaModulo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesModulo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.moduloSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasModulo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesModulo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesModulo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ModuloJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ModuloJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualModulo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaModulo();
		
		this.inicializarActualizarBindingBotonesManualModulo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.moduloSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualModulo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesModulo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualModulo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualModulo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosModulo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosModulo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteModulo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormModulo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormModulo.jCheckBoxPostAccionNuevoModulo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormModulo.jCheckBoxPostAccionSinCerrarModulo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormModulo.jCheckBoxPostAccionSinMensajeModulo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosModulo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosModulo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteModulo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormModulo!=null) {
				this.jInternalFrameDetalleFormModulo.jCheckBoxPostAccionNuevoModulo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormModulo.jCheckBoxPostAccionSinCerrarModulo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormModulo.jCheckBoxPostAccionSinMensajeModulo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionModulo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionModulo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormModulo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesModulo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoModulo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoModulo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesModulo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesModulo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarModulo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesModulo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoModulo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoModulo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesModulo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralModulo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesModulo(Boolean esInicializar) throws Exception {
		try	{	
			if(ModuloJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualModulo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesModulo() throws Exception {
		try	{
			if(ModuloJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualModulo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleModulo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualModulo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesModulo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesModulo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesModulo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionModulo.addItem(reporte);
			}
			
			
			if(!this.moduloSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionModulo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionModulo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesModulo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesModulo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarModulo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarModulo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualModulo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualModulo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoModulo!=null) {
				this.jInternalFrameReporteDinamicoModulo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoModulo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoModulo!=null) {
				this.jInternalFrameReporteDinamicoModulo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoModulo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoModulo!=null) {
				
				if(this.jInternalFrameReporteDinamicoModulo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoModulo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoModulo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoModulo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoModulo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoModulo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualModulo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.getSelectedItem()!=null){this.id_sistemaBusquedaPorIdSistemaPorNombre=((Sistema)this.jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo.getSelectedItem()).getId();}
		this.nombreBusquedaPorIdSistemaPorNombre=this.jTextAreanombreBusquedaPorIdSistemaPorNombreModulo.getText();
		if(this.jComboBoxid_sistemaFK_IdSistemaModulo.getSelectedItem()!=null){this.id_sistemaFK_IdSistema=((Sistema)this.jComboBoxid_sistemaFK_IdSistemaModulo.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.getSelectedItem()!=null){this.id_tipo_tecla_mascaraFK_IdTipoTeclaMascara=((TipoTeclaMascara)this.jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraModulo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasModulo(Boolean esInicializar) throws Exception {				
		if(ModuloJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualModulo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaModulo() throws Exception {
		this.inicializarActualizarBindingTablaModulo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByModulo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByModulo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByModulo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByModulo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ModuloPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByModulo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByModulo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ModuloPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosModuloOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModuloOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ModuloPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByModulo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByModulo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ModuloPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByModulo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaModulo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=moduloLogic.getModulos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=modulos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosModulo.setModel(new ModuloModel(this.moduloLogic.getModulos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosModulo.setModel(new ModuloModel(this.modulos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByModulo!=null && this.jInternalFrameOrderByModulo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByModulo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModulo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ModuloPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ModuloConstantesFunciones.SCLASSWEBTITULO,moduloConstantesFunciones.resaltarSeleccionarModulo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ModuloConstantesFunciones.SCLASSWEBTITULO,moduloConstantesFunciones.resaltarSeleccionarModulo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModulo,ModuloConstantesFunciones.LABEL_ID));

		if(this.moduloConstantesFunciones.mostraridModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModuloConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.moduloConstantesFunciones.resaltaridModulo,this.moduloConstantesFunciones.activaridModulo,this,true,"idModulo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.moduloConstantesFunciones.resaltaridModulo,this.moduloConstantesFunciones.activaridModulo,this,true,"idModulo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModulo,ModuloConstantesFunciones.LABEL_IDSISTEMA));

		if(this.moduloConstantesFunciones.mostrarid_sistemaModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModuloConstantesFunciones.LABEL_IDSISTEMA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SistemaTableCell(this.sistemasForeignKey,this.moduloConstantesFunciones.resaltarid_sistemaModulo,this,this.moduloConstantesFunciones.activarid_sistemaModulo));
			tableColumn.setCellEditor(new SistemaTableCell(this.sistemasForeignKey,this.moduloConstantesFunciones.resaltarid_sistemaModulo,this,this.moduloConstantesFunciones.activarid_sistemaModulo,true,"id_sistemaModulo","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModulo,ModuloConstantesFunciones.LABEL_IDPAQUETE));

		if(this.moduloConstantesFunciones.mostrarid_paqueteModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModuloConstantesFunciones.LABEL_IDPAQUETE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaqueteTableCell(this.paquetesForeignKey,this.moduloConstantesFunciones.resaltarid_paqueteModulo,this,this.moduloConstantesFunciones.activarid_paqueteModulo));
			tableColumn.setCellEditor(new PaqueteTableCell(this.paquetesForeignKey,this.moduloConstantesFunciones.resaltarid_paqueteModulo,this,this.moduloConstantesFunciones.activarid_paqueteModulo,true,"id_paqueteModulo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModulo,ModuloConstantesFunciones.LABEL_CODIGO));

		if(this.moduloConstantesFunciones.mostrarcodigoModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModuloConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.moduloConstantesFunciones.resaltarcodigoModulo,this.moduloConstantesFunciones.activarcodigoModulo,this,true,"codigoModulo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.moduloConstantesFunciones.resaltarcodigoModulo,this.moduloConstantesFunciones.activarcodigoModulo,this,true,"codigoModulo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModulo,ModuloConstantesFunciones.LABEL_NOMBRE));

		if(this.moduloConstantesFunciones.mostrarnombreModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModuloConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.moduloConstantesFunciones.resaltarnombreModulo,this.moduloConstantesFunciones.activarnombreModulo,this,true,"nombreModulo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.moduloConstantesFunciones.resaltarnombreModulo,this.moduloConstantesFunciones.activarnombreModulo,this,true,"nombreModulo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModulo,ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA));

		if(this.moduloConstantesFunciones.mostrarid_tipo_tecla_mascaraModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoTeclaMascaraTableCell(this.tipoteclamascarasForeignKey,this.moduloConstantesFunciones.resaltarid_tipo_tecla_mascaraModulo,this,this.moduloConstantesFunciones.activarid_tipo_tecla_mascaraModulo));
			tableColumn.setCellEditor(new TipoTeclaMascaraTableCell(this.tipoteclamascarasForeignKey,this.moduloConstantesFunciones.resaltarid_tipo_tecla_mascaraModulo,this,this.moduloConstantesFunciones.activarid_tipo_tecla_mascaraModulo,true,"id_tipo_tecla_mascaraModulo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModulo,ModuloConstantesFunciones.LABEL_TECLA));

		if(this.moduloConstantesFunciones.mostrarteclaModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModuloConstantesFunciones.LABEL_TECLA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.moduloConstantesFunciones.resaltarteclaModulo,this.moduloConstantesFunciones.activarteclaModulo,this,true,"teclaModulo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.moduloConstantesFunciones.resaltarteclaModulo,this.moduloConstantesFunciones.activarteclaModulo,this,true,"teclaModulo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModulo,ModuloConstantesFunciones.LABEL_ESTADO));

		if(this.moduloConstantesFunciones.mostrarestadoModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModuloConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.moduloConstantesFunciones.resaltarestadoModulo,this.moduloConstantesFunciones.activarestadoModulo));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.moduloConstantesFunciones.resaltarestadoModulo,this.moduloConstantesFunciones.activarestadoModulo,this,true,"estadoModulo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModulo,ModuloConstantesFunciones.LABEL_ORDEN));

		if(this.moduloConstantesFunciones.mostrarordenModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModuloConstantesFunciones.LABEL_ORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.moduloConstantesFunciones.resaltarordenModulo,this.moduloConstantesFunciones.activarordenModulo,this,true,"ordenModulo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.moduloConstantesFunciones.resaltarordenModulo,this.moduloConstantesFunciones.activarordenModulo,this,true,"ordenModulo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModulo,ModuloConstantesFunciones.LABEL_DESCRIPCION));

		if(this.moduloConstantesFunciones.mostrardescripcionModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModuloConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.moduloConstantesFunciones.resaltardescripcionModulo,this.moduloConstantesFunciones.activardescripcionModulo,this,true,"descripcionModulo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.moduloConstantesFunciones.resaltardescripcionModulo,this.moduloConstantesFunciones.activardescripcionModulo,this,true,"descripcionModulo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.moduloSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.moduloSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.moduloSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosModulo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.moduloSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.moduloSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosModulo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarModulo && this.isPermisoGuardarCambiosModulo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.moduloSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.moduloSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosModulo.addColumn(tableColumn);
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
			
			this.jTableDatosModulo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarModulo && this.isPermisoGuardarCambiosModulo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarModulo && this.isPermisoGuardarCambiosModulo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosModulo.moveColumn(this.jTableDatosModulo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosModulo.moveColumn(this.jTableDatosModulo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosModulo.moveColumn(this.jTableDatosModulo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosModulo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosModulo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosModulo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosModulo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosModulo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosModulo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosModulo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosModulo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=moduloLogic.getModulos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=modulos.size()-1;
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
		//this.jTableDatosModulo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosModulo();
			
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
				
				//this.isEsNuevoModulo=false;
					
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			
				if(this.moduloSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormModulo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosModulo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosModulo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.modulo.getsType().equals("DUPLICADO")
				   || this.modulo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoModulo=true;
				
				} else {
					this.isEsNuevoModulo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.moduloSessionBean.getEsGuardarRelacionado()) {
					if(this.modulo.getId()>=0 && !this.modulo.getIsNew()) {						
						this.isEsNuevoModulo=false;
						
					} else {
						this.isEsNuevoModulo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoModulo(esRelaciones);						
				
				this.seleccionarModulo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.modulo.getId()<0) {
					this.isEsNuevoModulo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarModulo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarModulo(evt,rowIndex);
				}	
				
				if(this.moduloSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Modulo: " + this.dDif); 
					}
				}								
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarModulo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.modulo)) {
					if(this.modulo.getId()>0) {
						this.modulo.setIsDeleted(true);
						
						this.modulosEliminados.add(this.modulo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.moduloLogic.getModulos().remove(this.modulo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.modulos.remove(this.modulo);				
					}
					
					
					((ModuloModel) this.jTableDatosModulo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaModulo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarModulo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoModulo) {
			
			if(this.jInternalFrameDetalleFormModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosModulo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosModulo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioModulo(this.modulo);
				}
				
				//ARCHITECTURE
				try {
					

					//Sistema
					if(!this.moduloConstantesFunciones.cargarid_sistemaModulo || this.moduloConstantesFunciones.event_dependid_sistemaModulo) {
						//this.cargarCombosSistemasForeignKeyLista(" where id="+this.modulo.getid_sistema());
									//this.inicializarActualizarBindingModulo(false,false);
						this.sistemasForeignKey=new ArrayList<Sistema>();

						if(modulo.getSistema()!=null) {
							this.sistemasForeignKey.add(modulo.getSistema());
						}

						this.addItemDefectoCombosForeignKeySistema();
						this.cargarCombosFrameSistemasForeignKey("Todos");
					}
					this.setActualSistemaForeignKey(this.modulo.getid_sistema(),false,"Formulario");

					//Paquete
					if(!this.moduloConstantesFunciones.cargarid_paqueteModulo || this.moduloConstantesFunciones.event_dependid_paqueteModulo) {
						//this.cargarCombosPaquetesForeignKeyLista(" where id="+this.modulo.getid_paquete());
									//this.inicializarActualizarBindingModulo(false,false);
						this.paquetesForeignKey=new ArrayList<Paquete>();

						if(modulo.getPaquete()!=null) {
							this.paquetesForeignKey.add(modulo.getPaquete());
						}

						this.addItemDefectoCombosForeignKeyPaquete();
						this.cargarCombosFramePaquetesForeignKey("Todos");
					}
					this.setActualPaqueteForeignKey(this.modulo.getid_paquete(),false,"Formulario");

					//TipoTeclaMascara
					if(!this.moduloConstantesFunciones.cargarid_tipo_tecla_mascaraModulo || this.moduloConstantesFunciones.event_dependid_tipo_tecla_mascaraModulo) {
						//this.cargarCombosTipoTeclaMascarasForeignKeyLista(" where id="+this.modulo.getid_tipo_tecla_mascara());
									//this.inicializarActualizarBindingModulo(false,false);
						this.tipoteclamascarasForeignKey=new ArrayList<TipoTeclaMascara>();

						if(modulo.getTipoTeclaMascara()!=null) {
							this.tipoteclamascarasForeignKey.add(modulo.getTipoTeclaMascara());
						}

						this.addItemDefectoCombosForeignKeyTipoTeclaMascara();
						this.cargarCombosFrameTipoTeclaMascarasForeignKey("Todos");
					}
					this.setActualTipoTeclaMascaraForeignKey(this.modulo.getid_tipo_tecla_mascara(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesModulo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesModulo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualModulo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoModulo(Modulo modulo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoModulo(modulo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoModulo(Modulo modulo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioModulo(modulo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyModulo(modulo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyModulo(modulo);
	}
	
	public void setVariablesObjetoActualToFormularioModulo(Modulo modulo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormModulo.jTextFieldidModulo.setText(modulo.getId().toString());
			this.jInternalFrameDetalleFormModulo.jTextFieldcodigoModulo.setText(modulo.getcodigo());
			this.jInternalFrameDetalleFormModulo.jTextAreanombreModulo.setText(modulo.getnombre());
			this.jInternalFrameDetalleFormModulo.jTextFieldteclaModulo.setText(modulo.gettecla());
			this.jInternalFrameDetalleFormModulo.jCheckBoxestadoModulo.setSelected(modulo.getestado());
			this.jInternalFrameDetalleFormModulo.jTextFieldordenModulo.setText(modulo.getorden().toString());
			this.jInternalFrameDetalleFormModulo.jTextAreadescripcionModulo.setText(modulo.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Modulo moduloLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,moduloLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Modulo moduloLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				moduloLocal=this.modulo;
			} else {
				moduloLocal=this.moduloAnterior;
			}
		}
		
		if(this.permiteMantenimiento(moduloLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoModulo(moduloLocal,true);
					
					if(moduloSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(moduloLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.moduloSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(moduloLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoModulo(Modulo modulo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualModulo(modulo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysModulo(modulo);
	}
	
	public void setVariablesFormularioToObjetoActualModulo(Modulo modulo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualModulo(modulo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualModulo(Modulo modulo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormModulo.jTextFieldidModulo.getText()==null || this.jInternalFrameDetalleFormModulo.jTextFieldidModulo.getText()=="" || this.jInternalFrameDetalleFormModulo.jTextFieldidModulo.getText()=="Id") {
				this.jInternalFrameDetalleFormModulo.jTextFieldidModulo.setText("0");
			}

			if(conColumnasBase) {modulo.setId(Long.parseLong(this.jInternalFrameDetalleFormModulo.jTextFieldidModulo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ModuloConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabelIdModulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			modulo.setcodigo(this.jInternalFrameDetalleFormModulo.jTextFieldcodigoModulo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ModuloConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabelcodigoModulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			modulo.setnombre(this.jInternalFrameDetalleFormModulo.jTextAreanombreModulo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ModuloConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabelnombreModulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			modulo.settecla(this.jInternalFrameDetalleFormModulo.jTextFieldteclaModulo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ModuloConstantesFunciones.LABEL_TECLA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabelteclaModulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			modulo.setestado(this.jInternalFrameDetalleFormModulo.jCheckBoxestadoModulo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ModuloConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabelestadoModulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			modulo.setorden(Integer.parseInt(this.jInternalFrameDetalleFormModulo.jTextFieldordenModulo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ModuloConstantesFunciones.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabelordenModulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			modulo.setdescripcion(this.jInternalFrameDetalleFormModulo.jTextAreadescripcionModulo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ModuloConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModulo.jLabeldescripcionModulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualModulo(Modulo moduloBean,Modulo modulo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && moduloBean.getid_sistema()!=null && !moduloBean.getid_sistema().equals(-1L))) {modulo.setid_sistema(moduloBean.getid_sistema());}
			if(conDefault || (!conDefault && moduloBean.getid_paquete()!=null && !moduloBean.getid_paquete().equals(-1L))) {modulo.setid_paquete(moduloBean.getid_paquete());}
			if(conDefault || (!conDefault && moduloBean.getid_tipo_tecla_mascara()!=null && !moduloBean.getid_tipo_tecla_mascara().equals(-1L))) {modulo.setid_tipo_tecla_mascara(moduloBean.getid_tipo_tecla_mascara());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosModulo(Modulo moduloOrigen,Modulo modulo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && moduloOrigen.getId()!=null && !moduloOrigen.getId().equals(0L))) {modulo.setId(moduloOrigen.getId());}}
			if(conDefault || (!conDefault && moduloOrigen.getid_sistema()!=null && !moduloOrigen.getid_sistema().equals(-1L))) {modulo.setid_sistema(moduloOrigen.getid_sistema());}
			if(conDefault || (!conDefault && moduloOrigen.getid_paquete()!=null && !moduloOrigen.getid_paquete().equals(-1L))) {modulo.setid_paquete(moduloOrigen.getid_paquete());}
			if(conDefault || (!conDefault && moduloOrigen.getcodigo()!=null && !moduloOrigen.getcodigo().equals(""))) {modulo.setcodigo(moduloOrigen.getcodigo());}
			if(conDefault || (!conDefault && moduloOrigen.getnombre()!=null && !moduloOrigen.getnombre().equals(""))) {modulo.setnombre(moduloOrigen.getnombre());}
			if(conDefault || (!conDefault && moduloOrigen.getid_tipo_tecla_mascara()!=null && !moduloOrigen.getid_tipo_tecla_mascara().equals(-1L))) {modulo.setid_tipo_tecla_mascara(moduloOrigen.getid_tipo_tecla_mascara());}
			if(conDefault || (!conDefault && moduloOrigen.gettecla()!=null && !moduloOrigen.gettecla().equals(""))) {modulo.settecla(moduloOrigen.gettecla());}
			if(conDefault || (!conDefault && moduloOrigen.getestado()!=null && !moduloOrigen.getestado().equals(false))) {modulo.setestado(moduloOrigen.getestado());}
			if(conDefault || (!conDefault && moduloOrigen.getorden()!=null && !moduloOrigen.getorden().equals(0))) {modulo.setorden(moduloOrigen.getorden());}
			if(conDefault || (!conDefault && moduloOrigen.getdescripcion()!=null && !moduloOrigen.getdescripcion().equals(""))) {modulo.setdescripcion(moduloOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioModulo(Modulo modulo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormModulo.jTextFieldidModulo.setText(modulo.getId().toString());
			this.jInternalFrameDetalleFormModulo.jTextFieldcodigoModulo.setText(modulo.getcodigo());
			this.jInternalFrameDetalleFormModulo.jTextAreanombreModulo.setText(modulo.getnombre());
			this.jInternalFrameDetalleFormModulo.jTextFieldteclaModulo.setText(modulo.gettecla());
			this.jInternalFrameDetalleFormModulo.jCheckBoxestadoModulo.setSelected(modulo.getestado());
			this.jInternalFrameDetalleFormModulo.jTextFieldordenModulo.setText(modulo.getorden().toString());
			this.jInternalFrameDetalleFormModulo.jTextAreadescripcionModulo.setText(modulo.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioModulo(ModuloBean moduloBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormModulo.jTextFieldidModulo.setText(moduloBean.getId().toString());
			this.jInternalFrameDetalleFormModulo.jTextFieldcodigoModulo.setText(moduloBean.getcodigo());
			this.jInternalFrameDetalleFormModulo.jTextAreanombreModulo.setText(moduloBean.getnombre());
			this.jInternalFrameDetalleFormModulo.jTextFieldteclaModulo.setText(moduloBean.gettecla());
			this.jInternalFrameDetalleFormModulo.jCheckBoxestadoModulo.setSelected(moduloBean.getestado());
			this.jInternalFrameDetalleFormModulo.jTextFieldordenModulo.setText(moduloBean.getorden().toString());
			this.jInternalFrameDetalleFormModulo.jTextAreadescripcionModulo.setText(moduloBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanModulo(ModuloParameterReturnGeneral moduloReturnGeneral,ModuloBean moduloBean,Boolean conDefault) throws Exception { 
		try {
			Modulo moduloLocal=new Modulo();
			
			moduloLocal=moduloReturnGeneral.getModulo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && moduloLocal.getId()!=null && !moduloLocal.getId().equals(0L))) {moduloBean.setId(moduloLocal.getId());}}
			if(conDefault || (!conDefault && moduloLocal.getid_sistema()!=null && !moduloLocal.getid_sistema().equals(-1L))) {moduloBean.setid_sistema(moduloLocal.getid_sistema());}
			if(conDefault || (!conDefault && moduloLocal.getid_paquete()!=null && !moduloLocal.getid_paquete().equals(-1L))) {moduloBean.setid_paquete(moduloLocal.getid_paquete());}
			if(conDefault || (!conDefault && moduloLocal.getcodigo()!=null && !moduloLocal.getcodigo().equals(""))) {moduloBean.setcodigo(moduloLocal.getcodigo());}
			if(conDefault || (!conDefault && moduloLocal.getnombre()!=null && !moduloLocal.getnombre().equals(""))) {moduloBean.setnombre(moduloLocal.getnombre());}
			if(conDefault || (!conDefault && moduloLocal.getid_tipo_tecla_mascara()!=null && !moduloLocal.getid_tipo_tecla_mascara().equals(-1L))) {moduloBean.setid_tipo_tecla_mascara(moduloLocal.getid_tipo_tecla_mascara());}
			if(conDefault || (!conDefault && moduloLocal.gettecla()!=null && !moduloLocal.gettecla().equals(""))) {moduloBean.settecla(moduloLocal.gettecla());}
			if(conDefault || (!conDefault && moduloLocal.getestado()!=null && !moduloLocal.getestado().equals(false))) {moduloBean.setestado(moduloLocal.getestado());}
			if(conDefault || (!conDefault && moduloLocal.getorden()!=null && !moduloLocal.getorden().equals(0))) {moduloBean.setorden(moduloLocal.getorden());}
			if(conDefault || (!conDefault && moduloLocal.getdescripcion()!=null && !moduloLocal.getdescripcion().equals(""))) {moduloBean.setdescripcion(moduloLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxModuloGenerico(Long idModuloSeleccionado,JComboBox jComboBoxModulo,List<Modulo> modulosLocal)throws Exception {
		try {
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosLocal) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			jComboBoxModulo.setSelectedItem(moduloTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxModuloGenerico(JComboBox jComboBoxModulo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxModulo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxModulo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxModulo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxModulo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			modulo=(Modulo) moduloLogic.getModulos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			modulo =(Modulo) modulos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Sistema")) {
			//sDescripcion=this.getActualSistemaForeignKeyDescripcion((Long)value);
			if(!modulo.getIsNew() && !modulo.getIsChanged() && !modulo.getIsDeleted()) {
				sDescripcion=modulo.getsistema_descripcion();
			} else {
				//sDescripcion=this.getActualSistemaForeignKeyDescripcion((Long)value);
				sDescripcion=modulo.getsistema_descripcion();
			}
		}

		if(sTipo.equals("Paquete")) {
			//sDescripcion=this.getActualPaqueteForeignKeyDescripcion((Long)value);
			if(!modulo.getIsNew() && !modulo.getIsChanged() && !modulo.getIsDeleted()) {
				sDescripcion=modulo.getpaquete_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=modulo.getpaquete_descripcion();
			}
		}

		if(sTipo.equals("TipoTeclaMascara")) {
			//sDescripcion=this.getActualTipoTeclaMascaraForeignKeyDescripcion((Long)value);
			if(!modulo.getIsNew() && !modulo.getIsChanged() && !modulo.getIsDeleted()) {
				sDescripcion=modulo.gettipoteclamascara_descripcion();
			} else {
				//sDescripcion=this.getActualTipoTeclaMascaraForeignKeyDescripcion((Long)value);
				sDescripcion=modulo.gettipoteclamascara_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Modulo moduloRow=new Modulo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			moduloRow=(Modulo) moduloLogic.getModulos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			moduloRow=(Modulo) modulos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualModulo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoModulo.setVisible((this.isVisibilidadCeldaNuevoModulo && this.isPermisoNuevoModulo));			
			this.jButtonDuplicarModulo.setVisible((this.isVisibilidadCeldaDuplicarModulo && this.isPermisoDuplicarModulo));			
			this.jButtonCopiarModulo.setVisible((this.isVisibilidadCeldaCopiarModulo && this.isPermisoCopiarModulo));
			this.jButtonVerFormModulo.setVisible((this.isVisibilidadCeldaVerFormModulo && this.isPermisoVerFormModulo));
			
			this.jButtonAbrirOrderByModulo.setVisible((this.isVisibilidadCeldaOrdenModulo && this.isPermisoOrdenModulo));			
			
			this.jButtonNuevoRelacionesModulo.setVisible((this.isVisibilidadCeldaNuevoRelacionesModulo && this.isPermisoNuevoModulo));			
			this.jButtonNuevoGuardarCambiosModulo.setVisible((this.isVisibilidadCeldaNuevoModulo && this.isPermisoNuevoModulo && this.isPermisoGuardarCambiosModulo));
			
			if(this.jInternalFrameDetalleFormModulo!=null) {
			this.jInternalFrameDetalleFormModulo.jButtonModificarModulo.setVisible((this.isVisibilidadCeldaModificarModulo && this.isPermisoActualizarModulo));	
			this.jInternalFrameDetalleFormModulo.jButtonActualizarModulo.setVisible((this.isVisibilidadCeldaActualizarModulo && this.isPermisoActualizarModulo));	
			this.jInternalFrameDetalleFormModulo.jButtonEliminarModulo.setVisible((this.isVisibilidadCeldaEliminarModulo && this.isPermisoEliminarModulo));
			this.jInternalFrameDetalleFormModulo.jButtonCancelarModulo.setVisible(this.isVisibilidadCeldaCancelarModulo);							
			this.jInternalFrameDetalleFormModulo.jButtonGuardarCambiosModulo.setVisible((this.isVisibilidadCeldaGuardarModulo && this.isPermisoGuardarCambiosModulo));			
			
			}
						
			this.jButtonGuardarCambiosTablaModulo.setVisible((this.isVisibilidadCeldaGuardarCambiosModulo && this.isPermisoGuardarCambiosModulo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarModulo.setVisible((this.isVisibilidadCeldaNuevoModulo && this.isPermisoNuevoModulo));						
			this.jButtonDuplicarToolBarModulo.setVisible((this.isVisibilidadCeldaDuplicarModulo && this.isPermisoDuplicarModulo));						
			this.jButtonCopiarToolBarModulo.setVisible((this.isVisibilidadCeldaCopiarModulo && this.isPermisoCopiarModulo));			
			this.jButtonVerFormToolBarModulo.setVisible((this.isVisibilidadCeldaVerFormModulo && this.isPermisoVerFormModulo));			
			this.jButtonAbrirOrderByToolBarModulo.setVisible((this.isVisibilidadCeldaOrdenModulo && this.isPermisoOrdenModulo));
			this.jButtonNuevoRelacionesToolBarModulo.setVisible((this.isVisibilidadCeldaNuevoRelacionesModulo && this.isPermisoNuevoModulo));			
			this.jButtonNuevoGuardarCambiosToolBarModulo.setVisible((this.isVisibilidadCeldaNuevoModulo && this.isPermisoNuevoModulo && this.isPermisoGuardarCambiosModulo));			
			
			if(this.jInternalFrameDetalleFormModulo!=null) {
			this.jInternalFrameDetalleFormModulo.jButtonModificarToolBarModulo.setVisible((this.isVisibilidadCeldaModificarModulo && this.isPermisoActualizarModulo));	
			this.jInternalFrameDetalleFormModulo.jButtonActualizarToolBarModulo.setVisible((this.isVisibilidadCeldaActualizarModulo  && this.isPermisoActualizarModulo));	
			this.jInternalFrameDetalleFormModulo.jButtonEliminarToolBarModulo.setVisible((this.isVisibilidadCeldaEliminarModulo && this.isPermisoEliminarModulo));
			this.jInternalFrameDetalleFormModulo.jButtonCancelarToolBarModulo.setVisible(this.isVisibilidadCeldaCancelarModulo);				
			this.jInternalFrameDetalleFormModulo.jButtonGuardarCambiosToolBarModulo.setVisible((this.isVisibilidadCeldaGuardarModulo && this.isPermisoGuardarCambiosModulo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarModulo.setVisible((this.isVisibilidadCeldaGuardarCambiosModulo && this.isPermisoGuardarCambiosModulo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoModulo.setVisible((this.isVisibilidadCeldaNuevoModulo && this.isPermisoNuevoModulo));			
			this.jMenuItemDuplicarModulo.setVisible((this.isVisibilidadCeldaDuplicarModulo && this.isPermisoDuplicarModulo));			
			this.jMenuItemCopiarModulo.setVisible((this.isVisibilidadCeldaCopiarModulo && this.isPermisoCopiarModulo));			
			this.jMenuItemVerFormModulo.setVisible((this.isVisibilidadCeldaVerFormModulo && this.isPermisoVerFormModulo));			
			this.jMenuItemAbrirOrderByModulo.setVisible((this.isVisibilidadCeldaOrdenModulo && this.isPermisoOrdenModulo));			
			//this.jMenuItemMostrarOcultarModulo.setVisible((this.isVisibilidadCeldaOrdenModulo && this.isPermisoOrdenModulo));
			this.jMenuItemDetalleAbrirOrderByModulo.setVisible((this.isVisibilidadCeldaOrdenModulo && this.isPermisoOrdenModulo));			
			//this.jMenuItemDetalleMostrarOcultarModulo.setVisible((this.isVisibilidadCeldaOrdenModulo && this.isPermisoOrdenModulo));			
			this.jMenuItemNuevoRelacionesModulo.setVisible((this.isVisibilidadCeldaNuevoRelacionesModulo && this.isPermisoNuevoModulo));			
			this.jMenuItemNuevoGuardarCambiosModulo.setVisible((this.isVisibilidadCeldaNuevoModulo && this.isPermisoNuevoModulo && this.isPermisoGuardarCambiosModulo));									
			
			if(this.jInternalFrameDetalleFormModulo!=null) {
			this.jInternalFrameDetalleFormModulo.jMenuItemModificarModulo.setVisible((this.isVisibilidadCeldaModificarModulo && this.isPermisoActualizarModulo));	
			this.jInternalFrameDetalleFormModulo.jMenuItemActualizarModulo.setVisible((this.isVisibilidadCeldaActualizarModulo && this.isPermisoActualizarModulo));	
			this.jInternalFrameDetalleFormModulo.jMenuItemEliminarModulo.setVisible((this.isVisibilidadCeldaEliminarModulo && this.isPermisoEliminarModulo));
			this.jInternalFrameDetalleFormModulo.jMenuItemCancelarModulo.setVisible(this.isVisibilidadCeldaCancelarModulo);				
			}
			
			this.jMenuItemGuardarCambiosModulo.setVisible((this.isVisibilidadCeldaGuardarModulo && this.isPermisoGuardarCambiosModulo));						
			this.jMenuItemGuardarCambiosTablaModulo.setVisible((this.isVisibilidadCeldaGuardarCambiosModulo && this.isPermisoGuardarCambiosModulo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoModulo=this.jButtonNuevoModulo.isVisible();
			this.isVisibilidadCeldaDuplicarModulo=this.jButtonDuplicarModulo.isVisible();
			this.isVisibilidadCeldaCopiarModulo=this.jButtonCopiarModulo.isVisible();
			this.isVisibilidadCeldaVerFormModulo=this.jButtonVerFormModulo.isVisible();
			
			this.isVisibilidadCeldaOrdenModulo=this.jButtonAbrirOrderByModulo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesModulo=this.jButtonNuevoRelacionesModulo.isVisible();
			this.isVisibilidadCeldaModificarModulo=this.jButtonModificarModulo.isVisible();
			
			if(this.jInternalFrameDetalleFormModulo!=null) {
			this.isVisibilidadCeldaActualizarModulo=this.jInternalFrameDetalleFormModulo.jButtonActualizarModulo.isVisible();
			this.isVisibilidadCeldaEliminarModulo=this.jInternalFrameDetalleFormModulo.jButtonEliminarModulo.isVisible();
			this.isVisibilidadCeldaCancelarModulo=this.jInternalFrameDetalleFormModulo.jButtonCancelarModulo.isVisible();
			this.isVisibilidadCeldaGuardarModulo=this.jInternalFrameDetalleFormModulo.jButtonGuardarCambiosModulo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosModulo=this.jButtonGuardarCambiosTablaModulo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoModulo=this.jButtonNuevoToolBarModulo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesModulo=this.jButtonNuevoRelacionesToolBarModulo.isVisible();
			
			if(this.jInternalFrameDetalleFormModulo!=null) {
			this.isVisibilidadCeldaModificarModulo=this.jInternalFrameDetalleFormModulo.jButtonModificarToolBarModulo.isVisible();
			this.isVisibilidadCeldaActualizarModulo=this.jInternalFrameDetalleFormModulo.jButtonActualizarToolBarModulo.isVisible();
			this.isVisibilidadCeldaEliminarModulo=this.jInternalFrameDetalleFormModulo.jButtonEliminarToolBarModulo.isVisible();
			this.isVisibilidadCeldaCancelarModulo=this.jInternalFrameDetalleFormModulo.jButtonCancelarToolBarModulo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarModulo=this.jButtonGuardarCambiosToolBarModulo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosModulo=this.jButtonGuardarCambiosTablaToolBarModulo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoModulo=this.jMenuItemNuevoModulo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesModulo=this.jMenuItemNuevoRelacionesModulo.isVisible();
			
			if(this.jInternalFrameDetalleFormModulo!=null) {
			this.isVisibilidadCeldaModificarModulo=this.jInternalFrameDetalleFormModulo.jMenuItemModificarModulo.isVisible();
			this.isVisibilidadCeldaActualizarModulo=this.jInternalFrameDetalleFormModulo.jMenuItemActualizarModulo.isVisible();
			this.isVisibilidadCeldaEliminarModulo=this.jInternalFrameDetalleFormModulo.jMenuItemEliminarModulo.isVisible();
			this.isVisibilidadCeldaCancelarModulo=this.jInternalFrameDetalleFormModulo.jMenuItemCancelarModulo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarModulo=this.jMenuItemGuardarCambiosModulo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosModulo=this.jMenuItemGuardarCambiosTablaModulo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesModulo(Boolean esInicializar) {
		if(ModuloJInternalFrame.ISBINDING_MANUAL) {			
			if(this.moduloSessionBean.getConGuardarRelaciones()) {
				//if(this.moduloSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesModulo();
			}
			
			this.inicializarActualizarBindingBotonesManualModulo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualModulo() {
		this.jButtonNuevoModulo.setVisible(this.isPermisoNuevoModulo);			
		this.jButtonDuplicarModulo.setVisible(this.isPermisoDuplicarModulo);			
		this.jButtonCopiarModulo.setVisible(this.isPermisoCopiarModulo);			
		this.jButtonVerFormModulo.setVisible(this.isPermisoVerFormModulo);			
		
		this.jButtonAbrirOrderByModulo.setVisible(this.isPermisoOrdenModulo);					
		
		this.jButtonNuevoRelacionesModulo.setVisible(this.isPermisoNuevoModulo);			
		
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModulo.jButtonModificarModulo.setVisible(this.isPermisoActualizarModulo);	
			this.jInternalFrameDetalleFormModulo.jButtonActualizarModulo.setVisible(this.isPermisoActualizarModulo);	
			this.jInternalFrameDetalleFormModulo.jButtonEliminarModulo.setVisible(this.isPermisoEliminarModulo);
			this.jInternalFrameDetalleFormModulo.jButtonCancelarModulo.setVisible(this.isVisibilidadCeldaCancelarModulo);						
			this.jInternalFrameDetalleFormModulo.jButtonGuardarCambiosModulo.setVisible(this.isPermisoGuardarCambiosModulo);							
		}
		
		this.jButtonGuardarCambiosTablaModulo.setVisible(this.isPermisoActualizarModulo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleModulo() {
		this.jInternalFrameDetalleFormModulo.jButtonModificarModulo.setVisible(this.isPermisoActualizarModulo);	
		this.jInternalFrameDetalleFormModulo.jButtonActualizarModulo.setVisible(this.isPermisoActualizarModulo);	
		this.jInternalFrameDetalleFormModulo.jButtonEliminarModulo.setVisible(this.isPermisoEliminarModulo);
		this.jInternalFrameDetalleFormModulo.jButtonCancelarModulo.setVisible(this.isVisibilidadCeldaCancelarModulo);							
		this.jInternalFrameDetalleFormModulo.jButtonGuardarCambiosModulo.setVisible((this.isVisibilidadCeldaGuardarModulo && this.isPermisoGuardarCambiosModulo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosModulo() {
		if(ModuloJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualModulo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesModulo() {
	}
	
	public void jTableDatosModuloListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarModulo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModulo(this.getmodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modulo==null) {
						this.modulo = new Modulo();
					}

					this.setVariablesFormularioToObjetoActualModulo(this.modulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
				}

				if(this.modulo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.modulo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sistemaModuloUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosistema=true;

			idTienePermisosistema=this.tienePermisosUsuarioEnPaginaWebModulo(SistemaConstantesFunciones.CLASSNAME);

			if(idTienePermisosistema) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModulo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosModulo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosModulo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualModulo(this.getmodulo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);

				this.sistemaBeanSwingJInternalFrame=new SistemaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sistemaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sistemaBeanSwingJInternalFrame.getSistemaLogic().setConnexion(this.moduloLogic.getConnexion());

				if(this.modulo.getid_sistema()!=null) {
					this.sistemaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sistemaBeanSwingJInternalFrame.setIdActual(this.modulo.getid_sistema());
					this.sistemaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sistemaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sistemaBeanSwingJInternalFrame.inicializarActualizarBindingTablaSistema();
				}

				JInternalFrameBase jinternalFrame =this.sistemaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderModulo=(TitledBorder)this.jScrollPanelDatosModulo.getBorder();
				TitledBorder titledBordersistema=(TitledBorder)this.sistemaBeanSwingJInternalFrame.jScrollPanelDatosSistema.getBorder();

				titledBordersistema.setTitle(titledBorderModulo.getTitle() + " -> Sistema");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sistemaModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModulo(this.getmodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modulo==null) {
						this.modulo = new Modulo();
					}

					this.setVariablesFormularioToObjetoActualModulo(this.modulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
				}

				if(this.modulo.getid_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sistema = "+this.modulo.getid_sistema().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paqueteModuloUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopaquete=true;

			idTienePermisopaquete=this.tienePermisosUsuarioEnPaginaWebModulo(PaqueteConstantesFunciones.CLASSNAME);

			if(idTienePermisopaquete) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModulo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosModulo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosModulo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualModulo(this.getmodulo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);

				this.paqueteBeanSwingJInternalFrame=new PaqueteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paqueteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paqueteBeanSwingJInternalFrame.getPaqueteLogic().setConnexion(this.moduloLogic.getConnexion());

				if(this.modulo.getid_paquete()!=null) {
					this.paqueteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paqueteBeanSwingJInternalFrame.setIdActual(this.modulo.getid_paquete());
					this.paqueteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paqueteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paqueteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPaquete();
				}

				JInternalFrameBase jinternalFrame =this.paqueteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderModulo=(TitledBorder)this.jScrollPanelDatosModulo.getBorder();
				TitledBorder titledBorderpaquete=(TitledBorder)this.paqueteBeanSwingJInternalFrame.jScrollPanelDatosPaquete.getBorder();

				titledBorderpaquete.setTitle(titledBorderModulo.getTitle() + " -> Paquete");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paqueteModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModulo(this.getmodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modulo==null) {
						this.modulo = new Modulo();
					}

					this.setVariablesFormularioToObjetoActualModulo(this.modulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
				}

				if(this.modulo.getid_paquete()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_paquete = "+this.modulo.getid_paquete().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModulo(this.getmodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modulo==null) {
						this.modulo = new Modulo();
					}

					this.setVariablesFormularioToObjetoActualModulo(this.modulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
				}

				if(this.modulo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.modulo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModulo(this.getmodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modulo==null) {
						this.modulo = new Modulo();
					}

					this.setVariablesFormularioToObjetoActualModulo(this.modulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
				}

				if(this.modulo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.modulo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_tecla_mascaraModuloUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoteclamascara=true;

			idTienePermisotipoteclamascara=this.tienePermisosUsuarioEnPaginaWebModulo(TipoTeclaMascaraConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoteclamascara) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModulo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosModulo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosModulo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualModulo(this.getmodulo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);

				this.tipoteclamascaraBeanSwingJInternalFrame=new TipoTeclaMascaraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoteclamascaraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoteclamascaraBeanSwingJInternalFrame.getTipoTeclaMascaraLogic().setConnexion(this.moduloLogic.getConnexion());

				if(this.modulo.getid_tipo_tecla_mascara()!=null) {
					this.tipoteclamascaraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoteclamascaraBeanSwingJInternalFrame.setIdActual(this.modulo.getid_tipo_tecla_mascara());
					this.tipoteclamascaraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoteclamascaraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoteclamascaraBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoTeclaMascara();
				}

				JInternalFrameBase jinternalFrame =this.tipoteclamascaraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderModulo=(TitledBorder)this.jScrollPanelDatosModulo.getBorder();
				TitledBorder titledBordertipoteclamascara=(TitledBorder)this.tipoteclamascaraBeanSwingJInternalFrame.jScrollPanelDatosTipoTeclaMascara.getBorder();

				titledBordertipoteclamascara.setTitle(titledBorderModulo.getTitle() + " -> Tipo Tecla Mascara");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_tecla_mascaraModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModulo(this.getmodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modulo==null) {
						this.modulo = new Modulo();
					}

					this.setVariablesFormularioToObjetoActualModulo(this.modulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
				}

				if(this.modulo.getid_tipo_tecla_mascara()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_tecla_mascara = "+this.modulo.getid_tipo_tecla_mascara().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonteclaModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModulo(this.getmodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modulo==null) {
						this.modulo = new Modulo();
					}

					this.setVariablesFormularioToObjetoActualModulo(this.modulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
				}

				if(this.modulo.gettecla()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tecla like '%"+this.modulo.gettecla()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModulo(this.getmodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modulo==null) {
						this.modulo = new Modulo();
					}

					this.setVariablesFormularioToObjetoActualModulo(this.modulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
				}

				if(this.modulo.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.modulo.getestado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonordenModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModulo(this.getmodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modulo==null) {
						this.modulo = new Modulo();
					}

					this.setVariablesFormularioToObjetoActualModulo(this.modulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
				}

				if(this.modulo.getorden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden = "+this.modulo.getorden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModulo(this.getmodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modulo==null) {
						this.modulo = new Modulo();
					}

					this.setVariablesFormularioToObjetoActualModulo(this.modulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);
				}

				if(this.modulo.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.modulo.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdSistemaPorNombreModuloActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModulo(false,false);

			this.getModulosBusquedaPorIdSistemaPorNombre();

			this.inicializarActualizarBindingModulo(false);

			//if(ModuloBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModulo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaqueteModuloActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModulo(false,false);

			this.getModulosFK_IdPaquete();

			this.inicializarActualizarBindingModulo(false);

			//if(ModuloBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModulo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSistemaModuloActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModulo(false,false);

			this.getModulosFK_IdSistema();

			this.inicializarActualizarBindingModulo(false);

			//if(ModuloBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModulo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoTeclaMascaraModuloActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModulo(false,false);

			this.getModulosFK_IdTipoTeclaMascara();

			this.inicializarActualizarBindingModulo(false);

			//if(ModuloBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModulo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.moduloLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameModulo() {
		if(this.jInternalFrameDetalleFormModulo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormModulo!=null) {
			this.jInternalFrameDetalleFormModulo.setVisible(false);	    			
			this.jInternalFrameDetalleFormModulo.dispose();
			this.jInternalFrameDetalleFormModulo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoModulo!=null) {
			this.jInternalFrameReporteDinamicoModulo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoModulo.dispose();
			this.jInternalFrameReporteDinamicoModulo=null;
		}
		
		if(this.jInternalFrameImportacionModulo!=null) {
			this.jInternalFrameImportacionModulo.setVisible(false);	    			
			this.jInternalFrameImportacionModulo.dispose();
			this.jInternalFrameImportacionModulo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessModulo();
			
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			
			
			if(sTipo.equals("NuevoModulo")) {
				jButtonNuevoModuloActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarModulo")) {
				jButtonDuplicarModuloActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarModulo")) {
				jButtonCopiarModuloActionPerformed(evt);
			} else if(sTipo.equals("VerFormModulo")) {
				jButtonVerFormModuloActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarModulo")) {
				jButtonNuevoModuloActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarModulo")) {
				jButtonDuplicarModuloActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoModulo")) {
				jButtonNuevoModuloActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarModulo")) {
				jButtonDuplicarModuloActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesModulo")) {
				jButtonNuevoModuloActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarModulo")) {
				jButtonNuevoModuloActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesModulo")) {
				jButtonNuevoModuloActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarModulo")) {
				jButtonModificarModuloActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarModulo")) {
				jButtonModificarModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarModulo")) {
				jButtonModificarModuloActionPerformed(evt);
			} else if(sTipo.equals("ActualizarModulo")) {
				jButtonActualizarModuloActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarModulo")) {
				jButtonActualizarModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarModulo")) {
				jButtonActualizarModuloActionPerformed(evt);
			} else if(sTipo.equals("EliminarModulo")) {
				jButtonEliminarModuloActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarModulo")) {
				jButtonEliminarModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarModulo")) {
				jButtonEliminarModuloActionPerformed(evt);
			} else if(sTipo.equals("CancelarModulo")) {
				jButtonCancelarModuloActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarModulo")) {
				jButtonCancelarModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarModulo")) {
				jButtonCancelarModuloActionPerformed(evt);
			} else if(sTipo.equals("CerrarModulo")) {
				jButtonCerrarModuloActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarModulo")) {
				jButtonCerrarModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarModulo")) {
				jButtonCerrarModuloActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarModulo")) {
				jButtonMostrarOcultarModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarModulo")) {
				jButtonCancelarModuloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosModulo")) {
				jButtonGuardarCambiosModuloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarModulo")) {
				jButtonGuardarCambiosModuloActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarModulo")) {
				jButtonCopiarModuloActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarModulo")) {
				jButtonVerFormModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosModulo")) {
				jButtonGuardarCambiosModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarModulo")) {
				jButtonCopiarModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormModulo")) {
				jButtonVerFormModuloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaModulo")) {
				jButtonGuardarCambiosModuloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarModulo")) {
				jButtonGuardarCambiosModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaModulo")) {
				jButtonGuardarCambiosModuloActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionModulo")) {
				jButtonRecargarInformacionModuloActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarModulo")) {
				jButtonRecargarInformacionModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionModulo")) {
				jButtonRecargarInformacionModuloActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresModulo")) {
				jButtonAnterioresModuloActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarModulo")) {
				jButtonAnterioresModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreModulo")) {
				jButtonAnterioresModuloActionPerformed(evt);
			} else if(sTipo.equals("SiguientesModulo")) {
				jButtonSiguientesModuloActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarModulo")) {
				jButtonSiguientesModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesModulo")) {
				jButtonSiguientesModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByModulo") || sTipo.equals("MenuItemDetalleAbrirOrderByModulo")) {
				jButtonAbrirOrderByModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarModulo") || sTipo.equals("MenuItemDetalleMostrarOcultarModulo")) {
				jButtonMostrarOcultarModuloActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosModulo")) {
				jButtonNuevoGuardarCambiosModuloActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarModulo")) {
				jButtonNuevoGuardarCambiosModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosModulo")) {
				jButtonNuevoGuardarCambiosModuloActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoModulo")) {
				jButtonCerrarReporteDinamicoModuloActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoModulo")) {
				jButtonGenerarReporteDinamicoModuloActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoModulo")) {
				
				jButtonGenerarExcelReporteDinamicoModuloActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionModulo")) {
				jButtonCerrarImportacionModuloActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionModulo")) {
				
				jButtonGenerarImportacionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionModulo")) {
				
				jButtonAbrirImportacionModuloActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesModulo")) {
				jComboBoxTiposAccionesModuloActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesModulo")) {
				jComboBoxTiposRelacionesModuloActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioModulo")) {
				jComboBoxTiposAccionesModuloActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarModulo")) {
				
				jComboBoxTiposSeleccionarModuloActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralModulo")) {
				jTextFieldValorCampoGeneralModuloActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByModulo")) {
				jButtonAbrirOrderByModuloActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarModulo")) {
				jButtonAbrirOrderByModuloActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByModulo")) {
				jButtonCerrarOrderByModuloActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idModuloBusqueda")) {
				this.jButtonidModuloBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sistemaModuloUpdate")) {
				this.jButtonid_sistemaModuloUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sistemaModuloBusqueda")) {
				this.jButtonid_sistemaModuloBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paqueteModuloUpdate")) {
				this.jButtonid_paqueteModuloUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paqueteModuloBusqueda")) {
				this.jButtonid_paqueteModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoModuloBusqueda")) {
				this.jButtoncodigoModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreModuloBusqueda")) {
				this.jButtonnombreModuloBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_tecla_mascaraModuloUpdate")) {
				this.jButtonid_tipo_tecla_mascaraModuloUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_tecla_mascaraModuloBusqueda")) {
				this.jButtonid_tipo_tecla_mascaraModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("teclaModuloBusqueda")) {
				this.jButtonteclaModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoModuloBusqueda")) {
				this.jButtonestadoModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenModuloBusqueda")) {
				this.jButtonordenModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionModuloBusqueda")) {
				this.jButtondescripcionModuloBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdSistemaPorNombreModulo")) {
				this.jButtonBusquedaPorIdSistemaPorNombreModuloActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdSistemaModulo")) {
				this.jButtonFK_IdSistemaModuloActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoTeclaMascaraModulo")) {
				this.jButtonFK_IdTipoTeclaMascaraModuloActionPerformed(evt);
			}
			
			;
			
			
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessModulo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModuloActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modulo);
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
				


				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Modulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Modulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Modulo moduloLocal=null;
			
			if(!this.getEsControlTabla()) {
				moduloLocal=this.modulo;
			} else {
				moduloLocal=this.moduloAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modulo);
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
							
				
				


				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Modulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Modulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloAnterior =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.moduloAnterior =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
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
			
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			
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
			
			


			
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModuloActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modulo);
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
								
						
				


				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Modulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Modulo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modulo);
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
								
				
				


				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Modulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Modulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloAnterior =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.moduloAnterior =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modulo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloAnterior =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.moduloAnterior =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModuloActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.modulo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modulo);
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
							
				
				


				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Modulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Modulo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModuloActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosModulo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.moduloAnterior =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.moduloAnterior =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
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
			
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			
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
			
			


			
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModuloActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.modulo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modulo);
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
								
				
				


				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Modulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Modulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloAnterior =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.moduloAnterior =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModuloActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.modulo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModuloActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modulo);
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosModulo")) {
					jCheckBoxSeleccionarTodosModuloItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosModulo")) {
					jCheckBoxSeleccionadosModuloItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarModulo")) {
					
				}
				
				


				
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Modulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Modulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.modulo);
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
												
				
				


				
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Modulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Modulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModuloActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosModulo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.moduloAnterior =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.moduloAnterior =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModuloActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modulo);
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
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
			
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
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
			
			


			if(sTipo.equals("id_sistemaModulo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo;
				}

				if(this.moduloSessionBean.getConGuardarRelaciones()) {
					//classes=ModuloConstantesFunciones.getClassesRelationshipsOfModulo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeySistema(jComboBoxGenerico,"Formulario");

				this.recargarFormModulo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo,"BusquedaPorIdSistemaPorNombre");
				//recargarFormModuloSistema(jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo,"BusquedaPorIdSistemaPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaFK_IdSistemaModulo")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaFK_IdSistemaModulo,"FK_IdSistema");
				//recargarFormModuloSistema(jComboBoxid_sistemaFK_IdSistemaModulo,"FK_IdSistema");
			}
			
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModuloActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modulo);
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_sistemaModulo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo;
				}

				if(this.moduloSessionBean.getConGuardarRelaciones()) {
					//classes=ModuloConstantesFunciones.getClassesRelationshipsOfModulo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeySistema(jComboBoxGenerico,"Formulario");

				this.recargarFormModulo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo,"BusquedaPorIdSistemaPorNombre");
				//recargarFormModuloSistema(jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo,"BusquedaPorIdSistemaPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaFK_IdSistemaModulo")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaFK_IdSistemaModulo,"FK_IdSistema");
				//recargarFormModuloSistema(jComboBoxid_sistemaFK_IdSistemaModulo,"FK_IdSistema");
			}
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Modulo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Modulo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modulo);
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
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
				
				


			if(sTipo.equals("id_sistemaModulo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo;
				}

				if(this.moduloSessionBean.getConGuardarRelaciones()) {
					//classes=ModuloConstantesFunciones.getClassesRelationshipsOfModulo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeySistema(jComboBoxGenerico,"Formulario");

				this.recargarFormModulo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo,"BusquedaPorIdSistemaPorNombre");
				//recargarFormModuloSistema(jComboBoxid_sistemaBusquedaPorIdSistemaPorNombreModulo,"BusquedaPorIdSistemaPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaFK_IdSistemaModulo")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaFK_IdSistemaModulo,"FK_IdSistema");
				//recargarFormModuloSistema(jComboBoxid_sistemaFK_IdSistemaModulo,"FK_IdSistema");
			}
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Modulo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Modulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.moduloAnterior =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.moduloAnterior =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarModulo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosModuloListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosModulo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.modulo =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.modulo =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.modulo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarModulo")) {
				
				}
				
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarModulo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosModulo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarModulo")) {
			
			}
			
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessModulo();
			
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			
			if(sTipo.equals("NuevoModulo")) {
				jButtonNuevoModuloActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarModulo")) {
				jButtonDuplicarModuloActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarModulo")) {
				jButtonCopiarModuloActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormModulo")) {
				jButtonVerFormModuloActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesModulo")) {
				jButtonNuevoModuloActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarModulo")) {
				jButtonModificarModuloActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarModulo")) {
				jButtonActualizarModuloActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarModulo")) {
				jButtonEliminarModuloActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaModulo")) {
				jButtonGuardarCambiosModuloActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarModulo")) {
				jButtonCancelarModuloActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarModulo")) {
				jButtonCerrarModuloActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosModulo")) {
				jButtonGuardarCambiosModuloActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosModulo")) {
				jButtonNuevoGuardarCambiosModuloActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByModulo")) {
				jButtonAbrirOrderByModuloActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionModulo")) {
				jButtonRecargarInformacionModuloActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresModulo")) {
				jButtonAnterioresModuloActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesModulo")) {
				jButtonSiguientesModuloActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idModuloBusqueda")) {
				this.jButtonidModuloBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sistemaModuloUpdate")) {
				this.jButtonid_sistemaModuloUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sistemaModuloBusqueda")) {
				this.jButtonid_sistemaModuloBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paqueteModuloUpdate")) {
				this.jButtonid_paqueteModuloUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paqueteModuloBusqueda")) {
				this.jButtonid_paqueteModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoModuloBusqueda")) {
				this.jButtoncodigoModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreModuloBusqueda")) {
				this.jButtonnombreModuloBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_tecla_mascaraModuloUpdate")) {
				this.jButtonid_tipo_tecla_mascaraModuloUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_tecla_mascaraModuloBusqueda")) {
				this.jButtonid_tipo_tecla_mascaraModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("teclaModuloBusqueda")) {
				this.jButtonteclaModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoModuloBusqueda")) {
				this.jButtonestadoModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenModuloBusqueda")) {
				this.jButtonordenModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionModuloBusqueda")) {
				this.jButtondescripcionModuloBusquedaActionPerformed(evt);
			}
			
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessModulo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameModulo")) {
				closingInternalFrameModulo();
				
			} else if(sTipo.equals("jButtonCancelarModulo")) {
				JInternalFrameBase jInternalFrameDetalleFormModulo = (JInternalFrameBase)evt.getSource();
	            	
	            ModuloBeanSwingJInternalFrame jInternalFrameParent=(ModuloBeanSwingJInternalFrame)jInternalFrameDetalleFormModulo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarModuloActionPerformed(null);
			}
			
			ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.modulo,new Object(),this.moduloParameterGeneral,this.moduloReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormModulo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormModulo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormModulo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.modulo)) {
			if(!esControlTabla) {
				if(ModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualModulo(this.modulo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);			
				}
				
				if(this.moduloSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualModulo(this.modulo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.moduloReturnGeneral=moduloLogic.procesarEventosModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.moduloLogic.getModulos(),this.modulo,this.moduloParameterGeneral,this.isEsNuevoModulo,classes);//this.moduloLogic.getModulo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanModulo(this.moduloReturnGeneral,this.moduloBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.moduloSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanModulo(classes,this.moduloReturnGeneral,this.moduloBean,false);
					}
						
					if(this.moduloReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyModulo(this.moduloReturnGeneral.getModulo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioModulo(this.moduloReturnGeneral.getModulo());	
					}
						
					if(this.moduloReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioModulo(this.moduloReturnGeneral.getModulo(),classes);//this.moduloBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioModulo(this.modulo,classes);//this.moduloBean);									
				}
			
				if(ModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualModulo(this.modulo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysModulo(this.modulo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.moduloAnterior!=null) {
						this.modulo=this.moduloAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.moduloReturnGeneral=moduloLogic.procesarEventosModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.moduloLogic.getModulos(),this.modulo,this.moduloParameterGeneral,this.isEsNuevoModulo,classes);//this.moduloLogic.getModulo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.moduloSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.moduloSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.moduloReturnGeneral.getModulo(),moduloLogic.getModulos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.moduloReturnGeneral.getModulo(),this.modulos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosModulo.repaint();
				
				//((AbstractTableModel) this.jTableDatosModulo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosModulo();
			}
		}
	}
	
	public void actualizarVisualTableDatosModulo() throws Exception {
		
		ModuloModel moduloModel=(ModuloModel)this.jTableDatosModulo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			moduloModel.modulos=this.moduloLogic.getModulos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			moduloModel.modulos=this.modulos;
		}
		
		
		((ModuloModel) this.jTableDatosModulo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaModulo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmoduloAnterior(),this.moduloLogic.getModulos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmoduloAnterior(),this.modulos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosModulo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioModulo(Modulo modulo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
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
										
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.modulo,new Object(),generalEntityParameterGeneral,this.moduloReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.moduloSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ModuloConstantesFunciones.getClassesRelationshipsOfModulo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ModuloConstantesFunciones.getClassesRelationshipsFromStringsOfModulo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormModulo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.modulo,new Object(),generalEntityParameterGeneral,this.moduloReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioModulo(ModuloBean moduloBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanModulo(ArrayList<Classe> classes,ModuloReturnGeneral moduloReturnGeneral,ModuloBean moduloBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualModulo(Modulo modulo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.modulo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormModulo = new ModuloDetalleFormJInternalFrame(jDesktopPane,this.moduloSessionBean.getConGuardarRelaciones(),this.moduloSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormModulo);
		this.jInternalFrameDetalleFormModulo.setVisible(false);
		this.jInternalFrameDetalleFormModulo.setSelected(false);						
		
		this.jInternalFrameDetalleFormModulo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormModulo.moduloLogic=this.moduloLogic;
		
		this.cargarCombosFrameForeignKeyModulo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleModulo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleModulo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyModulo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyModulo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormModulo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarModulo"));
		
		this.jInternalFrameDetalleFormModulo.jButtonModificarModulo.addActionListener(new ButtonActionListener(this,"ModificarModulo"));

		
		this.jInternalFrameDetalleFormModulo.jButtonModificarToolBarModulo.addActionListener(new ButtonActionListener(this,"ModificarToolBarModulo"));
					
		this.jInternalFrameDetalleFormModulo.jMenuItemModificarModulo.addActionListener(new ButtonActionListener(this,"MenuItemModificarModulo"));		
		
		
		
		this.jInternalFrameDetalleFormModulo.jButtonActualizarModulo.addActionListener (new ButtonActionListener(this,"ActualizarModulo"));
		
		
		this.jInternalFrameDetalleFormModulo.jButtonActualizarToolBarModulo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarModulo"));
						
		this.jInternalFrameDetalleFormModulo.jMenuItemActualizarModulo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarModulo"));		
		
		
		
		this.jInternalFrameDetalleFormModulo.jButtonEliminarModulo.addActionListener (new ButtonActionListener(this,"EliminarModulo"));
		
		
		this.jInternalFrameDetalleFormModulo.jButtonEliminarToolBarModulo.addActionListener (new ButtonActionListener(this,"EliminarToolBarModulo"));
								
		this.jInternalFrameDetalleFormModulo.jMenuItemEliminarModulo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarModulo"));		
		
		
		
		this.jInternalFrameDetalleFormModulo.jButtonCancelarModulo.addActionListener (new ButtonActionListener(this,"CancelarModulo"));
		
		
		this.jInternalFrameDetalleFormModulo.jButtonCancelarToolBarModulo.addActionListener (new ButtonActionListener(this,"CancelarToolBarModulo"));
					
		this.jInternalFrameDetalleFormModulo.jMenuItemCancelarModulo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarModulo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormModulo.jMenuItemDetalleCerrarModulo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarModulo"));		
		
		
		
		this.jInternalFrameDetalleFormModulo.jButtonGuardarCambiosToolBarModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarModulo"));
		
		
		
		this.jInternalFrameDetalleFormModulo.jButtonGuardarCambiosToolBarModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarModulo"));
		
		
		
		this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioModulo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonidModuloBusqueda.addActionListener(new ButtonActionListener(this,"idModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModulo.jButtonid_sistemaModuloUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonid_sistemaModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModulo.jButtonid_paqueteModuloUpdate.addActionListener(new ButtonActionListener(this,"id_paqueteModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonid_paqueteModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_paqueteModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtoncodigoModuloBusqueda.addActionListener(new ButtonActionListener(this,"codigoModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonnombreModuloBusqueda.addActionListener(new ButtonActionListener(this,"nombreModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModulo.jButtonid_tipo_tecla_mascaraModuloUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_tecla_mascaraModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonid_tipo_tecla_mascaraModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_tecla_mascaraModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonteclaModuloBusqueda.addActionListener(new ButtonActionListener(this,"teclaModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonestadoModuloBusqueda.addActionListener(new ButtonActionListener(this,"estadoModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonordenModuloBusqueda.addActionListener(new ButtonActionListener(this,"ordenModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtondescripcionModuloBusqueda.addActionListener(new ButtonActionListener(this,"descripcionModuloBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormModulo.jTabbedPaneRelacionesModulo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesModulo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameModulo"));
		
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModulo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarModulo"));
		}
		
		this.jTableDatosModulo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarModulo"));
		
		this.jTableDatosModulo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarModulo"));
		
		this.jButtonNuevoModulo.addActionListener(new ButtonActionListener(this,"NuevoModulo"));
		
		this.jButtonDuplicarModulo.addActionListener(new ButtonActionListener(this,"DuplicarModulo"));
		
		this.jButtonCopiarModulo.addActionListener(new ButtonActionListener(this,"CopiarModulo"));
		
		this.jButtonVerFormModulo.addActionListener(new ButtonActionListener(this,"VerFormModulo"));
		
		
		this.jButtonNuevoToolBarModulo.addActionListener(new ButtonActionListener(this,"NuevoToolBarModulo"));
			
		this.jButtonDuplicarToolBarModulo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarModulo"));
			
		this.jMenuItemNuevoModulo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoModulo"));
			
		this.jMenuItemDuplicarModulo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarModulo"));		
		
		
		this.jButtonNuevoRelacionesModulo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesModulo"));
		
		
		this.jButtonNuevoRelacionesToolBarModulo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarModulo"));
			
		this.jMenuItemNuevoRelacionesModulo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesModulo"));		
		
		
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModulo.jButtonModificarModulo.addActionListener(new ButtonActionListener(this,"ModificarModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModulo.jButtonModificarToolBarModulo.addActionListener(new ButtonActionListener(this,"ModificarToolBarModulo"));
			
			this.jInternalFrameDetalleFormModulo.jMenuItemModificarModulo.addActionListener(new ButtonActionListener(this,"MenuItemModificarModulo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormModulo.jButtonActualizarModulo.addActionListener (new ButtonActionListener(this,"ActualizarModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModulo.jButtonActualizarToolBarModulo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarModulo"));
				
			this.jInternalFrameDetalleFormModulo.jMenuItemActualizarModulo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarModulo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModulo.jButtonEliminarModulo.addActionListener (new ButtonActionListener(this,"EliminarModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModulo.jButtonEliminarToolBarModulo.addActionListener (new ButtonActionListener(this,"EliminarToolBarModulo"));
						
			this.jInternalFrameDetalleFormModulo.jMenuItemEliminarModulo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarModulo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModulo.jButtonCancelarModulo.addActionListener (new ButtonActionListener(this,"CancelarModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModulo.jButtonCancelarToolBarModulo.addActionListener (new ButtonActionListener(this,"CancelarToolBarModulo"));
			
			this.jInternalFrameDetalleFormModulo.jMenuItemCancelarModulo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarModulo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarModulo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarModulo"));		
		
		
		this.jButtonCerrarModulo.addActionListener (new ButtonActionListener(this,"CerrarModulo"));
		
		
		this.jButtonCerrarToolBarModulo.addActionListener (new ButtonActionListener(this,"CerrarToolBarModulo"));
			
		this.jMenuItemCerrarModulo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarModulo"));
			
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModulo.jMenuItemDetalleCerrarModulo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarModulo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModulo.jButtonGuardarCambiosModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModulo.jButtonGuardarCambiosToolBarModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarModulo"));
		}
		
		this.jButtonCopiarToolBarModulo.addActionListener (new ButtonActionListener(this,"CopiarToolBarModulo"));
			
		this.jButtonVerFormToolBarModulo.addActionListener (new ButtonActionListener(this,"VerFormToolBarModulo"));
		
		this.jMenuItemGuardarCambiosModulo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosModulo"));
			
		this.jMenuItemCopiarModulo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarModulo"));		
		
		this.jMenuItemVerFormModulo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormModulo"));		
		
		
		this.jButtonGuardarCambiosTablaModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaModulo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarModulo"));
			
		this.jMenuItemGuardarCambiosTablaModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaModulo"));		
		
		
		
		this.jButtonRecargarInformacionModulo.addActionListener (new ButtonActionListener(this,"RecargarInformacionModulo"));
					
		this.jButtonRecargarInformacionToolBarModulo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarModulo"));
		
		this.jMenuItemRecargarInformacionModulo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionModulo"));		
		
		
		
		this.jButtonAnterioresModulo.addActionListener (new ButtonActionListener(this,"AnterioresModulo"));
		
		
		this.jButtonAnterioresToolBarModulo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarModulo"));
		
		this.jMenuItemAnterioresModulo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresModulo"));		
		
		
		this.jButtonSiguientesModulo.addActionListener (new ButtonActionListener(this,"SiguientesModulo"));
		
		
		this.jButtonSiguientesToolBarModulo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarModulo"));
			
		this.jMenuItemSiguientesModulo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesModulo"));
			
		this.jMenuItemAbrirOrderByModulo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByModulo"));
			
		this.jMenuItemMostrarOcultarModulo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarModulo"));
			
		this.jMenuItemDetalleAbrirOrderByModulo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByModulo"));
			
		this.jMenuItemDetalleMostarOcultarModulo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarModulo"));		
		
		
		this.jButtonNuevoGuardarCambiosModulo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosModulo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarModulo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarModulo"));
			
		this.jMenuItemNuevoGuardarCambiosModulo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosModulo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosModulo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosModulo"));

		this.jCheckBoxSeleccionadosModulo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosModulo"));
		
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioModulo"));
		}
		
		
		this.jComboBoxTiposRelacionesModulo.addActionListener (new ButtonActionListener(this,"TiposRelacionesModulo"));
			
		this.jComboBoxTiposAccionesModulo.addActionListener (new ButtonActionListener(this,"TiposAccionesModulo"));
					
		this.jComboBoxTiposSeleccionarModulo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarModulo"));
			
		this.jTextFieldValorCampoGeneralModulo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralModulo"));		
		
		
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonidModuloBusqueda.addActionListener(new ButtonActionListener(this,"idModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModulo.jButtonid_sistemaModuloUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonid_sistemaModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModulo.jButtonid_paqueteModuloUpdate.addActionListener(new ButtonActionListener(this,"id_paqueteModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonid_paqueteModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_paqueteModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtoncodigoModuloBusqueda.addActionListener(new ButtonActionListener(this,"codigoModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonnombreModuloBusqueda.addActionListener(new ButtonActionListener(this,"nombreModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModulo.jButtonid_tipo_tecla_mascaraModuloUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_tecla_mascaraModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonid_tipo_tecla_mascaraModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_tecla_mascaraModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonteclaModuloBusqueda.addActionListener(new ButtonActionListener(this,"teclaModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonestadoModuloBusqueda.addActionListener(new ButtonActionListener(this,"estadoModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonordenModuloBusqueda.addActionListener(new ButtonActionListener(this,"ordenModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtondescripcionModuloBusqueda.addActionListener(new ButtonActionListener(this,"descripcionModuloBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdSistemaPorNombreModulo.addActionListener(new ButtonActionListener(this,"BusquedaPorIdSistemaPorNombreModulo"));

			this.jButtonFK_IdSistemaModulo.addActionListener(new ButtonActionListener(this,"FK_IdSistemaModulo"));

			this.jButtonFK_IdTipoTeclaMascaraModulo.addActionListener(new ButtonActionListener(this,"FK_IdTipoTeclaMascaraModulo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoModulo!=null) {
				this.jInternalFrameReporteDinamicoModulo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoModulo"));
				this.jInternalFrameReporteDinamicoModulo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoModulo"));
				this.jInternalFrameReporteDinamicoModulo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoModulo"));
			}
			
			//this.jButtonCerrarReporteDinamicoModulo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoModulo"));				
			//this.jButtonGenerarReporteDinamicoModulo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoModulo"));
			//this.jButtonGenerarExcelReporteDinamicoModulo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoModulo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionModulo!=null) {
				this.jInternalFrameImportacionModulo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionModulo"));
				this.jInternalFrameImportacionModulo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionModulo"));
				this.jInternalFrameImportacionModulo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionModulo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByModulo.addActionListener (new ButtonActionListener(this,"AbrirOrderByModulo"));
			
			this.jButtonAbrirOrderByToolBarModulo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarModulo"));			
			
			if(this.jInternalFrameOrderByModulo!=null) {
				this.jInternalFrameOrderByModulo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByModulo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModulo.jTabbedPaneRelacionesModulo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesModulo"));
		
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
            		closingInternalFrameModulo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormModulo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormModulo = (JInternalFrameBase)event.getSource();
	            	
	            ModuloBeanSwingJInternalFrame jInternalFrameParent=(ModuloBeanSwingJInternalFrame)jInternalFrameDetalleFormModulo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarModuloActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosModulo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosModuloListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosModulo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosModulo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModuloActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModuloActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModuloActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoModulo";
		inputMap = this.jButtonNuevoModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoModuloActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModuloActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModuloActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModuloActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesModulo";
		inputMap = this.jButtonNuevoRelacionesModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoModuloActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarModulo";
		inputMap = this.jButtonModificarModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarModulo";
		inputMap = this.jButtonActualizarModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarModulo";
		inputMap = this.jButtonEliminarModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarModulo";
		inputMap = this.jButtonCancelarModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarModulo";
		inputMap = this.jButtonCerrarModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormModulo.jButtonGuardarCambiosModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosModulo";
		inputMap = this.jInternalFrameDetalleFormModulo.jButtonGuardarCambiosModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormModulo.jButtonGuardarCambiosModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosModulo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosModuloItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesModulo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesModuloActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarModulo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarModuloActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralModulo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralModuloActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonidModuloBusqueda.addActionListener(new ButtonActionListener(this,"idModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModulo.jButtonid_sistemaModuloUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonid_sistemaModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModulo.jButtonid_paqueteModuloUpdate.addActionListener(new ButtonActionListener(this,"id_paqueteModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonid_paqueteModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_paqueteModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtoncodigoModuloBusqueda.addActionListener(new ButtonActionListener(this,"codigoModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonnombreModuloBusqueda.addActionListener(new ButtonActionListener(this,"nombreModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModulo.jButtonid_tipo_tecla_mascaraModuloUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_tecla_mascaraModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonid_tipo_tecla_mascaraModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_tecla_mascaraModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonteclaModuloBusqueda.addActionListener(new ButtonActionListener(this,"teclaModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonestadoModuloBusqueda.addActionListener(new ButtonActionListener(this,"estadoModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtonordenModuloBusqueda.addActionListener(new ButtonActionListener(this,"ordenModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModulo.jButtondescripcionModuloBusqueda.addActionListener(new ButtonActionListener(this,"descripcionModuloBusqueda"));
		
		
		this.jButtonBusquedaPorIdSistemaPorNombreModulo.addActionListener(new ButtonActionListener(this,"BusquedaPorIdSistemaPorNombreModulo"));

		this.jButtonFK_IdSistemaModulo.addActionListener(new ButtonActionListener(this,"FK_IdSistemaModulo"));

		this.jButtonFK_IdTipoTeclaMascaraModulo.addActionListener(new ButtonActionListener(this,"FK_IdTipoTeclaMascaraModulo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarModuloActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarModulo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosModulo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Modulo moduloAux:this.moduloLogic.getModulos()) {
					moduloAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Modulo moduloAux:modulos) {
					moduloAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosModuloItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingModulo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Modulo moduloAux:this.moduloLogic.getModulos()) {
						moduloAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Modulo moduloAux:modulos) {
						moduloAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Modulo moduloAux:this.moduloLogic.getModulos()) {
					
						if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							moduloAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Modulo moduloAux:modulos) {
						
						if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							moduloAux.setestado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaModulo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosModulo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosModulo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosModulo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosModuloItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingModulo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosModulo.getSelectedRows();
			
			Modulo moduloLocal=new Modulo();
			
			//this.seleccionarTodosModulo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLocal =(Modulo) this.moduloLogic.getModulos().toArray()[this.jTableDatosModulo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					moduloLocal =(Modulo) this.modulos.toArray()[this.jTableDatosModulo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				moduloLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Modulo moduloAux:this.moduloLogic.getModulos()) {
						moduloAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Modulo moduloAux:modulos) {
						moduloAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaModulo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosModulo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosModulo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosModulo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualModuloItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarModuloParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralModuloActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingModulo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralModulo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Modulo moduloAux:this.moduloLogic.getModulos()) {
				
						if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							moduloAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							moduloAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_TECLA)) {
							existe=true;
							moduloAux.settecla(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							moduloAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							moduloAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Modulo moduloAux:modulos) {
					
						if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							moduloAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							moduloAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_TECLA)) {
							existe=true;
							moduloAux.settecla(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							moduloAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							moduloAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaModulo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesModuloActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingModulo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioModulo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesModulo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteModulo) {				
					conSplash=true;//false;										
					
					//this.startProcessModulo(conSplash);
				
					this.generarReporteModulosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesModulo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoModulosSeleccionados();
				//this.jComboBoxTiposAccionesModulo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoModulosSeleccionados(false);
				//this.jComboBoxTiposAccionesModulo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoModulosSeleccionados(true);
				//this.jComboBoxTiposAccionesModulo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessModulo();
				
				this.exportarModulosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesModulo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionModulos();
				//this.importarModulos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesModulo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessModulo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelModulosSeleccionados();
				//this.jComboBoxTiposAccionesModulo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Modulo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessModulo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoModulo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyModulo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Modulo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesModulo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.setSelectedIndex(0);					
				}	
			} 			
			else if(ModuloBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteModulo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessModulo(conSplash);
					
						//this.actualizarParametrosGeneralModulo();
						
						this.generarReporteProcesoAccionModulosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesModulo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ModuloBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ModuloS SELECCIONADOS?", "MANTENIMIENTO DE Modulo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessModulo();
				
						this.actualizarParametrosGeneralModulo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.moduloReturnGeneral=moduloLogic.procesarAccionModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.moduloLogic.getModulos(),this.moduloParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarModuloReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesModulo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralModulo();
					
					ModuloBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarModuloReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesModulo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormModulo.jComboBoxTiposAccionesFormularioModulo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessModulo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesModuloActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessModulo();
			
			if(this.jInternalFrameDetalleFormModulo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();		
			Modulo modulo=new Modulo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingModulo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesModulo.getSelectedItem();
			
			
			
			
			modulosSeleccionados=this.getModulosSeleccionados(true);
			//this.sTipoAccion;
			
			if(modulosSeleccionados.size()==1) {
				for(Modulo moduloAux:modulosSeleccionados) {
					modulo=moduloAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessModulo();
			
      		//this.finishProcessModulo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarModuloReturnGeneral() throws Exception {
		if(this.moduloReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.moduloReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.moduloReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.moduloReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.moduloReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.moduloReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingModulo(false);
		}
		
		if(this.moduloReturnGeneral.getConRetornoLista() || this.moduloReturnGeneral.getConRetornoObjeto()) {
			if(this.moduloReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.moduloLogic.setModulos(this.moduloReturnGeneral.getModulos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.moduloReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.moduloLogic.setModulo(this.moduloReturnGeneral.getModulo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingModulo(false);
		}
	}
	
	public void actualizarParametrosGeneralModulo() throws Exception {
		
		
	}
	
	public ArrayList<Modulo> getModulosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioModulo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Modulo moduloAux:moduloLogic.getModulos()) {
					if(moduloAux.getIsSelected()) {
						modulosSeleccionados.add(moduloAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Modulo moduloAux:this.modulos) {
					if(moduloAux.getIsSelected()) {
						modulosSeleccionados.add(moduloAux);				
					}
				}
			}
			
			if(modulosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						modulosSeleccionados.addAll(this.moduloLogic.getModulos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						modulosSeleccionados.addAll(this.modulos);				
					}
				}
			}
		} else {
			modulosSeleccionados.add(this.modulo);
		}
		
		return modulosSeleccionados;
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
	
	public void generarReporteModulosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalModulosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoModulosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoModulosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoModulosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Modulo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesModulosSeleccionados() throws Exception {
		ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();		
		
		modulosSeleccionados=this.getModulosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteModulos("Todos",modulosSeleccionados);
		
	}	
	
	public void generarReporteNormalModulosSeleccionados() throws Exception {
		ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();		
		
		modulosSeleccionados=this.getModulosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteModulos("Todos",modulosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionModulosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();
		
		modulosSeleccionados=this.getModulosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteModulos("Todos",modulosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoModulosSeleccionados() throws Exception {
		ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoModulo();
		
		
		modulosSeleccionados=this.getModulosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoModulo();
		
		
		//this.generarReporteModulos("Todos",modulosSeleccionados ,moduloImplementable,moduloImplementableHome);
	}
	
	public void mostrarImportacionModulos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionModulo();
		
		this.abrirFrameImportacionModulo();		
		
			
		//this.generarReporteModulos("Todos",modulosSeleccionados ,moduloImplementable,moduloImplementableHome);
	}
	
	public void importarModulos() throws Exception {		
	
	}
	
	public void exportarModulosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelModulosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoModulosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlModulosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Modulo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoModulosSeleccionados() throws Exception {
		ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();		
		
		modulosSeleccionados=this.getModulosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modulo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarModulo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Modulo moduloAux:modulosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarModulo(moduloAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//moduloAux.setsDetalleGeneralEntityReporte(moduloAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.moduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modulo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarModulo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ModuloConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModuloConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModuloConstantesFunciones.LABEL_IDSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModuloConstantesFunciones.LABEL_IDPAQUETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModuloConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModuloConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModuloConstantesFunciones.LABEL_TECLA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModuloConstantesFunciones.LABEL_ESTADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModuloConstantesFunciones.LABEL_ORDEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModuloConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarModulo(Modulo modulo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=modulo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getsistema_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getpaquete_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.gettipoteclamascara_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.gettecla();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getestado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getorden().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modulo.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelModulosSeleccionados() throws Exception {
		ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();		
		
		modulosSeleccionados=this.getModulosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modulo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Modulos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelModulo(row);				
				iRow++;
			}				
			
			for(Modulo moduloAux:modulosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelModulo(moduloAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.moduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modulo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlModulosSeleccionados() throws Exception {
		ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();		
		
		modulosSeleccionados=this.getModulosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modulo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("modulos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("modulo");
			//elementRoot.appendChild(element);
		
			for(Modulo moduloAux:modulosSeleccionados) {
				element = document.createElement("modulo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlModulo(moduloAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.moduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modulo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelModulo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ModuloConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ModuloConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ModuloConstantesFunciones.LABEL_IDSISTEMA);
		cell = row.createCell(iColumn++);cell.setCellValue(ModuloConstantesFunciones.LABEL_IDPAQUETE);
		cell = row.createCell(iColumn++);cell.setCellValue(ModuloConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ModuloConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA);
		cell = row.createCell(iColumn++);cell.setCellValue(ModuloConstantesFunciones.LABEL_TECLA);
		cell = row.createCell(iColumn++);cell.setCellValue(ModuloConstantesFunciones.LABEL_ESTADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ModuloConstantesFunciones.LABEL_ORDEN);
		cell = row.createCell(iColumn++);cell.setCellValue(ModuloConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelModulo(Modulo modulo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(modulo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(modulo.getsistema_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(modulo.getpaquete_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(modulo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(modulo.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(modulo.gettipoteclamascara_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(modulo.gettecla());
		cell = row.createCell(iColumn++);cell.setCellValue(modulo.getestado());
		cell = row.createCell(iColumn++);cell.setCellValue(modulo.getorden());
		cell = row.createCell(iColumn++);cell.setCellValue(modulo.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlModulo(Modulo modulo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ModuloConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(modulo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ModuloConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(modulo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementsistema_descripcion = document.createElement(ModuloConstantesFunciones.IDSISTEMA);
		elementsistema_descripcion.appendChild(document.createTextNode(modulo.getsistema_descripcion()));
		element.appendChild(elementsistema_descripcion);

		Element elementpaquete_descripcion = document.createElement(ModuloConstantesFunciones.IDPAQUETE);
		elementpaquete_descripcion.appendChild(document.createTextNode(modulo.getpaquete_descripcion()));
		element.appendChild(elementpaquete_descripcion);

		Element elementcodigo = document.createElement(ModuloConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(modulo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ModuloConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(modulo.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementtipoteclamascara_descripcion = document.createElement(ModuloConstantesFunciones.IDTIPOTECLAMASCARA);
		elementtipoteclamascara_descripcion.appendChild(document.createTextNode(modulo.gettipoteclamascara_descripcion()));
		element.appendChild(elementtipoteclamascara_descripcion);

		Element elementtecla = document.createElement(ModuloConstantesFunciones.TECLA);
		elementtecla.appendChild(document.createTextNode(modulo.gettecla().trim()));
		element.appendChild(elementtecla);

		Element elementestado = document.createElement(ModuloConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(modulo.getestado().toString().trim()));
		element.appendChild(elementestado);

		Element elementorden = document.createElement(ModuloConstantesFunciones.ORDEN);
		elementorden.appendChild(document.createTextNode(modulo.getorden().toString().trim()));
		element.appendChild(elementorden);

		Element elementdescripcion = document.createElement(ModuloConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(modulo.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoModulosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Modulo> modulosSeleccionados=new ArrayList<Modulo>();
		
		modulosSeleccionados=this.getModulosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoModulo(modulosSeleccionados);
		
		this.generarReporteModulos("Todos",modulosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoModulo(ArrayList<Modulo> modulosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Modulo moduloAux:modulosSeleccionados) {
				moduloAux.setsDetalleGeneralEntityReporte(moduloAux.toString());
			
				if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_IDSISTEMA)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.getsistema_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_IDPAQUETE)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.getpaquete_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.gettipoteclamascara_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_TECLA)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.gettecla());
				}
				 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(moduloAux.getestado()));
				}
				 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_ORDEN)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.getorden().toString());
				}
				 else if(sTipoSeleccionar.equals(ModuloConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					moduloAux.setsDescripcionGeneralEntityReporte1(moduloAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesModulo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoModulo=true;
				this.isVisibilidadCeldaNuevoRelacionesModulo=true;
				this.isVisibilidadCeldaGuardarCambiosModulo=true;
			}
			
			this.isVisibilidadCeldaModificarModulo=false;
			this.isVisibilidadCeldaActualizarModulo=false;
			this.isVisibilidadCeldaEliminarModulo=false;
			this.isVisibilidadCeldaCancelarModulo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModulo=true;
				} else {
					this.isVisibilidadCeldaGuardarModulo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesModulo=false;
			this.isVisibilidadCeldaGuardarCambiosModulo=false;
			this.isVisibilidadCeldaModificarModulo=false;
			this.isVisibilidadCeldaActualizarModulo=true;
			this.isVisibilidadCeldaEliminarModulo=false;
			this.isVisibilidadCeldaCancelarModulo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModulo=true;
				} else {
					this.isVisibilidadCeldaGuardarModulo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesModulo=false;
			this.isVisibilidadCeldaGuardarCambiosModulo=false;
			this.isVisibilidadCeldaModificarModulo=false;
			this.isVisibilidadCeldaActualizarModulo=true;
			this.isVisibilidadCeldaEliminarModulo=true;
			this.isVisibilidadCeldaCancelarModulo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModulo=true;
				} else {
					this.isVisibilidadCeldaGuardarModulo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesModulo=false;
			this.isVisibilidadCeldaGuardarCambiosModulo=false;
			this.isVisibilidadCeldaModificarModulo=false;
			this.isVisibilidadCeldaActualizarModulo=true;
			this.isVisibilidadCeldaEliminarModulo=false;
			this.isVisibilidadCeldaCancelarModulo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModulo=false;
				} else {
					this.isVisibilidadCeldaGuardarModulo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoModulo=true;
			this.isVisibilidadCeldaNuevoRelacionesModulo=true;
			this.isVisibilidadCeldaGuardarCambiosModulo=true;
			this.isVisibilidadCeldaModificarModulo=false;
			this.isVisibilidadCeldaActualizarModulo=false;
			this.isVisibilidadCeldaEliminarModulo=false;
			this.isVisibilidadCeldaCancelarModulo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModulo=true;
				} else {
					this.isVisibilidadCeldaGuardarModulo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesModulo=false;
			this.isVisibilidadCeldaGuardarCambiosModulo=false;
			this.isVisibilidadCeldaActualizarModulo=false;
			this.isVisibilidadCeldaEliminarModulo=false;
			this.isVisibilidadCeldaCancelarModulo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModulo=false;
				} else {
					this.isVisibilidadCeldaGuardarModulo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesModulo=false;
			this.isVisibilidadCeldaGuardarCambiosModulo=false;
			this.isVisibilidadCeldaModificarModulo=true;
			this.isVisibilidadCeldaActualizarModulo=false;
			this.isVisibilidadCeldaEliminarModulo=false;
			this.isVisibilidadCeldaCancelarModulo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModulo=false;
				} else {
					this.isVisibilidadCeldaGuardarModulo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ModuloJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoModulo=true;
			this.isVisibilidadCeldaNuevoRelacionesModulo=true;
			this.isVisibilidadCeldaGuardarCambiosModulo=true;
		} else {
			this.actualizarEstadoPanelsModulo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarModulo=false;
			//this.isVisibilidadCeldaVerFormModulo=false;
			this.isVisibilidadCeldaDuplicarModulo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!moduloSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesModulo=false;
		} else {
			this.isVisibilidadCeldaNuevoModulo=false;
			this.isVisibilidadCeldaGuardarCambiosModulo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(moduloSessionBean.getEsGuardarRelacionado()) {
			if(!moduloSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesModulo=false;												
			}
			
			this.jButtonCerrarModulo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesModulo=false;
		}
		
		if(!this.permiteMantenimiento(this.modulo)) {
			this.isVisibilidadCeldaActualizarModulo=false;
			this.isVisibilidadCeldaEliminarModulo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesModulo() {
	}
	
	public void actualizarEstadoPanelsModulo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionModulo!=null) {
				this.jScrollPanelDatosEdicionModulo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModulo!=null) {
				this.jTabbedPaneBusquedasModulo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosModulo!=null) {
				this.jScrollPanelDatosModulo.setVisible(true);
			}
			
			if(this.jPanelPaginacionModulo!=null) {
				this.jPanelPaginacionModulo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesModulo!=null) {
				this.jPanelParametrosReportesModulo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionModulo!=null) {
				this.jScrollPanelDatosEdicionModulo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModulo!=null) {
				this.jTabbedPaneBusquedasModulo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosModulo!=null) {
				this.jScrollPanelDatosModulo.setVisible(false);
			}
			
			if(this.jPanelPaginacionModulo!=null) {
				this.jPanelPaginacionModulo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesModulo!=null) {
				this.jPanelParametrosReportesModulo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionModulo!=null) {
				this.jScrollPanelDatosEdicionModulo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModulo!=null) {
				this.jTabbedPaneBusquedasModulo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosModulo!=null) {
				this.jScrollPanelDatosModulo.setVisible(false);
			}
			
			if(this.jPanelPaginacionModulo!=null) {
				this.jPanelPaginacionModulo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesModulo!=null) {
				this.jPanelParametrosReportesModulo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionModulo!=null) {
				this.jScrollPanelDatosEdicionModulo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModulo!=null) {
				this.jTabbedPaneBusquedasModulo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosModulo!=null) {
				this.jScrollPanelDatosModulo.setVisible(false);
			}
			
			if(this.jPanelPaginacionModulo!=null) {
				this.jPanelPaginacionModulo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesModulo!=null) {
				this.jPanelParametrosReportesModulo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionModulo!=null) {
				this.jScrollPanelDatosEdicionModulo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModulo!=null) {
				this.jTabbedPaneBusquedasModulo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosModulo!=null) {
				this.jScrollPanelDatosModulo.setVisible(true);
			}
			
			if(this.jPanelPaginacionModulo!=null) {
				this.jPanelPaginacionModulo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesModulo!=null) {
				this.jPanelParametrosReportesModulo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionModulo!=null) {
				this.jScrollPanelDatosEdicionModulo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModulo!=null) {
				this.jTabbedPaneBusquedasModulo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosModulo!=null) {
				this.jScrollPanelDatosModulo.setVisible(true);
			}
			
			if(this.jPanelPaginacionModulo!=null) {
				this.jPanelPaginacionModulo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesModulo!=null) {
				this.jPanelParametrosReportesModulo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionModulo!=null) {
				this.jScrollPanelDatosEdicionModulo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModulo!=null) {
				this.jTabbedPaneBusquedasModulo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosModulo!=null) {
				this.jScrollPanelDatosModulo.setVisible(true);
			}
			
			if(this.jPanelPaginacionModulo!=null) {
				this.jPanelPaginacionModulo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesModulo!=null) {
				this.jPanelParametrosReportesModulo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.moduloSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasModulo!=null) {
					this.jTabbedPaneBusquedasModulo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesModulo!=null) {
				this.jPanelParametrosReportesModulo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.moduloSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModulo!=null) {
				this.jTabbedPaneBusquedasModulo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesModulo!=null) {
				this.jPanelParametrosReportesModulo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaSistema(Boolean isParaSistema){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSistemaNegation=!isParaSistema;

			this.isVisibilidadBusquedaPorIdSistemaPorNombre=isParaSistema;
			if(!this.isVisibilidadBusquedaPorIdSistemaPorNombre) {this.jTabbedPaneBusquedasModulo.remove(jPanelBusquedaPorIdSistemaPorNombreModulo);}

			this.isVisibilidadFK_IdSistema=isParaSistema;
			if(!this.isVisibilidadFK_IdSistema) {this.jTabbedPaneBusquedasModulo.remove(jPanelFK_IdSistemaModulo);}

			this.isVisibilidadFK_IdTipoTeclaMascara=isParaSistemaNegation;
			if(!this.isVisibilidadFK_IdTipoTeclaMascara) {this.jTabbedPaneBusquedasModulo.remove(jPanelFK_IdTipoTeclaMascaraModulo);}
		}
		
	}

	public void setVisibilidadBusquedasParaPaquete(Boolean isParaPaquete){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaqueteNegation=!isParaPaquete;

			this.isVisibilidadBusquedaPorIdSistemaPorNombre=isParaPaqueteNegation;
			if(!this.isVisibilidadBusquedaPorIdSistemaPorNombre) {this.jTabbedPaneBusquedasModulo.remove(jPanelBusquedaPorIdSistemaPorNombreModulo);}

			this.isVisibilidadFK_IdSistema=isParaPaqueteNegation;
			if(!this.isVisibilidadFK_IdSistema) {this.jTabbedPaneBusquedasModulo.remove(jPanelFK_IdSistemaModulo);}

			this.isVisibilidadFK_IdTipoTeclaMascara=isParaPaqueteNegation;
			if(!this.isVisibilidadFK_IdTipoTeclaMascara) {this.jTabbedPaneBusquedasModulo.remove(jPanelFK_IdTipoTeclaMascaraModulo);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoTeclaMascara(Boolean isParaTipoTeclaMascara){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoTeclaMascaraNegation=!isParaTipoTeclaMascara;

			this.isVisibilidadBusquedaPorIdSistemaPorNombre=isParaTipoTeclaMascaraNegation;
			if(!this.isVisibilidadBusquedaPorIdSistemaPorNombre) {this.jTabbedPaneBusquedasModulo.remove(jPanelBusquedaPorIdSistemaPorNombreModulo);}

			this.isVisibilidadFK_IdSistema=isParaTipoTeclaMascaraNegation;
			if(!this.isVisibilidadFK_IdSistema) {this.jTabbedPaneBusquedasModulo.remove(jPanelFK_IdSistemaModulo);}

			this.isVisibilidadFK_IdTipoTeclaMascara=isParaTipoTeclaMascara;
			if(!this.isVisibilidadFK_IdTipoTeclaMascara) {this.jTabbedPaneBusquedasModulo.remove(jPanelFK_IdTipoTeclaMascaraModulo);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ModuloSessionBean moduloSessionBean=new ModuloSessionBean();
		
		if(this.moduloSessionBean==null) {
			this.moduloSessionBean=new ModuloSessionBean();
		}
		
		this.moduloSessionBean.setsUltimaBusquedaModulo(this.getsAccionBusqueda());
		this.moduloSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.moduloSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdSistemaPorNombre")) {
			moduloSessionBean.setid_sistema(this.getid_sistemaBusquedaPorIdSistemaPorNombre());	
			moduloSessionBean.setnombre(this.getnombreBusquedaPorIdSistemaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSistema")) {
			moduloSessionBean.setid_sistema(this.getid_sistemaFK_IdSistema());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoTeclaMascara")) {
			moduloSessionBean.setid_tipo_tecla_mascara(this.getid_tipo_tecla_mascaraFK_IdTipoTeclaMascara());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ModuloSessionBean moduloSessionBean=new ModuloSessionBean();
		
		if(this.moduloSessionBean==null) {
			this.moduloSessionBean=new ModuloSessionBean();
		}
		
		if(this.moduloSessionBean.getsUltimaBusquedaModulo()!=null&&!this.moduloSessionBean.getsUltimaBusquedaModulo().equals("")) {
			this.setsAccionBusqueda(moduloSessionBean.getsUltimaBusquedaModulo());
			this.setiNumeroPaginacion(moduloSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(moduloSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdSistemaPorNombre")) {
				this.setid_sistemaBusquedaPorIdSistemaPorNombre(moduloSessionBean.getid_sistema());
				moduloSessionBean.setid_sistema(-1L);
				this.setnombreBusquedaPorIdSistemaPorNombre(moduloSessionBean.getnombre());
				moduloSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSistema")) {
				this.setid_sistemaFK_IdSistema(moduloSessionBean.getid_sistema());
				moduloSessionBean.setid_sistema(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoTeclaMascara")) {
				this.setid_tipo_tecla_mascaraFK_IdTipoTeclaMascara(moduloSessionBean.getid_tipo_tecla_mascara());
				moduloSessionBean.setid_tipo_tecla_mascara(-1L);
			}
		}
		
		this.moduloSessionBean.setsUltimaBusquedaModulo("");
		this.moduloSessionBean.setiNumeroPaginacion(ModuloConstantesFunciones.INUMEROPAGINACION);
		this.moduloSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaModulo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioModulo() {
		this.updateBorderResaltarBusquedasFormularioModulo();
		this.updateVisibilidadBusquedasFormularioModulo();
		this.updateHabilitarBusquedasFormularioModulo();
	}
	
	public void updateBorderResaltarBusquedasFormularioModulo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasModulo.getComponents().length>0) {
	

		if(this.moduloConstantesFunciones.resaltarBusquedaPorIdSistemaPorNombreModulo!=null) {
			index= this.jTabbedPaneBusquedasModulo.indexOfComponent(this.jPanelBusquedaPorIdSistemaPorNombreModulo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasModulo.getComponent(index);
				jPanel.setBorder(this.moduloConstantesFunciones.resaltarBusquedaPorIdSistemaPorNombreModulo);
			}
		}

		if(this.moduloConstantesFunciones.resaltarFK_IdSistemaModulo!=null) {
			index= this.jTabbedPaneBusquedasModulo.indexOfComponent(this.jPanelFK_IdSistemaModulo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasModulo.getComponent(index);
				jPanel.setBorder(this.moduloConstantesFunciones.resaltarFK_IdSistemaModulo);
			}
		}

		if(this.moduloConstantesFunciones.resaltarFK_IdTipoTeclaMascaraModulo!=null) {
			index= this.jTabbedPaneBusquedasModulo.indexOfComponent(this.jPanelFK_IdTipoTeclaMascaraModulo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasModulo.getComponent(index);
				jPanel.setBorder(this.moduloConstantesFunciones.resaltarFK_IdTipoTeclaMascaraModulo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioModulo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasModulo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasModulo.indexOfComponent(this.jPanelBusquedaPorIdSistemaPorNombreModulo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasModulo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.moduloConstantesFunciones.mostrarBusquedaPorIdSistemaPorNombreModulo);
			if(!this.moduloConstantesFunciones.mostrarBusquedaPorIdSistemaPorNombreModulo && index>-1) {
				this.jTabbedPaneBusquedasModulo.remove(index);
			}

			index= this.jTabbedPaneBusquedasModulo.indexOfComponent(this.jPanelFK_IdSistemaModulo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasModulo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.moduloConstantesFunciones.mostrarFK_IdSistemaModulo);
			if(!this.moduloConstantesFunciones.mostrarFK_IdSistemaModulo && index>-1) {
				this.jTabbedPaneBusquedasModulo.remove(index);
			}

			index= this.jTabbedPaneBusquedasModulo.indexOfComponent(this.jPanelFK_IdTipoTeclaMascaraModulo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasModulo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.moduloConstantesFunciones.mostrarFK_IdTipoTeclaMascaraModulo);
			if(!this.moduloConstantesFunciones.mostrarFK_IdTipoTeclaMascaraModulo && index>-1) {
				this.jTabbedPaneBusquedasModulo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioModulo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasModulo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasModulo.indexOfComponent(this.jPanelBusquedaPorIdSistemaPorNombreModulo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasModulo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.moduloConstantesFunciones.activarBusquedaPorIdSistemaPorNombreModulo);
				this.jTabbedPaneBusquedasModulo.setEnabledAt(index,this.moduloConstantesFunciones.activarBusquedaPorIdSistemaPorNombreModulo);
			}

			index= this.jTabbedPaneBusquedasModulo.indexOfComponent(this.jPanelFK_IdSistemaModulo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasModulo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.moduloConstantesFunciones.activarFK_IdSistemaModulo);
				this.jTabbedPaneBusquedasModulo.setEnabledAt(index,this.moduloConstantesFunciones.activarFK_IdSistemaModulo);
			}

			index= this.jTabbedPaneBusquedasModulo.indexOfComponent(this.jPanelFK_IdTipoTeclaMascaraModulo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasModulo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.moduloConstantesFunciones.activarFK_IdTipoTeclaMascaraModulo);
				this.jTabbedPaneBusquedasModulo.setEnabledAt(index,this.moduloConstantesFunciones.activarFK_IdTipoTeclaMascaraModulo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaModulo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdSistemaPorNombre")) {
			index= this.jTabbedPaneBusquedasModulo.indexOfComponent(this.jPanelBusquedaPorIdSistemaPorNombreModulo);

			this.jTabbedPaneBusquedasModulo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasModulo.getComponent(index);

			this.moduloConstantesFunciones.setResaltarBusquedaPorIdSistemaPorNombreModulo(resaltar);

			jPanel.setBorder(this.moduloConstantesFunciones.resaltarBusquedaPorIdSistemaPorNombreModulo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdSistema")) {
			index= this.jTabbedPaneBusquedasModulo.indexOfComponent(this.jPanelFK_IdSistemaModulo);

			this.jTabbedPaneBusquedasModulo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasModulo.getComponent(index);

			this.moduloConstantesFunciones.setResaltarFK_IdSistemaModulo(resaltar);

			jPanel.setBorder(this.moduloConstantesFunciones.resaltarFK_IdSistemaModulo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoTeclaMascara")) {
			index= this.jTabbedPaneBusquedasModulo.indexOfComponent(this.jPanelFK_IdTipoTeclaMascaraModulo);

			this.jTabbedPaneBusquedasModulo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasModulo.getComponent(index);

			this.moduloConstantesFunciones.setResaltarFK_IdTipoTeclaMascaraModulo(resaltar);

			jPanel.setBorder(this.moduloConstantesFunciones.resaltarFK_IdTipoTeclaMascaraModulo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarModulo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioModulo() throws Exception {

		if(this.jInternalFrameDetalleFormModulo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioModulo();
		this.updateVisibilidadResaltarControlesFormularioModulo();
		this.updateHabilitarResaltarControlesFormularioModulo();
		
	}
	
	public void updateBorderResaltarControlesFormularioModulo() throws Exception {
		if(this.jInternalFrameDetalleFormModulo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.moduloConstantesFunciones.resaltaridModulo!=null && this.jInternalFrameDetalleFormModulo!=null) {this.jInternalFrameDetalleFormModulo.jTextFieldidModulo.setBorder(this.moduloConstantesFunciones.resaltaridModulo);}
		if(this.moduloConstantesFunciones.resaltarid_sistemaModulo!=null && this.jInternalFrameDetalleFormModulo!=null) {this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.setBorder(this.moduloConstantesFunciones.resaltarid_sistemaModulo);}
		if(this.moduloConstantesFunciones.resaltarid_paqueteModulo!=null && this.jInternalFrameDetalleFormModulo!=null) {this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo.setBorder(this.moduloConstantesFunciones.resaltarid_paqueteModulo);}
		if(this.moduloConstantesFunciones.resaltarcodigoModulo!=null && this.jInternalFrameDetalleFormModulo!=null) {this.jInternalFrameDetalleFormModulo.jTextFieldcodigoModulo.setBorder(this.moduloConstantesFunciones.resaltarcodigoModulo);}
		if(this.moduloConstantesFunciones.resaltarnombreModulo!=null && this.jInternalFrameDetalleFormModulo!=null) {this.jInternalFrameDetalleFormModulo.jTextAreanombreModulo.setBorder(this.moduloConstantesFunciones.resaltarnombreModulo);}
		if(this.moduloConstantesFunciones.resaltarid_tipo_tecla_mascaraModulo!=null && this.jInternalFrameDetalleFormModulo!=null) {this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo.setBorder(this.moduloConstantesFunciones.resaltarid_tipo_tecla_mascaraModulo);}
		if(this.moduloConstantesFunciones.resaltarteclaModulo!=null && this.jInternalFrameDetalleFormModulo!=null) {this.jInternalFrameDetalleFormModulo.jTextFieldteclaModulo.setBorder(this.moduloConstantesFunciones.resaltarteclaModulo);}
		if(this.moduloConstantesFunciones.resaltarestadoModulo!=null && this.jInternalFrameDetalleFormModulo!=null) {this.jInternalFrameDetalleFormModulo.jCheckBoxestadoModulo.setBorderPainted(true);this.jInternalFrameDetalleFormModulo.jCheckBoxestadoModulo.setBorder(this.moduloConstantesFunciones.resaltarestadoModulo);}
		if(this.moduloConstantesFunciones.resaltarordenModulo!=null && this.jInternalFrameDetalleFormModulo!=null) {this.jInternalFrameDetalleFormModulo.jTextFieldordenModulo.setBorder(this.moduloConstantesFunciones.resaltarordenModulo);}
		if(this.moduloConstantesFunciones.resaltardescripcionModulo!=null && this.jInternalFrameDetalleFormModulo!=null) {this.jInternalFrameDetalleFormModulo.jTextAreadescripcionModulo.setBorder(this.moduloConstantesFunciones.resaltardescripcionModulo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioModulo() throws Exception {		
		if(this.jInternalFrameDetalleFormModulo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormModulo!=null) {
	
		//this.jInternalFrameDetalleFormModulo.jTextFieldidModulo.setVisible(this.moduloConstantesFunciones.mostraridModulo);
		this.jInternalFrameDetalleFormModulo.jPanelidModulo.setVisible(this.moduloConstantesFunciones.mostraridModulo);
		//this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.setVisible(this.moduloConstantesFunciones.mostrarid_sistemaModulo);
		this.jInternalFrameDetalleFormModulo.jPanelid_sistemaModulo.setVisible(this.moduloConstantesFunciones.mostrarid_sistemaModulo);
		//this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo.setVisible(this.moduloConstantesFunciones.mostrarid_paqueteModulo);
		this.jInternalFrameDetalleFormModulo.jPanelid_paqueteModulo.setVisible(this.moduloConstantesFunciones.mostrarid_paqueteModulo);
		//this.jInternalFrameDetalleFormModulo.jTextFieldcodigoModulo.setVisible(this.moduloConstantesFunciones.mostrarcodigoModulo);
		this.jInternalFrameDetalleFormModulo.jPanelcodigoModulo.setVisible(this.moduloConstantesFunciones.mostrarcodigoModulo);
		//this.jInternalFrameDetalleFormModulo.jTextAreanombreModulo.setVisible(this.moduloConstantesFunciones.mostrarnombreModulo);
		this.jInternalFrameDetalleFormModulo.jPanelnombreModulo.setVisible(this.moduloConstantesFunciones.mostrarnombreModulo);
		//this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo.setVisible(this.moduloConstantesFunciones.mostrarid_tipo_tecla_mascaraModulo);
		this.jInternalFrameDetalleFormModulo.jPanelid_tipo_tecla_mascaraModulo.setVisible(this.moduloConstantesFunciones.mostrarid_tipo_tecla_mascaraModulo);
		//this.jInternalFrameDetalleFormModulo.jTextFieldteclaModulo.setVisible(this.moduloConstantesFunciones.mostrarteclaModulo);
		this.jInternalFrameDetalleFormModulo.jPanelteclaModulo.setVisible(this.moduloConstantesFunciones.mostrarteclaModulo);
		//this.jInternalFrameDetalleFormModulo.jCheckBoxestadoModulo.setVisible(this.moduloConstantesFunciones.mostrarestadoModulo);
		this.jInternalFrameDetalleFormModulo.jPanelestadoModulo.setVisible(this.moduloConstantesFunciones.mostrarestadoModulo);
		//this.jInternalFrameDetalleFormModulo.jTextFieldordenModulo.setVisible(this.moduloConstantesFunciones.mostrarordenModulo);
		this.jInternalFrameDetalleFormModulo.jPanelordenModulo.setVisible(this.moduloConstantesFunciones.mostrarordenModulo);
		//this.jInternalFrameDetalleFormModulo.jTextAreadescripcionModulo.setVisible(this.moduloConstantesFunciones.mostrardescripcionModulo);
		this.jInternalFrameDetalleFormModulo.jPaneldescripcionModulo.setVisible(this.moduloConstantesFunciones.mostrardescripcionModulo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioModulo() throws Exception {
		if(this.jInternalFrameDetalleFormModulo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormModulo!=null) {
	
		this.jInternalFrameDetalleFormModulo.jTextFieldidModulo.setEnabled(this.moduloConstantesFunciones.activaridModulo);
		this.jInternalFrameDetalleFormModulo.jComboBoxid_sistemaModulo.setEnabled(this.moduloConstantesFunciones.activarid_sistemaModulo);
		this.jInternalFrameDetalleFormModulo.jComboBoxid_paqueteModulo.setEnabled(this.moduloConstantesFunciones.activarid_paqueteModulo);
		this.jInternalFrameDetalleFormModulo.jTextFieldcodigoModulo.setEnabled(this.moduloConstantesFunciones.activarcodigoModulo);
		this.jInternalFrameDetalleFormModulo.jTextAreanombreModulo.setEnabled(this.moduloConstantesFunciones.activarnombreModulo);
		this.jInternalFrameDetalleFormModulo.jComboBoxid_tipo_tecla_mascaraModulo.setEnabled(this.moduloConstantesFunciones.activarid_tipo_tecla_mascaraModulo);
		this.jInternalFrameDetalleFormModulo.jTextFieldteclaModulo.setEnabled(this.moduloConstantesFunciones.activarteclaModulo);
		this.jInternalFrameDetalleFormModulo.jCheckBoxestadoModulo.setEnabled(this.moduloConstantesFunciones.activarestadoModulo);
		this.jInternalFrameDetalleFormModulo.jTextFieldordenModulo.setEnabled(this.moduloConstantesFunciones.activarordenModulo);
		this.jInternalFrameDetalleFormModulo.jTextAreadescripcionModulo.setEnabled(this.moduloConstantesFunciones.activardescripcionModulo);
		}
	}
	
		
}