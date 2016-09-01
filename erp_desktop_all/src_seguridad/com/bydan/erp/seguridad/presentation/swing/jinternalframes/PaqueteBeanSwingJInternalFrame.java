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

import com.bydan.erp.seguridad.util.PaqueteConstantesFunciones;
import com.bydan.erp.seguridad.util.PaqueteParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.PaqueteParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.PaqueteBean;
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
public class PaqueteBeanSwingJInternalFrame extends PaqueteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PaqueteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Paquete> paqueteValidator = new ClassValidator<Paquete>(Paquete.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Paquete paquete;	
	public Paquete paqueteAux;
	public Paquete paqueteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Paquete paqueteTotales;
	public Long idPaqueteActual;
	public Long iIdNuevoPaquete=0L;
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
	
	public Boolean isPermisoTodoPaquete;
	public Boolean isPermisoNuevoPaquete;
	public Boolean isPermisoActualizarPaquete;
	public Boolean isPermisoActualizarOriginalPaquete;
	public Boolean isPermisoEliminarPaquete;
	public Boolean isPermisoGuardarCambiosPaquete;
	public Boolean isPermisoConsultaPaquete;
	public Boolean isPermisoBusquedaPaquete;
	public Boolean isPermisoReportePaquete;
	public Boolean isPermisoPaginacionMedioPaquete;
	public Boolean isPermisoPaginacionAltoPaquete;
	public Boolean isPermisoPaginacionTodoPaquete;
	public Boolean isPermisoCopiarPaquete;
	public Boolean isPermisoVerFormPaquete;
	public Boolean isPermisoDuplicarPaquete;
	public Boolean isPermisoOrdenPaquete;
	
	
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
	
	public PaqueteParameterReturnGeneral paqueteReturnGeneral;
	public PaqueteParameterReturnGeneral paqueteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPaquete=false;
	public Boolean esParaAccionDesdeFormularioPaquete=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PaqueteSessionBeanAdditional paqueteSessionBeanAdditional=null;
	
	public PaqueteSessionBeanAdditional getPaqueteSessionBeanAdditional() {
		return this.paqueteSessionBeanAdditional;
	}
	
	public void setPaqueteSessionBeanAdditional(PaqueteSessionBeanAdditional paqueteSessionBeanAdditional) {
		try {
			this.paqueteSessionBeanAdditional=paqueteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PaqueteBeanSwingJInternalFrameAdditional paqueteBeanSwingJInternalFrameAdditional=null;
	//public class PaqueteBeanSwingJInternalFrame
	
	public PaqueteBeanSwingJInternalFrameAdditional getPaqueteBeanSwingJInternalFrameAdditional() {
		return this.paqueteBeanSwingJInternalFrameAdditional;
	}
	
	public void setPaqueteBeanSwingJInternalFrameAdditional(PaqueteBeanSwingJInternalFrameAdditional paqueteBeanSwingJInternalFrameAdditional) {
		try {
			this.paqueteBeanSwingJInternalFrameAdditional=paqueteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PaqueteLogic paqueteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Paquete paqueteBean;
	public PaqueteConstantesFunciones paqueteConstantesFunciones;
	//public PaqueteParameterReturnGeneral paqueteReturnGeneral;
	
	//FK
	
	public SistemaLogic sistemaLogic;
	
	//PARAMETROS
	
	
	//public List<Paquete> paquetes;	
	//public List<Paquete> paquetesEliminados;
	//public List<Paquete> paquetesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPaquete=false;
	public Boolean isVisibilidadCeldaDuplicarPaquete=true;
	public Boolean isVisibilidadCeldaCopiarPaquete=true;
	public Boolean isVisibilidadCeldaVerFormPaquete=true;
	public Boolean isVisibilidadCeldaOrdenPaquete=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPaquete=false;
	public Boolean isVisibilidadCeldaModificarPaquete=false;
	public Boolean isVisibilidadCeldaActualizarPaquete=false;
	public Boolean isVisibilidadCeldaEliminarPaquete=false;
	public Boolean isVisibilidadCeldaCancelarPaquete=false;
	public Boolean isVisibilidadCeldaGuardarPaquete=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPaquete=false;	
	
	
	public Boolean isVisibilidadFK_IdSistema=false;
	
	public Long getiIdNuevoPaquete() {
		return this.iIdNuevoPaquete;
	}

	public void setiIdNuevoPaquete(Long iIdNuevoPaquete) {
		this.iIdNuevoPaquete = iIdNuevoPaquete;
	}
	
	public Long getidPaqueteActual() {
		return this.idPaqueteActual;
	}

	public void setidPaqueteActual(Long idPaqueteActual) {
		this.idPaqueteActual = idPaqueteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Paquete getpaquete() {
		return this.paquete;
	}

	public void setpaquete(Paquete paquete) {
		this.paquete = paquete;
	}
	
	public Paquete getpaqueteAux() {
		return this.paqueteAux;
	}

	public void setpaqueteAux(Paquete paqueteAux) {
		this.paqueteAux = paqueteAux;
	}				
	
	public Paquete getpaqueteAnterior() {
		return this.paqueteAnterior;
	}

	public void setpaqueteAnterior(Paquete paqueteAnterior) {
		this.paqueteAnterior = paqueteAnterior;
	}	
	
	public Paquete getpaqueteTotales() {
		return this.paqueteTotales;
	}

	public void setpaqueteTotales(Paquete paqueteTotales) {
		this.paqueteTotales = paqueteTotales;
	}	
	
	public Paquete getpaqueteBean() {
		return this.paqueteBean;
	}

	public void setpaqueteBean(Paquete paqueteBean) {
		this.paqueteBean = paqueteBean;
	}	
	
	public PaqueteParameterReturnGeneral getpaqueteReturnGeneral() {
		return this.paqueteReturnGeneral;
	}

	public void setpaqueteReturnGeneral(PaqueteParameterReturnGeneral paqueteReturnGeneral) {
		this.paqueteReturnGeneral = paqueteReturnGeneral;
	}	
	
	
	public Long id_sistemaFK_IdSistema=-1L;

	public Long getid_sistemaFK_IdSistema() {
		return this.id_sistemaFK_IdSistema;
	}

	public void setid_sistemaFK_IdSistema(Long id_sistemaFK_IdSistema) {
		this.id_sistemaFK_IdSistema = id_sistemaFK_IdSistema;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PaqueteLogic getPaqueteLogic()	{		
		return paqueteLogic;
	}

	public void setPaqueteLogic(PaqueteLogic paqueteLogic) {
		this.paqueteLogic = paqueteLogic;
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
	
	public Boolean getIsEsNuevoPaquete() {
		return isEsNuevoPaquete;
	}

	public void setIsEsNuevoPaquete(Boolean isEsNuevoPaquete) {
		this.isEsNuevoPaquete = isEsNuevoPaquete;
	}

	public Boolean getEsParaAccionDesdeFormularioPaquete() {
		return esParaAccionDesdeFormularioPaquete;
	}
	
	public void setEsParaAccionDesdeFormularioPaquete(Boolean esParaAccionDesdeFormularioPaquete) {
		this.esParaAccionDesdeFormularioPaquete = esParaAccionDesdeFormularioPaquete;
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

			if(this.paqueteSessionBean==null) {
				this.paqueteSessionBean=new PaqueteSessionBean();
			}

			if(!this.paqueteSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {
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
					sistemaLogic.getEntityWithConnection(paqueteSessionBean.getlidSistemaActual());
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

					if(this.paquete!=null) {
						this.paquete.setSistema(sistemaTemp);
					}

					if(this.jInternalFrameDetalleFormPaquete!=null) {
						this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete.setSelectedItem(sistemaTemp);
					}
				} else {
					//jComboBoxid_sistemaPaquete.setSelectedItem(sistemaTemp);
					if(this.jInternalFrameDetalleFormPaquete!=null) {
						if(this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete.getItemCount()>0) {
							this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdSistema") || sFormularioTipoBusqueda.equals("Todos")){
					if(sistemaTemp!=null && jComboBoxid_sistemaFK_IdSistemaPaquete!=null) {
						jComboBoxid_sistemaFK_IdSistemaPaquete.setSelectedItem(sistemaTemp);
					} else {
						if(jComboBoxid_sistemaFK_IdSistemaPaquete!=null) {
							//jComboBoxid_sistemaFK_IdSistemaPaquete.setSelectedItem(sistemaTemp);
							if(jComboBoxid_sistemaFK_IdSistemaPaquete.getItemCount()>0) {
								jComboBoxid_sistemaFK_IdSistemaPaquete.setSelectedIndex(0);
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
	public void setActualSistemaForeignKeyGenerico(Long idSistemaSeleccionado,JComboBox jComboBoxid_sistemaPaqueteGenerico)throws Exception
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
				jComboBoxid_sistemaPaqueteGenerico.setSelectedItem(sistemaTemp);
			} else {
				if(jComboBoxid_sistemaPaqueteGenerico!=null && jComboBoxid_sistemaPaqueteGenerico.getItemCount()>0) {
					jComboBoxid_sistemaPaqueteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSistemaForeignKey(Paquete paquete,JComboBox jComboBoxid_sistemaPaqueteGenerico)throws Exception
	{
		try
		{
			Sistema  sistemaAux=new Sistema();

			if(jComboBoxid_sistemaPaqueteGenerico==null) {
				sistemaAux=(Sistema)this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete.getSelectedItem();
			} else {
				sistemaAux=(Sistema)jComboBoxid_sistemaPaqueteGenerico.getSelectedItem();
			}

			if(sistemaAux!=null && sistemaAux.getId()!=null) {
				paquete.setid_sistema(sistemaAux.getId());
				paquete.setsistema_descripcion(PaqueteConstantesFunciones.getSistemaDescripcion(sistemaAux));
				paquete.setSistema(sistemaAux);			}
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

					if(!PaqueteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPaquete!=null) { 
							this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete.addItem(sistema);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPaquete!=null) { 
					}

					if(!PaqueteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdSistema") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PaqueteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sistemaFK_IdSistemaPaquete.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jComboBoxid_sistemaFK_IdSistemaPaquete.addItem(sistema);
							}
						}

						if(!PaqueteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPaquete!=null) {
							this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete.setSelectedItem(sistema);
						}
					} else {
						if(this.jInternalFrameDetalleFormPaquete!=null) {
							this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_sistemaFK_IdSistemaPaquete.setSelectedItem(sistema);
						} else {
							this.jComboBoxid_sistemaFK_IdSistemaPaquete.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPaquete() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PaqueteConstantesFunciones.refrescarForeignKeysDescripcionesPaquete(this.paqueteLogic.getPaquetes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PaqueteConstantesFunciones.refrescarForeignKeysDescripcionesPaquete(this.paquetes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Sistema.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//paqueteLogic.setPaquetes(this.paquetes);
			paqueteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PaqueteParameterReturnGeneral getPaqueteParameterGeneral() {
		return this.paqueteParameterGeneral;
	}
	
	public void setPaqueteParameterGeneral(PaqueteParameterReturnGeneral paqueteParameterGeneral) {
		this.paqueteParameterGeneral = paqueteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPaquete() {
		return isPermisoTodoPaquete;
	}

	public void setIsPermisoTodoPaquete(Boolean isPermisoTodoPaquete) {
		this.isPermisoTodoPaquete = isPermisoTodoPaquete;
	}

	public Boolean getIsPermisoNuevoPaquete() {
		return isPermisoNuevoPaquete;
	}

	public void setIsPermisoNuevoPaquete(Boolean isPermisoNuevoPaquete) {
		this.isPermisoNuevoPaquete = isPermisoNuevoPaquete;
	}

	public Boolean getIsPermisoActualizarPaquete() {
		return isPermisoActualizarPaquete;
	}

	public void setIsPermisoActualizarPaquete(Boolean isPermisoActualizarPaquete) {
		this.isPermisoActualizarPaquete = isPermisoActualizarPaquete;
	}

	public Boolean getIsPermisoEliminarPaquete() {
		return isPermisoEliminarPaquete;
	}

	public void setIsPermisoEliminarPaquete(Boolean isPermisoEliminarPaquete) {
		this.isPermisoEliminarPaquete = isPermisoEliminarPaquete;
	}

	public Boolean getIsPermisoGuardarCambiosPaquete() {
		return isPermisoGuardarCambiosPaquete;
	}

	public void setIsPermisoGuardarCambiosPaquete(Boolean isPermisoGuardarCambiosPaquete) {
		this.isPermisoGuardarCambiosPaquete = isPermisoGuardarCambiosPaquete;
	}
	
	public Boolean getIsPermisoConsultaPaquete() {
		return isPermisoConsultaPaquete;
	}

	public void setIsPermisoConsultaPaquete(Boolean isPermisoConsultaPaquete) {
		this.isPermisoConsultaPaquete = isPermisoConsultaPaquete;
	}

	public Boolean getIsPermisoBusquedaPaquete() {
		return isPermisoBusquedaPaquete;
	}

	public void setIsPermisoBusquedaPaquete(Boolean isPermisoBusquedaPaquete) {
		this.isPermisoBusquedaPaquete = isPermisoBusquedaPaquete;
	}

	public Boolean getIsPermisoReportePaquete() {
		return isPermisoReportePaquete;
	}

	public void setIsPermisoReportePaquete(Boolean isPermisoReportePaquete) {
		this.isPermisoReportePaquete = isPermisoReportePaquete;
	}
	
	public Boolean getIsPermisoPaginacionMedioPaquete() {
		return isPermisoPaginacionMedioPaquete;
	}

	public void setIsPermisoPaginacionMedioPaquete(Boolean isPermisoPaginacionMedioPaquete) {
		this.isPermisoPaginacionMedioPaquete = isPermisoPaginacionMedioPaquete;
	}
	
	public Boolean getIsPermisoPaginacionTodoPaquete() {
		return isPermisoPaginacionTodoPaquete;
	}

	public void setIsPermisoPaginacionTodoPaquete(Boolean isPermisoPaginacionTodoPaquete) {
		this.isPermisoPaginacionTodoPaquete = isPermisoPaginacionTodoPaquete;
	}
	
	public Boolean getIsPermisoPaginacionAltoPaquete() {
		return isPermisoPaginacionAltoPaquete;
	}

	public void setIsPermisoPaginacionAltoPaquete(Boolean isPermisoPaginacionAltoPaquete) {
		this.isPermisoPaginacionAltoPaquete = isPermisoPaginacionAltoPaquete;
	}
	
	public Boolean getIsPermisoCopiarPaquete() {
		return isPermisoCopiarPaquete;
	}

	public void setIsPermisoCopiarPaquete(Boolean isPermisoCopiarPaquete) {
		this.isPermisoCopiarPaquete = isPermisoCopiarPaquete;
	}
	
	public Boolean getIsPermisoVerFormPaquete() {
		return isPermisoVerFormPaquete;
	}

	public void setIsPermisoVerFormPaquete(Boolean isPermisoVerFormPaquete) {
		this.isPermisoVerFormPaquete = isPermisoVerFormPaquete;
	}
	
	public Boolean getIsPermisoDuplicarPaquete() {
		return isPermisoDuplicarPaquete;
	}

	public void setIsPermisoDuplicarPaquete(Boolean isPermisoDuplicarPaquete) {
		this.isPermisoDuplicarPaquete = isPermisoDuplicarPaquete;
	}
	
	public Boolean getIsPermisoOrdenPaquete() {
		return isPermisoOrdenPaquete;
	}

	public void setIsPermisoOrdenPaquete(Boolean isPermisoOrdenPaquete) {
		this.isPermisoOrdenPaquete = isPermisoOrdenPaquete;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPaquete() {
		return isVisibilidadCeldaNuevoPaquete;
	}

	public void setIsVisibilidadCeldaNuevoPaquete(Boolean isVisibilidadCeldaNuevoPaquete) {
		this.isVisibilidadCeldaNuevoPaquete = isVisibilidadCeldaNuevoPaquete;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPaquete() {
		return isVisibilidadCeldaDuplicarPaquete;
	}

	public void setIsVisibilidadCeldaDuplicarPaquete(Boolean isVisibilidadCeldaDuplicarPaquete) {
		this.isVisibilidadCeldaDuplicarPaquete = isVisibilidadCeldaDuplicarPaquete;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPaquete() {
		return isVisibilidadCeldaCopiarPaquete;
	}

	public void setIsVisibilidadCeldaCopiarPaquete(Boolean isVisibilidadCeldaCopiarPaquete) {
		this.isVisibilidadCeldaCopiarPaquete = isVisibilidadCeldaCopiarPaquete;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPaquete() {
		return isVisibilidadCeldaVerFormPaquete;
	}

	public void setIsVisibilidadCeldaVerFormPaquete(Boolean isVisibilidadCeldaVerFormPaquete) {
		this.isVisibilidadCeldaVerFormPaquete = isVisibilidadCeldaVerFormPaquete;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPaquete() {
		return isVisibilidadCeldaOrdenPaquete;
	}

	public void setIsVisibilidadCeldaOrdenPaquete(Boolean isVisibilidadCeldaOrdenPaquete) {
		this.isVisibilidadCeldaOrdenPaquete = isVisibilidadCeldaOrdenPaquete;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPaquete() {
		return isVisibilidadCeldaNuevoRelacionesPaquete;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPaquete(Boolean isVisibilidadCeldaNuevoRelacionesPaquete) {
		this.isVisibilidadCeldaNuevoRelacionesPaquete = isVisibilidadCeldaNuevoRelacionesPaquete;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPaquete() {
		return isVisibilidadCeldaModificarPaquete;
	}

	public void setIsVisibilidadCeldaModificarPaquete(Boolean isVisibilidadCeldaModificarPaquete) {
		this.isVisibilidadCeldaModificarPaquete = isVisibilidadCeldaModificarPaquete;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPaquete() {
		return isVisibilidadCeldaActualizarPaquete;
	}

	public void setIsVisibilidadCeldaActualizarPaquete(Boolean isVisibilidadCeldaActualizarPaquete) {
		this.isVisibilidadCeldaActualizarPaquete = isVisibilidadCeldaActualizarPaquete;
	}

	public Boolean getIsVisibilidadCeldaEliminarPaquete() {
		return isVisibilidadCeldaEliminarPaquete;
	}

	public void setIsVisibilidadCeldaEliminarPaquete(Boolean isVisibilidadCeldaEliminarPaquete) {
		this.isVisibilidadCeldaEliminarPaquete = isVisibilidadCeldaEliminarPaquete;
	}

	public Boolean getIsVisibilidadCeldaCancelarPaquete() {
		return isVisibilidadCeldaCancelarPaquete;
	}

	public void setIsVisibilidadCeldaCancelarPaquete(Boolean isVisibilidadCeldaCancelarPaquete) {
		this.isVisibilidadCeldaCancelarPaquete = isVisibilidadCeldaCancelarPaquete;
	}

	public Boolean getIsVisibilidadCeldaGuardarPaquete() {
		return isVisibilidadCeldaGuardarPaquete;
	}

	public void setIsVisibilidadCeldaGuardarPaquete(Boolean isVisibilidadCeldaGuardarPaquete) {
		this.isVisibilidadCeldaGuardarPaquete = isVisibilidadCeldaGuardarPaquete;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPaquete() {
		return isVisibilidadCeldaGuardarCambiosPaquete;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPaquete(Boolean isVisibilidadCeldaGuardarCambiosPaquete) {
		this.isVisibilidadCeldaGuardarCambiosPaquete = isVisibilidadCeldaGuardarCambiosPaquete;
	}
		
	public PaqueteSessionBean getpaqueteSessionBean() {
		return this.paqueteSessionBean;
	}
	
	public void setpaqueteSessionBean(PaqueteSessionBean paqueteSessionBean) {
		this.paqueteSessionBean=paqueteSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdSistema() {
		return this.isVisibilidadFK_IdSistema;
	}

	public void setisVisibilidadFK_IdSistema(Boolean isVisibilidadFK_IdSistema) {
		this.isVisibilidadFK_IdSistema=isVisibilidadFK_IdSistema;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPaquete(Paquete paquete)throws Exception {
		try {
			
				this.setActualParaGuardarSistemaForeignKey(paquete,null);
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
	
	public void bugActualizarReferenciaActual(Paquete paquete,Paquete paqueteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPaquete(paquete);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		paqueteAux.setId(paquete.getId());
		paqueteAux.setVersionRow(paquete.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPaquete();
		
			int intSelectedRow = this.jTableDatosPaquete.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PaqueteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPaquete(this.paquete,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = paqueteValidator.getInvalidValues(this.paquete);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			paqueteLogic.setDatosCliente(datosCliente);
			paqueteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				paqueteAux=new  Paquete();
				
				paqueteAux.setIsNew(true);
				paqueteAux.setIsChanged(true);
				
				paqueteAux.setPaqueteOriginal(this.paquete);
				
				paqueteAux.setId(this.paquete.getId());	
				paqueteAux.setVersionRow(this.paquete.getVersionRow());	
				paqueteAux.setid_sistema(this.paquete.getid_sistema());	
				paqueteAux.setnombre(this.paquete.getnombre());	
				paqueteAux.setdescripcion(this.paquete.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.paqueteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.paqueteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(paqueteAux,paqueteLogic.getPaquetes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(paqueteAux,paquetes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.paqueteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.paqueteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						paqueteLogic.savePaquetes();//WithConnection
						//paqueteLogic.getSetVersionRowPaquetes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.paquete,paqueteAux);
					
					this.refrescarForeignKeysDescripcionesPaquete();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.paqueteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								paqueteLogic.savePaqueteRelaciones(paqueteAux);//WithConnection
								//paqueteLogic.getSetVersionRowPaquetes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.paquete,paqueteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.paqueteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.paqueteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(paqueteAux,paqueteLogic.getPaquetes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(paqueteAux,paquetes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.paquete,paqueteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				paqueteAux=new  Paquete();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.paqueteSessionBean.getEsGuardarRelacionado() 
					|| (this.paqueteSessionBean.getEsGuardarRelacionado() && this.paquete.getId()>=0)) {
						
					paqueteAux.setIsNew(false);
				}
				
				paqueteAux.setIsDeleted(false);
			
				paqueteAux.setId(this.paquete.getId());	
				paqueteAux.setVersionRow(this.paquete.getVersionRow());	
				paqueteAux.setid_sistema(this.paquete.getid_sistema());	
				paqueteAux.setnombre(this.paquete.getnombre());	
				paqueteAux.setdescripcion(this.paquete.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(paqueteAux,paqueteLogic.getPaquetes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(paqueteAux,paquetes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.paqueteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.paqueteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						paqueteLogic.savePaquetes();//WithConnection
						//paqueteLogic.getSetVersionRowPaquetes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.paquete,paqueteAux);
					
					this.refrescarForeignKeysDescripcionesPaquete();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.paqueteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								paqueteLogic.savePaqueteRelaciones(paqueteAux);//WithConnection
								//paqueteLogic.getSetVersionRowPaquetes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.paquete,paqueteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.paqueteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.paqueteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(paqueteAux,paqueteLogic.getPaquetes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(paqueteAux,paquetes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.paquete,paqueteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				paqueteAux=new  Paquete();
				
				paqueteAux.setIsNew(false);
				paqueteAux.setIsChanged(false);
				
				paqueteAux.setIsDeleted(true);
				
				paqueteAux.setId(this.paquete.getId());	
				paqueteAux.setVersionRow(this.paquete.getVersionRow());	
				paqueteAux.setid_sistema(this.paquete.getid_sistema());	
				paqueteAux.setnombre(this.paquete.getnombre());	
				paqueteAux.setdescripcion(this.paquete.getdescripcion());	
				
				if(this.paqueteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.paqueteAux.getId()>=0) {	
						this.paquetesEliminados.add(paqueteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(paqueteAux,paqueteLogic.getPaquetes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(paqueteAux,paquetes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.paqueteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.paqueteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						paqueteLogic.savePaquetes();//WithConnection
						//paqueteLogic.getSetVersionRowPaquetes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.paqueteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								paqueteLogic.savePaqueteRelaciones(paqueteAux);//WithConnection
								//paqueteLogic.getSetVersionRowPaquetes();//WithConnection
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
							if(this.paqueteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.paqueteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(paqueteAux,paqueteLogic.getPaquetes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(paqueteAux,paquetes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.getPaquetes().addAll(this.paquetesEliminados);
					
					paqueteLogic.savePaquetes();//WithConnection
					//paqueteLogic.getSetVersionRowPaquetes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPaquete();
				
				this.paquetesEliminados= new ArrayList<Paquete>();		
			}
			
			if(this.paqueteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paqueteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Paquete GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Paquete",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.paquete=paqueteAux;
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
      		//this.finishProcessPaquete();
      	}
		
	}	
	
	public void actualizarRelaciones(Paquete paqueteLocal) throws Exception {
		
		if(this.paqueteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Paquete paqueteLocal) throws Exception {	
		if(this.paqueteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(SistemaDetalleFormJInternalFrame.class)) {
				SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrameLocal=(SistemaBeanSwingJInternalFrame) ((SistemaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sistemaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSistema(sistemaBeanSwingJInternalFrameLocal.getsistema(),true);
				sistemaBeanSwingJInternalFrameLocal.actualizarLista(sistemaBeanSwingJInternalFrameLocal.sistema,this.sistemasForeignKey);

				sistemaBeanSwingJInternalFrameLocal.actualizarRelaciones(sistemaBeanSwingJInternalFrameLocal.sistema);

				paqueteLocal.setSistema(sistemaBeanSwingJInternalFrameLocal.sistema);

				this.addItemDefectoCombosForeignKeySistema();
				this.cargarCombosFrameSistemasForeignKey("Formulario");
				this.setActualSistemaForeignKey(sistemaBeanSwingJInternalFrameLocal.sistema.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPaqueteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPaquete.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = paqueteValidator.getInvalidValues(this.paquete);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Paquete paquete,List<Paquete> paquetes) throws Exception {
		try	{		
			PaqueteConstantesFunciones.actualizarLista(paquete,paquetes,this.paqueteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Paquete paquete,List<Paquete> paquetes) throws Exception {
		try	{			
			PaqueteConstantesFunciones.actualizarSelectedLista(paquete,paquetes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Paquete> paquetesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				paquetesLocal=this.paqueteLogic.getPaquetes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				paquetesLocal=this.paquetes;
			}
			//ARCHITECTURE
		
			for(Paquete paqueteLocal:paquetesLocal) {
				if(this.permiteMantenimiento(paqueteLocal) && paqueteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PaqueteConstantesFunciones.getPaqueteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PaqueteConstantesFunciones.IDSISTEMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPaquete.jLabelid_sistemaPaquete,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PaqueteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPaquete.jLabelnombrePaquete,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PaqueteConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPaquete.jLabeldescripcionPaquete,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPaquete!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPaquete.jLabelid_sistemaPaquete,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPaquete.jLabelnombrePaquete,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPaquete.jLabeldescripcionPaquete,"");
		
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
		this.iIdNuevoPaquete--;	
		
		
		this.paqueteAux=new Paquete();
		
		this.paqueteAux.setId(this.iIdNuevoPaquete);
		this.paqueteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.paqueteLogic.getPaquetes().add(this.paqueteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.paquetes.add(this.paqueteAux);
		}
		//ARCHITECTURE
		
		this.paquete=this.paqueteAux;
		
		if(PaqueteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPaquete(this.paquete);
			this.setVariablesObjetoActualToFormularioForeignKeyPaquete(this.paquete);
		}
				
		//this.setDefaultControlesPaquete();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPaquete();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPaquete();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPaquete();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPaquete(this.paqueteBean,this.paquete,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PaqueteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.paqueteSessionBean.getConGuardarRelaciones()) {
			classes=PaqueteConstantesFunciones.getClassesRelationshipsOfPaquete(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.paqueteReturnGeneral=paqueteLogic.procesarEventosPaquetesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.paqueteLogic.getPaquetes(),this.paquete,this.paqueteParameterGeneral,this.isEsNuevoPaquete,classes);//this.paqueteLogic.getPaquete()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPaquete(this.paqueteReturnGeneral,this.paqueteBean,false);
		
		if(this.paqueteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPaquete(this.paqueteReturnGeneral.getPaquete());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPaquete(this.paqueteReturnGeneral.getPaquete());
		}
		
		if(this.paqueteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPaquete(this.paqueteReturnGeneral.getPaquete(),classes);//this.paqueteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPaquete(this.paquete,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPaquete();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPaquete();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PaqueteBeanSwingJInternalFrameAdditional.RecargarFormPaquete(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPaquete(false);
						
			if(paqueteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PaqueteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPaquete();
			}
			
			this.actualizarVisualTableDatosPaquete();
			
			this.jTableDatosPaquete.setRowSelectionInterval(this.getIndiceNuevoPaquete(), this.getIndiceNuevoPaquete());
			
			this.seleccionarFilaTablaPaqueteActual();
						
			this.actualizarEstadoCeldasBotonesPaquete("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPaquete(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPaquete.jTextAreanombrePaquete.setEnabled(isHabilitar && this.paqueteConstantesFunciones.activarnombrePaquete);
		this.jInternalFrameDetalleFormPaquete.jTextAreadescripcionPaquete.setEnabled(isHabilitar && this.paqueteConstantesFunciones.activardescripcionPaquete);	
		
		this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete.setEnabled(isHabilitar && this.paqueteConstantesFunciones.activarid_sistemaPaquete);
	};
	
	public void setDefaultControlesPaquete() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPaquete(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.paqueteSessionBean.setConGuardarRelaciones(true);			
			this.paqueteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPaquete.jTabbedPaneRelacionesPaquete.setVisible(true);
			
					
		} else {
			//this.paqueteSessionBean.setConGuardarRelaciones(false);			
			this.paqueteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPaquete.jTabbedPaneRelacionesPaquete.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPaquete() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Paquete paqueteAux:this.paqueteLogic.getPaquetes()) {
				if(paqueteAux.getId().equals(this.iIdNuevoPaquete)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Paquete paqueteAux:this.paquetes) {
				if(paqueteAux.getId().equals(this.iIdNuevoPaquete)) {
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
	
	public int getIndiceActualPaquete(Paquete paquete,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Paquete paqueteAux:this.paqueteLogic.getPaquetes()) {
				if(paqueteAux.getId().equals(paquete.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Paquete paqueteAux:this.paquetes) {
				if(paqueteAux.getId().equals(paquete.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPaquete(Paquete paqueteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Paquete paqueteAux:this.paqueteLogic.getPaquetes()) {
				if(paqueteAux.getPaqueteOriginal().getId().equals(paqueteOriginal.getId())) {
					existe=true;
					paqueteOriginal.setId(paqueteAux.getId());
					paqueteOriginal.setVersionRow(paqueteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Paquete paqueteAux:this.paquetes) {
				if(paqueteAux.getPaqueteOriginal().getId().equals(paqueteOriginal.getId())) {
					existe=true;
					paqueteOriginal.setId(paqueteAux.getId());
					paqueteOriginal.setVersionRow(paqueteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPaquete(Boolean esParaCancelar) throws Exception {
		paquetesAux=new ArrayList<Paquete>();
		paqueteAux=new Paquete();
		
		if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Paquete paqueteAux:this.paqueteLogic.getPaquetes()) {
					if(paqueteAux.getId()<0) {
						paquetesAux.add(paqueteAux);
					}		
				}
				this.iIdNuevoPaquete=0L;
				this.paqueteLogic.getPaquetes().removeAll(paquetesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Paquete paqueteAux:this.paquetes) {
					if(paqueteAux.getId()<0) {
						paquetesAux.add(paqueteAux);
					}		
				}
				this.iIdNuevoPaquete=0L;
				this.paquetes.removeAll(paquetesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPaquete 
					&& this.paqueteLogic.getPaquetes().size()>0
					) {
					paqueteAux=this.paqueteLogic.getPaquetes().get(this.paqueteLogic.getPaquetes().size() - 1);
				
					if(paqueteAux.getId()<0) {
						this.paqueteLogic.getPaquetes().remove(paqueteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPaquete && this.paquetes.size()>0) {
					paqueteAux=this.paquetes.get(this.paquetes.size() - 1);
				
					if(paqueteAux.getId()<0) {
						this.paquetes.remove(paqueteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPaquete(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(paquete.getId()<0) {
				this.paqueteLogic.getPaquetes().remove(this.paquete);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(paquete.getId()<0) {
				this.paquetes.remove(this.paquete);
			}
		}			
	}
	
	public void setEstadosInicialesPaquete(List<Paquete> paquetesAux) throws Exception {
		PaqueteConstantesFunciones.setEstadosInicialesPaquete(paquetesAux);
	}
	
	public void setEstadosInicialesPaquete(Paquete paqueteAux) throws Exception {
		PaqueteConstantesFunciones.setEstadosInicialesPaquete(paqueteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPaqueteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPaquete("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPaqueteActual()) {
				if(!this.isEsNuevoPaquete) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPaquete("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPaquete=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPaqueteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Paquete ?", "MANTENIMIENTO DE Paquete", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPaquete("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Paquete paquete) throws Exception {
		PaqueteConstantesFunciones.seleccionarAsignar(this.paquete,paquete);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPaquete=this.isPermisoActualizarOriginalPaquete;
			
			
			this.seleccionarAsignar(paquete);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PaqueteConstantesFunciones.quitarEspaciosPaquete(this.paquete,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPaquete("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.paqueteSessionBean.setsFuncionBusquedaRapida(this.paqueteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPaquete) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPaquete(esParaCancelar);				
				this.cancelarNuevoPaquete(esParaCancelar);								
			}
			
			this.paquete=new Paquete();
			
			this.inicializarPaquete();
			
			this.actualizarEstadoCeldasBotonesPaquete("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPaquete() throws Exception {
		try {
			PaqueteConstantesFunciones.inicializarPaquete(this.paquete);
			
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
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.paqueteLogic.getPaquetes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePaquetes(String sAccionBusqueda,List<Paquete> paquetesParaReportes) throws Exception {
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
					sPathReporteFinal="Paquete"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PaqueteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PaqueteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Paquete"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Paquetes");		
		parameters.put("busquedapor", PaqueteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePaquete=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PaqueteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PaqueteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePaquete=new JRBeanArrayDataSource(PaqueteJInternalFrame.TraerPaqueteBeans(paquetesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePaquete);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PaqueteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PaqueteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PaqueteBean.TraerPaqueteBeans(paquetesParaReportes).toArray()));
							
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
				this.generarExcelReportePaquetes(sAccionBusqueda,sTipoArchivoReporte,paquetesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPaquetes(sAccionBusqueda,sTipoArchivoReporte,paquetesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPaqueteActionPerformed(null);
					//this.generarExcelReportePaquetes(sAccionBusqueda,sTipoArchivoReporte,paquetesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPaquetes(sAccionBusqueda,sTipoArchivoReporte,paquetesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPaquetes(sAccionBusqueda,sTipoArchivoReporte,paquetesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPaquetes(sAccionBusqueda,sTipoArchivoReporte,paquetesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePaquetes(String sAccionBusqueda,String sTipoArchivoReporte,List<Paquete> paquetesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"paquete";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Paquetes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPaquete("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Paquete paquete : paquetesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PaqueteConstantesFunciones.generarExcelReporteDataPaquete("NORMAL",row,workbook,paquete,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paqueteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Paquete",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPaquete(String sTipo,Row row,Workbook workbook) {
		
		PaqueteConstantesFunciones.generarExcelReporteHeaderPaquete(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPaquetes(String sAccionBusqueda,String sTipoArchivoReporte,List<Paquete> paquetesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"paquete_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Paquetes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Paquete paquete : paquetesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PaqueteConstantesFunciones.getPaqueteDescripcion(paquete));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PaqueteConstantesFunciones.LABEL_IDSISTEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PaqueteConstantesFunciones.LABEL_IDSISTEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(paquete.getsistema_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PaqueteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PaqueteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(paquete.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PaqueteConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PaqueteConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(paquete.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paqueteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Paquete",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPaquetes(String sAccionBusqueda,String sTipoArchivoReporte,List<Paquete> paquetesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Paquete> paquetesRespaldo=null;
		
		classes=PaqueteConstantesFunciones.getClassesRelationshipsOfPaquete(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.paqueteLogic.setDatosCliente(this.datosCliente);
		this.paqueteLogic.setDatosDeep(this.datosDeep);
		this.paqueteLogic.setIsConDeep(true);
		
		paquetesRespaldo=this.paqueteLogic.getPaquetes();
		
		this.paqueteLogic.setPaquetes(paquetesParaReportes);	
		this.paqueteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		paquetesParaReportes=this.paqueteLogic.getPaquetes();
		this.paqueteLogic.setPaquetes(paquetesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"paquete_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Paquetes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPaquete("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Paquete paquete : paquetesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPaquete("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PaqueteConstantesFunciones.generarExcelReporteDataPaquete("NORMAL",row,workbook,paquete,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PaqueteConstantesFunciones.getPaqueteDescripcion(paquete));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paqueteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Paquete",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPaquete.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPaquete.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPaquete.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPaquete.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPaquete() throws Exception {		
		this.startProcessPaquete(true);
	}
	
	public void startProcessPaquete(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPaquete ,this.jPanelParametrosReportesPaquete, this.jScrollPanelDatosPaquete,this.jPanelPaginacionPaquete, this.jScrollPanelDatosEdicionPaquete, this.jPanelAccionesPaquete,this.jPanelAccionesFormularioPaquete,this.jmenuBarPaquete,this.jmenuBarDetallePaquete,this.jTtoolBarPaquete,this.jTtoolBarDetallePaquete);		
		
		final JTabbedPane jTabbedPaneBusquedasPaquete=this.jTabbedPaneBusquedasPaquete; 
		
		final JPanel jPanelParametrosReportesPaquete=this.jPanelParametrosReportesPaquete;
		//final JScrollPane jScrollPanelDatosPaquete=this.jScrollPanelDatosPaquete;
		final JTable jTableDatosPaquete=this.jTableDatosPaquete;		
		final JPanel jPanelPaginacionPaquete=this.jPanelPaginacionPaquete;
		//final JScrollPane jScrollPanelDatosEdicionPaquete=this.jScrollPanelDatosEdicionPaquete;
		final JPanel jPanelAccionesPaquete=this.jPanelAccionesPaquete;
		
		JPanel jPanelCamposAuxiliarPaquete=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPaquete=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPaquete!=null) {
			jPanelCamposAuxiliarPaquete=this.jInternalFrameDetalleFormPaquete.jPanelCamposPaquete;
			jPanelAccionesFormularioAuxiliarPaquete=this.jInternalFrameDetalleFormPaquete.jPanelAccionesFormularioPaquete;
		}
		
		final JPanel jPanelCamposPaquete=jPanelCamposAuxiliarPaquete;
		final JPanel jPanelAccionesFormularioPaquete=jPanelAccionesFormularioAuxiliarPaquete;
		
		
		final JMenuBar jmenuBarPaquete=this.jmenuBarPaquete;
		final JToolBar jTtoolBarPaquete=this.jTtoolBarPaquete;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPaquete=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPaquete=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPaquete!=null) {
			jmenuBarDetalleAuxiliarPaquete=this.jInternalFrameDetalleFormPaquete.jmenuBarDetallePaquete;
			jTtoolBarDetalleAuxiliarPaquete=this.jInternalFrameDetalleFormPaquete.jTtoolBarDetallePaquete;
		}
		
		final JMenuBar jmenuBarDetallePaquete=jmenuBarDetalleAuxiliarPaquete;
		final JToolBar jTtoolBarDetallePaquete=jTtoolBarDetalleAuxiliarPaquete;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPaquete;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPaquete;
			processRunnable.jTableDatos=jTableDatosPaquete;
			processRunnable.jPanelCampos=jPanelCamposPaquete;
			processRunnable.jPanelPaginacion=jPanelPaginacionPaquete;
			processRunnable.jPanelAcciones=jPanelAccionesPaquete;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPaquete;
			
			
			processRunnable.jmenuBar=jmenuBarPaquete;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePaquete;
			processRunnable.jTtoolBar=jTtoolBarPaquete;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePaquete;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPaquete ,jPanelParametrosReportesPaquete,jTableDatosPaquete, /*jScrollPanelDatosPaquete,*/jPanelCamposPaquete,jPanelPaginacionPaquete, /*jScrollPanelDatosEdicionPaquete,*/ jPanelAccionesPaquete,jPanelAccionesFormularioPaquete,jmenuBarPaquete,jmenuBarDetallePaquete,jTtoolBarPaquete,jTtoolBarDetallePaquete);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPaquete ,jPanelParametrosReportesPaquete, jScrollPanelDatosPaquete,jPanelPaginacionPaquete, jScrollPanelDatosEdicionPaquete, jPanelAccionesPaquete,jPanelAccionesFormularioPaquete,jmenuBarPaquete,jmenuBarDetallePaquete,jTtoolBarPaquete,jTtoolBarDetallePaquete);
						
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
	
	public void finishProcessPaquete() {// throws Exception 
		this.finishProcessPaquete(true);
	}
	
	public void finishProcessPaquete(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPaquete ,this.jPanelParametrosReportesPaquete, this.jScrollPanelDatosPaquete,this.jPanelPaginacionPaquete, this.jScrollPanelDatosEdicionPaquete, this.jPanelAccionesPaquete,this.jPanelAccionesFormularioPaquete,this.jmenuBarPaquete,this.jmenuBarDetallePaquete,this.jTtoolBarPaquete,this.jTtoolBarDetallePaquete);		
		
		final JTabbedPane jTabbedPaneBusquedasPaquete=this.jTabbedPaneBusquedasPaquete; 
		
		final JPanel jPanelParametrosReportesPaquete=this.jPanelParametrosReportesPaquete;
		//final JScrollPane jScrollPanelDatosPaquete=this.jScrollPanelDatosPaquete;
		final JTable jTableDatosPaquete=this.jTableDatosPaquete;		
		final JPanel jPanelPaginacionPaquete=this.jPanelPaginacionPaquete;
		//final JScrollPane jScrollPanelDatosEdicionPaquete=this.jScrollPanelDatosEdicionPaquete;
		final JPanel jPanelAccionesPaquete=this.jPanelAccionesPaquete;
		
		JPanel jPanelCamposAuxiliarPaquete=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPaquete=new JPanel();
		
		if(this.jInternalFrameDetalleFormPaquete!=null) {
			jPanelCamposAuxiliarPaquete=this.jInternalFrameDetalleFormPaquete.jPanelCamposPaquete;
			jPanelAccionesFormularioAuxiliarPaquete=this.jInternalFrameDetalleFormPaquete.jPanelAccionesFormularioPaquete;
		}
		
		final JPanel jPanelCamposPaquete=jPanelCamposAuxiliarPaquete;
		final JPanel jPanelAccionesFormularioPaquete=jPanelAccionesFormularioAuxiliarPaquete;
		
		
		final JMenuBar jmenuBarPaquete=this.jmenuBarPaquete;		
		final JToolBar jTtoolBarPaquete=this.jTtoolBarPaquete;
				
		JMenuBar jmenuBarDetalleAuxiliarPaquete=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPaquete=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPaquete!=null) {
			jmenuBarDetalleAuxiliarPaquete=this.jInternalFrameDetalleFormPaquete.jmenuBarDetallePaquete;
			jTtoolBarDetalleAuxiliarPaquete=this.jInternalFrameDetalleFormPaquete.jTtoolBarDetallePaquete;		
		}
		
		final JMenuBar jmenuBarDetallePaquete=jmenuBarDetalleAuxiliarPaquete;
		final JToolBar jTtoolBarDetallePaquete=jTtoolBarDetalleAuxiliarPaquete;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPaquete;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPaquete;
			processRunnable.jTableDatos=jTableDatosPaquete;
			processRunnable.jPanelCampos=jPanelCamposPaquete;
			processRunnable.jPanelPaginacion=jPanelPaginacionPaquete;
			processRunnable.jPanelAcciones=jPanelAccionesPaquete;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPaquete;
			
			
			processRunnable.jmenuBar=jmenuBarPaquete;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePaquete;
			processRunnable.jTtoolBar=jTtoolBarPaquete;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePaquete;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPaquete ,jPanelParametrosReportesPaquete, jTableDatosPaquete,/*jScrollPanelDatosPaquete,*/jPanelCamposPaquete,jPanelPaginacionPaquete, /*jScrollPanelDatosEdicionPaquete,*/ jPanelAccionesPaquete,jPanelAccionesFormularioPaquete,jmenuBarPaquete,jmenuBarDetallePaquete,jTtoolBarPaquete,jTtoolBarDetallePaquete));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPaquete(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPaquete(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPaquete(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPaquete(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPaquete,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePaquete,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPaquete(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPaquete,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePaquete,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.paqueteConstantesFunciones.getsFinalQueryPaquete();
		String  finalQueryPaginacionTodos=this.paqueteConstantesFunciones.getsFinalQueryPaquete();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PaqueteConstantesFunciones.getArrayColumnasGlobalesNoPaquete(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PaqueteConstantesFunciones.getArrayColumnasGlobalesPaquete(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PaqueteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.paquetesEliminados= new ArrayList<Paquete>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPaquete();
		
				///*PaqueteSessionBean*/this.paqueteSessionBean=new PaqueteSessionBean();
			
			if(this.paqueteSessionBean==null) {
				this.paqueteSessionBean=new PaqueteSessionBean();
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
					this.iNumeroPaginacion=PaqueteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PaqueteConstantesFunciones.getClassesForeignKeysOfPaquete(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/paquete."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			paquetesAux= new ArrayList<Paquete>();
			
				
			paqueteLogic.setDatosCliente(this.datosCliente);
			paqueteLogic.setDatosDeep(this.datosDeep);
			paqueteLogic.setIsConDeep(true);
			
			
			paqueteLogic.getPaqueteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					paqueteLogic.getTodosPaquetes(finalQueryGlobal,pagination);
					
					//paqueteLogic.getTodosPaquetesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(paqueteLogic.getPaquetes()==null|| paqueteLogic.getPaquetes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							paquetesAux= new ArrayList<Paquete>();
							paquetesAux.addAll(paqueteLogic.getPaquetes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							paquetesAux= new ArrayList<Paquete>();
							paquetesAux.addAll(paquetes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							paqueteLogic.getTodosPaquetes(finalQueryGlobal+"",this.pagination);												
							
							//paqueteLogic.getTodosPaquetesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePaquetes("Todos",paqueteLogic.getPaquetes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							paqueteLogic.setPaquetes(new ArrayList<Paquete>());					
							paqueteLogic.getPaquetes().addAll(paquetesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							paquetes=new ArrayList<Paquete>();
							paquetes.addAll(paquetesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPaquete=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPaquete=this.idActual;
				
				} else if(this.idPaqueteActual!=null && this.idPaqueteActual!=0L) {
					idPaquete=idPaqueteActual;
				}
				
					
				this.sDetalleReporte=PaqueteConstantesFunciones.getDetalleIndicePorId(idPaquete);
				
				this.paquetes=new ArrayList<Paquete>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					paqueteLogic.getEntity(idPaquete);
					
					//paqueteLogic.getEntityWithConnection(idPaquete);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paqueteLogic.setPaquetes(new ArrayList<Paquete>());
					paqueteLogic.getPaquetes().add(paqueteLogic.getPaquete());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.paquetes=new ArrayList<Paquete>();
					this.paquetes.add(paquete);
				}
				
				if(paqueteLogic.getPaquete()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdSistema")) {
				this.sDetalleReporte=PaqueteConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					paqueteLogic.getPaquetesFK_IdSistema(finalQueryGlobal,pagination,id_sistemaFK_IdSistema);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PaqueteConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PaqueteConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=paqueteLogic.getPaquetes()==null||paqueteLogic.getPaquetes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=paquetes==null|| paquetes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						paquetesAux=new ArrayList<Paquete>();
						paquetesAux.addAll(paqueteLogic.getPaquetes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							paquetesAux=new ArrayList<Paquete>();
							paquetesAux.addAll(paquetes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							paqueteLogic.getPaquetesFK_IdSistema(finalQueryGlobal,pagination,id_sistemaFK_IdSistema);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PaqueteConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PaqueteConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePaquetes("FK_IdSistema",paqueteLogic.getPaquetes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePaquetes("FK_IdSistema",paquetes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						paqueteLogic.setPaquetes(new ArrayList<Paquete>());
						paqueteLogic.getPaquetes().addAll(paquetesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							paquetes=new ArrayList<Paquete>();
							paquetes.addAll(paquetesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPaquete();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPaquete();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=paqueteLogic.getPaquetes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=paquetes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=paqueteLogic.getPaquetes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=paquetes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Paquete paquete) {
		Boolean permite=true;
		
		if(this.paquete.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PaqueteConstantesFunciones.getOrderByListaPaquete();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PaqueteConstantesFunciones.getOrderByListaPaquete();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Paquete paquete:paqueteLogic.getPaquetes()) {
				if(paquete.getsType().equals(Constantes2.S_TOTALES)) {
					paqueteTotales=paquete;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Paquete paquete:this.paquetes) {
				if(paquete.getsType().equals(Constantes2.S_TOTALES)) {
					paqueteTotales=paquete;
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
			this.paqueteAux=new Paquete();
			this.paqueteAux.setsType(Constantes2.S_TOTALES);
			this.paqueteAux.setIsNew(false);
			this.paqueteAux.setIsChanged(false);
			this.paqueteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PaqueteConstantesFunciones.TotalizarValoresFilaPaquete(this.paqueteLogic.getPaquetes(),this.paqueteAux);
				
				this.paqueteLogic.getPaquetes().add(this.paqueteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PaqueteConstantesFunciones.TotalizarValoresFilaPaquete(this.paquetes,this.paqueteAux);
				
				this.paquetes.add(this.paqueteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		paqueteTotales=new Paquete();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.paqueteLogic.getPaquetes().remove(paqueteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.paquetes.remove(paqueteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		paqueteTotales=new Paquete();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Paquete paquete:paqueteLogic.getPaquetes()) {
				if(paquete.getsType().equals(Constantes2.S_TOTALES)) {
					paqueteTotales=paquete;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PaqueteConstantesFunciones.TotalizarValoresFilaPaquete(this.paqueteLogic.getPaquetes(),paqueteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Paquete paquete:this.paquetes) {
				if(paquete.getsType().equals(Constantes2.S_TOTALES)) {
					paqueteTotales=paquete;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PaqueteConstantesFunciones.TotalizarValoresFilaPaquete(this.paquetes,paqueteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPaquetesFK_IdSistema()throws Exception {
		try {
			sAccionBusqueda="FK_IdSistema";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPaquetesFK_IdSistema(String sFinalQuery,Long id_sistema)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paqueteLogic.getPaquetesFK_IdSistema(sFinalQuery,this.pagination,id_sistema);
				
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
	
	public void inicializarPermisosPaquete() {
		this.isPermisoTodoPaquete=false;
		this.isPermisoNuevoPaquete=false;
		this.isPermisoActualizarPaquete=false;
		this.isPermisoActualizarOriginalPaquete=false;
		this.isPermisoEliminarPaquete=false;
		this.isPermisoGuardarCambiosPaquete=false;
		this.isPermisoConsultaPaquete=false;
		this.isPermisoBusquedaPaquete=false;
		this.isPermisoReportePaquete=false;		
		this.isPermisoOrdenPaquete=false;		
		this.isPermisoPaginacionMedioPaquete=false;		
		this.isPermisoPaginacionAltoPaquete=false;
		this.isPermisoPaginacionTodoPaquete=false;
		this.isPermisoCopiarPaquete=false;		
		this.isPermisoVerFormPaquete=false;		
		this.isPermisoDuplicarPaquete=false;		
		this.isPermisoOrdenPaquete=false;		
	}
	
	public void setPermisosUsuarioPaquete(Boolean isPermiso) {
		this.isPermisoTodoPaquete=isPermiso;
		this.isPermisoNuevoPaquete=isPermiso;
		this.isPermisoActualizarPaquete=isPermiso;
		this.isPermisoActualizarOriginalPaquete=isPermiso;
		this.isPermisoEliminarPaquete=isPermiso;
		this.isPermisoGuardarCambiosPaquete=isPermiso;
		this.isPermisoConsultaPaquete=isPermiso;
		this.isPermisoBusquedaPaquete=isPermiso;
		this.isPermisoReportePaquete=isPermiso;
		this.isPermisoOrdenPaquete=isPermiso;		
		this.isPermisoPaginacionMedioPaquete=isPermiso;		
		this.isPermisoPaginacionAltoPaquete=isPermiso;		
		this.isPermisoPaginacionTodoPaquete=isPermiso;		
		this.isPermisoCopiarPaquete=isPermiso;		
		this.isPermisoVerFormPaquete=isPermiso;		
		this.isPermisoDuplicarPaquete=isPermiso;
		this.isPermisoOrdenPaquete=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPaquete(Boolean isPermiso) {
		//this.isPermisoTodoPaquete=isPermiso;
		this.isPermisoNuevoPaquete=isPermiso;
		this.isPermisoActualizarPaquete=isPermiso;
		this.isPermisoActualizarOriginalPaquete=isPermiso;
		this.isPermisoEliminarPaquete=isPermiso;
		this.isPermisoGuardarCambiosPaquete=isPermiso;
		//this.isPermisoConsultaPaquete=isPermiso;
		//this.isPermisoBusquedaPaquete=isPermiso;
		//this.isPermisoReportePaquete=isPermiso;
		//this.isPermisoOrdenPaquete=isPermiso;		
		//this.isPermisoPaginacionMedioPaquete=isPermiso;		
		//this.isPermisoPaginacionAltoPaquete=isPermiso;		
		//this.isPermisoPaginacionTodoPaquete=isPermiso;		
		//this.isPermisoCopiarPaquete=isPermiso;		
		//this.isPermisoDuplicarPaquete=isPermiso;
		//this.isPermisoOrdenPaquete=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPaqueteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PaqueteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPaquete(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPaqueteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPaqueteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPaqueteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPaqueteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPaquete() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PaqueteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.paqueteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PaqueteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPaquete=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPaquete=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPaquete=this.isPermisoActualizarPaquete;
			this.isPermisoEliminarPaquete=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPaquete=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPaquete=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPaquete=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPaquete=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePaquete=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPaquete=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPaquete=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPaquete=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPaquete=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPaquete=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPaquete=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPaquete=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPaquete=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.paqueteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPaquete.setToolTipText(this.jTableDatosPaquete.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPaquete(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPaquete(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PaqueteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PaqueteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPaquete() throws Exception {
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
	public void inicializarCombosForeignKeyPaqueteListas()throws Exception {
		try	{						
			
				this.sistemasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPaqueteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PaqueteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPaqueteListas(false);
			} else {
			
				this.cargarCombosForeignKeySistemaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyPaqueteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PaqueteParameterReturnGeneral paqueteReturnGeneral=new PaqueteParameterReturnGeneral();
						
			


				String finalQueryGlobalSistema="";

				if(((this.sistemasForeignKey==null||this.sistemasForeignKey.size()<=0) && this.paqueteConstantesFunciones.cargarid_sistemaPaquete)
					 || (this.esRecargarFks && this.paqueteConstantesFunciones.cargarid_sistemaPaquete)) {

					if(!this.paqueteSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SistemaConstantesFunciones.getArrayColumnasGlobalesSistema(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSistema=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SistemaConstantesFunciones.TABLENAME);

						finalQueryGlobalSistema=Funciones.GetFinalQueryAppend(finalQueryGlobalSistema, "");
						finalQueryGlobalSistema+=SistemaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSistemasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSistema=" WHERE " + ConstantesSql.ID + "="+paqueteSessionBean.getlidSistemaActual();
					}
				} else {
					finalQueryGlobalSistema="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				paqueteReturnGeneral=paqueteLogic.cargarCombosLoteForeignKeyPaquete(finalQueryGlobalSistema);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalSistema.equals("NONE")) {
				this.sistemasForeignKey=paqueteReturnGeneral.getsistemasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPaquete()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeySistema();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeySistema()throws Exception {
		try {
			if(this.paqueteSessionBean==null) {
				this.paqueteSessionBean=new PaqueteSessionBean();
			}

			if(!this.paqueteSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {
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
	
	public void initActionsCombosTodosForeignKeyPaquete()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPaquete(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPaquete()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPaquete();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPaquete(Paquete paquete)throws Exception {	
		try {
			
			this.setActualSistemaForeignKey(paquete.getid_sistema(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPaquete(Paquete paquete,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPaquete()throws Exception {	
		try {
			
			this.setActualSistemaForeignKey(this.paqueteConstantesFunciones.getid_sistema(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPaquete()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPaquete()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPaquete()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPaquete()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPaquete()throws Exception {
		try {
			

			this.cargarCombosFrameSistemasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPaquete(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameSistemasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPaquete()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete!=null && this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete.getItemCount()>0) {
				this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public PaqueteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PaqueteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PaqueteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.paqueteSessionBean=new PaqueteSessionBean(); 
		this.paqueteConstantesFunciones=new PaqueteConstantesFunciones(); 
		this.paqueteBean=new Paquete();//(this.paqueteConstantesFunciones); 		
		this.paqueteReturnGeneral=new PaqueteParameterReturnGeneral(); 
		
		this.paqueteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.paqueteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PaqueteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PaqueteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PaqueteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPaquete(true);
			
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
			
			this.paqueteConstantesFunciones=new PaqueteConstantesFunciones(); 
			this.paqueteBean=new Paquete();//this.paqueteConstantesFunciones); 			
			this.paqueteReturnGeneral=new PaqueteParameterReturnGeneral(); 
		
			PaqueteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Paquete Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.paquete=new Paquete();
			this.paquetes = new ArrayList<Paquete>();
			this.paquetesAux = new ArrayList<Paquete>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic=new PaqueteLogic();
				this.paqueteLogic.getNewConnexionToDeep("");
			}
			
			//this.paqueteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.paqueteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPaquete);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPaquete!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPaquete);	
					}
					
					if(this.jInternalFrameImportacionPaquete!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPaquete);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPaquete!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPaquete);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPaquete!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPaquete);
				this.jInternalFrameDetalleFormPaquete.setVisible(false);
				this.jInternalFrameDetalleFormPaquete.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPaquete!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPaquete);
					this.jInternalFrameReporteDinamicoPaquete.setVisible(false);
					this.jInternalFrameReporteDinamicoPaquete.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPaquete!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPaquete);
					this.jInternalFrameImportacionPaquete.setVisible(false);
					this.jInternalFrameImportacionPaquete.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPaquete!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPaquete);
					this.jInternalFrameOrderByPaquete.setVisible(false);
					this.jInternalFrameOrderByPaquete.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPaqueteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PaqueteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.paqueteReturnGeneral=new PaqueteParameterReturnGeneral();
			
			this.paqueteParameterGeneral=new PaqueteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.paqueteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PaqueteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.paqueteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PaqueteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.paqueteSessionBean.getEsGuardarRelacionado(),this.paqueteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PaqueteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.paqueteSessionBean.getEsGuardarRelacionado(),this.paqueteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPaquete=false;
			this.isVisibilidadCeldaDuplicarPaquete=true;
			this.isVisibilidadCeldaCopiarPaquete=true;
			this.isVisibilidadCeldaVerFormPaquete=true;
			this.isVisibilidadCeldaOrdenPaquete=true;
			this.isVisibilidadCeldaNuevoRelacionesPaquete=false;
			this.isVisibilidadCeldaModificarPaquete=false;
			this.isVisibilidadCeldaActualizarPaquete=false;
			this.isVisibilidadCeldaEliminarPaquete=false;
			this.isVisibilidadCeldaCancelarPaquete=false;
			this.isVisibilidadCeldaGuardarPaquete=false;
			this.isVisibilidadCeldaGuardarCambiosPaquete=false;
			
			
			this.isVisibilidadFK_IdSistema=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPaquete("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPaquete();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPaquete(false);
			
			this.setPermisosUsuarioPaquete();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.paqueteSessionBean.getEsGuardarRelacionado() 
				|| (this.paqueteSessionBean.getEsGuardarRelacionado() && this.paqueteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPaqueteClasesRelacionadas();
			}
			
			if(this.paqueteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPaqueteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PaqueteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPaquete();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPaquete();
			}
			
			if(!this.isPermisoBusquedaPaquete) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPaquete.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPaquete,this.isPermisoPaginacionMedioPaquete,this.isPermisoPaginacionTodoPaquete);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PaqueteConstantesFunciones.getTiposSeleccionarPaquete());
				
				this.tiposColumnasSelect=PaqueteConstantesFunciones.getTiposSeleccionarPaquete(true);
				
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
			//if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPaquete();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPaquete(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPaquete(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPaquete() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				paqueteImplementable= (PaqueteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PaqueteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				paqueteImplementableHome= (PaqueteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PaqueteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.paquetes= new ArrayList<Paquete>();
			this.paquetesEliminados= new ArrayList<Paquete>();
						
			this.isEsNuevoPaquete=false;
			this.esParaAccionDesdeFormularioPaquete=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.sistemasForeignKey=new ArrayList<Sistema>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPaquete(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPaquete();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PaqueteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PaqueteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPaquete("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPaquete(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPaquete!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPaquete();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPaquete();
			}
			
			PaqueteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPaquete.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPaquete.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPaquete.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPaquete(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Paquete: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPaquete() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPaquete")) {
				iIndex=this.jInternalFrameDetalleFormPaquete.jTabbedPaneRelacionesPaquete.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPaquete.jTabbedPaneRelacionesPaquete.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPaquete.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPaquete();	
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
	
	public void cargarCombosForeignKeyPaquete(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPaquete(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPaquete(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPaqueteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPaquete();
		
		this.cargarCombosFrameForeignKeyPaquete();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPaquete();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPaquete();
		}
	}
	
	

	public void cargarCombosForeignKeySistema(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeySistemaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeySistema();
				this.cargarCombosFrameSistemasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaSistema(this.sistemasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPaqueteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.paqueteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPaquete==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			
			
			if(jTableDatosPaquete.getRowCount()>=1) {
				jTableDatosPaquete.removeRowSelectionInterval(0, jTableDatosPaquete.getRowCount()-1);						
			}
			
			this.isEsNuevoPaquete=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPaquete(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPaquete(true);			
			//this.paquete=new Paquete();
			//this.paquete.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPaquete(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPaquete() ;
			
			if(PaqueteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePaquete(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.paquete);	
			this.actualizarInformacion("INFO_PADRE",false,this.paquete);				
			
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			
			if(this.paqueteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Paquete: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPaqueteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Paquete> paquetesSeleccionados=new ArrayList<Paquete>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPaquete.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPaquete.getSelectedRows().length;			
			}
			
			paquetesSeleccionados=this.getPaquetesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPaquete--;			
				//Paquete paqueteAux= new Paquete();			
				//paqueteAux.setId(this.iIdNuevoPaquete);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Paquete paqueteOrigen=new Paquete();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Paquete paqueteOrigen : paquetesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPaquete.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							paqueteOrigen =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							paqueteOrigen =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPaquete();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.paquete.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPaquete(paqueteOrigen,this.paquete,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.paqueteLogic.getPaquetes().add(this.paqueteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.paquetes.add(this.paqueteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPaquete(false);
				
				this.jTableDatosPaquete.setRowSelectionInterval(this.getIndiceNuevoPaquete(), this.getIndiceNuevoPaquete());
				
				int iLastRow =  this.jTableDatosPaquete.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPaquete.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPaquete.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPaquete(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPaqueteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Paquete> paquetesSeleccionados=new ArrayList<Paquete>();									
		
			Paquete paqueteOrigen=new Paquete();
			Paquete paqueteDestino=new Paquete();
				
			paquetesSeleccionados=this.getPaquetesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPaquete.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || paquetesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPaquete.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						paqueteOrigen =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						paqueteOrigen =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						paqueteDestino =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						paqueteDestino =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				paqueteOrigen =paquetesSeleccionados.get(0);
				paqueteDestino =paquetesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPaquete(paqueteOrigen,paqueteDestino,true,false);
				
				paqueteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(paqueteDestino,paqueteLogic.getPaquetes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(paqueteDestino,paquetes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPaquete(false);
				
				//this.jTableDatosPaquete.setRowSelectionInterval(this.getIndiceNuevoPaquete(), this.getIndiceNuevoPaquete());
				
				int iLastRow =  this.jTableDatosPaquete.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPaquete.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPaquete.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPaquete(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPaqueteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPaquete==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPaquete.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPaqueteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPaquete.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPaquete.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPaquete.setVisible(!isVisible);
			this.jPanelPaginacionPaquete.setVisible(!isVisible);
			this.jPanelAccionesPaquete.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPaqueteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePaquete();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPaqueteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPaquete();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPaqueteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPaquete();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPaqueteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPaquete();
			
			this.abrirFrameOrderByPaquete();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPaqueteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPaquete();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePaquete(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPaquete);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPaquete.isMaximum()) {
					this.jInternalFrameDetalleFormPaquete.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPaquete.setSize(this.jInternalFrameDetalleFormPaquete.iWidthFormulario,this.jInternalFrameDetalleFormPaquete.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPaquete.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPaquete.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPaquete.isMaximum()) {
						this.jInternalFrameDetalleFormPaquete.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPaquete.jContentPaneDetallePaquete.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPaquete.jTabbedPaneRelacionesPaquete.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPaquete.jContentPaneDetallePaquete.getWidth(),PaqueteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPaquete.jTabbedPaneRelacionesPaquete.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPaquete.jContentPaneDetallePaquete.getWidth(),PaqueteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPaquete.jTabbedPaneRelacionesPaquete.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPaquete.jContentPaneDetallePaquete.getWidth(),PaqueteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPaquete.setVisible(true);
	        this.jInternalFrameDetalleFormPaquete.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPaquete() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPaquete==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPaquete=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPaquete,false,this);
				} else {
					this.jInternalFrameOrderByPaquete=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPaquete,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPaquete);
				this.jInternalFrameOrderByPaquete.setVisible(false);
				this.jInternalFrameOrderByPaquete.setSelected(false);
				
				this.jInternalFrameOrderByPaquete.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPaquete"));
				
				this.inicializarActualizarBindingTablaOrderByPaquete();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPaquete() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPaquete==null) {
				
				this.jInternalFrameImportacionPaquete=new ImportacionJInternalFrame(PaqueteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPaquete);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPaquete);
				this.jInternalFrameImportacionPaquete.setVisible(false);
				this.jInternalFrameImportacionPaquete.setSelected(false);


				this.jInternalFrameImportacionPaquete.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPaquete"));
				this.jInternalFrameImportacionPaquete.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPaquete"));
				this.jInternalFrameImportacionPaquete.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPaquete"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPaquete() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPaquete==null) {
				this.jInternalFrameReporteDinamicoPaquete=new ReporteDinamicoJInternalFrame(PaqueteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPaquete);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPaquete);
				this.jInternalFrameReporteDinamicoPaquete.setVisible(false);
				this.jInternalFrameReporteDinamicoPaquete.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPaquete.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPaquete"));
				this.jInternalFrameReporteDinamicoPaquete.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPaquete"));
				this.jInternalFrameReporteDinamicoPaquete.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPaquete"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPaquete();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePaquete() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPaquete);
			
	       	this.jInternalFrameDetalleFormPaquete.setVisible(false);
	        this.jInternalFrameDetalleFormPaquete.setSelected(false);
			
			//this.jInternalFrameDetalleFormPaquete.dispose();
			//this.jInternalFrameDetalleFormPaquete=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPaquete() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPaquete.setVisible(true);
	        this.jInternalFrameReporteDinamicoPaquete.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPaquete() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPaquete.setVisible(true);
	        this.jInternalFrameImportacionPaquete.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPaquete() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPaquete.setVisible(true);
	        this.jInternalFrameOrderByPaquete.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPaquete() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPaquete.setVisible(false);
	        this.jInternalFrameOrderByPaquete.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPaquete() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPaquete.setVisible(false);
	        this.jInternalFrameReporteDinamicoPaquete.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPaquete() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPaquete.setVisible(false);
	        this.jInternalFrameImportacionPaquete.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPaqueteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPaquete(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPaquete(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPaquete.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPaquete(true);
			//this.isEsNuevoPaquete=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPaquete("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPaquete(false) ;
			
			if(paqueteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PaqueteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePaquete(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPaquete(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPaqueteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPaquete.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPaquete(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPaquete==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPaquete.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPaquete(true);
			//this.isEsNuevoPaquete=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.paquete.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPaquete("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPaquete(false) ;
			
			if(PaqueteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePaquete(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPaquete(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaSistema(List<Sistema> sistemasForeignKey)throws Exception{
		TableColumn tableColumnSistema=this.jTableDatosPaquete.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPaquete,PaqueteConstantesFunciones.LABEL_IDSISTEMA));
		TableCellEditor tableCellEditorSistema =tableColumnSistema.getCellEditor();

		SistemaTableCell sistemaTableCellFk=(SistemaTableCell)tableCellEditorSistema;

		if(sistemaTableCellFk!=null) {
			sistemaTableCellFk.setsistemasForeignKey(sistemasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPaquete.getSelectedRow();

		//if(intSelectedRow<=0) {
			//sistemaTableCellFk.setRowActual(intSelectedRow);
			//sistemaTableCellFk.setsistemasForeignKeyActual(sistemasForeignKey);
		//}


		if(sistemaTableCellFk!=null) {
			sistemaTableCellFk.RecargarSistemasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPaqueteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPaquete(false);
			
			//if(!this.isEsNuevoPaquete) {								
				int intSelectedRow = this.jTableDatosPaquete.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PaqueteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPaquete(this.paquete,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);
				
			}
			
			if(this.permiteMantenimiento(this.paquete)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.paqueteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPaquete=true;
					this.inicializarActualizarBindingTablaPaquete(false);
					this.isEsNuevoPaquete=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPaquete=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPaquete=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPaquete(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPaquete(false);
				
				this.habilitarDeshabilitarControlesPaquete(false);
			
												
				
				if(PaqueteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePaquete();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPaqueteActionPerformed(evt,paqueteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPaquete(this.paquete,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPaquete.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,paqueteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.paquete.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Paquete.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Paquete.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPaqueteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPaquete.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				this.paquete.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				this.paquete.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.paquete)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.paqueteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PaqueteModel) this.jTableDatosPaquete.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPaquete=true;
				this.inicializarActualizarBindingTablaPaquete(false);
				this.isEsNuevoPaquete=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPaquete(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPaquete(false);
				
				this.habilitarDeshabilitarControlesPaquete(false);
				
				
				
				if(PaqueteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePaquete();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPaqueteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPaquete.getRowCount()>=1) {
				jTableDatosPaquete.removeRowSelectionInterval(0, jTableDatosPaquete.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPaquete(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPaquete(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPaquete(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPaquete(false) ;
			
			this.isEsNuevoPaquete=false;
			
			if(PaqueteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePaquete();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPaqueteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPaquete(false);
				
				//SI ES MANUAL
				if(PaqueteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPaquete();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPaqueteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPaquete--;			
			//Paquete paqueteAux= new Paquete();			
			//paqueteAux.setId(this.iIdNuevoPaquete);
			
			if(this.jInternalFrameDetalleFormPaquete==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPaquete();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);
			
			this.paquete.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.paqueteLogic.getPaquetes().add(this.paqueteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.paquetes.add(this.paqueteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPaquete(false);
			
			this.jTableDatosPaquete.setRowSelectionInterval(this.getIndiceNuevoPaquete(), this.getIndiceNuevoPaquete());
			
			int iLastRow =  this.jTableDatosPaquete.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPaquete.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPaquete.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPaquete(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPaqueteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPaquete(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPaquete(false);
			
			//SI ES MANUAL
			if(PaqueteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPaquete();
			}
			
			//this.abrirFrameTreePaquete();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPaqueteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE PaqueteS ?", "MANTENIMIENTO DE Paquete", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPaquete.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPaquete();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.paqueteReturnGeneral=paqueteLogic.procesarImportacionPaquetesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.paqueteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPaqueteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPaqueteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPaquete.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPaquete.setFileImportacion(this.jInternalFrameImportacionPaquete.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPaquete.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPaquete.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPaquete.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPaquete.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPaqueteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Paquete> paquetesSeleccionados=new ArrayList<Paquete>();		

		paquetesSeleccionados=this.getPaquetesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPaquete.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPaquete.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PaqueteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PaqueteBaseDesign.jrxml";
			
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
			
			this.generarReportePaquetes("Todos",paquetesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paqueteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Paquete",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPaquete.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPaquete.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PaqueteConstantesFunciones.LABEL_IDSISTEMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sistema_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sistema_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sistema_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sistema_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PaqueteConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PaqueteConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoPaquete.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPaquete.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPaquete.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PaqueteConstantesFunciones.LABEL_IDSISTEMA:
					sNombreCampoCategoria="id_sistema";
					break;

				case PaqueteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case PaqueteConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPaquete.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PaqueteConstantesFunciones.LABEL_IDSISTEMA:
					sNombreCampoCategoriaValor="id_sistema";
					break;

				case PaqueteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case PaqueteConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPaquete.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPaquete.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PaqueteConstantesFunciones.LABEL_IDSISTEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sistema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sistema");
					break;

				case PaqueteConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case PaqueteConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoPaqueteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Paquete> paquetesSeleccionados=new ArrayList<Paquete>();		
		
		paquetesSeleccionados=this.getPaquetesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"paquete";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Paquetes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPaquete.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPaquete.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PaqueteConstantesFunciones.LABEL_IDSISTEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PaqueteConstantesFunciones.LABEL_IDSISTEMA);
					iRow++;

					for(Paquete paquete:paquetesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(paquete.getsistema_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PaqueteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PaqueteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Paquete paquete:paquetesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(paquete.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PaqueteConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PaqueteConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Paquete paquete:paquetesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(paquete.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelPaquete(row);				
			//	iRow++;
			//}				
			
			//for(Paquete paqueteAux:paquetesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPaquete(paqueteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paqueteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Paquete",JOptionPane.INFORMATION_MESSAGE);
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
				this.paqueteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPaquete(false);
			
			//SI ES MANUAL
			if(PaqueteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPaquete();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPaqueteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPaquete(false);
			
			//SI ES MANUAL
			if(PaqueteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPaquete();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPaqueteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPaquete(false);
			
			//SI ES MANUAL
			if(PaqueteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPaquete();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPaquete() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPaquete.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPaquete.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPaquete.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPaquete.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPaquete.setMinimumSize(dimensionMinimum);
		this.jTableDatosPaquete.setMaximumSize(dimensionMaximum);
		this.jTableDatosPaquete.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPaquete(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPaquete(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPaquete(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPaquete(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPaquete(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPaquete(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPaquete(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPaquete(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PaqueteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PaqueteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPaquete() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPaquete();
		
		this.inicializarActualizarBindingBotonesManualPaquete(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPaquete();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPaquete() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPaquete(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPaquete(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPaquete.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPaquete.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePaquete.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPaquete!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPaquete.jCheckBoxPostAccionNuevoPaquete.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPaquete.jCheckBoxPostAccionSinCerrarPaquete.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPaquete.jCheckBoxPostAccionSinMensajePaquete.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPaquete.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPaquete.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePaquete.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPaquete!=null) {
				this.jInternalFrameDetalleFormPaquete.jCheckBoxPostAccionNuevoPaquete.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPaquete.jCheckBoxPostAccionSinCerrarPaquete.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPaquete.jCheckBoxPostAccionSinMensajePaquete.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPaquete.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPaquete.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPaquete!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPaquete.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPaquete!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPaquete.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPaquete.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPaquete.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPaquete.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPaquete.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPaquete!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPaquete.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPaquete.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPaquete.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPaquete(Boolean esInicializar) throws Exception {
		try	{	
			if(PaqueteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPaquete(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPaquete() throws Exception {
		try	{
			if(PaqueteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPaquete();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePaquete() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPaquete() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPaquete.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPaquete.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPaquete.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPaquete.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPaquete.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPaquete.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPaquete.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPaquete.addItem(reporte);
			}
			
			
			if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPaquete.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPaquete.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPaquete.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPaquete.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPaquete.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPaquete.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPaquete.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPaquete.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPaquete.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPaquete();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPaquete() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPaquete!=null) {
				this.jInternalFrameReporteDinamicoPaquete.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPaquete.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPaquete!=null) {
				this.jInternalFrameReporteDinamicoPaquete.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPaquete.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPaquete!=null) {
				
				if(this.jInternalFrameReporteDinamicoPaquete.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPaquete.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPaquete.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPaquete.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPaquete.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPaquete.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPaquete()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_sistemaFK_IdSistemaPaquete.getSelectedItem()!=null){this.id_sistemaFK_IdSistema=((Sistema)this.jComboBoxid_sistemaFK_IdSistemaPaquete.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPaquete(Boolean esInicializar) throws Exception {				
		if(PaqueteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPaquete();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPaquete() throws Exception {
		this.inicializarActualizarBindingTablaPaquete(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPaquete() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPaquete.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPaquete.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPaquete.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PaquetePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPaquete.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPaquete.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PaquetePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPaqueteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPaqueteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PaquetePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPaquete.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPaquete.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PaquetePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPaquete.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPaquete(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=paqueteLogic.getPaquetes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=paquetes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PaqueteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPaquete.setModel(new PaqueteModel(this.paqueteLogic.getPaquetes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPaquete.setModel(new PaqueteModel(this.paquetes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPaquete!=null && this.jInternalFrameOrderByPaquete.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPaquete();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPaquete.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPaquete,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PaquetePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PaqueteConstantesFunciones.SCLASSWEBTITULO,paqueteConstantesFunciones.resaltarSeleccionarPaquete,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PaqueteConstantesFunciones.SCLASSWEBTITULO,paqueteConstantesFunciones.resaltarSeleccionarPaquete,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPaquete.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPaquete,PaqueteConstantesFunciones.LABEL_ID));

		if(this.paqueteConstantesFunciones.mostraridPaquete && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PaqueteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.paqueteConstantesFunciones.resaltaridPaquete,this.paqueteConstantesFunciones.activaridPaquete,this,true,"idPaquete","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.paqueteConstantesFunciones.resaltaridPaquete,this.paqueteConstantesFunciones.activaridPaquete,this,true,"idPaquete","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPaquete.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPaquete,PaqueteConstantesFunciones.LABEL_IDSISTEMA));

		if(this.paqueteConstantesFunciones.mostrarid_sistemaPaquete && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PaqueteConstantesFunciones.LABEL_IDSISTEMA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SistemaTableCell(this.sistemasForeignKey,this.paqueteConstantesFunciones.resaltarid_sistemaPaquete,this,this.paqueteConstantesFunciones.activarid_sistemaPaquete));
			tableColumn.setCellEditor(new SistemaTableCell(this.sistemasForeignKey,this.paqueteConstantesFunciones.resaltarid_sistemaPaquete,this,this.paqueteConstantesFunciones.activarid_sistemaPaquete,true,"id_sistemaPaquete","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PaquetePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPaquete.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPaquete,PaqueteConstantesFunciones.LABEL_NOMBRE));

		if(this.paqueteConstantesFunciones.mostrarnombrePaquete && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PaqueteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.paqueteConstantesFunciones.resaltarnombrePaquete,this.paqueteConstantesFunciones.activarnombrePaquete,this,true,"nombrePaquete","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.paqueteConstantesFunciones.resaltarnombrePaquete,this.paqueteConstantesFunciones.activarnombrePaquete,this,true,"nombrePaquete","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PaquetePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPaquete.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPaquete,PaqueteConstantesFunciones.LABEL_DESCRIPCION));

		if(this.paqueteConstantesFunciones.mostrardescripcionPaquete && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PaqueteConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.paqueteConstantesFunciones.resaltardescripcionPaquete,this.paqueteConstantesFunciones.activardescripcionPaquete,this,true,"descripcionPaquete","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.paqueteConstantesFunciones.resaltardescripcionPaquete,this.paqueteConstantesFunciones.activardescripcionPaquete,this,true,"descripcionPaquete","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PaquetePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.paqueteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.paqueteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.paqueteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPaquete.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.paqueteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.paqueteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPaquete.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPaquete && this.isPermisoGuardarCambiosPaquete) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.paqueteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.paqueteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPaquete.addColumn(tableColumn);
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
			
			this.jTableDatosPaquete.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPaquete && this.isPermisoGuardarCambiosPaquete) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPaquete && this.isPermisoGuardarCambiosPaquete) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPaquete.moveColumn(this.jTableDatosPaquete.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPaquete.moveColumn(this.jTableDatosPaquete.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPaquete.moveColumn(this.jTableDatosPaquete.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPaquete.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPaquete.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPaquete,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PaqueteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPaquete.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPaquete.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PaqueteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PaqueteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPaquete.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPaquete.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPaquete.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=paqueteLogic.getPaquetes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=paquetes.size()-1;
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
		//this.jTableDatosPaquete.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPaquete.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPaquete();
			
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
				
				//this.isEsNuevoPaquete=false;
					
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			
				if(this.paqueteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPaquete==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPaquete.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPaquete.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.paquete.getsType().equals("DUPLICADO")
				   || this.paquete.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPaquete=true;
				
				} else {
					this.isEsNuevoPaquete=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
					if(this.paquete.getId()>=0 && !this.paquete.getIsNew()) {						
						this.isEsNuevoPaquete=false;
						
					} else {
						this.isEsNuevoPaquete=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPaquete(esRelaciones);						
				
				this.seleccionarPaquete(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.paquete.getId()<0) {
					this.isEsNuevoPaquete=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPaquete(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPaquete(evt,rowIndex);
				}	
				
				if(this.paqueteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Paquete: " + this.dDif); 
					}
				}								
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPaquete(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.paquete)) {
					if(this.paquete.getId()>0) {
						this.paquete.setIsDeleted(true);
						
						this.paquetesEliminados.add(this.paquete);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.paqueteLogic.getPaquetes().remove(this.paquete);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.paquetes.remove(this.paquete);				
					}
					
					
					((PaqueteModel) this.jTableDatosPaquete.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPaquete(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPaquete(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPaquete) {
			
			if(this.jInternalFrameDetalleFormPaquete==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPaquete.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPaquete.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PaqueteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPaquete(this.paquete);
				}
				
				//ARCHITECTURE
				try {
					

					//Sistema
					if(!this.paqueteConstantesFunciones.cargarid_sistemaPaquete || this.paqueteConstantesFunciones.event_dependid_sistemaPaquete) {
						//this.cargarCombosSistemasForeignKeyLista(" where id="+this.paquete.getid_sistema());
									//this.inicializarActualizarBindingPaquete(false,false);
						this.sistemasForeignKey=new ArrayList<Sistema>();

						if(paquete.getSistema()!=null) {
							this.sistemasForeignKey.add(paquete.getSistema());
						}

						this.addItemDefectoCombosForeignKeySistema();
						this.cargarCombosFrameSistemasForeignKey("Todos");
					}
					this.setActualSistemaForeignKey(this.paquete.getid_sistema(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPaquete("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPaquete(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPaquete() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPaquete(Paquete paquete) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPaquete(paquete,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPaquete(Paquete paquete,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPaquete(paquete);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPaquete(paquete,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPaquete(paquete);
	}
	
	public void setVariablesObjetoActualToFormularioPaquete(Paquete paquete) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPaquete==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPaquete.jLabelidPaquete.setText(paquete.getId().toString());
			this.jInternalFrameDetalleFormPaquete.jTextAreanombrePaquete.setText(paquete.getnombre());
			this.jInternalFrameDetalleFormPaquete.jTextAreadescripcionPaquete.setText(paquete.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Paquete paqueteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,paqueteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Paquete paqueteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				paqueteLocal=this.paquete;
			} else {
				paqueteLocal=this.paqueteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(paqueteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPaquete(paqueteLocal,true);
					
					if(paqueteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(paqueteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.paqueteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(paqueteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPaquete(Paquete paquete,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPaquete(paquete,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPaquete(paquete);
	}
	
	public void setVariablesFormularioToObjetoActualPaquete(Paquete paquete,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPaquete(paquete,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPaquete(Paquete paquete,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPaquete==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPaquete.jLabelidPaquete.getText()==null || this.jInternalFrameDetalleFormPaquete.jLabelidPaquete.getText()=="" || this.jInternalFrameDetalleFormPaquete.jLabelidPaquete.getText()=="Id") {
				this.jInternalFrameDetalleFormPaquete.jLabelidPaquete.setText("0");
			}

			if(conColumnasBase) {paquete.setId(Long.parseLong(this.jInternalFrameDetalleFormPaquete.jLabelidPaquete.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PaqueteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPaquete.jLabelIdPaquete,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			paquete.setnombre(this.jInternalFrameDetalleFormPaquete.jTextAreanombrePaquete.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PaqueteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPaquete.jLabelnombrePaquete,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			paquete.setdescripcion(this.jInternalFrameDetalleFormPaquete.jTextAreadescripcionPaquete.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PaqueteConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPaquete.jLabeldescripcionPaquete,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPaquete(Paquete paqueteBean,Paquete paquete,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && paqueteBean.getid_sistema()!=null && !paqueteBean.getid_sistema().equals(-1L))) {paquete.setid_sistema(paqueteBean.getid_sistema());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPaquete(Paquete paqueteOrigen,Paquete paquete,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && paqueteOrigen.getId()!=null && !paqueteOrigen.getId().equals(0L))) {paquete.setId(paqueteOrigen.getId());}}
			if(conDefault || (!conDefault && paqueteOrigen.getid_sistema()!=null && !paqueteOrigen.getid_sistema().equals(-1L))) {paquete.setid_sistema(paqueteOrigen.getid_sistema());}
			if(conDefault || (!conDefault && paqueteOrigen.getnombre()!=null && !paqueteOrigen.getnombre().equals(""))) {paquete.setnombre(paqueteOrigen.getnombre());}
			if(conDefault || (!conDefault && paqueteOrigen.getdescripcion()!=null && !paqueteOrigen.getdescripcion().equals(""))) {paquete.setdescripcion(paqueteOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPaquete(Paquete paquete) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPaquete.jLabelidPaquete.setText(paquete.getId().toString());
			this.jInternalFrameDetalleFormPaquete.jTextAreanombrePaquete.setText(paquete.getnombre());
			this.jInternalFrameDetalleFormPaquete.jTextAreadescripcionPaquete.setText(paquete.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPaquete(PaqueteBean paqueteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPaquete.jLabelidPaquete.setText(paqueteBean.getId().toString());
			this.jInternalFrameDetalleFormPaquete.jTextAreanombrePaquete.setText(paqueteBean.getnombre());
			this.jInternalFrameDetalleFormPaquete.jTextAreadescripcionPaquete.setText(paqueteBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPaquete(PaqueteParameterReturnGeneral paqueteReturnGeneral,PaqueteBean paqueteBean,Boolean conDefault) throws Exception { 
		try {
			Paquete paqueteLocal=new Paquete();
			
			paqueteLocal=paqueteReturnGeneral.getPaquete();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && paqueteLocal.getId()!=null && !paqueteLocal.getId().equals(0L))) {paqueteBean.setId(paqueteLocal.getId());}}
			if(conDefault || (!conDefault && paqueteLocal.getid_sistema()!=null && !paqueteLocal.getid_sistema().equals(-1L))) {paqueteBean.setid_sistema(paqueteLocal.getid_sistema());}
			if(conDefault || (!conDefault && paqueteLocal.getnombre()!=null && !paqueteLocal.getnombre().equals(""))) {paqueteBean.setnombre(paqueteLocal.getnombre());}
			if(conDefault || (!conDefault && paqueteLocal.getdescripcion()!=null && !paqueteLocal.getdescripcion().equals(""))) {paqueteBean.setdescripcion(paqueteLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPaqueteGenerico(Long idPaqueteSeleccionado,JComboBox jComboBoxPaquete,List<Paquete> paquetesLocal)throws Exception {
		try {
			Paquete  paqueteTemp=null;

			for(Paquete paqueteAux:paquetesLocal) {
				if(paqueteAux.getId()!=null && paqueteAux.getId().equals(idPaqueteSeleccionado)) {
					paqueteTemp=paqueteAux;
					break;
				}
			}

			jComboBoxPaquete.setSelectedItem(paqueteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPaqueteGenerico(JComboBox jComboBoxPaquete,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPaquete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPaquete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPaquete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPaquete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPaquete.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPaquete.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPaquete.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPaquete.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPaquete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPaquete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			paquete=(Paquete) paqueteLogic.getPaquetes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			paquete =(Paquete) paquetes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Sistema")) {
			//sDescripcion=this.getActualSistemaForeignKeyDescripcion((Long)value);
			if(!paquete.getIsNew() && !paquete.getIsChanged() && !paquete.getIsDeleted()) {
				sDescripcion=paquete.getsistema_descripcion();
			} else {
				//sDescripcion=this.getActualSistemaForeignKeyDescripcion((Long)value);
				sDescripcion=paquete.getsistema_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Paquete paqueteRow=new Paquete();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			paqueteRow=(Paquete) paqueteLogic.getPaquetes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			paqueteRow=(Paquete) paquetes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPaquete(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPaquete.setVisible((this.isVisibilidadCeldaNuevoPaquete && this.isPermisoNuevoPaquete));			
			this.jButtonDuplicarPaquete.setVisible((this.isVisibilidadCeldaDuplicarPaquete && this.isPermisoDuplicarPaquete));			
			this.jButtonCopiarPaquete.setVisible((this.isVisibilidadCeldaCopiarPaquete && this.isPermisoCopiarPaquete));
			this.jButtonVerFormPaquete.setVisible((this.isVisibilidadCeldaVerFormPaquete && this.isPermisoVerFormPaquete));
			
			this.jButtonAbrirOrderByPaquete.setVisible((this.isVisibilidadCeldaOrdenPaquete && this.isPermisoOrdenPaquete));			
			
			this.jButtonNuevoRelacionesPaquete.setVisible((this.isVisibilidadCeldaNuevoRelacionesPaquete && this.isPermisoNuevoPaquete));			
			this.jButtonNuevoGuardarCambiosPaquete.setVisible((this.isVisibilidadCeldaNuevoPaquete && this.isPermisoNuevoPaquete && this.isPermisoGuardarCambiosPaquete));
			
			if(this.jInternalFrameDetalleFormPaquete!=null) {
			this.jInternalFrameDetalleFormPaquete.jButtonModificarPaquete.setVisible((this.isVisibilidadCeldaModificarPaquete && this.isPermisoActualizarPaquete));	
			this.jInternalFrameDetalleFormPaquete.jButtonActualizarPaquete.setVisible((this.isVisibilidadCeldaActualizarPaquete && this.isPermisoActualizarPaquete));	
			this.jInternalFrameDetalleFormPaquete.jButtonEliminarPaquete.setVisible((this.isVisibilidadCeldaEliminarPaquete && this.isPermisoEliminarPaquete));
			this.jInternalFrameDetalleFormPaquete.jButtonCancelarPaquete.setVisible(this.isVisibilidadCeldaCancelarPaquete);							
			this.jInternalFrameDetalleFormPaquete.jButtonGuardarCambiosPaquete.setVisible((this.isVisibilidadCeldaGuardarPaquete && this.isPermisoGuardarCambiosPaquete));			
			
			}
						
			this.jButtonGuardarCambiosTablaPaquete.setVisible((this.isVisibilidadCeldaGuardarCambiosPaquete && this.isPermisoGuardarCambiosPaquete));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPaquete.setVisible((this.isVisibilidadCeldaNuevoPaquete && this.isPermisoNuevoPaquete));						
			this.jButtonDuplicarToolBarPaquete.setVisible((this.isVisibilidadCeldaDuplicarPaquete && this.isPermisoDuplicarPaquete));						
			this.jButtonCopiarToolBarPaquete.setVisible((this.isVisibilidadCeldaCopiarPaquete && this.isPermisoCopiarPaquete));			
			this.jButtonVerFormToolBarPaquete.setVisible((this.isVisibilidadCeldaVerFormPaquete && this.isPermisoVerFormPaquete));			
			this.jButtonAbrirOrderByToolBarPaquete.setVisible((this.isVisibilidadCeldaOrdenPaquete && this.isPermisoOrdenPaquete));
			this.jButtonNuevoRelacionesToolBarPaquete.setVisible((this.isVisibilidadCeldaNuevoRelacionesPaquete && this.isPermisoNuevoPaquete));			
			this.jButtonNuevoGuardarCambiosToolBarPaquete.setVisible((this.isVisibilidadCeldaNuevoPaquete && this.isPermisoNuevoPaquete && this.isPermisoGuardarCambiosPaquete));			
			
			if(this.jInternalFrameDetalleFormPaquete!=null) {
			this.jInternalFrameDetalleFormPaquete.jButtonModificarToolBarPaquete.setVisible((this.isVisibilidadCeldaModificarPaquete && this.isPermisoActualizarPaquete));	
			this.jInternalFrameDetalleFormPaquete.jButtonActualizarToolBarPaquete.setVisible((this.isVisibilidadCeldaActualizarPaquete  && this.isPermisoActualizarPaquete));	
			this.jInternalFrameDetalleFormPaquete.jButtonEliminarToolBarPaquete.setVisible((this.isVisibilidadCeldaEliminarPaquete && this.isPermisoEliminarPaquete));
			this.jInternalFrameDetalleFormPaquete.jButtonCancelarToolBarPaquete.setVisible(this.isVisibilidadCeldaCancelarPaquete);				
			this.jInternalFrameDetalleFormPaquete.jButtonGuardarCambiosToolBarPaquete.setVisible((this.isVisibilidadCeldaGuardarPaquete && this.isPermisoGuardarCambiosPaquete));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPaquete.setVisible((this.isVisibilidadCeldaGuardarCambiosPaquete && this.isPermisoGuardarCambiosPaquete));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPaquete.setVisible((this.isVisibilidadCeldaNuevoPaquete && this.isPermisoNuevoPaquete));			
			this.jMenuItemDuplicarPaquete.setVisible((this.isVisibilidadCeldaDuplicarPaquete && this.isPermisoDuplicarPaquete));			
			this.jMenuItemCopiarPaquete.setVisible((this.isVisibilidadCeldaCopiarPaquete && this.isPermisoCopiarPaquete));			
			this.jMenuItemVerFormPaquete.setVisible((this.isVisibilidadCeldaVerFormPaquete && this.isPermisoVerFormPaquete));			
			this.jMenuItemAbrirOrderByPaquete.setVisible((this.isVisibilidadCeldaOrdenPaquete && this.isPermisoOrdenPaquete));			
			//this.jMenuItemMostrarOcultarPaquete.setVisible((this.isVisibilidadCeldaOrdenPaquete && this.isPermisoOrdenPaquete));
			this.jMenuItemDetalleAbrirOrderByPaquete.setVisible((this.isVisibilidadCeldaOrdenPaquete && this.isPermisoOrdenPaquete));			
			//this.jMenuItemDetalleMostrarOcultarPaquete.setVisible((this.isVisibilidadCeldaOrdenPaquete && this.isPermisoOrdenPaquete));			
			this.jMenuItemNuevoRelacionesPaquete.setVisible((this.isVisibilidadCeldaNuevoRelacionesPaquete && this.isPermisoNuevoPaquete));			
			this.jMenuItemNuevoGuardarCambiosPaquete.setVisible((this.isVisibilidadCeldaNuevoPaquete && this.isPermisoNuevoPaquete && this.isPermisoGuardarCambiosPaquete));									
			
			if(this.jInternalFrameDetalleFormPaquete!=null) {
			this.jInternalFrameDetalleFormPaquete.jMenuItemModificarPaquete.setVisible((this.isVisibilidadCeldaModificarPaquete && this.isPermisoActualizarPaquete));	
			this.jInternalFrameDetalleFormPaquete.jMenuItemActualizarPaquete.setVisible((this.isVisibilidadCeldaActualizarPaquete && this.isPermisoActualizarPaquete));	
			this.jInternalFrameDetalleFormPaquete.jMenuItemEliminarPaquete.setVisible((this.isVisibilidadCeldaEliminarPaquete && this.isPermisoEliminarPaquete));
			this.jInternalFrameDetalleFormPaquete.jMenuItemCancelarPaquete.setVisible(this.isVisibilidadCeldaCancelarPaquete);				
			}
			
			this.jMenuItemGuardarCambiosPaquete.setVisible((this.isVisibilidadCeldaGuardarPaquete && this.isPermisoGuardarCambiosPaquete));						
			this.jMenuItemGuardarCambiosTablaPaquete.setVisible((this.isVisibilidadCeldaGuardarCambiosPaquete && this.isPermisoGuardarCambiosPaquete));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPaquete=this.jButtonNuevoPaquete.isVisible();
			this.isVisibilidadCeldaDuplicarPaquete=this.jButtonDuplicarPaquete.isVisible();
			this.isVisibilidadCeldaCopiarPaquete=this.jButtonCopiarPaquete.isVisible();
			this.isVisibilidadCeldaVerFormPaquete=this.jButtonVerFormPaquete.isVisible();
			
			this.isVisibilidadCeldaOrdenPaquete=this.jButtonAbrirOrderByPaquete.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPaquete=this.jButtonNuevoRelacionesPaquete.isVisible();
			this.isVisibilidadCeldaModificarPaquete=this.jButtonModificarPaquete.isVisible();
			
			if(this.jInternalFrameDetalleFormPaquete!=null) {
			this.isVisibilidadCeldaActualizarPaquete=this.jInternalFrameDetalleFormPaquete.jButtonActualizarPaquete.isVisible();
			this.isVisibilidadCeldaEliminarPaquete=this.jInternalFrameDetalleFormPaquete.jButtonEliminarPaquete.isVisible();
			this.isVisibilidadCeldaCancelarPaquete=this.jInternalFrameDetalleFormPaquete.jButtonCancelarPaquete.isVisible();
			this.isVisibilidadCeldaGuardarPaquete=this.jInternalFrameDetalleFormPaquete.jButtonGuardarCambiosPaquete.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPaquete=this.jButtonGuardarCambiosTablaPaquete.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPaquete=this.jButtonNuevoToolBarPaquete.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPaquete=this.jButtonNuevoRelacionesToolBarPaquete.isVisible();
			
			if(this.jInternalFrameDetalleFormPaquete!=null) {
			this.isVisibilidadCeldaModificarPaquete=this.jInternalFrameDetalleFormPaquete.jButtonModificarToolBarPaquete.isVisible();
			this.isVisibilidadCeldaActualizarPaquete=this.jInternalFrameDetalleFormPaquete.jButtonActualizarToolBarPaquete.isVisible();
			this.isVisibilidadCeldaEliminarPaquete=this.jInternalFrameDetalleFormPaquete.jButtonEliminarToolBarPaquete.isVisible();
			this.isVisibilidadCeldaCancelarPaquete=this.jInternalFrameDetalleFormPaquete.jButtonCancelarToolBarPaquete.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPaquete=this.jButtonGuardarCambiosToolBarPaquete.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPaquete=this.jButtonGuardarCambiosTablaToolBarPaquete.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPaquete=this.jMenuItemNuevoPaquete.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPaquete=this.jMenuItemNuevoRelacionesPaquete.isVisible();
			
			if(this.jInternalFrameDetalleFormPaquete!=null) {
			this.isVisibilidadCeldaModificarPaquete=this.jInternalFrameDetalleFormPaquete.jMenuItemModificarPaquete.isVisible();
			this.isVisibilidadCeldaActualizarPaquete=this.jInternalFrameDetalleFormPaquete.jMenuItemActualizarPaquete.isVisible();
			this.isVisibilidadCeldaEliminarPaquete=this.jInternalFrameDetalleFormPaquete.jMenuItemEliminarPaquete.isVisible();
			this.isVisibilidadCeldaCancelarPaquete=this.jInternalFrameDetalleFormPaquete.jMenuItemCancelarPaquete.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPaquete=this.jMenuItemGuardarCambiosPaquete.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPaquete=this.jMenuItemGuardarCambiosTablaPaquete.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPaquete(Boolean esInicializar) {
		if(PaqueteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.paqueteSessionBean.getConGuardarRelaciones()) {
				//if(this.paqueteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPaquete();
			}
			
			this.inicializarActualizarBindingBotonesManualPaquete(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPaquete() {
		this.jButtonNuevoPaquete.setVisible(this.isPermisoNuevoPaquete);			
		this.jButtonDuplicarPaquete.setVisible(this.isPermisoDuplicarPaquete);			
		this.jButtonCopiarPaquete.setVisible(this.isPermisoCopiarPaquete);			
		this.jButtonVerFormPaquete.setVisible(this.isPermisoVerFormPaquete);			
		
		this.jButtonAbrirOrderByPaquete.setVisible(this.isPermisoOrdenPaquete);					
		
		this.jButtonNuevoRelacionesPaquete.setVisible(this.isPermisoNuevoPaquete);			
		
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPaquete.jButtonModificarPaquete.setVisible(this.isPermisoActualizarPaquete);	
			this.jInternalFrameDetalleFormPaquete.jButtonActualizarPaquete.setVisible(this.isPermisoActualizarPaquete);	
			this.jInternalFrameDetalleFormPaquete.jButtonEliminarPaquete.setVisible(this.isPermisoEliminarPaquete);
			this.jInternalFrameDetalleFormPaquete.jButtonCancelarPaquete.setVisible(this.isVisibilidadCeldaCancelarPaquete);						
			this.jInternalFrameDetalleFormPaquete.jButtonGuardarCambiosPaquete.setVisible(this.isPermisoGuardarCambiosPaquete);							
		}
		
		this.jButtonGuardarCambiosTablaPaquete.setVisible(this.isPermisoActualizarPaquete);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePaquete() {
		this.jInternalFrameDetalleFormPaquete.jButtonModificarPaquete.setVisible(this.isPermisoActualizarPaquete);	
		this.jInternalFrameDetalleFormPaquete.jButtonActualizarPaquete.setVisible(this.isPermisoActualizarPaquete);	
		this.jInternalFrameDetalleFormPaquete.jButtonEliminarPaquete.setVisible(this.isPermisoEliminarPaquete);
		this.jInternalFrameDetalleFormPaquete.jButtonCancelarPaquete.setVisible(this.isVisibilidadCeldaCancelarPaquete);							
		this.jInternalFrameDetalleFormPaquete.jButtonGuardarCambiosPaquete.setVisible((this.isVisibilidadCeldaGuardarPaquete && this.isPermisoGuardarCambiosPaquete));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPaquete() {
		if(PaqueteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPaquete();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPaquete() {
	}
	
	public void jTableDatosPaqueteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPaquete(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPaqueteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPaquete.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPaquete(this.getpaquete(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.paquete==null) {
						this.paquete = new Paquete();
					}

					this.setVariablesFormularioToObjetoActualPaquete(this.paquete,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);
				}

				if(this.paquete.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.paquete.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPaquete(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sistemaPaqueteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosistema=true;

			idTienePermisosistema=this.tienePermisosUsuarioEnPaginaWebPaquete(SistemaConstantesFunciones.CLASSNAME);

			if(idTienePermisosistema) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPaquete.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPaquete.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPaquete.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPaquete(this.getpaquete(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);

				this.sistemaBeanSwingJInternalFrame=new SistemaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sistemaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sistemaBeanSwingJInternalFrame.getSistemaLogic().setConnexion(this.paqueteLogic.getConnexion());

				if(this.paquete.getid_sistema()!=null) {
					this.sistemaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sistemaBeanSwingJInternalFrame.setIdActual(this.paquete.getid_sistema());
					this.sistemaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sistemaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sistemaBeanSwingJInternalFrame.inicializarActualizarBindingTablaSistema();
				}

				JInternalFrameBase jinternalFrame =this.sistemaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPaquete=(TitledBorder)this.jScrollPanelDatosPaquete.getBorder();
				TitledBorder titledBordersistema=(TitledBorder)this.sistemaBeanSwingJInternalFrame.jScrollPanelDatosSistema.getBorder();

				titledBordersistema.setTitle(titledBorderPaquete.getTitle() + " -> Sistema");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sistemaPaqueteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPaquete.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPaquete(this.getpaquete(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.paquete==null) {
						this.paquete = new Paquete();
					}

					this.setVariablesFormularioToObjetoActualPaquete(this.paquete,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);
				}

				if(this.paquete.getid_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sistema = "+this.paquete.getid_sistema().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPaquete(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePaqueteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPaquete.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPaquete(this.getpaquete(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.paquete==null) {
						this.paquete = new Paquete();
					}

					this.setVariablesFormularioToObjetoActualPaquete(this.paquete,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);
				}

				if(this.paquete.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.paquete.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPaquete(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPaqueteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPaquete.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPaquete(this.getpaquete(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.paquete==null) {
						this.paquete = new Paquete();
					}

					this.setVariablesFormularioToObjetoActualPaquete(this.paquete,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);
				}

				if(this.paquete.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.paquete.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPaquete(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdSistemaPaqueteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPaquete(false,false);

			this.getPaquetesFK_IdSistema();

			this.inicializarActualizarBindingPaquete(false);

			//if(PaqueteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPaquete(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.paqueteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePaquete() {
		if(this.jInternalFrameDetalleFormPaquete!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPaquete!=null) {
			this.jInternalFrameDetalleFormPaquete.setVisible(false);	    			
			this.jInternalFrameDetalleFormPaquete.dispose();
			this.jInternalFrameDetalleFormPaquete=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPaquete!=null) {
			this.jInternalFrameReporteDinamicoPaquete.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPaquete.dispose();
			this.jInternalFrameReporteDinamicoPaquete=null;
		}
		
		if(this.jInternalFrameImportacionPaquete!=null) {
			this.jInternalFrameImportacionPaquete.setVisible(false);	    			
			this.jInternalFrameImportacionPaquete.dispose();
			this.jInternalFrameImportacionPaquete=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPaquete();
			
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			
			
			if(sTipo.equals("NuevoPaquete")) {
				jButtonNuevoPaqueteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPaquete")) {
				jButtonDuplicarPaqueteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPaquete")) {
				jButtonCopiarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("VerFormPaquete")) {
				jButtonVerFormPaqueteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPaquete")) {
				jButtonNuevoPaqueteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPaquete")) {
				jButtonDuplicarPaqueteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPaquete")) {
				jButtonNuevoPaqueteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPaquete")) {
				jButtonDuplicarPaqueteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPaquete")) {
				jButtonNuevoPaqueteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPaquete")) {
				jButtonNuevoPaqueteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPaquete")) {
				jButtonNuevoPaqueteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPaquete")) {
				jButtonModificarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPaquete")) {
				jButtonModificarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPaquete")) {
				jButtonModificarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPaquete")) {
				jButtonActualizarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPaquete")) {
				jButtonActualizarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPaquete")) {
				jButtonActualizarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("EliminarPaquete")) {
				jButtonEliminarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPaquete")) {
				jButtonEliminarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPaquete")) {
				jButtonEliminarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("CancelarPaquete")) {
				jButtonCancelarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPaquete")) {
				jButtonCancelarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPaquete")) {
				jButtonCancelarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("CerrarPaquete")) {
				jButtonCerrarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPaquete")) {
				jButtonCerrarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPaquete")) {
				jButtonCerrarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPaquete")) {
				jButtonMostrarOcultarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPaquete")) {
				jButtonCancelarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPaquete")) {
				jButtonGuardarCambiosPaqueteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPaquete")) {
				jButtonGuardarCambiosPaqueteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPaquete")) {
				jButtonCopiarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPaquete")) {
				jButtonVerFormPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPaquete")) {
				jButtonGuardarCambiosPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPaquete")) {
				jButtonCopiarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPaquete")) {
				jButtonVerFormPaqueteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPaquete")) {
				jButtonGuardarCambiosPaqueteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPaquete")) {
				jButtonGuardarCambiosPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPaquete")) {
				jButtonGuardarCambiosPaqueteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPaquete")) {
				jButtonRecargarInformacionPaqueteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPaquete")) {
				jButtonRecargarInformacionPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPaquete")) {
				jButtonRecargarInformacionPaqueteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPaquete")) {
				jButtonAnterioresPaqueteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPaquete")) {
				jButtonAnterioresPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePaquete")) {
				jButtonAnterioresPaqueteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPaquete")) {
				jButtonSiguientesPaqueteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPaquete")) {
				jButtonSiguientesPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPaquete")) {
				jButtonSiguientesPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPaquete") || sTipo.equals("MenuItemDetalleAbrirOrderByPaquete")) {
				jButtonAbrirOrderByPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPaquete") || sTipo.equals("MenuItemDetalleMostrarOcultarPaquete")) {
				jButtonMostrarOcultarPaqueteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPaquete")) {
				jButtonNuevoGuardarCambiosPaqueteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPaquete")) {
				jButtonNuevoGuardarCambiosPaqueteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPaquete")) {
				jButtonNuevoGuardarCambiosPaqueteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPaquete")) {
				jButtonCerrarReporteDinamicoPaqueteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPaquete")) {
				jButtonGenerarReporteDinamicoPaqueteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPaquete")) {
				
				jButtonGenerarExcelReporteDinamicoPaqueteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPaquete")) {
				jButtonCerrarImportacionPaqueteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPaquete")) {
				
				jButtonGenerarImportacionPaqueteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPaquete")) {
				
				jButtonAbrirImportacionPaqueteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPaquete")) {
				jComboBoxTiposAccionesPaqueteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPaquete")) {
				jComboBoxTiposRelacionesPaqueteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPaquete")) {
				jComboBoxTiposAccionesPaqueteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPaquete")) {
				
				jComboBoxTiposSeleccionarPaqueteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPaquete")) {
				jTextFieldValorCampoGeneralPaqueteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPaquete")) {
				jButtonAbrirOrderByPaqueteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPaquete")) {
				jButtonAbrirOrderByPaqueteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPaquete")) {
				jButtonCerrarOrderByPaqueteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPaqueteBusqueda")) {
				this.jButtonidPaqueteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sistemaPaqueteUpdate")) {
				this.jButtonid_sistemaPaqueteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sistemaPaqueteBusqueda")) {
				this.jButtonid_sistemaPaqueteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePaqueteBusqueda")) {
				this.jButtonnombrePaqueteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPaqueteBusqueda")) {
				this.jButtondescripcionPaqueteBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdSistemaPaquete")) {
				this.jButtonFK_IdSistemaPaqueteActionPerformed(evt);
			}
			
			;
			
			
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPaquete();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPaqueteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.paquete);
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
				


				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Paquete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Paquete.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Paquete paqueteLocal=null;
			
			if(!this.getEsControlTabla()) {
				paqueteLocal=this.paquete;
			} else {
				paqueteLocal=this.paqueteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.paquete);
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
							
				
				


				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Paquete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Paquete.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaqueteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPaquete.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteAnterior =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.paqueteAnterior =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
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
			
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			
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
			
			


			
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPaqueteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.paquete);
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
								
						
				


				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Paquete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Paquete.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.paquete);
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
								
				
				


				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Paquete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Paquete.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaqueteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPaquete.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteAnterior =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.paqueteAnterior =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.paquete);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaqueteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPaquete.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteAnterior =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.paqueteAnterior =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaqueteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
			
			this.actualizarInformacion("INFO_PADRE",false,this.paquete);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.paquete);
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
							
				
				


				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Paquete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Paquete.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPaqueteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPaquete.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.paqueteAnterior =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.paqueteAnterior =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
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
			
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			
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
			
			


			
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaqueteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
			
			this.actualizarInformacion("INFO_PADRE",false,this.paquete);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.paquete);
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
								
				
				


				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Paquete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Paquete.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaqueteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPaquete.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteAnterior =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.paqueteAnterior =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaqueteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
			
			this.actualizarInformacion("INFO_PADRE",false,this.paquete);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPaqueteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.paquete);
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPaquete")) {
					jCheckBoxSeleccionarTodosPaqueteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPaquete")) {
					jCheckBoxSeleccionadosPaqueteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPaquete")) {
					
				}
				
				


				
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Paquete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Paquete.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.paquete);
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
												
				
				


				
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Paquete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Paquete.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPaqueteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPaquete.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.paqueteAnterior =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.paqueteAnterior =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPaqueteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.paquete);
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
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
			
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
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
			
			


			
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPaqueteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.paquete);
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Paquete.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Paquete.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.paquete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.paquete);
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
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
				
				


				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Paquete.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Paquete.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPaqueteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPaquete.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.paqueteAnterior =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.paqueteAnterior =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPaquete")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPaqueteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPaquete.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.paquete =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.paquete =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.paquete);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPaquete")) {
				
				}
				
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPaquete")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPaquete.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPaquete")) {
			
			}
			
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPaquete();
			
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			
			if(sTipo.equals("NuevoPaquete")) {
				jButtonNuevoPaqueteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPaquete")) {
				jButtonDuplicarPaqueteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPaquete")) {
				jButtonCopiarPaqueteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPaquete")) {
				jButtonVerFormPaqueteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPaquete")) {
				jButtonNuevoPaqueteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPaquete")) {
				jButtonModificarPaqueteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPaquete")) {
				jButtonActualizarPaqueteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPaquete")) {
				jButtonEliminarPaqueteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPaquete")) {
				jButtonGuardarCambiosPaqueteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPaquete")) {
				jButtonCancelarPaqueteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPaquete")) {
				jButtonCerrarPaqueteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPaquete")) {
				jButtonGuardarCambiosPaqueteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPaquete")) {
				jButtonNuevoGuardarCambiosPaqueteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPaquete")) {
				jButtonAbrirOrderByPaqueteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPaquete")) {
				jButtonRecargarInformacionPaqueteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPaquete")) {
				jButtonAnterioresPaqueteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPaquete")) {
				jButtonSiguientesPaqueteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPaqueteBusqueda")) {
				this.jButtonidPaqueteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sistemaPaqueteUpdate")) {
				this.jButtonid_sistemaPaqueteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sistemaPaqueteBusqueda")) {
				this.jButtonid_sistemaPaqueteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePaqueteBusqueda")) {
				this.jButtonnombrePaqueteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPaqueteBusqueda")) {
				this.jButtondescripcionPaqueteBusquedaActionPerformed(evt);
			}
			
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPaquete();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePaquete")) {
				closingInternalFramePaquete();
				
			} else if(sTipo.equals("jButtonCancelarPaquete")) {
				JInternalFrameBase jInternalFrameDetalleFormPaquete = (JInternalFrameBase)evt.getSource();
	            	
	            PaqueteBeanSwingJInternalFrame jInternalFrameParent=(PaqueteBeanSwingJInternalFrame)jInternalFrameDetalleFormPaquete.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPaqueteActionPerformed(null);
			}
			
			PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.paquete,new Object(),this.paqueteParameterGeneral,this.paqueteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPaquete(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPaquete(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPaquete(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.paquete)) {
			if(!esControlTabla) {
				if(PaqueteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPaquete(this.paquete,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);			
				}
				
				if(this.paqueteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPaquete(this.paquete,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.paqueteReturnGeneral=paqueteLogic.procesarEventosPaquetesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.paqueteLogic.getPaquetes(),this.paquete,this.paqueteParameterGeneral,this.isEsNuevoPaquete,classes);//this.paqueteLogic.getPaquete()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPaquete(this.paqueteReturnGeneral,this.paqueteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.paqueteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPaquete(classes,this.paqueteReturnGeneral,this.paqueteBean,false);
					}
						
					if(this.paqueteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPaquete(this.paqueteReturnGeneral.getPaquete());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPaquete(this.paqueteReturnGeneral.getPaquete());	
					}
						
					if(this.paqueteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPaquete(this.paqueteReturnGeneral.getPaquete(),classes);//this.paqueteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPaquete(this.paquete,classes);//this.paqueteBean);									
				}
			
				if(PaqueteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPaquete(this.paquete,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPaquete(this.paquete);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.paqueteAnterior!=null) {
						this.paquete=this.paqueteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.paqueteReturnGeneral=paqueteLogic.procesarEventosPaquetesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.paqueteLogic.getPaquetes(),this.paquete,this.paqueteParameterGeneral,this.isEsNuevoPaquete,classes);//this.paqueteLogic.getPaquete()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.paqueteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.paqueteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.paqueteReturnGeneral.getPaquete(),paqueteLogic.getPaquetes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.paqueteReturnGeneral.getPaquete(),this.paquetes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPaquete.repaint();
				
				//((AbstractTableModel) this.jTableDatosPaquete.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPaquete();
			}
		}
	}
	
	public void actualizarVisualTableDatosPaquete() throws Exception {
		
		PaqueteModel paqueteModel=(PaqueteModel)this.jTableDatosPaquete.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			paqueteModel.paquetes=this.paqueteLogic.getPaquetes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			paqueteModel.paquetes=this.paquetes;
		}
		
		
		((PaqueteModel) this.jTableDatosPaquete.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPaquete() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpaqueteAnterior(),this.paqueteLogic.getPaquetes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpaqueteAnterior(),this.paquetes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPaquete();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPaquete(Paquete paquete,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
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
										
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.paquete,new Object(),generalEntityParameterGeneral,this.paqueteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.paqueteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PaqueteConstantesFunciones.getClassesRelationshipsOfPaquete(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PaqueteConstantesFunciones.getClassesRelationshipsFromStringsOfPaquete(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPaquete(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PaqueteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.paquete,new Object(),generalEntityParameterGeneral,this.paqueteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPaquete(PaqueteBean paqueteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPaquete(ArrayList<Classe> classes,PaqueteReturnGeneral paqueteReturnGeneral,PaqueteBean paqueteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPaquete(Paquete paquete,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.paquete)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPaquete = new PaqueteDetalleFormJInternalFrame(jDesktopPane,this.paqueteSessionBean.getConGuardarRelaciones(),this.paqueteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPaquete);
		this.jInternalFrameDetalleFormPaquete.setVisible(false);
		this.jInternalFrameDetalleFormPaquete.setSelected(false);						
		
		this.jInternalFrameDetalleFormPaquete.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPaquete.paqueteLogic=this.paqueteLogic;
		
		this.cargarCombosFrameForeignKeyPaquete("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePaquete();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePaquete();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPaquete("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPaquete();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPaquete.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPaquete"));
		
		this.jInternalFrameDetalleFormPaquete.jButtonModificarPaquete.addActionListener(new ButtonActionListener(this,"ModificarPaquete"));

		
		this.jInternalFrameDetalleFormPaquete.jButtonModificarToolBarPaquete.addActionListener(new ButtonActionListener(this,"ModificarToolBarPaquete"));
					
		this.jInternalFrameDetalleFormPaquete.jMenuItemModificarPaquete.addActionListener(new ButtonActionListener(this,"MenuItemModificarPaquete"));		
		
		
		
		this.jInternalFrameDetalleFormPaquete.jButtonActualizarPaquete.addActionListener (new ButtonActionListener(this,"ActualizarPaquete"));
		
		
		this.jInternalFrameDetalleFormPaquete.jButtonActualizarToolBarPaquete.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPaquete"));
						
		this.jInternalFrameDetalleFormPaquete.jMenuItemActualizarPaquete.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPaquete"));		
		
		
		
		this.jInternalFrameDetalleFormPaquete.jButtonEliminarPaquete.addActionListener (new ButtonActionListener(this,"EliminarPaquete"));
		
		
		this.jInternalFrameDetalleFormPaquete.jButtonEliminarToolBarPaquete.addActionListener (new ButtonActionListener(this,"EliminarToolBarPaquete"));
								
		this.jInternalFrameDetalleFormPaquete.jMenuItemEliminarPaquete.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPaquete"));		
		
		
		
		this.jInternalFrameDetalleFormPaquete.jButtonCancelarPaquete.addActionListener (new ButtonActionListener(this,"CancelarPaquete"));
		
		
		this.jInternalFrameDetalleFormPaquete.jButtonCancelarToolBarPaquete.addActionListener (new ButtonActionListener(this,"CancelarToolBarPaquete"));
					
		this.jInternalFrameDetalleFormPaquete.jMenuItemCancelarPaquete.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPaquete"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPaquete.jMenuItemDetalleCerrarPaquete.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPaquete"));		
		
		
		
		this.jInternalFrameDetalleFormPaquete.jButtonGuardarCambiosToolBarPaquete.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPaquete"));
		
		
		
		this.jInternalFrameDetalleFormPaquete.jButtonGuardarCambiosToolBarPaquete.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPaquete"));
		
		
		
		this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPaquete"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPaquete.jButtonidPaqueteBusqueda.addActionListener(new ButtonActionListener(this,"idPaqueteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPaquete.jButtonid_sistemaPaqueteUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaPaqueteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPaquete.jButtonid_sistemaPaqueteBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaPaqueteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPaquete.jButtonnombrePaqueteBusqueda.addActionListener(new ButtonActionListener(this,"nombrePaqueteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPaquete.jButtondescripcionPaqueteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPaqueteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPaquete.jTabbedPaneRelacionesPaquete.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPaquete"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePaquete"));
		
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPaquete.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPaquete"));
		}
		
		this.jTableDatosPaquete.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPaquete"));
		
		this.jTableDatosPaquete.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPaquete"));
		
		this.jButtonNuevoPaquete.addActionListener(new ButtonActionListener(this,"NuevoPaquete"));
		
		this.jButtonDuplicarPaquete.addActionListener(new ButtonActionListener(this,"DuplicarPaquete"));
		
		this.jButtonCopiarPaquete.addActionListener(new ButtonActionListener(this,"CopiarPaquete"));
		
		this.jButtonVerFormPaquete.addActionListener(new ButtonActionListener(this,"VerFormPaquete"));
		
		
		this.jButtonNuevoToolBarPaquete.addActionListener(new ButtonActionListener(this,"NuevoToolBarPaquete"));
			
		this.jButtonDuplicarToolBarPaquete.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPaquete"));
			
		this.jMenuItemNuevoPaquete.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPaquete"));
			
		this.jMenuItemDuplicarPaquete.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPaquete"));		
		
		
		this.jButtonNuevoRelacionesPaquete.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPaquete"));
		
		
		this.jButtonNuevoRelacionesToolBarPaquete.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPaquete"));
			
		this.jMenuItemNuevoRelacionesPaquete.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPaquete"));		
		
		
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPaquete.jButtonModificarPaquete.addActionListener(new ButtonActionListener(this,"ModificarPaquete"));
		}
		
		
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPaquete.jButtonModificarToolBarPaquete.addActionListener(new ButtonActionListener(this,"ModificarToolBarPaquete"));
			
			this.jInternalFrameDetalleFormPaquete.jMenuItemModificarPaquete.addActionListener(new ButtonActionListener(this,"MenuItemModificarPaquete"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPaquete.jButtonActualizarPaquete.addActionListener (new ButtonActionListener(this,"ActualizarPaquete"));
		}
		
		
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPaquete.jButtonActualizarToolBarPaquete.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPaquete"));
				
			this.jInternalFrameDetalleFormPaquete.jMenuItemActualizarPaquete.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPaquete"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPaquete.jButtonEliminarPaquete.addActionListener (new ButtonActionListener(this,"EliminarPaquete"));
		}
		
		
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPaquete.jButtonEliminarToolBarPaquete.addActionListener (new ButtonActionListener(this,"EliminarToolBarPaquete"));
						
			this.jInternalFrameDetalleFormPaquete.jMenuItemEliminarPaquete.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPaquete"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPaquete.jButtonCancelarPaquete.addActionListener (new ButtonActionListener(this,"CancelarPaquete"));
		}
		
		
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPaquete.jButtonCancelarToolBarPaquete.addActionListener (new ButtonActionListener(this,"CancelarToolBarPaquete"));
			
			this.jInternalFrameDetalleFormPaquete.jMenuItemCancelarPaquete.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPaquete"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPaquete.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPaquete"));		
		
		
		this.jButtonCerrarPaquete.addActionListener (new ButtonActionListener(this,"CerrarPaquete"));
		
		
		this.jButtonCerrarToolBarPaquete.addActionListener (new ButtonActionListener(this,"CerrarToolBarPaquete"));
			
		this.jMenuItemCerrarPaquete.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPaquete"));
			
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPaquete.jMenuItemDetalleCerrarPaquete.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPaquete"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPaquete.jButtonGuardarCambiosPaquete.addActionListener (new ButtonActionListener(this,"GuardarCambiosPaquete"));
		}
		
		
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPaquete.jButtonGuardarCambiosToolBarPaquete.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPaquete"));
		}
		
		this.jButtonCopiarToolBarPaquete.addActionListener (new ButtonActionListener(this,"CopiarToolBarPaquete"));
			
		this.jButtonVerFormToolBarPaquete.addActionListener (new ButtonActionListener(this,"VerFormToolBarPaquete"));
		
		this.jMenuItemGuardarCambiosPaquete.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPaquete"));
			
		this.jMenuItemCopiarPaquete.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPaquete"));		
		
		this.jMenuItemVerFormPaquete.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPaquete"));		
		
		
		this.jButtonGuardarCambiosTablaPaquete.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPaquete"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPaquete.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPaquete"));
			
		this.jMenuItemGuardarCambiosTablaPaquete.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPaquete"));		
		
		
		
		this.jButtonRecargarInformacionPaquete.addActionListener (new ButtonActionListener(this,"RecargarInformacionPaquete"));
					
		this.jButtonRecargarInformacionToolBarPaquete.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPaquete"));
		
		this.jMenuItemRecargarInformacionPaquete.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPaquete"));		
		
		
		
		this.jButtonAnterioresPaquete.addActionListener (new ButtonActionListener(this,"AnterioresPaquete"));
		
		
		this.jButtonAnterioresToolBarPaquete.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPaquete"));
		
		this.jMenuItemAnterioresPaquete.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPaquete"));		
		
		
		this.jButtonSiguientesPaquete.addActionListener (new ButtonActionListener(this,"SiguientesPaquete"));
		
		
		this.jButtonSiguientesToolBarPaquete.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPaquete"));
			
		this.jMenuItemSiguientesPaquete.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPaquete"));
			
		this.jMenuItemAbrirOrderByPaquete.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPaquete"));
			
		this.jMenuItemMostrarOcultarPaquete.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPaquete"));
			
		this.jMenuItemDetalleAbrirOrderByPaquete.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPaquete"));
			
		this.jMenuItemDetalleMostarOcultarPaquete.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPaquete"));		
		
		
		this.jButtonNuevoGuardarCambiosPaquete.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPaquete"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPaquete.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPaquete"));
			
		this.jMenuItemNuevoGuardarCambiosPaquete.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPaquete"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPaquete.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPaquete"));

		this.jCheckBoxSeleccionadosPaquete.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPaquete"));
		
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPaquete"));
		}
		
		
		this.jComboBoxTiposRelacionesPaquete.addActionListener (new ButtonActionListener(this,"TiposRelacionesPaquete"));
			
		this.jComboBoxTiposAccionesPaquete.addActionListener (new ButtonActionListener(this,"TiposAccionesPaquete"));
					
		this.jComboBoxTiposSeleccionarPaquete.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPaquete"));
			
		this.jTextFieldValorCampoGeneralPaquete.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPaquete"));		
		
		
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPaquete.jButtonidPaqueteBusqueda.addActionListener(new ButtonActionListener(this,"idPaqueteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPaquete.jButtonid_sistemaPaqueteUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaPaqueteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPaquete.jButtonid_sistemaPaqueteBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaPaqueteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPaquete.jButtonnombrePaqueteBusqueda.addActionListener(new ButtonActionListener(this,"nombrePaqueteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPaquete.jButtondescripcionPaqueteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPaqueteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdSistemaPaquete.addActionListener(new ButtonActionListener(this,"FK_IdSistemaPaquete"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPaquete!=null) {
				this.jInternalFrameReporteDinamicoPaquete.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPaquete"));
				this.jInternalFrameReporteDinamicoPaquete.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPaquete"));
				this.jInternalFrameReporteDinamicoPaquete.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPaquete"));
			}
			
			//this.jButtonCerrarReporteDinamicoPaquete.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPaquete"));				
			//this.jButtonGenerarReporteDinamicoPaquete.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPaquete"));
			//this.jButtonGenerarExcelReporteDinamicoPaquete.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPaquete"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPaquete!=null) {
				this.jInternalFrameImportacionPaquete.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPaquete"));
				this.jInternalFrameImportacionPaquete.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPaquete"));
				this.jInternalFrameImportacionPaquete.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPaquete"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPaquete.addActionListener (new ButtonActionListener(this,"AbrirOrderByPaquete"));
			
			this.jButtonAbrirOrderByToolBarPaquete.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPaquete"));			
			
			if(this.jInternalFrameOrderByPaquete!=null) {
				this.jInternalFrameOrderByPaquete.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPaquete"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPaquete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPaquete.jTabbedPaneRelacionesPaquete.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPaquete"));
		
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
            		closingInternalFramePaquete();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPaquete.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPaquete = (JInternalFrameBase)event.getSource();
	            	
	            PaqueteBeanSwingJInternalFrame jInternalFrameParent=(PaqueteBeanSwingJInternalFrame)jInternalFrameDetalleFormPaquete.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPaqueteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPaquete.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPaqueteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPaquete.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPaquete.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPaqueteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPaqueteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPaqueteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPaquete";
		inputMap = this.jButtonNuevoPaquete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPaquete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPaqueteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPaqueteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPaqueteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPaqueteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPaquete";
		inputMap = this.jButtonNuevoRelacionesPaquete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPaquete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPaqueteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPaquete";
		inputMap = this.jButtonModificarPaquete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPaquete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPaqueteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPaquete";
		inputMap = this.jButtonActualizarPaquete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPaquete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPaqueteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPaquete";
		inputMap = this.jButtonEliminarPaquete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPaquete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPaqueteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPaquete";
		inputMap = this.jButtonCancelarPaquete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPaquete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPaqueteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPaquete";
		inputMap = this.jButtonCerrarPaquete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPaquete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPaqueteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPaquete.jButtonGuardarCambiosPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPaquete";
		inputMap = this.jInternalFrameDetalleFormPaquete.jButtonGuardarCambiosPaquete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPaquete.jButtonGuardarCambiosPaquete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPaqueteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPaquete.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPaqueteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPaquete.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPaqueteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPaquete.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPaqueteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPaquete.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPaqueteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPaquete.jButtonidPaqueteBusqueda.addActionListener(new ButtonActionListener(this,"idPaqueteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPaquete.jButtonid_sistemaPaqueteUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaPaqueteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPaquete.jButtonid_sistemaPaqueteBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaPaqueteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPaquete.jButtonnombrePaqueteBusqueda.addActionListener(new ButtonActionListener(this,"nombrePaqueteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPaquete.jButtondescripcionPaqueteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPaqueteBusqueda"));
		
		
		this.jButtonFK_IdSistemaPaquete.addActionListener(new ButtonActionListener(this,"FK_IdSistemaPaquete"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPaquete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPaqueteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPaqueteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPaquete.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPaquete(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Paquete paqueteAux:this.paqueteLogic.getPaquetes()) {
					paqueteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Paquete paqueteAux:paquetes) {
					paqueteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPaqueteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPaquete(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Paquete paqueteAux:this.paqueteLogic.getPaquetes()) {
						paqueteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Paquete paqueteAux:paquetes) {
						paqueteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Paquete paqueteAux:this.paqueteLogic.getPaquetes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Paquete paqueteAux:paquetes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPaquete(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPaquete.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPaquete.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPaquete,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPaqueteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPaquete(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPaquete.getSelectedRows();
			
			Paquete paqueteLocal=new Paquete();
			
			//this.seleccionarTodosPaquete(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paqueteLocal =(Paquete) this.paqueteLogic.getPaquetes().toArray()[this.jTableDatosPaquete.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					paqueteLocal =(Paquete) this.paquetes.toArray()[this.jTableDatosPaquete.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				paqueteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Paquete paqueteAux:this.paqueteLogic.getPaquetes()) {
						paqueteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Paquete paqueteAux:paquetes) {
						paqueteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPaquete(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPaquete.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPaquete.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPaquete,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPaqueteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPaqueteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPaqueteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPaquete(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPaquete.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Paquete paqueteAux:this.paqueteLogic.getPaquetes()) {
				
						if(sTipoSeleccionar.equals(PaqueteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							paqueteAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PaqueteConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							paqueteAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Paquete paqueteAux:paquetes) {
					
						if(sTipoSeleccionar.equals(PaqueteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							paqueteAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PaqueteConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							paqueteAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPaquete(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPaqueteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPaquete(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPaquete=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPaquete.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePaquete) {				
					conSplash=true;//false;										
					
					//this.startProcessPaquete(conSplash);
				
					this.generarReportePaquetesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPaquete.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPaquetesSeleccionados();
				//this.jComboBoxTiposAccionesPaquete.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPaquetesSeleccionados(false);
				//this.jComboBoxTiposAccionesPaquete.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPaquetesSeleccionados(true);
				//this.jComboBoxTiposAccionesPaquete.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPaquete();
				
				this.exportarPaquetesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPaquete.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPaquetes();
				//this.importarPaquetes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPaquete.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPaquete();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPaquetesSeleccionados();
				//this.jComboBoxTiposAccionesPaquete.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Paquete", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPaquete();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPaquete)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPaquete(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Paquete",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPaquete.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.setSelectedIndex(0);					
				}	
			} 			
			else if(PaqueteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePaquete) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPaquete(conSplash);
					
						//this.actualizarParametrosGeneralPaquete();
						
						this.generarReporteProcesoAccionPaquetesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPaquete.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PaqueteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO PaqueteS SELECCIONADOS?", "MANTENIMIENTO DE Paquete", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPaquete();
				
						this.actualizarParametrosGeneralPaquete();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.paqueteReturnGeneral=paqueteLogic.procesarAccionPaquetesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.paqueteLogic.getPaquetes(),this.paqueteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPaqueteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPaquete.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPaquete();
					
					PaqueteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPaqueteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPaquete.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPaquete.jComboBoxTiposAccionesFormularioPaquete.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPaquete(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPaqueteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPaquete();
			
			if(this.jInternalFrameDetalleFormPaquete==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Paquete> paquetesSeleccionados=new ArrayList<Paquete>();		
			Paquete paquete=new Paquete();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPaquete(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPaquete.getSelectedItem();
			
			
			
			
			paquetesSeleccionados=this.getPaquetesSeleccionados(true);
			//this.sTipoAccion;
			
			if(paquetesSeleccionados.size()==1) {
				for(Paquete paqueteAux:paquetesSeleccionados) {
					paquete=paqueteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPaquete();
			
      		//this.finishProcessPaquete(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPaqueteReturnGeneral() throws Exception {
		if(this.paqueteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.paqueteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.paqueteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.paqueteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.paqueteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.paqueteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPaquete(false);
		}
		
		if(this.paqueteReturnGeneral.getConRetornoLista() || this.paqueteReturnGeneral.getConRetornoObjeto()) {
			if(this.paqueteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.paqueteLogic.setPaquetes(this.paqueteReturnGeneral.getPaquetes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.paqueteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.paqueteLogic.setPaquete(this.paqueteReturnGeneral.getPaquete());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPaquete(false);
		}
	}
	
	public void actualizarParametrosGeneralPaquete() throws Exception {
		
		
	}
	
	public ArrayList<Paquete> getPaquetesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Paquete> paquetesSeleccionados=new ArrayList<Paquete>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPaquete) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Paquete paqueteAux:paqueteLogic.getPaquetes()) {
					if(paqueteAux.getIsSelected()) {
						paquetesSeleccionados.add(paqueteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Paquete paqueteAux:this.paquetes) {
					if(paqueteAux.getIsSelected()) {
						paquetesSeleccionados.add(paqueteAux);				
					}
				}
			}
			
			if(paquetesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						paquetesSeleccionados.addAll(this.paqueteLogic.getPaquetes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						paquetesSeleccionados.addAll(this.paquetes);				
					}
				}
			}
		} else {
			paquetesSeleccionados.add(this.paquete);
		}
		
		return paquetesSeleccionados;
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
	
	public void generarReportePaquetesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPaquetesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPaquetesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPaquetesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPaquetesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Paquete",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPaquetesSeleccionados() throws Exception {
		ArrayList<Paquete> paquetesSeleccionados=new ArrayList<Paquete>();		
		
		paquetesSeleccionados=this.getPaquetesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePaquetes("Todos",paquetesSeleccionados);
		
	}	
	
	public void generarReporteNormalPaquetesSeleccionados() throws Exception {
		ArrayList<Paquete> paquetesSeleccionados=new ArrayList<Paquete>();		
		
		paquetesSeleccionados=this.getPaquetesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePaquetes("Todos",paquetesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPaquetesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Paquete> paquetesSeleccionados=new ArrayList<Paquete>();
		
		paquetesSeleccionados=this.getPaquetesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePaquetes("Todos",paquetesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPaquetesSeleccionados() throws Exception {
		ArrayList<Paquete> paquetesSeleccionados=new ArrayList<Paquete>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPaquete();
		
		
		paquetesSeleccionados=this.getPaquetesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPaquete();
		
		
		//this.generarReportePaquetes("Todos",paquetesSeleccionados ,paqueteImplementable,paqueteImplementableHome);
	}
	
	public void mostrarImportacionPaquetes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPaquete();
		
		this.abrirFrameImportacionPaquete();		
		
			
		//this.generarReportePaquetes("Todos",paquetesSeleccionados ,paqueteImplementable,paqueteImplementableHome);
	}
	
	public void importarPaquetes() throws Exception {		
	
	}
	
	public void exportarPaquetesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPaquetesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPaquetesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPaquetesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Paquete",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPaquetesSeleccionados() throws Exception {
		ArrayList<Paquete> paquetesSeleccionados=new ArrayList<Paquete>();		
		
		paquetesSeleccionados=this.getPaquetesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"paquete."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPaquete(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Paquete paqueteAux:paquetesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPaquete(paqueteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//paqueteAux.setsDetalleGeneralEntityReporte(paqueteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paqueteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Paquete",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPaquete(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PaqueteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PaqueteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PaqueteConstantesFunciones.LABEL_IDSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PaqueteConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PaqueteConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPaquete(Paquete paquete,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=paquete.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=paquete.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=paquete.getsistema_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=paquete.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=paquete.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPaquetesSeleccionados() throws Exception {
		ArrayList<Paquete> paquetesSeleccionados=new ArrayList<Paquete>();		
		
		paquetesSeleccionados=this.getPaquetesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"paquete.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Paquetes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPaquete(row);				
				iRow++;
			}				
			
			for(Paquete paqueteAux:paquetesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPaquete(paqueteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paqueteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Paquete",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPaquetesSeleccionados() throws Exception {
		ArrayList<Paquete> paquetesSeleccionados=new ArrayList<Paquete>();		
		
		paquetesSeleccionados=this.getPaquetesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"paquete.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("paquetes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("paquete");
			//elementRoot.appendChild(element);
		
			for(Paquete paqueteAux:paquetesSeleccionados) {
				element = document.createElement("paquete");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPaquete(paqueteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.paqueteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Paquete",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPaquete(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PaqueteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PaqueteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PaqueteConstantesFunciones.LABEL_IDSISTEMA);
		cell = row.createCell(iColumn++);cell.setCellValue(PaqueteConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(PaqueteConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPaquete(Paquete paquete,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(paquete.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(paquete.getsistema_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(paquete.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(paquete.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlPaquete(Paquete paquete,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PaqueteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(paquete.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PaqueteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(paquete.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementsistema_descripcion = document.createElement(PaqueteConstantesFunciones.IDSISTEMA);
		elementsistema_descripcion.appendChild(document.createTextNode(paquete.getsistema_descripcion()));
		element.appendChild(elementsistema_descripcion);

		Element elementnombre = document.createElement(PaqueteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(paquete.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(PaqueteConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(paquete.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoPaquetesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Paquete> paquetesSeleccionados=new ArrayList<Paquete>();
		
		paquetesSeleccionados=this.getPaquetesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPaquete(paquetesSeleccionados);
		
		this.generarReportePaquetes("Todos",paquetesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPaquete(ArrayList<Paquete> paquetesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Paquete paqueteAux:paquetesSeleccionados) {
				paqueteAux.setsDetalleGeneralEntityReporte(paqueteAux.toString());
			
				if(sTipoSeleccionar.equals(PaqueteConstantesFunciones.LABEL_IDSISTEMA)) {
					existe=true;
					paqueteAux.setsDescripcionGeneralEntityReporte1(paqueteAux.getsistema_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PaqueteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					paqueteAux.setsDescripcionGeneralEntityReporte1(paqueteAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(PaqueteConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					paqueteAux.setsDescripcionGeneralEntityReporte1(paqueteAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PaqueteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPaquete(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPaquete=true;
				this.isVisibilidadCeldaNuevoRelacionesPaquete=true;
				this.isVisibilidadCeldaGuardarCambiosPaquete=true;
			}
			
			this.isVisibilidadCeldaModificarPaquete=false;
			this.isVisibilidadCeldaActualizarPaquete=false;
			this.isVisibilidadCeldaEliminarPaquete=false;
			this.isVisibilidadCeldaCancelarPaquete=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPaquete=true;
				} else {
					this.isVisibilidadCeldaGuardarPaquete=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPaquete=false;
			this.isVisibilidadCeldaNuevoRelacionesPaquete=false;
			this.isVisibilidadCeldaGuardarCambiosPaquete=false;
			this.isVisibilidadCeldaModificarPaquete=false;
			this.isVisibilidadCeldaActualizarPaquete=true;
			this.isVisibilidadCeldaEliminarPaquete=false;
			this.isVisibilidadCeldaCancelarPaquete=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPaquete=true;
				} else {
					this.isVisibilidadCeldaGuardarPaquete=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPaquete=false;
			this.isVisibilidadCeldaNuevoRelacionesPaquete=false;
			this.isVisibilidadCeldaGuardarCambiosPaquete=false;
			this.isVisibilidadCeldaModificarPaquete=false;
			this.isVisibilidadCeldaActualizarPaquete=true;
			this.isVisibilidadCeldaEliminarPaquete=true;
			this.isVisibilidadCeldaCancelarPaquete=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPaquete=true;
				} else {
					this.isVisibilidadCeldaGuardarPaquete=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPaquete=false;
			this.isVisibilidadCeldaNuevoRelacionesPaquete=false;
			this.isVisibilidadCeldaGuardarCambiosPaquete=false;
			this.isVisibilidadCeldaModificarPaquete=false;
			this.isVisibilidadCeldaActualizarPaquete=true;
			this.isVisibilidadCeldaEliminarPaquete=false;
			this.isVisibilidadCeldaCancelarPaquete=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPaquete=false;
				} else {
					this.isVisibilidadCeldaGuardarPaquete=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPaquete=true;
			this.isVisibilidadCeldaNuevoRelacionesPaquete=true;
			this.isVisibilidadCeldaGuardarCambiosPaquete=true;
			this.isVisibilidadCeldaModificarPaquete=false;
			this.isVisibilidadCeldaActualizarPaquete=false;
			this.isVisibilidadCeldaEliminarPaquete=false;
			this.isVisibilidadCeldaCancelarPaquete=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPaquete=true;
				} else {
					this.isVisibilidadCeldaGuardarPaquete=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPaquete=false;
			this.isVisibilidadCeldaNuevoRelacionesPaquete=false;
			this.isVisibilidadCeldaGuardarCambiosPaquete=false;
			this.isVisibilidadCeldaActualizarPaquete=false;
			this.isVisibilidadCeldaEliminarPaquete=false;
			this.isVisibilidadCeldaCancelarPaquete=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPaquete=false;
				} else {
					this.isVisibilidadCeldaGuardarPaquete=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPaquete=false;
			this.isVisibilidadCeldaNuevoRelacionesPaquete=false;
			this.isVisibilidadCeldaGuardarCambiosPaquete=false;
			this.isVisibilidadCeldaModificarPaquete=true;
			this.isVisibilidadCeldaActualizarPaquete=false;
			this.isVisibilidadCeldaEliminarPaquete=false;
			this.isVisibilidadCeldaCancelarPaquete=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPaquete=false;
				} else {
					this.isVisibilidadCeldaGuardarPaquete=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PaqueteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPaquete=true;
			this.isVisibilidadCeldaNuevoRelacionesPaquete=true;
			this.isVisibilidadCeldaGuardarCambiosPaquete=true;
		} else {
			this.actualizarEstadoPanelsPaquete(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPaquete=false;
			//this.isVisibilidadCeldaVerFormPaquete=false;
			this.isVisibilidadCeldaDuplicarPaquete=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!paqueteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPaquete=false;
		} else {
			this.isVisibilidadCeldaNuevoPaquete=false;
			this.isVisibilidadCeldaGuardarCambiosPaquete=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(paqueteSessionBean.getEsGuardarRelacionado()) {
			if(!paqueteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPaquete=false;												
			}
			
			this.jButtonCerrarPaquete.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPaquete=false;
		}
		
		if(!this.permiteMantenimiento(this.paquete)) {
			this.isVisibilidadCeldaActualizarPaquete=false;
			this.isVisibilidadCeldaEliminarPaquete=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPaquete() {
	}
	
	public void actualizarEstadoPanelsPaquete(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPaquete!=null) {
				this.jScrollPanelDatosEdicionPaquete.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPaquete!=null) {
				this.jTabbedPaneBusquedasPaquete.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPaquete!=null) {
				this.jScrollPanelDatosPaquete.setVisible(true);
			}
			
			if(this.jPanelPaginacionPaquete!=null) {
				this.jPanelPaginacionPaquete.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPaquete!=null) {
				this.jPanelParametrosReportesPaquete.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPaquete!=null) {
				this.jScrollPanelDatosEdicionPaquete.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPaquete!=null) {
				this.jTabbedPaneBusquedasPaquete.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPaquete!=null) {
				this.jScrollPanelDatosPaquete.setVisible(false);
			}
			
			if(this.jPanelPaginacionPaquete!=null) {
				this.jPanelPaginacionPaquete.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPaquete!=null) {
				this.jPanelParametrosReportesPaquete.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPaquete!=null) {
				this.jScrollPanelDatosEdicionPaquete.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPaquete!=null) {
				this.jTabbedPaneBusquedasPaquete.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPaquete!=null) {
				this.jScrollPanelDatosPaquete.setVisible(false);
			}
			
			if(this.jPanelPaginacionPaquete!=null) {
				this.jPanelPaginacionPaquete.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPaquete!=null) {
				this.jPanelParametrosReportesPaquete.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPaquete!=null) {
				this.jScrollPanelDatosEdicionPaquete.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPaquete!=null) {
				this.jTabbedPaneBusquedasPaquete.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPaquete!=null) {
				this.jScrollPanelDatosPaquete.setVisible(false);
			}
			
			if(this.jPanelPaginacionPaquete!=null) {
				this.jPanelPaginacionPaquete.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPaquete!=null) {
				this.jPanelParametrosReportesPaquete.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPaquete!=null) {
				this.jScrollPanelDatosEdicionPaquete.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPaquete!=null) {
				this.jTabbedPaneBusquedasPaquete.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPaquete!=null) {
				this.jScrollPanelDatosPaquete.setVisible(true);
			}
			
			if(this.jPanelPaginacionPaquete!=null) {
				this.jPanelPaginacionPaquete.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPaquete!=null) {
				this.jPanelParametrosReportesPaquete.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPaquete!=null) {
				this.jScrollPanelDatosEdicionPaquete.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPaquete!=null) {
				this.jTabbedPaneBusquedasPaquete.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPaquete!=null) {
				this.jScrollPanelDatosPaquete.setVisible(true);
			}
			
			if(this.jPanelPaginacionPaquete!=null) {
				this.jPanelPaginacionPaquete.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPaquete!=null) {
				this.jPanelParametrosReportesPaquete.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPaquete!=null) {
				this.jScrollPanelDatosEdicionPaquete.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPaquete!=null) {
				this.jTabbedPaneBusquedasPaquete.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPaquete!=null) {
				this.jScrollPanelDatosPaquete.setVisible(true);
			}
			
			if(this.jPanelPaginacionPaquete!=null) {
				this.jPanelPaginacionPaquete.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPaquete!=null) {
				this.jPanelParametrosReportesPaquete.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.paqueteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPaquete!=null) {
					this.jTabbedPaneBusquedasPaquete.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPaquete!=null) {
				this.jPanelParametrosReportesPaquete.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.paqueteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPaquete!=null) {
				this.jTabbedPaneBusquedasPaquete.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPaquete!=null) {
				this.jPanelParametrosReportesPaquete.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaSistema(Boolean isParaSistema){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSistemaNegation=!isParaSistema;

			this.isVisibilidadFK_IdSistema=isParaSistema;
			if(!this.isVisibilidadFK_IdSistema) {this.jTabbedPaneBusquedasPaquete.remove(jPanelFK_IdSistemaPaquete);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PaqueteSessionBean paqueteSessionBean=new PaqueteSessionBean();
		
		if(this.paqueteSessionBean==null) {
			this.paqueteSessionBean=new PaqueteSessionBean();
		}
		
		this.paqueteSessionBean.setsUltimaBusquedaPaquete(this.getsAccionBusqueda());
		this.paqueteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.paqueteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdSistema")) {
			paqueteSessionBean.setid_sistema(this.getid_sistemaFK_IdSistema());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PaqueteSessionBean paqueteSessionBean=new PaqueteSessionBean();
		
		if(this.paqueteSessionBean==null) {
			this.paqueteSessionBean=new PaqueteSessionBean();
		}
		
		if(this.paqueteSessionBean.getsUltimaBusquedaPaquete()!=null&&!this.paqueteSessionBean.getsUltimaBusquedaPaquete().equals("")) {
			this.setsAccionBusqueda(paqueteSessionBean.getsUltimaBusquedaPaquete());
			this.setiNumeroPaginacion(paqueteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(paqueteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdSistema")) {
				this.setid_sistemaFK_IdSistema(paqueteSessionBean.getid_sistema());
				paqueteSessionBean.setid_sistema(-1L);
			}
		}
		
		this.paqueteSessionBean.setsUltimaBusquedaPaquete("");
		this.paqueteSessionBean.setiNumeroPaginacion(PaqueteConstantesFunciones.INUMEROPAGINACION);
		this.paqueteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPaquete(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPaquete() {
		this.updateBorderResaltarBusquedasFormularioPaquete();
		this.updateVisibilidadBusquedasFormularioPaquete();
		this.updateHabilitarBusquedasFormularioPaquete();
	}
	
	public void updateBorderResaltarBusquedasFormularioPaquete() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPaquete.getComponents().length>0) {
	

		if(this.paqueteConstantesFunciones.resaltarFK_IdSistemaPaquete!=null) {
			index= this.jTabbedPaneBusquedasPaquete.indexOfComponent(this.jPanelFK_IdSistemaPaquete);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPaquete.getComponent(index);
				jPanel.setBorder(this.paqueteConstantesFunciones.resaltarFK_IdSistemaPaquete);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPaquete() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPaquete.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPaquete.indexOfComponent(this.jPanelFK_IdSistemaPaquete);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPaquete.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.paqueteConstantesFunciones.mostrarFK_IdSistemaPaquete);
			if(!this.paqueteConstantesFunciones.mostrarFK_IdSistemaPaquete && index>-1) {
				this.jTabbedPaneBusquedasPaquete.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPaquete() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPaquete.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPaquete.indexOfComponent(this.jPanelFK_IdSistemaPaquete);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPaquete.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.paqueteConstantesFunciones.activarFK_IdSistemaPaquete);
				this.jTabbedPaneBusquedasPaquete.setEnabledAt(index,this.paqueteConstantesFunciones.activarFK_IdSistemaPaquete);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPaquete(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdSistema")) {
			index= this.jTabbedPaneBusquedasPaquete.indexOfComponent(this.jPanelFK_IdSistemaPaquete);

			this.jTabbedPaneBusquedasPaquete.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPaquete.getComponent(index);

			this.paqueteConstantesFunciones.setResaltarFK_IdSistemaPaquete(resaltar);

			jPanel.setBorder(this.paqueteConstantesFunciones.resaltarFK_IdSistemaPaquete);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPaquete.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPaquete() throws Exception {

		if(this.jInternalFrameDetalleFormPaquete==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPaquete();
		this.updateVisibilidadResaltarControlesFormularioPaquete();
		this.updateHabilitarResaltarControlesFormularioPaquete();
		
	}
	
	public void updateBorderResaltarControlesFormularioPaquete() throws Exception {
		if(this.jInternalFrameDetalleFormPaquete==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.paqueteConstantesFunciones.resaltaridPaquete!=null && this.jInternalFrameDetalleFormPaquete!=null) {this.jInternalFrameDetalleFormPaquete.jLabelidPaquete.setBorder(this.paqueteConstantesFunciones.resaltaridPaquete);}
		if(this.paqueteConstantesFunciones.resaltarid_sistemaPaquete!=null && this.jInternalFrameDetalleFormPaquete!=null) {this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete.setBorder(this.paqueteConstantesFunciones.resaltarid_sistemaPaquete);}
		if(this.paqueteConstantesFunciones.resaltarnombrePaquete!=null && this.jInternalFrameDetalleFormPaquete!=null) {this.jInternalFrameDetalleFormPaquete.jTextAreanombrePaquete.setBorder(this.paqueteConstantesFunciones.resaltarnombrePaquete);}
		if(this.paqueteConstantesFunciones.resaltardescripcionPaquete!=null && this.jInternalFrameDetalleFormPaquete!=null) {this.jInternalFrameDetalleFormPaquete.jTextAreadescripcionPaquete.setBorder(this.paqueteConstantesFunciones.resaltardescripcionPaquete);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPaquete() throws Exception {		
		if(this.jInternalFrameDetalleFormPaquete==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPaquete!=null) {
	
		//this.jInternalFrameDetalleFormPaquete.jLabelidPaquete.setVisible(this.paqueteConstantesFunciones.mostraridPaquete);
		this.jInternalFrameDetalleFormPaquete.jPanelidPaquete.setVisible(this.paqueteConstantesFunciones.mostraridPaquete);
		//this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete.setVisible(this.paqueteConstantesFunciones.mostrarid_sistemaPaquete);
		this.jInternalFrameDetalleFormPaquete.jPanelid_sistemaPaquete.setVisible(this.paqueteConstantesFunciones.mostrarid_sistemaPaquete);
		//this.jInternalFrameDetalleFormPaquete.jTextAreanombrePaquete.setVisible(this.paqueteConstantesFunciones.mostrarnombrePaquete);
		this.jInternalFrameDetalleFormPaquete.jPanelnombrePaquete.setVisible(this.paqueteConstantesFunciones.mostrarnombrePaquete);
		//this.jInternalFrameDetalleFormPaquete.jTextAreadescripcionPaquete.setVisible(this.paqueteConstantesFunciones.mostrardescripcionPaquete);
		this.jInternalFrameDetalleFormPaquete.jPaneldescripcionPaquete.setVisible(this.paqueteConstantesFunciones.mostrardescripcionPaquete);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPaquete() throws Exception {
		if(this.jInternalFrameDetalleFormPaquete==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPaquete!=null) {
	
		this.jInternalFrameDetalleFormPaquete.jLabelidPaquete.setEnabled(this.paqueteConstantesFunciones.activaridPaquete);
		this.jInternalFrameDetalleFormPaquete.jComboBoxid_sistemaPaquete.setEnabled(this.paqueteConstantesFunciones.activarid_sistemaPaquete);
		this.jInternalFrameDetalleFormPaquete.jTextAreanombrePaquete.setEnabled(this.paqueteConstantesFunciones.activarnombrePaquete);
		this.jInternalFrameDetalleFormPaquete.jTextAreadescripcionPaquete.setEnabled(this.paqueteConstantesFunciones.activardescripcionPaquete);
		}
	}
	
		
}